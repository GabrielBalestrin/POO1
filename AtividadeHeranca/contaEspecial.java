package AtividadeHeranca;
//ATIVIDADE 3 PDF 1	
public class contaEspecial extends Conta {
	private int diasSemJuros;
	private double limite;
	
	public contaEspecial (String banco, int agencia, int numeroConta, double saldo) {
		super(banco,agencia,numeroConta,saldo);
		setDiasSemJuros(diasSemJuros);
		setLimite(limite);
	}

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("contaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}