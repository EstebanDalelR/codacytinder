package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.C4221a;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

public class ShareFeedContent extends ShareContent<ShareFeedContent, C4355a> {
    public static final Creator<ShareFeedContent> CREATOR = new C18281();
    private final String link;
    private final String linkCaption;
    private final String linkDescription;
    private final String linkName;
    private final String mediaSource;
    private final String picture;
    private final String toId;

    /* renamed from: com.facebook.share.internal.ShareFeedContent$1 */
    static class C18281 implements Creator<ShareFeedContent> {
        C18281() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6348a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6349a(i);
        }

        /* renamed from: a */
        public ShareFeedContent m6348a(Parcel parcel) {
            return new ShareFeedContent(parcel);
        }

        /* renamed from: a */
        public ShareFeedContent[] m6349a(int i) {
            return new ShareFeedContent[i];
        }
    }

    /* renamed from: com.facebook.share.internal.ShareFeedContent$a */
    public static final class C4355a extends C4221a<ShareFeedContent, C4355a> {
        /* renamed from: a */
        private String f14309a;
        /* renamed from: b */
        private String f14310b;
        /* renamed from: c */
        private String f14311c;
        /* renamed from: d */
        private String f14312d;
        /* renamed from: e */
        private String f14313e;
        /* renamed from: f */
        private String f14314f;
        /* renamed from: g */
        private String f14315g;

        public /* synthetic */ Object build() {
            return m17805a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m17803a((ShareFeedContent) shareModel);
        }

        /* renamed from: a */
        public C4355a m17804a(String str) {
            this.f14309a = str;
            return this;
        }

        /* renamed from: b */
        public C4355a m17807b(String str) {
            this.f14310b = str;
            return this;
        }

        /* renamed from: c */
        public C4355a m17808c(String str) {
            this.f14311c = str;
            return this;
        }

        /* renamed from: d */
        public C4355a m17809d(String str) {
            this.f14312d = str;
            return this;
        }

        /* renamed from: e */
        public C4355a m17810e(String str) {
            this.f14313e = str;
            return this;
        }

        /* renamed from: f */
        public C4355a m17811f(String str) {
            this.f14314f = str;
            return this;
        }

        /* renamed from: g */
        public C4355a m17812g(String str) {
            this.f14315g = str;
            return this;
        }

        /* renamed from: a */
        public ShareFeedContent m17805a() {
            return new ShareFeedContent();
        }

        /* renamed from: a */
        public C4355a m17803a(ShareFeedContent shareFeedContent) {
            if (shareFeedContent == null) {
                return this;
            }
            return ((C4355a) super.mo3707a((ShareContent) shareFeedContent)).m17804a(shareFeedContent.getToId()).m17807b(shareFeedContent.getLink()).m17808c(shareFeedContent.getLinkName()).m17809d(shareFeedContent.getLinkCaption()).m17810e(shareFeedContent.getLinkDescription()).m17811f(shareFeedContent.getPicture()).m17812g(shareFeedContent.getMediaSource());
        }
    }

    public int describeContents() {
        return 0;
    }

    private ShareFeedContent(C4355a c4355a) {
        super((C4221a) c4355a);
        this.toId = c4355a.f14309a;
        this.link = c4355a.f14310b;
        this.linkName = c4355a.f14311c;
        this.linkCaption = c4355a.f14312d;
        this.linkDescription = c4355a.f14313e;
        this.picture = c4355a.f14314f;
        this.mediaSource = c4355a.f14315g;
    }

    ShareFeedContent(Parcel parcel) {
        super(parcel);
        this.toId = parcel.readString();
        this.link = parcel.readString();
        this.linkName = parcel.readString();
        this.linkCaption = parcel.readString();
        this.linkDescription = parcel.readString();
        this.picture = parcel.readString();
        this.mediaSource = parcel.readString();
    }

    public String getToId() {
        return this.toId;
    }

    public String getLink() {
        return this.link;
    }

    public String getLinkName() {
        return this.linkName;
    }

    public String getLinkCaption() {
        return this.linkCaption;
    }

    public String getLinkDescription() {
        return this.linkDescription;
    }

    public String getPicture() {
        return this.picture;
    }

    public String getMediaSource() {
        return this.mediaSource;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.toId);
        parcel.writeString(this.link);
        parcel.writeString(this.linkName);
        parcel.writeString(this.linkCaption);
        parcel.writeString(this.linkDescription);
        parcel.writeString(this.picture);
        parcel.writeString(this.mediaSource);
    }
}
