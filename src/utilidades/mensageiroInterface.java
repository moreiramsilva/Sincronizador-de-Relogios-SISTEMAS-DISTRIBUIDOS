package utilidades;

import java.rmi.Remote;
import java.rmi.RemoteException;

/*	interface que define a comunica��o
*/

public interface mensageiroInterface extends Remote{

	public void enviaMensagem(String msg)throws RemoteException;
	public String lerMensagem()throws RemoteException;
}
