package Api.Controller;

import Api.Model.ClienteModel;
import Api.Service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @GetMapping("/{nome}")
    public ClienteModel buscar(@PathVariable String nome){
        return clienteService.buscaPorIdade(nome);
    }

    @GetMapping("/")
    public List<ClienteModel> getAll(){
        return clienteService.getAll();
    }

    @PostMapping("/add/{nome}/{idade}")
    public void adicionarCliente(@PathVariable String nome, int idade){
        clienteService.adicionarCliente(nome, idade);
    }
}
