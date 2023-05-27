package modelo;
public class Cliente extends Pessoa{
    protected double limite_credito;

    public Cliente() {
    }

    public Cliente(double limite_credito, Endereco endereco, String nome, String login, String senha, String email, String cpf) {
        super(endereco, nome, login, senha, email, cpf);
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
        System.out.println(super.toString());
        System.out.println("LIMITE DE CREDITO: " + limite_credito);
        System.out.println("X---------------------------------------X");
        return "";
    }
    
    
}
