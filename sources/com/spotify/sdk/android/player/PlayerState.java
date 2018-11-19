package com.spotify.sdk.android.player;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PlayerState implements Parcelable {
    public static final Creator CREATOR = new C59691();
    public boolean activeDevice;
    public int durationInMs;
    public boolean playing;
    public int positionInMs;
    public boolean repeating;
    public boolean shuffling;
    public String trackUri;

    /* renamed from: com.spotify.sdk.android.player.PlayerState$1 */
    static class C59691 implements Creator {
        C59691() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m25578a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m25579a(i);
        }

        /* renamed from: a */
        public PlayerState m25578a(Parcel parcel) {
            return new PlayerState(parcel);
        }

        /* renamed from: a */
        public PlayerState[] m25579a(int i) {
            return new PlayerState[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public PlayerState(Parcel parcel) {
        boolean z = false;
        this.playing = parcel.readByte() != (byte) 0;
        this.shuffling = parcel.readByte() != (byte) 0;
        this.repeating = parcel.readByte() != (byte) 0;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.activeDevice = z;
        this.positionInMs = parcel.readInt();
        this.durationInMs = parcel.readInt();
        this.trackUri = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) this.playing);
        parcel.writeByte((byte) this.shuffling);
        parcel.writeByte((byte) this.repeating);
        parcel.writeByte((byte) this.activeDevice);
        parcel.writeInt(this.positionInMs);
        parcel.writeInt(this.durationInMs);
        parcel.writeString(this.trackUri);
    }
}
