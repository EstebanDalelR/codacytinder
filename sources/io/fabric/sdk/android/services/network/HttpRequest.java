package io.fabric.sdk.android.services.network;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.tinder.api.ManagerWebServices;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URI;
import java.net.URL;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

public class HttpRequest {
    /* renamed from: b */
    private static final String[] f48423b = new String[0];
    /* renamed from: c */
    private static ConnectionFactory f48424c = ConnectionFactory.f48421a;
    /* renamed from: a */
    public final URL f48425a;
    /* renamed from: d */
    private HttpURLConnection f48426d = null;
    /* renamed from: e */
    private final String f48427e;
    /* renamed from: f */
    private C15648c f48428f;
    /* renamed from: g */
    private boolean f48429g;
    /* renamed from: h */
    private boolean f48430h = true;
    /* renamed from: i */
    private boolean f48431i = false;
    /* renamed from: j */
    private int f48432j = 8192;
    /* renamed from: k */
    private String f48433k;
    /* renamed from: l */
    private int f48434l;

    public interface ConnectionFactory {
        /* renamed from: a */
        public static final ConnectionFactory f48421a = new C173431();

        /* renamed from: io.fabric.sdk.android.services.network.HttpRequest$ConnectionFactory$1 */
        static class C173431 implements ConnectionFactory {
            C173431() {
            }

            public HttpURLConnection create(URL url) throws IOException {
                return (HttpURLConnection) url.openConnection();
            }

            public HttpURLConnection create(URL url, Proxy proxy) throws IOException {
                return (HttpURLConnection) url.openConnection(proxy);
            }
        }

        HttpURLConnection create(URL url) throws IOException;

        HttpURLConnection create(URL url, Proxy proxy) throws IOException;
    }

    public static class HttpRequestException extends RuntimeException {
        private static final long serialVersionUID = -1170466989781746231L;

        public /* synthetic */ Throwable getCause() {
            return m58745a();
        }

        protected HttpRequestException(IOException iOException) {
            super(iOException);
        }

        /* renamed from: a */
        public IOException m58745a() {
            return (IOException) super.getCause();
        }
    }

    /* renamed from: io.fabric.sdk.android.services.network.HttpRequest$b */
    protected static abstract class C15647b<V> implements Callable<V> {
        /* renamed from: b */
        protected abstract V mo13557b() throws HttpRequestException, IOException;

        /* renamed from: c */
        protected abstract void mo12844c() throws IOException;

        protected C15647b() {
        }

        public V call() throws HttpRequestException {
            Throwable th;
            Object obj = 1;
            try {
                V b = mo13557b();
                try {
                    mo12844c();
                    return b;
                } catch (IOException e) {
                    throw new HttpRequestException(e);
                }
            } catch (HttpRequestException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new HttpRequestException(e3);
            } catch (Throwable th2) {
                th = th2;
                mo12844c();
                throw th;
            }
        }
    }

    /* renamed from: io.fabric.sdk.android.services.network.HttpRequest$c */
    public static class C15648c extends BufferedOutputStream {
        /* renamed from: a */
        private final CharsetEncoder f48422a;

        public C15648c(OutputStream outputStream, String str, int i) {
            super(outputStream, i);
            this.f48422a = Charset.forName(HttpRequest.m58761f(str)).newEncoder();
        }

        /* renamed from: a */
        public C15648c m58748a(String str) throws IOException {
            str = this.f48422a.encode(CharBuffer.wrap(str));
            super.write(str.array(), 0, str.limit());
            return this;
        }
    }

    /* renamed from: io.fabric.sdk.android.services.network.HttpRequest$a */
    protected static abstract class C17344a<V> extends C15647b<V> {
        /* renamed from: a */
        private final Closeable f53066a;
        /* renamed from: b */
        private final boolean f53067b;

        protected C17344a(Closeable closeable, boolean z) {
            this.f53066a = closeable;
            this.f53067b = z;
        }

        /* renamed from: c */
        protected void mo12844c() throws java.io.IOException {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r0 = r1.f53066a;
            r0 = r0 instanceof java.io.Flushable;
            if (r0 == 0) goto L_0x000d;
        L_0x0006:
            r0 = r1.f53066a;
            r0 = (java.io.Flushable) r0;
            r0.flush();
        L_0x000d:
            r0 = r1.f53067b;
            if (r0 == 0) goto L_0x0017;
        L_0x0011:
            r0 = r1.f53066a;	 Catch:{ IOException -> 0x001c }
            r0.close();	 Catch:{ IOException -> 0x001c }
            goto L_0x001c;
        L_0x0017:
            r0 = r1.f53066a;
            r0.close();
        L_0x001c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.network.HttpRequest.a.c():void");
        }
    }

