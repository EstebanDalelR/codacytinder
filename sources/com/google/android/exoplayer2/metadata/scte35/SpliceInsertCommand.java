package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2310s;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand extends SpliceCommand {
    public static final Creator<SpliceInsertCommand> CREATOR = new C21461();
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<C2147a> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$1 */
    static class C21461 implements Creator<SpliceInsertCommand> {
        C21461() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7711a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7712a(i);
        }

        /* renamed from: a */
        public SpliceInsertCommand m7711a(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        /* renamed from: a */
        public SpliceInsertCommand[] m7712a(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$a */
    public static final class C2147a {
        /* renamed from: a */
        public final int f6135a;
        /* renamed from: b */
        public final long f6136b;
        /* renamed from: c */
        public final long f6137c;

        private C2147a(int i, long j, long j2) {
            this.f6135a = i;
            this.f6136b = j;
            this.f6137c = j2;
        }

        /* renamed from: a */
        public void m7714a(Parcel parcel) {
            parcel.writeInt(this.f6135a);
            parcel.writeLong(this.f6136b);
            parcel.writeLong(this.f6137c);
        }

        /* renamed from: b */
        public static C2147a m7713b(Parcel parcel) {
            return new C2147a(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }
    }

    private SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C2147a> list, boolean z5, long j4, int i, int i2, int i3) {
        this.spliceEventId = j;
        this.spliceEventCancelIndicator = z;
        this.outOfNetworkIndicator = z2;
        this.programSpliceFlag = z3;
        this.spliceImmediateFlag = z4;
        this.programSplicePts = j2;
        this.programSplicePlaybackPositionUs = j3;
        this.componentSpliceList = Collections.unmodifiableList(list);
        this.autoReturn = z5;
        this.breakDurationUs = j4;
        this.uniqueProgramId = i;
        this.availNum = i2;
        this.availsExpected = i3;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.spliceEventId = parcel.readLong();
        boolean z = false;
        this.spliceEventCancelIndicator = parcel.readByte() == (byte) 1;
        this.outOfNetworkIndicator = parcel.readByte() == (byte) 1;
        this.programSpliceFlag = parcel.readByte() == (byte) 1;
        this.spliceImmediateFlag = parcel.readByte() == (byte) 1;
        this.programSplicePts = parcel.readLong();
        this.programSplicePlaybackPositionUs = parcel.readLong();
        int readInt = parcel.readInt();
        List arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C2147a.m7713b(parcel));
        }
        this.componentSpliceList = Collections.unmodifiableList(arrayList);
        if (parcel.readByte() == (byte) 1) {
            z = true;
        }
        this.autoReturn = z;
        this.breakDurationUs = parcel.readLong();
        this.uniqueProgramId = parcel.readInt();
        this.availNum = parcel.readInt();
        this.availsExpected = parcel.readInt();
    }

    static SpliceInsertCommand parseFromSection(C2302k c2302k, long j, C2310s c2310s) {
        List list;
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        boolean z4;
        long j3;
        int i;
        int i2;
        int i3;
        C2310s c2310s2 = c2310s;
        long m = c2302k.m8401m();
        boolean z5 = (c2302k.m8395g() & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0;
        List emptyList = Collections.emptyList();
        if (z5) {
            list = emptyList;
            z = false;
            z2 = false;
            z3 = false;
            j2 = -9223372036854775807L;
            z4 = false;
            j3 = -9223372036854775807L;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            List list2;
            int i4;
            boolean z6;
            long m2;
            int g = c2302k.m8395g();
            boolean z7 = (g & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0;
            boolean z8 = (g & 64) != 0;
            Object obj = (g & 32) != 0 ? 1 : null;
            boolean z9 = (g & 16) != 0;
            j3 = (!z8 || z9) ? -9223372036854775807L : TimeSignalCommand.parseSpliceTime(c2302k, j);
            if (z8) {
                list2 = emptyList;
            } else {
                int g2 = c2302k.m8395g();
                list2 = new ArrayList(g2);
                i4 = 0;
                while (i4 < g2) {
                    int i5;
                    long j4;
                    int g3 = c2302k.m8395g();
                    if (z9) {
                        i5 = g2;
                        j4 = -9223372036854775807L;
                    } else {
                        i5 = g2;
                        j4 = TimeSignalCommand.parseSpliceTime(c2302k, j);
                    }
                    list2.add(new C2147a(g3, j4, c2310s2.m8441b(j4)));
                    i4++;
                    g2 = i5;
                }
            }
            if (obj != null) {
                long g4 = (long) c2302k.m8395g();
                z6 = (g4 & 128) != 0;
                m2 = ((((g4 & 1) << 32) | c2302k.m8401m()) * 1000) / 90;
            } else {
                z6 = false;
                m2 = -9223372036854775807L;
            }
            i4 = c2302k.m8396h();
            i2 = c2302k.m8395g();
            i3 = c2302k.m8395g();
            z3 = z9;
            z2 = z8;
            j2 = j3;
            list = list2;
            z4 = z6;
            j3 = m2;
            i = i4;
            z = z7;
        }
        return new SpliceInsertCommand(m, z5, z, z2, z3, j2, c2310s2.m8441b(j2), list, z4, j3, i, i2, i3);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.spliceEventId);
        parcel.writeByte((byte) this.spliceEventCancelIndicator);
        parcel.writeByte((byte) this.outOfNetworkIndicator);
        parcel.writeByte((byte) this.programSpliceFlag);
        parcel.writeByte((byte) this.spliceImmediateFlag);
        parcel.writeLong(this.programSplicePts);
        parcel.writeLong(this.programSplicePlaybackPositionUs);
        i = this.componentSpliceList.size();
        parcel.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            ((C2147a) this.componentSpliceList.get(i2)).m7714a(parcel);
        }
        parcel.writeByte((byte) this.autoReturn);
        parcel.writeLong(this.breakDurationUs);
        parcel.writeInt(this.uniqueProgramId);
        parcel.writeInt(this.availNum);
        parcel.writeInt(this.availsExpected);
    }
}
