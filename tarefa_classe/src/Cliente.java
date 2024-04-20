// Definição da classe Cliente
public class Cliente {
    // Atributos
    private String nome;
    private int idade;
    private String endereco;

    // Construtor
    public Cliente(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    // Métodos

    // Método para obter o nome do cliente
    public String getNome() {
        return nome;
    }

    // Método para definir o nome do cliente
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter a idade do cliente
    public int getIdade() {
        return idade;
    }

    // Método para definir a idade do cliente
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para obter o endereço do cliente
    public String getEndereco() {
        return endereco;
    }

    // Método para definir o endereço do cliente
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método para exibir informações do cliente
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
    }

    // Método principal para testar a classe Cliente
    public static void main(String[] args) {
        // Criando um objeto Cliente
        Cliente cliente1 = new Cliente("Davi Limas", 30, "Rua A, 123");

        // Exibindo informações do cliente
        cliente1.exibirInformacoes();
    }
}
