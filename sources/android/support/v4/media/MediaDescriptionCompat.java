package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.media.C0507e.C0506a;
import android.support.v4.media.C2863f.C2862a;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Creator<MediaDescriptionCompat> CREATOR = new C04921();
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
    @RestrictTo({Scope.LIBRARY_GROUP})
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private final CharSequence mDescription;
    private Object mDescriptionObj;
    private final Bundle mExtras;
    private final Bitmap mIcon;
    private final Uri mIconUri;
    private final String mMediaId;
    private final Uri mMediaUri;
    private final CharSequence mSubtitle;
    private final CharSequence mTitle;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$1 */
    static class C04921 implements Creator<MediaDescriptionCompat> {
        C04921() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1838a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m1839a(i);
        }

        /* renamed from: a */
        public MediaDescriptionCompat m1838a(Parcel parcel) {
            if (VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.fromMediaDescription(C0507e.m1880a(parcel));
        }

        /* renamed from: a */
        public MediaDescriptionCompat[] m1839a(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static final class C0493a {
        /* renamed from: a */
        private String f1600a;
        /* renamed from: b */
        private CharSequence f1601b;
        /* renamed from: c */
        private CharSequence f1602c;
        /* renamed from: d */
        private CharSequence f1603d;
        /* renamed from: e */
        private Bitmap f1604e;
        /* renamed from: f */
        private Uri f1605f;
        /* renamed from: g */
        private Bundle f1606g;
        /* renamed from: h */
        private Uri f1607h;

        /* renamed from: a */
        public C0493a m1844a(@Nullable String str) {
            this.f1600a = str;
            return this;
        }

        /* renamed from: a */
        public C0493a m1843a(@Nullable CharSequence charSequence) {
            this.f1601b = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0493a m1847b(@Nullable CharSequence charSequence) {
            this.f1602c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0493a m1848c(@Nullable CharSequence charSequence) {
            this.f1603d = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0493a m1840a(@Nullable Bitmap bitmap) {
            this.f1604e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0493a m1841a(@Nullable Uri uri) {
            this.f1605f = uri;
            return this;
        }

        /* renamed from: a */
        public C0493a m1842a(@Nullable Bundle bundle) {
            this.f1606g = bundle;
            return this;
        }

        /* renamed from: b */
        public C0493a m1846b(@Nullable Uri uri) {
            this.f1607h = uri;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat m1845a() {
            return new MediaDescriptionCompat(this.f1600a, this.f1601b, this.f1602c, this.f1603d, this.f1604e, this.f1605f, this.f1606g, this.f1607h);
        }
    }

    public int describeContents() {
        return 0;
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.mMediaId = str;
        this.mTitle = charSequence;
        this.mSubtitle = charSequence2;
        this.mDescription = charSequence3;
        this.mIcon = bitmap;
        this.mIconUri = uri;
        this.mExtras = bundle;
        this.mMediaUri = uri2;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.mMediaId = parcel.readString();
        this.mTitle = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSubtitle = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mDescription = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mIcon = (Bitmap) parcel.readParcelable(null);
        this.mIconUri = (Uri) parcel.readParcelable(null);
        this.mExtras = parcel.readBundle();
        this.mMediaUri = (Uri) parcel.readParcelable(null);
    }

    @Nullable
    public String getMediaId() {
        return this.mMediaId;
    }

    @Nullable
    public CharSequence getTitle() {
        return this.mTitle;
    }

    @Nullable
    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    @Nullable
    public CharSequence getDescription() {
        return this.mDescription;
    }

    @Nullable
    public Bitmap getIconBitmap() {
        return this.mIcon;
    }

    @Nullable
    public Uri getIconUri() {
        return this.mIconUri;
    }

    @Nullable
    public Bundle getExtras() {
        return this.mExtras;
    }

    @Nullable
    public Uri getMediaUri() {
        return this.mMediaUri;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.mMediaId);
            TextUtils.writeToParcel(this.mTitle, parcel, i);
            TextUtils.writeToParcel(this.mSubtitle, parcel, i);
            TextUtils.writeToParcel(this.mDescription, parcel, i);
            parcel.writeParcelable(this.mIcon, i);
            parcel.writeParcelable(this.mIconUri, i);
            parcel.writeBundle(this.mExtras);
            parcel.writeParcelable(this.mMediaUri, i);
            return;
        }
        C0507e.m1882a(getMediaDescription(), parcel, i);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.mTitle);
        stringBuilder.append(", ");
        stringBuilder.append(this.mSubtitle);
        stringBuilder.append(", ");
        stringBuilder.append(this.mDescription);
        return stringBuilder.toString();
    }

    public Object getMediaDescription() {
        if (this.mDescriptionObj == null) {
            if (VERSION.SDK_INT >= 21) {
                Object a = C0506a.m1871a();
                C0506a.m1877a(a, this.mMediaId);
                C0506a.m1876a(a, this.mTitle);
                C0506a.m1878b(a, this.mSubtitle);
                C0506a.m1879c(a, this.mDescription);
                C0506a.m1873a(a, this.mIcon);
                C0506a.m1874a(a, this.mIconUri);
                Bundle bundle = this.mExtras;
                if (VERSION.SDK_INT < 23 && this.mMediaUri != null) {
                    if (bundle == null) {
                        bundle = new Bundle();
                        bundle.putBoolean(DESCRIPTION_KEY_NULL_BUNDLE_FLAG, true);
                    }
                    bundle.putParcelable(DESCRIPTION_KEY_MEDIA_URI, this.mMediaUri);
                }
                C0506a.m1875a(a, bundle);
                if (VERSION.SDK_INT >= 23) {
                    C2862a.m11309b(a, this.mMediaUri);
                }
                this.mDescriptionObj = C0506a.m1872a(a);
                return this.mDescriptionObj;
            }
        }
        return this.mDescriptionObj;
    }

    public static MediaDescriptionCompat fromMediaDescription(Object obj) {
        Bundle bundle = null;
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Uri uri;
        MediaDescriptionCompat a;
        C0493a c0493a = new C0493a();
        c0493a.m1844a(C0507e.m1881a(obj));
        c0493a.m1843a(C0507e.m1883b(obj));
        c0493a.m1847b(C0507e.m1884c(obj));
        c0493a.m1848c(C0507e.m1885d(obj));
        c0493a.m1840a(C0507e.m1886e(obj));
        c0493a.m1841a(C0507e.m1887f(obj));
        Bundle g = C0507e.m1888g(obj);
        if (g == null) {
            uri = null;
        } else {
            uri = (Uri) g.getParcelable(DESCRIPTION_KEY_MEDIA_URI);
        }
        if (uri != null) {
            if (g.containsKey(DESCRIPTION_KEY_NULL_BUNDLE_FLAG) && g.size() == 2) {
                c0493a.m1842a(bundle);
                if (uri != null) {
                    c0493a.m1846b(uri);
                } else if (VERSION.SDK_INT >= 23) {
                    c0493a.m1846b(C2863f.m11310h(obj));
                }
                a = c0493a.m1845a();
                a.mDescriptionObj = obj;
                return a;
            }
            g.remove(DESCRIPTION_KEY_MEDIA_URI);
            g.remove(DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
        }
        bundle = g;
        c0493a.m1842a(bundle);
        if (uri != null) {
            c0493a.m1846b(uri);
        } else if (VERSION.SDK_INT >= 23) {
            c0493a.m1846b(C2863f.m11310h(obj));
        }
        a = c0493a.m1845a();
        a.mDescriptionObj = obj;
        return a;
    }
}
