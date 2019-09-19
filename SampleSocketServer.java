package com.example.sockets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SampleSocketServer {
	public void start(int port) {
		try (
		ServerSocket serverSocket=new ServerSocket(port);
		Socket clientSocket=serverSocket.accept();
		PrintWriter out=new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader in=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				){
				System.out.print("Client connected, waiting for message");
				String fromClient ="", toClient="";
				while((fromClient=in.readLine()) !=null) {
					System.out.print("Message from client: "+fromClient);
					if("kill server".equalsIgnoreCase(fromClient)) {
						System.out.println("Client killed server process");
						break;
					}
				}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Starting server");
		SampleSocketServer server =new SampleSocketServer();
		server.start(3001);
		System.out.print("Server stopped");

	}

}
