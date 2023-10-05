package atendimentoMedicoAtividade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Time;
import java.util.Date;

public class AtendimentoMain {
	public static void main(String[] args) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

	
		Medico medico1 = new Medico("Dr. Silva", "01/01/1970", "Cardiologia");
		Medico medico2 = new Medico("Dr. Pereira", "02/02/1980", "Pneumologia");

		Paciente paciente1 = new Paciente("Sr. Santos", "03/03/1990");
		Paciente paciente2 = new Paciente("Sra. Oliveira", "04/04/2000");

		try {
		
			Atendimento atendimentoPaciente1 = new Atendimento();
			atendimentoPaciente1.setPaciente(paciente1);
			atendimentoPaciente1.setMedico(medico1);
			atendimentoPaciente1.setAtestado(true);
			atendimentoPaciente1.emitirAtestado();
			atendimentoPaciente1.setHoraChegada(new Time(timeFormat.parse("10:00").getTime()));
			atendimentoPaciente1.setData(new Date(dateFormat.parse("10/05/2023").getTime()));
			atendimentoPaciente1.setHoraSaida(new Time(timeFormat.parse("11:00").getTime()));
			atendimentoPaciente1.setInicioAtendimento(new Time(timeFormat.parse("10:15").getTime()));
			atendimentoPaciente1.setFimAtendimento(new Time(timeFormat.parse("10:50").getTime()));

			Atendimento atendimentoPaciente2 = new Atendimento();
			atendimentoPaciente2.setPaciente(paciente2);
			atendimentoPaciente2.setMedico(medico2);
			atendimentoPaciente2.setAtestado(false);
			atendimentoPaciente2.emitirAtestado();
			atendimentoPaciente2.setHoraChegada(new Time(timeFormat.parse("11:05").getTime()));
			atendimentoPaciente2.setHoraSaida(new Time(timeFormat.parse("12:20").getTime()));
			atendimentoPaciente2.setInicioAtendimento(new Time(timeFormat.parse("11:15").getTime()));
			atendimentoPaciente2.setFimAtendimento(new Time(timeFormat.parse("12:10").getTime()));

			
			Perguntas questionario = new Perguntas();
			int somatorioRespostasPaciente1 = questionario.fazerPerguntas();
			atendimentoPaciente1.setPrioridade(atendimentoPaciente1.definirPrioridade(somatorioRespostasPaciente1));

			int somatorioRespostasPaciente2 = questionario.fazerPerguntas();
			atendimentoPaciente2.setPrioridade(atendimentoPaciente2.definirPrioridade(somatorioRespostasPaciente2));


			ListaAtendimentos listaAtendimentos = new ListaAtendimentos();
			listaAtendimentos.addAtendimento(atendimentoPaciente1);
			listaAtendimentos.addAtendimento(atendimentoPaciente2);

			for (int i = 0; i < listaAtendimentos.getListaDeAtendimentos().size(); i++) {
				Atendimento atendimento = listaAtendimentos.getAtendimento(i);
				System.out.println("\nAtendimento " + (i + 1));
				System.out.println("Paciente: " + atendimento.getPaciente().getNome());
				System.out.println("Medico: " + atendimento.getMedico().getNome());
				System.out.println("Prioridade: " + atendimento.getPrioridade());
				System.out.println("Atestado médico: " + atendimento.emitirAtestado());
				System.out.println("Hora de chegada ao hospital: " + atendimento.getHoraChegada());
				System.out.println("Hora de inicio da consulta: " + atendimento.getInicioAtendimento());
				System.out.println("Hora do fim da consulta: " + atendimento.getFimAtendimento());
				System.out.println("Hora de saida do hospital: " + atendimento.getHoraSaida());
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
