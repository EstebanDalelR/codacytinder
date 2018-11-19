package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.exoplayer2.C2005C;
import com.google.android.exoplayer2.drm.DefaultDrmSession.ProvisioningManager;
import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener.C2046a;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.drm.DrmSession.DrmSessionException;
import com.google.android.exoplayer2.extractor.mp4.C2099f;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@TargetApi(18)
public class DefaultDrmSessionManager<T extends ExoMediaCrypto> implements ProvisioningManager<T>, DrmSessionManager<T> {
    /* renamed from: a */
    volatile C2048a f10867a;
    /* renamed from: b */
    private final UUID f10868b;
    /* renamed from: c */
    private final ExoMediaDrm<T> f10869c;
    /* renamed from: d */
    private final MediaDrmCallback f10870d;
    /* renamed from: e */
    private final HashMap<String, String> f10871e;
    /* renamed from: f */
    private final C2046a f10872f;
    /* renamed from: g */
    private final boolean f10873g;
    /* renamed from: h */
    private final int f10874h;
    /* renamed from: i */
    private final List<DefaultDrmSession<T>> f10875i;
    /* renamed from: j */
    private final List<DefaultDrmSession<T>> f10876j;
    /* renamed from: k */
    private Looper f10877k;
    /* renamed from: l */
    private int f10878l;
    /* renamed from: m */
    private byte[] f10879m;

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Media does not support uuid: ");
            stringBuilder.append(uuid);
            super(stringBuilder.toString());
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$a */
    private class C2048a extends Handler {
        /* renamed from: a */
        final /* synthetic */ DefaultDrmSessionManager f5634a;

        public C2048a(DefaultDrmSessionManager defaultDrmSessionManager, Looper looper) {
            this.f5634a = defaultDrmSessionManager;
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            for (DefaultDrmSession defaultDrmSession : this.f5634a.f10875i) {
                if (defaultDrmSession.m13558b(bArr)) {
                    defaultDrmSession.m13554a(message.what);
                    return;
                }
            }
        }
    }

    @Deprecated
    public interface EventListener extends DefaultDrmSessionEventListener {
    }

    /* renamed from: a */
    public final void m13565a(Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) {
        this.f10872f.m7358a(handler, defaultDrmSessionEventListener);
    }

