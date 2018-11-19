package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.util.Log;
import com.facebook.share.model.ShareContent.C4221a;

public final class ShareLinkContent extends ShareContent<ShareLinkContent, C4357a> {
    public static final Creator<ShareLinkContent> CREATOR = new C18461();
    @Deprecated
    private final String contentDescription;
    @Deprecated
    private final String contentTitle;
    @Deprecated
    private final Uri imageUrl;
    private final String quote;

    /* renamed from: com.facebook.share.model.ShareLinkContent$1 */
    static class C18461 implements Creator<ShareLinkContent> {
        C18461() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6493a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6494a(i);
        }

        /* renamed from: a */
        public ShareLinkContent m6493a(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }

        /* renamed from: a */
        public ShareLinkContent[] m6494a(int i) {
            return new ShareLinkContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareLinkContent$a */
    public static final class C4357a extends C4221a<ShareLinkContent, C4357a> {
        /* renamed from: a */
        static final String f14319a = "ShareLinkContent$a";
        @Deprecated
        /* renamed from: b */
        private String f14320b;
        @Deprecated
        /* renamed from: c */
        private String f14321c;
        @Deprecated
        /* renamed from: d */
        private Uri f14322d;
        /* renamed from: e */
        private String f14323e;

        public /* synthetic */ Object build() {
            return m17828a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m17826a((ShareLinkContent) shareModel);
        }

        @Deprecated
        /* renamed from: a */
        public C4357a m17827a(@Nullable String str) {
            Log.w(f14319a, "This method does nothing. ContentDescription is deprecated in Graph API 2.9.");
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public C4357a m17830b(@Nullable String str) {
            Log.w(f14319a, "This method does nothing. ContentTitle is deprecated in Graph API 2.9.");
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public C4357a m17829b(@Nullable Uri uri) {
            Log.w(f14319a, "This method does nothing. ImageUrl is deprecated in Graph API 2.9.");
            return this;
        }

        /* renamed from: c */
        public C4357a m17831c(@Nullable String str) {
            this.f14323e = str;
            return this;
        }

        /* renamed from: a */
        public ShareLinkContent m17828a() {
            return new ShareLinkContent();
        }

        /* renamed from: a */
        public C4357a m17826a(ShareLinkContent shareLinkContent) {
            if (shareLinkContent == null) {
                return this;
            }
            return ((C4357a) super.mo3707a((ShareContent) shareLinkContent)).m17827a(shareLinkContent.getContentDescription()).m17829b(shareLinkContent.getImageUrl()).m17830b(shareLinkContent.getContentTitle()).m17831c(shareLinkContent.getQuote());
        }
    }

    public int describeContents() {
        return 0;
    }

    private ShareLinkContent(C4357a c4357a) {
        super((C4221a) c4357a);
        this.contentDescription = c4357a.f14320b;
        this.contentTitle = c4357a.f14321c;
        this.imageUrl = c4357a.f14322d;
        this.quote = c4357a.f14323e;
    }

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.contentDescription = parcel.readString();
        this.contentTitle = parcel.readString();
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.quote = parcel.readString();
    }

    @Deprecated
    public String getContentDescription() {
        return this.contentDescription;
    }

    @Nullable
    @Deprecated
    public String getContentTitle() {
        return this.contentTitle;
    }

    @Nullable
    @Deprecated
    public Uri getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public String getQuote() {
        return this.quote;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.contentDescription);
        parcel.writeString(this.contentTitle);
        parcel.writeParcelable(this.imageUrl, 0);
        parcel.writeString(this.quote);
    }
}
