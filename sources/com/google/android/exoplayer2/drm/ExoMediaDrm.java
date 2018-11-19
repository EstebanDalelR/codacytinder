package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.support.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ExoMediaDrm<T extends ExoMediaCrypto> {

    public interface KeyRequest {
        byte[] getData();

        String getDefaultUrl();
    }

    public interface KeyStatus {
        byte[] getKeyId();

        int getStatusCode();
    }

    public interface OnEventListener<T extends ExoMediaCrypto> {
        void onEvent(ExoMediaDrm<? extends T> exoMediaDrm, byte[] bArr, int i, int i2, @Nullable byte[] bArr2);
    }

    public interface OnKeyStatusChangeListener<T extends ExoMediaCrypto> {
        void onKeyStatusChange(ExoMediaDrm<? extends T> exoMediaDrm, byte[] bArr, List<KeyStatus> list, boolean z);
    }

    public interface ProvisionRequest {
        byte[] getData();

        String getDefaultUrl();
    }

    /* renamed from: com.google.android.exoplayer2.drm.ExoMediaDrm$a */
    public static final class C3602a implements KeyRequest {
        /* renamed from: a */
        private final byte[] f10880a;
        /* renamed from: b */
        private final String f10881b;

        public C3602a(byte[] bArr, String str) {
            this.f10880a = bArr;
            this.f10881b = str;
        }

        public byte[] getData() {
            return this.f10880a;
        }

        public String getDefaultUrl() {
            return this.f10881b;
        }
    }

    void closeSession(byte[] bArr);

    T createMediaCrypto(byte[] bArr) throws MediaCryptoException;

    KeyRequest getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    byte[] getPropertyByteArray(String str);

    String getPropertyString(String str);

    ProvisionRequest getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void release();

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setOnEventListener(OnEventListener<? super T> onEventListener);

    void setOnKeyStatusChangeListener(OnKeyStatusChangeListener<? super T> onKeyStatusChangeListener);

    void setPropertyByteArray(String str, byte[] bArr);

    void setPropertyString(String str, String str2);
}
