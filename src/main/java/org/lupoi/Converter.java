package org.lupoi;/*
    @author user
    @project RomanToInteger
    @class Converter
    @version 1.0.0
    @since 10.04.2025 - 12.17
*/

import java.util.List;

public class Converter {

    public static int convertRomanToArabic(String roman) {
        String romanNumeral = roman.toUpperCase();
        int result = 0;

        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanNumeral symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        if (romanNumeral.length() > 0) {
            throw new IllegalArgumentException(roman + " cannot be converted to a Roman Numeral");
        }

        return result;
    }
}
