public class FizzBuzz {

    public String say(int i) {
        //Number is divisible by 3
        if (i % 15 == 0) {
            return "fizzbuzz";
        } else if (i % 5 == 0) {
            return "buzz";
        } else if (i % 3 == 0) {
            return "fizz";
        } else {
            return String.valueOf(i);
        }
    }
}