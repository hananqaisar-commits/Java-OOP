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
}