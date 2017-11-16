package topicos.cuentabancaria;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SaldoCeroTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void saldoInicialCero()
	{
		CuentaBancaria cb = new CuentaBancaria();
		int saldo = cb.getSaldo();
		assertEquals(0, saldo);
	}
	@Test
	public void añadirSaldo(){
		CuentaBancaria cb = new CuentaBancaria();
		
		cb.añadirSaldo(20);
		int saldo = cb.getSaldo();
		assertEquals(20, saldo);
	}

}
