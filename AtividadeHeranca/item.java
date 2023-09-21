package AtividadeHeranca;
//ATIVIDADE 2 PDF 1
public class item {
		private int codigo;
		private String descricao;
		
		public item (int codigo, String descricao) {
			setCodigo(codigo);
			setDescricao(descricao);
		}
		
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("item [codigo=");
			builder.append(codigo);
			builder.append(", descricao=");
			builder.append(descricao);
			builder.append("]");
			return builder.toString();
		}
		
		
}
