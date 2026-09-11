import java.util.Arrays;

public class Calc {
    static public void main() {
        String numbers = "1234";
        IO.print(sum(numbers));
    }
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    static int sum(String num) {
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            if (Character.isDigit(num.charAt(i))) ;
            sum += num.charAt(i)-48;// ASCII 48 är samma som Char 0.

            /*Alt
            sum += num.charAt(i)-'0'; Enkla citattecknet runt 0 talar om för kompilatorn:
            "Detta är ett enskilt tecken, behandla det som en char".

           sum += Integer.parseInt(num.substring(i,i+1));
           sum += Character.getNumericValue(num.charAt(i));*/


        }
        return sum;
    }
}
