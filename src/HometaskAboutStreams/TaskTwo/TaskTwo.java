package HometaskAboutStreams.TaskTwo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import static java.lang.String.join;


public class TaskTwo {

    public static void main(String[] args) {
        try {
            File randomFile = new File(join(File.separator, "resources", "taskTwo", "randomFile.txt"));
            FileOutputStream fos = new FileOutputStream(randomFile);
            NumberUtil.randomWriter(randomFile,10,100);
            List<Integer> listInt = NumberUtil.readNumbersFromFile(randomFile);
            Collections.sort(listInt);
            System.out.println(listInt);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
