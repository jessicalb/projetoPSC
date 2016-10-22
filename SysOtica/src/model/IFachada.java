
package model;

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
    public void removerCategoria(Categoria cat) throws Exception;
    public void atualizarCategoria(Categoria cat) throws Exception;
    public void consultarCategoriaId(int id) throws Exception;
    public List<Categoria> listarCategoria()throws Exception;
     public List<Categoria> consultarPorNomeCategoria(String nome)throws Exception;
   
    //Cliente
    public void salvarCliente(Cliente cli)throws Exception;
    public void removerCliente(Cliente cli)throws Exception;
    public void atualizarCliente(Cliente cli)throws Exception;
    public void consultarCliente(int id)throws Exception;
    public List<Cliente> listarCliente()throws Exception;
    public List<Cliente> consultarPorNomeCliente(String nome)throws Exception;
    
    //Fornecedor
    public void salvarFornecedor(Fornecedor f)throws Exception;
    public void removerFornecedor(Fornecedor f)throws Exception;
    public void atualizarFornecedor(Fornecedor f)throws Exception;
    public void consultarFornecedor(int id)throws Exception;
    public List<Fornecedor> listarFornecedor()throws Exception;
    public List<Fornecedor> consultarPorNomeFornecedor(String nome)throws Exception;
    
    //Funcionario
    public void salvarFuncionario(Funcionario f)throws Exception;
    public void removerFuncionario(Funcionario f)throws Exception;
    public void atualizarFuncioanrio(Funcionario f)throws Exception;
    public void consultarFuncionario(int id)throws Exception;
    public List<Funcionario> listarFuncionario()throws Exception;
    public List<Funcionario> consultarPorNome(String nome)throws Exception;
    
    //Pedido
    public void salvarPedido(Pedido ped)throws Exception;
    public void removerPedido(Pedido ped)throws Exception;
    public void atualizarPedido(Pedido ped)throws Exception;
    public void consultarPedido(int id)throws Exception;
    public List<Pedido> listarPedido()throws Exception;
     public List<Pedido> consultarPorNomePedido(String nome)throws Exception;
    
    //Produto
    public void salvarProduto(Produto prod)throws Exception;
    public void removerProduto(Produto prod)throws Exception;
    public void atualizarProduto(Produto prod)throws Exception;
    public void consultarProduto(int id)throws Exception;
    public List<Produto> listarProduto()throws Exception;
    public List<Produto> consultarPorNomeProduto(String nome)throws Exception;
    
    //Receita
    public void salvarReceita(Receita rec)throws Exception;
    public void removerReceita(Receita rec)throws Exception;
    public void atualizarReceita(Receita rec) throws Exception;
    public void consultarReceita(int id) throws Exception;
    public List<Receita> listarReceita() throws Exception;
    public List<Funcionario> consultarPorNomeReceita(String nome)throws Exception;
}
