import java.rmi.*;
import java.rmi.server.*;

public class RmiRemoteDecl extends UnicastRemoteObject implements RmiRemoteInterface {
    public RmiRemoteDecl() throws RemoteException {

    }

    public double add(double x, double y) {
        return x + y;
    }
}
