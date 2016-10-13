/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Receita;
import java.util.List;

/**
 *
 * @author karlinhos
 */
public interface IreceitaDAO {
    
    public void salvar(Receita r)throws DAOException;
    public void remover(Integer id)throws DAOException;
    public void atualizar(Receita r)throws DAOException;
    public List<Receita> listar()throws DAOException;
    public Receita consultarPorId(Integer id) throws DAOException;
    
}
