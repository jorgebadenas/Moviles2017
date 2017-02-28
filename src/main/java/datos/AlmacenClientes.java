/**
 * 
 */
package datos;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import excepciones.ClaveNoExisteException;

/**
 * @author jorge
 *
 */
public class AlmacenClientes {
	Map<String,Cliente> clientesMap = new HashMap<String,Cliente>();

	public AlmacenClientes() {
	}

	/**
	 * @param clave
	 * @return
	 */
	Cliente getCliente(String clave) throws ClaveNoExisteException {
		if(!existeCliente(clave))
			throw new ClaveNoExisteException();
		return clientesMap.get(clave);
	}
	
	void setCliente(Cliente cliente){
		String clave = cliente.getCodigo();
		clientesMap.put(clave, cliente);
	}
	
	boolean existeCliente(String clave){
		return clientesMap.containsKey(clave);
	}
	
	void eliminarCliente(String clave) throws ClaveNoExisteException {
		if(!existeCliente(clave))
			throw new ClaveNoExisteException();
		clientesMap.remove(clave);
	}
	
	void cambiarTarifaCliente(String clave, Tarifa tarifa) throws ClaveNoExisteException {
		Cliente cli = getCliente(clave);
		if(cli==null)
			throw new ClaveNoExisteException();
		cli.setTarifa(tarifa);
	}
	
	List<Cliente> getListadoClientes(){
		return new ArrayList<Cliente>(clientesMap.values());
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AlmacenClientes [clientesMap=" + clientesMap + "]";
	}
	

}
