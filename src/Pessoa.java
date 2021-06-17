public class Pessoa {
    
    private String nome;
    private String fone;
    private int idade;

    public void Pessoa(){  
        // Método construtor padrão
    }

    public void Pessoa(String nome, String fone, int idade){
        
        this.setNome(nome);
        this.setFone(fone);
        this.setIdade(idade);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getFone(){
        return this.fone;
    }

    public void setFone(String fone){
        this.fone = fone;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
