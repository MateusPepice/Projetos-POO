
package modelo;

public class MedicamentoControlado extends Medicamento{
    private String crmMedico;
    private String cpfPaciente;

    public MedicamentoControlado() {
    }

    public String getCrmMedico() {
        return crmMedico;
    }

    public void setCrmMedico(String crmMedico) {
        this.crmMedico = crmMedico;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }
    
    
}
