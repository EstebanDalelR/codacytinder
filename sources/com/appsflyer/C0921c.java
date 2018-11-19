package com.appsflyer;

import android.content.Context;
import android.os.Build.VERSION;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec.Builder;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.appsflyer.c */
class C0921c {
    /* renamed from: a */
    private final Object f2443a = new Object();
    /* renamed from: b */
    private KeyStore f2444b;
    /* renamed from: c */
    private Context f2445c;
    /* renamed from: d */
    private String f2446d;
    /* renamed from: e */
    private int f2447e;

    public C0921c(Context context) {
        this.f2445c = context;
        this.f2446d = "";
        this.f2447e = null;
        m3151e();
    }

    /* renamed from: e */
    private void m3151e() {
        AFLogger.m3083d("Initialising KeyStore..");
        try {
            this.f2444b = KeyStore.getInstance("AndroidKeyStore");
            this.f2444b.load(null);
        } catch (Throwable e) {
            AFLogger.m3073a("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    /* renamed from: a */
    void m3154a(String str) {
        this.f2446d = str;
        this.f2447e = null;
        m3148b(m3152f());
    }

    /* renamed from: a */
    void m3153a() {
        String f = m3152f();
        synchronized (this.f2443a) {
            this.f2447e++;
            m3149c(f);
        }
        m3148b(m3152f());
    }

    /* renamed from: b */
    boolean m3155b() {
        boolean z;
        Throwable th;
        StringBuilder stringBuilder;
        synchronized (this.f2443a) {
            z = true;
            if (this.f2444b != null) {
                try {
                    Enumeration aliases = this.f2444b.aliases();
                    while (aliases.hasMoreElements()) {
                        String str = (String) aliases.nextElement();
                        if (str != null && m3150d(str)) {
                            String[] split = str.split(",");
                            if (split.length == 3) {
                                StringBuilder stringBuilder2 = new StringBuilder("Found a matching AF key with alias:\n");
                                stringBuilder2.append(str);
                                AFLogger.m3083d(stringBuilder2.toString());
                                try {
                                    String[] split2 = split[1].trim().split("=");
                                    split = split[2].trim().split("=");
                                    if (split2.length == 2 && split.length == 2) {
                                        this.f2446d = split2[1].trim();
                                        this.f2447e = Integer.parseInt(split[1].trim());
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    stringBuilder = new StringBuilder("Couldn't list KeyStore Aliases: ");
                                    stringBuilder.append(th.getClass().getName());
                                    AFLogger.m3073a(stringBuilder.toString(), th);
                                    return z;
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z = false;
                    stringBuilder = new StringBuilder("Couldn't list KeyStore Aliases: ");
                    stringBuilder.append(th.getClass().getName());
                    AFLogger.m3073a(stringBuilder.toString(), th);
                    return z;
                }
            }
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private void m3148b(String str) {
        StringBuilder stringBuilder = new StringBuilder("Creating a new key with alias: ");
        stringBuilder.append(str);
        AFLogger.m3083d(stringBuilder.toString());
        try {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 5);
            AlgorithmParameterSpec algorithmParameterSpec = null;
            synchronized (this.f2443a) {
                if (this.f2444b.containsAlias(str)) {
                    stringBuilder = new StringBuilder("Alias already exists: ");
                    stringBuilder.append(str);
                    AFLogger.m3083d(stringBuilder.toString());
                } else {
                    if (VERSION.SDK_INT >= 23) {
                        algorithmParameterSpec = new Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(instance.getTime()).setCertificateNotAfter(instance2.getTime()).build();
                    } else if (VERSION.SDK_INT >= 18 && !C0932h.m3184b()) {
                        algorithmParameterSpec = new KeyPairGeneratorSpec.Builder(this.f2445c).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
                    }
                    str = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    str.initialize(algorithmParameterSpec);
                    str.generateKeyPair();
                }
            }
        } catch (Throwable th) {
            stringBuilder = new StringBuilder("Exception ");
            stringBuilder.append(th.getMessage());
            stringBuilder.append(" occurred");
            AFLogger.m3073a(stringBuilder.toString(), th);
        }
    }

    /* renamed from: c */
    private void m3149c(String str) {
        StringBuilder stringBuilder = new StringBuilder("Deleting key with alias: ");
        stringBuilder.append(str);
        AFLogger.m3083d(stringBuilder.toString());
        try {
            synchronized (this.f2443a) {
                this.f2444b.deleteEntry(str);
            }
        } catch (Throwable e) {
            stringBuilder = new StringBuilder("Exception ");
            stringBuilder.append(e.getMessage());
            stringBuilder.append(" occurred");
            AFLogger.m3073a(stringBuilder.toString(), e);
        }
    }

    /* renamed from: d */
    private boolean m3150d(String str) {
        return str.startsWith("com.appsflyer");
    }

    /* renamed from: f */
    private String m3152f() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.appsflyer,");
        synchronized (this.f2443a) {
            stringBuilder.append("KSAppsFlyerId=");
            stringBuilder.append(this.f2446d);
            stringBuilder.append(",");
            stringBuilder.append("KSAppsFlyerRICounter=");
            stringBuilder.append(this.f2447e);
        }
        return stringBuilder.toString();
    }

    /* renamed from: c */
    String m3156c() {
        String str;
        synchronized (this.f2443a) {
            str = this.f2446d;
        }
        return str;
    }

    /* renamed from: d */
    int m3157d() {
        int i;
        synchronized (this.f2443a) {
            i = this.f2447e;
        }
        return i;
    }
}
