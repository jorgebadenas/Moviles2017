package datos;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;

public class CompanyiaMovilesTest {

	@Test
	public void testSubListado() {
		ArrayList<Cliente> arr = new ArrayList<>();
		Calendar fechaAltaMasCinco = GregorianCalendar.getInstance();
		fechaAltaMasCinco.add(Calendar.DATE, 5); // Le sumamos cinco días a hoy

		Particular p1 = new Particular("Ramón", "Peñalver", "1", new Direccion("cp1", "Prov1", "Pob1"),
				"email@gmail.com", GregorianCalendar.getInstance(), new Tarifa(1.1f));
		Particular p2 = new Particular("2222", "2222", "2", new Direccion("cp2", "Prov2", "Pob2"), "email@gmail.com",
				fechaAltaMasCinco, new Tarifa(3.3f));
		Particular p3 = new Particular("333333", "33333", "2", new Direccion("cp3", "Prov3", "Pob3"), "email@gmail.com",
				GregorianCalendar.getInstance(), new Tarifa(3.3f));

		arr.add(p1);
		arr.add(p2);
		arr.add(p3);

		Calendar desde = GregorianCalendar.getInstance();
		desde.add(Calendar.DATE, -1); // Le restamos un día a hoy

		Calendar hasta = GregorianCalendar.getInstance();
		hasta.add(Calendar.DATE, 1);  // Le sumamos un día a hoy

		List<Fechable> lf = CompanyiaMoviles.subListado(arr, desde, hasta);
		assertEquals(lf.size(), 2);
	}

}
