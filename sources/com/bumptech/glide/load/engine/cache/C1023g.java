package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.p026d.C0983e;
import com.bumptech.glide.p026d.C0987h;
import com.facebook.ads.AdError;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bumptech.glide.load.engine.cache.g */
class C1023g {
    /* renamed from: a */
    private final C0983e<Key, String> f2827a = new C0983e(AdError.NETWORK_ERROR_CODE);

    C1023g() {
    }

    /* renamed from: a */
    public String m3561a(Key key) {
        String str;
        synchronized (this.f2827a) {
            str = (String) this.f2827a.m3398b(key);
        }
        if (str == null) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                key.updateDiskCacheKey(instance);
                str = C0987h.m3407a(instance.digest());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
            }
            synchronized (this.f2827a) {
                this.f2827a.m3399b(key, str);
            }
        }
        return str;
    }
}
