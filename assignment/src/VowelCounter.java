public class VowelCounter {
    public static void main(String[] args) {
        System.out.println(vowelCounter("My name is Charles from Nigeria"));
    }
    public static int vowelCounter (String sentence){
        int counter = 0;
        String sentenceLowerCase = sentence.toLowerCase();
        for (int i = 0; i < sentenceLowerCase.length(); i++){
            char charToCheck = sentenceLowerCase.charAt(i);
            if (charToCheck == 'a' || charToCheck == 'e' || charToCheck == 'i' || charToCheck == 'o' || charToCheck == 'u'){
                counter++;
            }
        }
        return counter;
    }
}
