package com.squareup.okhttp;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.squareup.okhttp.C6071q.C6070a;
import com.squareup.okhttp.HttpUrl.Builder;
import com.squareup.okhttp.internal.C6015a;
import com.squareup.okhttp.internal.C6040g;
import com.squareup.okhttp.internal.C6058i;
import com.squareup.okhttp.internal.C6059j;
import com.squareup.okhttp.internal.framed.C6025a;
import com.squareup.okhttp.internal.framed.C6025a.C6024a;
import com.squareup.okhttp.internal.http.C6047e;
import com.squareup.okhttp.internal.http.C6050g;
import com.squareup.okhttp.internal.http.C6053j;
import com.squareup.okhttp.internal.http.C7236c;
import com.squareup.okhttp.internal.http.C7243i;
import com.squareup.okhttp.internal.http.RouteException;
import com.squareup.okhttp.internal.http.Transport;
import com.squareup.okhttp.internal.p151a.C6014b;
import java.io.IOException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import okio.Source;

/* renamed from: com.squareup.okhttp.g */
public final class C6007g {
    /* renamed from: a */
    private final C6009h f21958a;
    /* renamed from: b */
    private final C6077u f21959b;
    /* renamed from: c */
    private Socket f21960c;
    /* renamed from: d */
    private C6063m f21961d;
    /* renamed from: e */
    private Protocol f21962e;
    /* renamed from: f */
    private C6047e f21963f;
    /* renamed from: g */
    private C6025a f21964g;
    /* renamed from: h */
    private long f21965h;
    /* renamed from: i */
    private int f21966i;
    /* renamed from: j */
    private Object f21967j;

    public C6007g(C6009h c6009h, C6077u c6077u) {
        this.f21958a = c6009h;
        this.f21959b = c6077u;
    }

    /* renamed from: a */
    void m25830a(Object obj) {
        if (!m25842k()) {
            synchronized (this.f21958a) {
                if (this.f21967j != null) {
                    throw new IllegalStateException("Connection already has an owner!");
                }
                this.f21967j = obj;
            }
        }
    }

