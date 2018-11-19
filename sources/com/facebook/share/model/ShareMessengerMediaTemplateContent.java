package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareContent.C4221a;

public final class ShareMessengerMediaTemplateContent extends ShareContent<ShareMessengerMediaTemplateContent, C4360a> {
    public static final Creator<ShareMessengerMediaTemplateContent> CREATOR = new C18501();
    private final String attachmentId;
    private final ShareMessengerActionButton button;
    private final MediaType mediaType;
    private final Uri mediaUrl;

    /* renamed from: com.facebook.share.model.ShareMessengerMediaTemplateContent$1 */
    static class C18501 implements Creator<ShareMessengerMediaTemplateContent> {
        C18501() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6501a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6502a(i);
        }

        /* renamed from: a */
        public ShareMessengerMediaTemplateContent m6501a(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }

        /* renamed from: a */
        public ShareMessengerMediaTemplateContent[] m6502a(int i) {
            return new ShareMessengerMediaTemplateContent[i];
        }
    }

    public enum MediaType {
        IMAGE,
        VIDEO
    }

    /* renamed from: com.facebook.share.model.ShareMessengerMediaTemplateContent$a */
    public static class C4360a extends C4221a<ShareMessengerMediaTemplateContent, C4360a> {
        /* renamed from: a */
        private MediaType f14328a;
        /* renamed from: b */
        private String f14329b;
        /* renamed from: c */
        private Uri f14330c;
        /* renamed from: d */
        private ShareMessengerActionButton f14331d;

        public /* synthetic */ Object build() {
            return m17856a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m17854a((ShareMessengerMediaTemplateContent) shareModel);
        }

        /* renamed from: a */
        public C4360a m17853a(MediaType mediaType) {
            this.f14328a = mediaType;
            return this;
        }

        /* renamed from: a */
        public C4360a m17855a(String str) {
            this.f14329b = str;
            return this;
        }

        /* renamed from: b */
        public C4360a m17857b(Uri uri) {
            this.f14330c = uri;
            return this;
        }

        /* renamed from: a */
        public C4360a m17852a(ShareMessengerActionButton shareMessengerActionButton) {
            this.f14331d = shareMessengerActionButton;
            return this;
        }

        /* renamed from: a */
        public C4360a m17854a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
            if (shareMessengerMediaTemplateContent == null) {
                return this;
            }
            return ((C4360a) super.mo3707a((ShareContent) shareMessengerMediaTemplateContent)).m17853a(shareMessengerMediaTemplateContent.getMediaType()).m17855a(shareMessengerMediaTemplateContent.getAttachmentId()).m17857b(shareMessengerMediaTemplateContent.getMediaUrl()).m17852a(shareMessengerMediaTemplateContent.getButton());
        }

        /* renamed from: a */
        public ShareMessengerMediaTemplateContent m17856a() {
            return new ShareMessengerMediaTemplateContent();
        }
    }

    public int describeContents() {
        return 0;
    }

    private ShareMessengerMediaTemplateContent(C4360a c4360a) {
        super((C4221a) c4360a);
        this.mediaType = c4360a.f14328a;
        this.attachmentId = c4360a.f14329b;
        this.mediaUrl = c4360a.f14330c;
        this.button = c4360a.f14331d;
    }

    ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.mediaType = (MediaType) parcel.readSerializable();
        this.attachmentId = parcel.readString();
        this.mediaUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.button = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public MediaType getMediaType() {
        return this.mediaType;
    }

    public String getAttachmentId() {
        return this.attachmentId;
    }

    public Uri getMediaUrl() {
        return this.mediaUrl;
    }

    public ShareMessengerActionButton getButton() {
        return this.button;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.mediaType);
        parcel.writeString(this.attachmentId);
        parcel.writeParcelable(this.mediaUrl, i);
        parcel.writeParcelable(this.button, i);
    }
}
