package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class yz<T_WRAPPER extends zzduv<T_ENGINE>, T_ENGINE> {
    /* renamed from: a */
    public static final yz<za, Cipher> f16654a = new yz(new za());
    /* renamed from: b */
    public static final yz<zf, Mac> f16655b = new yz(new zf());
    /* renamed from: c */
    public static final yz<zb, KeyAgreement> f16656c = new yz(new zb());
    /* renamed from: d */
    public static final yz<zd, KeyPairGenerator> f16657d = new yz(new zd());
    /* renamed from: e */
    private static final Logger f16658e = Logger.getLogger(yz.class.getName());
    /* renamed from: f */
    private static final List<Provider> f16659f;
    /* renamed from: g */
    private static yz<zh, Signature> f16660g = new yz(new zh());
    /* renamed from: h */
    private static yz<zg, MessageDigest> f16661h = new yz(new zg());
    /* renamed from: i */
    private static yz<zc, KeyFactory> f16662i = new yz(new zc());
    /* renamed from: j */
    private T_WRAPPER f16663j;
    /* renamed from: k */
    private List<Provider> f16664k = f16659f;
    /* renamed from: l */
    private boolean f16665l = true;

    static {
        if (zn.m20288a()) {
            String[] strArr = new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL"};
            List arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                Provider provider = Security.getProvider(strArr[i]);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f16658e.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{r4}));
                }
            }
            f16659f = arrayList;
        } else {
            f16659f = new ArrayList();
        }
    }

    private yz(T_WRAPPER t_wrapper) {
        this.f16663j = t_wrapper;
    }

    /* renamed from: a */
    private final boolean m20278a(java.lang.String r2, java.security.Provider r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = r1.f16663j;	 Catch:{ Exception -> 0x0007 }
        r0.zzb(r2, r3);	 Catch:{ Exception -> 0x0007 }
        r2 = 1;
        return r2;
    L_0x0007:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.yz.a(java.lang.String, java.security.Provider):boolean");
    }

    /* renamed from: a */
    public final T_ENGINE m20279a(String str) throws GeneralSecurityException {
        for (Provider provider : this.f16664k) {
            Provider provider2;
            if (m20278a(str, provider2)) {
                zzduv zzduv = this.f16663j;
                break;
            }
        }
        if (this.f16665l) {
            zzduv = this.f16663j;
            provider2 = null;
            return zzduv.zzb(str, provider2);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }
}
