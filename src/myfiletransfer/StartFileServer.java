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
 
public class StartFileServer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			java.rmi.registry.LocateRegistry.createRegistry(1099);
			
			FileServer fs=new FileServer();
			fs.setFile("C:\\Users\\Nasir Majeed\\Desktop\\Awan.docx");			
			Naming.rebind("rmi://localhost/abc", fs);
			System.out.println("File Server is Ready");
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
}