package org.jossegonnza;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationAppTest {

    @Test
    void password_should_be_correct() {
        PasswordValidation passwordValidation = new PasswordValidation();

        Assertions.assertThat(passwordValidation.validation("Isgood_8")).isEqualTo(true);
    }

    @Test
    void password_should_be_at_least_8_characters_long() {
        PasswordValidation passwordValidation = new PasswordValidation();

        Assertions.assertThat(passwordValidation.validation("Isg_8")).isEqualTo(false);
    }

}
