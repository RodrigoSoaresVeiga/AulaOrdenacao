package pacote;

public class produto {
    int codigo;
    String nome;
    double valor;

    public produto(int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("Código: %d | Nome: %s | Valor: R$ %.2f", codigo, nome, valor);
    }
}
