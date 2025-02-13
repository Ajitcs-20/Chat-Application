

# **Java Chat Application**

A simple, real-time chat application built using **Java Sockets**. This application allows users to send and receive messages in real-time over a network. The chat app includes both a **server-side** component that handles incoming connections and a **client-side** component that enables communication between users.

---

## **Table of Contents**
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [File Structure](#file-structure)
- [Contributions](#contributions)

---

## **Features**
- **Real-time Messaging:** Instant communication between clients using Java Sockets.
- **Multiple Clients:** Supports multiple clients connecting to the server and chatting simultaneously.
- **Private Messaging:** Clients can send private messages to each other.
- **Chat History:** Basic implementation to store the chat history (can be enhanced further).
- **User-Friendly Interface:** Command-line based interface for easy message input and output.

---

## **Technologies Used**
- **Java SE (Socket Programming):** Used Java Sockets for client-server communication.
- **Java I/O:** To handle data input and output streams.
- **Multithreading:** To allow multiple clients to connect and chat simultaneously.

---

## **Setup and Installation**

To run this Java Chat Application, follow these steps:

### Prerequisites:
- Ensure that you have **Java 8 or later** installed on your system.
- Set up your environment to run Java applications. You can check if Java is installed by running `java -version` in your terminal or command prompt.

### Steps:
1. **Clone the Repository:**
   - Clone this repository to your local machine using:
   ```bash
   git clone <repository_url>
   ```

2. **Compile the Java files:**
   - Navigate to the directory where the files are saved and compile the `.java` files:
   ```bash
   javac *.java
   ```

3. **Run the Server:**
   - First, start the server to listen for incoming client connections:
   ```bash
   java Server
   ```

4. **Run the Clients:**
   - Open multiple terminals or command prompts, and start the client application by running:
   ```bash
   java Client
   ```
   - You will be prompted to enter your username and connect to the server.

---

## **Usage**
Once the server is up and running, and the clients have connected, users can:
- **Send Messages:** Type a message in the console and hit Enter to send it to all connected clients.
- **Private Messages:** Type a private message by specifying the recipient's username. Example: `/private <username> <message>`
- **View Active Users:** The server will broadcast messages and show who is currently active in the chat.

---

## **File Structure**
```
JavaChatApp/
│
├── Server.java           # Server-side logic for handling client connections
├── Client.java           # Client-side logic for user interface and sending/receiving messages
├── ChatMessage.java      # Class to represent a chat message
├── README.md             # This file
└── build/                # Folder to store compiled class files (generated after `javac *.java`)
```

---

## **Contributions**
Feel free to fork the repository, report issues, and submit pull requests if you'd like to contribute improvements or new features.

---

## **Acknowledgments**
- **Java Sockets:** For enabling network communication between clients and the server.
- **Multithreading:** For managing multiple client connections concurrently.
- **Command Line Interface (CLI):** A simple interface for ease of use.

---

