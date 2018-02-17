package HometaskAboutStreams.TaskTwo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public final class NumberUtil {

    private static final String DELIMETER = " ";

    public NumberUtil() {
    }

    public static void randomWriter(File file, Integer count, Integer maxValue) throws IOException {
        Random random = new Random();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < count; i++) {
            writer.append(intToString(random.nextInt(maxValue)));
        }
        writer.flush();
        writer.close();
    }

    private static String intToString(int num) { return Integer.toString(num).concat(DELIMETER); }

    public static List<Integer> readNumbersFromFile(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<Integer> list = new ArrayList<>();
        while (reader.ready()) {
            String[] temp = reader.readLine().split(DELIMETER);
            list = Arrays.stream(temp)
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());
        }
        return list;
    }
}
