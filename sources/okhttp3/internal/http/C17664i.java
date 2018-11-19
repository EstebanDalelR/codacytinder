package okhttp3.internal.http;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C15885a;
import okhttp3.C15890d;
import okhttp3.C15963q;
import okhttp3.C15963q.C15962a;
import okhttp3.C15964r;
import okhttp3.C15966s;
import okhttp3.C15969u;
import okhttp3.C17692o;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;
import okhttp3.internal.C15908c;
import okhttp3.internal.connection.C15921f;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;

/* renamed from: okhttp3.internal.http.i */
public final class C17664i implements Interceptor {
    /* renamed from: a */
    private final C17692o f54917a;
    /* renamed from: b */
    private final boolean f54918b;
    /* renamed from: c */
    private volatile C15921f f54919c;
    /* renamed from: d */
    private Object f54920d;
    /* renamed from: e */
    private volatile boolean f54921e;

    public C17664i(C17692o c17692o, boolean z) {
        this.f54917a = c17692o;
        this.f54918b = z;
    }

    /* renamed from: a */
    public void m64326a() {
        this.f54921e = true;
        C15921f c15921f = this.f54919c;
        if (c15921f != null) {
            c15921f.m60254f();
        }
    }

    /* renamed from: b */
    public boolean m64328b() {
        return this.f54921e;
    }

    /* renamed from: a */
    public void m64327a(Object obj) {
        this.f54920d = obj;
    }

    /* renamed from: c */
    public C15921f m64329c() {
        return this.f54919c;
    }

