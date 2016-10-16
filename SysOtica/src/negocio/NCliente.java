
package negocio;

import DAO.ClienteDAO;
import DAO.IClienteDAO;
import Exceção.DAOException;
import basica.Cliente;
import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NCliente implements IClienteDAO{

  
   
   
          //METODO PARA VALIDAR EMAIL
       //  public boolean validEmail(String email) {
   // System.out.println("Metodo de validacao de email");
   // Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"); 
   // Matcher m = p.matcher(email); 
   // if (m.find()){
   //   System.out.println("O email "+email+" e valido");
   //   return true;
   // }
   // else{
   //   System.out.println("O E-mail "+email+" é inválido");
    //  return false;
//}
//}

    @Override
    public void salvar(Cliente cli) throws DAOException {
        
         //TESTAR ESSE CODIGO
      // if(cli.getId().intValue()<=0){
        //  throw new Exception("O codigo não pode ser menor que 0");    
           
       //}
       
       if(cli.getNome().trim().equals("")==true){
 throw new Error("Informar Nome");   
       }
       
       if(cli.getNome()==null){
 throw new Error("O Campo nome não pode ser vazio");   
       }
       
       
       if(cli.getCpf().trim().equals("")==true){
          throw new Error("Informar Cpf"); 
       }
       
       if (cli.getCpf().length() != 14) {
            throw new Error("O Cpf deverá ter 14 caracteres"); 
        }
       
        if(cli.getCpf()==null){
 throw new Error("O Campo Cpf não pode ser vazio");   
       }
       
       if(cli.getTelefone().trim().equals("")==true){
          throw new Error("Informar Telefone"); 
       }
       
        if (cli.getTelefone().length() >= 12 || cli.getTelefone().length() < 10) {
            throw new Error("Tamanho do Telefone errado"); 
        }
        
        if(cli.getTelefone()==null){
 throw new Error("O Campo Telefone não pode ser vazio");  
        }
        
        
        if(cli.getEmail().trim().equals("")==true){
          throw new Error("Informar email"); 
       }
        
        if(cli.getEmail()==null){
 throw new Error("O Campo email nãopode ser vazio");
        }
        
       
         if(cli.getProfissao().trim().equals("")==true){
          throw new Error("Informar Profissão"); 
       }
         
         if(cli.getProfissao()==null){
 throw new Error("O Campo profissão não pode ser vazio");
        }
         
          if(cli.getNomemae().trim().equals("")==true){
          throw new Error("Informar Nome mãe"); 
       }
          if(cli.getNomemae()==null){
 throw new Error("O Campo nome da mãe não pode ser vazio");
        }
          
          if(cli.getNomepai().trim().equals("")==true){
          throw new Error("Informar nome Pai"); 
       }
          
          if(cli.getNomepai()==null){
 throw new Error("O Campo Nome do pai não pode ser vazio");
        }
          
          if(cli.getObservacoes().trim().equals("")==true){
          throw new Error("Informar Observações"); 
       }
        
          if(cli.getObservacoes()==null){
 throw new Error("O Campo observações não pode ser vazio");
        }
       ClienteDAO dao = new ClienteDAO();
       dao.salvar(cli);
          
       
    }

    @Override
    public void remover(Integer id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void atualizar(Cliente cli) throws DAOException {
           //TESTAR ESSE CODIGO
      // if(cli.getId().intValue()<=0){
        //  throw new Exception("O codigo não pode ser menor que 0");    
           
       //}
       
       if(cli.getNome().trim().equals("")==true){
 throw new Error("Informar Nome");   
       }
       
       if(cli.getNome()==null){
 throw new Error("O Campo nome não pode ser vazio");   
       }
       
       
       if(cli.getCpf().trim().equals("")==true){
          throw new Error("Informar Cpf"); 
       }
       
       if (cli.getCpf().length() != 14) {
            throw new Error("O Cpf deverá ter 14 caracteres"); 
        }
       
        if(cli.getCpf()==null){
 throw new Error("O Campo Cpf não pode ser vazio");   
       }
       
       if(cli.getTelefone().trim().equals("")==true){
          throw new Error("Informar Telefone"); 
       }
       
        if (cli.getTelefone().length() >= 12 || cli.getTelefone().length() < 10) {
            throw new Error("Tamanho do Telefone errado"); 
        }
        
        if(cli.getTelefone()==null){
 throw new Error("O Campo Telefone não pode ser vazio");  
        }
        
        
        if(cli.getEmail().trim().equals("")==true){
          throw new Error("Informar email"); 
       }
        
        if(cli.getEmail()==null){
 throw new Error("O Campo email nãopode ser vazio");
        }
        
       
         if(cli.getProfissao().trim().equals("")==true){
          throw new Error("Informar Profissão"); 
       }
         
         if(cli.getProfissao()==null){
 throw new Error("O Campo profissão não pode ser vazio");
        }
         
          if(cli.getNomemae().trim().equals("")==true){
          throw new Error("Informar Nome mãe"); 
       }
          if(cli.getNomemae()==null){
 throw new Error("O Campo nome da mãe não pode ser vazio");
        }
          
          if(cli.getNomepai().trim().equals("")==true){
          throw new Error("Informar nome Pai"); 
       }
          
          if(cli.getNomepai()==null){
 throw new Error("O Campo Nome do pai não pode ser vazio");
        }
          
          if(cli.getObservacoes().trim().equals("")==true){
          throw new Error("Informar Observações"); 
       }
        
          if(cli.getObservacoes()==null){
 throw new Error("O Campo observações não pode ser vazio");
        }
       ClienteDAO dao = new ClienteDAO();
       dao.atualizar(cli);
          
    }

    @Override
    public List<Cliente> listar() throws DAOException {
       ClienteDAO dao = new ClienteDAO();
       return dao.listar();
    }

    @Override
    public Cliente consultarPorId(Integer id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

   


   
    
  
          
          
          
         
   }
 
