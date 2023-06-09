package models;

public class User {
    //region Private fields
    private long id;

    private String name;
    private String surname;
    //Email must be unique for user, because it's used for login
    private String email;
    // Password hash
    private String pw_hash;
    private int roleId;
    //endregion

    //region Setters/Getters


    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw_hash() {
        return pw_hash;
    }

    public void setPw_hash(String pw_hash) {
        this.pw_hash = pw_hash;
    }

    //endregion

    //region Constructors
    public User(String name, String surname, String email, String pw_hash, int roleId) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.pw_hash = pw_hash;
        this.roleId = roleId;
    }
    public User(long id, String name, String surname, String email, String pw_hash, int roleId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.pw_hash = pw_hash;
        this.roleId = roleId;
    }
    //endregion

    //region Overrides
    @Override
    public String toString(){
        return "User [id = " + id + ", name = " + name + " , surname = " + surname
                +  ", email = " + email + ", pw_hash = " + pw_hash + ", role_id = " +roleId +"]";
    }
    //endregion

}
