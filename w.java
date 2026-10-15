class w{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { //outer loop 
            for (int j = 1; j <= i; j++) { // inner loop
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//explain how its work 
//we have a five rows (5 rows outer loop and inner loop) its work like 
//for(int i=1;i<=5;i++) outer loop
//for(int j=1;j<=i;j++) inner loop

// loop start with the numbers of 1 , 2 , 3, 4, 5

//step 1
//when i is 1 condition = to start print (1<=1) *
//then j++ 2 condition = (2<=1) no print 

// step 2
// when i is 1 condition = to start print(1<=2) print *
//when i is 2 condition = to start print(2<=2)  print *
//then j++ increase the number 3 so the condition is (3<=2) no print

//step 3
//when i is 1 condition = to start print(1<=3) print *
//when i is 2 condition = to start print(2<=3)  print *
//when i is 3 condition = to start print(3<=3) print *
//then j++ increase the number 4 so the condition is (4<=3) no print

//step 4
//when i is 1 condition = to start print(1<=4) print *
//when i is 2 condition = to start print(2<=4) print *
//when i is 3 condition = to start print(3<=4) print *
//when i is 4 condition = to start print(4<=4) print*
//then j++ increase the number 4 so the condition is (5<=4) no print

//step 5
//when i is 1 condition = to start print(1<=5) print *
//when i is 2 condition = to start print(2<=5) print *
//when i is 3 condition = to start print(3<=5) print *
//when i is 4 condition = to start print(4<=5) print *
//when i is 5 condition = to start print(5<=5) print *
//then j++ increase the number 4 so the condition is (6<=5) no print






