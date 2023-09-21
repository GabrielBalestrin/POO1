package AtividadeHeranca3;
//ATIVIDADE 9 -PDF 3
public class millenniumFalcon extends apollo11 {
	private float  classeHiperpropulsor;
	
	public millenniumFalcon (double velocidadeMaxima,String tipoCombustivel, float classeHiperpropulsor) {
		super(velocidadeMaxima, tipoCombustivel);
		setClasseHiperpropulsor(classeHiperpropulsor);
	}

	public float getClasseHiperpropulsor() {
		return classeHiperpropulsor;
	}

	public void setClasseHiperpropulsor(float classeHiperpropulsor) {
		this.classeHiperpropulsor = classeHiperpropulsor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("millenniumFalcon [classeHiperpropulsor=");
		builder.append(classeHiperpropulsor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
