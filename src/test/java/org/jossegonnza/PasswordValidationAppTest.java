package org.jossegonnza;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationAppTest {

    @Test
    void password_should_be_at_least_8_characters_long_return_true() {
        PasswordValidation passwordValidation = new PasswordValidation();

        Assertions.assertThat(passwordValidation.validation("12345678")).isEqualTo(true);
        Assertions.assertThat(passwordValidation.validation("1234567890123")).isEqualTo(true);
    }

    @Test
    void password_should_be_at_least_8_characters_long_return_false() {
        PasswordValidation passwordValidation = new PasswordValidation();

        Assertions.assertThat(passwordValidation.validation("1234567")).isEqualTo(false);
        Assertions.assertThat(passwordValidation.validation("123")).isEqualTo(false);
    }

}
