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
      
        Cliente cli = new Cliente();
        cli.setNome("Lula");
        cli.setCpf("00011122233");
        
        em.persist(cli);
        
        Endereco end = new Endereco();
        end.setLogradouro("Rua barao vinte");
        end.setBairro("Pirituba");
        end.setCidade("SP");
        end.setEstado("São Paulo");
        end.setNumero(45);
        
        em.persist(end);
        
        Fornecedor forn = new Fornecedor();
        forn.setNomeFantasia("Otica Diniz");
        forn.setNomeRepresentante("Paulo Dybala");
        forn.setEmail("karlinhos@hot.com");
        forn.setCnpj("01234567891234");
        forn.setTelefone("12345678");
        
        em.persist(forn);
        
        
        Produto prod = new Produto();
        prod.setDescricao("Rayban");
        prod.setMarca("Calvin Klein");
        prod.setValorUnidade(58.00);
        
        em.persist(prod);
        
        
        
        
        Pedido ped = new Pedido();
        ped.setFormaPagamento("Cartao");
        ped.setValorTotal(100.00);
        
        
        em.persist(ped);
        
        
        Receita rec = new Receita();
        rec.setRc_lodaltura(1.0);
        rec.setRc_lodcilindrico(2.0);
        rec.setRc_nomemedico("Hermano Silva");
        
        em.persist(rec);

        et.commit();

        em.close();

        emf.close();

    }
}
