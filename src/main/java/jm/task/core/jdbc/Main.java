package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args)  {
        UserDao userDao = new UserDaoHibernateImpl();
        userDao.createUsersTable();
        userDao.saveUser("Vasily", "Pupkin", (byte) 20);
        userDao.saveUser("Geralt", "OfRivia", (byte) 40);
        userDao.saveUser("Yennefer", "OfVengerberg", (byte) 31);
        userDao.saveUser("Jaskier", "JustJaskier", (byte) 25);
        System.out.println(userDao.getAllUsers());
        userDao.removeUserById(1);
        System.out.println(userDao.getAllUsers());
        //userDao.getAllUsers();
        //System.out.println(userDao.getAllUsers());
        //userDao.cleanUsersTable();
        //System.out.println(userDao.getAllUsers());
        //userDao.dropUsersTable();
    }
}
