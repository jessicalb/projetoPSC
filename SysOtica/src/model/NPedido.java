
package model;


import model.PedidoDAO;
import Exceção.DAOException;
import model.Pedido;
import java.util.List;
import model.Funcionario;


public class NPedido {

        private PedidoDAO dao;
        
        public NPedido(){

              dao = DAOFactory.getPedidoDAO();
       }
    
    
    public void salvar(Pedido ped) throws DAOException {
        
       if(ped.getCliente().getId()==null){
          throw new Error("Para realizar a venda, inclua ao menos um cliente."); 
       }
       
       if(ped.getProdutos().isEmpty()){
           throw new Error("Seleciona pelomenos um produto para este pedido");        
       }
        
        
       if(ped.getFormaPagamento().equals("")==true){
            throw new Error("Informar Forma de Pagamento");   
       }
       
       if(ped.getFormaPagamento()==null){
             throw new Error("O Campo Forma de Pagamento não pode ser vazio");   
       }
       
       if(ped.getValorTotal().equals("")==true){
            throw new Error("Informar valor total");   
       }
       
       if(ped.getValorTotal()==null){
            throw new Error("O Campo valor total não pode ser vazio");   
       }
       
       if(ped.getValorTotal() <= 0){
           throw new Error("O valor total não pode ser menor ou igual a zero"); 
       
       }
        
        
        dao.inserir(ped);
        
    }

    
    public void remover(Pedido ped) throws DAOException {
        
         if(ped.getId()<=0 ){
            throw new Error("O codigo do pedido deve ser superior a zero ");
            
        }
         
        
         dao.excluir(ped);
    }

    
    public void atualizar(Pedido ped) throws DAOException {

        if(ped.getId() <= 0){
            
            throw new Error("Erro ao encontrar pedido");   
       }
       
       if(ped.getId()==null){
            throw new Error("O Campo Id não pode ser vazio");   
       }
 
       if(ped.getProdutos().isEmpty()){
           throw new Error("Seleciona pelomenos um produto para este pedido");        
       }
       
       if(ped.getFormaPagamento().equals("")==true){
             throw new Error("Informar Forma de Pagamento");   
       }
       
       if(ped.getFormaPagamento()==null){
            throw new Error("O Campo Forma de Pagamento não pode ser vazio");   
       }
       
       if(ped.getValorTotal().equals("")==true){
            throw new Error("Informar valor total");   
       }
       
       if(ped.getValorTotal()==null){
            throw new Error("O Campo valor total não pode ser vazio");   
       }
       
          if(ped.getValorTotal() <= 0){
           throw new Error("O valor total não pode ser menor ou igual a zero"); 
       
       }
       
       
       dao.alterar(ped);
            
    }

   
    public List<Pedido> listar() throws DAOException {
        
        return dao.listar();
    }

    
    public Pedido consultarPorId(int id) throws DAOException {
         Pedido p = null;
        
          try{
                p = dao.buscarPorChave(id);
          
               
          } catch(Exception e){
                      throw new Error("Erro ao buscar pedido por id" + e.getMessage()); 
                     }
           return p;
        
    }
    
    public List<Pedido> consultarPorNomePedido(String nome) throws DAOException{
      
       
        
        return dao.buscarPorNomePedido(nome);
        
        
    }
    
}
