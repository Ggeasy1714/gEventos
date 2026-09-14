package Api.Model;

public class IngressoModel {
    private String tipoIngresso;
    private int valorIngresso;
    private String codIngresso;
    private EnderecoModel enderecoEvento;
    private ClienteModel cliente;

    public IngressoModel(String tipoIngresso, int valorIngresso, String codIngresso, EnderecoModel enderecoDTO, ClienteModel cliente){
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

    public EnderecoModel getEnderecoEvento() {
        return enderecoEvento;
    }

    public String getCodIngresso() {
        return codIngresso;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    private void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    private void setCodIngresso(String codIngresso) {
        this.codIngresso = codIngresso;
    }

    private void setEnderecoEvento(EnderecoModel enderecoEvento) {
        this.enderecoEvento = enderecoEvento;
    }

    private void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    private void setValorIngresso(int valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
}

