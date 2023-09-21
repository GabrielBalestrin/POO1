package AtividadeHeranca4;
//ATIVIDADE 10 -PDF 4
public class bombaEtanol extends bomba {

	public bombaEtanol(double totalLitros, float valorLitro) {
        super(totalLitros, valorLitro);
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("bombaEtanol [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
