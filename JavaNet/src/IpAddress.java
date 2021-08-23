import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddress {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("DESKTOP-3GSFS4F");
        String name = address.getHostName();
        String ip = address.getHostAddress();
        System.out.println(name);
        System.out.println(ip);
    }
}
