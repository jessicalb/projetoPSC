package gui;

import control.CategoriaDAO;
import control.ClienteDAO;
import control.DAOFactory;
import control.ReceitaDAO;
import control.FuncionarioDAO;
import Exceção.DAOException;
import model.Funcionario;
import model.Categoria;
import model.Cliente;
import model.Endereco;
import model.Fornecedor;
import model.Pedido;
import model.Produto;
import model.Receita;
import model.Usuario;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import negocio.NCliente;
import negocio.NFuncionario;
import negocio.NReceita;



public class Main {

  
   
    
    
    
    
    
    public static void main(String agrs[]) throws ParseException, DAOException, Exception {

        
        
        
        
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       Date data = sdf.parse("20/10/2016");
       Date data2 = sdf.parse("22/10/2016");
 
       Cliente cli = new Cliente();
       //cli.setNome("Jessica Vicenza");
      // cli.setEmail("karlinhos.eduardo@hotmail.com");
      // Endereco end = new Endereco();
       //end.setLogradouro("Fracisco Travassos");
      // end.setBairro("Pirituba");
       //end.setEstado("SP");
       //end.setCidade("são paulo");
      // end.setNumero(324);
       ArrayList<Receita> receitas = new ArrayList<Receita>();
       //Receita rec = new Receita();
       //rec.setRc_lodaltura(1.0);
       //rec.setRc_lodcilindrico(2.0);
       //rec.setRc_nomemedico("Hermano Silva");
       //rec.setCliente(cli);
       //rec.setRc_dataEntrada(data);
       //rec.setRc_dataVencimento(data2);
       //receitas.add(rec);
      // cli.setReceitas(receitas);
      // rec.setCliente(cli);
      //cli.setEndereco(end);
        
      ClienteDAO dao = DAOFactory.getClienteDAO();
      NCliente nc = new NCliente();
     // nc.salvar(cli);
        
      Receita rec1 = new Receita();  
      Cliente c = nc.consultarPorId(cli, 3);
      rec1.setCliente(c);
      rec1.setRc_nomemedico("Francisco Nabisco");
      rec1.setRc_dataEntrada(data);
      rec1.setRc_dataVencimento(data2);
      receitas.add(rec1);
      
      
      ReceitaDAO rdao = DAOFactory.getReceitaDAO();
      NReceita nr = new NReceita();
      nr.salvar(rec1);
      
      
        // System.out.print(c.getNome());
        
      // NCliente nc = new NCliente();
       //Cliente  c = nc.consultarPorId(cli, 10);
       //c.setNome("Carlos Amarilla");
       //nc.atualizar(c);
       //nc.remover(c);
       
      //List<Cliente> clientes = nc.listar();
      
       // for (Cliente cl : clientes) {
      //       System.out.println(cl.getNome());
      //  }
        
        
       
        
       // Cliente cl = dao.consultarPorId(Cliente.class, 2);
        
        //cl.setNomemae("Maria das graças");
        
        
        
        //List<Cliente> clientes = dao.listar();
        
        
        //dao.excluir(Cliente.class, 1);
        
       // for ( Cliente cli : clientes){
           // System.out.println(cli.getNome());
            
       // }
        
 
        /*Funcionario fun = new Funcionario();
        fun.setNome("Carlos Silva");
        fun.setLogin("magodoboladao");
        fun.setSenha("007007");
        fun.setCargo("novo");
         
       
         
         NFuncionario nf = new NFuncionario();
        // nf.salvar(fun);
         
        // nf.excluir(fun);
         
         Funcionario f1 = nf.consultarPorId(fun, 1);
         //f1.setNome("Mainha Gata");
         //nf.atualizar(f1);
         
         System.out.println(f1.getNome());
         
         
         //List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        // funcionarios = nf.listar();
         
        // for(int i = 0; i < funcionarios.size(); i++){
         
       //  System.out.println(funcionarios.get(i).getNome());
       //  }
                 
    
         /*EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatetest");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Funcionario fun = new Funcionario();
        fun.setNome("Carlos");
        fun.setCpf("09061139465");
        fun.setCargo("Atendente");
        fun.setLogin("karlinhos16");
        fun.setSenha("12345");
        em.persist(fun);
        Categoria cat = new Categoria();
        cat.setDescricao("oculos");
        em.persist(cat);
        Endereco end = new Endereco();
        end.setLogradouro("Rua barao vinte");
        end.setBairro("Pirituba");
        end.setCidade("SP");
        end.setEstado("São Paulo");
        end.setNumero(45);
        em.persist(end);
        Endereco end1 = new Endereco();
        end1.setLogradouro("Rua trinta");
        end1.setBairro("Centro");
        end1.setCidade("Recife");
        end1.setEstado("Pernambuco");
        end1.setNumero(33);
        em.persist(end1);
        Fornecedor forn = new Fornecedor();
        forn.setNomeFantasia("Otica Diniz");
        forn.setNomeRepresentante("Paulo Dybala");
        forn.setEmail("karlinhos@hot.com");
        forn.setCnpj("01234567891234");
        forn.setTelefone("12345678");
        forn.setEndereco(end1);
        em.persist(forn);
        Produto prod = new Produto();
        prod.setDescricao("Rayban");
        prod.setMarca("Calvin Klein");
        prod.setValorUnidade(58.00);
        prod.setFornecedor(forn);
        prod.setCategoria(cat);
        em.persist(prod);
        Produto prod2 = new Produto();
        prod2.setDescricao("Lentes Transitions");
        prod2.setCategoria(cat);
        prod2.setEstoqueMinimo(10);
        prod2.setMarca("Visao");
        prod2.setValorUnidade(60.00);
        prod2.setFornecedor(forn);
        em.persist(prod2);
        
        Cliente cli = new Cliente();
        cli.setNome("Lula");
        cli.setCpf("00011122233");
        
        
        
        
        cli.setEndereco(end);
        em.persist(cli);
        
        /*Receita rec = new Receita();
        rec.setRc_lodaltura(1.0);
        rec.setRc_lodcilindrico(2.0);
        rec.setRc_nomemedico("Hermano Silva");
        rec.setCliente(cli);
        Receita rec1 = new Receita();
        rec1.setRc_lodaltura(4.0);
        rec1.setRc_lodcilindrico(3.3);
        rec1.setRc_nomemedico("Ranni Silva");
        rec1.setCliente(cli);
        em.persist(rec);
        em.persist(rec1);*/
       /* ArrayList <Produto> novas = new ArrayList<>();
        novas.add(prod);
        novas.add(prod2);
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date data = df.parse("11/10/2016");*/
        
        /*Pedido p = new Pedido();
        p.setCliente(cli);
        p.setFormaPagamento("cartao");
        p.setReceita(rec1);
        p.setValorTotal(100.00);
        p.setProdutos(novas);
        p.setFuncionario(fun);
        em.persist(p);
        et.commit();
        em.close();
        emf.close();
       
        /*ProdutoPedidoPK pk = new ProdutoPedidoPK();
        pk.setProduto(prod);
        pk.setPedido(p);
        ProdutoPedido pd = new ProdutoPedido();
        pd.setChaveComposta(pk);
        pd.setDataVenda(data);
        pd.setQuantidade(2);
        em.persist(pd);
        ProdutoPedidoPK pk1 = new ProdutoPedidoPK();
        pk1.setPedido(p);
        pk1.setProduto(prod2);
        ProdutoPedido pd1 = new ProdutoPedido();
        pd1.setChaveComposta(pk1);
        pd1.setDataVenda(data);
        pd1.setQuantidade(3);
        em.persist(pd1);
        et.commit();
        em.close();
        emf.close();*/

    }
}
