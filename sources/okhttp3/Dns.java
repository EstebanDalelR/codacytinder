package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public interface Dns {
    /* renamed from: a */
    public static final Dns f49063a = new C176421();

    /* renamed from: okhttp3.Dns$1 */
    class C176421 implements Dns {
        C176421() {
        }

        public List<InetAddress> lookup(String str) throws UnknownHostException {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Broken system behaviour for dns lookup of ");
                stringBuilder.append(str);
                UnknownHostException unknownHostException = new UnknownHostException(stringBuilder.toString());
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