    public C15966s intercept(Chain chain) throws IOException {
        C15963q request = chain.request();
        C17662f c17662f = (C17662f) chain;
        Call call = c17662f.call();
        EventListener c = c17662f.m64319c();
        C15921f c15921f = new C15921f(this.f54917a.m64406p(), m64321a(request.m60526a()), call, c, this.f54920d);
        this.f54919c = c15921f;
        C15966s c15966s = null;
        int i = 0;
        while (!this.f54921e) {
            try {
                C15966s a = c17662f.m64317a(request, r9, null, null);
                C15966s a2 = c15966s != null ? a.m60561i().m60550c(c15966s.m60561i().m60545a(null).m60546a()).m60546a() : a;
                C15963q a3 = m64322a(a2, r9.m60250b());
                if (a3 == null) {
                    if (this.f54918b == null) {
                        r9.m60252d();
                    }
                    return a2;
                }
                C15908c.m60165a(a2.m60560h());
                int i2 = i + 1;
                if (i2 > 20) {
                    r9.m60252d();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Too many follow-up requests: ");
                    stringBuilder.append(i2);
                    throw new ProtocolException(stringBuilder.toString());
                } else if (a3.m60530d() instanceof UnrepeatableRequestBody) {
                    r9.m60252d();
                    throw new HttpRetryException("Cannot retry streamed HTTP body", a2.m60555c());
                } else {
                    if (!m64325a(a2, a3.m60526a())) {
                        r9.m60252d();
                        c15921f = new C15921f(this.f54917a.m64406p(), m64321a(a3.m60526a()), call, c, this.f54920d);
                        this.f54919c = c15921f;
                    } else if (r9.m60245a() != null) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Closing the body of ");
                        stringBuilder2.append(a2);
                        stringBuilder2.append(" didn't close its backing stream. Bad interceptor?");
                        throw new IllegalStateException(stringBuilder2.toString());
                    }
                    c15966s = a2;
                    request = a3;
                    i = i2;
                }
            } catch (RouteException e) {
                if (!m64323a(e.m60219a(), r9, false, request)) {
                    throw e.m60219a();
                }
            } catch (IOException e2) {
                if (!m64323a(e2, r9, !(e2 instanceof ConnectionShutdownException), request)) {
                    throw e2;
                }
            } catch (Throwable th) {
                r9.m60247a(null);
                r9.m60252d();
            }
        }
        r9.m60252d();
        throw new IOException("Canceled");
    }

    /* renamed from: a */
    private C15885a m64321a(HttpUrl httpUrl) {
        HostnameVerifier l;
        SSLSocketFactory sSLSocketFactory;
        C15890d m;
        C17664i c17664i = this;
        if (httpUrl.m60006d()) {
            SSLSocketFactory k = c17664i.f54917a.m64401k();
            l = c17664i.f54917a.m64402l();
            sSLSocketFactory = k;
            m = c17664i.f54917a.m64403m();
        } else {
            sSLSocketFactory = null;
            l = sSLSocketFactory;
            m = l;
        }
        return new C15885a(httpUrl.m60010g(), httpUrl.m60011h(), c17664i.f54917a.m64399i(), c17664i.f54917a.m64400j(), sSLSocketFactory, l, m, c17664i.f54917a.m64405o(), c17664i.f54917a.m64395e(), c17664i.f54917a.m64411u(), c17664i.f54917a.m64412v(), c17664i.f54917a.m64396f());
    }

    /* renamed from: a */
    private boolean m64323a(IOException iOException, C15921f c15921f, boolean z, C15963q c15963q) {
        c15921f.m60247a(iOException);
        if (!this.f54917a.m64409s()) {
            return false;
        }
        if ((z && (c15963q.m60530d() instanceof UnrepeatableRequestBody) != null) || m64324a(iOException, z) == null || c15921f.m60255g() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m64324a(IOException iOException, boolean z) {
        boolean z2 = false;
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!((iOException instanceof SocketTimeoutException) == null || z)) {
                z2 = true;
            }
            return z2;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && (iOException instanceof SSLPeerUnverifiedException) == null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private C15963q m64322a(C15966s c15966s, C15969u c15969u) throws IOException {
        if (c15966s == null) {
            throw new IllegalStateException();
        }
        int c = c15966s.m60555c();
        String b = c15966s.m60553a().m60527b();
        C15964r c15964r = null;
        switch (c) {
            case MapboxConstants.ANIMATION_DURATION /*300*/:
            case 301:
            case 302:
            case 303:
                break;
            case 307:
            case 308:
                if (b.equals("GET") == null && b.equals("HEAD") == null) {
                    return null;
                }
            case 401:
                return this.f54917a.m64404n().authenticate(c15969u, c15966s);
            case 407:
                Proxy b2;
                if (c15969u != null) {
                    b2 = c15969u.m60568b();
                } else {
                    b2 = this.f54917a.m64395e();
                }
                if (b2.type() == Type.HTTP) {
                    return this.f54917a.m64405o().authenticate(c15969u, c15966s);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            case 408:
                if (this.f54917a.m64409s() == null || (c15966s.m60553a().m60530d() instanceof UnrepeatableRequestBody) != null) {
                    return null;
                }
                if ((c15966s.m60563k() == null || c15966s.m60563k().m60555c() != 408) && m64320a(c15966s, (int) null) <= null) {
                    return c15966s.m60553a();
                }
                return null;
            case 503:
                if ((c15966s.m60563k() == null || c15966s.m60563k().m60555c() != 503) && m64320a(c15966s, (int) ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) == null) {
                    return c15966s.m60553a();
                }
                return null;
            default:
                return null;
        }
        if (this.f54917a.m64408r() == null) {
            return null;
        }
        c15969u = c15966s.m60551a("Location");
        if (c15969u == null) {
            return null;
        }
        HttpUrl d = c15966s.m60553a().m60526a().m60005d(c15969u);
        if (d == null) {
            return null;
        }
        if (!d.m60003c().equals(c15966s.m60553a().m60526a().m60003c()) && !this.f54917a.m64407q()) {
            return null;
        }
        C15962a e = c15966s.m60553a().m60531e();
        if (C15926e.m60277c(b)) {
            boolean d2 = C15926e.m60278d(b);
            if (C15926e.m60279e(b)) {
                e.m60512a("GET", null);
            } else {
                if (d2) {
                    c15964r = c15966s.m60553a().m60530d();
                }
                e.m60512a(b, c15964r);
            }
            if (!d2) {
                e.m60518b("Transfer-Encoding");
                e.m60518b("Content-Length");
                e.m60518b(ManagerWebServices.PARAM_CONTENT_TYPE);
            }
        }
        if (m64325a(c15966s, d) == null) {
            e.m60518b("Authorization");
        }
        return e.m60514a(d).m60524d();
    }

    /* renamed from: a */
    private int m64320a(C15966s c15966s, int i) {
        c15966s = c15966s.m60551a("Retry-After");
        if (c15966s == null) {
            return i;
        }
        return c15966s.matches("\\d+") != 0 ? Integer.valueOf(c15966s).intValue() : ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    /* renamed from: a */
    private boolean m64325a(C15966s c15966s, HttpUrl httpUrl) {
        c15966s = c15966s.m60553a().m60526a();
        return (c15966s.m60010g().equals(httpUrl.m60010g()) && c15966s.m60011h() == httpUrl.m60011h() && c15966s.m60003c().equals(httpUrl.m60003c()) != null) ? true : null;
    }
}
