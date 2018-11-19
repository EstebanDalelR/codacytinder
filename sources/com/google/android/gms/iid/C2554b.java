package com.google.android.gms.iid;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.iid.b */
public final class C2554b {
    /* renamed from: a */
    public static KeyPair m9305a() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
            instance.initialize(ItemAnimator.FLAG_MOVED);
            return instance.generateKeyPair();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
