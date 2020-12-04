/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.users;

import java.util.List;
import model.chesspieces.Piece;
import model.game.Partida;

/**
 *
 * @author mauri
 */
public class Player extends User {

    private Partida[] games;
    private List<Piece> pieces;

    

    public Player(long ID, String name, String surname, String mailAdr, long numAccess, String type) {
        super(ID, name, surname, mailAdr, numAccess, type);
    }

    public Partida[] getGames() {
        return games;
    }

    public void setGames(Partida[] games) {
        this.games = games;
    }
    
    public List<Piece> getPieces() {
        return pieces;
    }

    public int numGamesWon(Partida[] gamesPlayed) {
        int numGamesWon = 0;

        for (Partida gamesPlayed1 : gamesPlayed) {
            if (gamesPlayed1.isIsOver()) {
                numGamesWon++;
            }
        }

        return numGamesWon;
    }

    public int numUnfinishedGames(Partida[] gamesPlayed) {
        int numUnfinishedGames = 0;

        for (Partida gamesPlayed1 : gamesPlayed) {
            if (!gamesPlayed1.isIsOver()) {
                numUnfinishedGames++;
            }
        }

        return numUnfinishedGames;
    }
}
