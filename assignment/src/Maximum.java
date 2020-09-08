import java.util.ArrayList;

public class Maximum {
    public static void main(String[] args) {

    }
    public static int maximum(ArrayList<Integer> list){
        int min_num = 0;
        for (int i = 0; i < list.size(); i++){
            int number = list.get(i);
            if (number > min_num){
                min_num = number;
            }else{
                return min_num;
            }
        }
        return min_num;
    }
}
