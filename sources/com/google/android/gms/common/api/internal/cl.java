package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.gms.common.C3813b;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

public abstract class cl extends LifecycleCallback implements OnCancelListener {
    /* renamed from: b */
    protected volatile boolean f11965b;
    /* renamed from: c */
    protected final AtomicReference<cm> f11966c;
    /* renamed from: d */
    protected final C3813b f11967d;
    /* renamed from: e */
    private final Handler f11968e;

    protected cl(zzcf zzcf) {
        this(zzcf, C3813b.m14425a());
    }

    private cl(zzcf zzcf, C3813b c3813b) {
        super(zzcf);
        this.f11966c = new AtomicReference(null);
        this.f11968e = new Handler(Looper.getMainLooper());
        this.f11967d = c3813b;
    }

    /* renamed from: a */
    private static int m14331a(@Nullable cm cmVar) {
        return cmVar == null ? -1 : cmVar.m9002a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo2547a(int r4, int r5, android.content.Intent r6) {
        /*
        r3 = this;
        r0 = r3.f11966c;
        r0 = r0.get();
        r0 = (com.google.android.gms.common.api.internal.cm) r0;
        r1 = 1;
        r2 = 0;
        switch(r4) {
            case 1: goto L_0x002e;
            case 2: goto L_0x000e;
            default: goto L_0x000d;
        };
    L_0x000d:
        goto L_0x0053;
    L_0x000e:
        r4 = r3.f11967d;
        r5 = r3.m8917a();
        r4 = r4.mo2566a(r5);
        if (r4 != 0) goto L_0x001b;
    L_0x001a:
        goto L_0x001c;
    L_0x001b:
        r1 = 0;
    L_0x001c:
        if (r0 != 0) goto L_0x001f;
    L_0x001e:
        return;
    L_0x001f:
        r5 = r0.m9003b();
        r5 = r5.getErrorCode();
        r6 = 18;
        if (r5 != r6) goto L_0x0054;
    L_0x002b:
        if (r4 != r6) goto L_0x0054;
    L_0x002d:
        return;
    L_0x002e:
        r4 = -1;
        if (r5 != r4) goto L_0x0032;
    L_0x0031:
        goto L_0x0054;
    L_0x0032:
        if (r5 != 0) goto L_0x0053;
    L_0x0034:
        r4 = 13;
        if (r6 == 0) goto L_0x003e;
    L_0x0038:
        r5 = "<<ResolutionFailureErrorDetail>>";
        r4 = r6.getIntExtra(r5, r4);
    L_0x003e:
        r5 = new com.google.android.gms.common.api.internal.cm;
        r6 = new com.google.android.gms.common.ConnectionResult;
        r1 = 0;
        r6.<init>(r4, r1);
        r4 = m14331a(r0);
        r5.<init>(r6, r4);
        r4 = r3.f11966c;
        r4.set(r5);
        r0 = r5;
    L_0x0053:
        r1 = 0;
    L_0x0054:
        if (r1 == 0) goto L_0x005a;
    L_0x0056:
        r3.m14340h();
        return;
    L_0x005a:
        if (r0 == 0) goto L_0x0067;
    L_0x005c:
        r4 = r0.m9003b();
        r5 = r0.m9002a();
        r3.mo3572a(r4, r5);
    L_0x0067:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.cl.a(int, int, android.content.Intent):void");
    }

    /* renamed from: a */
    public final void mo2548a(Bundle bundle) {
        super.mo2548a(bundle);
        if (bundle != null) {
            this.f11966c.set(bundle.getBoolean("resolving_error", false) ? new cm(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    /* renamed from: a */
    protected abstract void mo3572a(ConnectionResult connectionResult, int i);

    /* renamed from: b */
    public void mo2549b() {
        super.mo2549b();
        this.f11965b = true;
    }

    /* renamed from: b */
    public final void mo2550b(Bundle bundle) {
        super.mo2550b(bundle);
        cm cmVar = (cm) this.f11966c.get();
        if (cmVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", cmVar.m9002a());
            bundle.putInt("failed_status", cmVar.m9003b().getErrorCode());
            bundle.putParcelable("failed_resolution", cmVar.m9003b().getResolution());
        }
    }

    /* renamed from: b */
    public final void m14337b(ConnectionResult connectionResult, int i) {
        cm cmVar = new cm(connectionResult, i);
        if (this.f11966c.compareAndSet(null, cmVar)) {
            this.f11968e.post(new cn(this, cmVar));
        }
    }

    /* renamed from: d */
    public void mo2551d() {
        super.mo2551d();
        this.f11965b = false;
    }

    /* renamed from: f */
    protected abstract void mo3574f();

    /* renamed from: h */
    protected final void m14340h() {
        this.f11966c.set(null);
        mo3574f();
    }

    public void onCancel(DialogInterface dialogInterface) {
        mo3572a(new ConnectionResult(13, null), m14331a((cm) this.f11966c.get()));
        m14340h();
    }
}
