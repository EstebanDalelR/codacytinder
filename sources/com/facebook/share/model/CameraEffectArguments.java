package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import java.util.Set;

public class CameraEffectArguments implements ShareModel {
    public static final Creator<CameraEffectArguments> CREATOR = new C18411();
    private final Bundle params;

    /* renamed from: com.facebook.share.model.CameraEffectArguments$1 */
    static class C18411 implements Creator<CameraEffectArguments> {
        C18411() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6483a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6484a(i);
        }

        /* renamed from: a */
        public CameraEffectArguments m6483a(Parcel parcel) {
            return new CameraEffectArguments(parcel);
        }

        /* renamed from: a */
        public CameraEffectArguments[] m6484a(int i) {
            return new CameraEffectArguments[i];
        }
    }

    /* renamed from: com.facebook.share.model.CameraEffectArguments$a */
    public static class C4218a implements ShareModelBuilder<CameraEffectArguments, C4218a> {
        /* renamed from: a */
        private Bundle f13478a = new Bundle();

        public /* synthetic */ Object build() {
            return m16710a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m16707a((CameraEffectArguments) shareModel);
        }

        /* renamed from: a */
        public C4218a m16708a(String str, String str2) {
            this.f13478a.putString(str, str2);
            return this;
        }

        /* renamed from: a */
        public C4218a m16709a(String str, String[] strArr) {
            this.f13478a.putStringArray(str, strArr);
            return this;
        }

        /* renamed from: a */
        public C4218a m16707a(CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.f13478a.putAll(cameraEffectArguments.params);
            }
            return this;
        }

        /* renamed from: a */
        public C4218a m16706a(Parcel parcel) {
            return m16707a((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }

        /* renamed from: a */
        public CameraEffectArguments m16710a() {
            return new CameraEffectArguments();
        }
    }

    public int describeContents() {
        return 0;
    }

    private CameraEffectArguments(C4218a c4218a) {
        this.params = c4218a.f13478a;
    }

    CameraEffectArguments(Parcel parcel) {
        this.params = parcel.readBundle(getClass().getClassLoader());
    }

    @Nullable
    public String getString(String str) {
        return this.params.getString(str);
    }

    @Nullable
    public String[] getStringArray(String str) {
        return this.params.getStringArray(str);
    }

    @Nullable
    public Object get(String str) {
        return this.params.get(str);
    }

    public Set<String> keySet() {
        return this.params.keySet();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.params);
    }
}
