package okhttp3.internal.p461b;

import java.security.Provider;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;

/* renamed from: okhttp3.internal.b.b */
public class C17652b extends C15904f {
    private C17652b() {
    }

    /* renamed from: f */
    private Provider m64283f() {
        return new OpenSSLProvider();
    }

    /* renamed from: a */
    public void mo13341a(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C15904f.m60131a((List) list).toArray(new String[null]));
            return;
        }
        super.mo13341a(sSLSocket, str, (List) list);
    }

    @Nullable
    /* renamed from: a */
    public String mo13336a(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.mo13336a(sSLSocket);
    }

    public SSLContext B_() {
        try {
            return SSLContext.getInstance("TLS", m64283f());
        } catch (Throwable e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: b */
    public static okhttp3.internal.p461b.C15904f m64282b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = "org.conscrypt.ConscryptEngineSocket";	 Catch:{ ClassNotFoundException -> 0x0017 }
        java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0017 }
        r1 = org.conscrypt.Conscrypt.isAvailable();	 Catch:{ ClassNotFoundException -> 0x0017 }
        if (r1 != 0) goto L_0x000d;	 Catch:{ ClassNotFoundException -> 0x0017 }
    L_0x000c:
        return r0;	 Catch:{ ClassNotFoundException -> 0x0017 }
    L_0x000d:
        r1 = 1;	 Catch:{ ClassNotFoundException -> 0x0017 }
        org.conscrypt.Conscrypt.setUseEngineSocketByDefault(r1);	 Catch:{ ClassNotFoundException -> 0x0017 }
        r1 = new okhttp3.internal.b.b;	 Catch:{ ClassNotFoundException -> 0x0017 }
        r1.<init>();	 Catch:{ ClassNotFoundException -> 0x0017 }
        return r1;
    L_0x0017:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.b.b():okhttp3.internal.b.f");
    }
}
