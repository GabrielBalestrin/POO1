package AtividadeHeranca4;
//ATIVIDADE 10 -PDF 4 

public class bombaMain {
    public static void main(String[] args) {
        bombaGasolina bomba1 = new bombaGasolina(100, 5.5f); 
        System.out.println(bomba1);
        System.out.println();
        bomba1.abastecerPorLitro(15);
        bomba1.abastecerPorValor(150);
        
        bombaDiesel b2 = new bombaDiesel(12, 5.0f);
        System.out.println();
        System.out.println(b2);
        System.out.println();
        b2.abastecerPorLitro(20);
        b2.abastecerPorValor(100);
        
        bombaEtanol b3 = new bombaEtanol(20, 4.5f);
        System.out.println();
        System.out.println(b2);
        System.out.println();
        b3.abastecerPorLitro(20);
        b3.abastecerPorValor(100);  
   
    }
}