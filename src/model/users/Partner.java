/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.users;

/**
 *
 * @author mauri
 */
public class Partner extends User {

    public Partner(long ID, String name, String surname, String mailAdr, long numAccess, String type) {
        super(ID, name, surname, mailAdr, numAccess, type);
    }

}
