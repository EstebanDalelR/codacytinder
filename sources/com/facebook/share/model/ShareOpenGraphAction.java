package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.share.model.ShareOpenGraphValueContainer.C4226a;

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, C4363a> {
    public static final Creator<ShareOpenGraphAction> CREATOR = new C18531();

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$1 */
    static class C18531 implements Creator<ShareOpenGraphAction> {
        C18531() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6507a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6508a(i);
        }

        /* renamed from: a */
        public ShareOpenGraphAction m6507a(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }

        /* renamed from: a */
        public ShareOpenGraphAction[] m6508a(int i) {
            return new ShareOpenGraphAction[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$a */
    public static final class C4363a extends C4226a<ShareOpenGraphAction, C4363a> {
        public /* synthetic */ Object build() {
            return m17881a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m17879a((ShareOpenGraphAction) shareModel);
        }

        /* renamed from: a */
        public C4363a m17880a(String str) {
            m16771a("og:type", str);
            return this;
        }

        /* renamed from: a */
        public ShareOpenGraphAction m17881a() {
            return new ShareOpenGraphAction();
        }

        /* renamed from: a */
        public C4363a m17879a(ShareOpenGraphAction shareOpenGraphAction) {
            if (shareOpenGraphAction == null) {
                return this;
            }
            return ((C4363a) super.mo3709a((ShareOpenGraphValueContainer) shareOpenGraphAction)).m17880a(shareOpenGraphAction.getActionType());
        }

        /* renamed from: a */
        C4363a m17878a(Parcel parcel) {
            return m17879a((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }
    }

    private ShareOpenGraphAction(C4363a c4363a) {
        super((C4226a) c4363a);
    }

    ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }

    @Nullable
    public String getActionType() {
        return getString("og:type");
    }
}
