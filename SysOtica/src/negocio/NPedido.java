
package negocio;

import DAO.IpedidoDAO;
import DAO.PedidoDAO;
import Exceção.DAOException;
import basica.Pedido;
import java.util.List;


public class NPedido implements IpedidoDAO{

    @Override
    public void salvar(Pedido ped) throws DAOException {
        
         if(ped.getId().equals("")==true){
 throw new Error("Informar Id");   
       }
       
       if(ped.getId()==null){
 throw new Error("O Campo Id não pode ser vazio");   
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
        
        PedidoDAO dao = new PedidoDAO();
        dao.salvar(ped);
        
    }

    @Override
    public void remover(Pedido ped) throws DAOException {
        
         if(ped.getId()<=0 ){
            throw new Error("O codigo do pedido deve ser superior a zero ");
            
        }
         
         PedidoDAO dao = new PedidoDAO();
         dao.remover(ped);
    }

    @Override
    public void atualizar(Pedido ped) throws DAOException {
if(ped.getId().equals("")==true){
 throw new Error("Informar Id");   
       }
       
       if(ped.getId()==null){
 throw new Error("O Campo Id não pode ser vazio");   
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
       
       PedidoDAO dao = new PedidoDAO();
       dao.atualizar(ped);
            }

    @Override
    public List<Pedido> listar() throws DAOException {
        PedidoDAO dao = new PedidoDAO();
        return dao.listar();
    }

    @Override
    public Pedido consultarPorId(Integer id) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
