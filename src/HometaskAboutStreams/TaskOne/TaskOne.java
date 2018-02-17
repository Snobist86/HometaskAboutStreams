package HometaskAboutStreams.TaskOne;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class TaskOne {

    public static void main(String[] args) throws IOException {
        Path sourcePath = Paths.get("resources", "taskOne","poem.txt");

        List<String> lines = Files.readAllLines(sourcePath);
        List<String> stringsWithoutPunctuation = StringUtil.transferToListWithoutPunctuationAndSpace(lines);
        Map<Character,Integer> countSymbols = StringUtil.countSymbols(stringsWithoutPunctuation);
        StringUtil.console(countSymbols);
    }
}
