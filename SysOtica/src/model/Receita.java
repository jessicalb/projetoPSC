/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author Jeca
 */
@Entity
public class Receita implements  Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receita_id")
    private Integer id;
    private Double rc_lodesferico;
    private Double rc_loeesferico;
    private Double rc_podesferico;
    private Double rc_poeesferico;
    private Double rc_lodcilindrico;
    private Double rc_loecilindrico;
    private Double rc_podcilindrico;
    private Double rc_poecilindrico;
    private Double rc_lodeixo;
    private Double rc_loeeixo;
    private Double rc_podeixo;
    private Double rc_poeeixo;
    private Double rc_lodaltura;
    private Double rc_loealtura;
    private Double rc_podaltura;
    private Double rc_poealtura;
    private Double rc_loddnp;
    private Double rc_loednp;
    private Double rc_poddnp;
    private Double rc_poednp;
    @Column(nullable = false)
    private String rc_nomemedico;
    @Column(nullable = true)
    private String rc_observacoes;
    
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(nullable = false)
    private Date rc_dataEntrada;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(nullable = false, updatable = true)
    private Date rc_dataVencimento;

    @ManyToOne
    @JoinColumn(name= "cliente_id")
    private Cliente cliente;
    
    //uma receita pode estar em vários pedidos
    @OneToMany(mappedBy = "receita", fetch = FetchType.LAZY)
    private Collection<Pedido> pedidos;
    
    
    public Receita(){}
    
    
    public Integer getId() {
        return id;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }

    
    public Double getRc_lodesferico() {
        return rc_lodesferico;
    }

   
    public void setRc_lodesferico(Double rc_lodesferico) {
        this.rc_lodesferico = rc_lodesferico;
    }

  
    public Double getRc_loeesferico() {
        return rc_loeesferico;
    }

   
    public void setRc_loeesferico(Double rc_loeesferico) {
        this.rc_loeesferico = rc_loeesferico;
    }

    
    public Double getRc_podesferico() {
        return rc_podesferico;
    }

    
    public void setRc_podesferico(Double rc_podesferico) {
        this.rc_podesferico = rc_podesferico;
    }

    
    public Double getRc_poeesferico() {
        return rc_poeesferico;
    }

    
    public void setRc_poeesferico(Double rc_poeesferico) {
        this.rc_poeesferico = rc_poeesferico;
    }

   
    public Double getRc_lodcilindrico() {
        return rc_lodcilindrico;
    }

    
    public void setRc_lodcilindrico(Double rc_lodcilindrico) {
        this.rc_lodcilindrico = rc_lodcilindrico;
    }

    
    public Double getRc_loecilindrico() {
        return rc_loecilindrico;
    }

   
    public void setRc_loecilindrico(Double rc_loecilindrico) {
        this.rc_loecilindrico = rc_loecilindrico;
    }

   
    public Double getRc_podcilindrico() {
        return rc_podcilindrico;
    }

    
    public void setRc_podcilindrico(Double rc_podcilindrico) {
        this.rc_podcilindrico = rc_podcilindrico;
    }

    
    public Double getRc_poecilindrico() {
        return rc_poecilindrico;
    }

    
    public void setRc_poecilindrico(Double rc_poecilindrico) {
        this.rc_poecilindrico = rc_poecilindrico;
    }

    
    public Double getRc_lodeixo() {
        return rc_lodeixo;
    }

   
    public void setRc_lodeixo(Double rc_lodeixo) {
        this.rc_lodeixo = rc_lodeixo;
    }

   
    public Double getRc_loeeixo() {
        return rc_loeeixo;
    }

   
    public void setRc_loeeixo(Double rc_loeeixo) {
        this.rc_loeeixo = rc_loeeixo;
    }

   
    public Double getRc_podeixo() {
        return rc_podeixo;
    }

   
    public void setRc_podeixo(Double rc_podeixo) {
        this.rc_podeixo = rc_podeixo;
    }

   
    public Double getRc_poeeixo() {
        return rc_poeeixo;
    }

    
    public void setRc_poeeixo(Double rc_poeeixo) {
        this.rc_poeeixo = rc_poeeixo;
    }

   
    public Double getRc_lodaltura() {
        return rc_lodaltura;
    }

    
    public void setRc_lodaltura(Double rc_lodaltura) {
        this.rc_lodaltura = rc_lodaltura;
    }

   
    public Double getRc_loealtura() {
        return rc_loealtura;
    }

    
    public void setRc_loealtura(Double rc_loealtura) {
        this.rc_loealtura = rc_loealtura;
    }

   
    public Double getRc_podaltura() {
        return rc_podaltura;
    }

    
    public void setRc_podaltura(Double rc_podaltura) {
        this.rc_podaltura = rc_podaltura;
    }

    
    public Double getRc_poealtura() {
        return rc_poealtura;
    }

   
    public void setRc_poealtura(Double rc_poealtura) {
        this.rc_poealtura = rc_poealtura;
    }

   
    public Double getRc_loddnp() {
        return rc_loddnp;
    }

   
    public void setRc_loddnp(Double rc_loddnp) {
        this.rc_loddnp = rc_loddnp;
    }

   
    public Double getRc_loednp() {
        return rc_loednp;
    }

   
    public void setRc_loednp(Double rc_loednp) {
        this.rc_loednp = rc_loednp;
    }

    
    public Double getRc_poddnp() {
        return rc_poddnp;
    }

    
    public void setRc_poddnp(Double rc_poddnp) {
        this.rc_poddnp = rc_poddnp;
    }

   
    public Double getRc_poednp() {
        return rc_poednp;
    }

   
    public void setRc_poednp(Double rc_poednp) {
        this.rc_poednp = rc_poednp;
    }

   
    public String getRc_nomemedico() {
        return rc_nomemedico;
    }

   
    public void setRc_nomemedico(String rc_nomemedico) {
        this.rc_nomemedico = rc_nomemedico;
    }

   
    public String getRc_observacoes() {
        return rc_observacoes;
    }

    
    public void setRc_observacoes(String rc_observacoes) {
        this.rc_observacoes = rc_observacoes;
    }

    
    public Date getRc_dataEntrada() {
        return rc_dataEntrada;
    }

    
    public void setRc_dataEntrada(Date rc_dataEntrada) {
        this.rc_dataEntrada = rc_dataEntrada;
    }

    
    public Date getRc_dataVencimento() {
        return rc_dataVencimento;
    }

   
    public void setRc_dataVencimento(Date rc_dataVencimento) {
        this.rc_dataVencimento = rc_dataVencimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Collection<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Collection<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
}
