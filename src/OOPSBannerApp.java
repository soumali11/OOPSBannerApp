/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate
 * character-to-pattern mappings. The application retrieves and displays the "OOPS"
 * banner using these mappings. This approach enhances code organization and modularity.
 *
 * @author Soumali
 * @version 7.0
 */



public class OOPSBannerApp {
    static class CharacterPatternMap {
        Character character;
        String[] pattern;
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
        public Character getCharacter() {
            return character;
        }
        public String[] getPattern() {
            return pattern;
        }
        public static CharacterPatternMap[] createCharacterPatternMaps() {
            return new CharacterPatternMap[] {
                new CharacterPatternMap('O', new String[] {
                    "   ***   ",
                    " **   ** ",
                    " **   ** ",
                    " **   ** ",
                    " **   ** ",
                    " **   ** ",
                    "   ***   "
                }),
                new CharacterPatternMap('P', new String[] {
                    " *****   ",
                    " **  **  ",
                    " **   ** ",
                    " ** **   ",
                    " **      ",
                    " **      ",
                    " **      "
                }),
                new CharacterPatternMap('S', new String[] {
                    "   ***   ",
                    " **    **",
                    " **      ",
                    "    **   ",
                    "      ** ",
                    " **   ** ",
                    "   ***   "
                })
            };
        }
        public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
            for (CharacterPatternMap map : charMaps) {
                if (map.getCharacter() == ch) {
                    return map.getPattern();
                }
            }
            return new String[0]; // Return empty pattern if character not found
        }             
        public static void printMessage(String message, CharacterPatternMap[] charMaps) {
            StringBuilder[] bannerLines = new StringBuilder[7];
            for (int i = 0; i < bannerLines.length; i++) {
                bannerLines[i] = new StringBuilder();
            }
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                for (int i = 0; i < bannerLines.length; i++) {
                    bannerLines[i].append(pattern[i]).append("  ");
                }
            }
            for (StringBuilder line : bannerLines) {
                System.out.println(line.toString());
            }
        }
    }
    public static void main(String[] args){
        CharacterPatternMap[] charMaps = CharacterPatternMap.createCharacterPatternMaps();
        String message = "OOPS";
        CharacterPatternMap.printMessage(message, charMaps);
    }
}