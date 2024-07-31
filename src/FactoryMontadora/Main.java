/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMontadora;

import componentes.*;
import Fabrica.*;
import icomponentes.IAssentos;
import icomponentes.ICarroceria;
import icomponentes.IMotor;
import icomponentes.IRodas;
import icomponentes.ISistemaEletrico;

import java.util.Scanner;
/**
 *
 * @author Cezarino Hora
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IVeiculoFactory veiculoFactory = null;

        while (true) {
            System.out.println("Escolha o tipo de veículo para criar:");
            System.out.println("1. Carro");
            System.out.println("2. Moto");
            System.out.println("3. Caminhão");
            System.out.println("4. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine();  // consume newline

            if (escolha == 4) {
                System.out.println("Saindo...");
                break;
            }

            switch (escolha) {
                case 1:
                    veiculoFactory = new FabricaCarros();
                    break;
                case 2:
                    veiculoFactory = new FabricaMotos();
                    break;
                case 3:
                    veiculoFactory = new FabricaCaminhoes();
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    continue;
            }

            System.out.println("Escolha os componentes para o veículo:");
            
            System.out.println("Escolha o tipo de Motor:");
            System.out.println("1. Motor Elétrico");
            System.out.println("2. Motor a Combustão");
            int motorEscolha = scanner.nextInt();
            IMotor motor = (motorEscolha == 1) ? new MotorEletrico() : new MotorCombustao();
            
            if (escolha == 2) { // Se for Moto
                System.out.println("Escolha o tipo de Carroceria:");
                System.out.println("1. Carroceria Moto Street");
                System.out.println("2. Carroceria Moto Naked");
                System.out.println("3. Carroceria Moto Esportiva");
                int carroceriaMotoEscolha = scanner.nextInt();
                ICarroceria carroceria = null;
                switch (carroceriaMotoEscolha) {
                    case 1:
                        carroceria = new CarroceriaMotoStreet();
                        break;
                    case 2:
                        carroceria = new CarroceriaMotoNaked();
                        break;
                    case 3:
                        carroceria = new CarroceriaMotoEsportiva();
                        break;
                    default:
                        System.out.println("Escolha inválida. Usando padrão Moto Street.");
                        carroceria = new CarroceriaMotoStreet();
                        break;
                }
                System.out.println("Escolha o tipo de Rodas:");
                System.out.println("1. Rodas Aro 17");
                System.out.println("2. Rodas Aro 20");
                int rodasEscolha = scanner.nextInt();
                IRodas rodas = (rodasEscolha == 1) ? new RodasAro17() : new RodasAro20();

                System.out.println("Escolha o tipo de Assentos:");
                System.out.println("1. Assentos de Couro");
                System.out.println("2. Assentos de Tecido");
                int assentosEscolha = scanner.nextInt();
                IAssentos assentos = (assentosEscolha == 1) ? new AssentosCouro() : new AssentosTecido();

                System.out.println("Escolha o tipo de Sistema Elétrico:");
                System.out.println("1. Sistema Elétrico Básico");
                System.out.println("2. Sistema Elétrico Avançado");
                int sistemaEletricoEscolha = scanner.nextInt();
                ISistemaEletrico sistemaEletrico = (sistemaEletricoEscolha == 1) ? new SistemaEletricoBasico() : new SistemaEletricoAvancado();

                System.out.println("\nVeículo criado com os seguintes componentes:");
                motor.exibirTipo();
                carroceria.exibirTipo();
                rodas.exibirTipo();
                assentos.exibirTipo();
                sistemaEletrico.exibirTipo();
            } else if (escolha == 3) { // Se for Caminhão
                System.out.println("Escolha o tipo de Carroceria:");
                System.out.println("1. Carroceria Caminhão Baú");
                System.out.println("2. Carroceria Caminhão Prancha");
                int carroceriaCaminhaoEscolha = scanner.nextInt();
                ICarroceria carroceriaCaminhao = null;
                switch (carroceriaCaminhaoEscolha) {
                    case 1:
                        carroceriaCaminhao = new CarroceriaCaminhaoBau();
                        break;
                    case 2:
                        carroceriaCaminhao = new CarroceriaCaminhaoPrancha();
                        break;
                    default:
                        System.out.println("Escolha inválida. Usando padrão Caminhão Baú.");
                        carroceriaCaminhao = new CarroceriaCaminhaoBau();
                        break;
                }
                System.out.println("Escolha o tipo de Rodas:");
                System.out.println("1. Rodas Aro 17");
                System.out.println("2. Rodas Aro 20");
                int rodasEscolha = scanner.nextInt();
                IRodas rodas = (rodasEscolha == 1) ? new RodasAro17() : new RodasAro20();

                System.out.println("Escolha o tipo de Assentos:");
                System.out.println("1. Assentos de Couro");
                System.out.println("2. Assentos de Tecido");
                int assentosEscolha = scanner.nextInt();
                IAssentos assentos = (assentosEscolha == 1) ? new AssentosCouro() : new AssentosTecido();

                System.out.println("Escolha o tipo de Sistema Elétrico:");
                System.out.println("1. Sistema Elétrico Básico");
                System.out.println("2. Sistema Elétrico Avançado");
                int sistemaEletricoEscolha = scanner.nextInt();
                ISistemaEletrico sistemaEletrico = (sistemaEletricoEscolha == 1) ? new SistemaEletricoBasico() : new SistemaEletricoAvancado();

                System.out.println("\nVeículo criado com os seguintes componentes:");
                motor.exibirTipo();
                carroceriaCaminhao.exibirTipo();
                rodas.exibirTipo();
                assentos.exibirTipo();
                sistemaEletrico.exibirTipo();
            } else { // Se for Carro
                System.out.println("Escolha o tipo de Carroceria:");
                System.out.println("1. Carroceria Sedan");
                System.out.println("2. Carroceria SUV");
                int carroceriaEscolha = scanner.nextInt();
                ICarroceria carroceria = (carroceriaEscolha == 1) ? new CarroceriaSedan() : new CarroceriaSuv();

                System.out.println("Escolha o tipo de Rodas:");
                System.out.println("1. Rodas Aro 17");
                System.out.println("2. Rodas Aro 20");
                int rodasEscolha = scanner.nextInt();
                IRodas rodas = (rodasEscolha == 1) ? new RodasAro17() : new RodasAro20();

                System.out.println("Escolha o tipo de Assentos:");
                System.out.println("1. Assentos de Couro");
                System.out.println("2. Assentos de Tecido");
                int assentosEscolha = scanner.nextInt();
                IAssentos assentos = (assentosEscolha == 1) ? new AssentosCouro() : new AssentosTecido();

                System.out.println("Escolha o tipo de Sistema Elétrico:");
                System.out.println("1. Sistema Elétrico Básico");
                System.out.println("2. Sistema Elétrico Avançado");
                int sistemaEletricoEscolha = scanner.nextInt();
                ISistemaEletrico sistemaEletrico = (sistemaEletricoEscolha == 1) ? new SistemaEletricoBasico() : new SistemaEletricoAvancado();

                System.out.println("\nVeículo criado com os seguintes componentes:");
                motor.exibirTipo();
                carroceria.exibirTipo();
                rodas.exibirTipo();
                assentos.exibirTipo();
                sistemaEletrico.exibirTipo();
            }
            System.out.println();
        }

        scanner.close();
    }
}