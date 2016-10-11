package basica;

import javax.persistence.Column;
import javax.persistence.Entity;
import org.hibernate.annotations.NaturalId;

@Entity
public class Funcionario extends Usuario {

   
    
    private String Cargo;
   
    //@NaturalId  //indica que o login deve ser unico, não podendo haver outro usuario com o mesmo.
    private String login;
    @Column(length = 10, nullable = false)
    private String senha;
    
    
   
    public Funcionario(){
    super();
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    

   
    
    
  
    
    
}
