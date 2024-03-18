import java.util.Scanner;
class A
{
        int a,b;
        Scanner sc=new Scanner(System.in);
        void add(){
                System.out.println("enter two nos to add: ");
                a=sc.nextInt();
                b=sc.nextInt();
                int c=a+b;
                System.out.println("c="+c);
        }
        
}
class B extends A{
int p,q;        
Scanner sc=new Scanner(System.in);
void sub(){
        System.out.println("enter two no to sub:");
        p=sc.nextInt();
        q=sc.nextInt();
        int r=p-q;
        System.out.println("r="+r);
        
}
}
class Main{
        public static void main(String[] args)
{
        B b1=new B();
        b1.add();
b1.sub();        
}
}

