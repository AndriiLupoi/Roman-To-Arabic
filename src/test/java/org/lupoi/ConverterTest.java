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

    /*
    *  1 - I
    *  2 - II
    *  3 - III
    *  4 - IV
    *  5 - V
    *  І так далі...... В тестах буде видно)
    * */

    @Test
    void whenRoman_V_ThenArabic_5() {
        Assertions.assertEquals(5,Converter.convertRomanToArabic("V"));
    }

    @Test
    void whenRoman_I_ThenArabic_1() {
        Assertions.assertEquals(1,Converter.convertRomanToArabic("I"));
    }

    @Test
    void whenRoman_II_ThenArabic_2() {
        Assertions.assertEquals(2,Converter.convertRomanToArabic("II"));
    }

    @Test
    void whenRoman_III_ThenArabic_3() {
        Assertions.assertEquals(3,Converter.convertRomanToArabic("III"));
    }

    @Test
    void whenRoman_IV_ThenArabic_4() {
        Assertions.assertEquals(4,Converter.convertRomanToArabic("IV"));
    }

    @Test
    void whenRoman_VI_ThenArabic_6() {
        Assertions.assertEquals(6,Converter.convertRomanToArabic("VI"));
    }

    @Test
    void whenRoman_IX_ThenArabic_9() {
        Assertions.assertEquals(9,Converter.convertRomanToArabic("IX"));
    }

    @Test
    void whenRoman_X_ThenArabic_10() {
        Assertions.assertEquals(10,Converter.convertRomanToArabic("X"));
    }

//    XL L  XC  C  CD D  CM M

    @Test
    void whenRoman_XL_ThenArabic_40() {
        Assertions.assertEquals(40,Converter.convertRomanToArabic("XL"));
    }

    @Test
    void whenRoman_L_ThenArabic_50() {
        Assertions.assertEquals(50,Converter.convertRomanToArabic("L"));
    }

    @Test
    void whenRoman_XC_ThenArabic_90() {
        Assertions.assertEquals(90,Converter.convertRomanToArabic("XC"));
    }

    @Test
    void whenRoman_C_ThenArabic_100() {
        Assertions.assertEquals(100,Converter.convertRomanToArabic("C"));
    }

    @Test
    void whenRoman_CD_ThenArabic_400() {
        Assertions.assertEquals(400,Converter.convertRomanToArabic("CD"));
    }

    @Test
    void whenRoman_D_ThenArabic_500() {
        Assertions.assertEquals(500,Converter.convertRomanToArabic("D"));
    }

    @Test
    void whenRoman_CM_ThenArabic_900() {
        Assertions.assertEquals(900,Converter.convertRomanToArabic("CM"));
    }

    @Test
    void whenRoman_M_ThenArabic_1000() {
        Assertions.assertEquals(1000,Converter.convertRomanToArabic("M"));
    }
}