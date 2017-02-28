/**
 * Clase para los clientes de la compañía telefónica
 */
package datos;

import java.util.Calendar;

/**
 * @author jorge
 *
 */
public abstract class Cliente implements Fechable {
	private String nombre;
	private String codigo;
	private Direccion direccion;
	private String email;
	private Calendar fechaAlta;
	private Tarifa tarifa;
	public Cliente(String nombre, String codigo, Direccion direccion,
			String email, Calendar fechaAlta, Tarifa tarifa) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.direccion = direccion;
		this.email = email;
		this.fechaAlta = fechaAlta;
		this.tarifa = tarifa;
	}
	public void setDatos(String nombre, String codigo, Direccion direccion,
			String email, Calendar fechaAlta, Tarifa tarifa){
		this.nombre = nombre;
		this.codigo = codigo;
		this.direccion = direccion;
		this.email = email;
		this.fechaAlta = fechaAlta;
		this.tarifa = tarifa;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the fechaAlta
	 */
	@Override
	public Calendar getFecha() {
		return fechaAlta;
	}
	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	@Override
	public void setFecha(Calendar fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	/**
	 * @return the tarifa
	 */
	public Tarifa getTarifa() {
		return tarifa;
	}
	/**
	 * @param tarifa the tarifa to set
	 */
	public void setTarifa(Tarifa tarifa) {
		this.tarifa = tarifa;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", codigo=" + codigo
				+ ", direccion=" + direccion + ", email=" + email
				+ ", fechaAlta=" + fechaAlta + ", tarifa=" + tarifa + "]";
	}

}
