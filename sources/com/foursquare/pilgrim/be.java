package com.foursquare.pilgrim;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.content.C0432b;
import com.google.android.gms.location.C4483a;
import com.google.android.gms.location.C4486f;
import com.google.android.gms.location.C6280b;
import com.google.android.gms.location.C6281c;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.C4500a;
import com.google.android.gms.tasks.OnCompleteListener;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

class be extends bd {
    /* renamed from: a */
    static final String f10631a = "be";
    /* renamed from: b */
    Exception f10632b;
    /* renamed from: c */
    private C6281c f10633c;
    /* renamed from: d */
    private C6280b f10634d;
    /* renamed from: e */
    private AtomicBoolean f10635e = new AtomicBoolean(false);
    /* renamed from: f */
    private long f10636f = 60;
    /* renamed from: g */
    private long f10637g = 60;

    /* renamed from: com.foursquare.pilgrim.be$1 */
    class C35441 implements OnCompleteListener<Void> {
        /* renamed from: a */
        final /* synthetic */ be f10628a;

        C35441(be beVar) {
            this.f10628a = beVar;
        }

        public void onComplete(@NonNull C4500a<Void> c4500a) {
            this.f10628a.f10635e.set(true);
            if (!c4500a.b()) {
                this.f10628a.m7085a("Removing location updates wasnt successful");
                this.f10628a.f10632b = c4500a.d();
            }
        }
    }

    /* renamed from: com.foursquare.pilgrim.be$2 */
    class C35452 implements OnCompleteListener<Void> {
        /* renamed from: a */
        final /* synthetic */ be f10629a;

        C35452(be beVar) {
            this.f10629a = beVar;
        }

        public void onComplete(@NonNull C4500a<Void> c4500a) {
            this.f10629a.f10635e.set(true);
        }
    }

    /* renamed from: com.foursquare.pilgrim.be$3 */
    class C35463 implements OnCompleteListener<Void> {
        /* renamed from: a */
        final /* synthetic */ be f10630a;

        C35463(be beVar) {
            this.f10630a = beVar;
        }

        public void onComplete(@NonNull C4500a<Void> c4500a) {
            this.f10630a.f10635e.set(true);
            if (!c4500a.b()) {
                this.f10630a.m7085a("Requesting location updates failed");
                this.f10630a.f10632b = c4500a.d();
            }
        }
    }

    be(Context context) {
        this.f10633c = C4486f.a(context);
        this.f10634d = C4483a.a(context);
    }

    /* renamed from: a */
    void m13358a(Context context, long j, long j2) {
        this.f10635e.set(false);
        if (j < 10) {
            j = 60;
        }
        if (j2 < 10) {
            j2 = 60;
        }
        this.f10636f = j;
        this.f10637g = j2;
        m13350d(context);
        if (ax.m7003a().m7049s() != null) {
            m13349c(context);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    private void m13349c(Context context) {
        if (C0432b.m1645b(context, "com.google.android.gms.permission.ACTIVITY_RECOGNITION") != 0) {
            m7085a("App doesn't have activity recognition permission, we can't do anything.");
            return;
        }
        long toMillis = TimeUnit.SECONDS.toMillis(this.f10636f);
        m7085a("Requesting Activity updates");
        this.f10634d.a(toMillis, m13354h(context));
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    void m13357a(Context context) {
        this.f10635e.set(false);
        this.f10633c.a(m13353g(context)).a(new C35441(this));
        m13355i(context);
        if (C0432b.m1645b(context, "com.google.android.gms.permission.ACTIVITY_RECOGNITION") == 0) {
            this.f10634d.a(m13354h(context)).a(new C35452(this));
            m13356j(context);
        }
    }

    /* renamed from: d */
    private void m13350d(Context context) {
        if (C0432b.m1645b(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            m7085a("App doesn't have location permission, we can't do anything.");
            this.f10635e.set(true);
            return;
        }
        long toMillis = TimeUnit.SECONDS.toMillis(this.f10636f);
        this.f10633c.a(LocationRequest.create().setInterval(toMillis).setFastestInterval(TimeUnit.SECONDS.toMillis(this.f10637g)).setPriority(102).setMaxWaitTime(toMillis), m13353g(context)).a(new C35463(this));
        if (ax.m7003a().m7050t() != null) {
            C3567q.m13414a().m3756D();
        }
    }

    /* renamed from: a */
    public boolean mo2049a() {
        return this.f10635e.get();
    }

    /* renamed from: e */
    private static Intent m13351e(Context context) {
        return new Intent(context, ReceiverPilgrimLocationClientFire.class);
    }

    /* renamed from: f */
    private static Intent m13352f(Context context) {
        return new Intent(context, ReceiverPilgrimActivityRecognitionFire.class);
    }

    /* renamed from: g */
    private static PendingIntent m13353g(Context context) {
        return PendingIntent.getBroadcast(context, 0, m13351e(context), 134217728);
    }

    /* renamed from: b */
    static boolean m13348b(Context context) {
        return PendingIntent.getBroadcast(context, 0, m13351e(context), 536870912) != null;
    }

    /* renamed from: h */
    private static PendingIntent m13354h(Context context) {
        return PendingIntent.getBroadcast(context, 0, m13352f(context), 134217728);
    }

    /* renamed from: i */
    private static void m13355i(Context context) {
        context = PendingIntent.getBroadcast(context, 0, m13351e(context), 134217728);
        if (context != null) {
            context.cancel();
        }
    }

    /* renamed from: j */
    private static void m13356j(Context context) {
        context = PendingIntent.getBroadcast(context, 0, m13352f(context), 134217728);
        if (context != null) {
            context.cancel();
        }
    }
}
