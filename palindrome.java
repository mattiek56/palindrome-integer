import java.util.Scanner;

class palindrome {
    
    public static void main(String[] args){
        System.out.println("Please enter an integer : ");
        int x = new Scanner(System.in).nextInt();
        
        if(palindrome(x)){
            System.out.println(x + " is a palindrome");
        }else{
            System.out.println(x + " is not a palindrome");
        }
    }

    public static boolean palindrome(int x) {
        
        int reverseInt = 0;
        int check = x;
        if ((x<=0) || (x % 10 == 0 && x != 0)){
            return false;
        }
        while (x !=0) {
            reverseInt = reverseInt * 10 + x % 10;
            x = x / 10;
        }
        if (reverseInt == check){
            return true;
        }
        else {
            return false;
        }
        
        
    }
    }
