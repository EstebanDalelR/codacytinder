package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.share.model.ShareContent.C4221a;
import com.facebook.share.model.ShareOpenGraphAction.C4363a;

public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, C4364a> {
    public static final Creator<ShareOpenGraphContent> CREATOR = new C18541();
    private final ShareOpenGraphAction action;
    private final String previewPropertyName;

    /* renamed from: com.facebook.share.model.ShareOpenGraphContent$1 */
    static class C18541 implements Creator<ShareOpenGraphContent> {
        C18541() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6509a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6510a(i);
        }

        /* renamed from: a */
        public ShareOpenGraphContent m6509a(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }

        /* renamed from: a */
        public ShareOpenGraphContent[] m6510a(int i) {
            return new ShareOpenGraphContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareOpenGraphContent$a */
    public static final class C4364a extends C4221a<ShareOpenGraphContent, C4364a> {
        /* renamed from: a */
        private ShareOpenGraphAction f14339a;
        /* renamed from: b */
        private String f14340b;

        public /* synthetic */ Object build() {
            return m17889a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m17887a((ShareOpenGraphContent) shareModel);
        }

        /* renamed from: a */
        public C4364a m17886a(@Nullable ShareOpenGraphAction shareOpenGraphAction) {
            if (shareOpenGraphAction == null) {
                shareOpenGraphAction = null;
            } else {
                shareOpenGraphAction = new C4363a().m17879a(shareOpenGraphAction).m17881a();
            }
            this.f14339a = shareOpenGraphAction;
            return this;
        }

        /* renamed from: a */
        public C4364a m17888a(@Nullable String str) {
            this.f14340b = str;
            return this;
        }

        /* renamed from: a */
        public ShareOpenGraphContent m17889a() {
            return new ShareOpenGraphContent();
        }

        /* renamed from: a */
        public C4364a m17887a(ShareOpenGraphContent shareOpenGraphContent) {
            if (shareOpenGraphContent == null) {
                return this;
            }
            return ((C4364a) super.mo3707a((ShareContent) shareOpenGraphContent)).m17886a(shareOpenGraphContent.getAction()).m17888a(shareOpenGraphContent.getPreviewPropertyName());
        }
    }

    public int describeContents() {
        return 0;
    }

    private ShareOpenGraphContent(C4364a c4364a) {
        super((C4221a) c4364a);
        this.action = c4364a.f14339a;
        this.previewPropertyName = c4364a.f14340b;
    }

    ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.action = new C4363a().m17878a(parcel).m17881a();
        this.previewPropertyName = parcel.readString();
    }

    @Nullable
    public ShareOpenGraphAction getAction() {
        return this.action;
    }

    @Nullable
    public String getPreviewPropertyName() {
        return this.previewPropertyName;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.action, 0);
        parcel.writeString(this.previewPropertyName);
    }
}
