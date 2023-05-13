package modelo;

import modelo.Pessoa;

public class Contas{
    private int numConta;
    private String tipo;
    private Pessoa dono;
    private double saldo;
    private boolean aberta;

    public Contas() {
    }

    public Contas(int numConta, String tipo, Pessoa dono, double saldo, boolean aberta) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.aberta = aberta;
        
    }

    public int getNumConta() {
        return numConta;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    @Override
    public String toString() {
        return "Contas{" + "numConta=" + numConta + ", tipo=" + tipo + ", nome=" + dono.getNome() + ", saldo=" + saldo + ", aberta=" + aberta + '}';
    }
    
    public void deposito(double deposito){
        this.saldo = saldo + deposito;
    }
    
    public boolean saque(double saque){
        if(saque > this.saldo){
            return false;
        }
        this.saldo = saldo - saque;
        return true;
    }
    
    public void pagarMensal(double valor){
        this.saldo = saldo - valor;
    }
}
