package AtividadeHeranca4;
//ATIVIDADE 10 -PDF 4
public class bombaGasolina extends bomba {

	public bombaGasolina(double totalLitros, float valorLitro) {
        super(totalLitros, valorLitro);
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("bombaGasolina [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
