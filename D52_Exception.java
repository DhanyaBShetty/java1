/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2;
class DivByZeroException extends Exception{
    public DivByZeroException(String message){
        super(message);
    }
}
public class D52_Exception {
    public static void main(String[] args){
        System.out.println("Exception");
        int nr=10;
        int dr=0;
        int result;
        try{
            if(dr==0){
                throw new DivByZeroException("Division by zero not allowed");
            }
        }
        catch(DivByZeroException e1){
            System.out.println(e1.getMessage());
        }
        catch(ArithmeticException e2){
            System.out.println(e2.getMessage());
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}
