
package negocio;

import DAO.IprodutoDAO;
import DAO.ProdutoDAO;
import Exceção.DAOException;
import basica.Produto;
import java.util.List;


public class NProduto implements IprodutoDAO{

    @Override
    public void salvar(Produto p) throws DAOException {
         if(p.getId().equals("")==true){
 throw new Error("Informar Id");   
       }
       
       if(p.getId()==null){
 throw new Error("O Campo Id não pode ser vazio");   
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
       
       if(p.getQtdEstoque().equals("")==true){
 throw new Error("Informar quantidade estoque");   
       }
       
       if(p.getQtdEstoque()==null){
 throw new Error("O Campo quantidade estoque não pode ser vazio");   
       }
       
       if(p.getEstoqueMinimo().equals("")==true){
 throw new Error("Informar estoque minimo");   
       }
       
       if(p.getEstoqueMinimo()==null){
 throw new Error("O Campo estoque minimo não pode ser vazio");   
       }
       
       ProdutoDAO dao = new ProdutoDAO();
       dao.salvar(p);
        
       
        
    }

    @Override
    public void remover(Produto p) throws DAOException {
         if(p.getId()<=0 ){
            throw new Error("O codigo do produto deve ser superior a zero ");
    }
         ProdutoDAO dao = new ProdutoDAO();
         dao.remover(p);
    }

    @Override
    public void atualizar(Produto p) throws DAOException {
 if(p.getId().equals("")==true){
 throw new Error("Informar Id");   
       }
       
       if(p.getId()==null){
 throw new Error("O Campo Id não pode ser vazio");   
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
       
       if(p.getQtdEstoque().equals("")==true){
 throw new Error("Informar quantidade estoque");   
       }
       
       if(p.getQtdEstoque()==null){
 throw new Error("O Campo quantidade estoque não pode ser vazio");   
       }
       
       if(p.getEstoqueMinimo().equals("")==true){
 throw new Error("Informar estoque minimo");   
       }
       
       if(p.getEstoqueMinimo()==null){
 throw new Error("O Campo estoque minimo não pode ser vazio");   
       }
       ProdutoDAO dao = new ProdutoDAO();
       dao.atualizar(p);
           }

    @Override
    public List<Produto> listar() throws DAOException {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.listar();
    }

    @Override
    public Produto consultarPorId(Integer id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
