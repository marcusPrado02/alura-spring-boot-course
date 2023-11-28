package med.voll.api.domain.consulta.validacoes;

import java.time.Duration;
import java.time.LocalDateTime;

import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.infra.exception.ValidacaoException;

public class ValidadorMedicoAtivo {
    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();
        var medicoEstaAtivo = dados.idMedico() != null;
        if (medicoEstaAtivo && Duration.between(LocalDateTime.now(), dataConsulta).toMinutes() < 30) {
            throw new ValidacaoException("A consulta deve ser agendada pelo menos de 30 minutos");
        }
    }
}
