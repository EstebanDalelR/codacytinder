package com.google.android.m4b.maps.ay;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.m4b.maps.ay.C4710b.C4709b;
import com.google.android.m4b.maps.p119s.C5519b;
import com.google.android.m4b.maps.p119s.C5519b.C6769a;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.Map;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.m4b.maps.ay.w */
public class C6418w extends C4710b<C5519b> {
    /* renamed from: a */
    private static final String f23816a = "w";
    /* renamed from: b */
    private final aa f23817b;

    /* renamed from: com.google.android.m4b.maps.ay.w$a */
    public interface C4730a {
        /* renamed from: a */
        void mo5300a(boolean z);
    }

    /* renamed from: com.google.android.m4b.maps.ay.w$2 */
    class C64172 extends C4709b<Map> {
        /* renamed from: a */
        private /* synthetic */ C6418w f23815a;

        C64172(C6418w c6418w) {
            this.f23815a = c6418w;
            super(c6418w);
        }

        /* renamed from: a */
        private java.util.Map m28034a(com.google.android.m4b.maps.p119s.C5519b r2) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r2 = r2.mo5677b();	 Catch:{ RemoteException -> 0x000c }
            r0 = r1.f23815a;
            r0.m20954b();
            return r2;
        L_0x000a:
            r2 = move-exception;
            goto L_0x0027;
        L_0x000c:
            r2 = com.google.android.m4b.maps.ay.C6418w.f23816a;	 Catch:{ all -> 0x000a }
            r0 = 6;	 Catch:{ all -> 0x000a }
            r2 = com.google.android.m4b.maps.ay.C4728u.m21050a(r2, r0);	 Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x0020;	 Catch:{ all -> 0x000a }
        L_0x0017:
            r2 = com.google.android.m4b.maps.ay.C6418w.f23816a;	 Catch:{ all -> 0x000a }
            r0 = "An error occurred when fetching the Maps API URL rewriter.";	 Catch:{ all -> 0x000a }
            android.util.Log.e(r2, r0);	 Catch:{ all -> 0x000a }
        L_0x0020:
            r2 = r1.f23815a;
            r2.m20954b();
            r2 = 0;
            return r2;
        L_0x0027:
            r0 = r1.f23815a;
            r0.m20954b();
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ay.w.2.a(com.google.android.m4b.maps.s.b):java.util.Map");
        }
    }

    public C6418w(Context context, String str) {
        this(context, str, ab.m27950c());
    }

    private C6418w(Context context, String str, aa aaVar) {
        super(context, str, "com.google.android.gms.maps.service.SidewinderService", Executors.newSingleThreadExecutor());
        this.f23817b = aaVar;
    }

    /* renamed from: a */
    public final void m28039a(final C4730a c4730a) {
        C5571j.m24293a((Object) c4730a, (Object) "callback");
        mo4877a(new C4709b<Void>(this) {
            /* renamed from: b */
            private /* synthetic */ C6418w f23814b;

            /* renamed from: a */
            private java.lang.Void m28032a(com.google.android.m4b.maps.p119s.C5519b r2) {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                /*
                r1 = this;
                r2 = r2.mo5676a();	 Catch:{ RemoteException -> 0x000c }
            L_0x0004:
                r0 = r1.f23814b;
                r0.m20954b();
                goto L_0x0022;
            L_0x000a:
                r2 = move-exception;
                goto L_0x0029;
            L_0x000c:
                r2 = com.google.android.m4b.maps.ay.C6418w.f23816a;	 Catch:{ all -> 0x000a }
                r0 = 6;	 Catch:{ all -> 0x000a }
                r2 = com.google.android.m4b.maps.ay.C4728u.m21050a(r2, r0);	 Catch:{ all -> 0x000a }
                if (r2 == 0) goto L_0x0020;	 Catch:{ all -> 0x000a }
            L_0x0017:
                r2 = com.google.android.m4b.maps.ay.C6418w.f23816a;	 Catch:{ all -> 0x000a }
                r0 = "An error occurred when checking if the Maps API should be blocked.";	 Catch:{ all -> 0x000a }
                android.util.Log.e(r2, r0);	 Catch:{ all -> 0x000a }
            L_0x0020:
                r2 = 1;
                goto L_0x0004;
            L_0x0022:
                r0 = r2;
                r0.mo5300a(r2);
                r2 = 0;
                return r2;
            L_0x0029:
                r0 = r1.f23814b;
                r0.m20954b();
                throw r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.ay.w.1.a(com.google.android.m4b.maps.s.b):java.lang.Void");
            }
        });
    }

    /* renamed from: a */
    public final Map<String, String> mo4896a() {
        this.f23817b.mo4876b();
        try {
            return (Map) mo4877a(new C64172(this)).get();
        } catch (Throwable e) {
            if (C4728u.m21050a(f23816a, 6)) {
                Log.e(f23816a, "Interrupted when fetching the Maps API URL rewriter: ", e);
            }
            return null;
        } catch (Throwable e2) {
            if (C4728u.m21050a(f23816a, 6)) {
                Log.e(f23816a, "Execution error when fetching the Maps API URL rewriter: ", e2);
            }
            return null;
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ IInterface mo4863a(IBinder iBinder) {
        return C6769a.m30137a(iBinder);
    }
}
