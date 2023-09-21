package AtividadeHeranca4;
//ATIVIDADE 11 - PDF 4
public class peao extends Peca {
	
	 public peao (int linha, int coluna, boolean cor, int movimentos) {
		 super(linha, coluna,cor, movimentos);
	 }
	 
	 public boolean mover (int linha, int coluna) {
		 if (linha > 0 && coluna >= 0) {
			 System.out.println("posicionado!");
			 return true;
		 } else {
			 return false;
		 }
		 
	 }
}
