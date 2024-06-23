package org.jossegonnza;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidationAppTest {

    @Test
    void password_should_be_correct() {
        PasswordValidation passwordValidation = new PasswordValidation();

        Assertions.assertThat(passwordValidation.validation("Isgood_8")).isEqualTo(true);
    }

}
