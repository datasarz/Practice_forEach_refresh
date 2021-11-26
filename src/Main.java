public class Main {
    public static void main(String[] args) {
        int numbers[]={45, 42, 15, 567, 24, 90,89};

        for(int i = 0; i < numbers.length; i++ ) {
            int num = numbers[i];
            System.out.println(num);
        }

        //both loops gives the same output
        //syntax of forEach is much simpler but is useful only for iteration through each element of the list
        for(int num : numbers){
            System.out.println(num + " num from forEach");
        }
    }
}
