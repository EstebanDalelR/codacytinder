package com.leanplum.p069a;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.HashSet;
import org.apache.http.client.methods.HttpPost;

/* renamed from: com.leanplum.a.bm */
final class bm extends Thread {
    /* renamed from: a */
    private /* synthetic */ C5727q f21212a;

    bm(C5727q c5727q) {
        this.f21212a = c5727q;
    }

    public final void run() {
        try {
            String[] split = C5727q.m25143b(new HttpPost(this.f21212a.f21276U)).split(":");
            this.f21212a.f21278W = split[0];
            String str = split[1];
            if (!"".equals(str)) {
                this.f21212a.f21279X = (Integer.parseInt(str) / 2) * AdError.NETWORK_ERROR_CODE;
            }
            if (new HashSet(Arrays.asList(split[3].split(","))).contains("websocket")) {
                Looper.prepare();
                this.f21212a.aa = Looper.myLooper();
                this.f21212a.f21281Z = new Handler();
                C5727q.m25152g(this.f21212a);
                Looper.loop();
                return;
            }
            throw new Exception("websocket not supported");
        } catch (Exception e) {
            this.f21212a.f21277V.mo6201a(e);
        }
    }
}
