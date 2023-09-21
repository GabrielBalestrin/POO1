package AtividadeHeranca;
//ATIVIDADE 3 PDF 1
public class Conta {
		private String banco;
		private int agencia;
		private int numeroConta;
		private double saldo =0;
		
		
		public Conta(String banco, int agencia, int numeroConta, double saldo) {
			setBanco(banco);
			setAgencia(agencia);
			setNumeroConta(numeroConta);
			setSaldo(saldo);	
		}
		
		public String getBanco() {
			return banco;
		}
		public void setBanco(String banco) {
			this.banco = banco;
		}
		public int getAgencia() {
			return agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		public int getNumeroConta() {
			return numeroConta;
		}
		public void setNumeroConta(int numeroConta) {
			this.numeroConta = numeroConta;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public boolean deposito	(double valor) {
			   if (valor > 0) {
			        saldo += valor;
			        return true;
			    } else {
			        return false; 
			    }
			}
		public boolean saque (double valor ) {
			if (valor > 0) {
				saldo = saldo - valor;
				return true;
			}  else {
				return false;
			}
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Conta [banco=");
			builder.append(banco);
			builder.append(", agencia=");
			builder.append(agencia);
			builder.append(", numeroConta=");
			builder.append(numeroConta);
			builder.append(", saldo=");
			builder.append(saldo);
			builder.append("]");
			return builder.toString();
		}
		
		
		
}

