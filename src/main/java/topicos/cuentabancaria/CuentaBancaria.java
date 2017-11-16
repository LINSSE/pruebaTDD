package topicos.cuentabancaria;

public class CuentaBancaria {

	private int saldo = 0;
	public int getSaldo() {
		return this.saldo;
	}

	public void añadirSaldo(int i) {
		this.saldo = this.saldo + i;
		
	}

}
