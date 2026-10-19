package gEventos.Api.Mapper;

import gEventos.Api.DTO.ClientDTO;
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
//    public static ClienteModel paraEntity(ContaRequest r) {
//        return new Conta(r.titular(), r.saldo());
//    }
}
