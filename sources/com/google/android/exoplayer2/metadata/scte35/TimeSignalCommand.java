package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2310s;

public final class TimeSignalCommand extends SpliceCommand {
    public static final Creator<TimeSignalCommand> CREATOR = new C21521();
    public final long playbackPositionUs;
    public final long ptsTime;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand$1 */
    static class C21521 implements Creator<TimeSignalCommand> {
        C21521() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7729a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7730a(i);
        }

        /* renamed from: a */
        public TimeSignalCommand m7729a(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
        }

        /* renamed from: a */
        public TimeSignalCommand[] m7730a(int i) {
            return new TimeSignalCommand[i];
        }
    }

    private TimeSignalCommand(long j, long j2) {
        this.ptsTime = j;
        this.playbackPositionUs = j2;
    }

    static TimeSignalCommand parseFromSection(C2302k c2302k, long j, C2310s c2310s) {
        c2302k = parseSpliceTime(c2302k, j);
        return new TimeSignalCommand(c2302k, c2310s.m8441b(c2302k));
    }

    static long parseSpliceTime(C2302k c2302k, long j) {
        long g = (long) c2302k.m8395g();
        return (g & 128) != 0 ? ((((g & 1) << 32) | c2302k.m8401m()) + j) & -1 : -9223372036854775807L;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.ptsTime);
        parcel.writeLong(this.playbackPositionUs);
    }
}
