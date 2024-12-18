
package pkg2;
import pkg3.Mypackage3;
class MyPackage{
    public void display(){
        System.out.println("This msg is from MyPackage within pkg2");
    }
}
public class D53_MyPackage {
    public static void main(String[] args){
        System.out.println("Package");
        MyPackage mypack1=new MyPackage();
        MyPackage2 mypack2=new MyPackage2();
        Mypackage3 mypack3=new Mypackage3();
        mypack1.display();
        mypack2.display();
        mypack3.display();
    }
}