    /* renamed from: a */
    boolean m25831a() {
        synchronized (this.f21958a) {
            if (this.f21967j == null) {
                return false;
            }
            this.f21967j = null;
            return true;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    void m25832b(java.lang.Object r3) throws java.io.IOException {
        /*
        r2 = this;
        r0 = r2.m25842k();
        if (r0 == 0) goto L_0x000c;
    L_0x0006:
        r3 = new java.lang.IllegalStateException;
        r3.<init>();
        throw r3;
    L_0x000c:
        r0 = r2.f21958a;
        monitor-enter(r0);
        r1 = r2.f21967j;	 Catch:{ all -> 0x0023 }
        if (r1 == r3) goto L_0x0015;
    L_0x0013:
        monitor-exit(r0);	 Catch:{ all -> 0x0023 }
        return;
    L_0x0015:
        r3 = 0;
        r2.f21967j = r3;	 Catch:{ all -> 0x0023 }
        monitor-exit(r0);	 Catch:{ all -> 0x0023 }
        r3 = r2.f21960c;
        if (r3 == 0) goto L_0x0022;
    L_0x001d:
        r3 = r2.f21960c;
        r3.close();
    L_0x0022:
        return;
    L_0x0023:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0023 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.g.b(java.lang.Object):void");
    }

    /* renamed from: a */
    void m25828a(int i, int i2, int i3, List<C6012i> list, boolean z) throws RouteException {
        if (this.f21962e != null) {
            throw new IllegalStateException("already connected");
        }
        C6015a c6015a = new C6015a(list);
        Proxy b = this.f21959b.m26415b();
        C5995a a = this.f21959b.m26414a();
        if (this.f21959b.f22291a.m25761j() != null || list.contains(C6012i.f21981c)) {
            RouteException routeException = null;
            while (this.f21962e == null) {
                try {
                    Socket socket;
                    if (b.type() != Type.DIRECT) {
                        if (b.type() != Type.HTTP) {
                            socket = new Socket(b);
                            this.f21960c = socket;
                            m25822a(i, i2, i3, c6015a);
                        }
                    }
                    socket = a.m25755d().createSocket();
                    this.f21960c = socket;
                    m25822a(i, i2, i3, c6015a);
                } catch (IOException e) {
                    C6058i.m26249a(this.f21960c);
                    this.f21960c = null;
                    this.f21961d = null;
                    this.f21962e = null;
                    this.f21963f = null;
                    this.f21964g = null;
                    if (routeException == null) {
                        routeException = new RouteException(e);
                    } else {
                        routeException.m26125a(e);
                    }
                    if (!z || !c6015a.m25891a(e)) {
                        throw routeException;
                    }
                }
            }
            return;
        }
        i3 = new StringBuilder();
        i3.append("CLEARTEXT communication not supported: ");
        i3.append(list);
        throw new RouteException(new UnknownServiceException(i3.toString()));
    }

    /* renamed from: a */
    private void m25822a(int i, int i2, int i3, C6015a c6015a) throws IOException {
        this.f21960c.setSoTimeout(i2);
        C6040g.m26108a().mo6528a(this.f21960c, this.f21959b.m26416c(), i);
        if (this.f21959b.f22291a.m25761j() != 0) {
            m25823a(i2, i3, c6015a);
        } else {
            this.f21962e = Protocol.HTTP_1_1;
        }
        if (this.f21962e != Protocol.SPDY_3) {
            if (this.f21962e != Protocol.HTTP_2) {
                this.f21963f = new C6047e(this.f21958a, this, this.f21960c);
                return;
            }
        }
        this.f21960c.setSoTimeout(0);
        this.f21964g = new C6024a(this.f21959b.f22291a.f21900a, 1, this.f21960c).m25975a(this.f21962e).m25976a();
        this.f21964g.m26023e();
    }

    /* renamed from: a */
    private void m25823a(int i, int i2, C6015a c6015a) throws IOException {
        AssertionError e;
        if (this.f21959b.m26417d()) {
            m25824b(i, i2);
        }
        i = this.f21959b.m26414a();
        String str = null;
        try {
            Socket socket = (SSLSocket) i.m25761j().createSocket(this.f21960c, i.m25752a(), i.m25753b(), true);
            try {
                c6015a = c6015a.m25890a((SSLSocket) socket);
                if (c6015a.m25873c()) {
                    C6040g.m26108a().mo6529a((SSLSocket) socket, i.m25752a(), i.m25757f());
                }
                socket.startHandshake();
                C6063m a = C6063m.m26269a(socket.getSession());
                if (i.m25762k().verify(i.m25752a(), socket.getSession())) {
                    i.m25763l().m25819a(i.m25752a(), a.m26271b());
                    if (c6015a.m25873c() != 0) {
                        str = C6040g.m26108a().mo6530b((SSLSocket) socket);
                    }
                    this.f21960c = socket;
                    this.f21961d = a;
                    this.f21962e = str != null ? Protocol.get(str) : Protocol.HTTP_1_1;
                    if (socket != null) {
                        C6040g.m26108a().mo6532a((SSLSocket) socket);
                        return;
                    }
                    return;
                }
                X509Certificate x509Certificate = (X509Certificate) a.m26271b().get(0);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Hostname ");
                stringBuilder.append(i.m25752a());
                stringBuilder.append(" not verified:");
                stringBuilder.append("\n    certificate: ");
                stringBuilder.append(C6005e.m25816a((Certificate) x509Certificate));
                stringBuilder.append("\n    DN: ");
                stringBuilder.append(x509Certificate.getSubjectDN().getName());
                stringBuilder.append("\n    subjectAltNames: ");
                stringBuilder.append(C6014b.m25882a(x509Certificate));
                throw new SSLPeerUnverifiedException(stringBuilder.toString());
            } catch (AssertionError e2) {
                e = e2;
                str = socket;
                try {
                    if (C6058i.m26250a(e) == 0) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    i = th;
                    socket = str;
                    if (socket != 0) {
                        C6040g.m26108a().mo6532a((SSLSocket) socket);
                    }
                    C6058i.m26249a(socket);
                    throw i;
                }
            } catch (Throwable th2) {
                i = th2;
                if (socket != 0) {
                    C6040g.m26108a().mo6532a((SSLSocket) socket);
                }
                C6058i.m26249a(socket);
                throw i;
            }
        } catch (AssertionError e3) {
            e = e3;
            if (C6058i.m26250a(e) == 0) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    /* renamed from: b */
    private void m25824b(int i, int i2) throws IOException {
        C6071q n = m25825n();
        C6047e c6047e = new C6047e(this.f21958a, this, this.f21960c);
        c6047e.m26149a(i, i2);
        i = n.m26343a();
        i2 = new StringBuilder();
        i2.append("CONNECT ");
        i2.append(i.m25744g());
        i2.append(":");
        i2.append(i.m25745h());
        i2.append(" HTTP/1.1");
        String stringBuilder = i2.toString();
        while (true) {
            c6047e.m26152a(n.m26349e(), stringBuilder);
            c6047e.m26157d();
            C6075s a = c6047e.m26160g().m26374a(n).m26379a();
            long a2 = C6053j.m26206a(a);
            if (a2 == -1) {
                a2 = 0;
            }
            Source b = c6047e.m26154b(a2);
            C6058i.m26255b(b, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, TimeUnit.MILLISECONDS);
            b.close();
            int c = a.m26397c();
            if (c == Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                break;
            } else if (c != 407) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Unexpected response code for CONNECT: ");
                stringBuilder2.append(a.m26397c());
                throw new IOException(stringBuilder2.toString());
            } else {
                n = C6053j.m26208a(this.f21959b.m26414a().m25756e(), a, this.f21959b.m26415b());
                if (n == null) {
                    throw new IOException("Failed to authenticate with proxy");
                }
            }
        }
        if (c6047e.m26158e() > 0) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* renamed from: n */
    private C6071q m25825n() throws IOException {
        HttpUrl c = new Builder().m25714a("https").m25716b(this.f21959b.f22291a.f21900a).m25713a(this.f21959b.f22291a.f21901b).m25718c();
        return new C6070a().m26328a(c).m26334a("Host", C6058i.m26238a(c)).m26334a("Proxy-Connection", "Keep-Alive").m26334a("User-Agent", C6059j.m26257a()).m26335a();
    }

    /* renamed from: a */
    void m25829a(C6068p c6068p, Object obj) throws RouteException {
        m25830a(obj);
        if (m25833b() == null) {
            m25828a(c6068p.m26292a(), c6068p.m26296b(), c6068p.m26298c(), this.f21959b.f22291a.m25758g(), c6068p.m26314r());
            if (m25842k() != null) {
                c6068p.m26311o().m25851b(this);
            }
            c6068p.m26315s().m26120b(m25834c());
        }
        m25827a(c6068p.m26296b(), c6068p.m26298c());
    }

    /* renamed from: b */
    boolean m25833b() {
        return this.f21962e != null;
    }

    /* renamed from: c */
    public C6077u m25834c() {
        return this.f21959b;
    }

    /* renamed from: d */
    public Socket m25835d() {
        return this.f21960c;
    }

    /* renamed from: e */
    boolean m25836e() {
        return (this.f21960c.isClosed() || this.f21960c.isInputShutdown() || this.f21960c.isOutputShutdown()) ? false : true;
    }

    /* renamed from: f */
    boolean m25837f() {
        return this.f21963f != null ? this.f21963f.m26159f() : true;
    }

    /* renamed from: g */
    void m25838g() {
        if (this.f21964g != null) {
            throw new IllegalStateException("framedConnection != null");
        }
        this.f21965h = System.nanoTime();
    }

    /* renamed from: h */
    boolean m25839h() {
        if (this.f21964g != null) {
            if (!this.f21964g.m26020b()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    long m25840i() {
        return this.f21964g == null ? this.f21965h : this.f21964g.m26021c();
    }

    /* renamed from: j */
    public C6063m m25841j() {
        return this.f21961d;
    }

    /* renamed from: a */
    Transport m25826a(C6050g c6050g) throws IOException {
        return this.f21964g != null ? new C7236c(c6050g, this.f21964g) : new C7243i(c6050g, this.f21963f);
    }

    /* renamed from: k */
    boolean m25842k() {
        return this.f21964g != null;
    }

    /* renamed from: a */
    void m25827a(int i, int i2) throws RouteException {
        if (this.f21962e == null) {
            throw new IllegalStateException("not connected");
        } else if (this.f21963f != null) {
            try {
                this.f21960c.setSoTimeout(i);
                this.f21963f.m26149a(i, i2);
            } catch (int i3) {
                throw new RouteException(i3);
            }
        }
    }

    /* renamed from: l */
    void m25843l() {
        this.f21966i++;
    }

    /* renamed from: m */
    int m25844m() {
        return this.f21966i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Connection{");
        stringBuilder.append(this.f21959b.f22291a.f21900a);
        stringBuilder.append(":");
        stringBuilder.append(this.f21959b.f22291a.f21901b);
        stringBuilder.append(", proxy=");
        stringBuilder.append(this.f21959b.f22292b);
        stringBuilder.append(" hostAddress=");
        stringBuilder.append(this.f21959b.f22293c.getAddress().getHostAddress());
        stringBuilder.append(" cipherSuite=");
        stringBuilder.append(this.f21961d != null ? this.f21961d.m26270a() : "none");
        stringBuilder.append(" protocol=");
        stringBuilder.append(this.f21962e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
