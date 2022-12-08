import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

/*public class Main{
    public static void main(Strings[] args){

    }
}
*/
/*public class Main{
    int x = 5;
}

class Second{
    public static void main(String[] args){
        Main myObj = new Main();
        System.out.println(myObj.x);
    }
}
*/
/*public class Main{
    public static void main(String[] args){
        int result = sum(5, 10);
        System.out.println(result);
    }

    public static int sum(int a, int b){
        if(b > a) {
            return b + sum(a, b - 1);
        }else{
            return b;
        }
    }

}*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Enter 0 for rock, 1 for paper or 2 for scis");

        int you = sc.nextInt();
        int comp = rnd.nextInt(2);
        //0 = r, 1 = p, 2 = s

        if(comp == 0){
            System.out.println("Rock");
            if(you == 0)
                System.out.println("No one");
            if(you == 1)
                System.out.println("You");
            if(you == 2)
                System.out.println("Comp");
        }
        if(comp == 1){
            System.out.println("Paper");
            if(you == 1)
                System.out.println("No one");
            if(you == 2)
                System.out.println("You");
            if(you == 0)
                System.out.println("Comp");
        }
        if(comp == 2){
            System.out.println("Scissors");
            if(you == 2)
                System.out.println("No one");
            if(you == 1)
                System.out.println("You");
            if(you == 0)
                System.out.println("Comp");
        }





    }

}