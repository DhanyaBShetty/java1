

 class Vehicle1{
    void run(){
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle1{
    public static void main(String args[]){
        Bike obj=new Bike();
        obj.run();
    }
}
