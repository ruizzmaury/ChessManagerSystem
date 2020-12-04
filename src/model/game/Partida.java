package model.game;

import model.chesspieces.Knight;
import model.users.Player;
import model.users.Referee;
import model.users.User;
import view.ChessBoardPanel;

/**
 * Classe que representa una partida del joc.
 *
 * Aquesta classe conté els jugadors que estan jugant la partida i l'estat del
 * tauler en aquest instant de la partida.
 *
 * @author Bernat Galmés Rubert
 */
public class Partida {

    private long gameID;
    private Player playerWhite;
    private Player playerBlack;
    private Referee referee;

    private boolean isOver;
    private Player winner;
    private EstatTauler currentBoardState;
    private String boardTemp;

    private ChessBoardPanel boardGame;

    public Partida(
            long id, User playerWhite, User playerBlack,
            User referee, String actualState) {
        this.gameID = id;
        this.playerWhite = (Player) playerWhite;
        this.playerBlack = (Player) playerBlack;
        this.referee = (Referee) referee;
        this.boardTemp = actualState;
    }
    
    
    public void buildBoard(String boardCode) {
        String[] finalBoard;
        finalBoard = boardCode.split(" \\-");
        
        
    }
    
    
    public User getPlayerWhite() {
        return playerWhite;
    }

    public void setPlayerWhite(Player playerWhite) {
        this.playerWhite = playerWhite;
    }

    public User getPlayerBlack() {
        return playerBlack;
    }

    public void setPlayerBlack(Player playerBlack) {
        this.playerBlack = playerBlack;
    }

    public EstatTauler getCurrentBoardState() {
        return currentBoardState;
    }

    public void setEstatActual(EstatTauler currentBoard) {
        this.currentBoardState = currentBoard;
    }

    public boolean isIsOver() {
        return isOver;
    }

    public void setIsOver(boolean isOver) {
        this.isOver = isOver;
    }

    public Player getWinner() {
        return winner;
    }

    public ChessBoardPanel getBoardGame() {
        return boardGame;
    }

    public boolean isLoser(Player player) {

        for (int i = 0; i < player.getPieces().size(); i++) {
            if ("Rei".equals(player.getPieces().get(i).getPieceName())) {
                return false;
            }
        }
        return true;
    }
}
