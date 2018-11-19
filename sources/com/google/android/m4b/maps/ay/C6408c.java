package com.google.android.m4b.maps.ay;

import android.content.Context;
import android.os.IInterface;
import com.google.android.m4b.maps.ay.C4710b.C4709b;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.m4b.maps.ay.c */
public abstract class C6408c<S extends IInterface> extends C4710b<S> {
    /* renamed from: a */
    private final ac f23768a;
    /* renamed from: b */
    private final Runnable f23769b = new C47111(this);

    /* renamed from: com.google.android.m4b.maps.ay.c$1 */
    class C47111 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ C6408c f17330a;

        C47111(C6408c c6408c) {
            this.f17330a = c6408c;
        }

        public final void run() {
            this.f17330a.m20954b();
        }
    }

    public C6408c(Context context, String str, String str2, long j, ScheduledExecutorService scheduledExecutorService, C4712d c4712d) {
        super(context, str, str2, scheduledExecutorService);
        this.f23768a = new ac(scheduledExecutorService, this.f23769b, c4712d, 5000);
    }

    /* renamed from: a */
    public final <T> Future<T> mo4877a(C4709b<T> c4709b) {
        this.f23768a.m20914a();
        return super.mo4877a((C4709b) c4709b);
    }
}
