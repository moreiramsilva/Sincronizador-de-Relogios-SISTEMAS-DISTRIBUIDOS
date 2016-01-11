package utilidades;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/* implementação da interface mensageiro 
 * */

public class mensageiroImplementacao extends UnicastRemoteObject implements mensageiroInterface{
	
	private String msgRecebida = " ";

	public mensageiroImplementacao() throws RemoteException {
		super();
	}
	
	public void enviaMensagem (String msg) throws RemoteException{
		System.out.println(msg);
		msgRecebida = msg;
	}
	
	public String lerMensagem() throws RemoteException{
		return msgRecebida;
	}
}
