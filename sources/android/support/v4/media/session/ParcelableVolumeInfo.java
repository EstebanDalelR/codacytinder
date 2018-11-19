package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator<ParcelableVolumeInfo> CREATOR = new C05181();
    public int audioStream;
    public int controlType;
    public int currentVolume;
    public int maxVolume;
    public int volumeType;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$1 */
    static class C05181 implements Creator<ParcelableVolumeInfo> {
        C05181() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1921a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m1922a(i);
        }

        /* renamed from: a */
        public ParcelableVolumeInfo m1921a(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: a */
        public ParcelableVolumeInfo[] m1922a(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.volumeType = i;
        this.audioStream = i2;
        this.controlType = i3;
        this.maxVolume = i4;
        this.currentVolume = i5;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.volumeType = parcel.readInt();
        this.controlType = parcel.readInt();
        this.maxVolume = parcel.readInt();
        this.currentVolume = parcel.readInt();
        this.audioStream = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.volumeType);
        parcel.writeInt(this.controlType);
        parcel.writeInt(this.maxVolume);
        parcel.writeInt(this.currentVolume);
        parcel.writeInt(this.audioStream);
    }
}
