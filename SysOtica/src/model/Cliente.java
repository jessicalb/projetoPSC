/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Receita;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author Jeca
 */
@Entity
public class Cliente implements  Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "cliente_id")
    private Integer id;
    @Column(nullable = false)
    private String nome;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtNascimento;
    @Column(length = 10)
    private String telefone;
    @Column(length = 11, nullable = false)
    private String cpf;
    private String email;
    private String profissao;
    private String observacoes;
    private String nomepai;
    private String nomemae;
    
    
    
    @OneToOne(cascade = javax.persistence.CascadeType.ALL)
    private Endereco endereco;
    
    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    @Cascade(CascadeType.ALL)
    private Collection<Receita> receitas;
    

    
   
    
    public Cliente(){
        
       endereco = new Endereco();
    
    }

    
    public Integer getId() {
        return id;
    }

   
    public void setId(Integer id) {
        this.id = id;
    }

   
    public String getNome() {
        return nome;
    }

  
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public Date getDtNascimento() {
        return dtNascimento;
    }

    
    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    
    public String getTelefone() {
        return telefone;
    }

   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public String getCpf() {
        return cpf;
    }

  
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

   
    public String getProfissao() {
        return profissao;
    }

   
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

   
    public String getObservacoes() {
        return observacoes;
    }

    
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

   
    public String getNomepai() {
        return nomepai;
    }

    
    public void setNomepai(String nomepai) {
        this.nomepai = nomepai;
    }

    
    public String getNomemae() {
        return nomemae;
    }

    
    public void setNomemae(String nomemae) {
        this.nomemae = nomemae;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Collection<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(Collection<Receita> receitas) {
        this.receitas = receitas;
    }

   
    
    
}
