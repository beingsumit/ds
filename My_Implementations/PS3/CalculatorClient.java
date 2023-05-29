import CalculatorApp.*;
import org.omg.CosNaming.*;
import org.omg.CORBA.*;

public class CalculatorClient {
    public static void main(String args[]) {
        try {
            // create and initialize the ORB
            ORB orb = ORB.init(args, null);

            // get the root naming context
            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            // resolve the object reference in naming
            String name = "Calculator";
            Calculator calculator = CalculatorHelper.narrow(ncRef.resolve_str(name));

            // perform calculations using the calculator object
            float x = 10;
            float y = 5;
            float result = calculator.add(x, y);
            System.out.println(x + " + " + y + " = " + result);

            result = calculator.subtract(x, y);
            System.out.println(x + " - " + y + " = " + result);

            result = calculator.multiply(x, y);
            System.out.println(x + " * " + y + " = " + result);

            result = calculator.divide(x, y);
            System.out.println(x + " / " + y + " = " + result);

            // shutdown the ORB
            orb.shutdown(false);
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
            e.printStackTrace(System.out);
        }
    }
}
