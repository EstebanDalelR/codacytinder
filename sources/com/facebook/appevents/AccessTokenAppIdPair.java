package com.facebook.appevents;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import java.io.Serializable;

class AccessTokenAppIdPair implements Serializable {
    private static final long serialVersionUID = 1;
    /* renamed from: a */
    private final String f4491a;
    /* renamed from: b */
    private final String f4492b;

    static class SerializationProxyV1 implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;
        /* renamed from: a */
        private final String f4489a;
        /* renamed from: b */
        private final String f4490b;

        private SerializationProxyV1(String str, String str2) {
            this.f4489a = str;
            this.f4490b = str2;
        }

        private Object readResolve() {
            return new AccessTokenAppIdPair(this.f4489a, this.f4490b);
        }
    }

    public AccessTokenAppIdPair(AccessToken accessToken) {
        this(accessToken.getToken(), FacebookSdk.m3998i());
    }

    public AccessTokenAppIdPair(String str, String str2) {
        if (Utility.m5785a(str)) {
            str = null;
        }
        this.f4491a = str;
        this.f4492b = str2;
    }

    /* renamed from: a */
    public String m5509a() {
        return this.f4491a;
    }

    /* renamed from: b */
    public String m5510b() {
        return this.f4492b;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f4491a == null ? 0 : this.f4491a.hashCode();
        if (this.f4492b != null) {
            i = this.f4492b.hashCode();
        }
        return hashCode ^ i;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof AccessTokenAppIdPair)) {
            return false;
        }
        AccessTokenAppIdPair accessTokenAppIdPair = (AccessTokenAppIdPair) obj;
        if (Utility.m5784a(accessTokenAppIdPair.f4491a, this.f4491a) && Utility.m5784a(accessTokenAppIdPair.f4492b, this.f4492b) != null) {
            z = true;
        }
        return z;
    }

    private Object writeReplace() {
        return new SerializationProxyV1(this.f4491a, this.f4492b);
    }
}
