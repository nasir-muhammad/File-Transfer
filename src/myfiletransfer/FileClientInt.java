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
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface FileClientInt extends Remote{
 
	public boolean sendData(String filename, byte[] data, int len) throws RemoteException;
	
	public String getName() throws RemoteException;
}

