/**
 * 
 */
package datos;

import java.util.Calendar;

/**
 * @author jorge
 *
 */
public class Empresa extends Cliente {

	/**
	 * @param nombre
	 * @param codigo
	 * @param direccion
	 * @param email
	 * @param fechaAlta
	 * @param tarifa
	 */
	public Empresa(String nombre, String codigo, Direccion direccion,
			String email, Calendar fechaAlta, Tarifa tarifa) {
		super(nombre, codigo, direccion, email, fechaAlta, tarifa);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Empresa [toString()=" + super.toString() + "]";
	}

}
