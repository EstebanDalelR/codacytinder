package okhttp3.internal.p461b;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.C17692o;
import okhttp3.Protocol;
import okhttp3.internal.tls.C15944c;
import okhttp3.internal.tls.C17683a;
import okhttp3.internal.tls.C17684b;
import okhttp3.internal.tls.TrustRootIndex;
import okio.C18549c;

/* renamed from: okhttp3.internal.b.f */
public class C15904f {
    /* renamed from: a */
    private static final C15904f f49240a = C15904f.m60132b();
    /* renamed from: b */
    private static final Logger f49241b = Logger.getLogger(C17692o.class.getName());

    @Nullable
    /* renamed from: a */
    public String mo13336a(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: a */
    public void mo13341a(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    /* renamed from: b */
    public void mo13345b(SSLSocket sSLSocket) {
    }

    /* renamed from: b */
    public boolean mo13343b(String str) {
        return true;
    }

    /* renamed from: d */
    public String m60146d() {
        return "OkHttp";
    }

    /* renamed from: c */
    public static C15904f m60134c() {
        return f49240a;
    }

    /* renamed from: a */
    public void mo13340a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: a */
    public void mo13338a(int i, String str, Throwable th) {
        f49241b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: a */
    public Object mo13335a(String str) {
        return f49241b.isLoggable(Level.FINE) ? new Throwable(str) : null;
    }

    /* renamed from: a */
    public void mo13339a(String str, Object obj) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = stringBuilder.toString();
        }
        mo13338a(5, str, (Throwable) obj);
    }

    /* renamed from: a */
    public static List<String> m60131a(List<Protocol> list) {
        List<String> arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = (Protocol) list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                arrayList.add(protocol.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C15944c mo13337a(X509TrustManager x509TrustManager) {
        return new C17683a(mo13342b(x509TrustManager));
    }

    /* renamed from: e */
    public static boolean m60135e() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: b */
    private static C15904f m60132b() {
        C15904f a = C17651a.m64269a();
        if (a != null) {
            return a;
        }
        if (C15904f.m60135e()) {
            a = C17652b.m64282b();
            if (a != null) {
                return a;
            }
        }
        a = C17653c.m64286b();
        if (a != null) {
            return a;
        }
        a = C17654d.m64289b();
        if (a != null) {
            return a;
        }
        return new C15904f();
    }

    /* renamed from: b */
    static byte[] m60133b(List<Protocol> list) {
        C18549c c18549c = new C18549c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = (Protocol) list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                c18549c.m66958b(protocol.toString().length());
                c18549c.m66948a(protocol.toString());
            }
        }
        return c18549c.readByteArray();
    }

    public SSLContext B_() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (Throwable e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: b */
    public TrustRootIndex mo13342b(X509TrustManager x509TrustManager) {
        return new C17684b(x509TrustManager.getAcceptedIssuers());
    }
}
