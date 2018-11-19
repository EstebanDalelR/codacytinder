package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.share.model.ShareMedia.C4223a;
import com.facebook.share.model.ShareMedia.Type;

public final class ShareVideo extends ShareMedia {
    public static final Creator<ShareVideo> CREATOR = new C18581();
    private final Uri localUrl;

    /* renamed from: com.facebook.share.model.ShareVideo$1 */
    static class C18581 implements Creator<ShareVideo> {
        C18581() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6517a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6518a(i);
        }

        /* renamed from: a */
        public ShareVideo m6517a(Parcel parcel) {
            return new ShareVideo(parcel);
        }

        /* renamed from: a */
        public ShareVideo[] m6518a(int i) {
            return new ShareVideo[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareVideo$a */
    public static final class C4368a extends C4223a<ShareVideo, C4368a> {
        /* renamed from: a */
        private Uri f14346a;

        public /* synthetic */ Object build() {
            return m17918a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m17917a((ShareVideo) shareModel);
        }

        /* renamed from: a */
        public C4368a m17916a(@Nullable Uri uri) {
            this.f14346a = uri;
            return this;
        }

        /* renamed from: a */
        public ShareVideo m17918a() {
            return new ShareVideo();
        }

        /* renamed from: a */
        public C4368a m17917a(ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            return ((C4368a) super.mo3710a((ShareMedia) shareVideo)).m17916a(shareVideo.getLocalUrl());
        }

        /* renamed from: b */
        C4368a m17919b(Parcel parcel) {
            return m17917a((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }
    }

    public int describeContents() {
        return 0;
    }

    private ShareVideo(C4368a c4368a) {
        super((C4223a) c4368a);
        this.localUrl = c4368a.f14346a;
    }

    ShareVideo(Parcel parcel) {
        super(parcel);
        this.localUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    @Nullable
    public Uri getLocalUrl() {
        return this.localUrl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.localUrl, 0);
    }

    public Type getMediaType() {
        return Type.VIDEO;
    }
}
