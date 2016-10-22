
package model;


import control.ProdutoDAO;
import Exceção.DAOException;
import model.Produto;
import java.util.List;
import model.Funcionario;


public class NProduto {

      private ProdutoDAO dao;
      
      public NProduto(){

          dao = DAOFactory.getProdutoDAO();
          
        }
     
    
    
    public void salvar(Produto p) throws DAOException {
        
    
       
        if(p.getDescricao().trim().equals("")==true){
            throw new Error("Informar Descrição");   
       }
       
       if(p.getDescricao()==null){
         throw new Error("O Campo descrição não pode ser vazio");   
       }
       
       if(p.getMarca().trim().equals("")==true){
            throw new Error("Informar Marca");   
       }
       
       if(p.getMarca()==null){
             throw new Error("O Campo marca não pode ser vazio");   
       }
       
       if(p.getValorUnidade().equals("")==true){
            throw new Error("Informar Valor Unidade");   
       }
       
       if(p.getValorUnidade()==null){
            throw new Error("O Campo valor unidade não pode ser vazio");   
       }
       
       if(p.getValorUnidade()<= 0)
       {
           throw new Error("O Campo valor unidade não pode ser igual ou menor que ZERO");   
       }
       
       if(p.getQtdEstoque().equals("")==true){
            throw new Error("Informar quantidade estoque");   
       }
       
       if(p.getQtdEstoque()==null){
            throw new Error("O Campo quantidade estoque não pode ser vazio");   
       }
       
          if(p.getQtdEstoque() <= 0){
            throw new Error("O Campo quantidade estoque não pode ser menor ou igual a ZERO");   
       }
       
       
       if(p.getEstoqueMinimo().equals("")==true){
           throw new Error("Informar estoque minimo");   
       }
       
       if(p.getEstoqueMinimo()==null){
            throw new Error("O Campo estoque minimo não pode ser vazio");   
       }
       
       if(p.getEstoqueMinimo() <= 0){
            throw new Error("O Campo  estoque  minimo não pode ser menor ou igual a ZERO");  
       }
       
       
       dao.inserir(p);
        
       
        
    }

    
    public void remover(Produto p) throws DAOException {
         if(p.getId()<=0 ){
            throw new Error("O codigo do produto deve ser superior a zero ");
    }
         
         dao.excluir(p);
    }

   
    public void atualizar(Produto p) throws DAOException {
        
        if(p.getId() <0 ){
           throw new Error ("produto não encontrado");
        }
        
        
       if(p.getDescricao().trim().equals("")==true){
            throw new Error("Informar Descrição");   
       }
       
       if(p.getDescricao()==null){
         throw new Error("O Campo descrição não pode ser vazio");   
       }
       
       if(p.getMarca().trim().equals("")==true){
            throw new Error("Informar Marca");   
       }
       
       if(p.getMarca()==null){
             throw new Error("O Campo marca não pode ser vazio");   
       }
       
       if(p.getValorUnidade().equals("")==true){
            throw new Error("Informar Valor Unidade");   
       }
       
       if(p.getValorUnidade()==null){
            throw new Error("O Campo valor unidade não pode ser vazio");   
       }
       
       if(p.getValorUnidade()<= 0)
       {
           throw new Error("O Campo valor unidade não pode ser igual ou menor que ZERO");   
       }
       
       if(p.getQtdEstoque().equals("")==true){
            throw new Error("Informar quantidade estoque");   
       }
       
       if(p.getQtdEstoque()==null){
            throw new Error("O Campo quantidade estoque não pode ser vazio");   
       }
       
          if(p.getQtdEstoque() <= 0){
            throw new Error("O Campo quantidade estoque não pode ser menor ou igual a ZERO");   
       }
       
       
       if(p.getEstoqueMinimo().equals("")==true){
           throw new Error("Informar estoque minimo");   
       }
       
       if(p.getEstoqueMinimo()==null){
            throw new Error("O Campo estoque minimo não pode ser vazio");   
       }
       
       if(p.getEstoqueMinimo() <= 0){
            throw new Error("O Campo  estoque  minimo não pode ser menor ou igual a ZERO");  
       }
       
       
         dao.alterar(p);
      
      
       }

    
    public List<Produto> listar() throws DAOException {
        
        return dao.listar();
    }

   
    public Produto consultarPorId(int id) throws DAOException {
         Produto p = null;
        
          try{
                p = dao.buscarPorChave(id);
          
               
          } catch(Exception e){
                      throw new Error("Erro ao buscar produto por id" + e.getMessage()); 
                     }
           return p;
        
        
        
    }
    
    public List<Produto> consultarPorNomeProduto(String nome) throws DAOException{
      
       
        
        return dao.buscarPorNomeProduto(nome);
        
        
    }
    
}
