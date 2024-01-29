// Your First Program

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}

//datatypes;
//class Dtypes{
//    public static void main(String[] args){
//    byte var1=26;
//    short var2=23432;
//   int var3=878468272;
//    float var4=67.3f;
//    long var5=732697784;
//    double var6=8.275972804929843;
//    char var7='b';
//    boolean var8=!false;
//    String var9="lokesh cutm btech";
//    System.out.println(var1);
//    System.out.println(var2);
//    System.out.println(var3);
//    System.out.println(var4);
//    System.out.println(var5);
//    System.out.println(var6);
//    System.out.println(var7);
//    System.out.println(var8);
//    System.out.println(var9);
//    }
//}

//adding 3 numbers;
//class Assing{
//    public static void main(String[] args){
//        int x=21;
//        int y=67;
//        int z=429;
//        int sum=x + y + z;
//        System.out.println("the sum of 3 numbers:" +sum);
//    }
//}

// Reading data from user;
// import java.util.Scanner;
// class Readinge_data {
//     public static void main(String[] args){
//           Scanner sc=new Scanner(System.in);
//        System.out.println("enter your number");
//        int a=sc.nextInt();
//        System.out.println("your entered nummber is:"+a);
//         System.out.println("enter your sentence:");
//         String str =sc.nextLine();
//         System.out.println("your entered line is:"+str);
//     }
// }

//calculating the %;
// import java.util.Scanner;
// class C_percent{
//     public static void main(String[] args){
//             Scanner abc=new Scanner(System.in);
//             System.out.println("enter your marks in maths:");
//             float a=abc.nextInt();
//             System.out.println("enter your marks in chemistry:");
//             float b=abc.nextInt();
//             System.out.println("enter your marks in physics:");
//             float c=abc.nextInt();
//             System.out.println("enter your marks in english:");
//             float d=abc.nextInt();
//             float percent=(a+b+c+d)/40;
//             System.out.println("your CGPA is:"+percent);
//     }

// }

//increment and decrement grade;
// class Grade{
//   public static void main(String[] args){
//     //incrementing:
//     char var='c';
//     var=(char)(var + 8);
//     System.out.println(var);
//     //decrementing:
//     var=(char)(var - 8);
//     System.out.println(var);
//   }
// }

//String Methods:
// class Strings_m{
//   public static void main(String[] args){
//     String name="Visakhapatnam";
//     System.out.println(name.length());//length function
//     System.out.println(name.toLowerCase());//toLowerCase function
//     System.out.println(name.toUpperCase());//toUpperCase function
//     System.out.println(name.trim());//trim function
//     System.out.println(name.substring(3));
//     System.out.println(name.substring(3,9));
//     System.out.println(name.replace('t','y'));
//     System.out.println(name.startsWith("Vi"));
//     System.out.println(name.endsWith("am"));
//     System.out.println(name.charAt(2));
//     System.out.println(name.indexOf("a"));
//     System.out.println(name.indexOf("a",4));
//     System.out.println(name.lastIndexOf("a"));
//     System.out.println(name.lastIndexOf("a",4));
//     System.out.println(name.equals("Visakhapatnam"));
//     System.out.println(name.equalsIgnoreCase("viSAKHAPATNAM"));
//   }
// }


//_________;
// import java.util.Scanner;
// class Loki{
//   public static void main(String[] args){
//     Scanner st=new Scanner(System.in);
//     System.out.println("enter your physics:");
//     byte m1=st.nextByte();
//     System.out.println("enter your chemistry:");
//     byte m2=st.nextByte();
//     System.out.println("enter your maths:");
//     byte m3=st.nextByte();
//     float avg = (m1 + m2 + m3)/3.0f;
//     if(avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33){
//       System.out.println("congrats your promoted.");
//     }
//     else{
//       System.out.println("sorry-better luck next time");
//     }
//   }
// }

//Weeks:
// import java.util.Scanner;
// class Week{
//   public static void main(String[] args){
//     Scanner sx=new Scanner(System.in);
//     System.out.println("enter your number from 1-7:");
//     int day=sx.nextInt();

//     switch(day){
//       case 1 -> System.out.println("Monday");
//       case 2 -> System.out.println("Tuesday");
//       case 3 -> System.out.println("Wednesday");
//       case 4 -> System.out.println("Thursday");
//       case 5 -> System.out.println("Friday");
//       case 6 -> System.out.println("Saturday");
//       case 7 -> System.out.println("Sunday");
//     }
//   }
// }

//____________;
// import java.util.Scanner;
// class Web{
//   public static void main(String[] args){
//   Scanner sb=new Scanner(System.in);
//   System.out.println("enter your website name:");
//   String website =sb.next();
//   if(website.endsWith(".org")){
//     System.out.println("This is organisational website");
//   }
//   else if(website.endsWith(".com")){
//     System.out.println("This is commercial website.");
//   }
//   else if(website.endsWith(".in")){
//     System.out.println("This is an Indian website");
//   }
// }
// }


//while loop:
// class Loops{
//   public static void main(String[] args){
//     int i=1;
//     while(i<=3){
//       System.out.println(i);
//       i++;
//     }

//do-while loop:
    // int j=0;
    // do{
    //   System.out.println(j);
    //   j++;
    // }while(j<7);

//for loop:
//     for(int k=1;k<=6;k++){
//       System.out.println(k);
//     }


//Odd numbers:
//       int n=10;
//       for(int i=0;i<n;i++){
//         System.out.println(2*i+1);
//       }


//reversing:
      // for(int l=5;l>=0;l--){
      //   System.out.println(l);
      // }

//   }
// }


