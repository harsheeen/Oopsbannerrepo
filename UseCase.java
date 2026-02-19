/**
 * OOPS banner app UC7 - Printing with inner and outer class concept
 * @author Harsheen
 * @version 7.0
 */

public class UseCase{

    // Inner static class 
		static class CharacterPatternMap {
        private char ch;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char ch, String[] pattern) {
            this.ch = ch;
            this.pattern = pattern;
        }

        // Getter - pattern
        public String[] getPattern() {
            return pattern;
        }

        // Getter - character
        public char getChar() {
            return ch;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        String[] O = { 
            "   ***   ",
            " **   **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            "**     **",
            " **   **",
            "   ***   " 
        };

        String[] P = {
            " ******   ",
            " **    **",
            " **     **",
            " **    **",
            " ***** ",
            " **     ",
            " **     ",
            " **     ",
            " **   "
        };

        String[] S = {
            " ******     ",
            " **         ",
            " **         ",
            " **         ",
            " ******    ",
            "     **     ",
            "     **     ",
            "     **     ",
            " ******   "
        };

        CharacterPatternMap o = new CharacterPatternMap('O', O);
        CharacterPatternMap p = new CharacterPatternMap('P', P);
        CharacterPatternMap s = new CharacterPatternMap('S', S);

        return new CharacterPatternMap[]{o, p, s};
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getChar() == ch) {
            return map.getPattern();
            }
        }
    return null; // if character not found
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        // Assume all patterns have the same number of rows
        int rows = charMaps[0].getPattern().length;

    for (int row = 0; row < rows; row++) {
    StringBuilder line = new StringBuilder();
         for (char ch : message.toCharArray()) {
         String[] pattern = getCharacterPattern(ch, charMaps);
          if (pattern != null) {
           line.append(pattern[row]).append("  ");
                }
            }
    System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        printMessage("OOPS", charMaps);
    }
}
