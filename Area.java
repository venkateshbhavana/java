import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        float x,y,z;
        System.out.println("Enter the breadth and height: ");
        Scanner sc = new Scanner(System.in);
        x=sc.nextFloat();
        y=sc.nextFloat();
        //z=sc.nextFloat();

        z=x*y/2;
        //for three sides of triangle

        System.out.println(z);

 
    }
}
