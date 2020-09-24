package adder;
public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            if (args.length==0)
                throw new ArrayIndexOutOfBoundsException();
            System.out.println(result);
    	}
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Not enough arguments");
    	}
        catch(NumberFormatException n) {
                System.out.println("Invalid characters");
    	}
    }
    private static int addArguments(String[] args) {
        
        int sum=0;
        
        for(int i = 0;i < args.length;i++)
        {
            sum = sum + Integer.valueOf(args[i]);
    	}
    	
        return sum;
    }

}
