import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.ServerSocket;
import java.nio.charset.*;
import java.util.Date;

public class Main {
    public static void main (String [] args) throws Exception {

        //Allow for server with port 8080 to be created
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Connection on port 8080 ...");

        while (true) {
            //Accepts clients into server
            Socket clientSocket = server.accept();
            try (clientSocket){
               Interpreter(clientSocket);
                Date today = new Date();
                String httpResponse = ("HTTP/1.1 200 OK\r\n\r\n" + today);
                //Outputs date
                clientSocket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
            }
            catch (Exception e){}
        }
    }

    //Interprets the client entering the server
    public static void Interpreter (Socket clientSocket) throws Exception{
        InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
        BufferedReader reader = new BufferedReader(isr);
        String line = reader.readLine();
        while(!line.isEmpty()){
            System.out.println(line);
            line = reader.readLine();

        }
    }
}
