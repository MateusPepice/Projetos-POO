
package modelo;

public class Cliente extends Pessoa{
    private String email;

    public Cliente() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +super.toString()+ "email=" + email + '}';
    }
    
    
    
}
