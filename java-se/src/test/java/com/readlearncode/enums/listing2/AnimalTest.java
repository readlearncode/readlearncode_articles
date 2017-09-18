package com.readlearncode.enums.listing2;

import org.junit.Test;

import static com.readlearncode.enums.listing2.Animal.DOG;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class AnimalTest {

    @Test
    public void givenEnumConstantToStringOverwritten_whenCallNameAndToString_shouldReturnDifferentValue() {
        assertThat(DOG.toString()).isNotEqualTo(DOG.name());
    }

    @Test
    public void givenEnumConstantAndString_whenPassedToValueOf_shouldReturnEnumConstant() {
        assertThat(DOG).isEqualTo(Animal.valueOf("DOG"));
    }

    @Test
    public void givenEnumConstantAndString_whenPassedToValueOf_shouldReturnThrownException() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> Animal.valueOf("Dog"));
    }
}
