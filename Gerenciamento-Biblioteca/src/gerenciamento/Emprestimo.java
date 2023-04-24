package gerenciamento;

import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataDeEmprestimo;
    private LocalDate dataPrevistaDeDevolucao;
    private LocalDate dataDeEntregaReal;
    private String situacao;
    private Usuario usuario;
    private Livro livro;
    private int codigoEmprestimo;

    public Emprestimo() {
    }

    public Emprestimo(LocalDate dataDeEmprestimo, LocalDate dataPrevistaDeDevolucao, LocalDate dataDeEntregaReal, String situacao, Usuario usuario, Livro livro, int codigoEmprestimo) {
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
        this.dataDeEntregaReal = dataDeEntregaReal;
        this.situacao = situacao;
        this.usuario = usuario;
        this.livro = livro;
        this.codigoEmprestimo = codigoEmprestimo;
    }

    public LocalDate getDataDeEmprestimo() {
        return dataDeEmprestimo;
    }

    public void setDataDeEmprestimo(LocalDate dataDeEmprestimo) {
        this.dataDeEmprestimo = dataDeEmprestimo;
        setDataPrevistaDeDevolucao(dataDeEmprestimo);
        setSituacao("EMPRESTADO");
        
    }

    public LocalDate getDataPrevistaDeDevolucao() {
        return dataPrevistaDeDevolucao;
    }

    public void setDataPrevistaDeDevolucao(LocalDate dataPrevistaDeDevolucao) {
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao.plusDays(10);
    }

    public LocalDate getDataDeEntregaReal() {
        return dataDeEntregaReal;
    }

    public void setDataDeEntregaReal(LocalDate dataDeEntregaReal) {
        this.dataDeEntregaReal = dataDeEntregaReal;
        setSituacao("DEVOLVIDA");
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getCodigoEmprestimo() {
        return codigoEmprestimo;
    }

    public void setCodigoEmprestimo(int codigoEmprestimo) {
        this.codigoEmprestimo = codigoEmprestimo;
    }
    
}
