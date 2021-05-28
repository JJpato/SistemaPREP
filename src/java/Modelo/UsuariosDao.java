/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author luism
 */
public class UsuariosDao {
    
    String usu;
    String pswd;
    String Consulta_by_usuario="Select usuario from usuarios;";
    String Consulta_by_pswd="Select paswordd from usuarios where usuario=usu;";
    
}
