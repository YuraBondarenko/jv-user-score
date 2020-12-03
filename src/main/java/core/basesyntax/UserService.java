package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email)
            throws UserNotFoundException {
        boolean emailIsCorrect = false;
        int index = 0;
        for (int i = 0; i < records.length; i++) {
            index = records[i].indexOf(':');
            if (email.equals(records[i].substring(0,index))) {
                return Integer.valueOf(records[i].substring(index + 1));
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
