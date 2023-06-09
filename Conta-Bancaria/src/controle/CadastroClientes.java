package controle;

import java.util.ArrayList;
import controle.CadastroPessoa;
import modelo.Contas;
import modelo.Pessoa;
import util.Input;

public class CadastroClientes {
    private static ArrayList<Contas> listaContas = new ArrayList<>();
    
   
    // Método para setar dados de um novo cadastro
    public static boolean setarDados(Contas conta, boolean novo_cadastro){
       
        if(novo_cadastro){
            Pessoa nova_pessoa = CadastroPessoa.pesquisarPessoa();
            if(nova_pessoa == null){
                return false;
            }
            conta.setDono(nova_pessoa);
        }
        System.out.println("Número da conta:");
        conta.setNumConta(Input.nextInt());
        System.out.println("Tipo...........:");
        conta.setTipo(Input.nextLine());
        conta.setAberta(true);
        return true;
    }
    
    // Método que chama o método de setarDados para, assim, cadastrar.
    public static void abrirConta(){
        Contas conta = new Contas();
        boolean abriu = setarDados(conta, true);
        
        if(abriu == false){
            System.out.println("Não foi possível abrir sua conta!");
            return;
        }
        
        if("CC".equals(conta.getTipo())){
            conta.setSaldo(100);
        } else if("CP".equals(conta.getTipo())){
            conta.setSaldo(200);
        }
        
        
        listaContas.add(conta);
        System.out.println("\nCadastro realizado!");
    }
    
    // Método utilizável em: fecharConta, editar, depositar, sacar, pagarMensal, listarContas e editarConta
    public static Contas pesquisar(){
        System.out.println("Informe o número da conta:");
        int numero = Input.nextInt();
        
        for (Contas listaConta : listaContas) {
            if(listaConta.getNumConta() == numero){
                return listaConta;
            }
        }
        System.out.println("\nNúmero de conta não encontrada!");
        return null;
    }
    
    /* Só pode ser fechada caso: 
        - exista a conta na lista
        - o saldo esteja zerado
    */
    public static void fecharConta(){
        Contas conta = pesquisar();
        
        if (conta == null){
            System.out.println("\nConta não encontrada!");
            return;
        }
        if(conta.getSaldo() > 0){
            System.out.println("\nNão é possível fechar esta conta!");
            System.out.println("Ainda existe um saldo positivo na conta!");
            return;
        }else if(conta.getSaldo() < 0){
            System.out.println("\nNão é possível fechar esta conta!");
            System.out.println("Ainda existe um saldo negativo na conta!");
            return;
        }else{
            listaContas.remove(conta);
            System.out.println("\nConta fechada.");
        }
    }

    public static void mostrar(){
        Contas conta = pesquisar();
        conta.toString();
    }
    
    
    public static void depositar(){
        Contas conta = pesquisar();
        
        if(conta == null){
            return;
        }
        System.out.println("Deposito:");
        double valor = Input.nextDouble();
        
        conta.deposito(valor);

        listaContas.add(listaContas.indexOf(conta), conta);
        listaContas.remove(conta);
    }
    
    // Só podemos sacar caso haja saldo suficiente na conta
    public static void sacar(){
        Contas conta = pesquisar();
        
        if(conta == null){
            return;
        }
        System.out.println("Saque:");
        double valor = Input.nextDouble();
        
        boolean saque_realizado = conta.saque(valor);
        
        if(saque_realizado){
            listaContas.add(listaContas.indexOf(conta), conta);
            listaContas.remove(conta);
        }else{
            System.out.println("\nSaldo insuficiente!");
            return;
        }

    }
    
    // Taxa de manutenção do cartão
    
    public static void pagarMensal(){
        Contas conta = pesquisar();
        if(conta == null){
            return;
        }
        if(conta.getTipo().equals("CC")){
            conta.pagarMensal(25);
            listaContas.add(listaContas.indexOf(conta), conta);
            listaContas.remove(conta);
            return;
        }else{
            System.out.println("\nNão há cobrança de manutenção em conta poupança");
            return;
        }

    }
    
    // Só podemos editar partes especificas da conta
    public static void editarConta(){
        Contas conta = pesquisar();
        
        if(conta == null){
            return;
        }
        setarDados(conta, false);
        listaContas.add(listaContas.indexOf(conta), conta);
    }
    
    // Todas as contas cadastradas na lista
    public static void listarContas(){
        if(listaContas == null || listaContas.isEmpty()){
            System.out.println("\nNão há registros cadastrados!");
            return;
        }
        
        for (Contas listaConta : listaContas) {
            System.out.println(listaConta);
        }
    }
    
    // Método especifico para ser utilizado na classe CadastroPessoa
    // Verifica se a pessoa que está sendo excluida tem uma conta em aberto
    public static boolean pesquisarExistencia(Pessoa pessoa){
        
        for (Contas listaConta : listaContas) {
            if(listaConta.getDono().equals(pessoa)){
                return true;
            }
        }
        
        return false;
    }
}