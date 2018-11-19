package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.C2005C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener.C2046a;
import com.google.android.exoplayer2.drm.DrmSession.DrmSessionException;
import com.google.android.exoplayer2.drm.ExoMediaDrm.C3602a;
import com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest;
import com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@TargetApi(18)
class DefaultDrmSession<T extends ExoMediaCrypto> implements DrmSession<T> {
    /* renamed from: a */
    final MediaDrmCallback f10848a;
    /* renamed from: b */
    final UUID f10849b;
    /* renamed from: c */
    final C2040b f10850c;
    /* renamed from: d */
    private final ExoMediaDrm<T> f10851d;
    /* renamed from: e */
    private final ProvisioningManager<T> f10852e;
    /* renamed from: f */
    private final byte[] f10853f;
    /* renamed from: g */
    private final String f10854g;
    /* renamed from: h */
    private final int f10855h;
    /* renamed from: i */
    private final HashMap<String, String> f10856i;
    /* renamed from: j */
    private final C2046a f10857j;
    /* renamed from: k */
    private final int f10858k;
    /* renamed from: l */
    private int f10859l = 2;
    /* renamed from: m */
    private int f10860m;
    /* renamed from: n */
    private HandlerThread f10861n;
    /* renamed from: o */
    private C2039a f10862o;
    /* renamed from: p */
    private T f10863p;
    /* renamed from: q */
    private DrmSessionException f10864q;
    /* renamed from: r */
    private byte[] f10865r;
    /* renamed from: s */
    private byte[] f10866s;

    public interface ProvisioningManager<T extends ExoMediaCrypto> {
        void onProvisionCompleted();

        void onProvisionError(Exception exception);

        void provisionRequired(DefaultDrmSession<T> defaultDrmSession);
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$a */
    private class C2039a extends Handler {
        /* renamed from: a */
        final /* synthetic */ DefaultDrmSession f5620a;

        public C2039a(DefaultDrmSession defaultDrmSession, Looper looper) {
            this.f5620a = defaultDrmSession;
            super(looper);
        }

        /* renamed from: a */
        Message m7356a(int i, Object obj, boolean z) {
            return obtainMessage(i, z, 0, obj);
        }

        public void handleMessage(Message message) {
            Object executeProvisionRequest;
            try {
                switch (message.what) {
                    case 0:
                        executeProvisionRequest = this.f5620a.f10848a.executeProvisionRequest(this.f5620a.f10849b, (ProvisionRequest) message.obj);
                        break;
                    case 1:
                        executeProvisionRequest = this.f5620a.f10848a.executeKeyRequest(this.f5620a.f10849b, (KeyRequest) message.obj);
                        break;
                    default:
                        throw new RuntimeException();
                }
            } catch (Exception e) {
                executeProvisionRequest = e;
                if (m7355a(message)) {
                    return;
                }
            }
            this.f5620a.f10850c.obtainMessage(message.what, executeProvisionRequest).sendToTarget();
        }

        /* renamed from: a */
        private boolean m7355a(Message message) {
            if ((message.arg1 == 1 ? 1 : null) == null) {
                return false;
            }
            int i = message.arg2 + 1;
            if (i > this.f5620a.f10858k) {
                return false;
            }
            message = Message.obtain(message);
            message.arg2 = i;
            sendMessageDelayed(message, m7354a(i));
            return true;
        }

