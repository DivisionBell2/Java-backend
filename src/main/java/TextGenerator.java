import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public interface TextGenerator {

    default String generateEmail() {
        return RandomStringUtils.randomAlphabetic(10).concat("@test.test");
    }

    default String generateMobilePhone() {
        return "9".concat(RandomStringUtils.randomNumeric(9));
    }

    default String generateInvalidMobileCode() {
        String authToken;
        do {
            authToken = String.valueOf(new Random().nextInt(9999));
        } while (authToken.equals("1111"));
        return authToken;
    }
}
