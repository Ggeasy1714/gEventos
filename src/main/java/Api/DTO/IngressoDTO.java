package Api.DTO;

public class IngressoDTO {
    private String tipoIngresso;
    private int valorIngresso;
    private String codIngresso;
    private EnderecoDTO enderecoEvento;
    private ClienteDTO cliente;

    public IngressoDTO(String tipoIngresso, int valorIngresso, String codIngresso, EnderecoDTO enderecoDTO, ClienteDTO cliente){
        setTipoIngresso(tipoIngresso);
        setValorIngresso(valorIngresso);
        setCodIngresso(codIngresso);
        setEnderecoEvento(enderecoDTO);
        setCliente(cliente);
    }

    public int getValorIngresso() {
        return valorIngresso;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public EnderecoDTO getEnderecoEvento() {
        return enderecoEvento;
    }

    public String getCodIngresso() {
        return codIngresso;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    private void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    private void setCodIngresso(String codIngresso) {
        this.codIngresso = codIngresso;
    }

    private void setEnderecoEvento(EnderecoDTO enderecoEvento) {
        this.enderecoEvento = enderecoEvento;
    }

    private void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    private void setValorIngresso(int valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
}

