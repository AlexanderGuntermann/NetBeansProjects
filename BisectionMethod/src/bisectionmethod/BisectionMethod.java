

public class BisectionMethod 
{  
  public static double bisect
  (
    Function f, 
    double a, 
    double b, 
    int maxIteration, 
    double tolerance
  ) throws RootNotFoundException
  {
    double dx = b - a;
    int i = 0;
    double x = 0;
    while (i <  maxIteration)
    {
      if (Math.abs(dx) < tolerance)
      {
        System.out.println("Iteration number: " + i);
        System.out.println("Root obtained: " + x);
        System.out.println("Estimated error: " + dx);
        return dx;
      }
      x = (a + b) / 2;
      // is same sign for f(a) and f(x)
      if(f.eval(a) * f.eval(x) < 0) 
      {
        // not same sign, move b to x
        b = x;
        dx = b - a;
      }
      else
      {
        // same sign, move a to x
        a = x;
        dx = b - a;
      }
      i++;
    }
    throw new RootNotFoundException();
  }
   
  public static void main(String argv[]) 
  {
    try
    {
      bisect(
        new Function()
        {
          public double eval(double x)
          {
            return Math.pow(x, 3) - 27;
          }
        },
        -1000,
        1000,
        100,
        1e-15);
    }
    catch (RootNotFoundException e)
    {      
    }
 
  }
   
  public static class RootNotFoundException extends Exception
  {    
  }
 
  public interface Function
  {
    public double eval(double x);
  }
}
