package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

@Deprecated
public class LikeContent implements ShareModel {
    @Deprecated
    public static final Creator<LikeContent> CREATOR = new C18271();
    private final String objectId;
    private final String objectType;

    /* renamed from: com.facebook.share.internal.LikeContent$1 */
    static class C18271 implements Creator<LikeContent> {
        C18271() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6342a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6343a(i);
        }

        /* renamed from: a */
        public LikeContent m6342a(Parcel parcel) {
            return new LikeContent(parcel);
        }

        /* renamed from: a */
        public LikeContent[] m6343a(int i) {
            return new LikeContent[i];
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.internal.LikeContent$a */
    public static class C4215a implements ShareModelBuilder<LikeContent, C4215a> {
        /* renamed from: a */
        private String f13472a;
        /* renamed from: b */
        private String f13473b;

        @Deprecated
        public /* synthetic */ Object build() {
            return m16685a();
        }

        @Deprecated
        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m16683a((LikeContent) shareModel);
        }

        @Deprecated
        /* renamed from: a */
        public C4215a m16684a(String str) {
            this.f13472a = str;
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public C4215a m16686b(String str) {
            this.f13473b = str;
            return this;
        }

        @Deprecated
        /* renamed from: a */
        public LikeContent m16685a() {
            return new LikeContent();
        }

        @Deprecated
        /* renamed from: a */
        public C4215a m16683a(LikeContent likeContent) {
            if (likeContent == null) {
                return this;
            }
            return m16684a(likeContent.getObjectId()).m16686b(likeContent.getObjectType());
        }
    }

    @Deprecated
    public int describeContents() {
        return 0;
    }

    private LikeContent(C4215a c4215a) {
        this.objectId = c4215a.f13472a;
        this.objectType = c4215a.f13473b;
    }

    @Deprecated
    LikeContent(Parcel parcel) {
        this.objectId = parcel.readString();
        this.objectType = parcel.readString();
    }

    @Deprecated
    public String getObjectId() {
        return this.objectId;
    }

    @Deprecated
    public String getObjectType() {
        return this.objectType;
    }

    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.objectId);
        parcel.writeString(this.objectType);
    }
}
