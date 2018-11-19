package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.util.Log;
import com.google.android.gms.common.C2490g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C2465a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import com.tinder.api.ManagerWebServices;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class al<T extends IInterface> {
    /* renamed from: A */
    private static String[] f7578A = new String[]{"service_esmobile", "service_googleme"};
    /* renamed from: a */
    final Handler f7579a;
    /* renamed from: b */
    protected zzj f7580b;
    /* renamed from: c */
    protected AtomicInteger f7581c;
    /* renamed from: d */
    private int f7582d;
    /* renamed from: e */
    private long f7583e;
    /* renamed from: f */
    private long f7584f;
    /* renamed from: g */
    private int f7585g;
    /* renamed from: h */
    private long f7586h;
    /* renamed from: i */
    private C2504m f7587i;
    /* renamed from: j */
    private final Context f7588j;
    /* renamed from: k */
    private final Looper f7589k;
    /* renamed from: l */
    private final C2499g f7590l;
    /* renamed from: m */
    private final C2490g f7591m;
    /* renamed from: n */
    private final Object f7592n;
    /* renamed from: o */
    private final Object f7593o;
    /* renamed from: p */
    private zzay f7594p;
    /* renamed from: q */
    private T f7595q;
    /* renamed from: r */
    private final ArrayList<ao<?>> f7596r;
    /* renamed from: s */
    private aq f7597s;
    /* renamed from: t */
    private int f7598t;
    /* renamed from: u */
    private final zzf f7599u;
    /* renamed from: v */
    private final zzg f7600v;
    /* renamed from: w */
    private final int f7601w;
    /* renamed from: x */
    private final String f7602x;
    /* renamed from: y */
    private ConnectionResult f7603y;
    /* renamed from: z */
    private boolean f7604z;

    protected al(Context context, Looper looper, int i, zzf zzf, zzg zzg, String str) {
        this(context, looper, C2499g.m9145a(context), C2490g.m9021b(), i, (zzf) ad.m9045a((Object) zzf), (zzg) ad.m9045a((Object) zzg), null);
    }

    protected al(Context context, Looper looper, C2499g c2499g, C2490g c2490g, int i, zzf zzf, zzg zzg, String str) {
        this.f7592n = new Object();
        this.f7593o = new Object();
        this.f7596r = new ArrayList();
        this.f7598t = 1;
        this.f7603y = null;
        this.f7604z = false;
        this.f7581c = new AtomicInteger(0);
        this.f7588j = (Context) ad.m9046a((Object) context, (Object) "Context must not be null");
        this.f7589k = (Looper) ad.m9046a((Object) looper, (Object) "Looper must not be null");
        this.f7590l = (C2499g) ad.m9046a((Object) c2499g, (Object) "Supervisor must not be null");
        this.f7591m = (C2490g) ad.m9046a((Object) c2490g, (Object) "API availability must not be null");
        this.f7579a = new an(this, looper);
        this.f7601w = i;
        this.f7599u = zzf;
        this.f7600v = zzg;
        this.f7602x = str;
    }

    /* renamed from: a */
    private final void m9065a(int i, T t) {
        boolean z = true;
        if ((i == 4 ? 1 : null) != (t != null ? 1 : null)) {
            z = false;
        }
        ad.m9054b(z);
        synchronized (this.f7592n) {
            this.f7598t = i;
            this.f7595q = t;
            switch (i) {
                case 1:
                    if (this.f7597s != null) {
                        this.f7590l.m9146a(mo3769a(), m9093h(), 129, this.f7597s, mo3771c());
                        this.f7597s = null;
                        break;
                    }
                    break;
                case 2:
                case 3:
                    String a;
                    if (!(this.f7597s == null || this.f7587i == null)) {
                        a = this.f7587i.m9166a();
                        String b = this.f7587i.m9167b();
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 70) + String.valueOf(b).length());
                        stringBuilder.append("Calling connect() while still connected, missing disconnect() for ");
                        stringBuilder.append(a);
                        stringBuilder.append(" on ");
                        stringBuilder.append(b);
                        Log.e("GmsClient", stringBuilder.toString());
                        this.f7590l.m9146a(this.f7587i.m9166a(), this.f7587i.m9167b(), this.f7587i.m9168c(), this.f7597s, mo3771c());
                        this.f7581c.incrementAndGet();
                    }
                    this.f7597s = new aq(this, this.f7581c.get());
                    this.f7587i = new C2504m(m9093h(), mo3769a(), false, 129);
                    if (!this.f7590l.mo2582a(new C2500h(this.f7587i.m9166a(), this.f7587i.m9167b(), this.f7587i.m9168c()), this.f7597s, mo3771c())) {
                        a = this.f7587i.m9166a();
                        String b2 = this.f7587i.m9167b();
                        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(a).length() + 34) + String.valueOf(b2).length());
                        stringBuilder2.append("unable to connect to service: ");
                        stringBuilder2.append(a);
                        stringBuilder2.append(" on ");
                        stringBuilder2.append(b2);
                        Log.e("GmsClient", stringBuilder2.toString());
                        m9083a(16, null, this.f7581c.get());
                        break;
                    }
                    break;
                case 4:
                    m9085a((IInterface) t);
                    break;
                default:
                    break;
            }
        }
    }

    /* renamed from: a */
    private final boolean m9068a(int i, int i2, T t) {
        synchronized (this.f7592n) {
            if (this.f7598t != i) {
                return false;
            }
            m9065a(i2, (IInterface) t);
            return true;
        }
    }

    @Nullable
    /* renamed from: c */
    private final String mo3771c() {
        return this.f7602x == null ? this.f7588j.getClass().getName() : this.f7602x;
    }

    /* renamed from: c */
    private final void m9072c(int i) {
        if (mo3584e()) {
            i = 5;
            this.f7604z = true;
        } else {
            i = 4;
        }
        this.f7579a.sendMessage(this.f7579a.obtainMessage(i, this.f7581c.get(), 16));
    }

    /* renamed from: e */
    private final boolean mo3584e() {
        boolean z;
        synchronized (this.f7592n) {
            z = this.f7598t == 3;
        }
        return z;
    }

    /* renamed from: o */
    private final boolean m9079o() {
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
        r2 = this;
        r0 = r2.f7604z;
        r1 = 0;
        if (r0 == 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r2.mo3770b();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0011;
    L_0x0010:
        return r1;
    L_0x0011:
        r0 = 0;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0019;
    L_0x0018:
        return r1;
    L_0x0019:
        r0 = r2.mo3770b();	 Catch:{ ClassNotFoundException -> 0x0022 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0022 }
        r0 = 1;
        return r0;
    L_0x0022:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.al.o():boolean");
    }

    @Nullable
    /* renamed from: a */
    protected abstract T mo3768a(IBinder iBinder);

    @NonNull
    /* renamed from: a */
    protected abstract String mo3769a();

    @CallSuper
    /* renamed from: a */
    protected void m9082a(int i) {
        this.f7582d = i;
        this.f7583e = System.currentTimeMillis();
    }

    /* renamed from: a */
    protected final void m9083a(int i, @Nullable Bundle bundle, int i2) {
        this.f7579a.sendMessage(this.f7579a.obtainMessage(7, i2, -1, new at(this, i, null)));
    }

    /* renamed from: a */
    protected void m9084a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.f7579a.sendMessage(this.f7579a.obtainMessage(1, i2, -1, new as(this, i, iBinder, bundle)));
    }

    @CallSuper
    /* renamed from: a */
    protected void m9085a(@NonNull T t) {
        this.f7584f = System.currentTimeMillis();
    }

    @CallSuper
    /* renamed from: a */
    protected void m9086a(ConnectionResult connectionResult) {
        this.f7585g = connectionResult.getErrorCode();
        this.f7586h = System.currentTimeMillis();
    }

    /* renamed from: a */
    protected final void m9087a(@NonNull zzj zzj, int i, @Nullable PendingIntent pendingIntent) {
        this.f7580b = (zzj) ad.m9046a((Object) zzj, (Object) "Connection progress callbacks cannot be null.");
        this.f7579a.sendMessage(this.f7579a.obtainMessage(3, this.f7581c.get(), i, pendingIntent));
    }

    @NonNull
    /* renamed from: b */
    protected abstract String mo3770b();

    /* renamed from: b */
    public final void m9089b(int i) {
        this.f7579a.sendMessage(this.f7579a.obtainMessage(6, this.f7581c.get(), i));
    }

    /* renamed from: d */
    public Account mo3583d() {
        return null;
    }

    public void disconnect() {
        this.f7581c.incrementAndGet();
        synchronized (this.f7596r) {
            int size = this.f7596r.size();
            for (int i = 0; i < size; i++) {
                ((ao) this.f7596r.get(i)).m9105d();
            }
            this.f7596r.clear();
        }
        synchronized (this.f7593o) {
            this.f7594p = null;
        }
        m9065a(1, null);
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        synchronized (this.f7592n) {
            int i = this.f7598t;
            IInterface iInterface = this.f7595q;
        }
        synchronized (this.f7593o) {
            zzay zzay = this.f7594p;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                str2 = "DISCONNECTED";
                break;
            case 2:
                str2 = "REMOTE_CONNECTING";
                break;
            case 3:
                str2 = "LOCAL_CONNECTING";
                break;
            case 4:
                str2 = "CONNECTED";
                break;
            case 5:
                str2 = "DISCONNECTING";
                break;
            default:
                str2 = "UNKNOWN";
                break;
        }
        printWriter.print(str2);
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append(ManagerWebServices.NULL_STRING_VALUE);
        } else {
            printWriter.append(mo3770b()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (zzay == null) {
            printWriter.println(ManagerWebServices.NULL_STRING_VALUE);
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(zzay.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f7584f > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f7584f;
            String format = simpleDateFormat.format(new Date(this.f7584f));
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(format).length() + 21);
            stringBuilder.append(j);
            stringBuilder.append(" ");
            stringBuilder.append(format);
            append.println(stringBuilder.toString());
        }
        if (this.f7583e > 0) {
            CharSequence charSequence;
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.f7582d) {
                case 1:
                    charSequence = "CAUSE_SERVICE_DISCONNECTED";
                    break;
                case 2:
                    charSequence = "CAUSE_NETWORK_LOST";
                    break;
                default:
                    charSequence = String.valueOf(this.f7582d);
                    break;
            }
            printWriter.append(charSequence);
            append = printWriter.append(" lastSuspendedTime=");
            j = this.f7583e;
            format = simpleDateFormat.format(new Date(this.f7583e));
            stringBuilder = new StringBuilder(String.valueOf(format).length() + 21);
            stringBuilder.append(j);
            stringBuilder.append(" ");
            stringBuilder.append(format);
            append.println(stringBuilder.toString());
        }
        if (this.f7586h > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C2465a.m8890a(this.f7585g));
            PrintWriter append2 = printWriter.append(" lastFailedTime=");
            long j2 = this.f7586h;
            String format2 = simpleDateFormat.format(new Date(this.f7586h));
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(format2).length() + 21);
            stringBuilder2.append(j2);
            stringBuilder2.append(" ");
            stringBuilder2.append(format2);
            append2.println(stringBuilder2.toString());
        }
    }

    /* renamed from: f */
    protected Set<Scope> mo3585f() {
        return Collections.EMPTY_SET;
    }

    /* renamed from: g */
    public zzc[] mo3586g() {
        return new zzc[0];
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* renamed from: h */
    protected String m9093h() {
        return "com.google.android.gms";
    }

    /* renamed from: i */
    public final void m9094i() {
        int a = this.f7591m.mo2566a(this.f7588j);
        if (a != 0) {
            m9065a(1, null);
            m9087a(new ar(this), a, null);
            return;
        }
        zza(new ar(this));
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.f7592n) {
            z = this.f7598t == 4;
        }
        return z;
    }

    public final boolean isConnecting() {
        boolean z;
        synchronized (this.f7592n) {
            if (this.f7598t != 2) {
                if (this.f7598t != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public final Context m9095j() {
        return this.f7588j;
    }

    /* renamed from: k */
    protected Bundle m9096k() {
        return new Bundle();
    }

    /* renamed from: l */
    protected final void m9097l() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: m */
    public final T m9098m() throws DeadObjectException {
        T t;
        synchronized (this.f7592n) {
            if (this.f7598t == 5) {
                throw new DeadObjectException();
            }
            m9097l();
            ad.m9051a(this.f7595q != null, (Object) "Client is connected but service is null");
            t = this.f7595q;
        }
        return t;
    }

    /* renamed from: n */
    public boolean m9099n() {
        return false;
    }

    @WorkerThread
    public final void zza(zzan zzan, Set<Scope> set) {
        Bundle k = m9096k();
        zzz zzz = new zzz(this.f7601w);
        zzz.zzfzt = this.f7588j.getPackageName();
        zzz.zzfzw = k;
        if (set != null) {
            zzz.zzfzv = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (zzaay()) {
            zzz.zzfzx = mo3583d() != null ? mo3583d() : new Account("<<default account>>", "com.google");
            if (zzan != null) {
                zzz.zzfzu = zzan.asBinder();
            }
        } else if (m9099n()) {
            zzz.zzfzx = mo3583d();
        }
        zzz.zzfzy = mo3586g();
        try {
            synchronized (this.f7593o) {
                if (this.f7594p != null) {
                    this.f7594p.zza(new ap(this, this.f7581c.get()), zzz);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (Throwable e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            m9089b(1);
        } catch (SecurityException e2) {
            throw e2;
        } catch (Throwable e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            m9084a(8, null, null, this.f7581c.get());
        }
    }

    public void zza(@NonNull zzj zzj) {
        this.f7580b = (zzj) ad.m9046a((Object) zzj, (Object) "Connection progress callbacks cannot be null.");
        m9065a(2, null);
    }

    public void zza(@NonNull zzp zzp) {
        zzp.zzajf();
    }

    public boolean zzaay() {
        return false;
    }

    public boolean zzabj() {
        return false;
    }

    public Bundle zzafi() {
        return null;
    }

    public boolean zzagg() {
        return true;
    }

    @Nullable
    public final IBinder zzagh() {
        synchronized (this.f7593o) {
            if (this.f7594p == null) {
                return null;
            }
            IBinder asBinder = this.f7594p.asBinder();
            return asBinder;
        }
    }

    public final String zzagi() {
        if (isConnected() && this.f7587i != null) {
            return this.f7587i.m9167b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }
}
