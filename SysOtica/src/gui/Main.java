package gui;

import DAO.CategoriaDAO;
import DAO.ClienteDAO;
import DAO.ReceitaDAO;
import DAO.FuncionarioDAO;
import Exceção.DAOException;
import basica.Funcionario;
import basica.Categoria;
import basica.Cliente;
import basica.Endereco;
import basica.Fornecedor;
import basica.Pedido;
import basica.Produto;
import basica.Receita;
import basica.Usuario;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Main {

    public static void main(String agrs[]) throws ParseException, DAOException {

        
       // FuncionarioDAO crudUsuario = new FuncionarioDAO();
        //Funcionario f =  new Funcionario();
       /* f.setNome("Ranni Silva");
        f.setCargo("Vendedor");
        f.setCpf("00011122233");
        f.setEmail("karlos@hotmail.com");
        f.setLogin("mago");
        f.setSenha("0000");
        f.setTelefone("12345678");
        crudUsuario.salvar(f);*/
        
       
        
        //f = crudUsuario.consultarPorId(2);
        //f.setNome("Diego Mendes");
        
       // crudUsuario.salvar(f);
        
       // System.out.println(f.getNome());
       
       
       ClienteDAO crudCliente = new ClienteDAO(); 
        Cliente cli = new Cliente();
       /* cli.setNome("Jorge San Paolo");
        cli.setEmail("maria@.com");
        Endereco end = new Endereco();
        end.setLogradouro("Amaral do Barretos");
        end.setBairro("Pirituba");
        end.setEstado("SP");
        end.setCidade("são paulo");
        end.setNumero(324);
         ArrayList<Receita> receitas = new ArrayList<Receita>();
        Receita rec = new Receita();
        rec.setRc_lodaltura(1.0);
        rec.setRc_lodcilindrico(2.0);
        rec.setRc_nomemedico("Hermano Silva");
        rec.setCliente(cli);
        receitas.add(rec);
        cli.setReceitas(receitas);
        rec.setCliente(cli);
        cli.setEndereco(end);
        crudCliente.salvar(cli);*/
        
        
        
        
        
        cli = crudCliente.consultarPorId(2);
         cli.setNome("Jacinto Eduardo");
         
         crudCliente.salvar(cli);
         
         
         System.out.println(cli.getNome());
                 
                 
        
        
        
      
       
        
        
        
        
        /*Cliente cli = new Cliente();
        cli.setNome("Jorge San Paolo");
        cli.setEmail("maria@.com");
        Endereco end = new Endereco();
        end.setLogradouro("Amaral do Barretos");
        end.setBairro("Pirituba");
        end.setEstado("SP");
        end.setCidade("são paulo");
        end.setNumero(324);
        cli.setReceitas(receitas);
        rec.setCliente(cli);
        

        cli.setEndereco(end);
        
   
       
       

//System.out.println(cli.getNome());
        


//ReceitaDAO crudReceita = new ReceitaDAO();
        
       // Receita r = crudReceita.consultarPorId(3);
        
       // crudReceita.remover(3);
        
        //System.out.println(r.getRc_nomemedico());
        
        
        //CategoriaDAO crudCategoria = new CategoriaDAO();
        //Categoria cat = new Categoria();
        //cat.setDescricao("Lentes");
        //crudCategoria.remover(1);
        
        
       
        
        
        
        
        //crudCliente.salvar(cli);
       // crudReceita.salvar(rec);
        
         //List<Receita> receitas = crudReceita.listar();
         
        // for(Receita r: receitas){
         //    System.out.println(r.getRc_nomemedico());
        // }
       
        //System.out.println(r.getRc_nomemedico());
       
        
      // Cliente cli = crudCliente.consultarPorId(3);
      
       
      // crudCliente.remover(cli);
       
       // System.out.println(cli.getNome());
        
        
         
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
