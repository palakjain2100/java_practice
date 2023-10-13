import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
//        double a =1;
//        double b = 2.5;
//        double c = 4;
//        if (a<b){
//            System.out.println("B is greater than A");
//        }
//        else if(a==b){
//            System.out.println("They are equal");
//        }
//        else{
//            System.out.println("A is greater than B");
//        }
        double[]Data= new double[3];
        Data[0]=9.0;
        Data[1]=3.4;
        Data[2]=5;
//        Data[3]=4;
//        double A= Data[0]+Data[2];
//        System.out.println(A);

        if (Data[0]>Data[2]){
            System.out.println(Data[0]+"is greater than"+Data[2]);
        }
    }
}