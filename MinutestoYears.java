import java.util.Scanner;
public class MinutestoYears{
   public static void main(String[] args){
        
        long min,days, years,num;
        num=60*24*365;
        System.out.println("Enter the minutes: ");
        Scanner s = new Scanner(System.in);
        min=s.nextInt();
        years=min/num;
        days=(int)(min/1440);
        days=days%365;
        System.out.println(min+"minutes is approximately "+ years +" years and "+ days +"days");

}
}