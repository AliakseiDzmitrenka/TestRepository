package foo;

import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

public class FTP {

	//"anonymous"
	public static FTPClient FTPConnection(FTPClient client) throws IOException{
		Scanner br = new Scanner(System.in);
		System.out.println("Enter connect url: ");
		String connect = br.next();
		System.out.println("Enter login: ");
		String login = br.next();
		System.out.println("Enter password: ");
		String password = br.next();
		client.connect(connect);
		client.login(login, password);
		return client;
	}
	
	public static void main(String[] args) throws IOException {
		
		FTPClient client = new FTPClient();
		client = FTPConnection(client);
		FTPFile[] files = client.listFiles("");
		for(FTPFile file: files){
			System.out.println(file.getName());
		}

	}

}