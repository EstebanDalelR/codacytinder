package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.support.annotation.Nullable;
import com.facebook.share.model.ShareHashtag.C4222a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent<P extends ShareContent, E extends C4221a> implements ShareModel {
    private final Uri contentUrl;
    private final ShareHashtag hashtag;
    private final String pageId;
    private final List<String> peopleIds;
    private final String placeId;
    private final String ref;

    /* renamed from: com.facebook.share.model.ShareContent$a */
    public static abstract class C4221a<P extends ShareContent, E extends C4221a> implements ShareModelBuilder<P, E> {
        /* renamed from: a */
        private Uri f13488a;
        /* renamed from: b */
        private List<String> f13489b;
        /* renamed from: c */
        private String f13490c;
        /* renamed from: d */
        private String f13491d;
        /* renamed from: e */
        private String f13492e;
        /* renamed from: f */
        private ShareHashtag f13493f;

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return mo3707a((ShareContent) shareModel);
        }

        /* renamed from: a */
        public E m16739a(@Nullable Uri uri) {
            this.f13488a = uri;
            return this;
        }

        /* renamed from: a */
        public E m16741a(@Nullable List<String> list) {
            this.f13489b = list == null ? null : Collections.unmodifiableList(list);
            return this;
        }

        /* renamed from: h */
        public E m16742h(@Nullable String str) {
            this.f13490c = str;
            return this;
        }

        /* renamed from: i */
        public E m16743i(@Nullable String str) {
            this.f13491d = str;
            return this;
        }

        /* renamed from: j */
        public E m16744j(@Nullable String str) {
            this.f13492e = str;
            return this;
        }

        /* renamed from: a */
        public E mo3707a(P p) {
            if (p == null) {
                return this;
            }
            return m16739a(p.getContentUrl()).m16741a(p.getPeopleIds()).m16742h(p.getPlaceId()).m16743i(p.getPageId()).m16744j(p.getRef());
        }
    }

    public int describeContents() {
        return 0;
    }

    protected ShareContent(C4221a c4221a) {
        this.contentUrl = c4221a.f13488a;
        this.peopleIds = c4221a.f13489b;
        this.placeId = c4221a.f13490c;
        this.pageId = c4221a.f13491d;
        this.ref = c4221a.f13492e;
        this.hashtag = c4221a.f13493f;
    }

    protected ShareContent(Parcel parcel) {
        this.contentUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.peopleIds = readUnmodifiableStringList(parcel);
        this.placeId = parcel.readString();
        this.pageId = parcel.readString();
        this.ref = parcel.readString();
        this.hashtag = new C4222a().m16746a(parcel).m16749a();
    }

    @Nullable
    public Uri getContentUrl() {
        return this.contentUrl;
    }

    @Nullable
    public List<String> getPeopleIds() {
        return this.peopleIds;
    }

    @Nullable
    public String getPlaceId() {
        return this.placeId;
    }

    @Nullable
    public String getPageId() {
        return this.pageId;
    }

    @Nullable
    public String getRef() {
        return this.ref;
    }

    @Nullable
    public ShareHashtag getShareHashtag() {
        return this.hashtag;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.contentUrl, 0);
        parcel.writeStringList(this.peopleIds);
        parcel.writeString(this.placeId);
        parcel.writeString(this.pageId);
        parcel.writeString(this.ref);
        parcel.writeParcelable(this.hashtag, 0);
    }

    private List<String> readUnmodifiableStringList(Parcel parcel) {
        List arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        return arrayList.size() == null ? null : Collections.unmodifiableList(arrayList);
    }
}
