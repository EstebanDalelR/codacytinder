package com.google.android.gms.internal;

import com.google.android.gms.internal.xp.C8183b;
import com.google.android.gms.internal.zzdsy.zzb;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class uo {
    /* renamed from: a */
    private static final Logger f16584a = Logger.getLogger(uo.class.getName());
    /* renamed from: b */
    private static final ConcurrentMap<String, zzdpw> f16585b = new ConcurrentHashMap();
    /* renamed from: c */
    private static final ConcurrentMap<String, Boolean> f16586c = new ConcurrentHashMap();
    /* renamed from: d */
    private static final ConcurrentMap<String, zzdpq> f16587d = new ConcurrentHashMap();

    /* renamed from: a */
    public static <P> um<P> m20232a(ui uiVar, zzdpw<P> zzdpw) throws GeneralSecurityException {
        xp a = uiVar.m20224a();
        if (a.m34850c() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        int a2 = a.m34847a();
        Object obj = null;
        Object obj2 = 1;
        for (C8183b c8183b : a.m34849b()) {
            if (!c8183b.m34840a()) {
                throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(c8183b.m34843d())}));
            } else if (c8183b.m34844e() == zzdtt.UNKNOWN_PREFIX) {
                throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(c8183b.m34843d())}));
            } else if (c8183b.m34842c() == zzdtb.UNKNOWN_STATUS) {
                throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(c8183b.m34843d())}));
            } else {
                if (c8183b.m34842c() == zzdtb.ENABLED && c8183b.m34843d() == a2) {
                    if (obj != null) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    obj = 1;
                }
                if (c8183b.m34841b().m34936c() != zzb.ASYMMETRIC_PUBLIC) {
                    obj2 = null;
                }
            }
        }
        if (obj == null && r4 == null) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        um<P> umVar = new um();
        for (C8183b c8183b2 : uiVar.m20224a().m34849b()) {
            if (c8183b2.m34842c() == zzdtb.ENABLED) {
                un a3 = umVar.m20228a(m20236a(c8183b2.m34841b().m34934a(), c8183b2.m34841b().m34935b()), c8183b2);
                if (c8183b2.m34843d() == uiVar.m20224a().m34847a()) {
                    umVar.m20229a(a3);
                }
            }
        }
        return umVar;
    }

    /* renamed from: a */
    public static zzdpq m20233a(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        zzdpq zzdpq = (zzdpq) f16587d.get(str.toLowerCase());
        if (zzdpq != null) {
            return zzdpq;
        }
        String format = String.format("no catalogue found for %s. ", new Object[]{str});
        if (str.toLowerCase().startsWith("tinkaead")) {
            str = String.valueOf(format);
            format = "Maybe call AeadConfig.init().";
        } else if (str.toLowerCase().startsWith("tinkhybrid")) {
            str = String.valueOf(format);
            format = "Maybe call HybridConfig.init().";
        } else if (str.toLowerCase().startsWith("tinkmac")) {
            str = String.valueOf(format);
            format = "Maybe call MacConfig.init().";
        } else if (str.toLowerCase().startsWith("tinksignature")) {
            str = String.valueOf(format);
            format = "Maybe call SignatureConfig.init().";
        } else {
            if (str.toLowerCase().startsWith("tink")) {
                str = String.valueOf(format);
                format = "Maybe call TinkConfig.init().";
            }
            throw new GeneralSecurityException(format);
        }
        format = str.concat(format);
        throw new GeneralSecurityException(format);
    }

    /* renamed from: a */
    public static <P> zzdsy m20234a(xl xlVar) throws GeneralSecurityException {
        zzdpw b = m20241b(xlVar.m34811a());
        if (((Boolean) f16586c.get(xlVar.m34811a())).booleanValue()) {
            return b.zzc(xlVar.m34812b());
        }
        String str = "newKey-operation not permitted for key type ";
        String valueOf = String.valueOf(xlVar.m34811a());
        throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    public static <P> zzfhe m20235a(String str, zzfhe zzfhe) throws GeneralSecurityException {
        zzdpw b = m20241b(str);
        if (((Boolean) f16586c.get(str)).booleanValue()) {
            return b.zzb(zzfhe);
        }
        String str2 = "newKey-operation not permitted for key type ";
        str = String.valueOf(str);
        throw new GeneralSecurityException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }

    /* renamed from: a */
    private static <P> P m20236a(String str, zzfes zzfes) throws GeneralSecurityException {
        return m20241b(str).zza(zzfes);
    }

    /* renamed from: a */
    public static <P> P m20237a(String str, byte[] bArr) throws GeneralSecurityException {
        return m20236a(str, zzfes.m20298a(bArr));
    }

    /* renamed from: a */
    public static synchronized void m20238a(String str, zzdpq zzdpq) throws GeneralSecurityException {
        synchronized (uo.class) {
            if (f16587d.containsKey(str.toLowerCase())) {
                if (!zzdpq.getClass().equals(((zzdpq) f16587d.get(str.toLowerCase())).getClass())) {
                    Logger logger = f16584a;
                    Level level = Level.WARNING;
                    String str2 = "com.google.crypto.tink.Registry";
                    String str3 = "addCatalogue";
                    String str4 = "Attempted overwrite of a catalogueName catalogue for name ";
                    String valueOf = String.valueOf(str);
                    logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 47);
                    stringBuilder.append("catalogue for name ");
                    stringBuilder.append(str);
                    stringBuilder.append(" has been already registered");
                    throw new GeneralSecurityException(stringBuilder.toString());
                }
            }
            f16587d.put(str.toLowerCase(), zzdpq);
        }
    }

    /* renamed from: a */
    public static <P> void m20239a(String str, zzdpw<P> zzdpw) throws GeneralSecurityException {
        m20240a(str, zzdpw, true);
    }

    /* renamed from: a */
    public static synchronized <P> void m20240a(String str, zzdpw<P> zzdpw, boolean z) throws GeneralSecurityException {
        synchronized (uo.class) {
            if (zzdpw == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            if (f16585b.containsKey(str)) {
                zzdpw b = m20241b(str);
                boolean booleanValue = ((Boolean) f16586c.get(str)).booleanValue();
                if (!zzdpw.getClass().equals(b.getClass()) || (!booleanValue && z)) {
                    Logger logger = f16584a;
                    Level level = Level.WARNING;
                    String str2 = "com.google.crypto.tink.Registry";
                    String str3 = "registerKeyManager";
                    String str4 = "Attempted overwrite of a registered key manager for key type ";
                    String valueOf = String.valueOf(str);
                    logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, b.getClass().getName(), zzdpw.getClass().getName()}));
                }
            }
            f16585b.put(str, zzdpw);
            f16586c.put(str, Boolean.valueOf(z));
        }
    }

    /* renamed from: b */
    private static <P> zzdpw<P> m20241b(String str) throws GeneralSecurityException {
        zzdpw<P> zzdpw = (zzdpw) f16585b.get(str);
        if (zzdpw != null) {
            return zzdpw;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 78);
        stringBuilder.append("No key manager found for key type: ");
        stringBuilder.append(str);
        stringBuilder.append(".  Check the configuration of the registry.");
        throw new GeneralSecurityException(stringBuilder.toString());
    }

    /* renamed from: b */
    public static <P> zzfhe m20242b(xl xlVar) throws GeneralSecurityException {
        zzdpw b = m20241b(xlVar.m34811a());
        if (((Boolean) f16586c.get(xlVar.m34811a())).booleanValue()) {
            return b.zzb(xlVar.m34812b());
        }
        String str = "newKey-operation not permitted for key type ";
        String valueOf = String.valueOf(xlVar.m34811a());
        throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: b */
    public static <P> P m20243b(String str, zzfhe zzfhe) throws GeneralSecurityException {
        return m20241b(str).zza(zzfhe);
    }
}
