package de.benni;

public class Tools {


    /**
     * Returns the text without any special characters.
     * @param text Input text
     * @return Text without special characters
     */
    public String deleteSpecialCharacters(String text) {
        StringBuilder text_no_special_chars = new StringBuilder();
        String allowed_chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for (char c : this.toCharArray(text)) {
            if (allowed_chars.indexOf(c) != -1) {
                text_no_special_chars.append(c);
            }
        }
        return text_no_special_chars.toString();
    }

    /**
     * Returns the text in lower case
     * @param text Input text
     * @return Text in lower case
     */
    public String toLower(String text) {
        return text.toLowerCase();
    }

    /**
     * Reverses the input
     * @param text Input text
     * @return Reversed text
     */
    public String strReverse(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int index = text.length()-1; index >= 0; index--) {
            reversed.append(text.charAt(index));
        }
        return reversed.toString();
    }

    /**
     * Returns a substring of the text from left with specified length
     * @param text Input text
     * @param length Length of the substring
     * @return The substring of the text
     * @throws IndexOutOfBoundsException Thrown if length > text.length()
     */
    public String left(String text, int length) throws IndexOutOfBoundsException {
        StringBuilder links = new StringBuilder();
        if(length > text.length())
            throw new IndexOutOfBoundsException();
        for (int index = 0; index < length; index++) {
            links.append(text.charAt(index));
        }
        return links.toString();
    }

    /**
     * Returns a substring of the text from right with specified length
     * @param text Input text
     * @param length Length of the substring
     * @return The substring of the text
     * @throws IndexOutOfBoundsException Thrown if length > text.length()
     */
    public String right(String text, int length) throws IndexOutOfBoundsException {
        StringBuilder rechts = new StringBuilder();
        if(length > text.length())
            throw new IndexOutOfBoundsException();
        for (int index = text.length()-length; index < text.length(); index++) {
            rechts.append(text.charAt(index));
        }
        return rechts.toString();
    }

    /**
     * Returns the length of the given text
     * @param text Input text
     * @return Length of the text
     */
    public int length(String text) {
        return text.length();
    }

    /**
     *
     * Returns a substring of the text from right with specified length
     * @param text Input text
     * @param start Start index (1 based)
     * @param length Length of the substring
     * @return The substring of the text
     * @throws IndexOutOfBoundsException Thrown if length > text.length()-start
     */
    public String subString(String text, int start, int length) throws IndexOutOfBoundsException {
        StringBuilder subString = new StringBuilder();
        if(length > text.length()-start)
            throw new IndexOutOfBoundsException();
        for (int index = start-1; index < (start+length)-1; index++) {
            subString.append(text.charAt(index));
        }
        return subString.toString();
    }

    /**
     * Returns the chars of the text as array
     * @param text Input text
     * @return Array of chars
     */
    public char[] toCharArray(String text) {
        return text.toCharArray();
    }
}
