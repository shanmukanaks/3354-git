package adder;

public class Main {

   public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
	} catch (IllegalArgumentException e) {
	    System.err.println("Please enter integers.");
        } catch (Exception e) {
            System.err.println("Please enter an argument(s).");
        }
    }

   private static int addArguments(String[] args) {
       
       int sum=0;
       int sign=0;
       int index=0;
       
       if(args[0].equals("-"))
       {
           sign = 1;
           index = 1;
       }
       
       for(int i = index;i < args.length;i++){
           if(sign == 0)
               sum += Integer.valueOf(args[i]) ;
           if(sign == 1)
               sum -= Integer.valueOf(args[i]) ;

       }
       
       return sum;
   }
}


