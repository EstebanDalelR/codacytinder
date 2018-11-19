package okhttp3.internal.p461b;

import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.C15908c;

/* renamed from: okhttp3.internal.b.c */
final class C17653c extends C15904f {
    /* renamed from: a */
    final Method f54870a;
    /* renamed from: b */
    final Method f54871b;

    C17653c(Method method, Method method2) {
        this.f54870a = method;
        this.f54871b = method2;
    }

    /* renamed from: a */
    public void mo13341a(SSLSocket sSLSocket, String str, List<Protocol> list) {
        try {
            str = sSLSocket.getSSLParameters();
            list = C15904f.m60131a((List) list);
            this.f54870a.invoke(str, new Object[]{list.toArray(new String[list.size()])});
            sSLSocket.setSSLParameters(str);
        } catch (Exception e) {
            throw C15908c.m60155a("unable to set ssl parameters", e);
        }
    }

    @Nullable
    /* renamed from: a */
    public String mo13336a(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f54871b.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (Exception e) {
            throw C15908c.m60155a("unable to get selected protocols", e);
        }
    }

    /* renamed from: b */
    public static okhttp3.internal.p461b.C17653c m64286b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = javax.net.ssl.SSLParameters.class;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r1 = "setApplicationProtocols";	 Catch:{ NoSuchMethodException -> 0x0020 }
        r2 = 1;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r2 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x0020 }
        r3 = java.lang.String[].class;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r4 = 0;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r2[r4] = r3;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r0 = r0.getMethod(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0020 }
        r1 = javax.net.ssl.SSLSocket.class;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r2 = "getApplicationProtocol";	 Catch:{ NoSuchMethodException -> 0x0020 }
        r3 = new java.lang.Class[r4];	 Catch:{ NoSuchMethodException -> 0x0020 }
        r1 = r1.getMethod(r2, r3);	 Catch:{ NoSuchMethodException -> 0x0020 }
        r2 = new okhttp3.internal.b.c;	 Catch:{ NoSuchMethodException -> 0x0020 }
        r2.<init>(r0, r1);	 Catch:{ NoSuchMethodException -> 0x0020 }
        return r2;
    L_0x0020:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.c.b():okhttp3.internal.b.c");
    }
}
