package basica;

import javax.persistence.Entity;

@Entity
public class Atendente extends Usuario {

   
   
    public Atendente(){}
    
    
    
    

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Atendente(String senha, String login, String funcao){
    
     this.setLogin(login);
     this.setSenha(senha);
     this.setFuncao(funcao);
    
    
    }
    
    
    public void realizaLogin(String senha, String login,String funcao){
     
        this.setSenha(senha);
        this.setLogin(login);
        this.setFuncao(funcao);
    }
    
    
    
}
