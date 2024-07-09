package http.server;

import java.net.ServerSocket;

public class ApplicationRunner {

    public static void main(String[] args) throws Exception {
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ....");
        while(true){
            // spin forever
        }
    }
    
}
