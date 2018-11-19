package okhttp3.internal.p461b;

import com.tinder.api.ManagerWebServices;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.C15908c;

/* renamed from: okhttp3.internal.b.d */
class C17654d extends C15904f {
    /* renamed from: a */
    private final Method f54872a;
    /* renamed from: b */
    private final Method f54873b;
    /* renamed from: c */
    private final Method f54874c;
    /* renamed from: d */
    private final Class<?> f54875d;
    /* renamed from: e */
    private final Class<?> f54876e;

    /* renamed from: okhttp3.internal.b.d$a */
    private static class C15902a implements InvocationHandler {
        /* renamed from: a */
        boolean f49234a;
        /* renamed from: b */
        String f49235b;
        /* renamed from: c */
        private final List<String> f49236c;

        C15902a(List<String> list) {
            this.f49236c = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            obj = method.getName();
            Class returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C15908c.f49246b;
            }
            if (obj.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.valueOf(true);
            }
            if (obj.equals("unsupported") && Void.TYPE == returnType) {
                this.f49234a = true;
                return null;
            } else if (obj.equals("protocols") && objArr.length == 0) {
                return this.f49236c;
            } else {
                if ((obj.equals("selectProtocol") || obj.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    String str;
                    List list = (List) objArr[0];
                    method = list.size();
                    for (objArr = null; objArr < method; objArr++) {
                        if (this.f49236c.contains(list.get(objArr))) {
                            str = (String) list.get(objArr);
                            this.f49235b = str;
                            return str;
                        }
                    }
                    str = (String) this.f49236c.get(0);
                    this.f49235b = str;
                    return str;
                } else if ((!obj.equals("protocolSelected") && obj.equals(ManagerWebServices.PARAM_SELECTED) == null) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f49235b = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    C17654d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f54872a = method;
        this.f54873b = method2;
        this.f54874c = method3;
        this.f54875d = cls;
        this.f54876e = cls2;
    }

    /* renamed from: a */
    public void mo13341a(SSLSocket sSLSocket, String str, List<Protocol> list) {
        str = C15904f.m60131a((List) list);
        try {
            str = Proxy.newProxyInstance(C15904f.class.getClassLoader(), new Class[]{this.f54875d, this.f54876e}, new C15902a(str));
            this.f54872a.invoke(null, new Object[]{sSLSocket, str});
        } catch (Exception e) {
            throw C15908c.m60155a("unable to set alpn", e);
        }
    }

    /* renamed from: b */
    public void mo13345b(SSLSocket sSLSocket) {
        try {
            this.f54874c.invoke(null, new Object[]{sSLSocket});
        } catch (Exception e) {
            throw C15908c.m60155a("unable to remove alpn", e);
        }
    }

    @Nullable
    /* renamed from: a */
    public String mo13336a(SSLSocket sSLSocket) {
        try {
            Object[] objArr = new Object[]{sSLSocket};
            sSLSocket = null;
            C15902a c15902a = (C15902a) Proxy.getInvocationHandler(this.f54873b.invoke(null, objArr));
            if (c15902a.f49234a || c15902a.f49235b != null) {
                if (!c15902a.f49234a) {
                    sSLSocket = c15902a.f49235b;
                }
                return sSLSocket;
            }
            C15904f.m60134c().mo13338a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
            return null;
        } catch (Exception e) {
            throw C15908c.m60155a("unable to get selected protocol", e);
        }
    }

    /* renamed from: b */
    public static okhttp3.internal.p461b.C15904f m64289b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "org.eclipse.jetty.alpn.ALPN";	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r1 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2.<init>();	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2.append(r0);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = "$Provider";	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2.append(r3);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2 = r2.toString();	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2 = java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3.<init>();	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3.append(r0);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r4 = "$ClientProvider";	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3.append(r4);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = r3.toString();	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r8 = java.lang.Class.forName(r3);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3.<init>();	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3.append(r0);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r0 = "$ServerProvider";	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3.append(r0);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r0 = r3.toString();	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r9 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r0 = "put";	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = 2;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = new java.lang.Class[r3];	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r4 = javax.net.ssl.SSLSocket.class;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r5 = 0;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3[r5] = r4;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r4 = 1;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3[r4] = r2;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r0 = r1.getMethod(r0, r3);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2 = "get";	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = new java.lang.Class[r4];	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r6 = javax.net.ssl.SSLSocket.class;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3[r5] = r6;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r6 = r1.getMethod(r2, r3);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2 = "remove";	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = new java.lang.Class[r4];	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r4 = javax.net.ssl.SSLSocket.class;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3[r5] = r4;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r7 = r1.getMethod(r2, r3);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r1 = new okhttp3.internal.b.d;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r4 = r1;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r5 = r0;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r4.<init>(r5, r6, r7, r8, r9);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        return r1;
    L_0x0076:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.d.b():okhttp3.internal.b.f");
    }
}
