import java.util.ArrayList;

public class Average {
    public static void main(String[] args) {

    }
    public static int average (ArrayList<Integer> list){
        int ini_num = 0;
        for (int i = 0; i < list.size(); i++){
            int number = list.get(i);
            ini_num += number;
        }
        return ini_num / list.size();
    }
}
