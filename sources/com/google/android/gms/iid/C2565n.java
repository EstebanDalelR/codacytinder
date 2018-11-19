package com.google.android.gms.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.C2527l;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.google.android.gms.iid.n */
public final class C2565n {
    /* renamed from: a */
    private SharedPreferences f7801a;
    /* renamed from: b */
    private Context f7802b;

    public C2565n(Context context) {
        this(context, "com.google.android.gms.appid");
    }

    private C2565n(Context context, String str) {
        this.f7802b = context;
        this.f7801a = context.getSharedPreferences(str, 0);
        String valueOf = String.valueOf(str);
        str = String.valueOf("-no-backup");
        File file = new File(C2527l.m9219a(this.f7802b), str.length() != 0 ? valueOf.concat(str) : new String(valueOf));
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m9335a()) {
                    Log.i("InstanceID/Store", "App restored, clearing state");
                    InstanceIDListenerService.zza(this.f7802b, this);
                }
            } catch (IOException e) {
                if (Log.isLoggable("InstanceID/Store", 3)) {
                    str = "InstanceID/Store";
                    String str2 = "Error creating file in no backup dir: ";
                    valueOf = String.valueOf(e.getMessage());
                    Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
    }

    /* renamed from: a */
    private final synchronized void m9328a(Editor editor, String str, String str2, String str3) {
        String str4 = "|S|";
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + String.valueOf(str4).length()) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(str4);
        stringBuilder.append(str2);
        editor.putString(stringBuilder.toString(), str3);
    }

    /* renamed from: c */
    private static String m9329c(String str, String str2, String str3) {
        String str4 = "|T|";
        StringBuilder stringBuilder = new StringBuilder((((String.valueOf(str).length() + 1) + String.valueOf(str4).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append(str);
        stringBuilder.append(str4);
        stringBuilder.append(str2);
        stringBuilder.append("|");
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    final synchronized String m9330a(String str) {
        return this.f7801a.getString(str, null);
    }

    /* renamed from: a */
    final synchronized String m9331a(String str, String str2) {
        SharedPreferences sharedPreferences;
        StringBuilder stringBuilder;
        sharedPreferences = this.f7801a;
        String str3 = "|S|";
        stringBuilder = new StringBuilder((String.valueOf(str).length() + String.valueOf(str3).length()) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(str3);
        stringBuilder.append(str2);
        return sharedPreferences.getString(stringBuilder.toString(), null);
    }

    /* renamed from: a */
    public final synchronized String m9332a(String str, String str2, String str3) {
        return this.f7801a.getString(C2565n.m9329c(str, str2, str3), null);
    }

    /* renamed from: a */
    final synchronized KeyPair m9333a(String str, long j) {
        KeyPair a;
        a = C2554b.m9305a();
        Editor edit = this.f7801a.edit();
        m9328a(edit, str, "|P|", C2553a.m9294a(a.getPublic().getEncoded()));
        m9328a(edit, str, "|K|", C2553a.m9294a(a.getPrivate().getEncoded()));
        m9328a(edit, str, "cre", Long.toString(j));
        edit.commit();
        return a;
    }

    /* renamed from: a */
    public final synchronized void m9334a(String str, String str2, String str3, String str4, String str5) {
        str = C2565n.m9329c(str, str2, str3);
        Editor edit = this.f7801a.edit();
        edit.putString(str, str4);
        edit.putString("appVersion", str5);
        edit.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000));
        edit.commit();
    }

    /* renamed from: a */
    public final boolean m9335a() {
        return this.f7801a.getAll().isEmpty();
    }

    /* renamed from: b */
    public final synchronized void m9336b() {
        this.f7801a.edit().clear().commit();
    }

    /* renamed from: b */
    public final synchronized void m9337b(String str) {
        Editor edit = this.f7801a.edit();
        for (String str2 : this.f7801a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    /* renamed from: b */
    public final synchronized void m9338b(String str, String str2, String str3) {
        str = C2565n.m9329c(str, str2, str3);
        Editor edit = this.f7801a.edit();
        edit.remove(str);
        edit.commit();
    }

    /* renamed from: c */
    public final void m9339c(String str) {
        m9337b(String.valueOf(str).concat("|T|"));
    }

    /* renamed from: d */
    final KeyPair m9340d(String str) {
        String a = m9331a(str, "|P|");
        str = m9331a(str, "|K|");
        if (a == null || str == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(a, 8);
            byte[] decode2 = Base64.decode(str, 8);
            KeyFactory instance = KeyFactory.getInstance("RSA");
            return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
        } catch (InvalidKeySpecException e) {
            str = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 19);
            stringBuilder.append("Invalid key stored ");
            stringBuilder.append(str);
            Log.w("InstanceID/Store", stringBuilder.toString());
            InstanceIDListenerService.zza(this.f7802b, this);
            return null;
        }
    }
}
