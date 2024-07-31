/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabrica;

import componentes.*;
import icomponentes.IAssentos;
import icomponentes.ICarroceria;
import icomponentes.IMotor;
import icomponentes.IRodas;
import icomponentes.ISistemaEletrico;
/**
 *
 * @author Cezarino Hora
 */
public class FabricaMotos implements IVeiculoFactory {
    public IMotor criarMotor() {
        return new MotorCombustao();
    }

    public ICarroceria criarCarroceria() {
        return new CarroceriaSedan();
    }

    public IRodas criarRodas() {
        return new RodasAro17();
    }

    public IAssentos criarAssentos() {
        return new AssentosTecido();
    }

    public ISistemaEletrico criarSistemaEletrico() {
        return new SistemaEletricoBasico();
    }
}