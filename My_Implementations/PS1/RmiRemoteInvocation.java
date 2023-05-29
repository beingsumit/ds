import java.rmi.*;

public class RmiRemoteInvocation {
    public static void main(String args[]) {
        try {
            RmiRemoteDecl rmidec = new RmiRemoteDecl();
            Naming.rebind("RmiRemoteInvocation", rmidec);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}