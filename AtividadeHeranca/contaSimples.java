package AtividadeHeranca;
//ATIVIDADE 3 PDF 1	
public class contaSimples extends Conta {

	private double saldoPoupanca=0;
	
	public contaSimples (String banco, int agencia, int numeroConta, double saldo) {
		super(banco,agencia,numeroConta,saldo);
		setSaldoPoupanca(saldoPoupanca);
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
		if (getSaldo() >= valor) {
			saldoPoupanca += valor;
			setSaldo(getSaldo() - valor); 
			return true;
		} else {
			return false;
		}
	}
	

	public boolean saquePoupanca(double valor) {
	    if (getSaldoPoupanca()  >= valor) {
	        saldoPoupanca -= valor;
	        setSaldo(getSaldo() + valor);
	        return true;
	    } else {
	        return false;
	    }
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("contaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
