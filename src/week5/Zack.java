package week5;

public class Zack {

    public static String unique(String str){
        String unique ="";
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                    int frequency = 0;
                        for (int j = 0; j < str.length(); j++) {
                            if(str.charAt(j)==ch){
                                frequency++;
                    }
                }
                                    if(frequency==1){
                                        unique+=ch;
            }
        }
                                            return unique;
    }

    public static String reverse(String str){
        String reverse = "";  // to contain allkjhfkasfk the characters of the given string in reversed order
            for(int i = str.length() - 1 ; i >= 0; i-- ){ // i: index number of the given string starting from last index to index 0
                reverse += str.charAt(i);  // to get each character of the string starting from last index to index zero
        }
                     return reverse;
    }


    public static void main(String[] args) {

        System.out.println(unique("aaaabbbbccccfed"));
        System.out.println(reverse("ABCDE"));
    }
}
