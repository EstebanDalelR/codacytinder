package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzffu<MessageType extends zzffu<MessageType, BuilderType>, BuilderType extends C8036a<MessageType, BuilderType>> extends aaz<MessageType, BuilderType> {
    /* renamed from: d */
    private static Map<Object, zzffu<?, ?>> f28828d = new ConcurrentHashMap();
    /* renamed from: b */
    protected adn f28829b = adn.m18920a();
    /* renamed from: c */
    protected int f28830c = -1;

    /* renamed from: com.google.android.gms.internal.zzffu$g */
    public enum C4479g {
        /* renamed from: a */
        public static final int f16685a = 1;
        /* renamed from: b */
        public static final int f16686b = 2;
        /* renamed from: c */
        public static final int f16687c = 3;
        /* renamed from: d */
        public static final int f16688d = 4;
        /* renamed from: e */
        public static final int f16689e = 5;
        /* renamed from: f */
        public static final int f16690f = 6;
        /* renamed from: g */
        public static final int f16691g = 7;
        /* renamed from: h */
        public static final int f16692h = 8;
        /* renamed from: i */
        public static final int f16693i = 9;
        /* renamed from: j */
        public static final int f16694j = 10;
        /* renamed from: k */
        public static final int f16695k = 1;
        /* renamed from: l */
        public static final int f16696l = 2;
        /* renamed from: m */
        private static final /* synthetic */ int[] f16697m = new int[]{f16685a, f16686b, f16687c, f16688d, f16689e, f16690f, f16691g, f16692h, f16693i, f16694j};
        /* renamed from: n */
        private static final /* synthetic */ int[] f16698n = new int[]{f16695k, f16696l};

        /* renamed from: a */
        public static int[] m20314a() {
            return (int[]) f16697m.clone();
        }
    }

    public interface zzh {
        double zza(boolean z, double d, boolean z2, double d2);

        int zza(boolean z, int i, boolean z2, int i2);

        long zza(boolean z, long j, boolean z2, long j2);

        adn zza(adn adn, adn adn2);

        zzfes zza(boolean z, zzfes zzfes, boolean z2, zzfes zzfes2);

        zzfgc zza(zzfgc zzfgc, zzfgc zzfgc2);

        <T> zzfgd<T> zza(zzfgd<T> zzfgd, zzfgd<T> zzfgd2);

        <K, V> zzfgy<K, V> zza(zzfgy<K, V> zzfgy, zzfgy<K, V> zzfgy2);

        <T extends zzfhe> T zza(T t, T t2);

        Object zza(boolean z, Object obj, Object obj2);

        String zza(boolean z, String str, boolean z2, String str2);

        boolean zza(boolean z, boolean z2, boolean z3, boolean z4);

        Object zzb(boolean z, Object obj, Object obj2);

        Object zzc(boolean z, Object obj, Object obj2);

        Object zzd(boolean z, Object obj, Object obj2);

        void zzdf(boolean z);

        Object zze(boolean z, Object obj, Object obj2);

        Object zzf(boolean z, Object obj, Object obj2);

        Object zzg(boolean z, Object obj, Object obj2);
    }

    /* renamed from: com.google.android.gms.internal.zzffu$c */
    static class C6277c implements zzh {
        /* renamed from: a */
        static final C6277c f23546a = new C6277c();
        /* renamed from: b */
        private static zzffv f23547b = new zzffv();

        private C6277c() {
        }

        public final double zza(boolean z, double d, boolean z2, double d2) {
            if (z == z2) {
                if (d == d2) {
                    return d;
                }
            }
            throw f23547b;
        }

        public final int zza(boolean z, int i, boolean z2, int i2) {
            if (z == z2) {
                if (i == i2) {
                    return i;
                }
            }
            throw f23547b;
        }

        public final long zza(boolean z, long j, boolean z2, long j2) {
            if (z == z2) {
                if (j == j2) {
                    return j;
                }
            }
            throw f23547b;
        }

        public final adn zza(adn adn, adn adn2) {
            if (adn.equals(adn2)) {
                return adn;
            }
            throw f23547b;
        }

        public final zzfes zza(boolean z, zzfes zzfes, boolean z2, zzfes zzfes2) {
            if (z == z2) {
                if (zzfes.equals(zzfes2)) {
                    return zzfes;
                }
            }
            throw f23547b;
        }

        public final zzfgc zza(zzfgc zzfgc, zzfgc zzfgc2) {
            if (zzfgc.equals(zzfgc2)) {
                return zzfgc;
            }
            throw f23547b;
        }

        public final <T> zzfgd<T> zza(zzfgd<T> zzfgd, zzfgd<T> zzfgd2) {
            if (zzfgd.equals(zzfgd2)) {
                return zzfgd;
            }
            throw f23547b;
        }

        public final <K, V> zzfgy<K, V> zza(zzfgy<K, V> zzfgy, zzfgy<K, V> zzfgy2) {
            if (zzfgy.equals(zzfgy2)) {
                return zzfgy;
            }
            throw f23547b;
        }

        public final <T extends zzfhe> T zza(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t != null) {
                if (t2 != null) {
                    T t3 = (zzffu) t;
                    if (t3 != t2 && ((zzffu) t3.mo7626a(C4479g.f16693i, null, null)).getClass().isInstance(t2)) {
                        Object obj = (zzffu) t2;
                        t3.mo7626a(C4479g.f16686b, (Object) this, obj);
                        t3.f28829b = zza(t3.f28829b, obj.f28829b);
                    }
                    return t;
                }
            }
            throw f23547b;
        }

        public final Object zza(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw f23547b;
        }

        public final String zza(boolean z, String str, boolean z2, String str2) {
            if (z == z2) {
                if (str.equals(str2)) {
                    return str;
                }
            }
            throw f23547b;
        }

        public final boolean zza(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3) {
                if (z2 == z4) {
                    return z2;
                }
            }
            throw f23547b;
        }

        public final Object zzb(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw f23547b;
        }

        public final Object zzc(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw f23547b;
        }

        public final Object zzd(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw f23547b;
        }

        public final void zzdf(boolean z) {
            if (z) {
                throw f23547b;
            }
        }

        public final Object zze(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw f23547b;
        }

        public final Object zzf(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw f23547b;
        }

        public final Object zzg(boolean z, Object obj, Object obj2) {
            if (z) {
                zzffu zzffu = (zzffu) obj;
                obj2 = (zzfhe) obj2;
                Object obj3 = 1;
                if (zzffu != obj2) {
                    if (((zzffu) zzffu.mo7626a(C4479g.f16693i, null, null)).getClass().isInstance(obj2)) {
                        obj2 = (zzffu) obj2;
                        zzffu.mo7626a(C4479g.f16686b, (Object) this, obj2);
                        zzffu.f28829b = zza(zzffu.f28829b, obj2.f28829b);
                    } else {
                        obj3 = null;
                    }
                }
                if (obj3 != null) {
                    return obj;
                }
            }
            throw f23547b;
        }
    }

    /* renamed from: com.google.android.gms.internal.zzffu$e */
    static class C6278e implements zzh {
        /* renamed from: a */
        int f23548a = 0;

        C6278e() {
        }

        public final double zza(boolean z, double d, boolean z2, double d2) {
            this.f23548a = (this.f23548a * 53) + abx.m18856a(Double.doubleToLongBits(d));
            return d;
        }

        public final int zza(boolean z, int i, boolean z2, int i2) {
            this.f23548a = (this.f23548a * 53) + i;
            return i;
        }

        public final long zza(boolean z, long j, boolean z2, long j2) {
            this.f23548a = (this.f23548a * 53) + abx.m18856a(j);
            return j;
        }

        public final adn zza(adn adn, adn adn2) {
            this.f23548a = (this.f23548a * 53) + adn.hashCode();
            return adn;
        }

        public final zzfes zza(boolean z, zzfes zzfes, boolean z2, zzfes zzfes2) {
            this.f23548a = (this.f23548a * 53) + zzfes.hashCode();
            return zzfes;
        }

        public final zzfgc zza(zzfgc zzfgc, zzfgc zzfgc2) {
            this.f23548a = (this.f23548a * 53) + zzfgc.hashCode();
            return zzfgc;
        }

        public final <T> zzfgd<T> zza(zzfgd<T> zzfgd, zzfgd<T> zzfgd2) {
            this.f23548a = (this.f23548a * 53) + zzfgd.hashCode();
            return zzfgd;
        }

        public final <K, V> zzfgy<K, V> zza(zzfgy<K, V> zzfgy, zzfgy<K, V> zzfgy2) {
            this.f23548a = (this.f23548a * 53) + zzfgy.hashCode();
            return zzfgy;
        }

        public final <T extends zzfhe> T zza(T t, T t2) {
            int i;
            if (t == null) {
                i = 37;
            } else if (t instanceof zzffu) {
                Object obj = (zzffu) t;
                if (obj.a == 0) {
                    int i2 = this.f23548a;
                    this.f23548a = 0;
                    obj.mo7626a(C4479g.f16686b, (Object) this, obj);
                    obj.f28829b = zza(obj.f28829b, obj.f28829b);
                    obj.a = this.f23548a;
                    this.f23548a = i2;
                }
                i = obj.a;
            } else {
                i = t.hashCode();
            }
            this.f23548a = (this.f23548a * 53) + i;
            return t;
        }

        public final Object zza(boolean z, Object obj, Object obj2) {
            this.f23548a = (this.f23548a * 53) + abx.m18857a(((Boolean) obj).booleanValue());
            return obj;
        }

        public final String zza(boolean z, String str, boolean z2, String str2) {
            this.f23548a = (this.f23548a * 53) + str.hashCode();
            return str;
        }

        public final boolean zza(boolean z, boolean z2, boolean z3, boolean z4) {
            this.f23548a = (this.f23548a * 53) + abx.m18857a(z2);
            return z2;
        }

        public final Object zzb(boolean z, Object obj, Object obj2) {
            this.f23548a = (this.f23548a * 53) + ((Integer) obj).intValue();
            return obj;
        }

        public final Object zzc(boolean z, Object obj, Object obj2) {
            this.f23548a = (this.f23548a * 53) + abx.m18856a(Double.doubleToLongBits(((Double) obj).doubleValue()));
            return obj;
        }

        public final Object zzd(boolean z, Object obj, Object obj2) {
            this.f23548a = (this.f23548a * 53) + abx.m18856a(((Long) obj).longValue());
            return obj;
        }

        public final void zzdf(boolean z) {
            if (z) {
                throw new IllegalStateException();
            }
        }

        public final Object zze(boolean z, Object obj, Object obj2) {
            this.f23548a = (this.f23548a * 53) + obj.hashCode();
            return obj;
        }

        public final Object zzf(boolean z, Object obj, Object obj2) {
            this.f23548a = (this.f23548a * 53) + obj.hashCode();
            return obj;
        }

        public final Object zzg(boolean z, Object obj, Object obj2) {
            return zza((zzfhe) obj, (zzfhe) obj2);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzffu$f */
    public static class C6279f implements zzh {
        /* renamed from: a */
        public static final C6279f f23549a = new C6279f();

        private C6279f() {
        }

        public final double zza(boolean z, double d, boolean z2, double d2) {
            return z2 ? d2 : d;
        }

        public final int zza(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }

        public final long zza(boolean z, long j, boolean z2, long j2) {
            return z2 ? j2 : j;
        }

        public final adn zza(adn adn, adn adn2) {
            return adn2 == adn.m18920a() ? adn : adn.m18921a(adn, adn2);
        }

        public final zzfes zza(boolean z, zzfes zzfes, boolean z2, zzfes zzfes2) {
            return z2 ? zzfes2 : zzfes;
        }

        public final zzfgc zza(zzfgc zzfgc, zzfgc zzfgc2) {
            int size = zzfgc.size();
            int size2 = zzfgc2.size();
            if (size > 0 && size2 > 0) {
                if (!zzfgc.zzcvi()) {
                    zzfgc = zzfgc.zzlu(size2 + size);
                }
                zzfgc.addAll(zzfgc2);
            }
            return size > 0 ? zzfgc : zzfgc2;
        }

        public final <T> zzfgd<T> zza(zzfgd<T> zzfgd, zzfgd<T> zzfgd2) {
            int size = zzfgd.size();
            int size2 = zzfgd2.size();
            if (size > 0 && size2 > 0) {
                if (!zzfgd.zzcvi()) {
                    zzfgd = zzfgd.zzly(size2 + size);
                }
                zzfgd.addAll(zzfgd2);
            }
            return size > 0 ? zzfgd : zzfgd2;
        }

        public final <K, V> zzfgy<K, V> zza(zzfgy<K, V> zzfgy, zzfgy<K, V> zzfgy2) {
            if (!zzfgy2.isEmpty()) {
                if (!zzfgy.m20328b()) {
                    zzfgy = zzfgy.m20326a();
                }
                zzfgy.m20327a((zzfgy) zzfgy2);
            }
            return zzfgy;
        }

        public final <T extends zzfhe> T zza(T t, T t2) {
            return (t == null || t2 == null) ? t != null ? t : t2 : t.zzcxp().zzd(t2).zzcxv();
        }

        public final Object zza(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public final String zza(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        public final boolean zza(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }

        public final Object zzb(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public final Object zzc(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public final Object zzd(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public final void zzdf(boolean z) {
        }

        public final Object zze(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public final Object zzf(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        public final Object zzg(boolean z, Object obj, Object obj2) {
            return z ? zza((zzfhe) obj, (zzfhe) obj2) : obj2;
        }
    }

    /* renamed from: com.google.android.gms.internal.zzffu$b */
    public static class C7363b<T extends zzffu<T, ?>> extends abc<T> {
        /* renamed from: a */
        private T f27077a;

        public C7363b(T t) {
            this.f27077a = t;
        }

        public final /* synthetic */ Object zze(abk abk, abq abq) throws zzfge {
            return zzffu.m34104a(this.f27077a, abk, abq);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzffu$a */
    public static abstract class C8036a<MessageType extends zzffu<MessageType, BuilderType>, BuilderType extends C8036a<MessageType, BuilderType>> extends aba<MessageType, BuilderType> {
        /* renamed from: a */
        protected MessageType f28825a;
        /* renamed from: b */
        private final MessageType f28826b;
        /* renamed from: c */
        private boolean f28827c = false;

        protected C8036a(MessageType messageType) {
            this.f28826b = messageType;
            this.f28825a = (zzffu) messageType.mo7626a(C4479g.f16691g, null, null);
        }

        /* renamed from: a */
        private static void m34095a(MessageType messageType, MessageType messageType2) {
            Object obj = C6279f.f23549a;
            messageType.mo7626a(C4479g.f16686b, obj, (Object) messageType2);
            messageType.f28829b = obj.zza(messageType.f28829b, messageType2.f28829b);
        }

        /* renamed from: b */
        private final BuilderType m34096b(abk abk, abq abq) throws IOException {
            m34101b();
            try {
                this.f28825a.mo7626a(C4479g.f16689e, (Object) abk, (Object) abq);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* renamed from: a */
        public final /* synthetic */ aba mo7505a() {
            return (C8036a) clone();
        }

        /* renamed from: a */
        protected final /* synthetic */ aba mo7506a(aaz aaz) {
            return m34100a((zzffu) aaz);
        }

        /* renamed from: a */
        public final /* synthetic */ aba mo7507a(abk abk, abq abq) throws IOException {
            return (C8036a) zzb(abk, abq);
        }

        /* renamed from: a */
        public final BuilderType m34100a(MessageType messageType) {
            m34101b();
            C8036a.m34095a(this.f28825a, (zzffu) messageType);
            return this;
        }

        /* renamed from: b */
        protected final void m34101b() {
            if (this.f28827c) {
                zzffu zzffu = (zzffu) this.f28825a.mo7626a(C4479g.f16691g, null, null);
                C8036a.m34095a(zzffu, this.f28825a);
                this.f28825a = zzffu;
                this.f28827c = false;
            }
        }

        /* renamed from: c */
        public final MessageType m34102c() {
            if (this.f28827c) {
                return this.f28825a;
            }
            zzffu zzffu = this.f28825a;
            zzffu.mo7626a(C4479g.f16690f, null, null);
            zzffu.f28829b.m18929c();
            this.f28827c = true;
            return this.f28825a;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            C8036a c8036a = (C8036a) this.f28826b.mo7626a(C4479g.f16692h, null, null);
            if (!this.f28827c) {
                zzffu zzffu = this.f28825a;
                zzffu.mo7626a(C4479g.f16690f, null, null);
                zzffu.f28829b.m18929c();
                this.f28827c = true;
            }
            c8036a.m34100a(this.f28825a);
            return c8036a;
        }

        /* renamed from: d */
        public final MessageType m34103d() {
            zzffu zzffu;
            boolean z = true;
            if (!this.f28827c) {
                zzffu = this.f28825a;
                zzffu.mo7626a(C4479g.f16690f, null, null);
                zzffu.f28829b.m18929c();
                this.f28827c = true;
            }
            zzffu = this.f28825a;
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) zzffu.mo7626a(C4479g.f16687c, null, null)).byteValue();
            if (byteValue != (byte) 1) {
                if (byteValue == (byte) 0) {
                    z = false;
                } else {
                    if (zzffu.mo7626a(C4479g.f16685a, Boolean.FALSE, null) == null) {
                        z = false;
                    }
                    if (booleanValue) {
                        zzffu.mo7626a(C4479g.f16688d, z ? zzffu : null, null);
                    }
                }
            }
            if (z) {
                return zzffu;
            }
            throw new zzfim(zzffu);
        }

        public final boolean isInitialized() {
            return zzffu.m34110a(this.f28825a, false);
        }

        public final /* synthetic */ zzfhf zzb(abk abk, abq abq) throws IOException {
            return m34096b(abk, abq);
        }

        public final /* synthetic */ zzfhe zzcxq() {
            return this.f28826b;
        }

        public final /* synthetic */ zzfhe zzcxu() {
            if (this.f28827c) {
                return this.f28825a;
            }
            zzffu zzffu = this.f28825a;
            zzffu.mo7626a(C4479g.f16690f, null, null);
            zzffu.f28829b.m18929c();
            this.f28827c = true;
            return this.f28825a;
        }

        public final /* synthetic */ zzfhe zzcxv() {
            zzffu zzffu;
            boolean z = true;
            if (!this.f28827c) {
                zzffu = this.f28825a;
                zzffu.mo7626a(C4479g.f16690f, null, null);
                zzffu.f28829b.m18929c();
                this.f28827c = true;
            }
            zzffu = this.f28825a;
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) zzffu.mo7626a(C4479g.f16687c, null, null)).byteValue();
            if (byteValue != (byte) 1) {
                if (byteValue == (byte) 0) {
                    z = false;
                } else {
                    if (zzffu.mo7626a(C4479g.f16685a, Boolean.FALSE, null) == null) {
                        z = false;
                    }
                    if (booleanValue) {
                        zzffu.mo7626a(C4479g.f16688d, z ? zzffu : null, null);
                    }
                }
            }
            if (z) {
                return zzffu;
            }
            throw new zzfim(zzffu);
        }
    }

    /* renamed from: com.google.android.gms.internal.zzffu$d */
    public static abstract class C8193d<MessageType extends C8193d<MessageType, BuilderType>, BuilderType> extends zzffu<MessageType, BuilderType> implements zzfhg {
        /* renamed from: d */
        protected abu<Object> f29328d = abu.m18848a();
    }

    /* renamed from: a */
    static <T extends zzffu<T, ?>> T m34104a(T t, abk abk, abq abq) throws zzfge {
        zzffu zzffu = (zzffu) t.mo7626a(C4479g.f16691g, null, null);
        try {
            zzffu.mo7626a(C4479g.f16689e, (Object) abk, (Object) abq);
            zzffu.mo7626a(C4479g.f16690f, null, null);
            zzffu.f28829b.m18929c();
            return zzffu;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof zzfge) {
                throw ((zzfge) e.getCause());
            }
            throw e;
        }
    }

    /* renamed from: a */
    protected static <T extends zzffu<T, ?>> T m34105a(T t, zzfes zzfes) throws zzfge {
        boolean booleanValue;
        byte byteValue;
        t = m34106a((zzffu) t, zzfes, abq.m18839a());
        Object obj = null;
        if (t != null) {
            Object obj2;
            booleanValue = Boolean.TRUE.booleanValue();
            byteValue = ((Byte) t.mo7626a(C4479g.f16687c, null, null)).byteValue();
            if (byteValue == (byte) 1) {
                obj2 = 1;
            } else if (byteValue == (byte) 0) {
                obj2 = null;
            } else {
                obj2 = t.mo7626a(C4479g.f16685a, Boolean.FALSE, null) != null ? 1 : null;
                if (booleanValue) {
                    t.mo7626a(C4479g.f16688d, obj2 != null ? t : null, null);
                }
            }
            if (obj2 == null) {
                throw new zzfim(t).m20329a().m20323a(t);
            }
        }
        if (t != null) {
            booleanValue = Boolean.TRUE.booleanValue();
            byteValue = ((Byte) t.mo7626a(C4479g.f16687c, null, null)).byteValue();
            if (byteValue == (byte) 1) {
                obj = 1;
            } else if (byteValue != (byte) 0) {
                if (t.mo7626a(C4479g.f16685a, Boolean.FALSE, null) != null) {
                    obj = 1;
                }
                if (booleanValue) {
                    t.mo7626a(C4479g.f16688d, obj != null ? t : null, null);
                }
            }
            if (obj == null) {
                throw new zzfim(t).m20329a().m20323a(t);
            }
        }
        return t;
    }

    /* renamed from: a */
    private static <T extends zzffu<T, ?>> T m34106a(T t, zzfes zzfes, abq abq) throws zzfge {
        try {
            abk d = zzfes.mo6936d();
            t = m34104a((zzffu) t, d, abq);
            d.mo4176a(0);
            return t;
        } catch (zzfge e) {
            throw e.m20323a(t);
        } catch (zzfge e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    protected static <T extends zzffu<T, ?>> T m34107a(T t, byte[] bArr) throws zzfge {
        t = m34108a((zzffu) t, bArr, abq.m18839a());
        if (t != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) t.mo7626a(C4479g.f16687c, null, null)).byteValue();
            Object obj = null;
            if (byteValue == (byte) 1) {
                obj = 1;
            } else if (byteValue != (byte) 0) {
                if (t.mo7626a(C4479g.f16685a, Boolean.FALSE, null) != null) {
                    obj = 1;
                }
                if (booleanValue) {
                    t.mo7626a(C4479g.f16688d, obj != null ? t : null, null);
                }
            }
            if (obj == null) {
                throw new zzfim(t).m20329a().m20323a(t);
            }
        }
        return t;
    }

    /* renamed from: a */
    private static <T extends zzffu<T, ?>> T m34108a(T t, byte[] bArr, abq abq) throws zzfge {
        try {
            abk a = abk.m18816a(bArr);
            t = m34104a((zzffu) t, a, abq);
            a.mo4176a(0);
            return t;
        } catch (zzfge e) {
            throw e.m20323a(t);
        } catch (zzfge e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    static Object m34109a(Method method, Object obj, Object... objArr) {
        Throwable e;
        try {
            return method.invoke(obj, objArr);
        } catch (Throwable e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            e2 = e3.getCause();
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            } else if (e2 instanceof Error) {
                throw ((Error) e2);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", e2);
            }
        }
    }

    /* renamed from: a */
    protected static final <T extends zzffu<T, ?>> boolean m34110a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo7626a(C4479g.f16687c, null, null)).byteValue();
        return byteValue == (byte) 1 ? true : byteValue == (byte) 0 ? false : t.mo7626a(C4479g.f16685a, Boolean.FALSE, null) != null;
    }

    /* renamed from: i */
    protected static <E> zzfgd<E> m34111i() {
        return acv.m31337b();
    }

    /* renamed from: a */
    protected abstract Object mo7626a(int i, Object obj, Object obj2);

    /* renamed from: a */
    protected final boolean m34113a(int i, abk abk) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.f28829b == adn.m18920a()) {
            this.f28829b = adn.m18923b();
        }
        return this.f28829b.m18928a(i, abk);
    }

    public boolean equals(java.lang.Object r5) {
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
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = com.google.android.gms.internal.zzffu.C4479g.f16693i;
        r2 = 0;
        r1 = r4.mo7626a(r1, r2, r2);
        r1 = (com.google.android.gms.internal.zzffu) r1;
        r1 = r1.getClass();
        r1 = r1.isInstance(r5);
        r2 = 0;
        if (r1 != 0) goto L_0x0019;
    L_0x0018:
        return r2;
    L_0x0019:
        r1 = com.google.android.gms.internal.zzffu.C6277c.f23546a;	 Catch:{ zzffv -> 0x002d }
        r5 = (com.google.android.gms.internal.zzffu) r5;	 Catch:{ zzffv -> 0x002d }
        r3 = com.google.android.gms.internal.zzffu.C4479g.f16686b;	 Catch:{ zzffv -> 0x002d }
        r4.mo7626a(r3, r1, r5);	 Catch:{ zzffv -> 0x002d }
        r3 = r4.f28829b;	 Catch:{ zzffv -> 0x002d }
        r5 = r5.f28829b;	 Catch:{ zzffv -> 0x002d }
        r5 = r1.zza(r3, r5);	 Catch:{ zzffv -> 0x002d }
        r4.f28829b = r5;	 Catch:{ zzffv -> 0x002d }
        return r0;
    L_0x002d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzffu.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (this.a != 0) {
            return this.a;
        }
        Object c6278e = new C6278e();
        mo7626a(C4479g.f16686b, c6278e, (Object) this);
        this.f28829b = c6278e.zza(this.f28829b, this.f28829b);
        this.a = c6278e.f23548a;
        return this.a;
    }

    public final boolean isInitialized() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo7626a(C4479g.f16687c, null, null)).byteValue();
        boolean z = true;
        if (byteValue == (byte) 1) {
            return true;
        }
        if (byteValue == (byte) 0) {
            return false;
        }
        if (mo7626a(C4479g.f16685a, Boolean.FALSE, null) == null) {
            z = false;
        }
        if (booleanValue) {
            mo7626a(C4479g.f16688d, z ? this : null, null);
        }
        return z;
    }

    public String toString() {
        return acq.m18878a(this, super.toString());
    }

    public void zza(zzffg zzffg) throws IOException {
        acu.m18882a().m18884a(getClass()).mo4202a(this, abo.m27010a(zzffg));
    }

    public final zzfhk<MessageType> zzcxm() {
        return (zzfhk) mo7626a(C4479g.f16694j, null, null);
    }

    public final /* synthetic */ zzfhf zzcxp() {
        C8036a c8036a = (C8036a) mo7626a(C4479g.f16692h, null, null);
        c8036a.m34100a(this);
        return c8036a;
    }

    public final /* synthetic */ zzfhe zzcxq() {
        return (zzffu) mo7626a(C4479g.f16693i, null, null);
    }

    public int zzho() {
        if (this.f28830c == -1) {
            this.f28830c = acu.m18882a().m18884a(getClass()).mo4201a(this);
        }
        return this.f28830c;
    }
}
