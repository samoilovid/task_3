import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        String separator = File.separator;
        String path = separator + "Users" + separator + "Ivan" + separator +
                "IdeaProjects" + separator + "task_3" + separator + "metaData";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
//затруднения в выборке времени, при прочтении файла, по этому, написал логику ответов на вопросы отдельно
        }

        int countWannaTopUp = 0;
        for (int i = 0; i > date.length(); i++) {
            if (username.wannaTopUp) countWannaTopUp++;//количество попыток налить воду в бочку было за указанный период
        }
        int countWannaScoop = 0;
        for (int i = 0; i > date.length(); i++) {
            if (username.wannaScoop) countWannaScoop++;//количество попыток забора воду из бочки за указанный период
        }

        int volumeBarrel;
        int water;
        int userWannaTopUp;
        int userWannaScoop;

        int mistakeWannaTopUp = 0;
        int mistakeWannaScoop = 0;

        for (int i = 0; i > date.length(); i++) {
            if ((water + userWannaTopUp) > volumeBarrel) mistakeWannaTopUp++;// ошибки при налитии
            if ((water - userWannaScoop) < 0) mistakeWannaScoop++;// ошибки забора
        }

        int mistake = mistakeWannaScoop + mistakeWannaTopUp;// узнал общее количество ошибок
        double percent = mistake * 100 / countWannaTopUp;// процент ошибок был допущен за указанный период

        int a = countWannaTopUp - mistakeWannaTopUp;// объем воды был налит в бочку за указанный период
        int b = countWannaScoop - mistakeWannaScoop;// объем воды был взят из бочки за указанный период

        int minWater = Math.min(Date);// объем воды был в бочке в начале указанного периода
        int maxWater = Math.max(Date);// конце указанного периода
    }
}
