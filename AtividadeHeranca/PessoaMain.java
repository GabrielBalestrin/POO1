package AtividadeHeranca;
//ATIVIDADE 1 PDF 1
public class PessoaMain {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Gabriel","XV de novembro");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica("Ana", "7 de setembro");
		pf.setCpf("000.000.000-00");
		pf.setEstadoCivil("Solteiro");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica("Carlos", "10 de Maio");
		pj.setCnpj("33.052.743/0001-64");
		pj.setTipoEmpresa("MEI");
		System.out.println(pj);
		
	}
}
