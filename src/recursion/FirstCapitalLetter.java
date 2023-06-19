package recursion;

//Write a java program to find the first capital letter in a string using recursion.

/**
 * The type First capital letter.
 */
public class FirstCapitalLetter {
    /**
     * First capital.
     * @param str the input String
     */
    static void firstCapital(String str){
        if(str.length()==1){
            char ch = str.charAt(0);
            if((int)ch>=65 && (int)ch<=90){
                System.out.println(ch);
            }else {
                System.out.println(" ");
            }
        }else {
            char ch = str.charAt(0);
            if((int)ch>=65 && (int)ch<=90){
                System.out.println(ch);
                return;
            }
            String sub = str.substring(1,str.length()-1);
            firstCapital(sub);
        }
    }

    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        firstCapital("naBin");
    }
}
