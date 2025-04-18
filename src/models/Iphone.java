package models;

import interfaces.AparelhoTelefonico;
import interfaces.MusicPlayer;
import interfaces.NavegadorInternet;

public final class Iphone implements MusicPlayer, AparelhoTelefonico, NavegadorInternet {

    private static long contador = 1L;

    private String modelo = "iPhone 2G";
    private String versaoOS = "iPhone OS 1.0";
    private static long serialNumber = contador++;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVersaoOS() {
        return versaoOS;
    }

    public void setVersaoOS(String versaoOS) {
        this.versaoOS = versaoOS;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        Iphone.serialNumber = serialNumber;
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Em andamento...");
        }
        System.out.println("Atualização concluída!");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Chamando...");
        }
        System.out.println("Ligação concluída!");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("...");
        }
        System.out.println("Você tem uma mensagem no correio de voz.");
    }

    @Override
    public void tocar(Musica musica) {
        if (musica.getArtista() == null) {
            System.out.println("Tocando a música: " + musica.getNome());
        } else {
            System.out.println("Tocando a música: " + musica.getNome() + " de " + musica.getArtista());
        }
    }

    @Override
    public void pausar(Musica musica) {
        if (musica.getArtista() == null) {
            System.out.println("Pausando a música: " + musica.getNome());
        } else {
            System.out.println("Pausando a música: " + musica.getNome() + " de " + musica.getArtista());
        }
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.println("Selecionando " + musica.getNome() + " para ouvir.");
    }
}
