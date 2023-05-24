package modelo;
public class Cliente extends Pessoa{
    private double limite_credito;

    public Cliente() {
    }

    public Cliente(double limite_credito, String nome, String login, String senha, String email, String cpf, Endereco endereco) {
        super(nome, login, senha, email, cpf, endereco);
        this.limite_credito = limite_credito;
    }

    public double getLimite_credito() {
        return limite_credito;
    }

    public void setLimite_credito(double limite_credito) {
        this.limite_credito = limite_credito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "limite_credito=" + limite_credito + '}';
    }
    
}
