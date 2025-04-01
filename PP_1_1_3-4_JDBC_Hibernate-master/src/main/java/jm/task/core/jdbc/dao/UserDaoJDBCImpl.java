package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/*public class UserDaoJDBCImpl implements UserDao {
    private Connection conn;

    public UserDaoJDBCImpl() {
   *//*     this.conn = Util.getConnection();*//*
    }

    public void createUsersTable() throws SQLException {
        String table = "CREATE TABLE users ("
                + "id BIGINT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "lastName VARCHAR(100) NOT NULL, "
                + "age INT"
                + ")";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(table);
        }
    }

    public void dropUsersTable() throws SQLException {
        String table = "DROP TABLE IF EXISTS users";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(table);
        }
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        String sql = "INSERT INTO users (name, lastName, age) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, lastName);
            stmt.setByte(3, age);
            int aw = stmt.executeUpdate();
        }
    }

    public void removeUserById(long id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            int aw = stmt.executeUpdate();
        }
    }

    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try (PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String lastName = resultSet.getString("lastName");
                byte age = resultSet.getByte("age");
                users.add(new User(name, lastName, age));
            }
        }
        return users;
    }

    public void cleanUsersTable() throws SQLException {
        String sql = "DELETE FROM users";
        try
                (PreparedStatement statement = conn.prepareStatement(sql)) {

            int a = statement.executeUpdate();
        }
    }
}*/





/*public UserDaoJDBCImpl() {
        this.conn = Util.getConnection();
    }

    public void createUsersTable() throws SQLException {
        String table = "CREATE TABLE users ("
                + "id BIGINT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(100) NOT NULL, "
                + "lastName VARCHAR(100) NOT NULL, "
                + "age INT"
                + ")";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(table);
        }
    }

    public void dropUsersTable() throws SQLException {
        String table = "DROP TABLE IF EXISTS users";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(table);
        }
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        String sql = "INSERT INTO users (name, lastName, age) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, lastName);
            stmt.setByte(3, age);
            int aw = stmt.executeUpdate();
        }
    }

    public void removeUserById(long id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            int aw = stmt.executeUpdate();
        }
    }

    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try (PreparedStatement statement = conn.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String lastName = resultSet.getString("lastName");
                byte age = resultSet.getByte("age");
                users.add(new User(name, lastName, age));
            }
        }
        return users;
    }

    public void cleanUsersTable() throws SQLException {
        String sql = "DELETE FROM users";
        try
                (PreparedStatement statement = conn.prepareStatement(sql)) {

            int a = statement.executeUpdate();
        }
    }
}*/