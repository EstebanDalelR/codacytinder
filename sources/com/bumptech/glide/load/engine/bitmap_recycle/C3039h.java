package com.bumptech.glide.load.engine.bitmap_recycle;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.p026d.C0987h;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

@TargetApi(19)
/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.h */
public class C3039h implements C1011f {
    /* renamed from: a */
    private static final Config[] f9471a = new Config[]{Config.ARGB_8888, null};
    /* renamed from: b */
    private static final Config[] f9472b = new Config[]{Config.RGB_565};
    /* renamed from: c */
    private static final Config[] f9473c = new Config[]{Config.ARGB_4444};
    /* renamed from: d */
    private static final Config[] f9474d = new Config[]{Config.ALPHA_8};
    /* renamed from: e */
    private final C3038b f9475e = new C3038b();
    /* renamed from: f */
    private final C1008d<C3037a, Bitmap> f9476f = new C1008d();
    /* renamed from: g */
    private final Map<Config, NavigableMap<Integer, Integer>> f9477g = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.h$1 */
    static /* synthetic */ class C10131 {
        /* renamed from: a */
        static final /* synthetic */ int[] f2818a = new int[Config.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = android.graphics.Bitmap.Config.values();
            r0 = r0.length;
            r0 = new int[r0];
            f2818a = r0;
            r0 = f2818a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f2818a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f2818a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.graphics.Bitmap.Config.ARGB_4444;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f2818a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = android.graphics.Bitmap.Config.ALPHA_8;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.bitmap_recycle.h.1.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.h$a */
    static final class C3037a implements C1012g {
        /* renamed from: a */
        private final C3038b f9468a;
        /* renamed from: b */
        private int f9469b;
        /* renamed from: c */
        private Config f9470c;

        public C3037a(C3038b c3038b) {
            this.f9468a = c3038b;
        }

        /* renamed from: a */
        public void m11974a(int i, Config config) {
            this.f9469b = i;
            this.f9470c = config;
        }

        /* renamed from: a */
        public void mo1280a() {
            this.f9468a.m3526a(this);
        }

        public String toString() {
            return C3039h.m11982b(this.f9469b, this.f9470c);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
            r3 = this;
            r0 = r4 instanceof com.bumptech.glide.load.engine.bitmap_recycle.C3039h.C3037a;
            r1 = 0;
            if (r0 == 0) goto L_0x0022;
        L_0x0005:
            r4 = (com.bumptech.glide.load.engine.bitmap_recycle.C3039h.C3037a) r4;
            r0 = r3.f9469b;
            r2 = r4.f9469b;
            if (r0 != r2) goto L_0x0021;
        L_0x000d:
            r0 = r3.f9470c;
            if (r0 != 0) goto L_0x0016;
        L_0x0011:
            r4 = r4.f9470c;
            if (r4 != 0) goto L_0x0021;
        L_0x0015:
            goto L_0x0020;
        L_0x0016:
            r0 = r3.f9470c;
            r4 = r4.f9470c;
            r4 = r0.equals(r4);
            if (r4 == 0) goto L_0x0021;
        L_0x0020:
            r1 = 1;
        L_0x0021:
            return r1;
        L_0x0022:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.bitmap_recycle.h.a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (this.f9469b * 31) + (this.f9470c != null ? this.f9470c.hashCode() : 0);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.h$b */
    static class C3038b extends C1006b<C3037a> {
        C3038b() {
        }

        /* renamed from: b */
        protected /* synthetic */ C1012g mo1281b() {
            return m11975a();
        }

        /* renamed from: a */
        public C3037a m11976a(int i, Config config) {
            C3037a c3037a = (C3037a) m3528c();
            c3037a.m11974a(i, config);
            return c3037a;
        }

        /* renamed from: a */
        protected C3037a m11975a() {
            return new C3037a(this);
        }
    }

    /* renamed from: a */
    public void mo1284a(Bitmap bitmap) {
        C3037a a = this.f9475e.m11976a(C0987h.m3406a(bitmap), bitmap.getConfig());
        this.f9476f.m3539a(a, bitmap);
        bitmap = m11980a(bitmap.getConfig());
        Integer num = (Integer) bitmap.get(Integer.valueOf(a.f9469b));
        Integer valueOf = Integer.valueOf(a.f9469b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        bitmap.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: a */
    public Bitmap mo1283a(int i, int i2, Config config) {
        int a = C0987h.m3404a(i, i2, config);
        Bitmap bitmap = (Bitmap) this.f9476f.m3538a(m11978a(this.f9475e.m11976a(a, config), a, config));
        if (bitmap != null) {
            m11981a(Integer.valueOf(C0987h.m3406a(bitmap)), bitmap.getConfig());
            bitmap.reconfigure(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
        }
        return bitmap;
    }

    /* renamed from: a */
    private C3037a m11978a(C3037a c3037a, int i, Config config) {
        Config[] b = C3039h.m11983b(config);
        int length = b.length;
        int i2 = 0;
        while (i2 < length) {
            Config config2 = b[i2];
            Integer num = (Integer) m11980a(config2).ceilingKey(Integer.valueOf(i));
            if (num == null || num.intValue() > i * 8) {
                i2++;
            } else {
                if (num.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return c3037a;
                        }
                    } else if (config2.equals(config) != 0) {
                        return c3037a;
                    }
                }
                this.f9475e.m3526a(c3037a);
                return this.f9475e.m11976a(num.intValue(), config2);
            }
        }
        return c3037a;
    }

    /* renamed from: a */
    public Bitmap mo1282a() {
        Bitmap bitmap = (Bitmap) this.f9476f.m3537a();
        if (bitmap != null) {
            m11981a(Integer.valueOf(C0987h.m3406a(bitmap)), bitmap.getConfig());
        }
        return bitmap;
    }

    /* renamed from: a */
    private void m11981a(Integer num, Config config) {
        config = m11980a(config);
        Integer num2 = (Integer) config.get(num);
        if (num2.intValue() == 1) {
            config.remove(num);
        } else {
            config.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: a */
    private NavigableMap<Integer, Integer> m11980a(Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f9477g.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        NavigableMap treeMap = new TreeMap();
        this.f9477g.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: b */
    public String mo1286b(Bitmap bitmap) {
        return C3039h.m11982b(C0987h.m3406a(bitmap), bitmap.getConfig());
    }

    /* renamed from: b */
    public String mo1285b(int i, int i2, Config config) {
        return C3039h.m11982b(C0987h.m3404a(i, i2, config), config);
    }

    /* renamed from: c */
    public int mo1287c(Bitmap bitmap) {
        return C0987h.m3406a(bitmap);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SizeConfigStrategy{groupedMap=");
        stringBuilder.append(this.f9476f);
        stringBuilder.append(", sortedSizes=(");
        for (Entry entry : this.f9477g.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append('[');
            stringBuilder.append(entry.getValue());
            stringBuilder.append("], ");
        }
        if (!this.f9477g.isEmpty()) {
            stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), "");
        }
        stringBuilder.append(")}");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private static String m11982b(int i, Config config) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(i);
        stringBuilder.append("](");
        stringBuilder.append(config);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private static Config[] m11983b(Config config) {
        switch (C10131.f2818a[config.ordinal()]) {
            case 1:
                return f9471a;
            case 2:
                return f9472b;
            case 3:
                return f9473c;
            case 4:
                return f9474d;
            default:
                return new Config[]{config};
        }
    }
}
