package Fabrica;

import icomponentes.IAssentos;
import icomponentes.ICarroceria;
import icomponentes.IMotor;
import icomponentes.IRodas;
import icomponentes.ISistemaEletrico;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Cezarino Hora
 */
public interface IVeiculoFactory {

    void criarMotor();
    
    void criarCarroceria();
    
    void criarRodas();
    
    void criarAssentos();
    
    void criarSistemaEletrico();
    
}
