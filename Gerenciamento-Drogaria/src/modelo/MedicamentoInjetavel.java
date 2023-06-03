
package modelo;

public class MedicamentoInjetavel extends Medicamento{
    private String funcionarioResponsavel;
    private String cpfPaciente;

    public MedicamentoInjetavel() {
    }

    public String getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(String funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    @Override
    public String toString() {
        return "MedicamentoInjetavel{"+super.toString() + "funcionarioResponsavel=" + funcionarioResponsavel + ", cpfPaciente=" + cpfPaciente + '}';
    }
    
    
}
