package com.squareup.okhttp.internal;

import com.squareup.okhttp.C6012i;
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

/* renamed from: com.squareup.okhttp.internal.a */
public final class C6015a {
    /* renamed from: a */
    private final List<C6012i> f21996a;
    /* renamed from: b */
    private int f21997b = 0;
    /* renamed from: c */
    private boolean f21998c;
    /* renamed from: d */
    private boolean f21999d;

    public C6015a(List<C6012i> list) {
        this.f21996a = list;
    }

    /* renamed from: a */
    public C6012i m25890a(SSLSocket sSLSocket) throws IOException {
        C6012i c6012i;
        int size = this.f21996a.size();
        for (int i = this.f21997b; i < size; i++) {
            c6012i = (C6012i) this.f21996a.get(i);
            if (c6012i.m25871a(sSLSocket)) {
                this.f21997b = i + 1;
                break;
            }
        }
        c6012i = null;
        if (c6012i == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to find acceptable protocols. isFallback=");
            stringBuilder.append(this.f21999d);
            stringBuilder.append(", modes=");
            stringBuilder.append(this.f21996a);
            stringBuilder.append(", supported protocols=");
            stringBuilder.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
            throw new UnknownServiceException(stringBuilder.toString());
        }
        this.f21998c = m25889b(sSLSocket);
        C6021d.f22041b.mo6556a(c6012i, sSLSocket, this.f21999d);
        return c6012i;
    }

    /* renamed from: a */
    public boolean m25891a(IOException iOException) {
        boolean z = true;
        this.f21999d = true;
        if (!this.f21998c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
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
    private boolean m25889b(SSLSocket sSLSocket) {
        for (int i = this.f21997b; i < this.f21996a.size(); i++) {
            if (((C6012i) this.f21996a.get(i)).m25871a(sSLSocket)) {
                return true;
            }
        }
        return null;
    }
}