//loops questions:
// class Stars{
//   public static void main(String[] args){

    //Question 1;
    // int n=4;
    // for(int i=n; i>0; i--){
    //   for(int j=0; j<i; j++){
    //   System.out.print("*");
    //   }
    //   System.out.print("\n");
    // }


    //Question 2;
    // int sum=0;
    // int n=10;
    // for(int i=0; i<n; i++){
    //   sum= sum +(2*i);
    // }
    // System.out.print("the sum of first 10 even numbers is:");
    // System.out.println(sum);


    //Question 3;
    // int n=5;
    // for(int i=1; i<=10; i++){
    //   System.out.printf("%d X %d = %d\n",n,i,n*i);
    // }

    //Question 4;
      // int x=10;
      // for(int i=10; i>=1;i--){
      //   System.out.printf("%d X %d =%d \n",x,x,x*i);
      // }

    //Question 5;
    // int x=5;
    // int i=1;
    // int factorial =1;
    // while(i<=x){
    //       factorial *=i;
    //       i++;
    // }
    // System.out.println(factorial);
//   }
// }


//Arrays:
// class Arrays{
//   public static void main(String[] args){
    // int [] x;//Declaration

    // x=new int[10];//Memory allocation

    // int [] marks=new int[5];//Declaration + memory allocation.

    //  int [] marks={100,90,80,70,98};//decalre + initialize.

    //  float [] mark={20,30,40,50,60};
    //  String [] a={"lokesh","loki","abc","xyz"};
    // marks[0]=100;
    // marks[1]=90;
    // marks[2]=95;
    // marks[3]=80;
    // marks[4]=89;
    // System.out.println(marks[4]);
    // System.out.println(marks.length);
    // System.out.println(mark[0]);
    // System.out.println(a[0]);
    
    //Displaying Array Using for loop:

      //  for(int i=0;i<marks.length;i++){
      //   System.out.println(marks[i]);
      //  }

    //Displaying array in reverse order using for-loop;
      //  for(int i=marks.length -1;i>=0;i--){
      //   System.out.println(marks[i]);
      //  }

    //Displaying array in reverse order using for-each loop;
//         for(int element:marks){
//           System.out.println(element);
//         }
//   }
// }


//Multi-Dimenssional Arrays:

// class M_array{
//   public static void main(String[] args){
//     int [] marks;//1-D Array.
//     int [][] flats;//2-D Array.
//     flats=new int [2][3];//2-D array 2rows + 3columns.
//     flats[0][0]=100;
//     flats[0][1]=200;
//     flats[0][2]=300;
//     flats[1][0]=150;
//     flats[1][1]=250;
//     flats[1][2]=350;
  //  System.out.println(flats[1][1]);

   //Displaying 2-D array Using for loop:

      //  for(int i=0;i<flats.length;i++){
      //   for(int j=0;j<flats[i].length;j++){
      //   System.out.print(flats[i][j]);
      //   System.out.print(" ");
      //   }
      //   System.out.println("");
      //  }

  //3-D Arrays:
//        String [][][] arr=new String[2][3][4];
//   }
// }


//Practice Questions On Arrays:
//Question 1;
// class One{
//   public static void main(String[] args){
//     float sum=0;
//     float [] arr={10.2f,20.3f,30.4f,40.5f,50.6f};
//     for(float element:arr){
//       sum=sum+element;
//     }
//     System.out.println(sum);

//Question 2;
    // float [] marks={10.2f,20.3f,30.4f,40.5f,50.6f};
    // float num=10.3f;
    // boolean isInArray = false;
    // for(float element:marks){
    //   if(num == element){
    //     isInArray = true;
    //     break;
    //   }
    // }
    // if(isInArray){
    //   System.out.println("Number is present in the array.");
    // }
    // else{
    //   System.out.println("Number is Not-present in the array.");
    // }
  
//Question 3;
  // float [] marks={10.2f,20.3f,30.4f,40.5f,50.6f};
  // float sum=0;
  // for(float element:marks){
  //   sum=sum + element;
  // }
  // System.out.println("The value of average marks is "+ sum/marks.length);

//Question 4;
    // int [][] mat1={{1,2,3},
    //               {4,5,6}};
    // int [][] mat2={{2,6,13},
    //               {3,7,1}};
    // int [][] result={{0,0,0},
    //                 {0,0,0}};
    // for(int i=0;i<mat1.length;i++){ //row number of times.
    //   for(int j=0;j<mat1[i].length;j++){  //column number of times.
    //     System.out.print(result[i][j]+" ");
    //     result[i][j]=mat1[i][j] + mat2[i][j];
    //   }
    //   System.out.println("");//prints a new line.
    // }

//Question 5;
//Maximum element in array:
        // int [] arr={1,210,3,45,34,67};
        // int max =0;
        // for(int x:arr){
        //   if(x>max){
        //     max = x;
        //   }
        // }
        // System.out.println("The value of the maximum element in the array is:"+max);
  
//Question 6;
//Minimum element in array;
        //  int [] arr={1,210,3,45,34,67};
        //  int max =(Integer.MIN_VALUE);
        //  for(int x:arr){
        //    if(x<max){
        //      max = x;
        //    }
        //  }
        //  System.out.println("The value of the maximum element in the array is:"+max);
        //  System.out.println(Integer.MIN_VALUE);

//Question 7;
            // boolean isSorted = true;
            // int [] arr ={1,2,3,4,5,6,67};
            // for(int i=0;i<arr.length-1;i++){
            //   if(arr[i] > arr[i+1]){
            //   isSorted =false;
            //   break;
            //   }
            // }
            // if(isSorted){
            //   System.out.println("the array is sorted.");
            // }
            // else{
            //   System.out.println("the array is not-sorted.");
            // }
//       }
// }


 