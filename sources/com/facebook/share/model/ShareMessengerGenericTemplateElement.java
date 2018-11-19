package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerGenericTemplateElement implements ShareModel {
    public static final Creator<ShareMessengerGenericTemplateElement> CREATOR = new C18491();
    private final ShareMessengerActionButton button;
    private final ShareMessengerActionButton defaultAction;
    private final Uri imageUrl;
    private final String subtitle;
    private final String title;

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateElement$1 */
    static class C18491 implements Creator<ShareMessengerGenericTemplateElement> {
        C18491() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6499a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6500a(i);
        }

        /* renamed from: a */
        public ShareMessengerGenericTemplateElement m6499a(Parcel parcel) {
            return new ShareMessengerGenericTemplateElement(parcel);
        }

        /* renamed from: a */
        public ShareMessengerGenericTemplateElement[] m6500a(int i) {
            return new ShareMessengerGenericTemplateElement[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateElement$a */
    public static class C4225a implements ShareModelBuilder<ShareMessengerGenericTemplateElement, C4225a> {
        /* renamed from: a */
        private String f13497a;
        /* renamed from: b */
        private String f13498b;
        /* renamed from: c */
        private Uri f13499c;
        /* renamed from: d */
        private ShareMessengerActionButton f13500d;
        /* renamed from: e */
        private ShareMessengerActionButton f13501e;

        public /* synthetic */ Object build() {
            return m16766a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m16764a((ShareMessengerGenericTemplateElement) shareModel);
        }

        /* renamed from: a */
        public C4225a m16765a(String str) {
            this.f13497a = str;
            return this;
        }

        /* renamed from: b */
        public C4225a m16768b(String str) {
            this.f13498b = str;
            return this;
        }

        /* renamed from: a */
        public C4225a m16762a(Uri uri) {
            this.f13499c = uri;
            return this;
        }

        /* renamed from: a */
        public C4225a m16763a(ShareMessengerActionButton shareMessengerActionButton) {
            this.f13500d = shareMessengerActionButton;
            return this;
        }

        /* renamed from: b */
        public C4225a m16767b(ShareMessengerActionButton shareMessengerActionButton) {
            this.f13501e = shareMessengerActionButton;
            return this;
        }

        /* renamed from: a */
        public ShareMessengerGenericTemplateElement m16766a() {
            return new ShareMessengerGenericTemplateElement();
        }

        /* renamed from: a */
        public C4225a m16764a(ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) {
            if (shareMessengerGenericTemplateElement == null) {
                return this;
            }
            return m16765a(shareMessengerGenericTemplateElement.title).m16768b(shareMessengerGenericTemplateElement.subtitle).m16762a(shareMessengerGenericTemplateElement.imageUrl).m16763a(shareMessengerGenericTemplateElement.defaultAction).m16767b(shareMessengerGenericTemplateElement.button);
        }
    }

    public int describeContents() {
        return 0;
    }

    private ShareMessengerGenericTemplateElement(C4225a c4225a) {
        this.title = c4225a.f13497a;
        this.subtitle = c4225a.f13498b;
        this.imageUrl = c4225a.f13499c;
        this.defaultAction = c4225a.f13500d;
        this.button = c4225a.f13501e;
    }

    ShareMessengerGenericTemplateElement(Parcel parcel) {
        this.title = parcel.readString();
        this.subtitle = parcel.readString();
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.defaultAction = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
        this.button = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public String getTitle() {
        return this.title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public Uri getImageUrl() {
        return this.imageUrl;
    }

    public ShareMessengerActionButton getDefaultAction() {
        return this.defaultAction;
    }

    public ShareMessengerActionButton getButton() {
        return this.button;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.imageUrl, i);
        parcel.writeParcelable(this.defaultAction, i);
        parcel.writeParcelable(this.button, i);
    }
}
