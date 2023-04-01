class PrimeExample implements Runnable
//extends Thread
{    

  public void run()
  {
   int i,m=20,flag=1;      
   for(i=1;i<=m;i++);
    {
        if(i<=3)
        {  
            System.out.println(i + " is prime number");  
            //was: continue;
        }    
        else if(i>3)
        { 
          for(int j=2;j<i;i++)
         {     
           if(i%j==0)
            {      
             flag=0;
             break; 
            }
         }   
          if (flag!= 1)
          {
            System.out.println(i + " is not prime number"); //was:System.out.print_n(i + " is not prime number");
            flag=1;
          }
          else
            System.out.println(i + " is prime number"); //was:System.out.prin_ln(i + " is prime number");
        }      
    }
  }
}   
class prime
{
 public static void main(String args[]){ 
	try
	{
		PrimeExample p1 = new PrimeExample();
		Thread t1= new Thread(p1); //was;p2
		t1.start();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}   
