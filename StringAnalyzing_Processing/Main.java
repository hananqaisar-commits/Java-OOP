import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringAnalyzer s1 = new StringAnalyzer();
        System.out.println("Enter string to reverse: ");
        String order = sc.nextLine();

        s1.input(order);
        s1.printReverse();
        System.out.println("\nVowels : " + s1.countVowels());
        System.out.println("Palindrome: " + s1.isPalindrome());

        s1.buildStudentReport(new String[] { "Hanan", "Qaisar", "Ahtisham" }, new double[] { 67, 65, 45 });
        sc.close();
    }
}

class StringAnalyzer {

    String[] word;

    public void input(String order) {
        word = order.trim().split(" ");// split the order string by spaces amd then store them in word String
    }

    public void printReverse() {
        int i = word.length;
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(word[j] + " ");

        }
    }

    public int countVowels() {
        int count = 0;
        for (String w : word) {
            for (char ch : w.toLowerCase().toCharArray()) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ++count;
                }
            }

        }
        return count;
    }

    public boolean isPalindrome() {
        int j = word.length;

        for (int i = 0; i < word.length; i++) {
            if (word[i].equalsIgnoreCase(word[j - 1])) {// (j-1)bcz indexing start from 0 and end at n-1
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public void buildStudentReport(String[] names, double[] scores) {
        System.out.println("Student Report: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i] + " --- " + scores[i]);
        }
    }
}