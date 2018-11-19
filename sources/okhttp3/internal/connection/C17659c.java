package okhttp3.internal.connection;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import okhttp3.C15885a;
import okhttp3.C15890d;
import okhttp3.C15894f;
import okhttp3.C15896g;
import okhttp3.C15955k;
import okhttp3.C15963q;
import okhttp3.C15963q.C15962a;
import okhttp3.C15966s;
import okhttp3.C15969u;
import okhttp3.C17692o;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor.Chain;
import okhttp3.Protocol;
import okhttp3.internal.C15908c;
import okhttp3.internal.C15922d;
import okhttp3.internal.http.C15925d;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http2.C15936e;
import okhttp3.internal.http2.C15936e.C15934a;
import okhttp3.internal.http2.C15936e.C15935b;
import okhttp3.internal.http2.C15939g;
import okhttp3.internal.http2.C17666d;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.p460a.C17648a;
import okhttp3.internal.p461b.C15904f;
import okhttp3.internal.tls.C15945d;
import okhttp3.internal.ws.C17686a.C15951e;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C15976k;
import okio.Source;

/* renamed from: okhttp3.internal.connection.c */
public final class C17659c extends C15935b implements Connection {
    /* renamed from: a */
    public boolean f54886a;
    /* renamed from: b */
    public int f54887b;
    /* renamed from: c */
    public int f54888c = 1;
    /* renamed from: d */
    public final List<Reference<C15921f>> f54889d = new ArrayList();
    /* renamed from: e */
    public long f54890e = Format.OFFSET_SAMPLE_RELATIVE;
    /* renamed from: g */
    private final C15894f f54891g;
    /* renamed from: h */
    private final C15969u f54892h;
    /* renamed from: i */
    private Socket f54893i;
    /* renamed from: j */
    private Socket f54894j;
    /* renamed from: k */
    private C15955k f54895k;
    /* renamed from: l */
    private Protocol f54896l;
    /* renamed from: m */
    private C15936e f54897m;
    /* renamed from: n */
    private BufferedSource f54898n;
    /* renamed from: o */
    private BufferedSink f54899o;

    public C17659c(C15894f c15894f, C15969u c15969u) {
        this.f54891g = c15894f;
        this.f54892h = c15969u;
    }

