/**
 * 
 */
package datos;

import java.util.Calendar;

/**
 * @author jorge
 *
 */
public class Particular extends Cliente{
	private String apellidos;

	/**
	 * @param nombre
	 * @param codigo
	 * @param direccion
	 * @param email
	 * @param fechaAlta
	 * @param tarifa
	 */
	public Particular(String nombre, String apellidos, String codigo, Direccion direccion,
			String email, Calendar fechaAlta, Tarifa tarifa) {
		super(nombre, codigo, direccion, email, fechaAlta, tarifa);
		this.apellidos = apellidos;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}	
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param codigo
	 * @param direccion
	 * @param email
	 * @param fechaAlta
	 * @param tarifa
	 */
	public void setDatos(String nombre, String apellidos, String codigo, Direccion direccion,
			String email, Calendar fechaAlta, Tarifa tarifa) {
		super.setDatos(nombre, codigo, direccion, email, fechaAlta, tarifa);
		this.apellidos = apellidos;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Particular [apellidos=" + apellidos + ", toString()="
				+ super.toString() + "]";
	}
	
}
