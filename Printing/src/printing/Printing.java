//first 
//in order to write \ put "\\" so that one backslash shows up.For forward slash 
//all that you use it a /

package printing;

/**
 * February 11 2016
 * @author alexguntermann
 */
public class Printing {

        public static String bs = "\\";
        public static String fs = "/";
        public static String a = "A";
        public static String l = "L";
        public static String e = "E";
        public static String x = "X";

    public static void main(String[] args) {
        
      System.out.println("Printing Slashes");
      System.out.println("   "+bs+fs);
      System.out.println("  "+bs+bs+fs+fs);
      System.out.println(" "+bs+bs+bs+fs+fs+fs);
      System.out.println(" "+fs+fs+fs+bs+bs+bs);
      System.out.println("  "+fs+fs+bs+bs);
      System.out.println("   "+fs+bs);
      //next part
      System.out.println("Printing Names using giant letters");
      System.out.println("     "+a+"         "+l+l+"           "+e+e+e+e+e+e+e+"     "+x+x+x+"     "+x+x+x);
      System.out.println("    "+a+" "+a+"        "+l+l+"           "+e+e+"           "+x+x+x+"   "+x+x+x);
      System.out.println("   "+a+a+a+a+a+"       "+l+l+"           "+e+e+e+e+e+e+e+"        "+x+x+x+x+x);
      System.out.println("  "+a+a+"   "+a+a+"      "+l+l+"           "+e+e+"            "+x+x+x+" "+x+x+x);
      System.out.println(" "+a+a+"     "+a+a+"     "+l+l+"           "+e+e+"          "+x+x+x+"     "+x+x+x);
      System.out.println(""+a+a+"       "+a+a+"    "+l+l+l+l+l+l+l+l+l+l+"   "+e+e+e+e+e+e+e+"    "+x+x+x+"       "+x+x+x);
          
      
                }
    
}
