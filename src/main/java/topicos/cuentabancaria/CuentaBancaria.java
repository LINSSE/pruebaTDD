package topicos.cuentabancaria;

public class CuentaBancaria {

	private int saldo = 0;
	public int getSaldo() {
		return this.saldo;
	}

	public void añadirSaldo(int i) {
		this.saldo = this.saldo + i;
		
	}

	public void restarSaldo(int i) throws Exception {
		
		if(this.saldo > i)
		{
			this.saldo = this.saldo - i;
		}
		else
		{
			throw new Exception("Saldo insuficiente");
		}
	}

	

}