    public boolean canAcquireSession(@NonNull DrmInitData drmInitData) {
        boolean z = true;
        if (this.f10879m != null) {
            return true;
        }
        if (m13561a(drmInitData, this.f10868b, true) == null) {
            if (drmInitData.schemeDataCount != 1 || !drmInitData.get(0).matches(C2005C.f5445c)) {
                return false;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            stringBuilder.append(this.f10868b);
            Log.w("DefaultDrmSessionMgr", stringBuilder.toString());
        }
        drmInitData = drmInitData.schemeType;
        if (drmInitData != null) {
            if (!"cenc".equals(drmInitData)) {
                if (!("cbc1".equals(drmInitData) || "cbcs".equals(drmInitData))) {
                    if ("cens".equals(drmInitData) == null) {
                        return true;
                    }
                }
                if (C2314v.f6956a < 25) {
                    z = false;
                }
                return z;
            }
        }
        return true;
    }

    public DrmSession<T> acquireSession(Looper looper, DrmInitData drmInitData) {
        boolean z;
        C20471 c20471;
        SchemeData a;
        String b;
        byte[] bArr;
        DrmSession drmSession;
        Looper looper2 = looper;
        if (this.f10877k != null) {
            if (r13.f10877k != looper2) {
                z = false;
                C2289a.m8313b(z);
                if (r13.f10875i.isEmpty()) {
                    r13.f10877k = looper2;
                    if (r13.f10867a == null) {
                        r13.f10867a = new C2048a(r13, looper2);
                    }
                }
                c20471 = null;
                if (r13.f10879m != null) {
                    a = m13561a(drmInitData, r13.f10868b, false);
                    if (a != null) {
                        Throwable missingSchemeDataException = new MissingSchemeDataException(r13.f10868b);
                        r13.f10872f.m7359a(missingSchemeDataException);
                        return new C3603b(new DrmSessionException(missingSchemeDataException));
                    }
                    byte[] a2 = m13563a(a, r13.f10868b);
                    b = m13564b(a, r13.f10868b);
                    bArr = a2;
                } else {
                    bArr = null;
                    b = bArr;
                }
                if (!r13.f10873g) {
                    for (DefaultDrmSession defaultDrmSession : r13.f10875i) {
                        if (defaultDrmSession.m13556a(bArr)) {
                            c20471 = defaultDrmSession;
                            break;
                        }
                    }
                } else if (r13.f10875i.isEmpty()) {
                    c20471 = (DefaultDrmSession) r13.f10875i.get(0);
                }
                if (c20471 != null) {
                    DrmSession defaultDrmSession2 = new DefaultDrmSession(r13.f10868b, r13.f10869c, r13, bArr, b, r13.f10878l, r13.f10879m, r13.f10871e, r13.f10870d, looper2, r13.f10872f, r13.f10874h);
                    r13.f10875i.add(defaultDrmSession2);
                } else {
                    drmSession = c20471;
                }
                drmSession.m13553a();
                return drmSession;
            }
        }
        z = true;
        C2289a.m8313b(z);
        if (r13.f10875i.isEmpty()) {
            r13.f10877k = looper2;
            if (r13.f10867a == null) {
                r13.f10867a = new C2048a(r13, looper2);
            }
        }
        c20471 = null;
        if (r13.f10879m != null) {
            bArr = null;
            b = bArr;
        } else {
            a = m13561a(drmInitData, r13.f10868b, false);
            if (a != null) {
                byte[] a22 = m13563a(a, r13.f10868b);
                b = m13564b(a, r13.f10868b);
                bArr = a22;
            } else {
                Throwable missingSchemeDataException2 = new MissingSchemeDataException(r13.f10868b);
                r13.f10872f.m7359a(missingSchemeDataException2);
                return new C3603b(new DrmSessionException(missingSchemeDataException2));
            }
        }
        if (!r13.f10873g) {
            for (DefaultDrmSession defaultDrmSession3 : r13.f10875i) {
                if (defaultDrmSession3.m13556a(bArr)) {
                    c20471 = defaultDrmSession3;
                    break;
                }
            }
        } else if (r13.f10875i.isEmpty()) {
            c20471 = (DefaultDrmSession) r13.f10875i.get(0);
        }
        if (c20471 != null) {
            drmSession = c20471;
        } else {
            DrmSession defaultDrmSession22 = new DefaultDrmSession(r13.f10868b, r13.f10869c, r13, bArr, b, r13.f10878l, r13.f10879m, r13.f10871e, r13.f10870d, looper2, r13.f10872f, r13.f10874h);
            r13.f10875i.add(defaultDrmSession22);
        }
        drmSession.m13553a();
        return drmSession;
    }

    public void releaseSession(DrmSession<T> drmSession) {
        if (!(drmSession instanceof C3603b)) {
            DefaultDrmSession defaultDrmSession = (DefaultDrmSession) drmSession;
            if (defaultDrmSession.m13557b()) {
                this.f10875i.remove(defaultDrmSession);
                if (this.f10876j.size() > 1 && this.f10876j.get(0) == defaultDrmSession) {
                    ((DefaultDrmSession) this.f10876j.get(1)).m13559c();
                }
                this.f10876j.remove(defaultDrmSession);
            }
        }
    }

    public void provisionRequired(DefaultDrmSession<T> defaultDrmSession) {
        this.f10876j.add(defaultDrmSession);
        if (this.f10876j.size() == 1) {
            defaultDrmSession.m13559c();
        }
    }

    public void onProvisionCompleted() {
        for (DefaultDrmSession d : this.f10876j) {
            d.m13560d();
        }
        this.f10876j.clear();
    }

    public void onProvisionError(Exception exception) {
        for (DefaultDrmSession a : this.f10876j) {
            a.m13555a(exception);
        }
        this.f10876j.clear();
    }

    /* renamed from: a */
    private static SchemeData m13561a(DrmInitData drmInitData, UUID uuid, boolean z) {
        List arrayList = new ArrayList(drmInitData.schemeDataCount);
        int i = 0;
        while (true) {
            Object obj = 1;
            if (i >= drmInitData.schemeDataCount) {
                break;
            }
            SchemeData schemeData = drmInitData.get(i);
            if (!schemeData.matches(uuid)) {
                if (!C2005C.f5446d.equals(uuid) || !schemeData.matches(C2005C.f5445c)) {
                    obj = null;
                }
            }
            if (obj != null && (schemeData.data != null || z)) {
                arrayList.add(schemeData);
            }
            i++;
        }
        if (arrayList.isEmpty() != null) {
            return null;
        }
        if (C2005C.f5447e.equals(uuid) != null) {
            for (drmInitData = null; drmInitData < arrayList.size(); drmInitData++) {
                SchemeData schemeData2 = (SchemeData) arrayList.get(drmInitData);
                z = schemeData2.hasData() ? C2099f.m7518b(schemeData2.data) : true;
                if (C2314v.f6956a < 23 && !z) {
                    return schemeData2;
                }
                if (C2314v.f6956a >= 23 && z) {
                    return schemeData2;
                }
            }
        }
        return (SchemeData) arrayList.get(0);
    }

    /* renamed from: a */
    private static byte[] m13563a(SchemeData schemeData, UUID uuid) {
        schemeData = schemeData.data;
        if (C2314v.f6956a >= 21) {
            return schemeData;
        }
        uuid = C2099f.m7517a(schemeData, uuid);
        return uuid == null ? schemeData : uuid;
    }

    /* renamed from: b */
    private static String m13564b(SchemeData schemeData, UUID uuid) {
        schemeData = schemeData.mimeType;
        if (C2314v.f6956a >= 26 || C2005C.f5446d.equals(uuid) == null) {
            return schemeData;
        }
        return ("video/mp4".equals(schemeData) == null && "audio/mp4".equals(schemeData) == null) ? schemeData : "cenc";
    }
}
