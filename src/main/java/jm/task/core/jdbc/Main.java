package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserService user = new UserServiceImpl();

        user.createUsersTable();
        user.saveUser("Имя1", "Фамилия1", (byte) 43);
        user.saveUser("Имя2", "Фамилия2", (byte) 44);
        user.saveUser("Имя3", "Фамилия3", (byte) 5);
        user.saveUser("Имя4", "Фамилия4", (byte) 8);
        user.saveUser("Имя5", "Фамилия4", (byte) 8);
        user.removeUserById(5);
        user.getAllUsers();
        user.cleanUsersTable();
        user.dropUsersTable();
    }
}