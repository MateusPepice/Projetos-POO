package controle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Docente;
import visao.ListaDocentes;
import visao.TelaCadastroDocente;

public class ControleDocente {
    
    private TelaCadastroDocente telaCadastro;
    private ListaDocentes telaListagem;
    private List<Docente> docentes = new ArrayList();
    private Docente docenteSelecionado;
    
    public ControleDocente() {
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public TelaCadastroDocente getTelaCadastro() {
        return telaCadastro;
    }

    public ListaDocentes getTelaListagem() {
        return telaListagem;
    }
    
    public void editarDocente(String nome, String cpf, String email,
            String genero, String formacao, LocalDate dataNascimento){
        if(docenteSelecionado != null){
            docenteSelecionado.setNome(nome);
            docenteSelecionado.setCpf(cpf);
            docenteSelecionado.setEmail(email);
            docenteSelecionado.setFormacao(formacao);
            docenteSelecionado.setGenero(genero);
            docenteSelecionado.setDataNascimento(dataNascimento);
        }
    }

    public void adicionarDocente(String nome, String cpf, String email,
            String genero, String formacao, LocalDate dataNascimento) {

        Docente al = new Docente(nome, cpf, email, genero, formacao, dataNascimento);
        docentes.add(al);
    }

    public Docente getDocenteSelecionado(int index) {
        if (index >= 0 && index < docentes.size()) {
            return docentes.get(index);
        }
        return null;
    }
    
    public void abrirTelaListaDocentes(){
        telaListagem = new ListaDocentes(this);
        telaListagem.setVisible(true);
    }

     public void abrirTelaCadastro(){
         telaCadastro = new TelaCadastroDocente(this);
         telaCadastro.setVisible(true);
     }
     
    public void abrirTelaCadastroParaEdicao(int index) {
        docenteSelecionado = getDocenteSelecionado(index);
        if (docenteSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Falha ao Editar Docente!\nDocente não encontrado!", "Falha ao Editar", JOptionPane.ERROR_MESSAGE);
        }
        telaCadastro = new TelaCadastroDocente(this, telaListagem,
                docenteSelecionado.getNome(),
                docenteSelecionado.getCpf(),
                docenteSelecionado.getEmail(),
                docenteSelecionado.getFormacao(),
                docenteSelecionado.getGenero(),
                docenteSelecionado.getDataNascimento()
        );
        telaCadastro.setVisible(true);
    }

    public void removerAluno(int index) {
        docentes.remove(index);
    }
}
