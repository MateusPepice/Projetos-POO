
package modelo;


public class MatriculaDisciplina implements IExibirInformacoes{
    private int ano;
    private int semestre;
    private double mediaFinal;
    private int percentualFrequencia;
    private String situacao;
    private Aluno aluno;
    private Disciplina disciplina;

    public MatriculaDisciplina() {
        aluno = new Aluno();
        disciplina = new Disciplina();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public int getPercentualFrequencia() {
        return percentualFrequencia;
    }

    public void setPercentualFrequencia(int percentualFrequencia) {
        this.percentualFrequencia = percentualFrequencia;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void atualizarSituacao(){
        if(mediaFinal == 0 && percentualFrequencia == 0){
            situacao = "Em andamento";
        } else if(percentualFrequencia >= 0.75 && mediaFinal >= 6){
            situacao = "Aprovado";
        } else{
            situacao = "Reprovado";
        }
    }
    
    @Override
    public String getInformacoes() {
        return "Aluno "+aluno.getNome()+" matriculado na disciplina "+disciplina.getNome()+":"
                +"\nFrequencia: "+percentualFrequencia+"%";
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(getInformacoes());
    }
    
    
}
