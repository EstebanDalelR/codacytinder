package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import java.util.Set;

public class CameraEffectTextures implements ShareModel {
    public static final Creator<CameraEffectTextures> CREATOR = new C18421();
    private final Bundle textures;

    /* renamed from: com.facebook.share.model.CameraEffectTextures$1 */
    static class C18421 implements Creator<CameraEffectTextures> {
        C18421() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6485a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6486a(i);
        }

        /* renamed from: a */
        public CameraEffectTextures m6485a(Parcel parcel) {
            return new CameraEffectTextures(parcel);
        }

        /* renamed from: a */
        public CameraEffectTextures[] m6486a(int i) {
            return new CameraEffectTextures[i];
        }
    }

    /* renamed from: com.facebook.share.model.CameraEffectTextures$a */
    public static class C4219a implements ShareModelBuilder<CameraEffectTextures, C4219a> {
        /* renamed from: a */
        private Bundle f13479a = new Bundle();

        public /* synthetic */ Object build() {
            return m16714a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m16713a((CameraEffectTextures) shareModel);
        }

        /* renamed from: a */
        public C4219a m16713a(CameraEffectTextures cameraEffectTextures) {
            if (cameraEffectTextures != null) {
                this.f13479a.putAll(cameraEffectTextures.textures);
            }
            return this;
        }

        /* renamed from: a */
        public C4219a m16712a(Parcel parcel) {
            return m16713a((CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
        }

        /* renamed from: a */
        public CameraEffectTextures m16714a() {
            return new CameraEffectTextures();
        }
    }

    public int describeContents() {
        return 0;
    }

    private CameraEffectTextures(C4219a c4219a) {
        this.textures = c4219a.f13479a;
    }

    CameraEffectTextures(Parcel parcel) {
        this.textures = parcel.readBundle(getClass().getClassLoader());
    }

    @Nullable
    public Bitmap getTextureBitmap(String str) {
        str = this.textures.get(str);
        return str instanceof Bitmap ? (Bitmap) str : null;
    }

    @Nullable
    public Uri getTextureUri(String str) {
        str = this.textures.get(str);
        return str instanceof Uri ? (Uri) str : null;
    }

    @Nullable
    public Object get(String str) {
        return this.textures.get(str);
    }

    public Set<String> keySet() {
        return this.textures.keySet();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.textures);
    }
}
