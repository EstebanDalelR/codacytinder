package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.Log;
import com.google.android.exoplayer2.upstream.HttpDataSource.C2275b;
import com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource.InvalidContentTypeException;
import com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.Predicate;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.upstream.h */
public class C4268h implements HttpDataSource {
    /* renamed from: b */
    private static final Pattern f13820b = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    /* renamed from: c */
    private static final AtomicReference<byte[]> f13821c = new AtomicReference();
    /* renamed from: d */
    private final boolean f13822d;
    /* renamed from: e */
    private final int f13823e;
    /* renamed from: f */
    private final int f13824f;
    /* renamed from: g */
    private final String f13825g;
    /* renamed from: h */
    private final Predicate<String> f13826h;
    /* renamed from: i */
    private final C2275b f13827i;
    /* renamed from: j */
    private final C2275b f13828j = new C2275b();
    /* renamed from: k */
    private final TransferListener<? super C4268h> f13829k;
    /* renamed from: l */
    private DataSpec f13830l;
    /* renamed from: m */
    private HttpURLConnection f13831m;
    /* renamed from: n */
    private InputStream f13832n;
    /* renamed from: o */
    private boolean f13833o;
    /* renamed from: p */
    private long f13834p;
    /* renamed from: q */
    private long f13835q;
    /* renamed from: r */
    private long f13836r;
    /* renamed from: s */
    private long f13837s;

    public C4268h(String str, Predicate<String> predicate, TransferListener<? super C4268h> transferListener, int i, int i2, boolean z, C2275b c2275b) {
        this.f13825g = C2289a.m8310a(str);
        this.f13826h = predicate;
        this.f13829k = transferListener;
        this.f13823e = i;
        this.f13824f = i2;
        this.f13822d = z;
        this.f13827i = c2275b;
    }

    public Uri getUri() {
        return this.f13831m == null ? null : Uri.parse(this.f13831m.getURL().toString());
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f13831m == null ? null : this.f13831m.getHeaderFields();
    }

    public void setRequestProperty(String str, String str2) {
        C2289a.m8309a((Object) str);
        C2289a.m8309a((Object) str2);
        this.f13828j.m8239a(str, str2);
    }

    public void clearRequestProperty(String str) {
        C2289a.m8309a((Object) str);
        this.f13828j.m8238a(str);
    }

    public void clearAllRequestProperties() {
        this.f13828j.m8237a();
    }

