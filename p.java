public class p {
    public static void main(String[] args) {
        int age = 20;
        boolean haslicence = false;
         if(age>=18 && haslicence==true){
        System.err.println("can drive");
         }else if(age>=18 || haslicence==false){
         System.out.println("licence required");
         }else if (age>=18){
            System.out.println("not eligible");
         }
}
}
