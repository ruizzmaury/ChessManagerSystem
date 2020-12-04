package model.users;

import java.util.Random;
import repository.UsersRepository;

/**
 * Classe que representa un usuari de l'aplicació.
 *
 * @author Bernat Galmés Rubert
 */
public abstract class User {

    private final long ID;
    private String name;
    private String surname;
    private String mailAdr;
    private long numAccess;
    private String type;

    public User(long ID, String name, String surname, String mailAdr, long numAccess, String type) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.mailAdr = mailAdr;
        this.numAccess = numAccess;
        this.type = type;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMailAdr() {
        return mailAdr;
    }

    public void setMailAdr(String mailAdr) {
        this.mailAdr = mailAdr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getNumAccess() {
        return numAccess;
    }

    public void setNumAccess(int numAccess) {
        this.numAccess = numAccess;
    }

}
