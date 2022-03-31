package factura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

Producto p = new Producto("L�tigo", 25, 5);

	@Test
	void testNuevo() {
		String expected = "L�tigo";
		String actual = p.getNombre();
		assertTrue(p.getCantidad() == 5);
	}

	@Test
	void testPrecioTotal() {
		assertTrue(p.precioTotal() == 125);
	}
	
	
	
}
