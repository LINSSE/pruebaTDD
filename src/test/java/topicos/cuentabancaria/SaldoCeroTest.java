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
	public void restarSaldo() throws Exception{
		try {
			cb.restarSaldo(10);
						
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals(0,cb.getSaldo());
		}
		
		
	}
	
	@Test
	public void restaSaldoSuperior(){
		cb.añadirSaldo(30);
		try {
			cb.restarSaldo(40);
		} catch (Exception e) {
			assertEquals(30,cb.getSaldo());
		}
		
	
		
	}
	


}
