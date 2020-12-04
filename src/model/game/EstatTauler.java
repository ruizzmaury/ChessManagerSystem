package model.game;

import view.Casella;

/**
 * Representació de l'estat d'un tauler d'escacs en un instant donat.
 * 
 * Aquesta classe conté la posició de les peces sobre un tauler d'escacs
 * en un moment donat.
 * 
 * @author Bernat Galmés Rubert
 */
public class EstatTauler {
    
    private Partida game;
    private Casella[][] currentGameState;

    public EstatTauler(Partida game) {
        this.game = game;
    }

    public Partida getGame() {
        return game;
    }

    public void setGame(Partida game) {
        this.game = game;
    }
    
    
    public void getInfoGameTable(){
        currentGameState= game.getBoardGame().getCaselles();
    }
    
    
}
