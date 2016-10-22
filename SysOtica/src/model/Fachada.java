
package model;

import model.NFuncionario;
import model.NCategoria;
import model.NFornecedor;
import model.NCliente;
import model.IFachada;
import model.Categoria;
import model.Cliente;
import model.Fornecedor;
import model.Funcionario;
import model.Pedido;
import model.Produto;
import model.Receita;
import java.io.Serializable;
import java.util.List;


public class Fachada implements IFachada {
    //Categoria
    NCategoria ncategoria = new NCategoria();
            
    @Override
    public void salvarCategoria(Categoria cat) throws Exception {
        ncategoria.salvar(cat);
    }

    @Override
    public void removerCategoria(Categoria cat) throws Exception {
        ncategoria.remover(cat);
    }

    @Override
    public void atualizarCategoria(Categoria cat) throws Exception {
        ncategoria.atualizar(cat);
    }

    @Override
    public void consultarCategoriaId(int id) throws Exception {
       ncategoria.consultarPorId(id);
    }

    @Override
    public List<Categoria> listarCategoria() throws Exception {
        return ncategoria.listar();
    }
    
    
    //Cliente 
    NCliente ncliente = new NCliente();
    @Override
    public void salvarCliente(Cliente cli) throws Exception {
        ncliente.salvar(cli);
    }

    @Override
    public void removerCliente(Cliente cli) throws Exception {
        ncliente.remover(cli);
    }

    @Override
    public void atualizarCliente(Cliente cli) throws Exception {
        ncliente.atualizar(cli);
    }

    @Override
    public void consultarCliente(int id) throws Exception {
        ncliente.consultarPorId(id);
    }

    @Override
    public List<Cliente> listarCliente() throws Exception {
        return ncliente.listar();
    }
    
    //Fornecedor
    NFornecedor nfornecedor = new NFornecedor();
    @Override
    public void salvarFornecedor(Fornecedor f) throws Exception {
       nfornecedor.salvar(f);
    }

    @Override
    public void removerFornecedor(Fornecedor f) throws Exception {
        nfornecedor.remover(f);
    }

    @Override
    public void atualizarFornecedor(Fornecedor f) throws Exception {
        nfornecedor.atualizar(f);
    }

    @Override
    public void consultarFornecedor(int id) throws Exception {
        nfornecedor.consultarPorId(id);
    }

    @Override
    public List<Fornecedor> listarFornecedor() throws Exception {
        return nfornecedor.listar();
    }

    //Funcioanrio
    NFuncionario nfuncionario = new NFuncionario();
    
    @Override
    public void salvarFuncionario(Funcionario f) throws Exception {
        nfuncionario.salvar(f);
    }

    @Override
    public void removerFuncionario(Funcionario f) throws Exception {
        nfuncionario.excluir(f);
    }

    @Override
    public void atualizarFuncioanrio(Funcionario f) throws Exception {
        nfuncionario.atualizar(f);
    }

    @Override
    public void consultarFuncionario(int id) throws Exception {
        nfuncionario.consultarPorId(id);
        
    }
    
    public List<Funcionario> consultarPorNome(String nome)throws Exception{
        return  nfuncionario.consultarPorNome(nome);
    }

    @Override
    public List<Funcionario> listarFuncionario() throws Exception {
        return nfuncionario.listar();
    }
    
    
    //Pedido
    NPedido npedido = new NPedido();
    @Override
    public void salvarPedido(Pedido ped) throws Exception {
        npedido.salvar(ped);
    }

    @Override
    public void removerPedido(Pedido ped) throws Exception {
        npedido.remover(ped);
    }

    @Override
    public void atualizarPedido(Pedido ped) throws Exception {
        npedido.atualizar(ped);
    }

    @Override
    public void consultarPedido(int id) throws Exception {
        npedido.consultarPorId(id);
    }

    @Override
    public List<Pedido> listarPedido() throws Exception {
        return npedido.listar();
    }

    
    //Produto
    NProduto nproduto = new NProduto();
    @Override
    public void salvarProduto(Produto prod) throws Exception {
        nproduto.salvar(prod);
    }

    @Override
    public void removerProduto(Produto prod) throws Exception {
        nproduto.remover(prod);
    }

    @Override
    public void atualizarProduto(Produto prod) throws Exception {
        nproduto.atualizar(prod);
    }

    @Override
    public void consultarProduto(int id) throws Exception {
        nproduto.consultarPorId(id);
    }

    @Override
    public List<Produto> listarProduto() throws Exception {
        return nproduto.listar();
    }

    //Receita
    NReceita nreceita = new NReceita();
    @Override
   
    public void salvarReceita(Receita rec) throws Exception {
        nreceita.salvar(rec);
    }

    @Override
    public void removerReceita(Receita rec) throws Exception {
       nreceita.Excluir(rec);
    }

    @Override
    public void atualizarReceita(Receita rec) throws Exception {
       nreceita.Alterar(rec);
    }

    @Override
    public void consultarReceita(int id) throws Exception {
       nreceita.consultarPorId(id);
    }

    @Override
    public List<Receita> listarReceita() throws Exception {
       return nreceita.listar();
    }

    @Override
    public List<Categoria> consultarPorNomeCategoria(String nome) throws Exception {
        return ncategoria.consultarPorNomeCategoria(nome);
        
    }

    @Override
    public List<Cliente> consultarPorNomeCliente(String nome) throws Exception {
        return ncliente.consultarPorNomeCliente(nome);
    }

    @Override
    public List<Fornecedor> consultarPorNomeFornecedor(String nome) throws Exception {
        return nfornecedor.consultarPorNomeFornecedor(nome);
    }

    @Override
    public List<Pedido> consultarPorNomePedido(String nome) throws Exception {
        return npedido.consultarPorNomePedido(nome);
    }

    @Override
    public List<Produto> consultarPorNomeProduto(String nome) throws Exception {
        return nproduto.consultarPorNomeProduto(nome);
    }

    @Override
    public List<Funcionario> consultarPorNomeReceita(String nome) throws Exception {
        return nfuncionario.consultarPorNome(nome);
    }
     
    
    
    
    
}
