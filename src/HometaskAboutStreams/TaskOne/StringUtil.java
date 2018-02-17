package HometaskAboutStreams.TaskOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public final class StringUtil {

    private StringUtil() {
    }
//\.|,|:|!|;| |\?
    public static final String MARKS_PUNCTUATION = "[\\pP\\s]";
    public static final String MARK_FOR_REPLACE = "";

    public static List<String> transferToListWithoutPunctuationAndSpace(List<String> lines) {
        List<String> stringsWithoutPunctuation = new ArrayList<>(lines.size());
        for (String line : lines) {
            if (!(line.equals(MARK_FOR_REPLACE))) {
                line = line.replaceAll(MARKS_PUNCTUATION, MARK_FOR_REPLACE);
                stringsWithoutPunctuation.add(new StringBuilder(line).toString().toLowerCase());
            }
        }
        return stringsWithoutPunctuation;
    }

    public static Map<Character, Integer> countSymbols(List<String> lines) {
        TreeMap<Character, Integer> russianAlphabet = new TreeMap<>();
        for (String line : lines) {
            for (int i = 0; i < line.length(); i++) {
                Character letter = line.charAt(i);
                if(!russianAlphabet.containsKey(letter)){
                    russianAlphabet.put(letter,0);
                }
                Integer numberOfSymbol = russianAlphabet.get(letter);
                russianAlphabet.put(letter, ++numberOfSymbol);
            }
        }
        return russianAlphabet;
    }

    public static void console (Map<Character, Integer> map) {
        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
