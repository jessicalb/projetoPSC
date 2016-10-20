
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


public class Fachada implements IFachada {
    //Categoria
    NCategoria ncategoria = new NCategoria();
            
    @Override
    public void salvarCategoria(Categoria cat) throws Exception {
        ncategoria.salvar(cat);
    }

    @Override
    public void removerCategoria(Integer id) throws Exception {
        ncategoria.remover(id);
    }

    @Override
    public void atualizarCategoria(Categoria cat) throws Exception {
        ncategoria.atualizar(cat);
    }

    @Override
    public void consultarCategoriaId(Categoria cat, Integer id) throws Exception {
       // Categoria consultarPorId = ncategoria.consultarPorId(cat, id);
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
    public void consultarCliente(Cliente cli, Serializable id) throws Exception {
        ncliente.remover(cli);
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
    public void consultarFornecedor(Fornecedor f, Integer id) throws Exception {
        nfornecedor.consultarPorId(f, id);
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
    public void consultarFuncionario(Funcionario f, Serializable id) throws Exception {
        nfuncionario.consultarPorId(f, id);
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
    public void consultarPedido(Pedido ped, Integer id) throws Exception {
        npedido.consultarPorId(ped, id);
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
    public void consultarProduto(Produto prod, Integer id) throws Exception {
        nproduto.consultarPorId(prod, id);
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
     
    
    
    
    
}
