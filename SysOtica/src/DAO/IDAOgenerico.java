/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.util.List;
import Exceção.DAOException;
import basica.EntidadeBase;


/**
 *
 * @author karlinhos
 */
public interface IDAOgenerico<T> {
    
    public void inserir(T t)throws DAOException;

    public  T alterar(T t)throws DAOException;

    public void excluir(T t, Serializable id) throws DAOException;

    public T consultarPorId(Serializable id)throws DAOException;

  
    
}
