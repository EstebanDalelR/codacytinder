package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.share.model.ShareContent.C4221a;
import com.facebook.share.model.SharePhoto.C4366a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SharePhotoContent extends ShareContent<SharePhotoContent, C4367a> {
    public static final Creator<SharePhotoContent> CREATOR = new C18571();
    private final List<SharePhoto> photos;

    /* renamed from: com.facebook.share.model.SharePhotoContent$1 */
    static class C18571 implements Creator<SharePhotoContent> {
        C18571() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6515a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6516a(i);
        }

        /* renamed from: a */
        public SharePhotoContent m6515a(Parcel parcel) {
            return new SharePhotoContent(parcel);
        }

        /* renamed from: a */
        public SharePhotoContent[] m6516a(int i) {
            return new SharePhotoContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.SharePhotoContent$a */
    public static class C4367a extends C4221a<SharePhotoContent, C4367a> {
        /* renamed from: a */
        private final List<SharePhoto> f14345a = new ArrayList();

        public /* synthetic */ Object build() {
            return m17911a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m17910a((SharePhotoContent) shareModel);
        }

        /* renamed from: a */
        public C4367a m17909a(@Nullable SharePhoto sharePhoto) {
            if (sharePhoto != null) {
                this.f14345a.add(new C4366a().m17901a(sharePhoto).m17906c());
            }
            return this;
        }

        /* renamed from: b */
        public C4367a m17912b(@Nullable List<SharePhoto> list) {
            if (list != null) {
                for (SharePhoto a : list) {
                    m17909a(a);
                }
            }
            return this;
        }

        /* renamed from: a */
        public SharePhotoContent m17911a() {
            return new SharePhotoContent();
        }

        /* renamed from: a */
        public C4367a m17910a(SharePhotoContent sharePhotoContent) {
            if (sharePhotoContent == null) {
                return this;
            }
            return ((C4367a) super.mo3707a((ShareContent) sharePhotoContent)).m17912b(sharePhotoContent.getPhotos());
        }

        /* renamed from: c */
        public C4367a m17913c(@Nullable List<SharePhoto> list) {
            this.f14345a.clear();
            m17912b(list);
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    private SharePhotoContent(C4367a c4367a) {
        super((C4221a) c4367a);
        this.photos = Collections.unmodifiableList(c4367a.f14345a);
    }

    SharePhotoContent(Parcel parcel) {
        super(parcel);
        this.photos = Collections.unmodifiableList(C4366a.m17894c(parcel));
    }

    @Nullable
    public List<SharePhoto> getPhotos() {
        return this.photos;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        C4366a.m17892a(parcel, i, this.photos);
    }
}