    /* renamed from: a */
    public void m64308a(int i, int i2, int i3, int i4, boolean z, Call call, EventListener eventListener) {
        IOException iOException;
        int i5;
        int i6;
        IOException e;
        int i7;
        IOException iOException2;
        IOException iOException3;
        Call call2 = call;
        EventListener eventListener2 = eventListener;
        if (this.f54896l != null) {
            throw new IllegalStateException("already connected");
        }
        List f = r7.f54892h.m60567a().m60027f();
        C15916b c15916b = new C15916b(f);
        if (r7.f54892h.m60567a().m60030i() == null) {
            if (f.contains(C15896g.f49204c)) {
                String g = r7.f54892h.m60567a().m60021a().m60010g();
                if (!C15904f.m60134c().mo13343b(g)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("CLEARTEXT communication to ");
                    stringBuilder.append(g);
                    stringBuilder.append(" not permitted by network security policy");
                    throw new RouteException(new UnknownServiceException(stringBuilder.toString()));
                }
            }
            throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
        }
        RouteException routeException = null;
        do {
            try {
                if (r7.f54892h.m60570d()) {
                    m64299a(i, i2, i3, call2, eventListener2);
                    if (r7.f54893i != null) {
                        i5 = i;
                        i6 = i2;
                    } else if (!r7.f54892h.m60570d() && r7.f54893i == null) {
                        throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                    } else if (r7.f54897m != null) {
                        synchronized (r7.f54891g) {
                            try {
                                r7.f54888c = r7.f54897m.m60327a();
                            } catch (Throwable th) {
                                Throwable th2 = th;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                }
                try {
                    m64300a(i, i2, call2, eventListener2);
                } catch (IOException e2) {
                    e = e2;
                    i7 = i4;
                    iOException2 = e;
                    C15908c.m60166a(r7.f54894j);
                    C15908c.m60166a(r7.f54893i);
                    r7.f54894j = null;
                    r7.f54893i = null;
                    r7.f54898n = null;
                    r7.f54899o = null;
                    r7.f54895k = null;
                    r7.f54896l = null;
                    r7.f54897m = null;
                    iOException3 = iOException2;
                    eventListener2.m59950a(call2, r7.f54892h.m60569c(), r7.f54892h.m60568b(), null, iOException2);
                    if (routeException != null) {
                        iOException = iOException3;
                        routeException.m60220a(iOException);
                    } else {
                        iOException = iOException3;
                        routeException = new RouteException(iOException);
                    }
                    if (z) {
                        break;
                    } else if (!c15916b.m60223a(iOException)) {
                    }
                    throw routeException;
                }
                try {
                    m64302a(c15916b, i4, call2, eventListener2);
                    eventListener2.m59949a(call2, r7.f54892h.m60569c(), r7.f54892h.m60568b(), r7.f54896l);
                    if (!r7.f54892h.m60570d()) {
                    }
                    if (r7.f54897m != null) {
                        synchronized (r7.f54891g) {
                            r7.f54888c = r7.f54897m.m60327a();
                        }
                        return;
                    }
                    return;
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (IOException e4) {
                e = e4;
                i5 = i;
                i6 = i2;
                i7 = i4;
                iOException2 = e;
                C15908c.m60166a(r7.f54894j);
                C15908c.m60166a(r7.f54893i);
                r7.f54894j = null;
                r7.f54893i = null;
                r7.f54898n = null;
                r7.f54899o = null;
                r7.f54895k = null;
                r7.f54896l = null;
                r7.f54897m = null;
                iOException3 = iOException2;
                eventListener2.m59950a(call2, r7.f54892h.m60569c(), r7.f54892h.m60568b(), null, iOException2);
                if (routeException != null) {
                    iOException = iOException3;
                    routeException = new RouteException(iOException);
                } else {
                    iOException = iOException3;
                    routeException.m60220a(iOException);
                }
                if (z) {
                    break;
                } else if (c15916b.m60223a(iOException)) {
                }
                throw routeException;
            }
        } while (c15916b.m60223a(iOException));
        throw routeException;
    }

    /* renamed from: a */
    private void m64299a(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
        C15963q c = m64304c();
        HttpUrl a = c.m60526a();
        int i4 = 0;
        while (i4 < 21) {
            m64300a(i, i2, call, eventListener);
            c = m64298a(i2, i3, c, a);
            if (c != null) {
                C15908c.m60166a(this.f54893i);
                this.f54893i = null;
                this.f54899o = null;
                this.f54898n = null;
                eventListener.m59949a(call, this.f54892h.m60569c(), this.f54892h.m60568b(), null);
                i4++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m64300a(int i, int i2, Call call, EventListener eventListener) throws IOException {
        Socket socket;
        Proxy b = this.f54892h.m60568b();
        C15885a a = this.f54892h.m60567a();
        if (b.type() != Type.DIRECT) {
            if (b.type() != Type.HTTP) {
                socket = new Socket(b);
                this.f54893i = socket;
                eventListener.m59948a(call, this.f54892h.m60569c(), b);
                this.f54893i.setSoTimeout(i2);
                C15904f.m60134c().mo13340a(this.f54893i, this.f54892h.m60569c(), i);
                this.f54898n = C15976k.m60609a(C15976k.m60619b(this.f54893i));
                this.f54899o = C15976k.m60608a(C15976k.m60613a(this.f54893i));
            }
        }
        socket = a.m60024c().createSocket();
        this.f54893i = socket;
        eventListener.m59948a(call, this.f54892h.m60569c(), b);
        this.f54893i.setSoTimeout(i2);
        try {
            C15904f.m60134c().mo13340a(this.f54893i, this.f54892h.m60569c(), i);
            try {
                this.f54898n = C15976k.m60609a(C15976k.m60619b(this.f54893i));
                this.f54899o = C15976k.m60608a(C15976k.m60613a(this.f54893i));
            } catch (int i3) {
                if ("throw with null exception".equals(i3.getMessage()) != 0) {
                    throw new IOException(i3);
                }
            }
        } catch (int i32) {
            call = new StringBuilder();
            call.append("Failed to connect to ");
            call.append(this.f54892h.m60569c());
            i2 = new ConnectException(call.toString());
            i2.initCause(i32);
            throw i2;
        }
    }

    /* renamed from: a */
    private void m64302a(C15916b c15916b, int i, Call call, EventListener eventListener) throws IOException {
        if (this.f54892h.m60567a().m60030i() == null) {
            this.f54896l = Protocol.HTTP_1_1;
            this.f54894j = this.f54893i;
            return;
        }
        eventListener.m59955b(call);
        m64301a(c15916b);
        eventListener.m59952a(call, this.f54895k);
        if (this.f54896l == Protocol.HTTP_2) {
            this.f54894j.setSoTimeout(null);
            this.f54897m = new C15934a(true).m60316a(this.f54894j, this.f54892h.m60567a().m60021a().m60010g(), this.f54898n, this.f54899o).m60317a((C15935b) this).m60315a(i).m60318a();
            this.f54897m.m60344c();
        }
    }

    /* renamed from: a */
    private void m64301a(C15916b c15916b) throws IOException {
        AssertionError e;
        C15885a a = this.f54892h.m60567a();
        String str = null;
        try {
            Socket socket = (SSLSocket) a.m60030i().createSocket(this.f54893i, a.m60021a().m60010g(), a.m60021a().m60011h(), true);
            try {
                c15916b = c15916b.m60222a((SSLSocket) socket);
                if (c15916b.m60087d()) {
                    C15904f.m60134c().mo13341a((SSLSocket) socket, a.m60021a().m60010g(), a.m60026e());
                }
                socket.startHandshake();
                SSLSession session = socket.getSession();
                if (m64303a(session)) {
                    C15955k a2 = C15955k.m60457a(session);
                    if (a.m60031j().verify(a.m60021a().m60010g(), session)) {
                        a.m60032k().m60063a(a.m60021a().m60010g(), a2.m60461c());
                        if (c15916b.m60087d() != null) {
                            str = C15904f.m60134c().mo13336a((SSLSocket) socket);
                        }
                        this.f54894j = socket;
                        this.f54898n = C15976k.m60609a(C15976k.m60619b(this.f54894j));
                        this.f54899o = C15976k.m60608a(C15976k.m60613a(this.f54894j));
                        this.f54895k = a2;
                        if (str != null) {
                            c15916b = Protocol.get(str);
                        } else {
                            c15916b = Protocol.HTTP_1_1;
                        }
                        this.f54896l = c15916b;
                        if (socket != null) {
                            C15904f.m60134c().mo13345b((SSLSocket) socket);
                            return;
                        }
                        return;
                    }
                    Certificate certificate = (X509Certificate) a2.m60461c().get(0);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Hostname ");
                    stringBuilder.append(a.m60021a().m60010g());
                    stringBuilder.append(" not verified:\n    certificate: ");
                    stringBuilder.append(C15890d.m60058a(certificate));
                    stringBuilder.append("\n    DN: ");
                    stringBuilder.append(certificate.getSubjectDN().getName());
                    stringBuilder.append("\n    subjectAltNames: ");
                    stringBuilder.append(C15945d.m60433a(certificate));
                    throw new SSLPeerUnverifiedException(stringBuilder.toString());
                }
                throw new IOException("a valid ssl session was not established");
            } catch (AssertionError e2) {
                e = e2;
                str = socket;
                try {
                    if (C15908c.m60167a(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    c15916b = th;
                    socket = str;
                    if (socket != null) {
                        C15904f.m60134c().mo13345b((SSLSocket) socket);
                    }
                    C15908c.m60166a(socket);
                    throw c15916b;
                }
            } catch (Throwable th2) {
                c15916b = th2;
                if (socket != null) {
                    C15904f.m60134c().mo13345b((SSLSocket) socket);
                }
                C15908c.m60166a(socket);
                throw c15916b;
            }
        } catch (AssertionError e3) {
            e = e3;
            if (C15908c.m60167a(e)) {
                throw e;
            }
            throw new IOException(e);
        }
    }

    /* renamed from: a */
    private boolean m64303a(SSLSession sSLSession) {
        return ("NONE".equals(sSLSession.getProtocol()) || "SSL_NULL_WITH_NULL_NULL".equals(sSLSession.getCipherSuite()) != null) ? null : true;
    }

    /* renamed from: a */
    private C15963q m64298a(int i, int i2, C15963q c15963q, HttpUrl httpUrl) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CONNECT ");
        stringBuilder.append(C15908c.m60158a(httpUrl, true));
        stringBuilder.append(" HTTP/1.1");
        httpUrl = stringBuilder.toString();
        while (true) {
            C17648a c17648a = new C17648a(null, null, this.f54898n, this.f54899o);
            this.f54898n.timeout().mo13437a((long) i, TimeUnit.MILLISECONDS);
            this.f54899o.timeout().mo13437a((long) i2, TimeUnit.MILLISECONDS);
            c17648a.m64263a(c15963q.m60529c(), httpUrl);
            c17648a.finishRequest();
            C15966s a = c17648a.readResponseHeaders(false).m60543a(c15963q).m60546a();
            long a2 = C15925d.m60264a(a);
            if (a2 == -1) {
                a2 = 0;
            }
            Source b = c17648a.m64266b(a2);
            C15908c.m60176b(b, (int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, TimeUnit.MILLISECONDS);
            b.close();
            int c = a.m60555c();
            if (c == Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                break;
            } else if (c != 407) {
                i2 = new StringBuilder();
                i2.append("Unexpected response code for CONNECT: ");
                i2.append(a.m60555c());
                throw new IOException(i2.toString());
            } else {
                C15963q authenticate = this.f54892h.m60567a().m60025d().authenticate(this.f54892h, a);
                if (authenticate == null) {
                    throw new IOException("Failed to authenticate with proxy");
                } else if ("close".equalsIgnoreCase(a.m60551a("Connection")) != null) {
                    return authenticate;
                } else {
                    c15963q = authenticate;
                }
            }
        }
        if (this.f54898n.buffer().exhausted() != 0) {
            if (this.f54899o.buffer().exhausted() != 0) {
                return null;
            }
        }
        throw new IOException("TLS tunnel buffered too many bytes!");
    }

    /* renamed from: c */
    private C15963q m64304c() {
        return new C15962a().m60514a(this.f54892h.m60567a().m60021a()).m60511a("Host", C15908c.m60158a(this.f54892h.m60567a().m60021a(), true)).m60511a("Proxy-Connection", "Keep-Alive").m60511a("User-Agent", C15922d.m60256a()).m60524d();
    }

    /* renamed from: a */
    public boolean m64312a(okhttp3.C15885a r5, @javax.annotation.Nullable okhttp3.C15969u r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.f54889d;
        r0 = r0.size();
        r1 = r4.f54888c;
        r2 = 0;
        if (r0 >= r1) goto L_0x00a6;
    L_0x000b:
        r0 = r4.f54886a;
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        goto L_0x00a6;
    L_0x0011:
        r0 = okhttp3.internal.C15900a.f49230a;
        r1 = r4.f54892h;
        r1 = r1.m60567a();
        r0 = r0.mo13406a(r1, r5);
        if (r0 != 0) goto L_0x0020;
    L_0x001f:
        return r2;
    L_0x0020:
        r0 = r5.m60021a();
        r0 = r0.m60010g();
        r1 = r4.route();
        r1 = r1.m60567a();
        r1 = r1.m60021a();
        r1 = r1.m60010g();
        r0 = r0.equals(r1);
        r1 = 1;
        if (r0 == 0) goto L_0x0040;
    L_0x003f:
        return r1;
    L_0x0040:
        r0 = r4.f54897m;
        if (r0 != 0) goto L_0x0045;
    L_0x0044:
        return r2;
    L_0x0045:
        if (r6 != 0) goto L_0x0048;
    L_0x0047:
        return r2;
    L_0x0048:
        r0 = r6.m60568b();
        r0 = r0.type();
        r3 = java.net.Proxy.Type.DIRECT;
        if (r0 == r3) goto L_0x0055;
    L_0x0054:
        return r2;
    L_0x0055:
        r0 = r4.f54892h;
        r0 = r0.m60568b();
        r0 = r0.type();
        r3 = java.net.Proxy.Type.DIRECT;
        if (r0 == r3) goto L_0x0064;
    L_0x0063:
        return r2;
    L_0x0064:
        r0 = r4.f54892h;
        r0 = r0.m60569c();
        r3 = r6.m60569c();
        r0 = r0.equals(r3);
        if (r0 != 0) goto L_0x0075;
    L_0x0074:
        return r2;
    L_0x0075:
        r6 = r6.m60567a();
        r6 = r6.m60031j();
        r0 = okhttp3.internal.tls.C15945d.f49466a;
        if (r6 == r0) goto L_0x0082;
    L_0x0081:
        return r2;
    L_0x0082:
        r6 = r5.m60021a();
        r6 = r4.m64311a(r6);
        if (r6 != 0) goto L_0x008d;
    L_0x008c:
        return r2;
    L_0x008d:
        r6 = r5.m60032k();	 Catch:{ SSLPeerUnverifiedException -> 0x00a5 }
        r5 = r5.m60021a();	 Catch:{ SSLPeerUnverifiedException -> 0x00a5 }
        r5 = r5.m60010g();	 Catch:{ SSLPeerUnverifiedException -> 0x00a5 }
        r0 = r4.handshake();	 Catch:{ SSLPeerUnverifiedException -> 0x00a5 }
        r0 = r0.m60461c();	 Catch:{ SSLPeerUnverifiedException -> 0x00a5 }
        r6.m60063a(r5, r0);	 Catch:{ SSLPeerUnverifiedException -> 0x00a5 }
        return r1;
    L_0x00a5:
        return r2;
    L_0x00a6:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.c.a(okhttp3.a, okhttp3.u):boolean");
    }

    /* renamed from: a */
    public boolean m64311a(HttpUrl httpUrl) {
        if (httpUrl.m60011h() != this.f54892h.m60567a().m60021a().m60011h()) {
            return false;
        }
        boolean z = true;
        if (httpUrl.m60010g().equals(this.f54892h.m60567a().m60021a().m60010g())) {
            return true;
        }
        if (this.f54895k == null || C15945d.f49466a.m60438a(httpUrl.m60010g(), (X509Certificate) this.f54895k.m60461c().get(0)) == null) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public HttpCodec m64305a(C17692o c17692o, Chain chain, C15921f c15921f) throws SocketException {
        if (this.f54897m != null) {
            return new C17666d(c17692o, chain, c15921f, this.f54897m);
        }
        this.f54894j.setSoTimeout(chain.readTimeoutMillis());
        this.f54898n.timeout().mo13437a((long) chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.f54899o.timeout().mo13437a((long) chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        return new C17648a(c17692o, c15921f, this.f54898n, this.f54899o);
    }

    /* renamed from: a */
    public C15951e m64306a(C15921f c15921f) {
        final C15921f c15921f2 = c15921f;
        return new C15951e(this, true, this.f54898n, this.f54899o) {
            /* renamed from: b */
            final /* synthetic */ C17659c f54885b;

            public void close() throws IOException {
                c15921f2.m60249a(true, c15921f2.m60245a(), -1, null);
            }
        };
    }

    public C15969u route() {
        return this.f54892h;
    }

    /* renamed from: a */
    public void m64307a() {
        C15908c.m60166a(this.f54893i);
    }

    public Socket socket() {
        return this.f54894j;
    }

    /* renamed from: a */
    public boolean m64313a(boolean r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.f54894j;
        r0 = r0.isClosed();
        r1 = 0;
        if (r0 != 0) goto L_0x0051;
    L_0x0009:
        r0 = r4.f54894j;
        r0 = r0.isInputShutdown();
        if (r0 != 0) goto L_0x0051;
    L_0x0011:
        r0 = r4.f54894j;
        r0 = r0.isOutputShutdown();
        if (r0 == 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0051;
    L_0x001a:
        r0 = r4.f54897m;
        r2 = 1;
        if (r0 == 0) goto L_0x0027;
    L_0x001f:
        r5 = r4.f54897m;
        r5 = r5.m60347d();
        r5 = r5 ^ r2;
        return r5;
    L_0x0027:
        if (r5 == 0) goto L_0x0050;
    L_0x0029:
        r5 = r4.f54894j;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r5 = r5.getSoTimeout();	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r0 = r4.f54894j;	 Catch:{ all -> 0x0048 }
        r0.setSoTimeout(r2);	 Catch:{ all -> 0x0048 }
        r0 = r4.f54898n;	 Catch:{ all -> 0x0048 }
        r0 = r0.exhausted();	 Catch:{ all -> 0x0048 }
        if (r0 == 0) goto L_0x0042;
    L_0x003c:
        r0 = r4.f54894j;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r0.setSoTimeout(r5);	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        return r1;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
    L_0x0042:
        r0 = r4.f54894j;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r0.setSoTimeout(r5);	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        return r2;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
    L_0x0048:
        r0 = move-exception;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r3 = r4.f54894j;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r3.setSoTimeout(r5);	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        throw r0;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
    L_0x004f:
        return r1;
    L_0x0050:
        return r2;
    L_0x0051:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.c.a(boolean):boolean");
    }

    /* renamed from: a */
    public void mo13348a(C15939g c15939g) throws IOException {
        c15939g.m60377a(ErrorCode.REFUSED_STREAM);
    }

    /* renamed from: a */
    public void mo13347a(C15936e c15936e) {
        synchronized (this.f54891g) {
            this.f54888c = c15936e.m60327a();
        }
    }

    public C15955k handshake() {
        return this.f54895k;
    }

    /* renamed from: b */
    public boolean m64314b() {
        return this.f54897m != null;
    }

    public Protocol protocol() {
        return this.f54896l;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Connection{");
        stringBuilder.append(this.f54892h.m60567a().m60021a().m60010g());
        stringBuilder.append(":");
        stringBuilder.append(this.f54892h.m60567a().m60021a().m60011h());
        stringBuilder.append(", proxy=");
        stringBuilder.append(this.f54892h.m60568b());
        stringBuilder.append(" hostAddress=");
        stringBuilder.append(this.f54892h.m60569c());
        stringBuilder.append(" cipherSuite=");
        stringBuilder.append(this.f54895k != null ? this.f54895k.m60460b() : "none");
        stringBuilder.append(" protocol=");
        stringBuilder.append(this.f54896l);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
