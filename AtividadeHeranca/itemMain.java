package AtividadeHeranca;
//ATIVIDADE 2 PDF 1
public class itemMain {
	public static void main(String[] args) {
		 
		item i = new item(1,"Bola");
		System.out.println(i);
		
		livro l = new livro(2,"Abelhas");
		l.setAutor("Gabriela");
		System.out.println(l);
		
		midia m = new midia(3,"Filme","aaa",120);
		System.out.println(m);
			
		cd CD = new cd(4,"CD comprado","VEVO",60);
		CD.setFaixas(20);
		CD.setArtista("Elvis Presley");
		CD.setAlbum("The enssential");
		System.out.println(CD);
		
		vhs VHS = new vhs(5,"Fimes Star wars", "LucasFilm", 110);
		VHS.setTitulo("Star wars 1");
		System.out.println(VHS);
		
	}

}
