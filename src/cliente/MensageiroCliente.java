package cliente;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.net.InetAddress;
import java.net.MalformedURLException;
import utilidades.*;

public class MensageiroCliente {

	static int i = 0;
	static String IP;
	
	public static void main(String arg[]){
		try{
			mensageiroInterface m = (mensageiroInterface) Naming.lookup("rmi://192.168.1.105:1098/Servidor");
			System.out.println(m.lerMensagem());	
			IP = InetAddress.getLocalHost().getHostAddress();
			
			while(i != 60){
				
				Thread.sleep(1000);// 1s
				
				timer a = new timer();
				
				m.enviaMensagem(IP+": "+a.getTime());
				i++;
			}
		}catch(RemoteException e){}catch(MalformedURLException e){}catch(NotBoundException e){} catch(Exception e){}
		
		
	}	
}
