/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Funcionario;
import basica.Usuario;
import java.util.List;

/**
 *
 * @author karlinhos
 */
public interface IfuncionarioDAO {
    
    public Funcionario salvar(Funcionario f)throws DAOException;
    public Funcionario atualizar(Funcionario f)throws DAOException;
    public void excluir(Integer id)throws DAOException;
    public List <Funcionario> listar()throws DAOException;
    public Funcionario consultarPorId(Integer id)throws DAOException;
    
}
