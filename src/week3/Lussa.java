package week3;

import java.sql.SQLOutput;

public class Lussa {
    public static void main(String[] args) {
        System.out.println("Hi everyone!");
        System.out.println("Hi, Falana!! How are you?");
        System.out.println("Gm, everyone");
        System.out.println("Gm");
        System.out.println("GM");
        System.out.println("GM");
        System.out.println("Gm");
        System.out.println("GM");
        System.out.println("Gm");

    }
}


        public class FrequencyOfAChar {

            public static void main(String[] args) {

                String str="aabbbcccc";
                char ch='c';

                int count= 0;
                for (int i = 0; i <str.length() ; i++) { // i: index number of string=str

                    if (str.charAt(i) ==ch  ){ // if the character of the string is the equal to the given character, it means the given character has appeared in the string
                        count++;
                    }

                }
                System.out.println(count);

            }
        }



        // 2.Write a method that can check if a string is build out of the same letters as another string






/*public class RemoveDuplicates2 {

    //public static void main(String[] args) {
        //Task3.Write a return method that can remove a duplicated value from String

        String str = "xyzxyzxyz";


        String result = "";
        // declare this string named result to concat the final result
        // we will add every single character one by one to the string result
        // if the specific character is already contained we skip it otherwise we will cont to add

        for (int i = 0; i < str.length(); i++) { // using less than operator we use the str.length
            // this loop will get every single character


            //originally there was error to fix it add the ""+ to it bc the contains wanted string we had a char
            if (result.contains("" + str.charAt(i))) { // if the character is already contained in new string
                continue; // then we skip it
            }
            result += str.charAt(i);
            //every single character now can be concated to the result
        }

        System.out.println(result);
    }
}
