package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.engine.h */
class C3049h implements Key {
    /* renamed from: a */
    private final String f9509a;
    /* renamed from: b */
    private final Key f9510b;

    public C3049h(String str, Key key) {
        this.f9509a = str;
        this.f9510b = key;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C3049h c3049h = (C3049h) obj;
                return this.f9509a.equals(c3049h.f9509a) && this.f9510b.equals(c3049h.f9510b) != null;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f9509a.hashCode() * 31) + this.f9510b.hashCode();
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) throws UnsupportedEncodingException {
        messageDigest.update(this.f9509a.getBytes("UTF-8"));
        this.f9510b.updateDiskCacheKey(messageDigest);
    }
}
