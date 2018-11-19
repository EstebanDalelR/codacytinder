package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class ShareHashtag implements ShareModel {
    public static final Creator<ShareHashtag> CREATOR = new C18451();
    private final String hashtag;

    /* renamed from: com.facebook.share.model.ShareHashtag$1 */
    static class C18451 implements Creator<ShareHashtag> {
        C18451() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6491a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6492a(i);
        }

        /* renamed from: a */
        public ShareHashtag m6491a(Parcel parcel) {
            return new ShareHashtag(parcel);
        }

        /* renamed from: a */
        public ShareHashtag[] m6492a(int i) {
            return new ShareHashtag[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareHashtag$a */
    public static class C4222a implements ShareModelBuilder<ShareHashtag, C4222a> {
        /* renamed from: a */
        private String f13494a;

        public /* synthetic */ Object build() {
            return m16749a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m16747a((ShareHashtag) shareModel);
        }

        /* renamed from: a */
        public C4222a m16748a(String str) {
            this.f13494a = str;
            return this;
        }

        /* renamed from: a */
        public C4222a m16747a(ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : m16748a(shareHashtag.getHashtag());
        }

        /* renamed from: a */
        C4222a m16746a(Parcel parcel) {
            return m16747a((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        /* renamed from: a */
        public ShareHashtag m16749a() {
            return new ShareHashtag();
        }
    }

    public int describeContents() {
        return 0;
    }

    private ShareHashtag(C4222a c4222a) {
        this.hashtag = c4222a.f13494a;
    }

    ShareHashtag(Parcel parcel) {
        this.hashtag = parcel.readString();
    }

    public String getHashtag() {
        return this.hashtag;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.hashtag);
    }
}
