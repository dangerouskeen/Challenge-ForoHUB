package alura.com.challengeForo.service;

import alura.com.challengeForo.model.Topico;
import alura.com.challengeForo.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    public Topico crearTopico(Topico topico) {
        if (topicoRepository.existsByTituloAndMensaje(topico.getTitulo(), topico.getMensaje())) {
            throw new IllegalArgumentException("Tópico duplicado");
        }
        return topicoRepository.save(topico);
    }

    public Optional<Topico> obtenerTopico(Long id) {
        return topicoRepository.findById(id);
    }

    public Iterable<Topico> obtenerTodos() {
        return topicoRepository.findAll();
    }

    public Topico actualizarTopico(Long id, Topico topico) {
        if (!topicoRepository.existsById(id)) {
            throw new IllegalArgumentException("Tópico no encontrado");
        }
        topico.setId(id);
        return topicoRepository.save(topico);
    }

    public void eliminarTopico(Long id) {
        topicoRepository.deleteById(id);
    }
}
