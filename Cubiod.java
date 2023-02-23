import java.util.Scanner;

public class Cubiod{
    public static void main(String[] args){
        //cubiod has dimensions such as length(l),breadth(b),heaight(h)
        //for calculating area of front and back side of cubiod is:l*h
        //for calculating area of left and right side of cubiod is:b*h
        //for calculating area of bottom and top side of cubiod is:l*b
        //if i add all this areas i will get total area of cubiod
        //volume=l*b*h
        //perimeter=running length of border(l+b+l+b) 
        int l,b,h,volume,total_area;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length,Breadth,Height:");
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        //area=area of total 6 sides
        total_area= 2*(l*b+l*h+b*h);
        volume=l*b*h;
        System.out.println("Total Area: "+total_area);
        System.out.println("Volume: "+volume);

    }
}