public class R {
    public static void main(String[]args){
        int age = 22;
        if (age >= 18){
            System.out.println("ELIGIBLE");
        }
        else if(age>=13&&age<=17){
        System.out.println("TEENAGER");
        }
        else if  (age>= 5 && age <= 12){
         System.out.println("child");
        }  
        else {
            System.out.println("SMALL CHILD");
        } 
}
}