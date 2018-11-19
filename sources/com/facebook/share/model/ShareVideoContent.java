package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.share.model.ShareContent.C4221a;
import com.facebook.share.model.SharePhoto.C4366a;
import com.facebook.share.model.ShareVideo.C4368a;

public final class ShareVideoContent extends ShareContent<ShareVideoContent, C4369a> implements ShareModel {
    public static final Creator<ShareVideoContent> CREATOR = new C18591();
    private final String contentDescription;
    private final String contentTitle;
    private final SharePhoto previewPhoto;
    private final ShareVideo video;

    /* renamed from: com.facebook.share.model.ShareVideoContent$1 */
    static class C18591 implements Creator<ShareVideoContent> {
        C18591() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6519a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6520a(i);
        }

        /* renamed from: a */
        public ShareVideoContent m6519a(Parcel parcel) {
            return new ShareVideoContent(parcel);
        }

        /* renamed from: a */
        public ShareVideoContent[] m6520a(int i) {
            return new ShareVideoContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareVideoContent$a */
    public static final class C4369a extends C4221a<ShareVideoContent, C4369a> {
        /* renamed from: a */
        private String f14347a;
        /* renamed from: b */
        private String f14348b;
        /* renamed from: c */
        private SharePhoto f14349c;
        /* renamed from: d */
        private ShareVideo f14350d;

        public /* synthetic */ Object build() {
            return m17929a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m17927a((ShareVideoContent) shareModel);
        }

        /* renamed from: a */
        public C4369a m17928a(@Nullable String str) {
            this.f14347a = str;
            return this;
        }

        /* renamed from: b */
        public C4369a m17930b(@Nullable String str) {
            this.f14348b = str;
            return this;
        }

        /* renamed from: a */
        public C4369a m17925a(@Nullable SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                sharePhoto = null;
            } else {
                sharePhoto = new C4366a().m17901a(sharePhoto).m17906c();
            }
            this.f14349c = sharePhoto;
            return this;
        }

        /* renamed from: a */
        public C4369a m17926a(@Nullable ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            this.f14350d = new C4368a().m17917a(shareVideo).m17918a();
            return this;
        }

        /* renamed from: a */
        public ShareVideoContent m17929a() {
            return new ShareVideoContent();
        }

        /* renamed from: a */
        public C4369a m17927a(ShareVideoContent shareVideoContent) {
            if (shareVideoContent == null) {
                return this;
            }
            return ((C4369a) super.mo3707a((ShareContent) shareVideoContent)).m17928a(shareVideoContent.getContentDescription()).m17930b(shareVideoContent.getContentTitle()).m17925a(shareVideoContent.getPreviewPhoto()).m17926a(shareVideoContent.getVideo());
        }
    }

    public int describeContents() {
        return 0;
    }

    private ShareVideoContent(C4369a c4369a) {
        super((C4221a) c4369a);
        this.contentDescription = c4369a.f14347a;
        this.contentTitle = c4369a.f14348b;
        this.previewPhoto = c4369a.f14349c;
        this.video = c4369a.f14350d;
    }

    ShareVideoContent(Parcel parcel) {
        super(parcel);
        this.contentDescription = parcel.readString();
        this.contentTitle = parcel.readString();
        C4366a b = new C4366a().m17905b(parcel);
        if (b.m17897a() == null) {
            if (b.m17904b() == null) {
                this.previewPhoto = null;
                this.video = new C4368a().m17919b(parcel).m17918a();
            }
        }
        this.previewPhoto = b.m17906c();
        this.video = new C4368a().m17919b(parcel).m17918a();
    }

    @Nullable
    public String getContentDescription() {
        return this.contentDescription;
    }

    @Nullable
    public String getContentTitle() {
        return this.contentTitle;
    }

    @Nullable
    public SharePhoto getPreviewPhoto() {
        return this.previewPhoto;
    }

    @Nullable
    public ShareVideo getVideo() {
        return this.video;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.contentDescription);
        parcel.writeString(this.contentTitle);
        parcel.writeParcelable(this.previewPhoto, 0);
        parcel.writeParcelable(this.video, 0);
    }
}