        /* renamed from: a */
        private long m7354a(int i) {
            return (long) Math.min((i - 1) * AdError.NETWORK_ERROR_CODE, 5000);
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$b */
    private class C2040b extends Handler {
        /* renamed from: a */
        final /* synthetic */ DefaultDrmSession f5621a;

        public C2040b(DefaultDrmSession defaultDrmSession, Looper looper) {
            this.f5621a = defaultDrmSession;
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    this.f5621a.m13542a(message.obj);
                    return;
                case 1:
                    this.f5621a.m13546b((Object) message.obj);
                    return;
                default:
                    return;
            }
        }
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm<T> exoMediaDrm, ProvisioningManager<T> provisioningManager, byte[] bArr, String str, int i, byte[] bArr2, HashMap<String, String> hashMap, MediaDrmCallback mediaDrmCallback, Looper looper, C2046a c2046a, int i2) {
        this.f10849b = uuid;
        this.f10852e = provisioningManager;
        this.f10851d = exoMediaDrm;
        this.f10855h = i;
        this.f10866s = bArr2;
        this.f10856i = hashMap;
        this.f10848a = mediaDrmCallback;
        this.f10858k = i2;
        this.f10857j = c2046a;
        this.f10850c = new C2040b(this, looper);
        this.f10861n = new HandlerThread("DrmRequestHandler");
        this.f10861n.start();
        this.f10862o = new C2039a(this, this.f10861n.getLooper());
        if (bArr2 == null) {
            this.f10853f = bArr;
            this.f10854g = str;
            return;
        }
        this.f10853f = null;
        this.f10854g = null;
    }

    /* renamed from: a */
    public void m13553a() {
        int i = this.f10860m + 1;
        this.f10860m = i;
        if (i == 1 && this.f10859l != 1 && m13543a(true)) {
            m13547b(true);
        }
    }

