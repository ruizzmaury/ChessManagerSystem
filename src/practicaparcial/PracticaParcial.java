package practicaparcial;

import java.util.ArrayList;
import java.util.List;
import model.game.Partida;
import model.users.UsersRepositoryImpl;
import model.users.Partner;
import model.users.Player;
import model.users.Referee;
import model.users.User;
import repository.UsersRepository;
import view.UsersWindow;

/**
 *
 * @author Bernat Galmés Rubert
 */
public class PracticaParcial {

    UsersRepository users;
    List<Partida> partides;

    public PracticaParcial() throws Exception {
        this.users = loadUsers();
        this.partides = loadGames();
    }

    public void run() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UsersWindow(users).setVisible(true);
            }
        });
    }

    private List<Partida> loadGames() throws Exception {
        List<Partida> partides = new ArrayList<>();
        List<DataLoader.GameData> gamesData = DataLoader.gamesLoader();
        for (DataLoader.GameData gameData : gamesData) {
            // TODO: Codi per emplenar la llista de partides
            
            partides.add(new Partida(gameData.idPartida, users.findOne(gameData.jugador1),
                    users.findOne(gameData.jugador2), users.findOne(gameData.arbitre),gameData.tauler));
            
        }

        return partides;
    }

    private static UsersRepository loadUsers() throws Exception {
        List<User> users = new ArrayList<>();
        List<DataLoader.UserData> usersData = DataLoader.usersLoader();
        for (DataLoader.UserData userData : usersData) {
            // TODO: Codi per emplenar la llista d'usuaris
            switch (userData.tipus) {
                case "0":
                    users.add(new Player(
                            userData.id, userData.nom, userData.llinatges,
                            userData.correuElectronic, userData.numAccessos, "Jugador"));
                    break;
                case "1":
                    users.add(new Partner(
                            userData.id, userData.nom, userData.llinatges,
                            userData.correuElectronic, userData.numAccessos, "Soci"));
                    break;
                case "2":
                    users.add(new Referee(
                            userData.id, userData.nom, userData.llinatges,
                            userData.correuElectronic, userData.numAccessos, "Arbitre"));
                    break;
            }

        }

        // TODO: Contruir i retornar l'objecte amb el repository
        UsersRepositoryImpl userRepo = new UsersRepositoryImpl(users);
        return userRepo;
    }

    public static void main(String[] args) throws Exception {
        PracticaParcial m = new PracticaParcial();
        m.run();
    }

}
