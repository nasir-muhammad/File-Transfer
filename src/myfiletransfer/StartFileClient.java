/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfiletransfer;

/**
 *
 * @author Awan
 */

import java.rmi.Naming;
import java.util.Scanner;
 
 
public class StartFileClient {
 
	public static void main(String[] args) {
		try{
			FileClient c=new FileClient("imed");			
			FileServerInt server=(FileServerInt)Naming.lookup("rmi://localhost/abc");
			server.login(c);
			System.out.println("Listening.....");			
			Scanner s=new Scanner(System.in);
                        System.out.println(s);
                        System.out.println("i am here2");
			while(true){
                            System.out.println("i am here2");
				String line=s.nextLine();
                                System.out.println(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
 
}

