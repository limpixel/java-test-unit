package org.project;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class StringClassTest  {

    @Test
    public void testNullInput(){
        StringClass stringClass = new StringClass();
        assertThrows(IllegalArgumentException.class, ()-> {
            stringClass.getStringValue(null);
        });
    }

    @Test
    public void testEmptyString(){
        StringClass stringClass = new StringClass();
        assertEquals("Empty String", stringClass.getStringValue(""));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "world", "mamaku", "sangat cantik"})
    public void testValidString(String word){
        StringClass stringClass = new StringClass();
        assertEquals(word.toUpperCase(), stringClass.getStringValue(word));
    }

    @Test
    public void testWhiteSpace() {
        StringClass stringClass = new StringClass();
        assertEquals("WhiteSpace", stringClass.getStringValue("  "));
    }



}