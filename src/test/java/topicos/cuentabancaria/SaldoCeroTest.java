package topicos.cuentabancaria;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SaldoCeroTest {

	private CuentaBancaria cb;

	@Before
	public void setUp() throws Exception {
		cb = new CuentaBancaria();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void saldoInicialCero()
	{
		
		int saldo = cb.getSaldo();
		assertEquals(0, saldo);
	}
	@Test
	public void añadirSaldo(){//NOSONAR
		
		cb.añadirSaldo(20);
		int saldo = cb.getSaldo();
		assertEquals(20, saldo);
	}
	
	@Test
	public void restarSaldo(){
		cb.restarSaldo(10);
		int saldo = cb.getSaldo();
		assertEquals(-10,saldo);
		
	}
	


}
