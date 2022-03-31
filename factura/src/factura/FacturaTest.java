package factura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {

Factura factura = new Factura();
Producto p = new Producto("Latigo", 25, 5);


	

@Test
	void testTotalFactura() {
		factura.meterProducto(p);
		assertTrue(factura.totalFactura() == 125);
	}

@Test
	void testAplicarIva() {
	factura.meterProducto(p);
	assertTrue(factura.aplicarIva((float) 1.1) == factura.totalFactura()*1.1);
	}
}



