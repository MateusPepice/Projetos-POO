package controle;

import visao.TelaPrincipal;

/**
 *
 * @author Andre
 */
public class ControlePrincipal {
    private ControleLogin controleLogin;
    private ControleAluno controleAluno;
    private TelaPrincipal telaPrincipal;

    public ControlePrincipal() {
        this.controleLogin = new ControleLogin(this);
        this.controleAluno = new ControleAluno();
    }

    public ControleLogin getControleLogin() {
        return controleLogin;
    }

    public ControleAluno getControleAluno() {
        return controleAluno;
    }
    
    
    public void abrirTelaPrincipal(){
        telaPrincipal = new TelaPrincipal(this);
        telaPrincipal.setVisible(true);
    }
    
    
}
