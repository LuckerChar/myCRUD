package my.dao;

import my.models.User;

import java.util.List;

public interface UserDao {
   void saveUser(User user);
   void updateUser(long id, User user);
   User getUser(long id);
   void removeUser(long id);
   List<User> getAllUsers();
}
