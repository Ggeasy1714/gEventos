package gEventos.Api.Model;

public class EnderecoModel {
    private String nomeEndereco;
    private int numeroEndereco;
    private String cidadeEndereco;
    private String estado;
    private String pais;

    public EnderecoModel(String nomeEndereco, int numeroEndereco, String cidadeEndereco, String estado, String pais){
        setNomeEndereco(nomeEndereco);
        setNumeroEndereco(numeroEndereco);
        setCidadeEndereco(cidadeEndereco);
        setEstado(estado);
        setPais(pais);
    }
    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public int getNumeroEndereco() {
        return numeroEndereco;
    }

    public String getNomeEndereco() {
        return nomeEndereco;
    }

    private void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }

    private void setEstado(String estado) {
        this.estado = estado;
    }

    private void setNumeroEndereco(int numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    private void setNomeEndereco(String nomeEndereco){
        this.nomeEndereco = nomeEndereco;
    }

    private void setPais(String pais) {
        this.pais = pais;
    }
}
