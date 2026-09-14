package gEventos.Api.Model;


public class EventoModel {
    private String nomeEvento;
    private int capacidadeTotal;
    private String tipoEvento;
    private String dataEvento;
    private EnderecoModel enderecoEvento;

    public EventoModel(String nomeEvento, int capacidadeTotal, String tipoEvento, String dataEvento, EnderecoModel enderecoEvento){
        setNomeEvento(nomeEvento);
        setCapacidadeTotal(capacidadeTotal);
        setTipoEvento(tipoEvento);
        setDataEvento(dataEvento);
        setEnderecoEvento(enderecoEvento);
    }

    public EnderecoModel getEnderecoEvento() {
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

    private void setEnderecoEvento(EnderecoModel enderecoEvento) {
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
