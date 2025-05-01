package org.lupoi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    @author user
    @project RomanToInteger
    @class ConverterTest
    @version 1.0.0
    @since 10.04.2025 - 12.27
*/

class ConverterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whenRoman_EmptyString_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("");
        });
    }

    @Test
    void whenRoman_NullInput_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic(null);
        });
    }

    @Test
    void whenRoman_ContainsInvalidLetter_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("ABCD");
        });
    }

    @Test
    void whenRoman_LowerCaseLetters_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("xiv");
        });
    }

    @Test
    void whenRoman_IncorrectSequence_IIV_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("IIV");
        });
    }

    @Test
    void whenRoman_IncorrectSequence_VV_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("VV");
        });
    }

    @Test
    void whenRoman_InvalidRepetitionMoreThanThreeTimes_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("IIII");
        });
    }

    @Test
    void whenRoman_NonRomanSymbols_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("123");
        });
    }

    @Test
    void whenRoman_MixedRomanAndDigits_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("X1I");
        });
    }

    @Test
    void whenRoman_SpecialCharacters_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.convertRomanToArabic("X@#");
        });
    }


}