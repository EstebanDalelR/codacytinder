package com.snapchat.kit.sdk;

import android.text.TextUtils;
import android.util.Base64;
import com.snapchat.kit.sdk.core.models.AuthorizationRequest;
import java.security.SecureRandom;
import java.util.List;

/* renamed from: com.snapchat.kit.sdk.a */
class C5877a {
    /* renamed from: a */
    private static String f21566a = "AuthRequestFactory";
    /* renamed from: b */
    private static int f21567b = 32;
    /* renamed from: c */
    private static int f21568c = 32;

    /* renamed from: a */
    static AuthorizationRequest m25392a(String str, String str2, List<String> list) {
        String a = C5877a.m25393a(f21568c);
        String a2 = C5877a.m25394a(a);
        return new AuthorizationRequest().withResponseType("code").withClientId(str).withScope(TextUtils.join(" ", list)).withRedirectUri(str2).withCodeChallengeMethod("S256").withCodeVerifier(a).withCodeChallenge(a2).withState(C5877a.m25393a(f21567b));
    }

    /* renamed from: a */
    private static String m25393a(int i) {
        i = new byte[i];
        new SecureRandom().nextBytes(i);
        return Base64.encodeToString(i, 11);
    }

    /* renamed from: a */
    private static java.lang.String m25394a(@android.support.annotation.NonNull java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "SHA-256";	 Catch:{ Exception -> 0x001a }
        r0 = java.security.MessageDigest.getInstance(r0);	 Catch:{ Exception -> 0x001a }
        r1 = "US-ASCII";	 Catch:{ Exception -> 0x001a }
        r1 = r2.getBytes(r1);	 Catch:{ Exception -> 0x001a }
        r0.update(r1);	 Catch:{ Exception -> 0x001a }
        r0 = r0.digest();	 Catch:{ Exception -> 0x001a }
        r1 = 11;	 Catch:{ Exception -> 0x001a }
        r0 = android.util.Base64.encodeToString(r0, r1);	 Catch:{ Exception -> 0x001a }
        return r0;
    L_0x001a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.a.a(java.lang.String):java.lang.String");
    }
}
