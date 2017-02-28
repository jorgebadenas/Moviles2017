package datos;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import excepciones.ClaveNoExisteException;

public class AlmacenClientesTest {
	AlmacenClientes alm = new AlmacenClientes();
	
	
	@Before
	public void init() {
		
	}

	@Test
	public void testGetCliente() {
		
		Particular p1 = new Particular("Ramón", "Peñalver", "1", new Direccion("cp1", "Prov1", "Pob1"),
				"email@gmail.com", Calendar.getInstance(), new Tarifa(1.1f));
		
		alm.setCliente(p1);
		Cliente p2 = alm.getCliente("1");
		//System.out.println(p2);
		
		assertEquals(p1, p2);
		
		try 
		{
			alm.getCliente("0000");
		}
		catch(ClaveNoExisteException e) { }
	}

	@Test
	public void testSetCliente() {
		Particular p1 = new Particular("Ramón", "Peñalver", "1", new Direccion("cp1", "Prov1", "Pob1"),
				"email@gmail.com", Calendar.getInstance(), new Tarifa(1.1f));
	
		alm.setCliente(p1);
		
		Particular p3 = new Particular("333333", "33333", "1", new Direccion("cp3", "Prov3", "Pob3"),
				"email@gmail.com", Calendar.getInstance(), new Tarifa(3.3f));
		alm.setCliente(p3);
		
		Cliente p2 = alm.getCliente("1");
		//System.out.println(p2);
		
		assertEquals(p3, p2);
	}

	@Test
	public void testExisteCliente() {
		Particular p1 = new Particular("Ramón", "Peñalver", "1", new Direccion("cp1", "Prov1", "Pob1"),
				"email@gmail.com", Calendar.getInstance(), new Tarifa(1.1f));
	
		alm.setCliente(p1);
		
		assertTrue(alm.existeCliente("1"));
	}

	@Test
	public void testEliminaCliente() {
		Particular p1 = new Particular("Ramón", "Peñalver", "1", new Direccion("cp1", "Prov1", "Pob1"),
				"email@gmail.com", Calendar.getInstance(), new Tarifa(1.1f));

		alm.setCliente(p1);
		assertTrue(alm.existeCliente("1"));

		Particular p3 = new Particular("333333", "33333", "3", new Direccion("cp3", "Prov3", "Pob3"),
				"email@gmail.com", Calendar.getInstance(), new Tarifa(3.3f));
		alm.setCliente(p3);

		alm.eliminarCliente("1");

		assertFalse(alm.existeCliente("1"));
		assertTrue(alm.existeCliente("3"));
		try 
		{
			alm.eliminarCliente("0000");
		}
		catch(ClaveNoExisteException e) { }
	}
	
	@Test
	public void testCambiarTarifa() {
		Particular p1 = new Particular("Ramón", "Peñalver", "1", new Direccion("cp1", "Prov1", "Pob1"),
				"email@gmail.com", Calendar.getInstance(), new Tarifa(1.1f));
		
		alm.setCliente(p1);
		alm.cambiarTarifaCliente("1", new Tarifa(55.55f));
		
		Cliente p2 = alm.getCliente("1");
		
		assertEquals(new Tarifa(55.55f), p2.getTarifa());
		try 
		{
			alm.cambiarTarifaCliente("0000", new Tarifa(22.2f));
		}
		catch(ClaveNoExisteException e) { }
	}
}
