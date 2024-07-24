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
    @Override
    public IMotor criarMotor() {
        return new MotorCombustao();
    }

    @Override
    public ICarroceria criarCarroceria() {
        return new CarroceriaSedan();
    }

    @Override
    public IRodas criarRodas() {
        return new RodasAro17();
    }

   @Override
    public IAssentos criarAssentos() {
        return new AssentosCouro();
    }

    @Override
    public ISistemaEletrico criarSistemaEletrico() {
        return new SistemaEletricoAvancado();
    }
}
