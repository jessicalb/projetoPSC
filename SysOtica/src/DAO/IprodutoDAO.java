/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Produto;
import java.util.List;

/**
 *
 * @author karlinhos
 */
public interface IprodutoDAO {
    
    public void salvar(Produto p)throws DAOException;
    public void remover(Produto p)throws DAOException;
    public void atualizar(Produto p)throws DAOException;
    public List<Produto> listar()throws DAOException;
    public Produto consultarPorId(Integer id) throws DAOException;
}
