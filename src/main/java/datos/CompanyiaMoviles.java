/**
 * 
 */
package datos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

/**
 * @author Jorge
 *
 */
public class CompanyiaMoviles {
	private AlmacenClientes almacenClientes;
	private AlmacenFacturas almacenFacturas;
	
	public CompanyiaMoviles() {
		almacenClientes = new AlmacenClientes();
		almacenFacturas = new AlmacenFacturas();
	}
	
	public void anyadirCliente( Cliente cl ) {
		almacenClientes.setCliente(cl);
	}
	
	static public List<Fechable> subListado(Collection<? extends Fechable> coleccion, Calendar desde, Calendar hasta) {
		List<Fechable> resultado = new ArrayList<>();
		for( Fechable f: coleccion){
			if(f.getFecha().after(desde) && f.getFecha().before(hasta)){
				resultado.add(f);
			}
		}
		return resultado;
	}

}
