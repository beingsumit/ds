import java.rmi.*;

public class RmiClient {
    public static void main(String[] args) {
        try {
            String url = "rmi://" + args[0] + "/RmiRemoteInvocation";
            RmiRemoteInterface rmiRemote = (RmiRemoteInterface) Naming.lookup(url);
            System.out.println(
                    rmiRemote.add(Double.parseDouble(args[1]), Double.parseDouble(args[2])));

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
