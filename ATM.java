import java.util.*;
public class ATM {
    static Scanner sc=new Scanner(System.in);
   static HashMap<Integer,User_acc> map=new HashMap<>();
    public static void main(String[] args) {
        System.out.println("Welcome to ATM Machine\n");

        menu();

    }
    public static void menu(){
        System.out.println("Number of account holders:"+map.size());

        System.out.println("Enter your PIN number");
        int pin=sc.nextInt();
        if(map.containsKey(pin)){
            User_acc user=map.get(pin);
            User_acc.flag=0;
            user.operation();
        }
        else{
            System.out.println("Your account isn't registered yet! Do you want to register as a new account holder?\nY:yes\nN:no");
            char ch=sc.next().charAt(0);
            if(ch=='Y') {
                User_acc new_obj = new User_acc();
                map.put(pin, new_obj);
                new_obj.operation();
            }
        }
        System.out.println("Do you want to exit?\nY:yes\nN:no");
        char n=sc.next().charAt(0);
        if(n=='N') menu();
        else System.exit(0);
    }

}
