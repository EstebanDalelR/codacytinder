package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.util.C2302k;

public final class PrivateCommand extends SpliceCommand {
    public static final Creator<PrivateCommand> CREATOR = new C21451();
    public final byte[] commandBytes;
    public final long identifier;
    public final long ptsAdjustment;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.PrivateCommand$1 */
    static class C21451 implements Creator<PrivateCommand> {
        C21451() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7709a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7710a(i);
        }

        /* renamed from: a */
        public PrivateCommand m7709a(Parcel parcel) {
            return new PrivateCommand(parcel);
        }

        /* renamed from: a */
        public PrivateCommand[] m7710a(int i) {
            return new PrivateCommand[i];
        }
    }

    private PrivateCommand(long j, byte[] bArr, long j2) {
        this.ptsAdjustment = j2;
        this.identifier = j;
        this.commandBytes = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.ptsAdjustment = parcel.readLong();
        this.identifier = parcel.readLong();
        this.commandBytes = new byte[parcel.readInt()];
        parcel.readByteArray(this.commandBytes);
    }

    static PrivateCommand parseFromSection(C2302k c2302k, int i, long j) {
        long m = c2302k.m8401m();
        byte[] bArr = new byte[(i - 4)];
        c2302k.m8384a(bArr, 0, bArr.length);
        return new PrivateCommand(m, bArr, j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.ptsAdjustment);
        parcel.writeLong(this.identifier);
        parcel.writeInt(this.commandBytes.length);
        parcel.writeByteArray(this.commandBytes);
    }
}
