package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import okhttp3.C15896g;
import okhttp3.internal.C15900a;

/* renamed from: okhttp3.internal.connection.b */
public final class C15916b {
    /* renamed from: a */
    private final List<C15896g> f49319a;
    /* renamed from: b */
    private int f49320b = 0;
    /* renamed from: c */
    private boolean f49321c;
    /* renamed from: d */
    private boolean f49322d;

    public C15916b(List<C15896g> list) {
        this.f49319a = list;
    }

    /* renamed from: a */
    public C15896g m60222a(SSLSocket sSLSocket) throws IOException {
        C15896g c15896g;
        int size = this.f49319a.size();
        for (int i = this.f49320b; i < size; i++) {
            c15896g = (C15896g) this.f49319a.get(i);
            if (c15896g.m60084a(sSLSocket)) {
                this.f49320b = i + 1;
                break;
            }
        }
        c15896g = null;
        if (c15896g == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to find acceptable protocols. isFallback=");
            stringBuilder.append(this.f49322d);
            stringBuilder.append(", modes=");
            stringBuilder.append(this.f49319a);
            stringBuilder.append(", supported protocols=");
            stringBuilder.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
            throw new UnknownServiceException(stringBuilder.toString());
        }
        this.f49321c = m60221b(sSLSocket);
        C15900a.f49230a.mo13403a(c15896g, sSLSocket, this.f49322d);
        return c15896g;
    }

    /* renamed from: a */
    public boolean m60223a(IOException iOException) {
        boolean z = true;
        this.f49322d = true;
        if (!this.f49321c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z2 = iOException instanceof SSLHandshakeException;
        if ((z2 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if (!z2) {
            if ((iOException instanceof SSLProtocolException) == null) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    private boolean m60221b(SSLSocket sSLSocket) {
        for (int i = this.f49320b; i < this.f49319a.size(); i++) {
            if (((C15896g) this.f49319a.get(i)).m60084a(sSLSocket)) {
                return true;
            }
        }
        return null;
    }
}
