package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Authenticator;
import com.squareup.okhttp.C6006f;
import com.squareup.okhttp.C6060j;
import com.squareup.okhttp.C6071q;
import com.squareup.okhttp.C6075s;
import com.squareup.okhttp.HttpUrl;
import java.io.IOException;
import java.net.Authenticator.RequestorType;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.List;

/* renamed from: com.squareup.okhttp.internal.http.a */
public final class C7235a implements Authenticator {
    /* renamed from: a */
    public static final Authenticator f26099a = new C7235a();

    public C6071q authenticate(Proxy proxy, C6075s c6075s) throws IOException {
        C7235a c7235a;
        List l = c6075s.m26406l();
        C6071q a = c6075s.m26393a();
        HttpUrl a2 = a.m26343a();
        int size = l.size();
        for (int i = 0; i < size; i++) {
            C6006f c6006f = (C6006f) l.get(i);
            if ("Basic".equalsIgnoreCase(c6006f.m25820a())) {
                PasswordAuthentication requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(a2.m25744g(), m31025a(proxy, a2), a2.m25745h(), a2.m25740c(), c6006f.m25821b(), c6006f.m25820a(), a2.m25737a(), RequestorType.SERVER);
                if (requestPasswordAuthentication != null) {
                    return a.m26351g().m26334a("Authorization", C6060j.m26258a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).m26335a();
                }
            } else {
                c7235a = this;
                Proxy proxy2 = proxy;
            }
        }
        c7235a = this;
        return null;
    }

    public C6071q authenticateProxy(Proxy proxy, C6075s c6075s) throws IOException {
        C7235a c7235a;
        List l = c6075s.m26406l();
        C6071q a = c6075s.m26393a();
        HttpUrl a2 = a.m26343a();
        int size = l.size();
        for (int i = 0; i < size; i++) {
            C6006f c6006f = (C6006f) l.get(i);
            if ("Basic".equalsIgnoreCase(c6006f.m25820a())) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                PasswordAuthentication requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), m31025a(proxy, a2), inetSocketAddress.getPort(), a2.m25740c(), c6006f.m25821b(), c6006f.m25820a(), a2.m25737a(), RequestorType.PROXY);
                if (requestPasswordAuthentication != null) {
                    return a.m26351g().m26334a("Proxy-Authorization", C6060j.m26258a(requestPasswordAuthentication.getUserName(), new String(requestPasswordAuthentication.getPassword()))).m26335a();
                }
            } else {
                c7235a = this;
            }
        }
        c7235a = this;
        return null;
    }

    /* renamed from: a */
    private InetAddress m31025a(Proxy proxy, HttpUrl httpUrl) throws IOException {
        if (proxy == null || proxy.type() == Type.DIRECT) {
            return InetAddress.getByName(httpUrl.m25744g());
        }
        return ((InetSocketAddress) proxy.address()).getAddress();
    }
}
