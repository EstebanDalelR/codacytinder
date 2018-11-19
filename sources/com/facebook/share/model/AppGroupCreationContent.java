package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class AppGroupCreationContent implements ShareModel {
    public static final Creator<AppGroupCreationContent> CREATOR = new C18401();
    private final String description;
    private final String name;
    private AppGroupPrivacy privacy;

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$1 */
    static class C18401 implements Creator<AppGroupCreationContent> {
        C18401() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6481a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6482a(i);
        }

        /* renamed from: a */
        public AppGroupCreationContent m6481a(Parcel parcel) {
            return new AppGroupCreationContent(parcel);
        }

        /* renamed from: a */
        public AppGroupCreationContent[] m6482a(int i) {
            return new AppGroupCreationContent[i];
        }
    }

    public enum AppGroupPrivacy {
        Open,
        Closed
    }

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$a */
    public static class C4217a implements ShareModelBuilder<AppGroupCreationContent, C4217a> {
        /* renamed from: a */
        private String f13475a;
        /* renamed from: b */
        private String f13476b;
        /* renamed from: c */
        private AppGroupPrivacy f13477c;

        public /* synthetic */ Object build() {
            return m16703a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m16701a((AppGroupCreationContent) shareModel);
        }

        /* renamed from: a */
        public C4217a m16702a(String str) {
            this.f13475a = str;
            return this;
        }

        /* renamed from: b */
        public C4217a m16704b(String str) {
            this.f13476b = str;
            return this;
        }

        /* renamed from: a */
        public C4217a m16700a(AppGroupPrivacy appGroupPrivacy) {
            this.f13477c = appGroupPrivacy;
            return this;
        }

        /* renamed from: a */
        public AppGroupCreationContent m16703a() {
            return new AppGroupCreationContent();
        }

        /* renamed from: a */
        public C4217a m16701a(AppGroupCreationContent appGroupCreationContent) {
            if (appGroupCreationContent == null) {
                return this;
            }
            return m16702a(appGroupCreationContent.getName()).m16704b(appGroupCreationContent.getDescription()).m16700a(appGroupCreationContent.getAppGroupPrivacy());
        }
    }

    public int describeContents() {
        return 0;
    }

    private AppGroupCreationContent(C4217a c4217a) {
        this.name = c4217a.f13475a;
        this.description = c4217a.f13476b;
        this.privacy = c4217a.f13477c;
    }

    AppGroupCreationContent(Parcel parcel) {
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.privacy = (AppGroupPrivacy) parcel.readSerializable();
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public AppGroupPrivacy getAppGroupPrivacy() {
        return this.privacy;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeSerializable(this.privacy);
    }
}
