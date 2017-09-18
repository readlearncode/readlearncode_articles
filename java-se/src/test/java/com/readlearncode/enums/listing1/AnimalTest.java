package com.readlearncode.enums.listing1;


import org.junit.Test;

import static com.readlearncode.enums.listing1.Animal.DOG;
import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class AnimalTest {

    @Test
    public void givenEnumConstant_whenCallNameAndToString_shouldReturnSameValue() {
        assertThat(DOG.toString()).isEqualTo(DOG.name());
    }

}
