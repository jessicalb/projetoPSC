/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Cliente;
import java.util.List;

/**
 *
 * @author karlinhos
 */
public interface IClienteDAO {
    
    public void salvar(Cliente cli)throws DAOException;
    public void remover(Integer id)throws DAOException;
    public void atualizar(Cliente cli)throws DAOException;
    public List<Cliente> listar()throws DAOException;
    public Cliente consultarPorId(Integer id) throws DAOException;
    
}
