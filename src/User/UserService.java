package User;
import java.util.*;

public class UserService {
private final Hashtable<Integer,User> usersDb;

public  UserService(){
    usersDb = new Hashtable<Integer, User>();
 usersDb.put(1,new User(1,"Brian","Ojeda","brianojeda1204@gmail.com","62487101"));
 usersDb.put(2,new User(2,"Leo","Messi","leomessi456@gmail.com","38373"));
 usersDb.put(3,new User(3,"Midu","Dev","midudev678@gmail.com","344767"));
}
public User getUserById(int id){
    if (id <=0 || id % 1 != 0){
        throw new IllegalArgumentException("Invalid ID format, id should be a positive integer");
    }
    if (!usersDb.containsKey(id)){
        throw new IllegalArgumentException("The user by id="+ id + " ,does not exist");
    }
    return usersDb.get(id);
}
public String save(User user){
    usersDb.put(user.getId(),user);
    return "The user was saved successfully";
}
public String delete(int id){
    if (id <=0 || id % 1 != 0){
    throw new IllegalArgumentException("Invalid ID format, id should be a positive integer");
    }
      if (usersDb.isEmpty()) {
          throw new IllegalArgumentException("No users to delete");
      }
      if (!usersDb.containsKey(id)){
          throw new IllegalArgumentException("User with id=" + id + " does not exist, cannot be deleted");
      }
      String removeInfo = "The user with id=" + id + " ,was deleted";
    usersDb.remove(id);
    return removeInfo;
}
public List<User> getAll(){
    if (usersDb.isEmpty()) {
        throw new IllegalArgumentException("there are no users in the database");
    }
    return new ArrayList<>(usersDb.values());
}
}
