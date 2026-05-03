package Practic01.Task8;

import java.util.List;

public class Login {

    public static void login (List <Student> list, String username, String password) {

        for (Student s : list) {
            if (list.contains(username) && list.contains(password)) {
                return;
            }
        }

        throw new UserNotFoundException("USER_NOT_FOUND");
    }
}
