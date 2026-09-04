package Api.DTO;


public class EventoDTO {
    private String nomeEvento;
    private int capacidadeTotal;
    private String tipoEvento;
    private String dataEvento;
    private EnderecoDTO enderecoEvento;

    public EventoDTO(String nomeEvento, int capacidadeTotal, String tipoEvento, String dataEvento, EnderecoDTO enderecoEvento){
        setNomeEvento(nomeEvento);
        setCapacidadeTotal(capacidadeTotal);
        setTipoEvento(tipoEvento);
        setDataEvento(dataEvento);
        setEnderecoEvento(enderecoEvento);
    }

    public EnderecoDTO getEnderecoEvento() {
        return enderecoEvento;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    private void setEnderecoEvento(EnderecoDTO enderecoEvento) {
        this.enderecoEvento = enderecoEvento;
    }

    private void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    private void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    private void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    private void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
}
