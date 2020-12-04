/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.users;

import java.util.List;
import repository.UsersRepository;

/**
 *
 * @author mauri
 */
public class UsersRepositoryImpl implements UsersRepository {
    private List<User> users;

    public UsersRepositoryImpl(List<User> users) {
        this.users = users;
    }

    @Override
    public User findOne(long id) throws NotFoundException {
        for(int i = 0; i<users.size(); i++){
            if(users.get(i).getID() == id) {
                return users.get(i);
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public float[] meanAccessByClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String findUserWithMaxAccess() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> findUsersWithNoAccess() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String findUserWithMaxWins() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
