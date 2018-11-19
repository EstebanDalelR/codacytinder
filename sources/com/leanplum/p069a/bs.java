package com.leanplum.p069a;

import android.text.TextUtils;
import java.io.EOFException;
import java.io.PrintWriter;
import java.net.URI;
import javax.net.SocketFactory;
import javax.net.ssl.SSLException;
import org.apache.http.HttpException;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.message.BasicLineParser;

/* renamed from: com.leanplum.a.bs */
final class bs implements Runnable {
    /* renamed from: a */
    private /* synthetic */ ak f21226a;

    bs(ak akVar) {
        this.f21226a = akVar;
    }

    public final void run() {
        try {
            StringBuilder stringBuilder;
            int port = this.f21226a.f21157p.getPort() != -1 ? this.f21226a.f21157p.getPort() : this.f21226a.f21157p.getScheme().equals("wss") ? 443 : 80;
            String path = TextUtils.isEmpty(this.f21226a.f21157p.getPath()) ? "/" : this.f21226a.f21157p.getPath();
            if (!TextUtils.isEmpty(this.f21226a.f21157p.getQuery())) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(path);
                stringBuilder.append("?");
                stringBuilder.append(this.f21226a.f21157p.getQuery());
                path = stringBuilder.toString();
            }
            String str = this.f21226a.f21157p.getScheme().equals("wss") ? "https" : "http";
            URI uri = null;
            try {
                StringBuilder stringBuilder2 = new StringBuilder("//");
                stringBuilder2.append(this.f21226a.f21157p.getHost());
                uri = new URI(str, stringBuilder2.toString(), null);
            } catch (Throwable e) {
                bo.a(e);
            }
            try {
                try {
                    this.f21226a.f21159r = (this.f21226a.f21157p.getScheme().equals("wss") ? ak.m25040b(this.f21226a) : SocketFactory.getDefault()).createSocket(this.f21226a.f21157p.getHost(), port);
                } catch (Throwable e2) {
                    bo.a(e2);
                }
                PrintWriter printWriter = new PrintWriter(this.f21226a.f21159r.getOutputStream());
                stringBuilder = new StringBuilder("GET ");
                stringBuilder.append(path);
                stringBuilder.append(" HTTP/1.1\r\n");
                printWriter.print(stringBuilder.toString());
                printWriter.print("Upgrade: websocket\r\n");
                printWriter.print("Connection: Upgrade\r\n");
                StringBuilder stringBuilder3 = new StringBuilder("Host: ");
                stringBuilder3.append(this.f21226a.f21157p.getHost());
                stringBuilder3.append("\r\n");
                printWriter.print(stringBuilder3.toString());
                stringBuilder3 = new StringBuilder("Origin: ");
                stringBuilder3.append(uri != null ? uri.toString() : "unknown");
                stringBuilder3.append("\r\n");
                printWriter.print(stringBuilder3.toString());
                stringBuilder3 = new StringBuilder("Sec-WebSocket-Key: ");
                stringBuilder3.append(ak.m25046d(this.f21226a));
                stringBuilder3.append("\r\n");
                printWriter.print(stringBuilder3.toString());
                printWriter.print("Sec-WebSocket-Version: 13\r\n");
                if (this.f21226a.f21163v != null) {
                    for (NameValuePair nameValuePair : this.f21226a.f21163v) {
                        printWriter.print(String.format("%s: %s\r\n", new Object[]{nameValuePair.getName(), nameValuePair.getValue()}));
                    }
                }
                printWriter.print("\r\n");
                printWriter.flush();
                C5730z c5730z = new C5730z(this.f21226a.f21159r.getInputStream());
                StatusLine a = ak.m25033a(this.f21226a, ak.m25029a(this.f21226a, c5730z));
                if (a == null) {
                    throw new HttpException("Received no reply from server.");
                } else if (a.getStatusCode() != 101) {
                    throw new HttpResponseException(a.getStatusCode(), a.getReasonPhrase());
                } else {
                    while (true) {
                        Object a2 = ak.m25029a(this.f21226a, c5730z);
                        if (TextUtils.isEmpty(a2)) {
                            this.f21226a.f21158q.mo6208b();
                            this.f21226a.f21164w.m25173a(c5730z);
                            return;
                        }
                        BasicLineParser.parseHeader(a2, new BasicLineParser()).getName();
                    }
                }
            } catch (Throwable e22) {
                bo.a(e22);
            }
        } catch (EOFException e3) {
            ao.f(new Object[]{"WebSocket EOF!", e3});
            this.f21226a.f21158q.mo6205a(0, "EOF");
        } catch (SSLException e4) {
            ao.f(new Object[]{"Websocket SSL error!", e4});
            this.f21226a.f21158q.mo6205a(0, "SSL");
        } catch (Exception e5) {
            this.f21226a.f21158q.mo6206a(e5);
        }
    }
}
