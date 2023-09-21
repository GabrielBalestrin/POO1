package AtividadeHeranca2;

//ATIVIDADE 5 PDF 2
public class gato extends mamifero {

	public String cor;
	
	public gato(String nome, int idade, String pelagem, String cor) {
		super(nome, idade, pelagem);
		setCor(cor);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean ronronar() {
		if (getIdade() > 0) {
			System.out.println("som de ronronar");
			return true;
		} else {
			return false;
		}
	}

}
