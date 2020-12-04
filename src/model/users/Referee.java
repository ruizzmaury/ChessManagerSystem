/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.users;

import model.game.Partida;

/**
 *
 * @author mauri
 */
public class Referee extends User {
    
    private Partida[] refereedGames;

    public Referee(long ID, String name, String surname, String mailAdr, long numAccess, String type) {
        super(ID, name, surname, mailAdr, numAccess, type);
    }

    
    

    public Partida[] getRefereedGames() {
        return refereedGames;
    }

    public void setRefereedGames(Partida[] refereedGames) {
        this.refereedGames = refereedGames;
    }
    
    
}
