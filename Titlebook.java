import java.util.Scanner;
public class Titlebook
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       String title=sc.nextLine();
       Book new_nowel=new Mybook();
       new_nowel.setTitle(title);
       System.out.println("The Title is : "+new_nowel.getTitle());
    }
}