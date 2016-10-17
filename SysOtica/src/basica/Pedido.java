/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basica;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author karlinhos
 */
@Entity
public class Pedido implements EntidadeBase {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pedido_id")
     private Integer id;
     private Double valorTotal;
     private String formaPagamento;
     
    @ManyToOne
    @JoinColumn(name = "usuario_id", insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Funcionario Funcionario;
    
    
    
    @ManyToOne
    @JoinColumn(name = "cliente_id", insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.SAVE_UPDATE)
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name = "receita_id", insertable = true, nullable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(CascadeType.ALL)
    private Receita receita;
    
   
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="produto_pedido", joinColumns={@JoinColumn(name="pedido_id")},
    inverseJoinColumns ={@JoinColumn(name="produto_id")})
    private Collection<Produto> produtos;
    
    
    public Pedido(){}
    
    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

  

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public Collection<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Collection<Produto> produtos) {
        this.produtos = produtos;
    }

    public Funcionario getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(Funcionario Funcionario) {
        this.Funcionario = Funcionario;
    }

    
    
}
