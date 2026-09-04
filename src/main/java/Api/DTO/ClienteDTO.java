package Api.DTO;

public class ClienteDTO {
    private String nome;
    private int Idade;
    private EnderecoDTO endereco;

    public ClienteDTO(String nome, int Idade, EnderecoDTO endereco){
        setNome(nome);
        setIdade(Idade);
        this.endereco = endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int Idade){
        this.Idade = Idade;
    }

}
