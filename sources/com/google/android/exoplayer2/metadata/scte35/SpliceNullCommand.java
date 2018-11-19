package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class SpliceNullCommand extends SpliceCommand {
    public static final Creator<SpliceNullCommand> CREATOR = new C21481();

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand$1 */
    static class C21481 implements Creator<SpliceNullCommand> {
        C21481() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7715a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7716a(i);
        }

        /* renamed from: a */
        public SpliceNullCommand m7715a(Parcel parcel) {
            return new SpliceNullCommand();
        }

        /* renamed from: a */
        public SpliceNullCommand[] m7716a(int i) {
            return new SpliceNullCommand[i];
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
