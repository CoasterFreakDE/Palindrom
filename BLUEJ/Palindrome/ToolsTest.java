 

import static org.junit.jupiter.api.Assertions.*;

class ToolsTest {

    private Tools tools;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.tools = new Tools();
    }

    @org.junit.jupiter.api.Test
    void deleteSpecialCharacters() {
        String toTest = "2wed%%2 23";
        assertEquals("2wed223", this.tools.deleteSpecialCharacters(toTest));
    }

    @org.junit.jupiter.api.Test
    void toLower() {
        String toTest = "DSSdsa23wdsDAS";
        assertEquals("dssdsa23wdsdas", this.tools.toLower(toTest));
    }

    @org.junit.jupiter.api.Test
    void strReverse() {
        String toTest = "hallo";
        assertEquals("ollah", this.tools.strReverse(toTest));
    }

    @org.junit.jupiter.api.Test
    void left() {
        String toTest = "hallo";
        assertEquals("hal", this.tools.left(toTest, 3));
    }

    @org.junit.jupiter.api.Test
    void right() {
        String toTest = "hallo";
        assertEquals("llo", this.tools.right(toTest, 3));
    }

    @org.junit.jupiter.api.Test
    void length() {
        String toTest = "hallo";
        assertEquals(5, this.tools.length(toTest));
    }

    @org.junit.jupiter.api.Test
    void subString() {
        String toTest = "hallo";
        assertEquals("ll", this.tools.subString(toTest, 3, 2));
    }

    @org.junit.jupiter.api.Test
    void toCharArray() {
        String toTest = "hallo";
        assertArrayEquals(toTest.toCharArray(), this.tools.toCharArray(toTest));
    }
}