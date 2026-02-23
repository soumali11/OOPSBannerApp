/**
 * OOPSBannerApp - Use Map for Character Patterns and Render via Function
 *
 * This use case extends UC7 by utilizing advanced Object-Oriented Programming concepts
 * such as the Collections Framework to manage character patterns in a more flexible
 * and efficient manner. The application retrieves and displays the "OOPS" banner
 * using a HashMap thereby enhancing code organization and modularity.
 *
 * @author Soumali
 * @version 8.0
 */
import java.util.HashMap;




public class OOPSBannerApp {
    public static HashMap<Character, String[]> createCharacterMap(){
        HashMap<Character, String[]> charMap = new HashMap<>();
        
        charMap.put('O', new String[]{
            "   ***   ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            "   ***   ",
        });
        
        charMap.put('P', new String[]{
            " *****   ",
            " **  **  ",
            " **   ** ",
            " ** **   ",
            " **      ",
            " **      ",
            " **      "
        });
        
        charMap.put('S', new String[]{
            "   ***   ",
            " **    **",
            " **      ",
            "    **   ",
            "      ** ",
            " **   ** ",
            "   ***   "
        });
        
        return charMap;
    }
    public static void displayBanner(String message, HashMap<Character, String[]> charMap){
        int patternHeight = charMap.get('O').length; // Assuming all characters have the same height
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder bannerLine = new StringBuilder();
            for (char ch : message.toCharArray()) {
                if (charMap.containsKey(ch)) {
                    bannerLine.append(charMap.get(ch)[line]).append("  "); // Add space between characters
                } else {
                    bannerLine.append("         "); // Add space for unsupported characters
                }
            }
            System.out.println(bannerLine.toString());
        }
    }
    public static void main(String[] args){
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
        
    }
}