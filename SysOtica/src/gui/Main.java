package gui;

import basica.Atendente;
import basica.Categoria;
import basica.Cliente;
import basica.Endereco;
import basica.Fornecedor;
import basica.Gerente;
import basica.Pedido;
import basica.Produto;
import basica.Receita;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Main {

    public static void main(String agrs[]) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatetest");
        EntityManager em = emf.createEntityManager();

        EntityTransaction et = em.getTransaction();
        
        et.begin();
        
        
        Atendente at = new Atendente();
        at.setNome("Carlos");
        at.setCpf("09061139465");
        at.setFuncao("Vendedor");
        at.setLogin("karlinhos16");
        at.setSenha("12345");
        
  
        em.persist(at);
        
        Gerente ge = new Gerente();
        ge.setNome("Diego");
        ge.setFuncao("Gerente");
        ge.setCpf("00044455588");
        ge.setLogin("diegoMendes");
        ge.setSenha("123");
        
        em.persist(ge);
        
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
        
 
        Pedido ped = new Pedido();
        ped.setFormaPagamento("Cartao");
        ped.setValorTotal(100.00);
        
        
        em.persist(ped);
        
        
        
        Cliente cli = new Cliente();
        cli.setNome("Lula");
        cli.setCpf("00011122233");
        cli.setEndereco(end);
        em.persist(cli);   
        
        
        
        Receita rec = new Receita();
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
        em.persist(rec1);
        
        //ArrayList <Receita> novas = new ArrayList<>();
        //novas.add(rec);
        //novas.add(rec1);
        
      
      

        et.commit();

        em.close();

        emf.close();

    }
}
