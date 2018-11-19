package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareOpenGraphValueContainer.C4226a;

public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer<ShareOpenGraphObject, C4365a> {
    public static final Creator<ShareOpenGraphObject> CREATOR = new C18551();

    /* renamed from: com.facebook.share.model.ShareOpenGraphObject$1 */
    static class C18551 implements Creator<ShareOpenGraphObject> {
        C18551() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6511a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6512a(i);
        }

        /* renamed from: a */
        public ShareOpenGraphObject m6511a(Parcel parcel) {
            return new ShareOpenGraphObject(parcel);
        }

        /* renamed from: a */
        public ShareOpenGraphObject[] m6512a(int i) {
            return new ShareOpenGraphObject[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareOpenGraphObject$a */
    public static final class C4365a extends C4226a<ShareOpenGraphObject, C4365a> {
        public /* synthetic */ Object build() {
            return m17890a();
        }

        /* renamed from: a */
        public ShareOpenGraphObject m17890a() {
            return new ShareOpenGraphObject();
        }
    }

    private ShareOpenGraphObject(C4365a c4365a) {
        super((C4226a) c4365a);
    }

    ShareOpenGraphObject(Parcel parcel) {
        super(parcel);
    }
}
