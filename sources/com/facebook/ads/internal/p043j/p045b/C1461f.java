package com.facebook.ads.internal.p043j.p045b;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.ads.internal.p043j.p045b.p046a.C1445a;
import com.facebook.ads.internal.p043j.p045b.p046a.C1446c;
import com.facebook.ads.internal.p043j.p045b.p046a.C3306f;
import com.facebook.ads.internal.p043j.p045b.p046a.C4151g;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.File;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.internal.j.b.f */
public class C1461f {
    /* renamed from: a */
    private final Object f4008a;
    /* renamed from: b */
    private final ExecutorService f4009b;
    /* renamed from: c */
    private final Map<String, C1462g> f4010c;
    /* renamed from: d */
    private final ServerSocket f4011d;
    /* renamed from: e */
    private final int f4012e;
    /* renamed from: f */
    private final Thread f4013f;
    /* renamed from: g */
    private final C1453c f4014g;
    /* renamed from: h */
    private boolean f4015h;

    /* renamed from: com.facebook.ads.internal.j.b.f$a */
    public static final class C1456a {
        /* renamed from: a */
        private File f3998a;
        /* renamed from: b */
        private C1446c f3999b = new C3306f();
        /* renamed from: c */
        private C1445a f4000c = new C4151g(67108864);

        public C1456a(Context context) {
            this.f3998a = C1470o.m5147a(context);
        }

        /* renamed from: a */
        private C1453c m5087a() {
            return new C1453c(this.f3998a, this.f3999b, this.f4000c);
        }
    }

    /* renamed from: com.facebook.ads.internal.j.b.f$b */
    private class C1457b implements Callable<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C1461f f4001a;

        private C1457b(C1461f c1461f) {
            this.f4001a = c1461f;
        }

        /* renamed from: a */
        public Boolean m5089a() {
            return Boolean.valueOf(this.f4001a.m5100c());
        }

