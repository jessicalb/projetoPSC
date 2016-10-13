/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Fornecedor;
import java.util.List;

/**
 *
 * @author karlinhos
 */
public interface IfornecedorDAO {
    
    public void salvar(Fornecedor f)throws DAOException;
    public void remover(Fornecedor f )throws DAOException;
    public void atualizar(Fornecedor f)throws DAOException;
    public List<Fornecedor> listar()throws DAOException;
    public Fornecedor consultarPorId(Integer id) throws DAOException;
    
}
