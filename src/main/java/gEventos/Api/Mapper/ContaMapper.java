package gEventos.Api.Mapper;

import gEventos.Api.DTO.ClientDTO;
import gEventos.Api.DTO.ClienteRequest;
import gEventos.Api.Model.ClienteModel;

public class ContaMapper {
    // volta: Entity -> DTO (usado no Controller)
    public static ClientDTO paraDTO(ClienteModel cliente) {
        return new ClientDTO(
                cliente.getNome(),
                cliente.getIdade()
        );
    }
    // ida: ContaRequest -> Entity (usado no Service)
    public static ClienteModel paraEntity(ClienteRequest r) {
        return new ClienteModel(r.nome(), r.idade());
    }
}