    public long open(DataSpec dataSpec) throws HttpDataSourceException {
        StringBuilder stringBuilder;
        this.f13830l = dataSpec;
        long j = 0;
        this.f13837s = 0;
        this.f13836r = 0;
        try {
            this.f13831m = m17077a(dataSpec);
            try {
                int responseCode = this.f13831m.getResponseCode();
                if (responseCode >= Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                    if (responseCode <= 299) {
                        String contentType = this.f13831m.getContentType();
                        if (this.f13826h == null || this.f13826h.evaluate(contentType)) {
                            if (responseCode == Callback.DEFAULT_DRAG_ANIMATION_DURATION && dataSpec.f6825d != 0) {
                                j = dataSpec.f6825d;
                            }
                            this.f13834p = j;
                            if (dataSpec.m8236a(1)) {
                                this.f13835q = dataSpec.f6826e;
                            } else {
                                long j2 = -1;
                                if (dataSpec.f6826e != -1) {
                                    this.f13835q = dataSpec.f6826e;
                                } else {
                                    j = C4268h.m17076a(this.f13831m);
                                    if (j != -1) {
                                        j2 = j - this.f13834p;
                                    }
                                    this.f13835q = j2;
                                }
                            }
                            try {
                                this.f13832n = this.f13831m.getInputStream();
                                this.f13833o = true;
                                if (this.f13829k != null) {
                                    this.f13829k.onTransferStart(this, dataSpec);
                                }
                                return this.f13835q;
                            } catch (IOException e) {
                                m17082c();
                                throw new HttpDataSourceException(e, dataSpec, 1);
                            }
                        }
                        m17082c();
                        throw new InvalidContentTypeException(contentType, dataSpec);
                    }
                }
                Map headerFields = this.f13831m.getHeaderFields();
                m17082c();
                InvalidResponseCodeException invalidResponseCodeException = new InvalidResponseCodeException(responseCode, headerFields, dataSpec);
                if (responseCode == 416) {
                    invalidResponseCodeException.initCause(new DataSourceException(0));
                }
                throw invalidResponseCodeException;
            } catch (IOException e2) {
                m17082c();
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to connect to ");
                stringBuilder.append(dataSpec.f6822a.toString());
                throw new HttpDataSourceException(stringBuilder.toString(), e2, dataSpec, 1);
            }
        } catch (IOException e22) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to connect to ");
            stringBuilder.append(dataSpec.f6822a.toString());
            throw new HttpDataSourceException(stringBuilder.toString(), e22, dataSpec, 1);
        }
    }

    public int read(byte[] bArr, int i, int i2) throws HttpDataSourceException {
        try {
            m17081b();
            return m17075a(bArr, i, i2);
        } catch (IOException e) {
            throw new HttpDataSourceException(e, this.f13830l, 2);
        }
    }

    public void close() throws HttpDataSourceException {
        try {
            if (this.f13832n != null) {
                C4268h.m17080a(this.f13831m, m17083a());
                this.f13832n.close();
            }
            this.f13832n = null;
            m17082c();
            if (this.f13833o) {
                this.f13833o = false;
                if (this.f13829k != null) {
                    this.f13829k.onTransferEnd(this);
                }
            }
        } catch (IOException e) {
            throw new HttpDataSourceException(e, this.f13830l, 3);
        } catch (Throwable th) {
            this.f13832n = null;
            m17082c();
            if (this.f13833o) {
                this.f13833o = false;
                if (this.f13829k != null) {
                    this.f13829k.onTransferEnd(this);
                }
            }
        }
    }

    /* renamed from: a */
    protected final long m17083a() {
        return this.f13835q == -1 ? this.f13835q : this.f13835q - this.f13837s;
    }

    /* renamed from: a */
    private HttpURLConnection m17077a(DataSpec dataSpec) throws IOException {
        DataSpec dataSpec2 = dataSpec;
        URL url = new URL(dataSpec2.f6822a.toString());
        byte[] bArr = dataSpec2.f6823b;
        long j = dataSpec2.f6825d;
        long j2 = dataSpec2.f6826e;
        boolean a = dataSpec2.m8236a(1);
        if (!this.f13822d) {
            C4268h c4268h;
            return m17078a(url, bArr, j, j2, a, true);
        }
        HttpURLConnection a2;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            int i3;
            if (i <= 20) {
                long j3 = j;
                i3 = i2;
                a2 = c4268h.m17078a(url, bArr, j, j2, a, false);
                int responseCode = a2.getResponseCode();
                if (!(responseCode == MapboxConstants.ANIMATION_DURATION || responseCode == 301 || responseCode == 302 || responseCode == 303)) {
                    if (bArr == null) {
                        if (responseCode != 307) {
                            if (responseCode != 308) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        break;
                    }
                }
                bArr = null;
                String headerField = a2.getHeaderField("Location");
                a2.disconnect();
                url = C4268h.m17079a(url, headerField);
                c4268h = this;
                i = i3;
                j = j3;
            } else {
                i3 = i2;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Too many redirects: ");
                stringBuilder.append(i3);
                throw new NoRouteToHostException(stringBuilder.toString());
            }
        }
        return a2;
    }

    /* renamed from: a */
    private HttpURLConnection m17078a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f13823e);
        httpURLConnection.setReadTimeout(this.f13824f);
        if (this.f13827i != null) {
            for (Entry entry : this.f13827i.m8240b().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Entry entry2 : this.f13828j.m8240b().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("bytes=");
            stringBuilder.append(j);
            stringBuilder.append("-");
            String stringBuilder2 = stringBuilder.toString();
            if (j2 != -1) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(stringBuilder2);
                stringBuilder3.append((j + j2) - 1);
                stringBuilder2 = stringBuilder3.toString();
            }
            httpURLConnection.setRequestProperty("Range", stringBuilder2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f13825g);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null ? 1 : null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length == null) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                j = httpURLConnection.getOutputStream();
                j.write(bArr);
                j.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* renamed from: a */
    private static URL m17079a(URL url, String str) throws IOException {
        if (str == null) {
            throw new ProtocolException("Null location redirect");
        }
        URL url2 = new URL(url, str);
        url = url2.getProtocol();
        if ("https".equals(url) != null || "http".equals(url) != null) {
            return url2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported protocol redirect: ");
        stringBuilder.append(url);
        throw new ProtocolException(stringBuilder.toString());
    }

    /* renamed from: a */
    private static long m17076a(java.net.HttpURLConnection r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = "Content-Length";
        r0 = r10.getHeaderField(r0);
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x002c;
    L_0x000c:
        r1 = java.lang.Long.parseLong(r0);	 Catch:{ NumberFormatException -> 0x0011 }
        goto L_0x002e;
    L_0x0011:
        r1 = "DefaultHttpDataSource";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Unexpected Content-Length [";
        r2.append(r3);
        r2.append(r0);
        r3 = "]";
        r2.append(r3);
        r2 = r2.toString();
        android.util.Log.e(r1, r2);
    L_0x002c:
        r1 = -1;
    L_0x002e:
        r3 = "Content-Range";
        r10 = r10.getHeaderField(r3);
        r3 = android.text.TextUtils.isEmpty(r10);
        if (r3 != 0) goto L_0x00af;
    L_0x003a:
        r3 = f13820b;
        r3 = r3.matcher(r10);
        r4 = r3.find();
        if (r4 == 0) goto L_0x00af;
    L_0x0046:
        r4 = 2;
        r4 = r3.group(r4);	 Catch:{ NumberFormatException -> 0x0094 }
        r4 = java.lang.Long.parseLong(r4);	 Catch:{ NumberFormatException -> 0x0094 }
        r6 = 1;	 Catch:{ NumberFormatException -> 0x0094 }
        r3 = r3.group(r6);	 Catch:{ NumberFormatException -> 0x0094 }
        r6 = java.lang.Long.parseLong(r3);	 Catch:{ NumberFormatException -> 0x0094 }
        r3 = 0;	 Catch:{ NumberFormatException -> 0x0094 }
        r8 = r4 - r6;	 Catch:{ NumberFormatException -> 0x0094 }
        r3 = 1;	 Catch:{ NumberFormatException -> 0x0094 }
        r5 = r8 + r3;	 Catch:{ NumberFormatException -> 0x0094 }
        r3 = 0;	 Catch:{ NumberFormatException -> 0x0094 }
        r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x0094 }
        if (r7 >= 0) goto L_0x0067;	 Catch:{ NumberFormatException -> 0x0094 }
    L_0x0065:
        r1 = r5;	 Catch:{ NumberFormatException -> 0x0094 }
        goto L_0x00af;	 Catch:{ NumberFormatException -> 0x0094 }
    L_0x0067:
        r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x0094 }
        if (r3 == 0) goto L_0x00af;	 Catch:{ NumberFormatException -> 0x0094 }
    L_0x006b:
        r3 = "DefaultHttpDataSource";	 Catch:{ NumberFormatException -> 0x0094 }
        r4 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0094 }
        r4.<init>();	 Catch:{ NumberFormatException -> 0x0094 }
        r7 = "Inconsistent headers [";	 Catch:{ NumberFormatException -> 0x0094 }
        r4.append(r7);	 Catch:{ NumberFormatException -> 0x0094 }
        r4.append(r0);	 Catch:{ NumberFormatException -> 0x0094 }
        r0 = "] [";	 Catch:{ NumberFormatException -> 0x0094 }
        r4.append(r0);	 Catch:{ NumberFormatException -> 0x0094 }
        r4.append(r10);	 Catch:{ NumberFormatException -> 0x0094 }
        r0 = "]";	 Catch:{ NumberFormatException -> 0x0094 }
        r4.append(r0);	 Catch:{ NumberFormatException -> 0x0094 }
        r0 = r4.toString();	 Catch:{ NumberFormatException -> 0x0094 }
        android.util.Log.w(r3, r0);	 Catch:{ NumberFormatException -> 0x0094 }
        r3 = java.lang.Math.max(r1, r5);	 Catch:{ NumberFormatException -> 0x0094 }
        r1 = r3;
        goto L_0x00af;
    L_0x0094:
        r0 = "DefaultHttpDataSource";
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Unexpected Content-Range [";
        r3.append(r4);
        r3.append(r10);
        r10 = "]";
        r3.append(r10);
        r10 = r3.toString();
        android.util.Log.e(r0, r10);
    L_0x00af:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.h.a(java.net.HttpURLConnection):long");
    }

    /* renamed from: b */
    private void m17081b() throws IOException {
        if (this.f13836r != this.f13834p) {
            Object obj = (byte[]) f13821c.getAndSet(null);
            if (obj == null) {
                obj = new byte[4096];
            }
            while (this.f13836r != this.f13834p) {
                int read = this.f13832n.read(obj, 0, (int) Math.min(this.f13834p - this.f13836r, (long) obj.length));
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                } else if (read == -1) {
                    throw new EOFException();
                } else {
                    this.f13836r += (long) read;
                    if (this.f13829k != null) {
                        this.f13829k.onBytesTransferred(this, read);
                    }
                }
            }
            f13821c.set(obj);
        }
    }

    /* renamed from: a */
    private int m17075a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return null;
        }
        if (this.f13835q != -1) {
            long j = this.f13835q - this.f13837s;
            if (j == 0) {
                return -1;
            }
            i2 = (int) Math.min((long) i2, j);
        }
        bArr = this.f13832n.read(bArr, i, i2);
        if (bArr != -1) {
            this.f13837s += (long) bArr;
            if (this.f13829k != 0) {
                this.f13829k.onBytesTransferred(this, bArr);
            }
            return bArr;
        } else if (this.f13835q == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    private static void m17080a(java.net.HttpURLConnection r3, long r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = com.google.android.exoplayer2.util.C2314v.f6956a;
        r1 = 19;
        if (r0 == r1) goto L_0x000d;
    L_0x0006:
        r0 = com.google.android.exoplayer2.util.C2314v.f6956a;
        r1 = 20;
        if (r0 == r1) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r3 = r3.getInputStream();	 Catch:{ Exception -> 0x0058 }
        r0 = -1;	 Catch:{ Exception -> 0x0058 }
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));	 Catch:{ Exception -> 0x0058 }
        if (r2 != 0) goto L_0x001f;	 Catch:{ Exception -> 0x0058 }
    L_0x0017:
        r4 = r3.read();	 Catch:{ Exception -> 0x0058 }
        r5 = -1;	 Catch:{ Exception -> 0x0058 }
        if (r4 != r5) goto L_0x0026;	 Catch:{ Exception -> 0x0058 }
    L_0x001e:
        return;	 Catch:{ Exception -> 0x0058 }
    L_0x001f:
        r0 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;	 Catch:{ Exception -> 0x0058 }
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));	 Catch:{ Exception -> 0x0058 }
        if (r2 > 0) goto L_0x0026;	 Catch:{ Exception -> 0x0058 }
    L_0x0025:
        return;	 Catch:{ Exception -> 0x0058 }
    L_0x0026:
        r4 = r3.getClass();	 Catch:{ Exception -> 0x0058 }
        r4 = r4.getName();	 Catch:{ Exception -> 0x0058 }
        r5 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream";	 Catch:{ Exception -> 0x0058 }
        r5 = r5.equals(r4);	 Catch:{ Exception -> 0x0058 }
        if (r5 != 0) goto L_0x003e;	 Catch:{ Exception -> 0x0058 }
    L_0x0036:
        r5 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream";	 Catch:{ Exception -> 0x0058 }
        r4 = r5.equals(r4);	 Catch:{ Exception -> 0x0058 }
        if (r4 == 0) goto L_0x0058;	 Catch:{ Exception -> 0x0058 }
    L_0x003e:
        r4 = r3.getClass();	 Catch:{ Exception -> 0x0058 }
        r4 = r4.getSuperclass();	 Catch:{ Exception -> 0x0058 }
        r5 = "unexpectedEndOfInput";	 Catch:{ Exception -> 0x0058 }
        r0 = 0;	 Catch:{ Exception -> 0x0058 }
        r1 = new java.lang.Class[r0];	 Catch:{ Exception -> 0x0058 }
        r4 = r4.getDeclaredMethod(r5, r1);	 Catch:{ Exception -> 0x0058 }
        r5 = 1;	 Catch:{ Exception -> 0x0058 }
        r4.setAccessible(r5);	 Catch:{ Exception -> 0x0058 }
        r5 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x0058 }
        r4.invoke(r3, r5);	 Catch:{ Exception -> 0x0058 }
    L_0x0058:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.h.a(java.net.HttpURLConnection, long):void");
    }

    /* renamed from: c */
    private void m17082c() {
        if (this.f13831m != null) {
            try {
                this.f13831m.disconnect();
            } catch (Throwable e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f13831m = null;
        }
    }
}
