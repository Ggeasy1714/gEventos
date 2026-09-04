package Api.DTO;

public class ClientDto {
    private String name;
    private int age;
    private EnderecoDTO endereco;

    public ClientDto(String name, int age, EnderecoDTO endereco){
        setName(name);
        setAge(age);
        this.endereco = endereco;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

}
