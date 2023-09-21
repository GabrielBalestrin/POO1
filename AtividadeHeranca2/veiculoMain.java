package AtividadeHeranca2;
//ATIVIDE 4 PDF 2
public class veiculoMain {
	public static void main(String[] args) {
		veiculo v = new veiculo(true);
		System.out.println(v);

		caminhao cam = new caminhao(true, 3);
		System.out.println(cam);
		
		Carro c = new Carro(true, 4);
		System.out.println(c);
		
		moto m = new moto(true,700);
		System.out.println(m);
		
	}
}
