package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Set;

public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends C4226a> implements ShareModel {
    private final Bundle bundle;

    /* renamed from: com.facebook.share.model.ShareOpenGraphValueContainer$a */
    public static abstract class C4226a<P extends ShareOpenGraphValueContainer, E extends C4226a> implements ShareModelBuilder<P, E> {
        /* renamed from: a */
        private Bundle f13502a = new Bundle();

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return mo3709a((ShareOpenGraphValueContainer) shareModel);
        }

        /* renamed from: a */
        public E m16771a(String str, @Nullable String str2) {
            this.f13502a.putString(str, str2);
            return this;
        }

        /* renamed from: a */
        public E mo3709a(P p) {
            if (p != null) {
                this.f13502a.putAll(p.getBundle());
            }
            return this;
        }
    }

    public int describeContents() {
        return 0;
    }

    protected ShareOpenGraphValueContainer(C4226a<P, E> c4226a) {
        this.bundle = (Bundle) c4226a.f13502a.clone();
    }

    ShareOpenGraphValueContainer(Parcel parcel) {
        this.bundle = parcel.readBundle(C4226a.class.getClassLoader());
    }

    @Nullable
    public Object get(String str) {
        return this.bundle.get(str);
    }

    public boolean getBoolean(String str, boolean z) {
        return this.bundle.getBoolean(str, z);
    }

    @Nullable
    public boolean[] getBooleanArray(String str) {
        return this.bundle.getBooleanArray(str);
    }

    public double getDouble(String str, double d) {
        return this.bundle.getDouble(str, d);
    }

    @Nullable
    public double[] getDoubleArray(String str) {
        return this.bundle.getDoubleArray(str);
    }

    public int getInt(String str, int i) {
        return this.bundle.getInt(str, i);
    }

    @Nullable
    public int[] getIntArray(String str) {
        return this.bundle.getIntArray(str);
    }

    public long getLong(String str, long j) {
        return this.bundle.getLong(str, j);
    }

    @Nullable
    public long[] getLongArray(String str) {
        return this.bundle.getLongArray(str);
    }

    public ShareOpenGraphObject getObject(String str) {
        str = this.bundle.get(str);
        return str instanceof ShareOpenGraphObject ? (ShareOpenGraphObject) str : null;
    }

    @Nullable
    public ArrayList<ShareOpenGraphObject> getObjectArrayList(String str) {
        str = this.bundle.getParcelableArrayList(str);
        if (str == null) {
            return null;
        }
        ArrayList<ShareOpenGraphObject> arrayList = new ArrayList();
        str = str.iterator();
        while (str.hasNext()) {
            Parcelable parcelable = (Parcelable) str.next();
            if (parcelable instanceof ShareOpenGraphObject) {
                arrayList.add((ShareOpenGraphObject) parcelable);
            }
        }
        return arrayList;
    }

    @Nullable
    public SharePhoto getPhoto(String str) {
        str = this.bundle.getParcelable(str);
        return str instanceof SharePhoto ? (SharePhoto) str : null;
    }

    @Nullable
    public ArrayList<SharePhoto> getPhotoArrayList(String str) {
        str = this.bundle.getParcelableArrayList(str);
        if (str == null) {
            return null;
        }
        ArrayList<SharePhoto> arrayList = new ArrayList();
        str = str.iterator();
        while (str.hasNext()) {
            Parcelable parcelable = (Parcelable) str.next();
            if (parcelable instanceof SharePhoto) {
                arrayList.add((SharePhoto) parcelable);
            }
        }
        return arrayList;
    }

    @Nullable
    public String getString(String str) {
        return this.bundle.getString(str);
    }

    @Nullable
    public ArrayList<String> getStringArrayList(String str) {
        return this.bundle.getStringArrayList(str);
    }

    public Bundle getBundle() {
        return (Bundle) this.bundle.clone();
    }

    public Set<String> keySet() {
        return this.bundle.keySet();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.bundle);
    }
}
