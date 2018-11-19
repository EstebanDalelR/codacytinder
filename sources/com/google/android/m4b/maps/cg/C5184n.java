package com.google.android.m4b.maps.cg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.google.android.m4b.maps.aa.bo;
import com.google.android.m4b.maps.ay.C4714e;
import com.google.android.m4b.maps.ay.C4716j;
import com.google.android.m4b.maps.ay.C4718l;
import com.google.android.m4b.maps.ay.C4725p;
import com.google.android.m4b.maps.ay.C6407a;
import com.google.android.m4b.maps.ay.C6413m;
import com.google.android.m4b.maps.ay.af;
import com.google.android.m4b.maps.ay.ag;
import com.google.android.m4b.maps.p101a.C4526l;
import com.google.android.m4b.maps.p102b.C6423f.C4740a;
import com.google.android.m4b.maps.p107g.C5371d;
import com.google.android.m4b.maps.p113m.C5475a;
import com.google.android.m4b.maps.p125y.C5571j;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.m4b.maps.cg.n */
public class C5184n extends BroadcastReceiver {
    /* renamed from: a */
    private static final String f19274a = "n";
    /* renamed from: b */
    private final Context f19275b;
    /* renamed from: c */
    private final ce f19276c;
    /* renamed from: d */
    private final Set<C5183b> f19277d;
    /* renamed from: e */
    private C4526l f19278e;
    /* renamed from: f */
    private boolean f19279f;
    /* renamed from: g */
    private C6413m f19280g;
    /* renamed from: h */
    private final String f19281h;
    /* renamed from: i */
    private C4714e f19282i;
    /* renamed from: j */
    private C4740a f19283j;
    /* renamed from: k */
    private final String f19284k;
    /* renamed from: l */
    private final ag f19285l;

    /* renamed from: com.google.android.m4b.maps.cg.n$b */
    public interface C5183b {
        /* renamed from: a */
        void mo5207a();
    }

    /* renamed from: com.google.android.m4b.maps.cg.n$a */
    static class C7514a extends C6407a {
        /* renamed from: a */
        private final Handler f28044a;
        /* renamed from: b */
        private final Handler f28045b;

        /* renamed from: a */
        public final void mo4872a(int i, String str) {
        }

        private C7514a() {
            this.f28044a = new Handler(this, Looper.getMainLooper()) {
                /* renamed from: a */
                private /* synthetic */ C7514a f19272a;

                public final void handleMessage(Message message) {
                    ((C4718l) message.obj).mo4881d();
                }
            };
            this.f28045b = new Handler(this, Looper.getMainLooper()) {
                /* renamed from: a */
                private /* synthetic */ C7514a f19273a;

                public final void handleMessage(Message message) {
                    ((C4718l) message.obj).mo4882e();
                }
            };
        }

        /* renamed from: a */
        public final void mo4873a(C4718l c4718l) {
            Message.obtain(this.f28044a, 0, c4718l).sendToTarget();
        }

        /* renamed from: b */
        public final void mo4874b(C4718l c4718l) {
            Message.obtain(this.f28045b, 0, c4718l).sendToTarget();
        }
    }

    public C5184n(Context context, ce ceVar, String str, C4714e c4714e, C4740a c4740a) {
        this(context, ceVar, str, c4714e, c4740a, ag.m20942a());
    }

    private C5184n(Context context, ce ceVar, String str, C4714e c4714e, C4740a c4740a, ag agVar) {
        this.f19277d = new HashSet();
        this.f19275b = context;
        this.f19276c = ceVar;
        this.f19281h = str;
        this.f19282i = c4714e;
        this.f19283j = c4740a;
        c4714e = VERSION.SDK;
        c4740a = C4725p.m21022a().toString();
        String j = C4725p.m21033j();
        String b = af.m20940b(context);
        StringBuilder stringBuilder = new StringBuilder(String.format("Mozilla/5.0 (%s; U; %s; %s; ) AppleWebKit/0.0 (KHTML, like Gecko) Version/0.0; GmmClient:%s/%s/%s/%s/%s/%s", new Object[]{"Android", c4714e, c4740a, "android", str, "2.17.0", "Mobile", j, b}));
        context = String.valueOf(C4725p.m21021a(context, str).versionCode);
        stringBuilder.append(String.format("/%s/%s/%s", new Object[]{"", context, "6.18.0"}));
        this.f19284k = stringBuilder.toString();
        this.f19285l = agVar;
    }

    public void onReceive(Context context, Intent intent) {
        if (m23169a(true) != null) {
            context = null;
            synchronized (this) {
                if (this.f19279f != null) {
                    try {
                        context = bo.m20652a(this.f19277d);
                        this.f19277d.clear();
                    } finally {
                        m23166d();
                    }
                }
            }
            if (r1 != null) {
                for (C5183b a : r1) {
                    a.mo5207a();
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m23168a(C5183b c5183b) {
        C5571j.m24293a((Object) c5183b, (Object) "Listener is null.");
        this.f19277d.add(c5183b);
        if (this.f19279f == null) {
            this.f19279f = true;
            this.f19275b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: d */
    private synchronized void m23166d() {
        if (this.f19279f) {
            this.f19275b.unregisterReceiver(this);
            this.f19279f = false;
        }
    }

    /* renamed from: a */
    public final boolean m23169a(boolean z) {
        if (this.f19275b.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
            return z;
        }
        z = ((ConnectivityManager) this.f19275b.getSystemService("connectivity")).getActiveNetworkInfo();
        return z && z.isConnected();
    }

    /* renamed from: a */
    public final synchronized C6413m m23167a() {
        if (this.f19280g == null) {
            Context context = this.f19275b;
            String str = this.f19281h;
            ce ceVar = this.f19276c;
            C4714e c4714e = this.f19282i;
            C4716j c4716j = new C4716j();
            c4716j.m20966a(true);
            c4716j.m20973c(af.m20938a(context));
            c4716j.m20974c(false);
            c4716j.m20972c(C4725p.m21027d());
            c4716j.m20965a("6.18.0");
            c4716j.m20964a(ceVar.m23093a());
            c4716j.m20977e(str);
            C5371d.m23570a();
            c4716j.m20968b(C5371d.m23569a(context));
            c4716j.m20969b(String.valueOf(C4725p.m21021a(context, str).versionCode));
            c4716j.m20970b(true);
            C6413m a = C6413m.m27971a(context, C4725p.m21033j(), "2.17.0", false, c4716j, m23170b());
            a.mo4892a(new C7514a());
            a.m28008a(true);
            a.m28011b(c4714e);
            this.f19280g = a;
        }
        return this.f19280g;
    }

    /* renamed from: b */
    public final synchronized C4526l m23170b() {
        if (this.f19278e == null) {
            this.f19278e = ag.m20941a(this.f19275b, this.f19283j, "com.google.android.gms", C5475a.m23830a(this.f19275b));
            this.f19278e.m20450a();
        }
        return this.f19278e;
    }

    /* renamed from: c */
    public final String m23171c() {
        return this.f19284k;
    }
}
