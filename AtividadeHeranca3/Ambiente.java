package AtividadeHeranca3;
//ATIVIDADE 8 -PDF 3
public class Ambiente {
		private float area;
		
		public Ambiente(float area) {
			setArea(area);
		}

		public float getArea() {
			return area;
		}

		public void setArea(float area) {
			this.area = area;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Ambiente [area=");
			builder.append(area);
			builder.append("]");
			return builder.toString();
		}
		
		
}
