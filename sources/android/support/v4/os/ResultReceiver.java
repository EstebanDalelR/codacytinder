package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.os.IResultReceiver.C2872a;

@RestrictTo({Scope.LIBRARY_GROUP})
public class ResultReceiver implements Parcelable {
    public static final Creator<ResultReceiver> CREATOR = new C05261();
    final Handler mHandler;
    final boolean mLocal;
    IResultReceiver mReceiver;

    /* renamed from: android.support.v4.os.ResultReceiver$1 */
    static class C05261 implements Creator<ResultReceiver> {
        C05261() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1949a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m1950a(i);
        }

        /* renamed from: a */
        public ResultReceiver m1949a(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* renamed from: a */
        public ResultReceiver[] m1950a(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class C0527b implements Runnable {
        /* renamed from: a */
        final int f1626a;
        /* renamed from: b */
        final Bundle f1627b;
        /* renamed from: c */
        final /* synthetic */ ResultReceiver f1628c;

        C0527b(ResultReceiver resultReceiver, int i, Bundle bundle) {
            this.f1628c = resultReceiver;
            this.f1626a = i;
            this.f1627b = bundle;
        }

        public void run() {
            this.f1628c.onReceiveResult(this.f1626a, this.f1627b);
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    class C4025a extends C2872a {
        /* renamed from: a */
        final /* synthetic */ ResultReceiver f12778a;

        C4025a(ResultReceiver resultReceiver) {
            this.f12778a = resultReceiver;
        }

        public void send(int i, Bundle bundle) {
            if (this.f12778a.mHandler != null) {
                this.f12778a.mHandler.post(new C0527b(this.f12778a, i, bundle));
            } else {
                this.f12778a.onReceiveResult(i, bundle);
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    protected void onReceiveResult(int i, Bundle bundle) {
    }

    public ResultReceiver(Handler handler) {
        this.mLocal = true;
        this.mHandler = handler;
    }

    public void send(int r3, android.os.Bundle r4) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.mLocal;
        if (r0 == 0) goto L_0x0017;
    L_0x0004:
        r0 = r2.mHandler;
        if (r0 == 0) goto L_0x0013;
    L_0x0008:
        r0 = r2.mHandler;
        r1 = new android.support.v4.os.ResultReceiver$b;
        r1.<init>(r2, r3, r4);
        r0.post(r1);
        goto L_0x0016;
    L_0x0013:
        r2.onReceiveResult(r3, r4);
    L_0x0016:
        return;
    L_0x0017:
        r0 = r2.mReceiver;
        if (r0 == 0) goto L_0x0020;
    L_0x001b:
        r0 = r2.mReceiver;	 Catch:{ RemoteException -> 0x0020 }
        r0.send(r3, r4);	 Catch:{ RemoteException -> 0x0020 }
    L_0x0020:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.os.ResultReceiver.send(int, android.os.Bundle):void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.mReceiver == 0) {
                this.mReceiver = new C4025a(this);
            }
            parcel.writeStrongBinder(this.mReceiver.asBinder());
        }
    }

    ResultReceiver(Parcel parcel) {
        this.mLocal = false;
        this.mHandler = null;
        this.mReceiver = C2872a.m11325a(parcel.readStrongBinder());
    }
}
