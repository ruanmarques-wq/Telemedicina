package br.com.telecuida.app;

import br.com.telecuida.modelo.*;
import br.com.telecuida.servico.*;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente(1, "Ana Silva", "ana@email.com");
        Medico medico = new Medico(2, "Dr. Carlos", "carlos@email.com",
                "CRM12345", "Clínica Geral");

        Consulta consulta = new Consulta(paciente, medico, "30/10/2026 às 14:00");

        PagamentoPix pagamento = new PagamentoPix(150.00, "ana@email.com");
        System.out.println("Processando pagamento...");
        pagamento.processar();

        if (consulta.confirmar(pagamento)) {
            System.out.println("Consulta confirmada!");
        } else {
            System.out.println("Pagamento recusado. Consulta não confirmada.");
        }

        System.out.println("Paciente: " + consulta.getPaciente().getNome());
        System.out.println("Médico: " + consulta.getMedico().getNome());
        System.out.println("Especialidade: " + medico.getEspecialidade());
        System.out.println("Horário: " + consulta.getHorario());
        System.out.println("Status: " + consulta.getStatus());

        ReceitaMedica receita = new ReceitaMedica(
                medico.getCrm(), "12345678900", "Medicamento exemplo", "1 comprimido ao dia");
        ValidadorAssinatura validador = new ValidadorSimulado();
        System.out.println("Receita assinada: " + receita.assinar(validador));
    }
}
