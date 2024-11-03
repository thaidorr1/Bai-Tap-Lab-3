
package infor.java;
import java.util.Scanner ;

public class InforJava {
    public static void main(String[] args) {      
       Scanner sc =  new Scanner (System.in) ;
       float x ;
       //giai phuong trinh bac 1 co dang y = ax + b = 0 (a != 0)
       System.out.print("Nhap vao he so a : ") ;
       float a = sc.nextFloat() ;
       System.out.print("Nhap vao he so b : ") ;
       float b = sc.nextFloat() ;
       // nếu a != 0 thì phương trình chỉ có nghiệm duy nhất
       if (a != 0 ) {
           x = -b /a ;
           System.out.println("Phuong trinh co nghiem duy nhat la : " + x );
       }
       // nếu a == 0 && b != 0 thì phương trình phải vô nghiệm 
       else if (a == 0 && b !=0) {
           System.out.println("Phuong trinh vo nghiem !");
       }
       // nếu a ==0 và b== 0 thì phương trình có nghiệm đúng với mọi xeR 
       else  {
           System.out.println("Nghiem dung voi moi xeR!");
       }
    }
}
