/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentes;

import icomponentes.IMotor;

/**
 *
 * @author Cezarino Hora
 */
class MotorEletrico implements IMotor {
    
    @Override
    public void ligar() {
        System.out.println("Motor elétrico ligado.");  
    }
    
}
