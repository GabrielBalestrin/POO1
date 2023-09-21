package AtividadeHeranca;
//ATIVIDADE 3 PDF 1	
public class contaMain {
	public static void main(String[] args) {
		
		Conta conta = new Conta("Sicoob", 123, 123124, 100);
		System.out.println(conta);
		conta.deposito(100);
		System.out.println(conta);
		conta.saque(50);
		System.out.println(conta);
		
		contaSimples  cs = new contaSimples("Sicoob", 123, 123124, 1000);
		System.out.println(cs);
		cs.depositoPoupanca(100);
		System.out.println(cs);
		cs.saquePoupanca(50);
		System.out.println(cs);
		
		contaEspecial ce = new contaEspecial("BB", 137, 215, 20);
		ce.setDiasSemJuros(10);
		ce.setLimite(100);
		System.out.println(ce);
	
	}
}
