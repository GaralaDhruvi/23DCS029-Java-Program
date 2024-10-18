public class pra17{
   
    public void printdivid() {
        System.out.println("This is parent class");
    }
}
public class Child extends Pt {
    
    public void printChild() {
        System.out.println("This is child class");
    }
}
public class Main {
    public static void main(String[] args) {
       
        Pt ptObject = new Pt();
        
        ptObject.printPt();

        
        Child childObject = new Child();
       
        childObject.printChild();
    }
}
