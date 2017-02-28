package datos;

public class Tarifa {
	private float tarifa;
	public Tarifa(){}
	public Tarifa( float tarifa) {
		this.tarifa = tarifa;
	}
	public float getTarifa() {
		return tarifa;
	}
	public void setTarifa(float tarifa) {
		this.tarifa = tarifa;
	}
	@Override
	public String toString() {
		return "Tarifa [tarifa=" + tarifa + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(tarifa);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarifa other = (Tarifa) obj;
		if (Float.floatToIntBits(tarifa) != Float.floatToIntBits(other.tarifa))
			return false;
		return true;
	}
	

}
