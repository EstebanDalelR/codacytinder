package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.gcm.Task.C2543a;

public class PeriodicTask extends Task {
    public static final Creator<PeriodicTask> CREATOR = new C2551i();
    protected long mFlexInSeconds;
    protected long mIntervalInSeconds;

    /* renamed from: com.google.android.gms.gcm.PeriodicTask$a */
    public static class C3845a extends C2543a {
        /* renamed from: i */
        private long f12082i;
        /* renamed from: j */
        private long f12083j;

        public C3845a() {
            this.f12082i = -1;
            this.f12083j = -1;
            this.e = true;
        }

        /* renamed from: a */
        public C3845a m14489a(int i) {
            this.a = i;
            return this;
        }

        /* renamed from: a */
        public C3845a m14490a(long j) {
            this.f12082i = j;
            return this;
        }

        /* renamed from: a */
        public C3845a m14491a(Bundle bundle) {
            this.h = bundle;
            return this;
        }

        /* renamed from: a */
        public C3845a m14492a(Class<? extends GcmTaskService> cls) {
            this.b = cls.getName();
            return this;
        }

        /* renamed from: a */
        public C3845a m14493a(String str) {
            this.c = str;
            return this;
        }

        /* renamed from: a */
        public C3845a m14494a(boolean z) {
            this.f = z;
            return this;
        }

        /* renamed from: a */
        protected void mo2599a() {
            super.mo2599a();
            if (this.f12082i == -1) {
                throw new IllegalArgumentException("Must call setPeriod(long) to establish an execution interval for this periodic task.");
            } else if (this.f12082i <= 0) {
                long j = this.f12082i;
                StringBuilder stringBuilder = new StringBuilder(66);
                stringBuilder.append("Period set cannot be less than or equal to 0: ");
                stringBuilder.append(j);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else if (this.f12083j == -1) {
                this.f12083j = (long) (((float) this.f12082i) * 0.1f);
            } else {
                if (this.f12083j > this.f12082i) {
                    this.f12083j = this.f12082i;
                }
            }
        }

        /* renamed from: b */
        public C3845a m14496b(long j) {
            this.f12083j = j;
            return this;
        }

        @RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
        /* renamed from: b */
        public C3845a m14497b(boolean z) {
            this.e = z;
            return this;
        }

        /* renamed from: b */
        public PeriodicTask m14498b() {
            mo2599a();
            return new PeriodicTask();
        }

        /* renamed from: b */
        public /* synthetic */ C2543a mo2600b(int i) {
            return m14489a(i);
        }

        /* renamed from: b */
        public /* synthetic */ C2543a mo2601b(Bundle bundle) {
            return m14491a(bundle);
        }

        /* renamed from: b */
        public /* synthetic */ C2543a mo2602b(Class cls) {
            return m14492a(cls);
        }

        /* renamed from: b */
        public /* synthetic */ C2543a mo2603b(String str) {
            return m14493a(str);
        }

        /* renamed from: c */
        public C3845a m14503c(boolean z) {
            this.d = z;
            return this;
        }

        @RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
        /* renamed from: d */
        public /* synthetic */ C2543a mo2604d(boolean z) {
            return m14497b(z);
        }

        /* renamed from: e */
        public /* synthetic */ C2543a mo2605e(boolean z) {
            return m14503c(z);
        }

        /* renamed from: f */
        public /* synthetic */ C2543a mo2606f(boolean z) {
            return m14494a(z);
        }
    }

    @Deprecated
    private PeriodicTask(Parcel parcel) {
        super(parcel);
        this.mIntervalInSeconds = -1;
        this.mFlexInSeconds = -1;
        this.mIntervalInSeconds = parcel.readLong();
        this.mFlexInSeconds = Math.min(parcel.readLong(), this.mIntervalInSeconds);
    }

    private PeriodicTask(C3845a c3845a) {
        super((C2543a) c3845a);
        this.mIntervalInSeconds = -1;
        this.mFlexInSeconds = -1;
        this.mIntervalInSeconds = c3845a.f12082i;
        this.mFlexInSeconds = Math.min(c3845a.f12083j, this.mIntervalInSeconds);
    }

    public long getFlex() {
        return this.mFlexInSeconds;
    }

    public long getPeriod() {
        return this.mIntervalInSeconds;
    }

    public void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putLong("period", this.mIntervalInSeconds);
        bundle.putLong("period_flex", this.mFlexInSeconds);
    }

    public String toString() {
        String obj = super.toString();
        long period = getPeriod();
        long flex = getFlex();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 54);
        stringBuilder.append(obj);
        stringBuilder.append(" period=");
        stringBuilder.append(period);
        stringBuilder.append(" flex=");
        stringBuilder.append(flex);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.mIntervalInSeconds);
        parcel.writeLong(this.mFlexInSeconds);
    }
}
