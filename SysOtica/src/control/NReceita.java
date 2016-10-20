/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;




/**
 *
 * @author Joanna
 */
public class NReceita {
    
    
     private ReceitaDAO dao;
     Date data = new Date();
     
     
     
     
     public NReceita(Date data) {
         this.data = data;
 
    }

    public NReceita() {
        dao = DAOFactory.getReceitaDAO();
    }
     
        
    
     
     public void salvar(Receita r) throws DAOException{
     
  
         
      if(r.getCliente().getId()== null || r.getCliente().getId() <=0){
        throw new Error("Não é possivel inserir uma receita sem cliente cadastrado");
      }
         
      if(r.getRc_nomemedico() == null || r.getRc_nomemedico().equals("")){
          throw new Error("Campo nome do médico não pode ser vazio");
      }
      
      if(r.getRc_dataEntrada()== null){
      
         throw new Error("O data de entrada da receita não pode ser nula");  
      
      }
      
      if(r.getRc_dataEntrada().after(data)){
          throw new Error("A data de entrada não pode ser superior a data atual");
      
      }
      
      //if(r.getRc_dataEntrada().before(data)){
        //  throw new Error("A data de entrada não pode ser inferior a data atual");
      
      //}
      
      if(r.getRc_dataVencimento().before(data)){
         throw new Error("A data de vencimento não pode ser inferior a data atual");
          
      } 
          
 
        if(r.getRc_dataVencimento() == data){
          throw new Error("A data de vencimento não pode ser igual a data atual");
       
        } 
        
        dao.inserir(r);
  
     }
     
      public void Alterar(Receita r) throws DAOException{
      
      if(r.getId() <= 0){
          throw new Error("Receita não cadastrada");
      }
          
     
      if(r.getCliente().getId()== null || r.getCliente().getId() <=0){
        throw new Error("Não é possivel inserir uma receita sem cliente cadastrado");
      }
         
      if(r.getRc_nomemedico() == null || r.getRc_nomemedico().equals("")){
          throw new Error("Campo nome do médico não pode ser vazio");
      }
      
      if(r.getRc_dataEntrada()== null){
      
         throw new Error("O data de entrada da receita não pode ser nula");  
      
      }
      
 
      if(r.getRc_dataVencimento().after(data)){
         throw new Error("A data de vencimento não pode ser inferior a data atual");
          
      } 
          
 
         if(r.getRc_dataVencimento() == data){
          throw new Error("A data de vencimento não pode ser igual a data atual");
       
        } 
        
        dao.alterar(r);
      
      }
      
      
       public void Excluir(Receita r) throws DAOException{
       
         if(r.getId() <= 0){
             throw new Error("Erro ao excluir, receita não encontrada");
          }
          
           dao.excluir(r);
       
       }
       
       public List<Receita> listar() throws DAOException {
       
       return dao.listar();
        
       }

    
     public Receita consultarPorId(Receita r, int id) throws DAOException {
       
        return dao.consultarPorId(r, id);
     }

     
    
}
