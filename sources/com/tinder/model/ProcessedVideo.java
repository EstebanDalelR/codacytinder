package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\b\u0010\u0014\u001a\u00020\bH\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\bH\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006 "}, d2 = {"Lcom/tinder/model/ProcessedVideo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "url", "", "width", "", "height", "(Ljava/lang/String;II)V", "getHeight", "()I", "getUrl", "()Ljava/lang/String;", "getWidth", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "flags", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ProcessedVideo implements Parcelable {
    @NotNull
    private static final Creator<ProcessedVideo> CREATOR = new ProcessedVideo$Companion$CREATOR$1();
    public static final Companion Companion = new Companion();
    private final int height;
    @NotNull
    private final String url;
    private final int width;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/model/ProcessedVideo$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/tinder/model/ProcessedVideo;", "getCREATOR", "()Landroid/os/Parcelable$Creator;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Creator<ProcessedVideo> getCREATOR() {
            return ProcessedVideo.CREATOR;
        }
    }

    @NotNull
    public static /* synthetic */ ProcessedVideo copy$default(ProcessedVideo processedVideo, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = processedVideo.url;
        }
        if ((i3 & 2) != 0) {
            i = processedVideo.width;
        }
        if ((i3 & 4) != 0) {
            i2 = processedVideo.height;
        }
        return processedVideo.copy(str, i, i2);
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    @NotNull
    public final ProcessedVideo copy(@NotNull String str, int i, int i2) {
        C2668g.b(str, "url");
        return new ProcessedVideo(str, i, i2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProcessedVideo) {
            ProcessedVideo processedVideo = (ProcessedVideo) obj;
            if (C2668g.a(this.url, processedVideo.url)) {
                if ((this.width == processedVideo.width ? 1 : null) != null) {
                    if ((this.height == processedVideo.height ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.url;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProcessedVideo(url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", width=");
        stringBuilder.append(this.width);
        stringBuilder.append(", height=");
        stringBuilder.append(this.height);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ProcessedVideo(@NotNull String str, int i, int i2) {
        C2668g.b(str, "url");
        this.url = str;
        this.width = i;
        this.height = i2;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    private ProcessedVideo(Parcel parcel) {
        String readString = parcel.readString();
        C2668g.a(readString, "parcel.readString()");
        this(readString, parcel.readInt(), parcel.readInt());
    }

    public void writeToParcel(@NotNull Parcel parcel, int i) {
        C2668g.b(parcel, "dest");
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}
