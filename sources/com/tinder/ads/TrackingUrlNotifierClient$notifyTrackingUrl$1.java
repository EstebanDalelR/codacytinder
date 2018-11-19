package com.tinder.ads;

import com.tinder.domain.common.TrackingUrl;
import kotlin.Metadata;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
final class TrackingUrlNotifierClient$notifyTrackingUrl$1 implements Action0 {
    final /* synthetic */ TrackingUrl $trackingUrl;
    final /* synthetic */ TrackingUrlNotifierClient this$0;

    TrackingUrlNotifierClient$notifyTrackingUrl$1(TrackingUrlNotifierClient trackingUrlNotifierClient, TrackingUrl trackingUrl) {
        this.this$0 = trackingUrlNotifierClient;
        this.$trackingUrl = trackingUrl;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void call() {
        /*
        r6 = this;
        r0 = new okhttp3.q$a;
        r0.<init>();
        r1 = r6.$trackingUrl;
        r1 = r1.getUrl();
        r0 = r0.a(r1);
        r0 = r0.a();
        r0 = r0.d();
        r1 = r6.this$0;
        r1 = r1.okHttpClient;
        r0 = r1.newCall(r0);
        r0 = r0.execute();
        r0 = (java.io.Closeable) r0;
        r1 = 0;
        r1 = (java.lang.Throwable) r1;
        r2 = r0;
        r2 = (okhttp3.C15966s) r2;	 Catch:{ Throwable -> 0x007c }
        r3 = "response";
        kotlin.jvm.internal.C2668g.a(r2, r3);	 Catch:{ Throwable -> 0x007c }
        r3 = r2.d();	 Catch:{ Throwable -> 0x007c }
        if (r3 != 0) goto L_0x005b;
    L_0x0038:
        r3 = new java.io.IOException;	 Catch:{ Throwable -> 0x007c }
        r4 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x007c }
        r4.<init>();	 Catch:{ Throwable -> 0x007c }
        r5 = "Error pinging url=";
        r4.append(r5);	 Catch:{ Throwable -> 0x007c }
        r5 = r6.$trackingUrl;	 Catch:{ Throwable -> 0x007c }
        r4.append(r5);	 Catch:{ Throwable -> 0x007c }
        r5 = ". Response=";
        r4.append(r5);	 Catch:{ Throwable -> 0x007c }
        r4.append(r2);	 Catch:{ Throwable -> 0x007c }
        r2 = r4.toString();	 Catch:{ Throwable -> 0x007c }
        r3.<init>(r2);	 Catch:{ Throwable -> 0x007c }
        r3 = (java.lang.Throwable) r3;	 Catch:{ Throwable -> 0x007c }
        throw r3;	 Catch:{ Throwable -> 0x007c }
    L_0x005b:
        r2 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x007c }
        r2.<init>();	 Catch:{ Throwable -> 0x007c }
        r3 = "Pinged Tracking URL: ";
        r2.append(r3);	 Catch:{ Throwable -> 0x007c }
        r3 = r6.$trackingUrl;	 Catch:{ Throwable -> 0x007c }
        r2.append(r3);	 Catch:{ Throwable -> 0x007c }
        r2 = r2.toString();	 Catch:{ Throwable -> 0x007c }
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ Throwable -> 0x007c }
        p000a.p001a.C0001a.b(r2, r3);	 Catch:{ Throwable -> 0x007c }
        r2 = kotlin.C15813i.f49016a;	 Catch:{ Throwable -> 0x007c }
        kotlin.io.C15818b.a(r0, r1);
        return;
    L_0x007a:
        r2 = move-exception;
        goto L_0x007e;
    L_0x007c:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x007a }
    L_0x007e:
        kotlin.io.C15818b.a(r0, r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.ads.TrackingUrlNotifierClient$notifyTrackingUrl$1.call():void");
    }
}
