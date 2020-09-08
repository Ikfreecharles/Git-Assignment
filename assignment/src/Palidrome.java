public class Palidrome {
    public static void main(String[] args) {
        palidrome("charles");
    }
    public static void palidrome (String myWord){
        String reversedWord = "";
        String lowerCase = myWord.toLowerCase();

        for(int i = lowerCase.length(); i > 0; i--){
            char eachChar = lowerCase.charAt(i - 1);
            reversedWord += eachChar;
        }
        if (myWord.equalsIgnoreCase(reversedWord)){
            System.out.println("The word " + myWord + " is a Palidrome.");
        }else{
            System.out.println("The word " + myWord + " is NOT a Palidrome.");
        }
    }
}
