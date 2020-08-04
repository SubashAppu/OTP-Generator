import java.util.*; 
  
public class Main 
{ 
    static char[] otp(int len) 
    { 
        String numbers="0123456789";
        Random rdm_mtd=new Random(); 
        char[] otp = new char[len]; 
  
        for (int i = 0; i < len; i++) 
        { 
            otp[i]=numbers.charAt(rdm_mtd.nextInt(numbers.length())); 
        }
        
        System.out.print("You OTP is : ");
        return otp; 
    } 
    public static void main(String[] args) 
    { 
        int length = 6; 
        System.out.print(otp(length));
        System.out.print(". Do not share with others.");
    } 
}