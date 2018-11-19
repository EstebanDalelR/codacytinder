package com.facebook.share.model;

import android.os.Parcel;
import android.support.annotation.Nullable;

public abstract class ShareMessengerActionButton implements ShareModel {
    private final String title;

    /* renamed from: com.facebook.share.model.ShareMessengerActionButton$a */
    public static abstract class C4224a<M extends ShareMessengerActionButton, B extends C4224a> implements ShareModelBuilder<M, B> {
        /* renamed from: a */
        private String f13496a;

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return mo3708a((ShareMessengerActionButton) shareModel);
        }

        /* renamed from: a */
        public B m16756a(@Nullable String str) {
            this.f13496a = str;
            return this;
        }

        /* renamed from: a */
        public B mo3708a(M m) {
            return m == null ? this : m16756a(m.getTitle());
        }
    }

    public int describeContents() {
        return 0;
    }

    protected ShareMessengerActionButton(C4224a c4224a) {
        this.title = c4224a.f13496a;
    }

    ShareMessengerActionButton(Parcel parcel) {
        this.title = parcel.readString();
    }

    public String getTitle() {
        return this.title;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
    }
}
