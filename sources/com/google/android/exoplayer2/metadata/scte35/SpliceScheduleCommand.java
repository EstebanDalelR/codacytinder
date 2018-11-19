package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.util.C2302k;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Creator<SpliceScheduleCommand> CREATOR = new C21491();
    public final List<C2151b> events;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$1 */
    static class C21491 implements Creator<SpliceScheduleCommand> {
        C21491() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7717a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7718a(i);
        }

        /* renamed from: a */
        public SpliceScheduleCommand m7717a(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        /* renamed from: a */
        public SpliceScheduleCommand[] m7718a(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$a */
    public static final class C2150a {
        /* renamed from: a */
        public final int f6138a;
        /* renamed from: b */
        public final long f6139b;

        private C2150a(int i, long j) {
            this.f6138a = i;
            this.f6139b = j;
        }

        /* renamed from: b */
        private static C2150a m7721b(Parcel parcel) {
            return new C2150a(parcel.readInt(), parcel.readLong());
        }

        /* renamed from: c */
        private void m7722c(Parcel parcel) {
            parcel.writeInt(this.f6138a);
            parcel.writeLong(this.f6139b);
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$b */
    public static final class C2151b {
        /* renamed from: a */
        public final long f6140a;
        /* renamed from: b */
        public final boolean f6141b;
        /* renamed from: c */
        public final boolean f6142c;
        /* renamed from: d */
        public final boolean f6143d;
        /* renamed from: e */
        public final long f6144e;
        /* renamed from: f */
        public final List<C2150a> f6145f;
        /* renamed from: g */
        public final boolean f6146g;
        /* renamed from: h */
        public final long f6147h;
        /* renamed from: i */
        public final int f6148i;
        /* renamed from: j */
        public final int f6149j;
        /* renamed from: k */
        public final int f6150k;

        private C2151b(long j, boolean z, boolean z2, boolean z3, List<C2150a> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f6140a = j;
            this.f6141b = z;
            this.f6142c = z2;
            this.f6143d = z3;
            this.f6145f = Collections.unmodifiableList(list);
            this.f6144e = j2;
            this.f6146g = z4;
            this.f6147h = j3;
            this.f6148i = i;
            this.f6149j = i2;
            this.f6150k = i3;
        }

        private C2151b(Parcel parcel) {
            this.f6140a = parcel.readLong();
            boolean z = false;
            this.f6141b = parcel.readByte() == (byte) 1;
            this.f6142c = parcel.readByte() == (byte) 1;
            this.f6143d = parcel.readByte() == (byte) 1;
            int readInt = parcel.readInt();
            List arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C2150a.m7721b(parcel));
            }
            this.f6145f = Collections.unmodifiableList(arrayList);
            this.f6144e = parcel.readLong();
            if (parcel.readByte() == (byte) 1) {
                z = true;
            }
            this.f6146g = z;
            this.f6147h = parcel.readLong();
            this.f6148i = parcel.readInt();
            this.f6149j = parcel.readInt();
            this.f6150k = parcel.readInt();
        }

        /* renamed from: b */
        private static C2151b m7726b(C2302k c2302k) {
            List list;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i;
            int i2;
            int i3;
            boolean z3;
            long m = c2302k.m8401m();
            boolean z4 = (c2302k.m8395g() & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0;
            ArrayList arrayList = new ArrayList();
            if (z4) {
                list = arrayList;
                z = false;
                j = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                i3 = 0;
                z3 = false;
            } else {
                ArrayList arrayList2;
                boolean z5;
                long m2;
                int g = c2302k.m8395g();
                z2 = (g & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0;
                boolean z6 = (g & 64) != 0;
                Object obj = (g & 32) != 0 ? 1 : null;
                long m3 = z6 ? c2302k.m8401m() : -9223372036854775807L;
                if (z6) {
                    arrayList2 = arrayList;
                } else {
                    int g2 = c2302k.m8395g();
                    arrayList2 = new ArrayList(g2);
                    for (int i4 = 0; i4 < g2; i4++) {
                        arrayList2.add(new C2150a(c2302k.m8395g(), c2302k.m8401m()));
                    }
                }
                if (obj != null) {
                    long g3 = (long) c2302k.m8395g();
                    z5 = (g3 & 128) != 0;
                    m2 = ((((g3 & 1) << 32) | c2302k.m8401m()) * 1000) / 90;
                } else {
                    z5 = false;
                    m2 = -9223372036854775807L;
                }
                z3 = z6;
                j = m3;
                list = arrayList2;
                j2 = m2;
                i = c2302k.m8396h();
                i2 = c2302k.m8395g();
                i3 = c2302k.m8395g();
                z = z2;
                z2 = z5;
            }
            return new C2151b(m, z4, z, z3, list, j, z2, j2, i, i2, i3);
        }

        /* renamed from: b */
        private void m7727b(Parcel parcel) {
            parcel.writeLong(this.f6140a);
            parcel.writeByte((byte) this.f6141b);
            parcel.writeByte((byte) this.f6142c);
            parcel.writeByte((byte) this.f6143d);
            int size = this.f6145f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                ((C2150a) this.f6145f.get(i)).m7722c(parcel);
            }
            parcel.writeLong(this.f6144e);
            parcel.writeByte((byte) this.f6146g);
            parcel.writeLong(this.f6147h);
            parcel.writeInt(this.f6148i);
            parcel.writeInt(this.f6149j);
            parcel.writeInt(this.f6150k);
        }

        /* renamed from: c */
        private static C2151b m7728c(Parcel parcel) {
            return new C2151b(parcel);
        }
    }

    private SpliceScheduleCommand(List<C2151b> list) {
        this.events = Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        List arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C2151b.m7728c(parcel));
        }
        this.events = Collections.unmodifiableList(arrayList);
    }

    static SpliceScheduleCommand parseFromSection(C2302k c2302k) {
        int g = c2302k.m8395g();
        List arrayList = new ArrayList(g);
        for (int i = 0; i < g; i++) {
            arrayList.add(C2151b.m7726b(c2302k));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = this.events.size();
        parcel.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            ((C2151b) this.events.get(i2)).m7727b(parcel);
        }
    }
}
