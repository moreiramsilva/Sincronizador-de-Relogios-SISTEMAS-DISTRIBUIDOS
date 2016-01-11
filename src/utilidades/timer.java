package utilidades;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class timer {
	
	public String getTime(){
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		Date hora = Calendar.getInstance().getTime();
		String dataFormatada = sdf.format(hora);
		
		return dataFormatada;
		}
}
