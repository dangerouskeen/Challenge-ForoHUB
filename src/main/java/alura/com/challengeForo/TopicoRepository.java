package alura.com.challengeForo.repository;

import alura.com.challengeForo.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    boolean existsByTituloAndMensaje(String titulo, String mensaje);
}
