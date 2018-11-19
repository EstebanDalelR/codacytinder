package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

public abstract class ShareMedia implements ShareModel {
    private final Bundle params;

    public enum Type {
        PHOTO,
        VIDEO
    }

    /* renamed from: com.facebook.share.model.ShareMedia$a */
    public static abstract class C4223a<M extends ShareMedia, B extends C4223a> implements ShareModelBuilder<M, B> {
        /* renamed from: a */
        private Bundle f13495a = new Bundle();

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return mo3710a((ShareMedia) shareModel);
        }

        @Deprecated
        /* renamed from: a */
        public B m16752a(Bundle bundle) {
            this.f13495a.putAll(bundle);
            return this;
        }

        /* renamed from: a */
        public B mo3710a(M m) {
            return m == null ? this : m16752a(m.getParameters());
        }

        /* renamed from: a */
        static List<ShareMedia> m16751a(Parcel parcel) {
            parcel = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
            List<ShareMedia> arrayList = new ArrayList(parcel.length);
            for (Object obj : parcel) {
                arrayList.add((ShareMedia) obj);
            }
            return arrayList;
        }
    }

    public int describeContents() {
        return 0;
    }

    public abstract Type getMediaType();

    protected ShareMedia(C4223a c4223a) {
        this.params = new Bundle(c4223a.f13495a);
    }

    ShareMedia(Parcel parcel) {
        this.params = parcel.readBundle();
    }

    @Deprecated
    public Bundle getParameters() {
        return new Bundle(this.params);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.params);
    }
}
