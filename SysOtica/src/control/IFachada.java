
package control;

import model.Categoria;
import model.Cliente;
import model.Fornecedor;
import model.Funcionario;
import model.Pedido;
import model.Produto;
import model.Receita;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Joanna
 */
public interface IFachada {
    
    //Categoria
    public void salvarCategoria(Categoria cat) throws Exception;
    public void removerCategoria(Integer id) throws Exception;
    public void atualizarCategoria(Categoria cat) throws Exception;
    public void consultarCategoriaId(Categoria cat,Integer id) throws Exception;
    public List<Categoria> listarCategoria()throws Exception;
   
    //Cliente
    public void salvarCliente(Cliente cli)throws Exception;
    public void removerCliente(Cliente cli)throws Exception;
    public void atualizarCliente(Cliente cli)throws Exception;
    public void consultarCliente(Cliente cli,Serializable id)throws Exception;
    public List<Cliente> listarCliente()throws Exception;
    
    //Fornecedor
    public void salvarFornecedor(Fornecedor f)throws Exception;
    public void removerFornecedor(Fornecedor f)throws Exception;
    public void atualizarFornecedor(Fornecedor f)throws Exception;
    public void consultarFornecedor(Fornecedor f,Integer id)throws Exception;
    public List<Fornecedor> listarFornecedor()throws Exception;
    
    //Funcionario
    public void salvarFuncionario(Funcionario f)throws Exception;
    public void removerFuncionario(Funcionario f)throws Exception;
    public void atualizarFuncioanrio(Funcionario f)throws Exception;
    public void consultarFuncionario(Funcionario f,Serializable id)throws Exception;
    public List<Funcionario> listarFuncionario()throws Exception;
    
    //Pedido
    public void salvarPedido(Pedido ped)throws Exception;
    public void removerPedido(Pedido ped)throws Exception;
    public void atualizarPedido(Pedido ped)throws Exception;
    public void consultarPedido(Pedido ped,Integer id)throws Exception;
    public List<Pedido> listarPedido()throws Exception;
    
    //Produto
    public void salvarProduto(Produto prod)throws Exception;
    public void removerProduto(Produto prod)throws Exception;
    public void atualizarProduto(Produto prod)throws Exception;
    public void consultarProduto(Produto prod,Integer id)throws Exception;
    public List<Produto> listarProduto()throws Exception;
    
    //Receita
    public void salvarReceita(Receita rec)throws Exception;
    
}
