package okhttp3.internal.p461b;

import android.os.Build.VERSION;
import android.util.Log;
import com.tinder.model.GlobalConfig;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.C15908c;
import okhttp3.internal.tls.C15944c;
import okhttp3.internal.tls.TrustRootIndex;

/* renamed from: okhttp3.internal.b.a */
class C17651a extends C15904f {
    /* renamed from: a */
    private final Class<?> f54864a;
    /* renamed from: b */
    private final C15903e<Socket> f54865b;
    /* renamed from: c */
    private final C15903e<Socket> f54866c;
    /* renamed from: d */
    private final C15903e<Socket> f54867d;
    /* renamed from: e */
    private final C15903e<Socket> f54868e;
    /* renamed from: f */
    private final C15901c f54869f = C15901c.m60121a();

    /* renamed from: okhttp3.internal.b.a$c */
    static final class C15901c {
        /* renamed from: a */
        private final Method f49231a;
        /* renamed from: b */
        private final Method f49232b;
        /* renamed from: c */
        private final Method f49233c;

        C15901c(Method method, Method method2, Method method3) {
            this.f49231a = method;
            this.f49232b = method2;
            this.f49233c = method3;
        }

        /* renamed from: a */
        java.lang.Object m60122a(java.lang.String r6) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r5 = this;
            r0 = r5.f49231a;
            r1 = 0;
            if (r0 == 0) goto L_0x0019;
        L_0x0005:
            r0 = r5.f49231a;	 Catch:{ Exception -> 0x0019 }
            r2 = 0;	 Catch:{ Exception -> 0x0019 }
            r3 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0019 }
            r0 = r0.invoke(r1, r3);	 Catch:{ Exception -> 0x0019 }
            r3 = r5.f49232b;	 Catch:{ Exception -> 0x0019 }
            r4 = 1;	 Catch:{ Exception -> 0x0019 }
            r4 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0019 }
            r4[r2] = r6;	 Catch:{ Exception -> 0x0019 }
            r3.invoke(r0, r4);	 Catch:{ Exception -> 0x0019 }
            return r0;
        L_0x0019:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.a.c.a(java.lang.String):java.lang.Object");
        }

        /* renamed from: a */
        boolean m60123a(java.lang.Object r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r3 = this;
            r0 = 0;
            if (r4 == 0) goto L_0x000b;
        L_0x0003:
            r1 = r3.f49233c;	 Catch:{ Exception -> 0x000b }
            r2 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x000b }
            r1.invoke(r4, r2);	 Catch:{ Exception -> 0x000b }
            r0 = 1;
        L_0x000b:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.a.c.a(java.lang.Object):boolean");
        }

        /* renamed from: a */
        static okhttp3.internal.p461b.C17651a.C15901c m60121a() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = 0;
            r1 = "dalvik.system.CloseGuard";	 Catch:{ Exception -> 0x0027 }
            r1 = java.lang.Class.forName(r1);	 Catch:{ Exception -> 0x0027 }
            r2 = "get";	 Catch:{ Exception -> 0x0027 }
            r3 = 0;	 Catch:{ Exception -> 0x0027 }
            r4 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0027 }
            r2 = r1.getMethod(r2, r4);	 Catch:{ Exception -> 0x0027 }
            r4 = "open";	 Catch:{ Exception -> 0x0027 }
            r5 = 1;	 Catch:{ Exception -> 0x0027 }
            r5 = new java.lang.Class[r5];	 Catch:{ Exception -> 0x0027 }
            r6 = java.lang.String.class;	 Catch:{ Exception -> 0x0027 }
            r5[r3] = r6;	 Catch:{ Exception -> 0x0027 }
            r4 = r1.getMethod(r4, r5);	 Catch:{ Exception -> 0x0027 }
            r5 = "warnIfOpen";	 Catch:{ Exception -> 0x0027 }
            r3 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0027 }
            r1 = r1.getMethod(r5, r3);	 Catch:{ Exception -> 0x0027 }
            r0 = r2;
            goto L_0x0029;
        L_0x0027:
            r1 = r0;
            r4 = r1;
        L_0x0029:
            r2 = new okhttp3.internal.b.a$c;
            r2.<init>(r0, r4, r1);
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.a.c.a():okhttp3.internal.b.a$c");
        }
    }

    /* renamed from: okhttp3.internal.b.a$a */
    static final class C17649a extends C15944c {
        /* renamed from: a */
        private final Object f54860a;
        /* renamed from: b */
        private final Method f54861b;

        public int hashCode() {
            return 0;
        }

        C17649a(Object obj, Method method) {
            this.f54860a = obj;
            this.f54861b = method;
        }

        /* renamed from: a */
        public List<Certificate> mo13333a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                X509Certificate[] x509CertificateArr = (X509Certificate[]) list.toArray(new X509Certificate[list.size()]);
                return (List) this.f54861b.invoke(this.f54860a, new Object[]{x509CertificateArr, "RSA", str});
            } catch (List<Certificate> list2) {
                str = new SSLPeerUnverifiedException(list2.getMessage());
                str.initCause(list2);
                throw str;
            } catch (List<Certificate> list22) {
                throw new AssertionError(list22);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C17649a;
        }
    }

    /* renamed from: okhttp3.internal.b.a$b */
    static final class C17650b implements TrustRootIndex {
        /* renamed from: a */
        private final X509TrustManager f54862a;
        /* renamed from: b */
        private final Method f54863b;

        C17650b(X509TrustManager x509TrustManager, Method method) {
            this.f54863b = method;
            this.f54862a = x509TrustManager;
        }

        public java.security.cert.X509Certificate findByIssuerAndSignature(java.security.cert.X509Certificate r6) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r5 = this;
            r0 = 0;
            r1 = r5.f54863b;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            r2 = r5.f54862a;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            r3 = 1;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            r3 = new java.lang.Object[r3];	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            r4 = 0;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            r3[r4] = r6;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            r6 = r1.invoke(r2, r3);	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            r6 = (java.security.cert.TrustAnchor) r6;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            if (r6 == 0) goto L_0x0018;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
        L_0x0013:
            r6 = r6.getTrustedCert();	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            goto L_0x0019;
        L_0x0018:
            r6 = r0;
        L_0x0019:
            return r6;
        L_0x001a:
            return r0;
        L_0x001b:
            r6 = move-exception;
            r0 = "unable to get issues and signature";
            r6 = okhttp3.internal.C15908c.m60155a(r0, r6);
            throw r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.a.b.findByIssuerAndSignature(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C17650b)) {
                return false;
            }
            C17650b c17650b = (C17650b) obj;
            if (!this.f54862a.equals(c17650b.f54862a) || this.f54863b.equals(c17650b.f54863b) == null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return this.f54862a.hashCode() + (this.f54863b.hashCode() * 31);
        }
    }

    C17651a(Class<?> cls, C15903e<Socket> c15903e, C15903e<Socket> c15903e2, C15903e<Socket> c15903e3, C15903e<Socket> c15903e4) {
        this.f54864a = cls;
        this.f54865b = c15903e;
        this.f54866c = c15903e2;
        this.f54867d = c15903e3;
        this.f54868e = c15903e4;
    }

    /* renamed from: a */
    public void mo13340a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C15908c.m60167a(e) != null) {
                throw new IOException(e);
            }
            throw e;
        } catch (Socket socket2) {
            inetSocketAddress = new IOException("Exception in connect");
            inetSocketAddress.initCause(socket2);
            throw inetSocketAddress;
        } catch (Socket socket22) {
            if (VERSION.SDK_INT == 26) {
                inetSocketAddress = new IOException("Exception in connect");
                inetSocketAddress.initCause(socket22);
                throw inetSocketAddress;
            }
            throw socket22;
        }
    }

    /* renamed from: a */
    public void mo13341a(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (str != null) {
            this.f54865b.m60128b(sSLSocket, Boolean.valueOf(true));
            this.f54866c.m60128b(sSLSocket, str);
        }
        if (this.f54868e != null && this.f54868e.m60127a((Object) sSLSocket) != null) {
            this.f54868e.m60130d(sSLSocket, new Object[]{C15904f.m60133b((List) list)});
        }
    }

    @Nullable
    /* renamed from: a */
    public String mo13336a(SSLSocket sSLSocket) {
        String str = null;
        if (this.f54867d == null || !this.f54867d.m60127a((Object) sSLSocket)) {
            return null;
        }
        byte[] bArr = (byte[]) this.f54867d.m60130d(sSLSocket, new Object[0]);
        if (bArr != null) {
            str = new String(bArr, C15908c.f49249e);
        }
        return str;
    }

    /* renamed from: a */
    public void mo13338a(int i, String str, Throwable th) {
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append('\n');
            stringBuilder.append(Log.getStackTraceString(th));
            str = stringBuilder.toString();
        }
        th = null;
        int length = str.length();
        while (th < length) {
            int min;
            int indexOf = str.indexOf(10, th);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, th + GlobalConfig.DEFAULT_RECS_INTERVAL);
                Log.println(i2, "OkHttp", str.substring(th, min));
                if (min >= indexOf) {
                    break;
                }
                th = min;
            }
            th = min + 1;
        }
    }

    /* renamed from: a */
    public Object mo13335a(String str) {
        return this.f54869f.m60122a(str);
    }

    /* renamed from: a */
    public void mo13339a(String str, Object obj) {
        if (this.f54869f.m60123a(obj) == null) {
            mo13338a(5, str, null);
        }
    }

    /* renamed from: b */
    public boolean mo13343b(java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = "android.security.NetworkSecurityPolicy";	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r1 = "getInstance";	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r2 = 0;	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r3 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r1 = r0.getMethod(r1, r3);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r3 = 0;	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r2 = new java.lang.Object[r2];	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r1 = r1.invoke(r3, r2);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r0 = r4.m64270a(r5, r0, r1);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        return r0;
    L_0x001b:
        r5 = move-exception;
        r0 = "unable to determine cleartext support";
        r5 = okhttp3.internal.C15908c.m60155a(r0, r5);
        throw r5;
    L_0x0023:
        r5 = super.mo13343b(r5);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.a.b(java.lang.String):boolean");
    }

    /* renamed from: a */
    private boolean m64270a(java.lang.String r6, java.lang.Class<?> r7, java.lang.Object r8) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = "isCleartextTrafficPermitted";	 Catch:{ NoSuchMethodException -> 0x001d }
        r1 = 1;	 Catch:{ NoSuchMethodException -> 0x001d }
        r2 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x001d }
        r3 = java.lang.String.class;	 Catch:{ NoSuchMethodException -> 0x001d }
        r4 = 0;	 Catch:{ NoSuchMethodException -> 0x001d }
        r2[r4] = r3;	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = r7.getMethod(r0, r2);	 Catch:{ NoSuchMethodException -> 0x001d }
        r1 = new java.lang.Object[r1];	 Catch:{ NoSuchMethodException -> 0x001d }
        r1[r4] = r6;	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = r0.invoke(r8, r1);	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = (java.lang.Boolean) r0;	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = r0.booleanValue();	 Catch:{ NoSuchMethodException -> 0x001d }
        return r0;
    L_0x001d:
        r6 = r5.m64272b(r6, r7, r8);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.a.a(java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }

    /* renamed from: b */
    private boolean m64272b(java.lang.String r4, java.lang.Class<?> r5, java.lang.Object r6) throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = "isCleartextTrafficPermitted";	 Catch:{ NoSuchMethodException -> 0x0016 }
        r1 = 0;	 Catch:{ NoSuchMethodException -> 0x0016 }
        r2 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = r5.getMethod(r0, r2);	 Catch:{ NoSuchMethodException -> 0x0016 }
        r0 = new java.lang.Object[r1];	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = r5.invoke(r6, r0);	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = (java.lang.Boolean) r5;	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = r5.booleanValue();	 Catch:{ NoSuchMethodException -> 0x0016 }
        return r5;
    L_0x0016:
        r4 = super.mo13343b(r4);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.a.b(java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }

    /* renamed from: b */
    private static boolean m64271b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "GMSCore_OpenSSL";
        r0 = java.security.Security.getProvider(r0);
        r1 = 1;
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        return r1;
    L_0x000a:
        r0 = "android.net.Network";	 Catch:{ ClassNotFoundException -> 0x0010 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0010 }
        return r1;
    L_0x0010:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.a.b():boolean");
    }

    /* renamed from: a */
    public okhttp3.internal.tls.C15944c mo13337a(javax.net.ssl.X509TrustManager r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r0 = "android.net.http.X509TrustManagerExtensions";	 Catch:{ Exception -> 0x0036 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0036 }
        r1 = 1;	 Catch:{ Exception -> 0x0036 }
        r2 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0036 }
        r3 = javax.net.ssl.X509TrustManager.class;	 Catch:{ Exception -> 0x0036 }
        r4 = 0;	 Catch:{ Exception -> 0x0036 }
        r2[r4] = r3;	 Catch:{ Exception -> 0x0036 }
        r2 = r0.getConstructor(r2);	 Catch:{ Exception -> 0x0036 }
        r3 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0036 }
        r3[r4] = r8;	 Catch:{ Exception -> 0x0036 }
        r2 = r2.newInstance(r3);	 Catch:{ Exception -> 0x0036 }
        r3 = "checkServerTrusted";	 Catch:{ Exception -> 0x0036 }
        r5 = 3;	 Catch:{ Exception -> 0x0036 }
        r5 = new java.lang.Class[r5];	 Catch:{ Exception -> 0x0036 }
        r6 = java.security.cert.X509Certificate[].class;	 Catch:{ Exception -> 0x0036 }
        r5[r4] = r6;	 Catch:{ Exception -> 0x0036 }
        r4 = java.lang.String.class;	 Catch:{ Exception -> 0x0036 }
        r5[r1] = r4;	 Catch:{ Exception -> 0x0036 }
        r1 = 2;	 Catch:{ Exception -> 0x0036 }
        r4 = java.lang.String.class;	 Catch:{ Exception -> 0x0036 }
        r5[r1] = r4;	 Catch:{ Exception -> 0x0036 }
        r0 = r0.getMethod(r3, r5);	 Catch:{ Exception -> 0x0036 }
        r1 = new okhttp3.internal.b.a$a;	 Catch:{ Exception -> 0x0036 }
        r1.<init>(r2, r0);	 Catch:{ Exception -> 0x0036 }
        return r1;
    L_0x0036:
        r8 = super.mo13337a(r8);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.a.a(javax.net.ssl.X509TrustManager):okhttp3.internal.tls.c");
    }

    /* renamed from: a */
    public static okhttp3.internal.p461b.C15904f m64269a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 0;
        r1 = "com.android.org.conscrypt.SSLParametersImpl";	 Catch:{ ClassNotFoundException -> 0x0009 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0009 }
    L_0x0007:
        r3 = r1;
        goto L_0x0010;
    L_0x0009:
        r1 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0056 }
        goto L_0x0007;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x0010:
        r4 = new okhttp3.internal.b.e;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = "setUseSessionTickets";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2 = 1;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = java.lang.Boolean.TYPE;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r7 = 0;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5[r7] = r6;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r4.<init>(r0, r1, r5);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5 = new okhttp3.internal.b.e;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = "setHostname";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r8 = java.lang.String.class;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6[r7] = r8;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5.<init>(r0, r1, r6);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = okhttp3.internal.p461b.C17651a.m64271b();	 Catch:{ ClassNotFoundException -> 0x0056 }
        if (r1 == 0) goto L_0x004d;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x0032:
        r1 = new okhttp3.internal.b.e;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = byte[].class;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r8 = "getAlpnSelectedProtocol";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r9 = new java.lang.Class[r7];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1.<init>(r6, r8, r9);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = new okhttp3.internal.b.e;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r8 = "setAlpnProtocols";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r9 = byte[].class;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2[r7] = r9;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6.<init>(r0, r8, r2);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r7 = r6;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = r1;	 Catch:{ ClassNotFoundException -> 0x0056 }
        goto L_0x004f;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x004d:
        r6 = r0;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r7 = r6;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x004f:
        r1 = new okhttp3.internal.b.a;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2 = r1;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ ClassNotFoundException -> 0x0056 }
        return r1;
    L_0x0056:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.a.a():okhttp3.internal.b.f");
    }

    /* renamed from: b */
    public okhttp3.internal.tls.TrustRootIndex mo13342b(javax.net.ssl.X509TrustManager r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = r7.getClass();	 Catch:{ NoSuchMethodException -> 0x001b }
        r1 = "findTrustAnchorByIssuerAndSignature";	 Catch:{ NoSuchMethodException -> 0x001b }
        r2 = 1;	 Catch:{ NoSuchMethodException -> 0x001b }
        r3 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x001b }
        r4 = 0;	 Catch:{ NoSuchMethodException -> 0x001b }
        r5 = java.security.cert.X509Certificate.class;	 Catch:{ NoSuchMethodException -> 0x001b }
        r3[r4] = r5;	 Catch:{ NoSuchMethodException -> 0x001b }
        r0 = r0.getDeclaredMethod(r1, r3);	 Catch:{ NoSuchMethodException -> 0x001b }
        r0.setAccessible(r2);	 Catch:{ NoSuchMethodException -> 0x001b }
        r1 = new okhttp3.internal.b.a$b;	 Catch:{ NoSuchMethodException -> 0x001b }
        r1.<init>(r7, r0);	 Catch:{ NoSuchMethodException -> 0x001b }
        return r1;
    L_0x001b:
        r7 = super.mo13342b(r7);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.a.b(javax.net.ssl.X509TrustManager):okhttp3.internal.tls.TrustRootIndex");
    }
}
