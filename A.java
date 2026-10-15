public class A {
    public static void main(String[]args){
        int age = 20;
        boolean hasId = true;
        if(age>=18 && hasId == true){
        System.out.println("Access granted");
        }else if (age>=18 && hasId==false){
            System.out.println("ID required");
        }else{
            System.out.println("not eligible ");
        }
    }
}
