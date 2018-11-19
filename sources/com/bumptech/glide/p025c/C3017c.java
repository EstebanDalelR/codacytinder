package com.bumptech.glide.p025c;

import com.bumptech.glide.load.Key;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.c.c */
public class C3017c implements Key {
    /* renamed from: a */
    private final String f9405a;

    public C3017c(String str) {
        if (str == null) {
            throw new NullPointerException("Signature cannot be null!");
        }
        this.f9405a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return this.f9405a.equals(((C3017c) obj).f9405a);
            }
        }
        return null;
    }

    public int hashCode() {
        return this.f9405a.hashCode();
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) throws UnsupportedEncodingException {
        messageDigest.update(this.f9405a.getBytes("UTF-8"));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StringSignature{signature='");
        stringBuilder.append(this.f9405a);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
