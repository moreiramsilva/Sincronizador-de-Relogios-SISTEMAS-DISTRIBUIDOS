package utilidades;

import java.rmi.Remote;
import java.rmi.RemoteException;

/*	interface que define a comunicação
*/

public interface mensageiroInterface extends Remote{

	public void enviaMensagem(String msg)throws RemoteException;
	public String lerMensagem()throws RemoteException;
}
