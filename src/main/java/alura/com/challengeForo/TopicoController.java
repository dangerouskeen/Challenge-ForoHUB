package alura.com.challengeForo.controller;

import alura.com.challengeForo.model.Topico;
import alura.com.challengeForo.service.TopicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoService topicoService;

    @PostMapping
    public ResponseEntity<Topico> crearTopico(@RequestBody Topico topico) {
        return ResponseEntity.ok(topicoService.crearTopico(topico));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topico> obtenerTopico(@PathVariable Long id) {
        return topicoService.obtenerTopico(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public Iterable<Topico> obtenerTodos() {
        return topicoService.obtenerTodos();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Topico> actualizarTopico(@PathVariable Long id, @RequestBody Topico topico) {
        return ResponseEntity.ok(topicoService.actualizarTopico(id, topico));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTopico(@PathVariable Long id) {
        topicoService.eliminarTopico(id);
        return ResponseEntity.noContent().build();
    }
}
