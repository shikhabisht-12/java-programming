public class k {
    public static void main(String[]args){
        int units = 250;
        
        if(units>=300){
            System.out.println("High bill");
        }    
        else if (units>=200){
            System.out.println("medium bill");
        }    
        else if (units>=100){
            System.out.println("normal bill");
        }    
        else if (units>=50){
            System.out.println("low bill"); 
        }  
        else{
            System.out.println("very low bill");
        }
}}
