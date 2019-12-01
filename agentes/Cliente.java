package parque.agentes;

import parque.acceso.UsoAcceso;
import parque.atracciones.UsoAtracción;
import parque.pulseras.UsoPulseras;

/**
 * <p>
 * Clase que simula el comportamiento de un <b>cliente</b> del parque de atracciones.
 * </p>
 * @author DTE-SSOO 2019-20 
 */
public class Cliente
implements Runnable
{
	/**
	 * @param uPulseras {@link parque.pulseras.UsoPulseras} interfaz de uso del sistema de gestión de pulseras.
	 * @param uAtracciones {@link parque.atracciones.UsoAtracción} interfaz de uso de cada una de las atracciones disponibles en el parque en el momento de apertura.
	 * @param uAcceso {@link parque.acceso.UsoAcceso} interfaz de uso del dispositivo de control de acceso al parque.
	 */
	public Cliente ( UsoPulseras uPulseras, UsoAtracción[] uAtracciones, UsoAcceso uAcceso )
	{
	}


	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run ()
	{
	}
}
