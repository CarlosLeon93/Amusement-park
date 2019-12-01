package parque.agentes;

import parque.pulseras.SupervisiónPulseras;
import parque.atracciones.SupervisiónConcurso;
import parque.atracciones.SupervisiónViajes;
import parque.acceso.SupervisiónAcceso;

/**
  * <p>
 * Clase que simula el comportamiento del <b>Supervisor</b> del parque de atracciones.
 * </p>
 * @author DTE-SSOO 2019-20 
 */
public class Supervisor
implements Runnable
{

	/**
	 * @param sPulseras {@link parque.pulseras.SupervisiónPulseras} interfaz de supervisión del <code>sistema de gestión de pulseras</code>
	 * @param sConcurso {@link parque.atracciones.SupervisiónConcurso} interfaz de supervisión de la atracción <code>Tiro a canasta</code>
	 * @param sViajes {@link parque.atracciones.SupervisiónViajes} interfaz de supervisión de la atracción <code>Sillas voladoras</code>
	 * @param sAcceso {@link parque.acceso.SupervisiónAcceso} interfaz de supervisión del <code>dispositivo de control de acceso</code>
	 * @param numClientes número de clientes que podrán acceder al parque
	 */
	public Supervisor (
		SupervisiónPulseras sPulseras,
		SupervisiónConcurso sConcurso,
		SupervisiónViajes sViajes,
		SupervisiónAcceso sAcceso,
		int numClientes )
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
