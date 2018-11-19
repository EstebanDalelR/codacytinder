package com.bumptech.glide.integration.okhttp3;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.C1036d;
import com.bumptech.glide.p026d.C0980b;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map.Entry;
import okhttp3.C15963q.C15962a;
import okhttp3.C15968t;
import okhttp3.Call;
import okhttp3.Call.Factory;

public class OkHttpStreamFetcher implements DataFetcher<InputStream> {
    /* renamed from: a */
    private final Factory f9410a;
    /* renamed from: b */
    private final C1036d f9411b;
    /* renamed from: c */
    private InputStream f9412c;
    /* renamed from: d */
    private C15968t f9413d;
    /* renamed from: e */
    private volatile Call f9414e;

    public /* synthetic */ Object loadData(Priority priority) throws Exception {
        return m11920a(priority);
    }

    public OkHttpStreamFetcher(Factory factory, C1036d c1036d) {
        this.f9410a = factory;
        this.f9411b = c1036d;
    }

    /* renamed from: a */
    public InputStream m11920a(Priority priority) throws Exception {
        priority = new C15962a().a(this.f9411b.m3579b());
        for (Entry entry : this.f9411b.m3580c().entrySet()) {
            priority.b((String) entry.getKey(), (String) entry.getValue());
        }
        this.f9414e = this.f9410a.newCall(priority.d());
        priority = this.f9414e.execute();
        this.f9413d = priority.h();
        if (priority.d()) {
            this.f9412c = C0980b.m3387a(this.f9413d.byteStream(), this.f9413d.contentLength());
            return this.f9412c;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request failed with code: ");
        stringBuilder.append(priority.c());
        throw new IOException(stringBuilder.toString());
    }

    public void cleanup() {
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
        r1 = this;
        r0 = r1.f9412c;	 Catch:{ IOException -> 0x0009 }
        if (r0 == 0) goto L_0x0009;	 Catch:{ IOException -> 0x0009 }
    L_0x0004:
        r0 = r1.f9412c;	 Catch:{ IOException -> 0x0009 }
        r0.close();	 Catch:{ IOException -> 0x0009 }
    L_0x0009:
        r0 = r1.f9413d;
        if (r0 == 0) goto L_0x0012;
    L_0x000d:
        r0 = r1.f9413d;
        r0.close();
    L_0x0012:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.integration.okhttp3.OkHttpStreamFetcher.cleanup():void");
    }

    public String getId() {
        return this.f9411b.m3581d();
    }

    public void cancel() {
        Call call = this.f9414e;
        if (call != null) {
            call.cancel();
        }
    }
}
