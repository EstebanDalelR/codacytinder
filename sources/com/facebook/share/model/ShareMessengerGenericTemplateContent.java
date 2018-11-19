package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareContent.C4221a;

public final class ShareMessengerGenericTemplateContent extends ShareContent<ShareMessengerGenericTemplateContent, C4359a> {
    public static final Creator<ShareMessengerGenericTemplateContent> CREATOR = new C18481();
    private final ShareMessengerGenericTemplateElement genericTemplateElement;
    private final ImageAspectRatio imageAspectRatio;
    private final boolean isSharable;

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateContent$1 */
    static class C18481 implements Creator<ShareMessengerGenericTemplateContent> {
        C18481() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6497a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6498a(i);
        }

        /* renamed from: a */
        public ShareMessengerGenericTemplateContent m6497a(Parcel parcel) {
            return new ShareMessengerGenericTemplateContent(parcel);
        }

        /* renamed from: a */
        public ShareMessengerGenericTemplateContent[] m6498a(int i) {
            return new ShareMessengerGenericTemplateContent[i];
        }
    }

    public enum ImageAspectRatio {
        HORIZONTAL,
        SQUARE
    }

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateContent$a */
    public static class C4359a extends C4221a<ShareMessengerGenericTemplateContent, C4359a> {
        /* renamed from: a */
        private boolean f14325a;
        /* renamed from: b */
        private ImageAspectRatio f14326b;
        /* renamed from: c */
        private ShareMessengerGenericTemplateElement f14327c;

        public /* synthetic */ Object build() {
            return m17846a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m17843a((ShareMessengerGenericTemplateContent) shareModel);
        }

        /* renamed from: a */
        public C4359a m17845a(boolean z) {
            this.f14325a = z;
            return this;
        }

        /* renamed from: a */
        public C4359a m17842a(ImageAspectRatio imageAspectRatio) {
            this.f14326b = imageAspectRatio;
            return this;
        }

        /* renamed from: a */
        public C4359a m17844a(ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) {
            this.f14327c = shareMessengerGenericTemplateElement;
            return this;
        }

        /* renamed from: a */
        public ShareMessengerGenericTemplateContent m17846a() {
            return new ShareMessengerGenericTemplateContent(this);
        }

        /* renamed from: a */
        public C4359a m17843a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
            if (shareMessengerGenericTemplateContent == null) {
                return this;
            }
            return ((C4359a) super.mo3707a((ShareContent) shareMessengerGenericTemplateContent)).m17845a(shareMessengerGenericTemplateContent.getIsSharable()).m17842a(shareMessengerGenericTemplateContent.getImageAspectRatio()).m17844a(shareMessengerGenericTemplateContent.getGenericTemplateElement());
        }
    }

    public int describeContents() {
        return 0;
    }

    protected ShareMessengerGenericTemplateContent(C4359a c4359a) {
        super((C4221a) c4359a);
        this.isSharable = c4359a.f14325a;
        this.imageAspectRatio = c4359a.f14326b;
        this.genericTemplateElement = c4359a.f14327c;
    }

    ShareMessengerGenericTemplateContent(Parcel parcel) {
        super(parcel);
        this.isSharable = parcel.readByte() != (byte) 0;
        this.imageAspectRatio = (ImageAspectRatio) parcel.readSerializable();
        this.genericTemplateElement = (ShareMessengerGenericTemplateElement) parcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader());
    }

    public boolean getIsSharable() {
        return this.isSharable;
    }

    public ImageAspectRatio getImageAspectRatio() {
        return this.imageAspectRatio;
    }

    public ShareMessengerGenericTemplateElement getGenericTemplateElement() {
        return this.genericTemplateElement;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte((byte) this.isSharable);
        parcel.writeSerializable(this.imageAspectRatio);
        parcel.writeParcelable(this.genericTemplateElement, i);
    }
}
