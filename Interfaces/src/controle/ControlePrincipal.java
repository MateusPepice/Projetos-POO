package controle;

import visao.TelaPrincipal;

public class ControlePrincipal {
    private ControleLogin controleLogin;
    private ControleAluno controleAluno;
    private ControleDocente controleDocente;
    private TelaPrincipal telaPrincipal;

    public ControlePrincipal() {
        this.controleLogin = new ControleLogin(this);
        this.controleAluno = new ControleAluno();
        this.controleDocente = new ControleDocente();
    }

    public ControleLogin getControleLogin() {
        return controleLogin;
    }

    public ControleAluno getControleAluno() {
        return controleAluno;
    }
    
    public ControleDocente getControleDocente() {
        return controleDocente;
    }
    
    public void abrirTelaPrincipal(){
        telaPrincipal = new TelaPrincipal(this);
        telaPrincipal.setVisible(true);
    }
    
    
}
