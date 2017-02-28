package datos;

import java.util.Calendar;

public class Factura implements Fechable {
	String codigoFactura;
	String codigoCliente;
	Calendar fechaEmision;
	Calendar inicioPeriodo;
	Calendar finPeriodo;
	double tarifa;
	double importe;	
	
	public Factura(String codigoFactura, String codigoCliente,
			Calendar fechaEmision, Calendar inicioPeriodo, Calendar finPeriodo,
			double tarifa) {
		super();
		this.codigoFactura = codigoFactura;
		this.codigoCliente = codigoCliente;
		this.fechaEmision = fechaEmision;
		this.inicioPeriodo = inicioPeriodo;
		this.finPeriodo = finPeriodo;
		this.tarifa = tarifa;
		this.importe = 0.0;
	}

	@Override
	public String toString() {
		return "Factura [codigoFactura=" + codigoFactura + ", codigoCliente="
				+ codigoCliente + ", fechaEmision=" + fechaEmision
				+ ", inicioPeriodo=" + inicioPeriodo + ", finPeriodo="
				+ finPeriodo + ", tarifa=" + tarifa + ", importe=" + importe
				+ "]";
	}

	public String getCodigoFactura() {
		return codigoFactura;
	}

	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public Calendar getInicioPeriodo() {
		return inicioPeriodo;
	}

	public void setInicioPeriodo(Calendar inicioPeriodo) {
		this.inicioPeriodo = inicioPeriodo;
	}

	public Calendar getFinPeriodo() {
		return finPeriodo;
	}

	public void setFinPeriodo(Calendar finPeriodo) {
		this.finPeriodo = finPeriodo;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public double getImporte() {
		return importe;
	}

	@Override
	public Calendar getFecha() {
		return fechaEmision;
	}

	@Override
	public void setFecha(Calendar fecha) {
		fechaEmision = fecha;

	}

}
