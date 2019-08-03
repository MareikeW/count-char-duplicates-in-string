/* Turns String into a char array and counts how many duplicates there are of letters in the string; displays
* number of duplicates */

public class NumOfCharDuplicates {

    public static void main(String[] args) {
        String word = "hello";

        System.out.println(findNumOfDuplicates(word));
    }

    public static int findNumOfDuplicates(String word) {
        int count = 0;

        char[] charArray = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (charArray[i] == charArray[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
