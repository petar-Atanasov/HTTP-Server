package http.server;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ApplicationRunner {
    
    /*
        *Creating HTTP Server
    */

//    public static void main(String[] args) throws Exception {
//        final ServerSocket server = new ServerSocket(8080);
//        System.out.println("Listening for connection on port 8080 ....");
//        while(true){ // spin forever
//           final Socket client = server.accept();
////           1. Read HTTP request from the client socket
////           2. Prepare an HTTP response
////           3. Send HTTP response to the client 
////           4. Close the socket 
//            
//            InputStreamReader isr = new InputStreamReader(client.getInputStream());
//            BufferedReader reader = new BufferedReader(isr);
//            
//            String line = reader.readLine();
//            while(!line.isEmpty()){
//                System.out.println(line);
//                line = reader.readLine();
//            }
//        }
//    }
    
    
/*    
    *Simple HTTP Server to demostrate how to use 
    *ServerSocket and Socket class
*/  
    public static void main(String[] args)  throws Exception {
        
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ....");
        
        while(true){
            // activate the socket
            try (Socket socket = server.accept()){
                // get today's date 
                Date today = new Date();
                
                // set an response message
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                
                // get the response and show the outstream
                socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
            }
        }
    }
}
