package AtividadeHeranca3;
//ATIVIDADE 8 -PDF 3
public class sala extends Ambiente {
		private boolean tv;

		public sala (float area, boolean tv) {
			super(area);
			setTv(tv);
		}
		public boolean isTv() {
			return tv;
		}

		public void setTv(boolean tv) {
			this.tv = tv;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("sala [tv=");
			builder.append(tv);
			builder.append(", toString()=");
			builder.append(super.toString());
			builder.append("]");
			return builder.toString();
		}
		
		
}
