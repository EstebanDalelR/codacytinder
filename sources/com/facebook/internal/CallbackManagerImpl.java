package com.facebook.internal;

import android.content.Intent;
import android.util.Log;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class CallbackManagerImpl implements CallbackManager {
    /* renamed from: a */
    private static final String f10374a = "CallbackManagerImpl";
    /* renamed from: b */
    private static Map<Integer, Callback> f10375b = new HashMap();
    /* renamed from: c */
    private Map<Integer, Callback> f10376c = new HashMap();

    public interface Callback {
        boolean onActivityResult(int i, Intent intent);
    }

    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        InAppPurchase(9);
        
        private final int offset;

        private RequestCodeOffset(int i) {
            this.offset = i;
        }

        public int toRequestCode() {
            return FacebookSdk.m4003n() + this.offset;
        }
    }

    /* renamed from: a */
    public static synchronized void m13080a(int i, Callback callback) {
        synchronized (CallbackManagerImpl.class) {
            C1749x.m6064a((Object) callback, "callback");
            if (f10375b.containsKey(Integer.valueOf(i))) {
                return;
            }
            f10375b.put(Integer.valueOf(i), callback);
        }
    }

    /* renamed from: a */
    private static synchronized Callback m13079a(Integer num) {
        Callback callback;
        synchronized (CallbackManagerImpl.class) {
            callback = (Callback) f10375b.get(num);
        }
        return callback;
    }

    /* renamed from: a */
    private static boolean m13081a(int i, int i2, Intent intent) {
        i = m13079a(Integer.valueOf(i));
        return i != 0 ? i.onActivityResult(i2, intent) : false;
    }

    /* renamed from: b */
    public void m13083b(int i, Callback callback) {
        C1749x.m6064a((Object) callback, "callback");
        this.f10376c.put(Integer.valueOf(i), callback);
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (m13082a(intent)) {
            i = RequestCodeOffset.InAppPurchase.toRequestCode();
        }
        Callback callback = (Callback) this.f10376c.get(Integer.valueOf(i));
        if (callback != null) {
            return callback.onActivityResult(i2, intent);
        }
        return m13081a(i, i2, intent);
    }

    /* renamed from: a */
    private static boolean m13082a(Intent intent) {
        boolean z = false;
        if (intent != null) {
            intent = intent.getStringExtra("INAPP_PURCHASE_DATA");
            if (intent != null) {
                try {
                    JSONObject jSONObject = new JSONObject(intent);
                    if (!(jSONObject.has("orderId") == null || jSONObject.has("packageName") == null || jSONObject.has("productId") == null || jSONObject.has("purchaseTime") == null || jSONObject.has("purchaseState") == null || jSONObject.has("developerPayload") == null || jSONObject.has("purchaseToken") == null)) {
                        z = true;
                    }
                    return z;
                } catch (Intent intent2) {
                    Log.e(f10374a, "Error parsing intent data.", intent2);
                    return false;
                }
            }
        }
        return false;
    }
}
