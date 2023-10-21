package desafio.iphoneApplication;

import java.util.Scanner;

import desafio.interfaces.AparelhoTelefonico;
import desafio.interfaces.NavegadorInternet;
import desafio.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void ligar() {
        System.out.println("Iniciando chamada telefônica");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada telefônica");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Iniciando reprodução musical");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando reprodução musical");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da internet");
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int opcao;

        do {
            System.out.println("Escolha uma opção no menu:\n" +
                    "1: Iniciar chamada\n" +
                    "2: Atender chamada\n" +
                    "3: Iniciar correio de voz\n" +
                    "4: Selecionar música\n" +
                    "5: Iniciar música\n" +
                    "6: Pausar música\n" +
                    "7: Exibir página da internet\n" +
                    "8: Adicionar nova aba\n" +
                    "9: Atualizar página da internet\n" +
                    "0: Desligar");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    iphone.ligar();
                    Thread.sleep(1000);
                    break;
                case 2:
                    iphone.atender();
                    Thread.sleep(1000);
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    Thread.sleep(1000);
                    break;
                case 4:
                    iphone.selecionarMusica();
                    Thread.sleep(1000);
                    break;
                case 5:
                    iphone.tocar();
                    Thread.sleep(1000);
                    break;
                case 6:
                    iphone.pausar();
                    Thread.sleep(1000);
                    break;
                case 7:
                    iphone.exibirPagina();
                    Thread.sleep(1000);
                    break;
                case 8:
                    iphone.adicionarNovaAba();
                    Thread.sleep(1000);
                    break;
                case 9:
                    iphone.atualizarPagina();
                    Thread.sleep(1000);
                    break;
                case 0:
                    System.out.println("Desligando dispositivo");
                    Thread.sleep(900);
                    break;
                default:
                    System.out.println("Opção inválida. Insira um número de 0 a 9.");
                    Thread.sleep(1000);
            }
        } while (opcao != 0);

        scanner.close();
    }
}
