package com.foursquare.internal.network;

import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

@RestrictTo({Scope.LIBRARY})
/* renamed from: com.foursquare.internal.network.h */
public class C1933h extends SSLSocketFactory {
    /* renamed from: a */
    private static final String[] f5207a = new String[]{"TLSv1.2"};
    /* renamed from: b */
    private final SSLSocketFactory f5208b;

    public C1933h(SSLSocketFactory sSLSocketFactory) {
        this.f5208b = sSLSocketFactory;
    }

    public String[] getDefaultCipherSuites() {
        return this.f5208b.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f5208b.getSupportedCipherSuites();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m6778a(this.f5208b.createSocket(socket, str, i, z));
    }

    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return m6778a(this.f5208b.createSocket(str, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return m6778a(this.f5208b.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m6778a(this.f5208b.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m6778a(this.f5208b.createSocket(inetAddress, i, inetAddress2, i2));
    }

    /* renamed from: a */
    private Socket m6778a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(f5207a);
        }
        return socket;
    }
}
