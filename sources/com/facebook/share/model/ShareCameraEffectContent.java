package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.CameraEffectArguments.C4218a;
import com.facebook.share.model.CameraEffectTextures.C4219a;
import com.facebook.share.model.ShareContent.C4221a;

public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, C4356a> {
    public static final Creator<ShareCameraEffectContent> CREATOR = new C18441();
    private CameraEffectArguments arguments;
    private String effectId;
    private CameraEffectTextures textures;

    /* renamed from: com.facebook.share.model.ShareCameraEffectContent$1 */
    static class C18441 implements Creator<ShareCameraEffectContent> {
        C18441() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m6489a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m6490a(i);
        }

        /* renamed from: a */
        public ShareCameraEffectContent m6489a(Parcel parcel) {
            return new ShareCameraEffectContent(parcel);
        }

        /* renamed from: a */
        public ShareCameraEffectContent[] m6490a(int i) {
            return new ShareCameraEffectContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareCameraEffectContent$a */
    public static final class C4356a extends C4221a<ShareCameraEffectContent, C4356a> {
        /* renamed from: a */
        private String f14316a;
        /* renamed from: b */
        private CameraEffectArguments f14317b;
        /* renamed from: c */
        private CameraEffectTextures f14318c;

        public /* synthetic */ Object build() {
            return m17819a();
        }

        public /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return m17817a((ShareCameraEffectContent) shareModel);
        }

        /* renamed from: a */
        public C4356a m17818a(String str) {
            this.f14316a = str;
            return this;
        }

        /* renamed from: a */
        public C4356a m17816a(CameraEffectArguments cameraEffectArguments) {
            this.f14317b = cameraEffectArguments;
            return this;
        }

        /* renamed from: a */
        public ShareCameraEffectContent m17819a() {
            return new ShareCameraEffectContent();
        }

        /* renamed from: a */
        public C4356a m17817a(ShareCameraEffectContent shareCameraEffectContent) {
            if (shareCameraEffectContent == null) {
                return this;
            }
            return ((C4356a) super.mo3707a((ShareContent) shareCameraEffectContent)).m17818a(this.f14316a).m17816a(this.f14317b);
        }
    }

    private ShareCameraEffectContent(C4356a c4356a) {
        super((C4221a) c4356a);
        this.effectId = c4356a.f14316a;
        this.arguments = c4356a.f14317b;
        this.textures = c4356a.f14318c;
    }

    ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.effectId = parcel.readString();
        this.arguments = new C4218a().m16706a(parcel).m16710a();
        this.textures = new C4219a().m16712a(parcel).m16714a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.effectId);
        parcel.writeParcelable(this.arguments, 0);
        parcel.writeParcelable(this.textures, 0);
    }

    public String getEffectId() {
        return this.effectId;
    }

    public CameraEffectArguments getArguments() {
        return this.arguments;
    }

    public CameraEffectTextures getTextures() {
        return this.textures;
    }
}
