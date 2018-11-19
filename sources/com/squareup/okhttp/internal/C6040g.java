package com.squareup.okhttp.internal;

import com.squareup.okhttp.Protocol;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okio.C18549c;

/* renamed from: com.squareup.okhttp.internal.g */
public class C6040g {
    /* renamed from: a */
    private static final C6040g f22136a = C6040g.m26110c();

    /* renamed from: com.squareup.okhttp.internal.g$c */
    private static class C6039c implements InvocationHandler {
        /* renamed from: a */
        private final List<String> f22133a;
        /* renamed from: b */
        private boolean f22134b;
        /* renamed from: c */
        private String f22135c;

        public C6039c(List<String> list) {
            this.f22133a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            obj = method.getName();
            Class returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C6058i.f22208b;
            }
            if (obj.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.valueOf(true);
            }
            if (obj.equals("unsupported") && Void.TYPE == returnType) {
                this.f22134b = true;
                return null;
            } else if (obj.equals("protocols") && objArr.length == 0) {
                return this.f22133a;
            } else {
                if ((obj.equals("selectProtocol") || obj.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    String str;
                    List list = (List) objArr[0];
                    method = list.size();
                    for (objArr = null; objArr < method; objArr++) {
                        if (this.f22133a.contains(list.get(objArr))) {
                            str = (String) list.get(objArr);
                            this.f22135c = str;
                            return str;
                        }
                    }
                    str = (String) this.f22133a.get(0);
                    this.f22135c = str;
                    return str;
                } else if ((!obj.equals("protocolSelected") && obj.equals(ManagerWebServices.PARAM_SELECTED) == null) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f22135c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    /* renamed from: com.squareup.okhttp.internal.g$a */
    private static class C7233a extends C6040g {
        /* renamed from: a */
        private final C6023f<Socket> f26088a;
        /* renamed from: b */
        private final C6023f<Socket> f26089b;
        /* renamed from: c */
        private final Method f26090c;
        /* renamed from: d */
        private final Method f26091d;
        /* renamed from: e */
        private final C6023f<Socket> f26092e;
        /* renamed from: f */
        private final C6023f<Socket> f26093f;

        public C7233a(C6023f<Socket> c6023f, C6023f<Socket> c6023f2, Method method, Method method2, C6023f<Socket> c6023f3, C6023f<Socket> c6023f4) {
            this.f26088a = c6023f;
            this.f26089b = c6023f2;
            this.f26090c = method;
            this.f26091d = method2;
            this.f26092e = c6023f3;
            this.f26093f = c6023f4;
        }

        /* renamed from: a */
        public void mo6528a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
            try {
                socket.connect(inetSocketAddress, i);
            } catch (AssertionError e) {
                if (C6058i.m26250a(e) != null) {
                    throw new IOException(e);
                }
                throw e;
            } catch (Socket socket2) {
                inetSocketAddress = new IOException("Exception in connect");
                inetSocketAddress.initCause(socket2);
                throw inetSocketAddress;
            }
        }

        /* renamed from: a */
        public void mo6529a(SSLSocket sSLSocket, String str, List<Protocol> list) {
            if (str != null) {
                this.f26088a.m25966b(sSLSocket, Boolean.valueOf(true));
                this.f26089b.m25966b(sSLSocket, str);
            }
            if (this.f26093f != null && this.f26093f.m25965a((Object) sSLSocket) != null) {
                this.f26093f.m25968d(sSLSocket, new Object[]{C6040g.m26109a((List) list)});
            }
        }

        /* renamed from: b */
        public String mo6530b(SSLSocket sSLSocket) {
            String str = null;
            if (this.f26092e == null || !this.f26092e.m25965a((Object) sSLSocket)) {
                return null;
            }
            byte[] bArr = (byte[]) this.f26092e.m25968d(sSLSocket, new Object[0]);
            if (bArr != null) {
                str = new String(bArr, C6058i.f22209c);
            }
            return str;
        }

        /* renamed from: a */
        public void mo6527a(Socket socket) throws SocketException {
            if (this.f26090c != null) {
                try {
                    this.f26090c.invoke(null, new Object[]{socket});
                } catch (Socket socket2) {
                    throw new RuntimeException(socket2);
                } catch (Socket socket22) {
                    throw new RuntimeException(socket22.getCause());
                }
            }
        }

        /* renamed from: b */
        public void mo6531b(Socket socket) throws SocketException {
            if (this.f26091d != null) {
                try {
                    this.f26091d.invoke(null, new Object[]{socket});
                } catch (Socket socket2) {
                    throw new RuntimeException(socket2);
                } catch (Socket socket22) {
                    throw new RuntimeException(socket22.getCause());
                }
            }
        }
    }

    /* renamed from: com.squareup.okhttp.internal.g$b */
    private static class C7234b extends C6040g {
        /* renamed from: a */
        private final Method f26094a;
        /* renamed from: b */
        private final Method f26095b;
        /* renamed from: c */
        private final Method f26096c;
        /* renamed from: d */
        private final Class<?> f26097d;
        /* renamed from: e */
        private final Class<?> f26098e;

        public C7234b(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
            this.f26094a = method;
            this.f26095b = method2;
            this.f26096c = method3;
            this.f26097d = cls;
            this.f26098e = cls2;
        }

        /* renamed from: a */
        public void mo6529a(SSLSocket sSLSocket, String str, List<Protocol> list) {
            str = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Protocol protocol = (Protocol) list.get(i);
                if (protocol != Protocol.HTTP_1_0) {
                    str.add(protocol.toString());
                }
            }
            try {
                str = Proxy.newProxyInstance(C6040g.class.getClassLoader(), new Class[]{this.f26097d, this.f26098e}, new C6039c(str));
                this.f26094a.invoke(null, new Object[]{sSLSocket, str});
            } catch (SSLSocket sSLSocket2) {
                throw new AssertionError(sSLSocket2);
            }
        }

        /* renamed from: a */
        public void mo6532a(javax.net.ssl.SSLSocket r5) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r4 = this;
            r0 = r4.f26096c;	 Catch:{ IllegalAccessException -> 0x000d, IllegalAccessException -> 0x000d }
            r1 = 0;	 Catch:{ IllegalAccessException -> 0x000d, IllegalAccessException -> 0x000d }
            r2 = 1;	 Catch:{ IllegalAccessException -> 0x000d, IllegalAccessException -> 0x000d }
            r2 = new java.lang.Object[r2];	 Catch:{ IllegalAccessException -> 0x000d, IllegalAccessException -> 0x000d }
            r3 = 0;	 Catch:{ IllegalAccessException -> 0x000d, IllegalAccessException -> 0x000d }
            r2[r3] = r5;	 Catch:{ IllegalAccessException -> 0x000d, IllegalAccessException -> 0x000d }
            r0.invoke(r1, r2);	 Catch:{ IllegalAccessException -> 0x000d, IllegalAccessException -> 0x000d }
            return;
        L_0x000d:
            r5 = new java.lang.AssertionError;
            r5.<init>();
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.g.b.a(javax.net.ssl.SSLSocket):void");
        }

        /* renamed from: b */
        public java.lang.String mo6530b(javax.net.ssl.SSLSocket r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r3 = this;
            r0 = r3.f26095b;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            r1 = 1;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            r1 = new java.lang.Object[r1];	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            r2 = 0;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            r1[r2] = r4;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            r4 = 0;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            r0 = r0.invoke(r4, r1);	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            r0 = java.lang.reflect.Proxy.getInvocationHandler(r0);	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            r0 = (com.squareup.okhttp.internal.C6040g.C6039c) r0;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            r1 = r0.f22134b;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            if (r1 != 0) goto L_0x0029;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
        L_0x0019:
            r1 = r0.f22135c;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            if (r1 != 0) goto L_0x0029;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
        L_0x001f:
            r0 = com.squareup.okhttp.internal.C6021d.f22040a;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            r1 = java.util.logging.Level.INFO;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            r2 = "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?";	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            r0.log(r1, r2);	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            return r4;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
        L_0x0029:
            r1 = r0.f22134b;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
            if (r1 == 0) goto L_0x0030;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
        L_0x002f:
            goto L_0x0034;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
        L_0x0030:
            r4 = r0.f22135c;	 Catch:{ InvocationTargetException -> 0x0035, InvocationTargetException -> 0x0035 }
        L_0x0034:
            return r4;
        L_0x0035:
            r4 = new java.lang.AssertionError;
            r4.<init>();
            throw r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.g.b.b(javax.net.ssl.SSLSocket):java.lang.String");
        }
    }

