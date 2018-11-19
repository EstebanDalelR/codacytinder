package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.share.model.ShareContent.C4221a;
import com.facebook.share.model.SharePhoto.C4366a;
import com.facebook.share.model.ShareVideo.C4368a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class ShareMediaContent extends ShareContent<ShareMediaContent, C4358a> {
    public static final Creator<ShareMediaContent> CREATOR = new C18471();
    private final List<ShareMedia> media;

    /* renamed from: com.facebook.share.model.ShareMediaContent$1 */
    static class C18471 implements Creator<ShareMediaContent> {
        C18471() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6495a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6496a(i);
        }

        /* renamed from: a */
        public ShareMediaContent m6495a(Parcel parcel) {
            return new ShareMediaContent(parcel);
        }

        /* renamed from: a */
        public ShareMediaContent[] m6496a(int i) {
            return new ShareMediaContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMediaContent$a */
    public static class C4358a extends C4221a<ShareMediaContent, C4358a> {
        /* renamed from: a */
        private final List<ShareMedia> f14324a = new ArrayList();

        public /* synthetic */ Object build() {
            return m17836a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m17835a((ShareMediaContent) shareModel);
        }

        /* renamed from: a */
        public C4358a m17834a(@Nullable ShareMedia shareMedia) {
            if (shareMedia != null) {
                if (shareMedia instanceof SharePhoto) {
                    shareMedia = new C4366a().m17901a((SharePhoto) shareMedia).m17906c();
                } else if (shareMedia instanceof ShareVideo) {
                    shareMedia = new C4368a().m17917a((ShareVideo) shareMedia).m17918a();
                } else {
                    throw new IllegalArgumentException("medium must be either a SharePhoto or ShareVideo");
                }
                this.f14324a.add(shareMedia);
            }
            return this;
        }

        /* renamed from: b */
        public C4358a m17837b(@Nullable List<ShareMedia> list) {
            if (list != null) {
                for (ShareMedia a : list) {
                    m17834a(a);
                }
            }
            return this;
        }

        /* renamed from: a */
        public ShareMediaContent m17836a() {
            return new ShareMediaContent();
        }

        /* renamed from: a */
        public C4358a m17835a(ShareMediaContent shareMediaContent) {
            if (shareMediaContent == null) {
                return this;
            }
            return ((C4358a) super.mo3707a((ShareContent) shareMediaContent)).m17837b(shareMediaContent.getMedia());
        }
    }

    public int describeContents() {
        return 0;
    }

    private ShareMediaContent(C4358a c4358a) {
        super((C4221a) c4358a);
        this.media = Collections.unmodifiableList(c4358a.f14324a);
    }

    ShareMediaContent(Parcel parcel) {
        super(parcel);
        this.media = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }

    @Nullable
    public List<ShareMedia> getMedia() {
        return this.media;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((ShareMedia[]) this.media.toArray(), i);
    }
}
