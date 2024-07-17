public class reverseString{
    public static String reverseWord(String collecInput){
        String newWord = "";

        for(int counter = collecInput.length() -1; counter >= 0;  counter--){
            newWord += collecInput.charAt(counter);
        }
        return newWord;
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("semicolon"));
    }
}