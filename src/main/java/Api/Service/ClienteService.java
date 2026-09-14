package Api.Service;

import Api.Model.ClienteModel;
import Api.Model.EnderecoModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequestMapping("/c")
public class ClientService {

    private final EnderecoModel enderecoModel = new EnderecoModel("Rua da Facada", 12, "Recife", "Pernambuco", "Brasil");
    private final List<ClienteModel> listaClientes = List.of(
            new ClienteModel("Garbagoob", 16, enderecoModel),
            new ClienteModel("AutroHungaro", 90, enderecoModel)
    );

    @GetMapping("/{idade}")
    public ClienteModel buscaPorIdade(@PathVariable String idade){
        return listaClientes.stream()
                .filter(clienteNaLista  -> clienteNaLista.getIdade() == Integer.parseInt(idade))
                .findFirst()
                .orElseThrow(() -> new ArithmeticException(idade));
    }
}
