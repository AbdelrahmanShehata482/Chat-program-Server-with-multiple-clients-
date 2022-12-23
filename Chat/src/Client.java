
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Client {
    
         public static void main(String[] args) throws IOException {
         
try {

Socket socket = new Socket("localhost" , 3001);
DataInputStream input = new DataInputStream(socket.getInputStream());
DataOutputStream  output= new DataOutputStream(socket.getOutputStream());

System.out.println(input.readUTF());
Scanner SC = new Scanner(System.in);
System.out.println("Enter Your message");
String message = SC.nextLine();
output.writeUTF(message);
output.close();
socket.close();
input.close();

}
catch(IOException e) {
         e.printStackTrace();
         }
    

     }}
    
    
    
    

