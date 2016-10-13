/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Exceção.DAOException;
import basica.Pedido;
import java.util.List;

/**
 *
 * @author karlinhos
 */
public interface IpedidoDAO {
    
    public void salvar(Pedido ped)throws DAOException;
    public void remover(Pedido ped)throws DAOException;
    public void atualizar(Pedido ped)throws DAOException;
    public List<Pedido> listar()throws DAOException;
    public Pedido consultarPorId(Integer id) throws DAOException;
    
}
