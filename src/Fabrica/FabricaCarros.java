/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabrica;

import icomponentes.IAssentos;
import icomponentes.ICarroceria;
import icomponentes.IMotor;
import icomponentes.IRodas;
import icomponentes.ISistemaEletrico;
/**
 *
 * @author Cezarino Hora
 */
class FabricaCarros implements IVeiculoFactory {
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
        return new AssentosCouro();
    }

    public ISistemaEletrico criarSistemaEletrico() {
        return new SistemaEletricoAvancado();
    }
}
