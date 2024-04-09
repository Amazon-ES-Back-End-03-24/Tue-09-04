package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void concatenateNameWithStringValuesOk() {
        String lastName = "Cotelo";
        Assertions.assertEquals("Jon Cotelo", User.concatenateName("Jon", lastName));
        Assertions.assertEquals("Anna Shaw", User.concatenateName("Anna", "Shaw"));
    }

    @Test
    void concatenateNameWithNullValuesThrowsIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> User.concatenateName(null, "Grillo"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> User.concatenateName("Pepito", null));
        Assertions.assertThrows(IllegalArgumentException.class, () -> User.concatenateName(null, null));
    }
}
