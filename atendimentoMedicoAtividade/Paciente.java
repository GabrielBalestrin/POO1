package atendimentoMedicoAtividade;

public class Paciente extends Pessoa {

	public Paciente(String nome, String dataNasc) {
		super(nome, dataNasc);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
