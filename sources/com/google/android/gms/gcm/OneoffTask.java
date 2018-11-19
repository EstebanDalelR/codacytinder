package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.gcm.Task.C2543a;

public class OneoffTask extends Task {
    public static final Creator<OneoffTask> CREATOR = new C2549g();
    private final long zzict;
    private final long zzicu;

    /* renamed from: com.google.android.gms.gcm.OneoffTask$a */
    public static class C3844a extends C2543a {
        /* renamed from: i */
        private long f12080i;
        /* renamed from: j */
        private long f12081j;

        public C3844a() {
            this.f12080i = -1;
            this.f12081j = -1;
            this.e = false;
        }

        /* renamed from: a */
        public C3844a m14470a(int i) {
            this.a = i;
            return this;
        }

        /* renamed from: a */
        public C3844a m14471a(long j, long j2) {
            this.f12080i = j;
            this.f12081j = j2;
            return this;
        }

        /* renamed from: a */
        public C3844a m14472a(Bundle bundle) {
            this.h = bundle;
            return this;
        }

        /* renamed from: a */
        public C3844a m14473a(Class<? extends GcmTaskService> cls) {
            this.b = cls.getName();
            return this;
        }

        /* renamed from: a */
        public C3844a m14474a(String str) {
            this.c = str;
            return this;
        }

        /* renamed from: a */
        public C3844a m14475a(boolean z) {
            this.f = z;
            return this;
        }

        /* renamed from: a */
        protected void mo2599a() {
            super.mo2599a();
            if (this.f12080i != -1) {
                if (this.f12081j != -1) {
                    if (this.f12080i >= this.f12081j) {
                        throw new IllegalArgumentException("Window start must be shorter than window end.");
                    }
                    return;
                }
            }
            throw new IllegalArgumentException("Must specify an execution window using setExecutionWindow.");
        }

        @RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
        /* renamed from: b */
        public C3844a m14477b(boolean z) {
            this.e = z;
            return this;
        }

        /* renamed from: b */
        public OneoffTask m14478b() {
            mo2599a();
            return new OneoffTask();
        }

        /* renamed from: b */
        public /* synthetic */ C2543a mo2600b(int i) {
            return m14470a(i);
        }

        /* renamed from: b */
        public /* synthetic */ C2543a mo2601b(Bundle bundle) {
            return m14472a(bundle);
        }

        /* renamed from: b */
        public /* synthetic */ C2543a mo2602b(Class cls) {
            return m14473a(cls);
        }

        /* renamed from: b */
        public /* synthetic */ C2543a mo2603b(String str) {
            return m14474a(str);
        }

        /* renamed from: c */
        public C3844a m14483c(boolean z) {
            this.d = z;
            return this;
        }

        @RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
        /* renamed from: d */
        public /* synthetic */ C2543a mo2604d(boolean z) {
            return m14477b(z);
        }

        /* renamed from: e */
        public /* synthetic */ C2543a mo2605e(boolean z) {
            return m14483c(z);
        }

        /* renamed from: f */
        public /* synthetic */ C2543a mo2606f(boolean z) {
            return m14475a(z);
        }
    }

    @Deprecated
    private OneoffTask(Parcel parcel) {
        super(parcel);
        this.zzict = parcel.readLong();
        this.zzicu = parcel.readLong();
    }

    private OneoffTask(C3844a c3844a) {
        super((C2543a) c3844a);
        this.zzict = c3844a.f12080i;
        this.zzicu = c3844a.f12081j;
    }

    public long getWindowEnd() {
        return this.zzicu;
    }

    public long getWindowStart() {
        return this.zzict;
    }

    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putLong("window_start", this.zzict);
        bundle.putLong("window_end", this.zzicu);
    }

    public String toString() {
        String obj = super.toString();
        long windowStart = getWindowStart();
        long windowEnd = getWindowEnd();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 64);
        stringBuilder.append(obj);
        stringBuilder.append(" windowStart=");
        stringBuilder.append(windowStart);
        stringBuilder.append(" windowEnd=");
        stringBuilder.append(windowEnd);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.zzict);
        parcel.writeLong(this.zzicu);
    }
}
