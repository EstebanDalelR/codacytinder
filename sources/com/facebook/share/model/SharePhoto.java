package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.facebook.share.model.ShareMedia.C4223a;
import com.facebook.share.model.ShareMedia.Type;
import java.util.ArrayList;
import java.util.List;

public final class SharePhoto extends ShareMedia {
    public static final Creator<SharePhoto> CREATOR = new C18561();
    private final Bitmap bitmap;
    private final String caption;
    private final Uri imageUrl;
    private final boolean userGenerated;

    /* renamed from: com.facebook.share.model.SharePhoto$1 */
    static class C18561 implements Creator<SharePhoto> {
        C18561() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6513a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6514a(i);
        }

        /* renamed from: a */
        public SharePhoto m6513a(Parcel parcel) {
            return new SharePhoto(parcel);
        }

        /* renamed from: a */
        public SharePhoto[] m6514a(int i) {
            return new SharePhoto[i];
        }
    }

    /* renamed from: com.facebook.share.model.SharePhoto$a */
    public static final class C4366a extends C4223a<SharePhoto, C4366a> {
        /* renamed from: a */
        private Bitmap f14341a;
        /* renamed from: b */
        private Uri f14342b;
        /* renamed from: c */
        private boolean f14343c;
        /* renamed from: d */
        private String f14344d;

        public /* synthetic */ Object build() {
            return m17906c();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m17901a((SharePhoto) shareModel);
        }

        /* renamed from: a */
        public C4366a m17899a(@Nullable Bitmap bitmap) {
            this.f14341a = bitmap;
            return this;
        }

        /* renamed from: a */
        public C4366a m17900a(@Nullable Uri uri) {
            this.f14342b = uri;
            return this;
        }

        /* renamed from: a */
        public C4366a m17903a(boolean z) {
            this.f14343c = z;
            return this;
        }

        /* renamed from: a */
        public C4366a m17902a(@Nullable String str) {
            this.f14344d = str;
            return this;
        }

        /* renamed from: a */
        Uri m17897a() {
            return this.f14342b;
        }

        /* renamed from: b */
        Bitmap m17904b() {
            return this.f14341a;
        }

        /* renamed from: c */
        public SharePhoto m17906c() {
            return new SharePhoto();
        }

        /* renamed from: a */
        public C4366a m17901a(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                return this;
            }
            return ((C4366a) super.mo3710a((ShareMedia) sharePhoto)).m17899a(sharePhoto.getBitmap()).m17900a(sharePhoto.getImageUrl()).m17903a(sharePhoto.getUserGenerated()).m17902a(sharePhoto.getCaption());
        }

        /* renamed from: b */
        C4366a m17905b(Parcel parcel) {
            return m17901a((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        /* renamed from: a */
        static void m17892a(Parcel parcel, int i, List<SharePhoto> list) {
            Parcelable[] parcelableArr = new ShareMedia[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                parcelableArr[i2] = (ShareMedia) list.get(i2);
            }
            parcel.writeParcelableArray(parcelableArr, i);
        }

        /* renamed from: c */
        static List<SharePhoto> m17894c(Parcel parcel) {
            Parcel<ShareMedia> a = C4223a.m16751a(parcel);
            List<SharePhoto> arrayList = new ArrayList();
            for (ShareMedia shareMedia : a) {
                if (shareMedia instanceof SharePhoto) {
                    arrayList.add((SharePhoto) shareMedia);
                }
            }
            return arrayList;
        }
    }

    public int describeContents() {
        return 0;
    }

    private SharePhoto(C4366a c4366a) {
        super((C4223a) c4366a);
        this.bitmap = c4366a.f14341a;
        this.imageUrl = c4366a.f14342b;
        this.userGenerated = c4366a.f14343c;
        this.caption = c4366a.f14344d;
    }

    SharePhoto(Parcel parcel) {
        super(parcel);
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.userGenerated = parcel.readByte() != (byte) 0;
        this.caption = parcel.readString();
    }

    @Nullable
    public Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    public Uri getImageUrl() {
        return this.imageUrl;
    }

    public boolean getUserGenerated() {
        return this.userGenerated;
    }

    public String getCaption() {
        return this.caption;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.bitmap, 0);
        parcel.writeParcelable(this.imageUrl, 0);
        parcel.writeByte((byte) this.userGenerated);
        parcel.writeString(this.caption);
    }

    public Type getMediaType() {
        return Type.PHOTO;
    }
}
