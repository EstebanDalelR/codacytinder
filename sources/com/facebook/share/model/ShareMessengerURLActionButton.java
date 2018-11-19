package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.share.model.ShareMessengerActionButton.C4224a;

public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public static final Creator<ShareMessengerURLActionButton> CREATOR = new C18521();
    private final Uri fallbackUrl;
    private final boolean isMessengerExtensionURL;
    private final boolean shouldHideWebviewShareButton;
    private final Uri url;
    private final WebviewHeightRatio webviewHeightRatio;

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$1 */
    static class C18521 implements Creator<ShareMessengerURLActionButton> {
        C18521() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6505a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6506a(i);
        }

        /* renamed from: a */
        public ShareMessengerURLActionButton m6505a(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }

        /* renamed from: a */
        public ShareMessengerURLActionButton[] m6506a(int i) {
            return new ShareMessengerURLActionButton[i];
        }
    }

    public enum WebviewHeightRatio {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact
    }

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$a */
    public static final class C4362a extends C4224a<ShareMessengerURLActionButton, C4362a> {
        /* renamed from: a */
        private Uri f14334a;
        /* renamed from: b */
        private boolean f14335b;
        /* renamed from: c */
        private Uri f14336c;
        /* renamed from: d */
        private WebviewHeightRatio f14337d;
        /* renamed from: e */
        private boolean f14338e;

        public /* synthetic */ Object build() {
            return m17875a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m17873a((ShareMessengerURLActionButton) shareModel);
        }

        /* renamed from: a */
        public C4362a m17871a(@Nullable Uri uri) {
            this.f14334a = uri;
            return this;
        }

        /* renamed from: a */
        public C4362a m17874a(boolean z) {
            this.f14335b = z;
            return this;
        }

        /* renamed from: b */
        public C4362a m17876b(@Nullable Uri uri) {
            this.f14336c = uri;
            return this;
        }

        /* renamed from: a */
        public C4362a m17872a(WebviewHeightRatio webviewHeightRatio) {
            this.f14337d = webviewHeightRatio;
            return this;
        }

        /* renamed from: b */
        public C4362a m17877b(boolean z) {
            this.f14338e = z;
            return this;
        }

        /* renamed from: a */
        public C4362a m17873a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
            if (shareMessengerURLActionButton == null) {
                return this;
            }
            return m17871a(shareMessengerURLActionButton.getUrl()).m17874a(shareMessengerURLActionButton.getIsMessengerExtensionURL()).m17876b(shareMessengerURLActionButton.getFallbackUrl()).m17872a(shareMessengerURLActionButton.getWebviewHeightRatio()).m17877b(shareMessengerURLActionButton.getShouldHideWebviewShareButton());
        }

        /* renamed from: a */
        public ShareMessengerURLActionButton m17875a() {
            return new ShareMessengerURLActionButton();
        }
    }

    private ShareMessengerURLActionButton(C4362a c4362a) {
        super((C4224a) c4362a);
        this.url = c4362a.f14334a;
        this.isMessengerExtensionURL = c4362a.f14335b;
        this.fallbackUrl = c4362a.f14336c;
        this.webviewHeightRatio = c4362a.f14337d;
        this.shouldHideWebviewShareButton = c4362a.f14338e;
    }

    ShareMessengerURLActionButton(Parcel parcel) {
        super(parcel);
        this.url = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        boolean z = false;
        this.isMessengerExtensionURL = parcel.readByte() != (byte) 0;
        this.fallbackUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.webviewHeightRatio = (WebviewHeightRatio) parcel.readSerializable();
        if (parcel.readByte() != null) {
            z = true;
        }
        this.shouldHideWebviewShareButton = z;
    }

    public Uri getUrl() {
        return this.url;
    }

    public boolean getIsMessengerExtensionURL() {
        return this.isMessengerExtensionURL;
    }

    @Nullable
    public Uri getFallbackUrl() {
        return this.fallbackUrl;
    }

    @Nullable
    public WebviewHeightRatio getWebviewHeightRatio() {
        return this.webviewHeightRatio;
    }

    public boolean getShouldHideWebviewShareButton() {
        return this.shouldHideWebviewShareButton;
    }
}
