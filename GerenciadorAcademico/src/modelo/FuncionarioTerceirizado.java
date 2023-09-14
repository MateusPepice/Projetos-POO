
package modelo;


public class FuncionarioTerceirizado extends Funcionario{
    private String empresaTerceirizada;

    public FuncionarioTerceirizado() {
    }

    public String getEmpresaTerceirizada() {
        return empresaTerceirizada;
    }

    public void setEmpresaTerceirizada(String empresaTerceirizada) {
        this.empresaTerceirizada = empresaTerceirizada;
    }

    @Override
    public String getInformacoes() {
        return super.getInformacoes() + " | Empresa Terceirizada: " + empresaTerceirizada;
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println(getInformacoes());
    }
}
