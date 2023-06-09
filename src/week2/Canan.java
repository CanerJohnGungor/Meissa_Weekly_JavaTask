package week2;

public class Canan {

    public static void swap(int a, int b) {

        System.out.println(a +" | "+b);
        a= a + b;
        b= a- b;
        a= a- b;
        System.out.println(a+ " | "+b);

    }

    public static void divisibleBy(){

        String divisibleBy15= "Divisible By 15: ";
        String divisibleBy5= "Divisible By 5: ";
        String divisibleBy3= "Divisible By 3: ";
        String nondivisibleBy3_5_15= "Divisible By 3: ";


        for (int i = 0; i < 101; i++) {
            if (i % 15== 0) {
               divisibleBy15 += i+" ";
            }
            if (i % 5== 0) {
                divisibleBy5 += i+" ";
            }
            if (i % 3== 0) {
                divisibleBy3 += i+" ";
            } else {
                nondivisibleBy3_5_15 += i+" ";
            }
        }

        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);
        System.out.println(nondivisibleBy3_5_15);
    }

    public static void printConsecutiveNumbers(int a){

        for (int i = 1; i <= a; i++) {

            String result= i+"";

            if ((i%2==0) || (i%3==0) ||(i%5==0)){
                result="";
            }
            if(i%2==0){
                result += "Codility";
            }
            if(i%3==0){
                result += "Test";
            }
            if(i%5==0){
                result += "Coders";
            }

            System.out.println(result);
            }
        }

    public static void main(String[] args) {

        swap(1,15);
        divisibleBy();
        printConsecutiveNumbers(34);
    }

}
