package datatype;
import java.util.*;

public class DataType{
     public static void main(String []argh) {
          int i=0;
          int totalInput;
          Scanner scan = new Scanner(System.in);
          totalInput=scan.nextInt();
          String[]input = new String[totalInput];
          
          for(i=0;i<totalInput;i++){
              input[i]= scan.next();
              }
          for(i=0;i<totalInput;i++) {
               try {
                    long x=Long.parseLong(input[i]);
                    System.out.println(x+" can be fitted in:");
                    if(x>=-9223372036854775808L &&x<=9223372036854775807L){
                        System.out.println("long");
                             if(x>=-2147483648 && x<=2147483647){
                                System.out.println("int");
                                  if(x>=-32768 && x<=32767){
                                    System.out.println("short");
                                }
                            }
                    }                 
                   
               }catch(Exception e) {
                    System.out.println(input[i]+" can’t be fitted anywhere.");
               }
          }
     }
}
