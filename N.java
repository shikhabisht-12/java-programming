public class N {
    public static void main(String[]args){
        int marks=60;
        boolean attendance = true;
        if(marks>=60 && attendance==true){
            System.out.println("eligible for exam");
        }else if(marks>=60 || attendance==false ){
            System.out.println("attendance shortage");
        }else if(marks>=40){
            System.out.println("not eligible");
        }
        
    }
}
