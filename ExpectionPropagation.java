package Test2;
import java.util.*;
    class ExpectionPropagation {
        public static void manipulateString(int Num, String Str){

            int len =  Str.length();
            for(int i=0;i<Num;i++){
                System.out.print(Str.toUpperCase());
            }
            System.out.println("");
            System.out.println(Num*len);

        }
        public static void main() {

            String A = "java";
            manipulateString(3,A);
        }
    }

}
