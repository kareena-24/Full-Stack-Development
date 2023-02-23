import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
      int c=0,temp=0,count=1,num,count2,temp1;
      while(a!=0){
        c=c+1;
        a=a/10;
      }  
      if(c==10){
        while(a!=0){
              num=a;
              temp=num%10;
              count=count+1;
              num=num/10;
              temp1=num%10;
              count2=count+1;
              if(count%2!=0){
                System.out.println((int)Math.pow(temp1,temp));

              }

            

        }



        
      }
    }
}
