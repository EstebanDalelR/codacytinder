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

/* renamed from: com.google.android.gms.common.api.internal.d */
final class C3795d implements OnCompleteListener<Map<cg<?>, String>> {
    /* renamed from: a */
    private /* synthetic */ C3793b f11994a;

    private C3795d(C3793b c3793b) {
        this.f11994a = c3793b;
    }

    public final void onComplete(@NonNull C4500a<Map<cg<?>, String>> c4500a) {
        this.f11994a.f11931f.lock();
        try {
            if (this.f11994a.f11939n) {
                if (c4500a.b()) {
                    this.f11994a.f11940o = new C2880a(this.f11994a.f11926a.size());
                    for (cv b : this.f11994a.f11926a.values()) {
                        this.f11994a.f11940o.put(b.m8901b(), ConnectionResult.zzfkr);
                    }
                } else {
                    C3793b c3793b;
                    ConnectionResult f;
                    if (c4500a.d() instanceof AvailabilityException) {
                        AvailabilityException availabilityException = (AvailabilityException) c4500a.d();
                        if (this.f11994a.f11937l) {
                            this.f11994a.f11940o = new C2880a(this.f11994a.f11926a.size());
                            for (cv cvVar : this.f11994a.f11926a.values()) {
                                Map d;
                                cg b2 = cvVar.m8901b();
                                Object a = availabilityException.m8849a(cvVar);
                                if (this.f11994a.m14287a(cvVar, (ConnectionResult) a)) {
                                    d = this.f11994a.f11940o;
                                    a = new ConnectionResult(16);
                                } else {
                                    d = this.f11994a.f11940o;
                                }
                                d.put(b2, a);
                            }
                        } else {
                            this.f11994a.f11940o = availabilityException.m8848a();
                        }
                        c3793b = this.f11994a;
                        f = this.f11994a.m14293d();
                    } else {
                        Log.e("ConnectionlessGAC", "Unexpected availability exception", c4500a.d());
                        this.f11994a.f11940o = Collections.emptyMap();
                        c3793b = this.f11994a;
                        f = new ConnectionResult(8);
                    }
                    c3793b.f11943r = f;
                }
                if (this.f11994a.f11941p != null) {
                    this.f11994a.f11940o.putAll(this.f11994a.f11941p);
                    this.f11994a.f11943r = this.f11994a.m14293d();
                }
                if (this.f11994a.f11943r == null) {
                    this.f11994a.m14289b();
                    this.f11994a.m14292c();
                } else {
                    this.f11994a.f11939n = false;
                    this.f11994a.f11930e.zzc(this.f11994a.f11943r);
                }
                this.f11994a.f11934i.signalAll();
            }
            this.f11994a.f11931f.unlock();
        } catch (Throwable th) {
            this.f11994a.f11931f.unlock();
        }
    }
}
