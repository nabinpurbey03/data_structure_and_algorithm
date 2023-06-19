package recursion;

public class FirstCapitalLetter {
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
    public static void main(String[] args) {
        firstCapital("naBin");
    }
}
