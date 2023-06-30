package test;

import models.User;
import repository.UserRepository;

public class UserRepositoryTest {

    public static void main(String[] args) {
        User user = new User();
        UserRepository ur = new UserRepository();

        try {
            // ur.saveUser(user);
            // String response = ur.getUsers();
            String response = ur.getRanking();
            System.out.println(response);
        } catch (Exception e) {
            System.out.println("Deu ruim");
        }
    }
}
