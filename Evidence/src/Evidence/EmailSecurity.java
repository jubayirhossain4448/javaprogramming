
package Evidence;
import java.util.*;

public class EmailSecurity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your mail Address");
        
        String email = s.nextLine();
        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");
        
        if(atpos > 0 && dotpos <email.length()-1 && atpos < dotpos-1){
            System.out.println(" Email is valid");
        }else {
            System.out.println(" Email is invallid");
        }
                
    }
    
}