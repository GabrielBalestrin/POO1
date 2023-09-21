package AtividadeHeranca4;
//ATIVIDADE 10 -PDF 4
public class bomba {
	private double totalLitros;
	private float valorLitro;

	public bomba(double totalLitros, float valorLitro) {
		setTotalLitros(totalLitros);
		setValorLitro(valorLitro);
	}

	public double getTotalLitros() {
		return totalLitros;
	}

	public void setTotalLitros(double totalLitros) {
		this.totalLitros = totalLitros;
	}

	public float getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}

	public boolean abastecerPorLitro(int litros) {
		if (litros > 0) {
			float total = 0, v = 0;
			total += litros;
			v = getValorLitro() * total;
			System.out.println("Abastecido " + total + " litros");
			System.out.println("Total foi de " + v + " reais");
			return true;
		} else {
			return false;
		}
	}

	public boolean abastecerPorValor(double valor) {
		if (valor > 0) {
			float total = (float) (valor / getValorLitro());
			float v = getValorLitro() * total;
			System.out.println("Abastecido " + total + " litros");
			System.out.println("Total foi de " + v + " reais");
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("bomba [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("]");
		return builder.toString();
	}

}
