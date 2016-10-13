/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Categoria;
import java.util.List;

/**
 *
 * @author karlinhos
 */
public interface IcategoriaDAO {
    
    public void salvar(Categoria cat)throws DAOException;
    public void remover(Integer id)throws DAOException;
    public void atualizar(Categoria cat)throws DAOException;
    public List<Categoria> listar()throws DAOException;
    public Categoria consultarPorId(Integer id) throws DAOException;
    
}
