package Api.Model;

public class ClienteModel {
    private String nome;
    private int idade;

    public ClienteModel(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

}
