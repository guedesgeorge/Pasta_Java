package app.entities;

public class Project {
    private String nome;
    private Double preco;

    // Construtor
    public Project(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método main
    public static void main(String[] args) {
        // Crie uma instância da classe Project
        Project projeto = new Project("Meu Projeto", 100.0);

        // Acesse os atributos da instância e imprima
        System.out.println("Nome do projeto: " + projeto.nome);
        System.out.println("Preço do projeto: " + projeto.preco);
    }
}




