/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basica;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Jeca
 */
@Entity
public class Cliente {
    
    @Id
    @GeneratedValue
    private Integer id;
   
    private String nome;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtNascimento;
    private String telefone;
    private String cpf;
    private String email;
    private String profissao;
    private String observacoes;
    private String nomepai;
    private String nomemae;

    
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
    
    
    
}
