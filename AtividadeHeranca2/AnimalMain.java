package AtividadeHeranca2;
//ATIVIDADE 5 PDF 2
public class AnimalMain {
	public static void main(String[] args) {
		gato cat = new gato("Bob", 3, "macio", "laranja");
		cat.ronronar();
		System.out.println(cat);
	
		lagarto l = new lagarto("Largatao", 1, "grossa");
		l.setEspecie("Dragão de Komodo");
		l.trocarPele();
		System.out.println(l);
	}	
}
