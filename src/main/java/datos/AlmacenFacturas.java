package datos;

import java.util.HashMap;
import java.util.Map;

public class AlmacenFacturas {
	private Map<String, Factura> facturasMap = new HashMap<String, Factura>();
	
	public void addFactura(Factura fac){
		facturasMap.put(fac.getCodigoFactura(), fac);
	}
}
