package gEventos.Api.Service;

import gEventos.Api.Model.ClienteModel;
import gEventos.Api.Service.Exceptions.ContaNaoEncontrada;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

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