    /* renamed from: f */
    private static String m58761f(String str) {
        return (str == null || str.length() <= 0) ? "UTF-8" : str;
    }

    /* renamed from: a */
    private static StringBuilder m58753a(String str, StringBuilder stringBuilder) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            stringBuilder.append('/');
        }
        return stringBuilder;
    }

    /* renamed from: b */
    private static StringBuilder m58756b(String str, StringBuilder stringBuilder) {
        int indexOf = str.indexOf(63);
        int length = stringBuilder.length() - 1;
        if (indexOf == -1) {
            stringBuilder.append(ManagerWebServices.QUERY_QUESTION_MARK);
        } else if (indexOf < length && str.charAt(length) != 38) {
            stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
        }
        return stringBuilder;
    }

    /* renamed from: a */
    public static String m58751a(CharSequence charSequence) throws HttpRequestException {
        try {
            URL url = new URL(charSequence.toString());
            charSequence = url.getHost();
            int port = url.getPort();
            if (port != -1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(charSequence);
                stringBuilder.append(':');
                stringBuilder.append(Integer.toString(port));
                charSequence = stringBuilder.toString();
            }
            try {
                charSequence = new URI(url.getProtocol(), charSequence, url.getPath(), url.getQuery(), null).toASCIIString();
                int indexOf = charSequence.indexOf(63);
                if (indexOf <= 0) {
                    return charSequence;
                }
                indexOf++;
                if (indexOf >= charSequence.length()) {
                    return charSequence;
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(charSequence.substring(0, indexOf));
                stringBuilder2.append(charSequence.substring(indexOf).replace("+", "%2B"));
                return stringBuilder2.toString();
            } catch (CharSequence charSequence2) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(charSequence2);
                throw new HttpRequestException(iOException);
            }
        } catch (CharSequence charSequence22) {
            throw new HttpRequestException(charSequence22);
        }
    }

    /* renamed from: a */
    public static String m58752a(CharSequence charSequence, Map<?, ?> map) {
        String charSequence2 = charSequence.toString();
        if (map != null) {
            if (!map.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder(charSequence2);
                m58753a(charSequence2, stringBuilder);
                m58756b(charSequence2, stringBuilder);
                charSequence = map.entrySet().iterator();
                Entry entry = (Entry) charSequence.next();
                stringBuilder.append(entry.getKey().toString());
                stringBuilder.append('=');
                map = entry.getValue();
                if (map != null) {
                    stringBuilder.append(map);
                }
                while (charSequence.hasNext() != null) {
                    stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
                    entry = (Entry) charSequence.next();
                    stringBuilder.append(entry.getKey().toString());
                    stringBuilder.append('=');
                    map = entry.getValue();
                    if (map != null) {
                        stringBuilder.append(map);
                    }
                }
                return stringBuilder.toString();
            }
        }
        return charSequence2;
    }

    /* renamed from: b */
    public static HttpRequest m58754b(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "GET");
    }

    /* renamed from: a */
    public static HttpRequest m58750a(CharSequence charSequence, Map<?, ?> map, boolean z) {
        charSequence = m58752a(charSequence, (Map) map);
        if (z) {
            charSequence = m58751a(charSequence);
        }
        return m58754b(charSequence);
    }

    /* renamed from: c */
    public static HttpRequest m58757c(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "POST");
    }

    /* renamed from: b */
    public static HttpRequest m58755b(CharSequence charSequence, Map<?, ?> map, boolean z) {
        charSequence = m58752a(charSequence, (Map) map);
        if (z) {
            charSequence = m58751a(charSequence);
        }
        return m58757c(charSequence);
    }

    /* renamed from: d */
    public static HttpRequest m58758d(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "PUT");
    }

    /* renamed from: e */
    public static HttpRequest m58759e(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "DELETE");
    }

    public HttpRequest(CharSequence charSequence, String str) throws HttpRequestException {
        try {
            this.f48425a = new URL(charSequence.toString());
            this.f48427e = str;
        } catch (CharSequence charSequence2) {
            throw new HttpRequestException(charSequence2);
        }
    }

    /* renamed from: q */
    private Proxy m58762q() {
        return new Proxy(Type.HTTP, new InetSocketAddress(this.f48433k, this.f48434l));
    }

    /* renamed from: r */
    private HttpURLConnection m58763r() {
        try {
            HttpURLConnection create;
            if (this.f48433k != null) {
                create = f48424c.create(this.f48425a, m58762q());
            } else {
                create = f48424c.create(this.f48425a);
            }
            create.setRequestMethod(this.f48427e);
            return create;
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m58802p());
        stringBuilder.append(' ');
        stringBuilder.append(m58801o());
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public HttpURLConnection m58777a() {
        if (this.f48426d == null) {
            this.f48426d = m58763r();
        }
        return this.f48426d;
    }

    /* renamed from: b */
    public int m58778b() throws HttpRequestException {
        try {
            m58797k();
            return m58777a().getResponseCode();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: c */
    public boolean m58784c() throws HttpRequestException {
        return Callback.DEFAULT_DRAG_ANIMATION_DURATION == m58778b();
    }

    /* renamed from: d */
    protected ByteArrayOutputStream m58787d() {
        int j = m58796j();
        if (j > 0) {
            return new ByteArrayOutputStream(j);
        }
        return new ByteArrayOutputStream();
    }

    /* renamed from: a */
    public String m58776a(String str) throws HttpRequestException {
        OutputStream d = m58787d();
        try {
            m58766a(m58792f(), d);
            return d.toString(m58761f(str));
        } catch (String str2) {
            throw new HttpRequestException(str2);
        }
    }

    /* renamed from: e */
    public String m58789e() throws HttpRequestException {
        return m58776a(m58794h());
    }

    /* renamed from: f */
    public BufferedInputStream m58792f() throws HttpRequestException {
        return new BufferedInputStream(m58793g(), this.f48432j);
    }

    /* renamed from: g */
    public InputStream m58793g() throws HttpRequestException {
        InputStream inputStream;
        if (m58778b() < 400) {
            try {
                inputStream = m58777a().getInputStream();
            } catch (IOException e) {
                throw new HttpRequestException(e);
            }
        }
        inputStream = m58777a().getErrorStream();
        if (inputStream == null) {
            try {
                inputStream = m58777a().getInputStream();
            } catch (IOException e2) {
                throw new HttpRequestException(e2);
            }
        }
        if (this.f48431i) {
            if ("gzip".equals(m58795i())) {
                try {
                    return new GZIPInputStream(inputStream);
                } catch (IOException e22) {
                    throw new HttpRequestException(e22);
                }
            }
        }
        return inputStream;
    }

    /* renamed from: a */
    public HttpRequest m58765a(int i) {
        m58777a().setConnectTimeout(i);
        return this;
    }

    /* renamed from: a */
    public HttpRequest m58768a(String str, String str2) {
        m58777a().setRequestProperty(str, str2);
        return this;
    }

    /* renamed from: a */
    public HttpRequest m58774a(Entry<String, String> entry) {
        return m58768a((String) entry.getKey(), (String) entry.getValue());
    }

    /* renamed from: b */
    public String m58780b(String str) throws HttpRequestException {
        m58798l();
        return m58777a().getHeaderField(str);
    }

    /* renamed from: c */
    public int m58782c(String str) throws HttpRequestException {
        return m58764a(str, -1);
    }

    /* renamed from: a */
    public int m58764a(String str, int i) throws HttpRequestException {
        m58798l();
        return m58777a().getHeaderFieldInt(str, i);
    }

    /* renamed from: b */
    public String m58781b(String str, String str2) {
        return m58783c(m58780b(str), str2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    protected java.lang.String m58783c(java.lang.String r9, java.lang.String r10) {
        /*
        r8 = this;
        r0 = 0;
        if (r9 == 0) goto L_0x0071;
    L_0x0003:
        r1 = r9.length();
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        goto L_0x0071;
    L_0x000a:
        r1 = r9.length();
        r2 = 59;
        r3 = r9.indexOf(r2);
        r4 = 1;
        r3 = r3 + r4;
        if (r3 == 0) goto L_0x0070;
    L_0x0018:
        if (r3 != r1) goto L_0x001b;
    L_0x001a:
        goto L_0x0070;
    L_0x001b:
        r5 = r9.indexOf(r2, r3);
        r6 = -1;
        if (r5 != r6) goto L_0x0023;
    L_0x0022:
        r5 = r1;
    L_0x0023:
        if (r3 >= r5) goto L_0x006f;
    L_0x0025:
        r7 = 61;
        r7 = r9.indexOf(r7, r3);
        if (r7 == r6) goto L_0x0066;
    L_0x002d:
        if (r7 >= r5) goto L_0x0066;
    L_0x002f:
        r3 = r9.substring(r3, r7);
        r3 = r3.trim();
        r3 = r10.equals(r3);
        if (r3 == 0) goto L_0x0066;
    L_0x003d:
        r7 = r7 + 1;
        r3 = r9.substring(r7, r5);
        r3 = r3.trim();
        r7 = r3.length();
        if (r7 == 0) goto L_0x0066;
    L_0x004d:
        r9 = 2;
        if (r7 <= r9) goto L_0x0065;
    L_0x0050:
        r9 = 0;
        r9 = r3.charAt(r9);
        r10 = 34;
        if (r10 != r9) goto L_0x0065;
    L_0x0059:
        r7 = r7 - r4;
        r9 = r3.charAt(r7);
        if (r10 != r9) goto L_0x0065;
    L_0x0060:
        r9 = r3.substring(r4, r7);
        return r9;
    L_0x0065:
        return r3;
    L_0x0066:
        r3 = r5 + 1;
        r5 = r9.indexOf(r2, r3);
        if (r5 != r6) goto L_0x0023;
    L_0x006e:
        goto L_0x0022;
    L_0x006f:
        return r0;
    L_0x0070:
        return r0;
    L_0x0071:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.network.HttpRequest.c(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: h */
    public String m58794h() {
        return m58781b(ManagerWebServices.PARAM_CONTENT_TYPE, "charset");
    }

    /* renamed from: a */
    public HttpRequest m58775a(boolean z) {
        m58777a().setUseCaches(z);
        return this;
    }

    /* renamed from: i */
    public String m58795i() {
        return m58780b("Content-Encoding");
    }

    /* renamed from: d */
    public HttpRequest m58785d(String str) {
        return m58786d(str, null);
    }

    /* renamed from: d */
    public HttpRequest m58786d(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return m58768a(ManagerWebServices.PARAM_CONTENT_TYPE, str);
        }
        String str3 = ManagerWebServices.PARAM_CONTENT_TYPE;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("; charset=");
        stringBuilder.append(str2);
        return m58768a(str3, stringBuilder.toString());
    }

    /* renamed from: j */
    public int m58796j() {
        return m58782c("Content-Length");
    }

    /* renamed from: a */
    protected HttpRequest m58766a(InputStream inputStream, OutputStream outputStream) throws IOException {
        final InputStream inputStream2 = inputStream;
        final OutputStream outputStream2 = outputStream;
        return (HttpRequest) new C17344a<HttpRequest>(this, inputStream, this.f48430h) {
            /* renamed from: c */
            final /* synthetic */ HttpRequest f56802c;

            /* renamed from: b */
            public /* synthetic */ Object mo13557b() throws HttpRequestException, IOException {
                return m66370a();
            }

            /* renamed from: a */
            public HttpRequest m66370a() throws IOException {
                byte[] bArr = new byte[this.f56802c.f48432j];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        return this.f56802c;
                    }
                    outputStream2.write(bArr, 0, read);
                }
            }
        }.call();
    }

    /* renamed from: k */
    protected io.fabric.sdk.android.services.network.HttpRequest m58797k() throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f48428f;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return r2;
    L_0x0005:
        r0 = r2.f48429g;
        if (r0 == 0) goto L_0x0010;
    L_0x0009:
        r0 = r2.f48428f;
        r1 = "\r\n--00content0boundary00--\r\n";
        r0.m58748a(r1);
    L_0x0010:
        r0 = r2.f48430h;
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r0 = r2.f48428f;	 Catch:{ IOException -> 0x001f }
        r0.close();	 Catch:{ IOException -> 0x001f }
        goto L_0x001f;
    L_0x001a:
        r0 = r2.f48428f;
        r0.close();
    L_0x001f:
        r0 = 0;
        r2.f48428f = r0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.network.HttpRequest.k():io.fabric.sdk.android.services.network.HttpRequest");
    }

    /* renamed from: l */
    protected HttpRequest m58798l() throws HttpRequestException {
        try {
            return m58797k();
        } catch (IOException e) {
            throw new HttpRequestException(e);
        }
    }

    /* renamed from: m */
    protected HttpRequest m58799m() throws IOException {
        if (this.f48428f != null) {
            return this;
        }
        m58777a().setDoOutput(true);
        this.f48428f = new C15648c(m58777a().getOutputStream(), m58783c(m58777a().getRequestProperty(ManagerWebServices.PARAM_CONTENT_TYPE), "charset"), this.f48432j);
        return this;
    }

    /* renamed from: n */
    protected HttpRequest m58800n() throws IOException {
        if (this.f48429g) {
            this.f48428f.m58748a("\r\n--00content0boundary00\r\n");
        } else {
            this.f48429g = true;
            m58785d("multipart/form-data; boundary=00content0boundary00").m58799m();
            this.f48428f.m58748a("--00content0boundary00\r\n");
        }
        return this;
    }

    /* renamed from: a */
    protected HttpRequest m58770a(String str, String str2, String str3) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("form-data; name=\"");
        stringBuilder.append(str);
        if (str2 != null) {
            stringBuilder.append("\"; filename=\"");
            stringBuilder.append(str2);
        }
        stringBuilder.append('\"');
        m58791f("Content-Disposition", stringBuilder.toString());
        if (str3 != null) {
            m58791f(ManagerWebServices.PARAM_CONTENT_TYPE, str3);
        }
        return m58790f((CharSequence) "\r\n");
    }

    /* renamed from: e */
    public HttpRequest m58788e(String str, String str2) {
        return m58779b(str, null, str2);
    }

    /* renamed from: b */
    public HttpRequest m58779b(String str, String str2, String str3) throws HttpRequestException {
        return m58773a(str, str2, null, str3);
    }

    /* renamed from: a */
    public HttpRequest m58773a(String str, String str2, String str3, String str4) throws HttpRequestException {
        try {
            m58800n();
            m58770a(str, str2, str3);
            this.f48428f.m58748a(str4);
            return this;
        } catch (String str5) {
            throw new HttpRequestException(str5);
        }
    }

    /* renamed from: a */
    public HttpRequest m58767a(String str, Number number) throws HttpRequestException {
        return m58769a(str, null, number);
    }

    /* renamed from: a */
    public HttpRequest m58769a(String str, String str2, Number number) throws HttpRequestException {
        return m58779b(str, str2, number != null ? number.toString() : null);
    }

    /* renamed from: a */
    public io.fabric.sdk.android.services.network.HttpRequest m58771a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7) throws io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 0;
        r1 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x001d }
        r2 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x001d }
        r2.<init>(r7);	 Catch:{ IOException -> 0x001d }
        r1.<init>(r2);	 Catch:{ IOException -> 0x001d }
        r4 = r3.m58772a(r4, r5, r6, r1);	 Catch:{ IOException -> 0x0018, all -> 0x0015 }
        if (r1 == 0) goto L_0x0014;
    L_0x0011:
        r1.close();	 Catch:{ IOException -> 0x0014 }
    L_0x0014:
        return r4;
    L_0x0015:
        r4 = move-exception;
        r0 = r1;
        goto L_0x0024;
    L_0x0018:
        r4 = move-exception;
        r0 = r1;
        goto L_0x001e;
    L_0x001b:
        r4 = move-exception;
        goto L_0x0024;
    L_0x001d:
        r4 = move-exception;
    L_0x001e:
        r5 = new io.fabric.sdk.android.services.network.HttpRequest$HttpRequestException;	 Catch:{ all -> 0x001b }
        r5.<init>(r4);	 Catch:{ all -> 0x001b }
        throw r5;	 Catch:{ all -> 0x001b }
    L_0x0024:
        if (r0 == 0) goto L_0x0029;
    L_0x0026:
        r0.close();	 Catch:{ IOException -> 0x0029 }
    L_0x0029:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.network.HttpRequest.a(java.lang.String, java.lang.String, java.lang.String, java.io.File):io.fabric.sdk.android.services.network.HttpRequest");
    }

    /* renamed from: a */
    public HttpRequest m58772a(String str, String str2, String str3, InputStream inputStream) throws HttpRequestException {
        try {
            m58800n();
            m58770a(str, str2, str3);
            m58766a(inputStream, this.f48428f);
            return this;
        } catch (String str4) {
            throw new HttpRequestException(str4);
        }
    }

    /* renamed from: f */
    public HttpRequest m58791f(String str, String str2) throws HttpRequestException {
        return m58790f((CharSequence) str).m58790f((CharSequence) ": ").m58790f((CharSequence) str2).m58790f((CharSequence) "\r\n");
    }

    /* renamed from: f */
    public HttpRequest m58790f(CharSequence charSequence) throws HttpRequestException {
        try {
            m58799m();
            this.f48428f.m58748a(charSequence.toString());
            return this;
        } catch (CharSequence charSequence2) {
            throw new HttpRequestException(charSequence2);
        }
    }

    /* renamed from: o */
    public URL m58801o() {
        return m58777a().getURL();
    }

    /* renamed from: p */
    public String m58802p() {
        return m58777a().getRequestMethod();
    }
}
