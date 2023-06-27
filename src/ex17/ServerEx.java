// package ex17;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.PrintWriter;
// import java.net.ServerSocket;
// import java.net.Socket;
// import java.util.Scanner;

// public class ServerEx {
// public static void main(String[] args) {
// ServerSocket serverSocket=null;
// Socket clientSocket=null;
// BufferedReader in = null;
// PrintWriter out = null;
// Scanner sc = new Scanner(System.in);

// try {
// serverSocket = new ServerSocket(5000); // 포트기반 소켓 생성
// System.out.println("연결을 기다리고 있음");
// clientSocket = serverSocket.accept(); // 서버는 클라이언트가 연결을 시도하기 기다림
// out = new PrintWriter(clientSocket.getOutputStream());
// in = new BufferedReader(new
// InputStreamReader(clientSocket.getInputStream()));
// System.out.println("클라이언트와 연결되었음");

// while(true) {
// String msg = in.readLine();
// if(msg.equalsIn)
// }
// }
// }
// }
