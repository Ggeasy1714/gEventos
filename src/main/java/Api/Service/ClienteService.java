package Api.Service;

import Api.Model.ClienteModel;
import Api.Model.EnderecoModel;
import Api.Service.Exceptions.ContaNaoEncontrada;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

//    private final EnderecoModel enderecoModel = new EnderecoModel("Rua da Facada", 12, "Recife", "Pernambuco", "Brasil");
//    private final List<ClienteModel> listaClientes = List.of(
//            new ClienteModel("Garbagoob", 16L),
//            new ClienteModel("AutroHungaro", 90L)
//    );
//
    private List<ClienteModel> listaDeClientes = new ArrayList<>();

    public List<ClienteModel> getAll(){
        return listaDeClientes;
    }

    public ClienteModel buscaPorIdade(String nome){
        return listaDeClientes.stream()
                .filter(c  -> c.getNome().equals(nome))
                .findFirst()
                .orElseThrow(() -> new ContaNaoEncontrada("A conta não está aqui irmão"));
    }

    public void adicionarCliente(String nome, int idade){
        listaDeClientes.add(new ClienteModel(nome, idade));
    }

}
