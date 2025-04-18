package interfaces;

import models.Musica;

public interface MusicPlayer {
    void tocar(Musica musica);

    void pausar(Musica musica);

    void selecionarMusica(Musica Musica);
}
