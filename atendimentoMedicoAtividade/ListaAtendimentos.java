package atendimentoMedicoAtividade;

import java.util.ArrayList;

public class ListaAtendimentos {
    private ArrayList<Atendimento> listaDeAtendimentos;

    public ListaAtendimentos() {
        listaDeAtendimentos = new ArrayList<>();
    }
    
    public void addAtendimento(Atendimento atendimento) {
        listaDeAtendimentos.add(atendimento);
    }
    
    public Atendimento getAtendimento(int indice) {
        if (indice >= 0 && indice < listaDeAtendimentos.size()) {
            return listaDeAtendimentos.get(indice);
        }
        return null; 
    }

	public ArrayList<Atendimento> getListaDeAtendimentos() {
		return listaDeAtendimentos;
	}

	public void setListaDeAtendimentos(ArrayList<Atendimento> listaDeAtendimentos) {
		this.listaDeAtendimentos = listaDeAtendimentos;
	}

}
