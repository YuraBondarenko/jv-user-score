package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        for (int i = 0; i < records.length; i++) {
            String[] delimiter = records[i].split(":");
            if (email.equals(delimiter[0])) {
                return Integer.valueOf(delimiter[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
