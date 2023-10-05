package atendimentoMedicoAtividade;

public class Medico extends Pessoa {

	private String especialiadade = "nenhuma";
	
	public Medico(String nome, String dataNasc, String especialidade) {
		super(nome, dataNasc);
		setEspecialiadade(especialiadade);
		
	}

	public String getEspecialiadade() {
		return especialiadade;
	}

	public void setEspecialiadade(String especialiadade) {
		this.especialiadade = especialiadade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medico [especialiadade=");
		builder.append(especialiadade);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}	
}
