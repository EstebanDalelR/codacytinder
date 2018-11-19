package com.squareup.okhttp.internal;

import com.squareup.okhttp.C6007g;
import com.squareup.okhttp.C6009h;
import com.squareup.okhttp.C6012i;
import com.squareup.okhttp.C6066n.C6065a;
import com.squareup.okhttp.C6068p;
import com.squareup.okhttp.internal.http.C6050g;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.Transport;
import java.io.IOException;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* renamed from: com.squareup.okhttp.internal.d */
public abstract class C6021d {
    /* renamed from: a */
    public static final Logger f22040a = Logger.getLogger(C6068p.class.getName());
    /* renamed from: b */
    public static C6021d f22041b;

    /* renamed from: a */
    public abstract InternalCache mo6552a(C6068p c6068p);

    /* renamed from: a */
    public abstract Transport mo6553a(C6007g c6007g, C6050g c6050g) throws IOException;

    /* renamed from: a */
    public abstract void mo6554a(C6007g c6007g, Object obj) throws IOException;

    /* renamed from: a */
    public abstract void mo6555a(C6009h c6009h, C6007g c6007g);

    /* renamed from: a */
    public abstract void mo6556a(C6012i c6012i, SSLSocket sSLSocket, boolean z);

    /* renamed from: a */
    public abstract void mo6557a(C6065a c6065a, String str);

    /* renamed from: a */
    public abstract void mo6558a(C6068p c6068p, C6007g c6007g, C6050g c6050g) throws RouteException;

    /* renamed from: a */
    public abstract boolean mo6559a(C6007g c6007g);

    /* renamed from: b */
    public abstract int mo6560b(C6007g c6007g);

    /* renamed from: b */
    public abstract C6041h mo6561b(C6068p c6068p);

    /* renamed from: b */
    public abstract void mo6562b(C6007g c6007g, C6050g c6050g);

    /* renamed from: c */
    public abstract boolean mo6563c(C6007g c6007g);
}
