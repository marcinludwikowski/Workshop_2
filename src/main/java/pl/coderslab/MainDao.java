package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class MainDao {
    public static void main(String[] args) {

        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName("Anna");
        user.setEmail("anna.kwiatkowska@coderslab.pl");
        user.setPassword("password");
        userDao.create(user);

        User read = userDao.read(85);
        System.out.println(read);

        User readNotExist = userDao.read(86);
        System.out.println(readNotExist);

        User userToUpdate = userDao.read(85);

        System.out.println(userToUpdate);

        userToUpdate.setUserName("Jan");
        userToUpdate.setEmail("jan.kowalski@op.pl");
        userToUpdate.setPassword("password");
        userDao.update(userToUpdate);

        User secondUser = new User();
        secondUser.setUserName("Mariusz");
        secondUser.setEmail("mariusz.nowakowski@wp.pl");
        secondUser.setPassword("password");
        userDao.create(secondUser);

        User read2 = userDao.read(86);
        System.out.println(read2);

        User[] all = userDao.findAll();
        for (User u : all) {
            System.out.println(u);
        }

        userDao.delete(86);
    }
}