import java.util.*;

public class Number_guess
{
    private Scanner sc;
    public Number_guess()
    {
        sc=new Scanner(System.in);
    }
    public void easy()
    {
        Random ran=new Random();
        System.out.println("You are given 10 chances to guess a number between(1-100)");
        int num=ran.nextInt(100);
        int guess_num=0;
        int i=0 , chances=0 ;
        long st_time=System.currentTimeMillis();
        while(chances<10)
        {
            System.out.print("Enter the number to guess:");
            guess_num=sc.nextInt();
            if(chances == 7)
            {
                System.out.println("Hint : The number is between "+(num-10)+" and "+(num+10));
            }
            if(guess_num == num) 
            {
                long end_time=System.currentTimeMillis();
                long time_taken=end_time-st_time;
                System.out.print("You've guessed it right in "+(i+1)+" guesses.\n");
                System.out.print("You've took "+(time_taken/1000.0)+" seconds to guess\n");
                break;
            }
            else if (guess_num>num)
            {
                System.out.print("Wrong, the number is less than "+guess_num+"\n");
                System.out.println("Chances left= "+(10-(chances+1)));
                i++;
                chances++;
            }
            else if (guess_num<num)
            {
                System.out.print("Wrong, the number is greater than "+guess_num+"\n");
                System.out.println("Chances left= "+(10-(chances+1)));
                i++;
                chances++;
            }
        }
        if(chances>=10)
        {
            System.out.println("Sorry , You ran out of chances");
        }
        System.out.print("Do you want to play again(Y/N): ");
        String opt=sc.next();
        if(opt.equals("Y"))
        {
            easy();
        }
        else
        {
            return;
        }
    }
    public  void medium()
    {
        Random ran=new Random();
        System.out.println("You are given 5 chances to guess a number between(1-100)");
        int num=ran.nextInt(100);
        int guess_num=0;
        int i=0 , chances=0 ;
        long st_time=System.currentTimeMillis();
        while(chances<5)
        {
            System.out.print("Enter the number to guess:");
            guess_num=sc.nextInt();
            if(chances == 3)
            {
                System.out.println("Hint : The number is between "+(num-5)+" and "+(num+5));
            }
            if(guess_num == num) 
            {
                long end_time=System.currentTimeMillis();
                long time_taken=end_time-st_time;
                System.out.print("You've guessed it right in "+(i+1)+" guesses.\n");
                System.out.print("You've took "+(time_taken/1000.0)+" seconds to guess\n");
                break;
            }
            else if (guess_num>num)
            {
                System.out.print("Wrong, the number is less than "+guess_num+"\n");
                System.out.println("Chances left= "+(5-(chances+1)));
                i++;
                chances++;
            }
            else if (guess_num<num)
            {
                System.out.print("Wrong, the number is greater than "+guess_num+"\n");
                System.out.println("Chances left= "+(5-(chances+1)));
                i++;
                chances++;
            }
        }
        if(chances>=5)
        {
            System.out.println("Sorry , You ran out of chances");
        }
        System.out.print("Do you play again(Y/N): ");
        String opt=sc.next();
        if(opt.equals("Y"))
        {
            medium();
        }
        else
        {
            return;
        }
    }
    public void hard()
    {
        Random ran=new Random();
        System.out.println("You are given 3 chances to guess a number between(1-100)");
        int num=ran.nextInt(100);
        int guess_num=0;
        int i=0 , chances=0 ;
        long st_time=System.currentTimeMillis();
        while(chances<3)
        {
            System.out.print("Enter the number to guess:");
            guess_num=sc.nextInt();
            if(chances == 2)
            {
                System.out.println("Hint : The number is between "+(num-1)+" and "+(num+1));
            }
            if(guess_num == num) 
            {
                long end_time=System.currentTimeMillis();
                long time_taken=end_time-st_time;
                System.out.print("You've guessed it right in "+(i+1)+" guesses.\n");
                System.out.print("You've took "+(time_taken/1000.0)+" seconds to guess\n");
                break;
            }
            else if (guess_num>num)
            {
                System.out.print("Wrong, the number is less than "+guess_num+"\n");
                System.out.println("Chances left= "+(3-(chances+1)));
                i++;
                chances++;
            }
            else if (guess_num<num)
            {
                System.out.print("Wrong, the number is greater than "+guess_num+"\n");
                System.out.println("Chances left= "+(3-(chances+1)));
                i++;
                chances++;
            }
        }
        if(chances>=3)
        {
            System.out.println("Sorry , You ran out of chances");
        }
        System.out.print("Do you play again(Y/N): ");
        String opt=sc.next();
        if(opt.equals("Y"))
        {
            hard();
        }
        else
        {
            return;
        }
    }
    public void closeSc()
    {
        sc.close();
    }
    public static void main(String[] args)
    {
        Number_guess obj=new Number_guess();
        System.out.println("Welcome to Number Guessing game\nEnter 1.Easy(10 chances) 2.Medium(5 chances) 3.Hard(3 chances)");
        int option=obj.sc.nextInt();
        switch(option)
        {
            case 1: obj.easy();
                    break;
            case 2: obj.medium();
                    break;
            case 3: obj.hard();
                    break;
            case 4: System.exit(0);
                    break;
            default: System.out.println("Enter only valid options");
                     break;        
        }
        obj.closeSc();
    }
}
