import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class H2database {

    public static void main(String[] args) {
        String findString = "(Никита)";
        String mainString = " Меня Зовут Никита, мне 18 лет. С 2015 года я учусь на программиста в Политехническом Колледже Города Темиртау. ";
        Pattern p = Pattern.compile(findString);
        Matcher m  = p.matcher(mainString);
        while (m.find()){
            System.out.println(m.group());
        }
        System.out.println(mainString);
    }

}
