import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
public class client extends JFrame{
    Socket socket;
    BufferedReader br;
    PrintWriter out;
    private JLabel title=new JLabel("Client Area");
    private JTextArea message=new JTextArea();
    private JTextField field=new JTextField();
    private Font font=new Font("Roboto",Font.ITALIC,20);
    public client() {
        try {
            System.out.println("client sending request..");
            socket = new Socket("127.0.0.1", 59505);
            System.out.println("connection successfull..");
            br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out= new PrintWriter(socket.getOutputStream());
            createGUI();
             startReading();
            startWriting();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private void createGUI()
    {
//        //GUI code...
//        this.setTitle("Messenger");
//        this.setSize(400,400);
//        this.setLocationRelativeTo(null);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        // coding for components
//        title.setFont(font);
//        message.setFont(font);
//       field.setFont(font);
//       title.setIcon(new ImageIcon("index.png"));
//       title.setHorizontalAlignment(SwingConstants.CENTER);
//       title.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
//
//        // frame ko layout set krnge
//       this.setLayout(new BorderLayout());
//        //adding the components to frame
//        this.add(title,BorderLayout.NORTH);
//        this.add(message,BorderLayout.CENTER);
//        this.add(field,BorderLayout.SOUTH);
//        this.setVisible(true);
    }
    public void startReading()
    {
        //tread-read
        Runnable r1=()->{
            System.out.println("reader started..");
            while(true)
            { try {
                String sc = br.readLine();
                if (sc.equals("exit")) {
                    System.out.println("Server has terminated..");
                    break;
                }
                System.out.println("Server:" + sc);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            }
        };
        new Thread(r1).start();
    }
    public void startWriting()
        { //thread-write
            Runnable r2 = () -> {
                while (!socket.isClosed()) {
                    try {
                        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                        String content = br1.readLine();
                        out.println(content);
                        out.flush();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            new Thread(r2).start();


    }
    public static void main(String[] args) {
     new client();
    }
}
