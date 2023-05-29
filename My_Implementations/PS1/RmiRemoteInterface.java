import java.rmi.*;

public interface RmiRemoteInterface extends Remote {
    public double add(double x, double y) throws RemoteException;
}