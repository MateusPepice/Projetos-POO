package controle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Aluno;
import visao.ListaAlunos;
import visao.TelaCadastroAluno;

public class ControleAluno {

    private TelaCadastroAluno telaCadastro;
    private ListaAlunos telaListagem;
    private List<Aluno> alunos = new ArrayList();
    private Aluno alunoSelecionado;
    
    public ControleAluno() {
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public TelaCadastroAluno getTelaCadastro() {
        return telaCadastro;
    }

    public ListaAlunos getTelaListagem() {
        return telaListagem;
    }
    
    public void editarAluno(String nome, String cpf, String email,
            String genero, String curso, LocalDate dataNascimento){
        if(alunoSelecionado != null){
            alunoSelecionado.setNome(nome);
            alunoSelecionado.setCpf(cpf);
            alunoSelecionado.setEmail(email);
            alunoSelecionado.setCurso(curso);
            alunoSelecionado.setGenero(genero);
            alunoSelecionado.setDataNascimento(dataNascimento);
        }
    }

    public void adicionarAluno(String nome, String cpf, String email,
            String genero, String curso, LocalDate dataNascimento) {

        Aluno al = new Aluno(nome, cpf, email, genero, curso, dataNascimento);
        alunos.add(al);
    }

    public Aluno getAlunoSelecionado(int index) {
        if (index >= 0 && index < alunos.size()) {
            return alunos.get(index);
        }
        return null;
    }
    
    public void abrirTelaListaAlunos(){
        telaListagem = new ListaAlunos(this);
        telaListagem.setVisible(true);
    }

     public void abrirTelaCadastro(){
         telaCadastro = new TelaCadastroAluno(this);
         telaCadastro.setVisible(true);
     }
     
    public void abrirTelaCadastroParaEdicao(int index) {
        alunoSelecionado = getAlunoSelecionado(index);
        if (alunoSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Falha ao Editar Aluno!\nAluno não encontrado!", "Falha ao Editar", JOptionPane.ERROR_MESSAGE);
        }
        telaCadastro = new TelaCadastroAluno(this, telaListagem,
                alunoSelecionado.getNome(),
                alunoSelecionado.getCpf(),
                alunoSelecionado.getEmail(),
                alunoSelecionado.getCurso(),
                alunoSelecionado.getGenero(),
                alunoSelecionado.getDataNascimento()
        );
        telaCadastro.setVisible(true);
    }

    public void removerAluno(int index) {
        alunos.remove(index);
    }
}
