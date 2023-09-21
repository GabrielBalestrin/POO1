package AtividadeHeranca4;
//ATIVIDADE 11 - PDF 4
public class pecaMain {
	public static void main(String[] args) {
		Peca p = new Peca(1, 2, false, 2);
		System.out.println(p);
		
		peao p1 = new peao(1, 1, true, 3);
		p1.mover(5, 5);
		
	}
}
