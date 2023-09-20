
package modelo;


public class Aluno extends Pessoa{
    protected String ra;

    public Aluno() {
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String getInformacoes() {
        return super.getInformacoes() + " | RA: " + ra; 
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(getInformacoes());
    }

    @Override
    public Object chavePrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object chaveSecundaria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
