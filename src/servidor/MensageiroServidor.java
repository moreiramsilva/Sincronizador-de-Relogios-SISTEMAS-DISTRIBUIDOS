package servidor;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import utilidades.mensageiroImplementacao;
import utilidades.mensageiroInterface;

public class MensageiroServidor{
	
	public MensageiroServidor() {
			try {
				Registry registry = LocateRegistry.createRegistry(1098);
				mensageiroInterface a = new mensageiroImplementacao();
				Naming.rebind("rmi://192.168.1.105:1098/Servidor", a );
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
public static void main (String arg[]){
	
	new MensageiroServidor ();
	
}
}
