package User;

import java.util.ArrayList;

public class User {
    private int id;
    private  String firstName, lastName, email, phone;
    private ArrayList<Role> roles;

    public User(int id, String firstName, String lastName, String email, String phone){
        if (id <=0 || id % 1 != 0){
            throw new IllegalArgumentException("Invalid ID format, id should be a positive integer");
        }
        if (firstName == null || firstName.isEmpty()){
            throw  new IllegalArgumentException("First name cannot be null or empty");
        }
        if (lastName == null || lastName.isEmpty()){
            throw  new IllegalArgumentException("Last name cannot be null or empty");
        }
        if (email == null || email.isEmpty()){
            throw  new IllegalArgumentException("Email cannot be null or empty");
        }
        if (phone == null ||phone.isEmpty()){
            throw  new IllegalArgumentException("Phone cannot be null or empty");
        }
        this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phone = phone;
    this.roles = new ArrayList<>();
    }

    public int getId() {return  id;}
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Role> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
    }

    public String addRole(Role role){
        this.roles.add(role);
        return "Role assigned correctly";
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("User{");
        sb.append("id=").append(id);
        sb.append(", First name='").append(firstName).append('\'');
        sb.append(", Last name='").append(lastName).append('\'');
        sb.append(", Email='").append(email).append('\'');
        sb.append(", Phone='").append(phone).append('\'');
        sb.append(", Roles=").append(roles);
        sb.append('}');
        return  sb.toString();
    }
}
