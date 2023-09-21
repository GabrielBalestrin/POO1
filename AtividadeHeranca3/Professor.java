package AtividadeHeranca3;
//ATIVIDADE 7 PDF 3
public class Professor extends Pessoa {
	
	private String disciplina;
	
	public Professor (int codigo, String nome, String endereco, String disciplina) {
		super(codigo, nome, endereco);
		setDisciplina(disciplina);
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [disciplina=");
		builder.append(disciplina);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