    /* renamed from: a */
    public void mo6527a(Socket socket) throws SocketException {
    }

    /* renamed from: a */
    public void mo6532a(SSLSocket sSLSocket) {
    }

    /* renamed from: a */
    public void mo6529a(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    /* renamed from: b */
    public String m26116b() {
        return "OkHttp";
    }

    /* renamed from: b */
    public String mo6530b(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: b */
    public void mo6531b(Socket socket) throws SocketException {
    }

    /* renamed from: a */
    public static C6040g m26108a() {
        return f22136a;
    }

    /* renamed from: a */
    public void m26111a(String str) {
        System.out.println(str);
    }

    /* renamed from: a */
    public void mo6528a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: c */
    private static com.squareup.okhttp.internal.C6040g m26110c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = 1;
        r1 = 0;
        r2 = "com.android.org.conscrypt.OpenSSLSocketImpl";	 Catch:{ ClassNotFoundException -> 0x0008 }
        java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x0008 }
        goto L_0x000d;
    L_0x0008:
        r2 = "org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl";	 Catch:{ ClassNotFoundException -> 0x0078 }
        java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x0078 }
    L_0x000d:
        r4 = new com.squareup.okhttp.internal.f;	 Catch:{ ClassNotFoundException -> 0x0078 }
        r2 = "setUseSessionTickets";	 Catch:{ ClassNotFoundException -> 0x0078 }
        r3 = new java.lang.Class[r0];	 Catch:{ ClassNotFoundException -> 0x0078 }
        r5 = java.lang.Boolean.TYPE;	 Catch:{ ClassNotFoundException -> 0x0078 }
        r3[r1] = r5;	 Catch:{ ClassNotFoundException -> 0x0078 }
        r5 = 0;	 Catch:{ ClassNotFoundException -> 0x0078 }
        r4.<init>(r5, r2, r3);	 Catch:{ ClassNotFoundException -> 0x0078 }
        r2 = new com.squareup.okhttp.internal.f;	 Catch:{ ClassNotFoundException -> 0x0078 }
        r3 = "setHostname";	 Catch:{ ClassNotFoundException -> 0x0078 }
        r6 = new java.lang.Class[r0];	 Catch:{ ClassNotFoundException -> 0x0078 }
        r7 = java.lang.String.class;	 Catch:{ ClassNotFoundException -> 0x0078 }
        r6[r1] = r7;	 Catch:{ ClassNotFoundException -> 0x0078 }
        r2.<init>(r5, r3, r6);	 Catch:{ ClassNotFoundException -> 0x0078 }
        r3 = "android.net.TrafficStats";	 Catch:{ ClassNotFoundException -> 0x006a, ClassNotFoundException -> 0x006a }
        r3 = java.lang.Class.forName(r3);	 Catch:{ ClassNotFoundException -> 0x006a, ClassNotFoundException -> 0x006a }
        r6 = "tagSocket";	 Catch:{ ClassNotFoundException -> 0x006a, ClassNotFoundException -> 0x006a }
        r7 = new java.lang.Class[r0];	 Catch:{ ClassNotFoundException -> 0x006a, ClassNotFoundException -> 0x006a }
        r8 = java.net.Socket.class;	 Catch:{ ClassNotFoundException -> 0x006a, ClassNotFoundException -> 0x006a }
        r7[r1] = r8;	 Catch:{ ClassNotFoundException -> 0x006a, ClassNotFoundException -> 0x006a }
        r6 = r3.getMethod(r6, r7);	 Catch:{ ClassNotFoundException -> 0x006a, ClassNotFoundException -> 0x006a }
        r7 = "untagSocket";	 Catch:{ ClassNotFoundException -> 0x0067, ClassNotFoundException -> 0x0067 }
        r8 = new java.lang.Class[r0];	 Catch:{ ClassNotFoundException -> 0x0067, ClassNotFoundException -> 0x0067 }
        r9 = java.net.Socket.class;	 Catch:{ ClassNotFoundException -> 0x0067, ClassNotFoundException -> 0x0067 }
        r8[r1] = r9;	 Catch:{ ClassNotFoundException -> 0x0067, ClassNotFoundException -> 0x0067 }
        r3 = r3.getMethod(r7, r8);	 Catch:{ ClassNotFoundException -> 0x0067, ClassNotFoundException -> 0x0067 }
        r7 = "android.net.Network";	 Catch:{ ClassNotFoundException -> 0x0065, ClassNotFoundException -> 0x0065 }
        java.lang.Class.forName(r7);	 Catch:{ ClassNotFoundException -> 0x0065, ClassNotFoundException -> 0x0065 }
        r7 = new com.squareup.okhttp.internal.f;	 Catch:{ ClassNotFoundException -> 0x0065, ClassNotFoundException -> 0x0065 }
        r8 = byte[].class;	 Catch:{ ClassNotFoundException -> 0x0065, ClassNotFoundException -> 0x0065 }
        r9 = "getAlpnSelectedProtocol";	 Catch:{ ClassNotFoundException -> 0x0065, ClassNotFoundException -> 0x0065 }
        r10 = new java.lang.Class[r1];	 Catch:{ ClassNotFoundException -> 0x0065, ClassNotFoundException -> 0x0065 }
        r7.<init>(r8, r9, r10);	 Catch:{ ClassNotFoundException -> 0x0065, ClassNotFoundException -> 0x0065 }
        r8 = new com.squareup.okhttp.internal.f;	 Catch:{ ClassNotFoundException -> 0x006d, ClassNotFoundException -> 0x006d }
        r9 = "setAlpnProtocols";	 Catch:{ ClassNotFoundException -> 0x006d, ClassNotFoundException -> 0x006d }
        r10 = new java.lang.Class[r0];	 Catch:{ ClassNotFoundException -> 0x006d, ClassNotFoundException -> 0x006d }
        r11 = byte[].class;	 Catch:{ ClassNotFoundException -> 0x006d, ClassNotFoundException -> 0x006d }
        r10[r1] = r11;	 Catch:{ ClassNotFoundException -> 0x006d, ClassNotFoundException -> 0x006d }
        r8.<init>(r5, r9, r10);	 Catch:{ ClassNotFoundException -> 0x006d, ClassNotFoundException -> 0x006d }
        r5 = r8;
        goto L_0x006d;
    L_0x0065:
        r7 = r5;
        goto L_0x006d;
    L_0x0067:
        r3 = r5;
        r7 = r3;
        goto L_0x006d;
    L_0x006a:
        r3 = r5;
        r6 = r3;
        r7 = r6;
    L_0x006d:
        r9 = r5;
        r8 = r7;
        r7 = r3;
        r10 = new com.squareup.okhttp.internal.g$a;	 Catch:{ ClassNotFoundException -> 0x0078 }
        r3 = r10;	 Catch:{ ClassNotFoundException -> 0x0078 }
        r5 = r2;	 Catch:{ ClassNotFoundException -> 0x0078 }
        r3.<init>(r4, r5, r6, r7, r8, r9);	 Catch:{ ClassNotFoundException -> 0x0078 }
        return r10;
    L_0x0078:
        r2 = "org.eclipse.jetty.alpn.ALPN";	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r3 = java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r4 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r4.<init>();	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r4.append(r2);	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r5 = "$Provider";	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r4.append(r5);	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r4 = r4.toString();	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r4 = java.lang.Class.forName(r4);	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r5 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r5.<init>();	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r5.append(r2);	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r6 = "$ClientProvider";	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r5.append(r6);	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r5 = r5.toString();	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r10 = java.lang.Class.forName(r5);	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r5 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r5.<init>();	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r5.append(r2);	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r2 = "$ServerProvider";	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r5.append(r2);	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r2 = r5.toString();	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r11 = java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r2 = "put";	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r5 = 2;	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r5 = new java.lang.Class[r5];	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r6 = javax.net.ssl.SSLSocket.class;	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r5[r1] = r6;	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r5[r0] = r4;	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r7 = r3.getMethod(r2, r5);	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r2 = "get";	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r4 = new java.lang.Class[r0];	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r5 = javax.net.ssl.SSLSocket.class;	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r4[r1] = r5;	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r8 = r3.getMethod(r2, r4);	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r2 = "remove";	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r0 = new java.lang.Class[r0];	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r4 = javax.net.ssl.SSLSocket.class;	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r0[r1] = r4;	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r9 = r3.getMethod(r2, r0);	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r0 = new com.squareup.okhttp.internal.g$b;	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r6 = r0;	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        r6.<init>(r7, r8, r9, r10, r11);	 Catch:{ ClassNotFoundException -> 0x00eb, ClassNotFoundException -> 0x00eb }
        return r0;
    L_0x00eb:
        r0 = new com.squareup.okhttp.internal.g;
        r0.<init>();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.g.c():com.squareup.okhttp.internal.g");
    }

    /* renamed from: a */
    static byte[] m26109a(List<Protocol> list) {
        C18549c c18549c = new C18549c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = (Protocol) list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                c18549c.b(protocol.toString().length());
                c18549c.a(protocol.toString());
            }
        }
        return c18549c.readByteArray();
    }
}
