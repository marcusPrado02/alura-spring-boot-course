package med.voll.api.domain.paciente;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    Page<Paciente> findAll(Pageable paginacao);

    Page<Paciente> findAllByAtivoTrue(Pageable paginacao);
}
