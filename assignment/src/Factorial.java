public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial (int input){
        int ini_num = 1;
        for (int i = 1; i <= input; i++){
            if(input == 0){
                ini_num = 1;
            }else{
                ini_num *= i;
            }
        }
        return ini_num;
    }
}
