package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareContent.C4221a;

public final class ShareMessengerOpenGraphMusicTemplateContent extends ShareContent<ShareMessengerOpenGraphMusicTemplateContent, C4361a> {
    public static final Creator<ShareMessengerOpenGraphMusicTemplateContent> CREATOR = new C18511();
    private final ShareMessengerActionButton button;
    private final Uri url;

    /* renamed from: com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent$1 */
    static class C18511 implements Creator<ShareMessengerOpenGraphMusicTemplateContent> {
        C18511() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6503a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6504a(i);
        }

        /* renamed from: a */
        public ShareMessengerOpenGraphMusicTemplateContent m6503a(Parcel parcel) {
            return new ShareMessengerOpenGraphMusicTemplateContent(parcel);
        }

        /* renamed from: a */
        public ShareMessengerOpenGraphMusicTemplateContent[] m6504a(int i) {
            return new ShareMessengerOpenGraphMusicTemplateContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent$a */
    public static class C4361a extends C4221a<ShareMessengerOpenGraphMusicTemplateContent, C4361a> {
        /* renamed from: a */
        private Uri f14332a;
        /* renamed from: b */
        private ShareMessengerActionButton f14333b;

        public /* synthetic */ Object build() {
            return m17863a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m17862a((ShareMessengerOpenGraphMusicTemplateContent) shareModel);
        }

        /* renamed from: b */
        public C4361a m17864b(Uri uri) {
            this.f14332a = uri;
            return this;
        }

        /* renamed from: a */
        public C4361a m17861a(ShareMessengerActionButton shareMessengerActionButton) {
            this.f14333b = shareMessengerActionButton;
            return this;
        }

        /* renamed from: a */
        public C4361a m17862a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
            if (shareMessengerOpenGraphMusicTemplateContent == null) {
                return this;
            }
            return ((C4361a) super.mo3707a((ShareContent) shareMessengerOpenGraphMusicTemplateContent)).m17864b(shareMessengerOpenGraphMusicTemplateContent.getUrl()).m17861a(shareMessengerOpenGraphMusicTemplateContent.getButton());
        }

        /* renamed from: a */
        public ShareMessengerOpenGraphMusicTemplateContent m17863a() {
            return new ShareMessengerOpenGraphMusicTemplateContent();
        }
    }

    public int describeContents() {
        return 0;
    }

    private ShareMessengerOpenGraphMusicTemplateContent(C4361a c4361a) {
        super((C4221a) c4361a);
        this.url = c4361a.f14332a;
        this.button = c4361a.f14333b;
    }

    ShareMessengerOpenGraphMusicTemplateContent(Parcel parcel) {
        super(parcel);
        this.url = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.button = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public Uri getUrl() {
        return this.url;
    }

    public ShareMessengerActionButton getButton() {
        return this.button;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.url, i);
        parcel.writeParcelable(this.button, i);
    }
}
