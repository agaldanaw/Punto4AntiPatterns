import java.util.Date;
import java.util.GregorianCalendar;

public class Poltergeists extends Date  {
	
	public Date date;
	/*
	 * (“No se sabe bien lo que hacen algunas clases”): Esta mala práctica se refiere a objetos 
	 * de un ciclo de vida corto cuya única función suele ser invocar métodos de otros objetos. 
	 * Esto hace que crezca la dificultad para mantener el sistema.
	 * 
	 * Este ejemplo intenta crear una nueva clase para manejar fechas, pero usa los métodos de la clase Date de java
	 * incluso hereda de esa clase
	 * 
	 */
	
	@SuppressWarnings("deprecation")
	public void createDate(int day, int month, int year )
	{
		date = new Date(year,month, day );
	}
	
	@SuppressWarnings("deprecation")
	public void addDay(int d)
	{
		date.setDate(date.getDate() + d);
	}
}
