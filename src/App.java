import models.Iphone;
import models.Musica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                1 - Ligação;
                2 - Ouvir Música;
                3 - Navegar na internet;

                O que deseja fazer?
                Resposta: """);

        try {
            var iphone = new Iphone();
            short resposta = sc.nextShort();

            switch (resposta) {
                case 1 -> {
                    sc.nextLine();

                    System.out.println("""
                        Escolha uma ação:
                        1 - Fazer uma ligação
                        2 - Atender chamada recebida
                        3 - Ouvir correio de voz
                        """);
                    int telefoneOpcao = sc.nextInt();
                    sc.nextLine();

                    switch (telefoneOpcao) {
                        case 1 -> {
                            System.out.print("Digite o número para ligar: ");
                            String numero = sc.nextLine();
                            iphone.ligar(numero);
                        }
                        case 2 -> {
                            System.out.println("📞 Recebendo chamada...");
                            System.out.print("Deseja atender? (1 - Sim / Qualquer tecla - Não): ");
                            int atender = sc.nextInt();

                            if (atender == 1) {
                                iphone.atender();
                            } else {
                                System.out.println("Chamada ignorada.");
                            }
                        }
                        case 3 -> {
                            System.out.println("📩 Você tem uma nova mensagem no correio de voz.");
                            System.out.print("Deseja ouvir? (1 - Sim / Qualquer tecla - Não): ");
                            int ouvir = sc.nextInt();

                            if (ouvir == 1) {
                                iphone.iniciarCorreioVoz();
                            } else {
                                System.out.println("Mensagem de voz ignorada.");
                            }
                        }
                        default -> System.out.println("Opção inválida.");
                    }
                    break;
                }

                case 2 -> {
                    sc.nextLine();
                    System.out.print("Digite o nome da música: ");
                    String nomeMusica = sc.nextLine();

                    System.out.print("Digite o nome do artista: ");
                    String artista = sc.nextLine();

                    var musica = new Musica(nomeMusica, artista);

                    iphone.selecionarMusica(musica);
                    iphone.tocar(musica);
                    iphone.pausar(musica);
                    
                    break;
                }

                case 3 -> {
                    System.out.println("""
                        Escolha uma ação:
                        1 - Exibir Página
                        2 - Adicionar Nova Aba
                        """);
                    int navegadorOpcao = sc.nextInt();
                    sc.nextLine();

                    switch (navegadorOpcao) {
                        case 1 -> {
                            System.out.print("Digite a URL: ");
                            String url = sc.nextLine();
                            iphone.atualizarPagina();
                            iphone.exibirPagina(url);
                        }
                        case 2 -> {
                            iphone.adicionarNovaAba();
                            iphone.atualizarPagina();
                        }
                        default -> System.out.println("Opção inválida.");
                    }
                    break;
                }
                default -> System.out.println("Opção inválida. Rode o programa novamente.");
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Entrada inválida. Por favor, siga o formato esperado.");
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Erro: " + illegalArgumentException.getMessage());
        } finally {
            sc.close();
        }
    }
}
