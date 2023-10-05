package atendimentoMedicoAtividade;

import java.sql.Time;
import java.util.Date;

public class Atendimento {

    private Date data;
    private Time horaChegada;
    private Time horaSaida;
    private Time inicioAtendimento;
    private Time fimAtendimento;
	private boolean atestado = false;
	private int prioridade;
	
	private Paciente paciente;
    private Medico medico;

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Time getHoraChegada() {
		return horaChegada;
	}
	public void setHoraChegada(Time horaChegada) {
		this.horaChegada = horaChegada;
	}
	public Time getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(Time horaSaida) {
		this.horaSaida = horaSaida;
	}
	public Time getInicioAtendimento() {
		return inicioAtendimento;
	}
	public void setInicioAtendimento(Time inicioAtendimento) {
		this.inicioAtendimento = inicioAtendimento;
	}
	public Time getFimAtendimento() {
		return fimAtendimento;
	}
	public void setFimAtendimento(Time fimAtendimento) {
		this.fimAtendimento = fimAtendimento;
	}
    
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
   
	public boolean isAtestado() {
		return atestado;
	}
	public void setAtestado(boolean atestado) {
		this.atestado = atestado;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	//MÉTODOS
	 public String emitirAtestado() {
	        if (atestado)
	            return "Atestado gerado com sucesso!";
	        else 
	            return "Não foi gerado atestado!";
	    }
	
	public int definirPrioridade(int somatorio) {
	    if (somatorio >= 5 && somatorio <= 10) {
	        return 1; 
	    } else if (somatorio >= 11 && somatorio <= 15) {
	        return 2; 
	    } else if (somatorio >= 16 && somatorio <= 20) {
	        return 3; 
	    } else {
	        return 4; 
	    }
	}



}
