package AtividadeHeranca;
//ATIVIDADE 2 PDF 1
	public class cd extends midia  {
	
		private int faixas;
		private String artista;
		private String album;
	 
		public cd (int codigo,String descricao,String gravadora, float duracao) {
			super(codigo,descricao,gravadora,duracao);
			setFaixas(faixas);
			setArtista(artista);
			setAlbum(album);
		}
		
	   
	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("cd [faixas=");
		builder.append(faixas);
		builder.append(", artista=");
		builder.append(artista);
		builder.append(", album=");
		builder.append(album);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
