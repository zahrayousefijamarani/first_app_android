package edu.sharif.yousefi.first_app;

import java.util.HashMap;

class User {
    private String username;
    private String email;
    private String password;
    private static HashMap<String, User> users = new HashMap<>();

    User(String username, String email, String password) throws Exception{
        User user=users.get(username);
        if( user == null) {
            this.username = username;
            this.email = email;
            this.password = password;
        }
        else {
            throw new Exception(StrnigEnum.username_exist.getMessage());
        }

    }
    static User find_user(String username, String password) throws Exception{
        try{
            User user =  users.get(username);
            if (user == null){
                throw new Exception(StrnigEnum.user_not_found.getMessage());
            }
            if(user.password.equals(password)){
              return user;
            }
            else {
                throw new Exception(StrnigEnum.incorrect_password.getMessage());

            }
        }catch (Exception e){
            throw new Exception(StrnigEnum.undefine_exception.getMessage());
        }
    }
}
