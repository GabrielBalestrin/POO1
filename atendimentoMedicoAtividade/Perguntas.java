package atendimentoMedicoAtividade;
import java.util.Scanner;
public class Perguntas {

	private int p1, p2, p3, p4, p5;

	public int getP1() {
		return p1;
	}

	public void setP1(int p1) {
		this.p1 = p1;
	}

	public int getP2() {
		return p2;
	}

	public void setP2(int p2) {
		this.p2 = p2;
	}

	public int getP3() {
		return p3;
	}

	public void setP3(int p3) {
		this.p3 = p3;
	}

	public int getP4() {
		return p4;
	}

	public void setP4(int p4) {
		this.p4 = p4;
	}

	public int getP5() {
		return p5;
	}

	public void setP5(int p5) {
		this.p5 = p5;
	}

	public int fazerPerguntas() {
		int somatorio=0;
		Scanner ler = new Scanner(System.in);
		System.out.println("PERGUNTA 1 - Em uma escala de 1 a 5, onde 1 significa nenhuma dor e 5 significa dor intensa, qual � o n�vel da sua dor? ");
		p1 = ler.nextInt();
		somatorio = somatorio + p1;
		System.out.println("PERGUNTA 2 - Em uma escala de 1 a 5, onde 1 significa uma frequ�ncia card�aca normal e 5 significa uma frequ�ncia card�aca muito alta, como voc� avalia sua frequ�ncia card�aca?");
		p2 = ler.nextInt();
		somatorio = somatorio + p2;
		System.out.println("PERGUNTA 3 - Em uma escala de 1 a 5, onde 1 significa temperatura normal e 5 significa febre alta, qual � a sua temperatura corporal? ");
		p3 = ler.nextInt();
		somatorio = somatorio + p3;
		System.out.println("PERGUNTA 4 - Em uma escala de 1 a 5, onde 1 significa uma frequ�ncia respirat�ria normal e 5 significa uma frequ�ncia respirat�ria muito alta, como voc� avalia sua frequ�ncia respirat�ria? ");
		p4 = ler.nextInt();
		somatorio = somatorio + p4;
		System.out.println("PERGUNTA 5 - Em uma escala de 1 a 5, onde 1 significa nenhum desconforto e 5 significa desconforto extremo, como voc� avalia seu n�vel de desconforto geral? ");
		p5 = ler.nextInt();
		somatorio = somatorio + p5;
		System.out.println("Questionario realizado com sucesso!");
		return somatorio;
	}

}
