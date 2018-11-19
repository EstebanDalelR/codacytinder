package com.google.android.gms.common.api.internal;

import android.support.annotation.NonNull;
import android.support.v4.util.C2880a;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.C4500a;
import com.google.android.gms.tasks.OnCompleteListener;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.e */
final class C3796e implements OnCompleteListener<Map<cg<?>, String>> {
    /* renamed from: a */
    private zzcu f11995a;
    /* renamed from: b */
    private /* synthetic */ C3793b f11996b;

    C3796e(C3793b c3793b, zzcu zzcu) {
        this.f11996b = c3793b;
        this.f11995a = zzcu;
    }

    /* renamed from: a */
    final void m14368a() {
        this.f11995a.zzabi();
    }

    public final void onComplete(@NonNull C4500a<Map<cg<?>, String>> c4500a) {
        this.f11996b.f11931f.lock();
        try {
            zzcu zzcu;
            if (this.f11996b.f11939n) {
                if (c4500a.b()) {
                    this.f11996b.f11941p = new C2880a(this.f11996b.f11927b.size());
                    for (cv b : this.f11996b.f11927b.values()) {
                        this.f11996b.f11941p.put(b.m8901b(), ConnectionResult.zzfkr);
                    }
                } else if (c4500a.d() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) c4500a.d();
                    if (this.f11996b.f11937l) {
                        this.f11996b.f11941p = new C2880a(this.f11996b.f11927b.size());
                        for (cv cvVar : this.f11996b.f11927b.values()) {
                            Map g;
                            cg b2 = cvVar.m8901b();
                            Object a = availabilityException.m8849a(cvVar);
                            if (this.f11996b.m14287a(cvVar, (ConnectionResult) a)) {
                                g = this.f11996b.f11941p;
                                a = new ConnectionResult(16);
                            } else {
                                g = this.f11996b.f11941p;
                            }
                            g.put(b2, a);
                        }
                    } else {
                        this.f11996b.f11941p = availabilityException.m8848a();
                    }
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", c4500a.d());
                    this.f11996b.f11941p = Collections.emptyMap();
                }
                if (this.f11996b.isConnected()) {
                    this.f11996b.f11940o.putAll(this.f11996b.f11941p);
                    if (this.f11996b.m14293d() == null) {
                        this.f11996b.m14289b();
                        this.f11996b.m14292c();
                        this.f11996b.f11934i.signalAll();
                    }
                }
                zzcu = this.f11995a;
            } else {
                zzcu = this.f11995a;
            }
            zzcu.zzabi();
        } finally {
            this.f11996b.f11931f.unlock();
        }
    }
}
