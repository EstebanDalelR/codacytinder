package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.support.annotation.CallSuper;
import android.support.annotation.RequiresPermission;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ad;

public class Task implements ReflectedParcelable {
    public static final int EXTRAS_LIMIT_BYTES = 10240;
    public static final int NETWORK_STATE_ANY = 2;
    public static final int NETWORK_STATE_CONNECTED = 0;
    public static final int NETWORK_STATE_UNMETERED = 1;
    protected static final long UNINITIALIZED = -1;
    private final Bundle mExtras;
    private final String mTag;
    private final String zzide;
    private final boolean zzidf;
    private final boolean zzidg;
    private final int zzidh;
    private final boolean zzidi;
    private final boolean zzidj;
    private final C2552j zzidk;

    /* renamed from: com.google.android.gms.gcm.Task$a */
    public static abstract class C2543a {
        /* renamed from: a */
        protected int f7729a;
        /* renamed from: b */
        protected String f7730b;
        /* renamed from: c */
        protected String f7731c;
        /* renamed from: d */
        protected boolean f7732d;
        /* renamed from: e */
        protected boolean f7733e;
        /* renamed from: f */
        protected boolean f7734f;
        /* renamed from: g */
        protected C2552j f7735g = C2552j.f7751a;
        /* renamed from: h */
        protected Bundle f7736h;

        @CallSuper
        /* renamed from: a */
        protected void mo2599a() {
            ad.m9055b(this.f7730b != null, "Must provide an endpoint for this task by calling setService(ComponentName).");
            C2544a.m9267a(this.f7731c);
            C2552j c2552j = this.f7735g;
            if (c2552j != null) {
                int a = c2552j.m9287a();
                StringBuilder stringBuilder;
                if (a == 1 || a == 0) {
                    int b = c2552j.m9289b();
                    int c = c2552j.m9290c();
                    if (a == 0 && b < 0) {
                        StringBuilder stringBuilder2 = new StringBuilder(52);
                        stringBuilder2.append("InitialBackoffSeconds can't be negative: ");
                        stringBuilder2.append(b);
                        throw new IllegalArgumentException(stringBuilder2.toString());
                    } else if (a == 1 && b < 10) {
                        throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                    } else if (c < b) {
                        int c2 = c2552j.m9290c();
                        stringBuilder = new StringBuilder(77);
                        stringBuilder.append("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: ");
                        stringBuilder.append(c2);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                stringBuilder = new StringBuilder(45);
                stringBuilder.append("Must provide a valid RetryPolicy: ");
                stringBuilder.append(a);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            if (this.f7733e) {
                Task.zzv(this.f7736h);
            }
        }

        /* renamed from: b */
        public abstract C2543a mo2600b(int i);

        /* renamed from: b */
        public abstract C2543a mo2601b(Bundle bundle);

        /* renamed from: b */
        public abstract C2543a mo2602b(Class<? extends GcmTaskService> cls);

        /* renamed from: b */
        public abstract C2543a mo2603b(String str);

        @RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
        /* renamed from: d */
        public abstract C2543a mo2604d(boolean z);

        /* renamed from: e */
        public abstract C2543a mo2605e(boolean z);

        /* renamed from: f */
        public abstract C2543a mo2606f(boolean z);
    }

    @Deprecated
    Task(Parcel parcel) {
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.zzide = parcel.readString();
        this.mTag = parcel.readString();
        boolean z = true;
        this.zzidf = parcel.readInt() == 1;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.zzidg = z;
        this.zzidh = 2;
        this.zzidi = false;
        this.zzidj = false;
        this.zzidk = C2552j.f7751a;
        this.mExtras = null;
    }

    Task(C2543a c2543a) {
        this.zzide = c2543a.f7730b;
        this.mTag = c2543a.f7731c;
        this.zzidf = c2543a.f7732d;
        this.zzidg = c2543a.f7733e;
        this.zzidh = c2543a.f7729a;
        this.zzidi = c2543a.f7734f;
        this.zzidj = false;
        this.mExtras = c2543a.f7736h;
        this.zzidk = c2543a.f7735g != null ? c2543a.f7735g : C2552j.f7751a;
    }

    public static void zzv(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > EXTRAS_LIMIT_BYTES) {
                String str = "Extras exceeding maximum size(10240 bytes): ";
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 11);
                stringBuilder.append(str);
                stringBuilder.append(dataSize);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            for (String str2 : bundle.keySet()) {
                Object obj;
                Object obj2 = bundle.get(str2);
                if (!((obj2 instanceof Integer) || (obj2 instanceof Long) || (obj2 instanceof Double) || (obj2 instanceof String))) {
                    if (!(obj2 instanceof Boolean)) {
                        obj = null;
                        if (obj != null) {
                            if (obj2 instanceof Bundle) {
                                throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                            }
                            zzv((Bundle) obj2);
                        }
                    }
                }
                obj = 1;
                if (obj != null) {
                    if (obj2 instanceof Bundle) {
                        throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                    }
                    zzv((Bundle) obj2);
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public int getRequiredNetwork() {
        return this.zzidh;
    }

    public boolean getRequiresCharging() {
        return this.zzidi;
    }

    public String getServiceName() {
        return this.zzide;
    }

    public String getTag() {
        return this.mTag;
    }

    public boolean isPersisted() {
        return this.zzidg;
    }

    public boolean isUpdateCurrent() {
        return this.zzidf;
    }

    public void toBundle(Bundle bundle) {
        bundle.putString("tag", this.mTag);
        bundle.putBoolean("update_current", this.zzidf);
        bundle.putBoolean("persisted", this.zzidg);
        bundle.putString("service", this.zzide);
        bundle.putInt("requiredNetwork", this.zzidh);
        bundle.putBoolean("requiresCharging", this.zzidi);
        bundle.putBoolean("requiresIdle", false);
        bundle.putBundle("retryStrategy", this.zzidk.m9288a(new Bundle()));
        bundle.putBundle("extras", this.mExtras);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzide);
        parcel.writeString(this.mTag);
        parcel.writeInt(this.zzidf);
        parcel.writeInt(this.zzidg);
    }
}
