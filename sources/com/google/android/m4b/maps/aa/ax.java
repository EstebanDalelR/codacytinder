package com.google.android.m4b.maps.aa;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.google.android.m4b.maps.aa.bo.C4573a;
import com.google.android.m4b.maps.p125y.C5566g.C5565a;
import com.google.android.m4b.maps.p125y.C5569h;
import com.google.android.m4b.maps.p125y.C5571j;
import com.google.android.m4b.maps.p125y.C6849f;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public final class ax {
    /* renamed from: a */
    private static C5565a f16951a = C4584j.f16988a.m24274c("=");

    /* renamed from: com.google.android.m4b.maps.aa.ax$c */
    static abstract class C4567c<K, V> extends AbstractMap<K, V> {
        /* renamed from: a */
        private transient Set<Entry<K, V>> f16947a;
        /* renamed from: b */
        private transient Set<K> f16948b;
        /* renamed from: c */
        private transient Collection<V> f16949c;

        /* renamed from: a */
        abstract Set<Entry<K, V>> mo4831a();

        C4567c() {
        }

        public Set<Entry<K, V>> entrySet() {
            Set<Entry<K, V>> set = this.f16947a;
            if (set != null) {
                return set;
            }
            set = mo4831a();
            this.f16947a = set;
            return set;
        }

        public Set<K> keySet() {
            Set<K> set = this.f16948b;
            if (set != null) {
                return set;
            }
            set = mo7014b();
            this.f16948b = set;
            return set;
        }

        /* renamed from: b */
        Set<K> mo7014b() {
            return new C6347d(this);
        }

        public Collection<V> values() {
            Collection<V> collection = this.f16949c;
            if (collection != null) {
                return collection;
            }
            collection = new C4568e(this);
            this.f16949c = collection;
            return collection;
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.ax$e */
    static class C4568e<K, V> extends AbstractCollection<V> {
        /* renamed from: a */
        private Map<K, V> f16950a;

        C4568e(Map<K, V> map) {
            this.f16950a = (Map) C5571j.m24292a((Object) map);
        }

        public final boolean remove(java.lang.Object r4) {
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
            r3 = this;
            r0 = super.remove(r4);	 Catch:{ UnsupportedOperationException -> 0x0005 }
            return r0;
        L_0x0005:
            r0 = r3.f16950a;
            r0 = r0.entrySet();
            r0 = r0.iterator();
        L_0x000f:
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x0030;
        L_0x0015:
            r1 = r0.next();
            r1 = (java.util.Map.Entry) r1;
            r2 = r1.getValue();
            r2 = com.google.android.m4b.maps.p125y.C5569h.m24284a(r4, r2);
            if (r2 == 0) goto L_0x000f;
        L_0x0025:
            r4 = r3.f16950a;
            r0 = r1.getKey();
            r4.remove(r0);
            r4 = 1;
            return r4;
        L_0x0030:
            r4 = 0;
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aa.ax.e.remove(java.lang.Object):boolean");
        }

        public final boolean removeAll(java.util.Collection<?> r5) {
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
            r4 = this;
            r0 = com.google.android.m4b.maps.p125y.C5571j.m24292a(r5);	 Catch:{ UnsupportedOperationException -> 0x000b }
            r0 = (java.util.Collection) r0;	 Catch:{ UnsupportedOperationException -> 0x000b }
            r0 = super.removeAll(r0);	 Catch:{ UnsupportedOperationException -> 0x000b }
            return r0;
        L_0x000b:
            r0 = new java.util.HashSet;
            r0.<init>();
            r1 = r4.f16950a;
            r1 = r1.entrySet();
            r1 = r1.iterator();
        L_0x001a:
            r2 = r1.hasNext();
            if (r2 == 0) goto L_0x0038;
        L_0x0020:
            r2 = r1.next();
            r2 = (java.util.Map.Entry) r2;
            r3 = r2.getValue();
            r3 = r5.contains(r3);
            if (r3 == 0) goto L_0x001a;
        L_0x0030:
            r2 = r2.getKey();
            r0.add(r2);
            goto L_0x001a;
        L_0x0038:
            r5 = r4.f16950a;
            r5 = r5.keySet();
            r5 = r5.removeAll(r0);
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aa.ax.e.removeAll(java.util.Collection):boolean");
        }

        public final boolean retainAll(java.util.Collection<?> r5) {
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
            r4 = this;
            r0 = com.google.android.m4b.maps.p125y.C5571j.m24292a(r5);	 Catch:{ UnsupportedOperationException -> 0x000b }
            r0 = (java.util.Collection) r0;	 Catch:{ UnsupportedOperationException -> 0x000b }
            r0 = super.retainAll(r0);	 Catch:{ UnsupportedOperationException -> 0x000b }
            return r0;
        L_0x000b:
            r0 = new java.util.HashSet;
            r0.<init>();
            r1 = r4.f16950a;
            r1 = r1.entrySet();
            r1 = r1.iterator();
        L_0x001a:
            r2 = r1.hasNext();
            if (r2 == 0) goto L_0x0038;
        L_0x0020:
            r2 = r1.next();
            r2 = (java.util.Map.Entry) r2;
            r3 = r2.getValue();
            r3 = r5.contains(r3);
            if (r3 == 0) goto L_0x001a;
        L_0x0030:
            r2 = r2.getKey();
            r0.add(r2);
            goto L_0x001a;
        L_0x0038:
            r5 = r4.f16950a;
            r5 = r5.keySet();
            r5 = r5.retainAll(r0);
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aa.ax.e.retainAll(java.util.Collection):boolean");
        }

        public final Iterator<V> iterator() {
            return ax.m20624b(this.f16950a.entrySet().iterator());
        }

        public final int size() {
            return this.f16950a.size();
        }

        public final boolean isEmpty() {
            return this.f16950a.isEmpty();
        }

        public final boolean contains(Object obj) {
            return this.f16950a.containsValue(obj);
        }

        public final void clear() {
            this.f16950a.clear();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.ax$b */
    static abstract class C6346b<K, V> extends C4573a<Entry<K, V>> {
        /* renamed from: a */
        abstract Map<K, V> mo7008a();

        C6346b() {
        }

        public int size() {
            return mo7008a().size();
        }

        public void clear() {
            mo7008a().clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object a = ax.m20616a(mo7008a(), key);
            if (C5569h.m24284a(a, entry.getValue()) == null || (a == null && mo7008a().containsKey(key) == null)) {
                return false;
            }
            return true;
        }

        public boolean isEmpty() {
            return mo7008a().isEmpty();
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return null;
            }
            return mo7008a().keySet().remove(((Entry) obj).getKey());
        }

        public boolean removeAll(java.util.Collection<?> r2) {
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
            r1 = this;
            r0 = com.google.android.m4b.maps.p125y.C5571j.m24292a(r2);	 Catch:{ UnsupportedOperationException -> 0x000b }
            r0 = (java.util.Collection) r0;	 Catch:{ UnsupportedOperationException -> 0x000b }
            r0 = super.removeAll(r0);	 Catch:{ UnsupportedOperationException -> 0x000b }
            return r0;
        L_0x000b:
            r2 = r2.iterator();
            r2 = com.google.android.m4b.maps.aa.bo.m20657a(r1, r2);
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aa.ax.b.removeAll(java.util.Collection):boolean");
        }

        public boolean retainAll(java.util.Collection<?> r4) {
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
            r3 = this;
            r0 = com.google.android.m4b.maps.p125y.C5571j.m24292a(r4);	 Catch:{ UnsupportedOperationException -> 0x000b }
            r0 = (java.util.Collection) r0;	 Catch:{ UnsupportedOperationException -> 0x000b }
            r0 = super.retainAll(r0);	 Catch:{ UnsupportedOperationException -> 0x000b }
            return r0;
        L_0x000b:
            r0 = r4.size();
            r0 = com.google.android.m4b.maps.aa.bo.m20651a(r0);
            r4 = r4.iterator();
        L_0x0017:
            r1 = r4.hasNext();
            if (r1 == 0) goto L_0x0031;
        L_0x001d:
            r1 = r4.next();
            r2 = r3.contains(r1);
            if (r2 == 0) goto L_0x0017;
        L_0x0027:
            r1 = (java.util.Map.Entry) r1;
            r1 = r1.getKey();
            r0.add(r1);
            goto L_0x0017;
        L_0x0031:
            r4 = r3.mo7008a();
            r4 = r4.keySet();
            r4 = r4.retainAll(r0);
            return r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aa.ax.b.retainAll(java.util.Collection):boolean");
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.ax$d */
    static class C6347d<K, V> extends C4573a<K> {
        /* renamed from: a */
        final Map<K, V> f23674a;

        C6347d(Map<K, V> map) {
            this.f23674a = (Map) C5571j.m24292a((Object) map);
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return null;
            }
            this.f23674a.remove(obj);
            return true;
        }

        public Iterator<K> iterator() {
            return ax.m20619a(this.f23674a.entrySet().iterator());
        }

        public int size() {
            return this.f23674a.size();
        }

        public boolean isEmpty() {
            return this.f23674a.isEmpty();
        }

        public boolean contains(Object obj) {
            return this.f23674a.containsKey(obj);
        }

        public void clear() {
            this.f23674a.clear();
        }
    }

    /* renamed from: com.google.android.m4b.maps.aa.ax$a */
    enum C7412a implements C6849f<Entry<?, ?>, Object> {
        KEY {
            /* renamed from: a */
            public final /* synthetic */ Object mo7022a(Object obj) {
                return ((Entry) obj).getKey();
            }
        },
        VALUE {
            /* renamed from: a */
            public final /* synthetic */ Object mo7022a(Object obj) {
                return ((Entry) obj).getValue();
            }
        };
    }

    /* renamed from: a */
    static <K> C6849f<Entry<K, ?>, K> m20615a() {
        return C7412a.KEY;
    }

    /* renamed from: a */
    static <K, V> bw<V> m20614a(final bw<Entry<K, V>> bwVar) {
        return new bw<V>() {
            public final boolean hasNext() {
                return bwVar.hasNext();
            }

            public final V next() {
                return ((Entry) bwVar.next()).getValue();
            }
        };
    }

    /* renamed from: b */
    public static <K, V> HashMap<K, V> m20623b() {
        return new HashMap();
    }

    /* renamed from: a */
    public static <K, V> HashMap<K, V> m20617a(int i) {
        return new HashMap(m20621b(i));
    }

    /* renamed from: b */
    static int m20621b(int i) {
        if (i >= 3) {
            return i < 1073741824 ? i + (i / 3) : ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        } else {
            C4583i.m20668a(i, "expectedSize");
            return i + 1;
        }
    }

    /* renamed from: a */
    public static <K, V> HashMap<K, V> m20618a(Map<? extends K, ? extends V> map) {
        return new HashMap(map);
    }

    /* renamed from: c */
    public static <K, V> LinkedHashMap<K, V> m20627c() {
        return new LinkedHashMap();
    }

    /* renamed from: d */
    public static <K, V> ConcurrentMap<K, V> m20628d() {
        return new av().m27722d();
    }

    /* renamed from: e */
    public static <K, V> IdentityHashMap<K, V> m20630e() {
        return new IdentityHashMap();
    }

    /* renamed from: a */
    public static <K, V> Entry<K, V> m20620a(K k, V v) {
        return new ab(k, v);
    }

    /* renamed from: a */
    static <V> V m20616a(java.util.Map<?, V> r1, java.lang.Object r2) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        com.google.android.m4b.maps.p125y.C5571j.m24292a(r1);
        r0 = 0;
        r1 = r1.get(r2);	 Catch:{ ClassCastException -> 0x000a, NullPointerException -> 0x0009 }
        return r1;
    L_0x0009:
        return r0;
    L_0x000a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aa.ax.a(java.util.Map, java.lang.Object):V");
    }

    /* renamed from: b */
    static boolean m20625b(java.util.Map<?, ?> r1, java.lang.Object r2) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        com.google.android.m4b.maps.p125y.C5571j.m24292a(r1);
        r0 = 0;
        r1 = r1.containsKey(r2);	 Catch:{ ClassCastException -> 0x000a, NullPointerException -> 0x0009 }
        return r1;
    L_0x0009:
        return r0;
    L_0x000a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aa.ax.b(java.util.Map, java.lang.Object):boolean");
    }

    /* renamed from: c */
    static <V> V m20626c(java.util.Map<?, V> r1, java.lang.Object r2) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        com.google.android.m4b.maps.p125y.C5571j.m24292a(r1);
        r0 = 0;
        r1 = r1.remove(r2);	 Catch:{ ClassCastException -> 0x000a, NullPointerException -> 0x0009 }
        return r1;
    L_0x0009:
        return r0;
    L_0x000a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.aa.ax.c(java.util.Map, java.lang.Object):V");
    }

    /* renamed from: d */
    static boolean m20629d(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return null;
        }
        return map.entrySet().equals(((Map) obj).entrySet());
    }

    /* renamed from: b */
    static String m20622b(Map<?, ?> map) {
        StringBuilder a = C4584j.m20670a(map.size());
        a.append('{');
        f16951a.m24264a(a, map.entrySet().iterator());
        a.append('}');
        return a.toString();
    }

    /* renamed from: a */
    static <K, V> Iterator<K> m20619a(Iterator<Entry<K, V>> it) {
        return at.m20511a((Iterator) it, C7412a.KEY);
    }

    /* renamed from: b */
    static <K, V> Iterator<V> m20624b(Iterator<Entry<K, V>> it) {
        return at.m20511a((Iterator) it, C7412a.VALUE);
    }
}