        public /* synthetic */ Object call() {
            return m5089a();
        }
    }

    /* renamed from: com.facebook.ads.internal.j.b.f$c */
    private class C1458c implements Callable<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C1461f f4002a;
        /* renamed from: b */
        private final String f4003b;

        public C1458c(C1461f c1461f, String str) {
            this.f4002a = c1461f;
            this.f4003b = str;
        }

        /* renamed from: a */
        public Boolean m5090a() {
            return Boolean.valueOf(this.f4002a.m5101c(this.f4003b));
        }

        public /* synthetic */ Object call() {
            return m5090a();
        }
    }

    /* renamed from: com.facebook.ads.internal.j.b.f$d */
    private final class C1459d implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1461f f4004a;
        /* renamed from: b */
        private final Socket f4005b;

        public C1459d(C1461f c1461f, Socket socket) {
            this.f4004a = c1461f;
            this.f4005b = socket;
        }

        public void run() {
            this.f4004a.m5094a(this.f4005b);
        }
    }

    /* renamed from: com.facebook.ads.internal.j.b.f$e */
    private final class C1460e implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1461f f4006a;
        /* renamed from: b */
        private final CountDownLatch f4007b;

        public C1460e(C1461f c1461f, CountDownLatch countDownLatch) {
            this.f4006a = c1461f;
            this.f4007b = countDownLatch;
        }

        public void run() {
            this.f4007b.countDown();
            this.f4006a.m5106e();
        }
    }

    public C1461f(Context context) {
        this(new C1456a(context).m5087a());
    }

    private C1461f(C1453c c1453c) {
        this.f4008a = new Object();
        this.f4009b = Executors.newFixedThreadPool(8);
        this.f4010c = new ConcurrentHashMap();
        this.f4014g = (C1453c) C1463j.m5119a(c1453c);
        try {
            this.f4011d = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.f4012e = this.f4011d.getLocalPort();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f4013f = new Thread(new C1460e(this, countDownLatch));
            this.f4013f.start();
            countDownLatch.await();
            Log.i("ProxyCache", "Proxy cache server started. Ping it...");
            m5096b();
        } catch (Throwable e) {
            this.f4009b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e);
        }
    }

    /* renamed from: a */
    private void m5093a(Throwable th) {
        Log.e("ProxyCache", "HttpProxyCacheServer error", th);
    }

    /* renamed from: a */
    private void m5094a(java.net.Socket r5) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = r5.getInputStream();	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r0 = com.facebook.ads.internal.p043j.p045b.C1454d.m5085a(r0);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r1 = "ProxyCache";	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r2 = new java.lang.StringBuilder;	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r2.<init>();	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r3 = "Request to cache proxy:";	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r2.append(r3);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r2.append(r0);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r2 = r2.toString();	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        android.util.Log.i(r1, r2);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r1 = r0.f3995a;	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r1 = com.facebook.ads.internal.p043j.p045b.C1468m.m5141c(r1);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r2 = "ping";	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r2 = r2.equals(r1);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        if (r2 == 0) goto L_0x0030;	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
    L_0x002c:
        r4.m5097b(r5);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        goto L_0x0037;	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
    L_0x0030:
        r1 = r4.m5105e(r1);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r1.m5117a(r0, r5);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
    L_0x0037:
        r4.m5099c(r5);
        r5 = "ProxyCache";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        goto L_0x006b;
    L_0x0042:
        r0 = move-exception;
        goto L_0x007f;
    L_0x0044:
        r0 = move-exception;
        r1 = new com.facebook.ads.internal.j.b.l;	 Catch:{ all -> 0x0042 }
        r2 = "Error processing request";	 Catch:{ all -> 0x0042 }
        r1.<init>(r2, r0);	 Catch:{ all -> 0x0042 }
        r4.m5093a(r1);	 Catch:{ all -> 0x0042 }
        r4.m5099c(r5);
        r5 = "ProxyCache";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        goto L_0x006b;
    L_0x005a:
        r0 = "ProxyCache";	 Catch:{ all -> 0x0042 }
        r1 = "Closing socket... Socket is closed by client.";	 Catch:{ all -> 0x0042 }
        android.util.Log.d(r0, r1);	 Catch:{ all -> 0x0042 }
        r4.m5099c(r5);
        r5 = "ProxyCache";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
    L_0x006b:
        r1 = "Opened connections: ";
        r0.append(r1);
        r1 = r4.m5108f();
        r0.append(r1);
        r0 = r0.toString();
        android.util.Log.d(r5, r0);
        return;
    L_0x007f:
        r4.m5099c(r5);
        r5 = "ProxyCache";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Opened connections: ";
        r1.append(r2);
        r2 = r4.m5108f();
        r1.append(r2);
        r1 = r1.toString();
        android.util.Log.d(r5, r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.j.b.f.a(java.net.Socket):void");
    }

    /* renamed from: b */
    private void m5096b() {
        int i = MapboxConstants.ANIMATION_DURATION;
        int i2 = 0;
        while (i2 < 3) {
            try {
                Future submit = this.f4009b.submit(new C1457b());
                long j = (long) i;
                this.f4015h = ((Boolean) submit.get(j, TimeUnit.MILLISECONDS)).booleanValue();
                if (!this.f4015h) {
                    SystemClock.sleep(j);
                    i2++;
                    i *= 2;
                } else {
                    return;
                }
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error pinging server [attempt: ");
                stringBuilder.append(i2);
                stringBuilder.append(", timeout: ");
                stringBuilder.append(i);
                stringBuilder.append("]. ");
                Log.e("ProxyCache", stringBuilder.toString(), e);
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Shutdown server... Error pinging server [attempts: ");
        stringBuilder2.append(i2);
        stringBuilder2.append(", max timeout: ");
        stringBuilder2.append(i / 2);
        stringBuilder2.append("].");
        Log.e("ProxyCache", stringBuilder2.toString());
        m5110a();
    }

    /* renamed from: b */
    private void m5097b(Socket socket) {
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write("ping ok".getBytes());
    }

    /* renamed from: c */
    private void m5099c(Socket socket) {
        m5104d(socket);
        m5107e(socket);
        m5109f(socket);
    }

    /* renamed from: c */
    private boolean m5100c() {
        boolean equals;
        C3309h c3309h = new C3309h(m5102d("ping"));
        try {
            byte[] bytes = "ping ok".getBytes();
            c3309h.mo1779a(0);
            byte[] bArr = new byte[bytes.length];
            c3309h.mo1778a(bArr);
            equals = Arrays.equals(bytes, bArr);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ping response: `");
            stringBuilder.append(new String(bArr));
            stringBuilder.append("`, pinged? ");
            stringBuilder.append(equals);
            Log.d("ProxyCache", stringBuilder.toString());
            return equals;
        } catch (C1467l e) {
            equals = e;
            Log.e("ProxyCache", "Error reading ping response", equals);
            return false;
        } finally {
            c3309h.mo1780b();
        }
    }

    /* renamed from: c */
    private boolean m5101c(String str) {
        C3309h c3309h = new C3309h(m5102d(str));
        try {
            c3309h.mo1779a(0);
            while (c3309h.mo1778a(new byte[8192]) != -1) {
            }
            return true;
        } catch (Throwable e) {
            Log.e("ProxyCache", "Error reading url", e);
            return false;
        } finally {
            c3309h.mo1780b();
        }
    }

    /* renamed from: d */
    private String m5102d(String str) {
        return String.format("http://%s:%d/%s", new Object[]{"127.0.0.1", Integer.valueOf(this.f4012e), C1468m.m5140b(str)});
    }

    /* renamed from: d */
    private void m5103d() {
        synchronized (this.f4008a) {
            for (C1462g a : this.f4010c.values()) {
                a.m5116a();
            }
            this.f4010c.clear();
        }
    }

    /* renamed from: d */
    private void m5104d(java.net.Socket r3) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r3.isInputShutdown();	 Catch:{ SocketException -> 0x0016, IOException -> 0x000a }
        if (r0 != 0) goto L_0x001d;	 Catch:{ SocketException -> 0x0016, IOException -> 0x000a }
    L_0x0006:
        r3.shutdownInput();	 Catch:{ SocketException -> 0x0016, IOException -> 0x000a }
        return;
    L_0x000a:
        r3 = move-exception;
        r0 = new com.facebook.ads.internal.j.b.l;
        r1 = "Error closing socket input stream";
        r0.<init>(r1, r3);
        r2.m5093a(r0);
        return;
    L_0x0016:
        r3 = "ProxyCache";
        r0 = "Releasing input stream... Socket is closed by client.";
        android.util.Log.d(r3, r0);
    L_0x001d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.j.b.f.d(java.net.Socket):void");
    }

    /* renamed from: e */
    private C1462g m5105e(String str) {
        C1462g c1462g;
        synchronized (this.f4008a) {
            c1462g = (C1462g) this.f4010c.get(str);
            if (c1462g == null) {
                c1462g = new C1462g(str, this.f4014g);
                this.f4010c.put(str, c1462g);
            }
        }
        return c1462g;
    }

    /* renamed from: e */
    private void m5106e() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket accept = this.f4011d.accept();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Accept new socket ");
                stringBuilder.append(accept);
                Log.d("ProxyCache", stringBuilder.toString());
                this.f4009b.submit(new C1459d(this, accept));
            } catch (Throwable e) {
                m5093a(new C1467l("Error during waiting connection", e));
                return;
            }
        }
    }

    /* renamed from: e */
    private void m5107e(Socket socket) {
        try {
            if (socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
        } catch (Throwable e) {
            m5093a(new C1467l("Error closing socket output stream", e));
        }
    }

    /* renamed from: f */
    private int m5108f() {
        int i;
        synchronized (this.f4008a) {
            i = 0;
            for (C1462g b : this.f4010c.values()) {
                i += b.m5118b();
            }
        }
        return i;
    }

    /* renamed from: f */
    private void m5109f(Socket socket) {
        try {
            if (!socket.isClosed()) {
                socket.close();
            }
        } catch (Throwable e) {
            m5093a(new C1467l("Error closing socket", e));
        }
    }

    /* renamed from: a */
    public void m5110a() {
        Log.i("ProxyCache", "Shutdown proxy server");
        m5103d();
        this.f4013f.interrupt();
        try {
            if (!this.f4011d.isClosed()) {
                this.f4011d.close();
            }
        } catch (Throwable e) {
            m5093a(new C1467l("Error shutting down proxy server", e));
        }
    }

    /* renamed from: a */
    public void m5111a(String str) {
        int i = MapboxConstants.ANIMATION_DURATION;
        int i2 = 0;
        while (i2 < 3) {
            try {
                if (!((Boolean) this.f4009b.submit(new C1458c(this, str)).get()).booleanValue()) {
                    SystemClock.sleep((long) i);
                    i2++;
                    i *= 2;
                } else {
                    return;
                }
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error precaching url [attempt: ");
                stringBuilder.append(i2);
                stringBuilder.append(", url: ");
                stringBuilder.append(str);
                stringBuilder.append("]. ");
                Log.e("ProxyCache", stringBuilder.toString(), e);
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Shutdown server... Error precaching url [attempts: ");
        stringBuilder2.append(i2);
        stringBuilder2.append(", url: ");
        stringBuilder2.append(str);
        stringBuilder2.append("].");
        Log.e("ProxyCache", stringBuilder2.toString());
        m5110a();
    }

    /* renamed from: b */
    public String m5112b(String str) {
        if (!this.f4015h) {
            Log.e("ProxyCache", "Proxy server isn't pinged. Caching doesn't work.");
        }
        return this.f4015h ? m5102d(str) : str;
    }
}