    /* renamed from: b */
    public boolean m13557b() {
        int i = this.f10860m - 1;
        this.f10860m = i;
        if (i != 0) {
            return false;
        }
        this.f10859l = 0;
        this.f10850c.removeCallbacksAndMessages(null);
        this.f10862o.removeCallbacksAndMessages(null);
        this.f10862o = null;
        this.f10861n.quit();
        this.f10861n = null;
        this.f10863p = null;
        this.f10864q = null;
        if (this.f10865r != null) {
            this.f10851d.closeSession(this.f10865r);
            this.f10865r = null;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m13556a(byte[] bArr) {
        return Arrays.equals(this.f10853f, bArr);
    }

    /* renamed from: b */
    public boolean m13558b(byte[] bArr) {
        return Arrays.equals(this.f10865r, bArr);
    }

    /* renamed from: c */
    public void m13559c() {
        this.f10862o.m7356a(0, this.f10851d.getProvisionRequest(), true).sendToTarget();
    }

    /* renamed from: d */
    public void m13560d() {
        if (m13543a(false)) {
            m13547b(true);
        }
    }

    /* renamed from: a */
    public void m13555a(Exception exception) {
        m13548c(exception);
    }

    public final int getState() {
        return this.f10859l;
    }

    public final DrmSessionException getError() {
        return this.f10859l == 1 ? this.f10864q : null;
    }

    public final T getMediaCrypto() {
        return this.f10863p;
    }

    public Map<String, String> queryKeyStatus() {
        return this.f10865r == null ? null : this.f10851d.queryKeyStatus(this.f10865r);
    }

    public byte[] getOfflineLicenseKeySetId() {
        return this.f10866s;
    }

    /* renamed from: a */
    private boolean m13543a(boolean z) {
        if (m13552h()) {
            return true;
        }
        try {
            this.f10865r = this.f10851d.openSession();
            this.f10863p = this.f10851d.createMediaCrypto(this.f10865r);
            this.f10859l = 3;
            return true;
        } catch (Exception e) {
            if (z) {
                this.f10852e.provisionRequired(this);
            } else {
                m13548c(e);
            }
            return false;
        } catch (boolean z2) {
            m13548c(z2);
            return false;
        }
    }

    /* renamed from: a */
    private void m13542a(Object obj) {
        if (this.f10859l != 2 && !m13552h()) {
            return;
        }
        if (obj instanceof Exception) {
            this.f10852e.onProvisionError((Exception) obj);
            return;
        }
        try {
            this.f10851d.provideProvisionResponse((byte[]) obj);
            this.f10852e.onProvisionCompleted();
        } catch (Object obj2) {
            this.f10852e.onProvisionError(obj2);
        }
    }

    /* renamed from: b */
    private void m13547b(boolean z) {
        switch (this.f10855h) {
            case 0:
            case 1:
                if (this.f10866s == null) {
                    m13540a(1, z);
                    return;
                } else if (this.f10859l == 4 || m13549e()) {
                    long f = m13550f();
                    if (this.f10855h == 0 && f <= 60) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Offline license has expired or will expire soon. Remaining seconds: ");
                        stringBuilder.append(f);
                        Log.d("DefaultDrmSession", stringBuilder.toString());
                        m13540a(2, z);
                        return;
                    } else if (f <= 0) {
                        m13548c(new KeysExpiredException());
                        return;
                    } else {
                        this.f10859l = 4;
                        this.f10857j.m7360b();
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                if (this.f10866s == null) {
                    m13540a(2, z);
                    return;
                } else if (m13549e()) {
                    m13540a(2, z);
                    return;
                } else {
                    return;
                }
            case 3:
                if (m13549e()) {
                    m13540a(3, z);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: e */
    private boolean m13549e() {
        try {
            this.f10851d.restoreKeys(this.f10865r, this.f10866s);
            return true;
        } catch (Throwable e) {
            Log.e("DefaultDrmSession", "Error trying to restore Widevine keys.", e);
            m13548c(e);
            return false;
        }
    }

    /* renamed from: f */
    private long m13550f() {
        if (!C2005C.f5447e.equals(this.f10849b)) {
            return Format.OFFSET_SAMPLE_RELATIVE;
        }
        Pair a = C2052d.m7371a(this);
        return Math.min(((Long) a.first).longValue(), ((Long) a.second).longValue());
    }

    /* renamed from: a */
    private void m13540a(int i, boolean z) {
        try {
            i = this.f10851d.getKeyRequest(i == 3 ? this.f10866s : this.f10865r, this.f10853f, this.f10854g, i, this.f10856i);
            if (C2005C.f5446d.equals(this.f10849b)) {
                i = new C3602a(C2051a.m7367a(i.getData()), i.getDefaultUrl());
            }
            this.f10862o.m7356a(1, i, z).sendToTarget();
        } catch (Exception e) {
            m13545b(e);
        }
    }

    /* renamed from: b */
    private void m13546b(Object obj) {
        if (!m13552h()) {
            return;
        }
        if (obj instanceof Exception) {
            m13545b((Exception) obj);
            return;
        }
        try {
            obj = (byte[]) obj;
            if (C2005C.f5446d.equals(this.f10849b)) {
                obj = C2051a.m7369b((byte[]) obj);
            }
            if (this.f10855h == 3) {
                this.f10851d.provideKeyResponse(this.f10866s, obj);
                this.f10857j.m7361c();
            } else {
                obj = this.f10851d.provideKeyResponse(this.f10865r, obj);
                if (!((this.f10855h != 2 && (this.f10855h != 0 || this.f10866s == null)) || obj == null || obj.length == 0)) {
                    this.f10866s = obj;
                }
                this.f10859l = 4;
                this.f10857j.m7357a();
            }
        } catch (Exception e) {
            m13545b(e);
        }
    }

    /* renamed from: g */
    private void m13551g() {
        if (this.f10859l == 4) {
            this.f10859l = 3;
            m13548c(new KeysExpiredException());
        }
    }

    /* renamed from: b */
    private void m13545b(Exception exception) {
        if (exception instanceof NotProvisionedException) {
            this.f10852e.provisionRequired(this);
        } else {
            m13548c(exception);
        }
    }

    /* renamed from: c */
    private void m13548c(Exception exception) {
        this.f10864q = new DrmSessionException(exception);
        this.f10857j.m7359a(exception);
        if (this.f10859l != 4) {
            this.f10859l = 1;
        }
    }

    /* renamed from: h */
    private boolean m13552h() {
        if (this.f10859l != 3) {
            if (this.f10859l != 4) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void m13554a(int i) {
        if (m13552h()) {
            switch (i) {
                case 1:
                    this.f10859l = 3;
                    this.f10852e.provisionRequired(this);
                    break;
                case 2:
                    m13547b((boolean) 0);
                    break;
                case 3:
                    m13551g();
                    break;
                default:
                    break;
            }
        }
    }
}
