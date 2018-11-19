package java8.util;

import com.tinder.api.ManagerWebServices;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java8.util.function.Consumer;
import sun.misc.Unsafe;

final class HMSpliterators {
    /* renamed from: a */
    private static final Unsafe f48731a = UnsafeAccess.f48790a;
    /* renamed from: b */
    private static final long f48732b;
    /* renamed from: c */
    private static final long f48733c;
    /* renamed from: d */
    private static final long f48734d;
    /* renamed from: e */
    private static final long f48735e;

    private static abstract class HashMapSpliterator<K, V> {
        /* renamed from: g */
        private static final Unsafe f48719g = UnsafeAccess.f48790a;
        /* renamed from: h */
        private static final long f48720h;
        /* renamed from: i */
        private static final long f48721i;
        /* renamed from: j */
        private static final long f48722j;
        /* renamed from: k */
        private static final long f48723k;
        /* renamed from: l */
        private static final long f48724l;
        /* renamed from: a */
        final HashMap<K, V> f48725a;
        /* renamed from: b */
        Object f48726b;
        /* renamed from: c */
        int f48727c;
        /* renamed from: d */
        int f48728d;
        /* renamed from: e */
        int f48729e;
        /* renamed from: f */
        int f48730f;

        HashMapSpliterator(HashMap<K, V> hashMap, int i, int i2, int i3, int i4) {
            this.f48725a = hashMap;
            this.f48727c = i;
            this.f48728d = i2;
            this.f48729e = i3;
            this.f48730f = i4;
        }

        /* renamed from: b */
        final int m59069b() {
            int i = this.f48728d;
            if (i < 0) {
                HashMap hashMap = this.f48725a;
                this.f48729e = hashMap.size();
                this.f48730f = m59063a(hashMap);
                Object[] b = m59066b(hashMap);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.length;
                }
                this.f48728d = i;
            }
            return i;
        }

        public final long getExactSizeIfKnown() {
            return Spliterators.m59152a((Spliterator) this);
        }

        public final boolean hasCharacteristics(int i) {
            return Spliterators.m59173a((Spliterator) this, i);
        }

        public final long estimateSize() {
            m59069b();
            return (long) this.f48729e;
        }

        /* renamed from: a */
        static int m59063a(HashMap<?, ?> hashMap) {
            return f48719g.getInt(hashMap, f48721i);
        }

        /* renamed from: b */
        static Object[] m59066b(HashMap<?, ?> hashMap) {
            return (Object[]) f48719g.getObject(hashMap, f48720h);
        }

        /* renamed from: a */
        static <K> K m59064a(Object obj) {
            return f48719g.getObject(obj, f48722j);
        }

        /* renamed from: b */
        static <T> T m59065b(Object obj) {
            return f48719g.getObject(obj, f48723k);
        }

        /* renamed from: c */
        static Object m59068c(Object obj) {
            return f48719g.getObject(obj, f48724l);
        }

        /* renamed from: c */
        static Class<?> m59067c() throws ClassNotFoundException {
            String str;
            StringBuilder stringBuilder = new StringBuilder("java.util.HashMap$");
            if (!Spliterators.f48759c) {
                if (!Spliterators.f48762f) {
                    str = "Entry";
                    stringBuilder.append(str);
                    return Class.forName(stringBuilder.toString());
                }
            }
            str = "Node";
            stringBuilder.append(str);
            try {
                return Class.forName(stringBuilder.toString());
            } catch (ClassNotFoundException e) {
                if (Spliterators.f48759c) {
                    return Class.forName("java.util.HashMap$HashMapEntry");
                }
                throw e;
            }
        }

        static {
            try {
                f48720h = f48719g.objectFieldOffset(HashMap.class.getDeclaredField("table"));
                f48721i = f48719g.objectFieldOffset(HashMap.class.getDeclaredField("modCount"));
                Class c = m59067c();
                f48722j = f48719g.objectFieldOffset(c.getDeclaredField("key"));
                f48723k = f48719g.objectFieldOffset(c.getDeclaredField("value"));
                f48724l = f48719g.objectFieldOffset(c.getDeclaredField(ManagerWebServices.FB_PARAM_NEXT));
            } catch (Throwable e) {
                throw new Error(e);
            }
        }
    }

    private static final class EntrySpliterator<K, V> extends HashMapSpliterator<K, V> implements Spliterator<Entry<K, V>> {
        public /* synthetic */ Spliterator trySplit() {
            return m63822a();
        }

        EntrySpliterator(HashMap<K, V> hashMap, int i, int i2, int i3, int i4) {
            super(hashMap, i, i2, i3, i4);
        }

        /* renamed from: a */
        public EntrySpliterator<K, V> m63822a() {
            int b = m59069b();
            int i = this.c;
            int i2 = (b + i) >>> 1;
            if (i < i2) {
                if (this.b == null) {
                    HashMap hashMap = this.a;
                    this.c = i2;
                    int i3 = this.e >>> 1;
                    this.e = i3;
                    return new EntrySpliterator(hashMap, i, i2, i3, this.f);
                }
            }
            return null;
        }

        public void forEachRemaining(Consumer<? super Entry<K, V>> consumer) {
            int i;
            Objects.m59115b(consumer);
            HashMap hashMap = this.a;
            Object[] b = HashMapSpliterator.m59066b(hashMap);
            int i2 = this.d;
            if (i2 < 0) {
                i2 = HashMapSpliterator.m59063a(hashMap);
                this.f = i2;
                if (b == null) {
                    i = 0;
                } else {
                    i = b.length;
                }
                this.d = i;
                int i3 = i;
                i = i2;
                i2 = i3;
            } else {
                i = this.f;
            }
            if (b != null && b.length >= i2) {
                int i4 = this.c;
                if (i4 >= 0) {
                    this.c = i2;
                    if (i4 < i2 || this.b != null) {
                        Object obj = this.b;
                        this.b = null;
                        while (true) {
                            if (obj == null) {
                                i3 = i4 + 1;
                                obj = b[i4];
                                i4 = i3;
                            } else {
                                consumer.accept((Entry) obj);
                                obj = HashMapSpliterator.m59068c(obj);
                            }
                            if (obj == null && r4 >= i2) {
                                break;
                            }
                        }
                        if (i != HashMapSpliterator.m59063a(hashMap)) {
                            throw new ConcurrentModificationException();
                        }
                    }
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean tryAdvance(java8.util.function.Consumer<? super java.util.Map.Entry<K, V>> r5) {
            /*
            r4 = this;
            java8.util.Objects.m59115b(r5);
            r0 = r4.a;
            r0 = java8.util.HMSpliterators.HashMapSpliterator.m59066b(r0);
            if (r0 == 0) goto L_0x004e;
        L_0x000b:
            r1 = r0.length;
            r2 = r4.m59069b();
            if (r1 < r2) goto L_0x004e;
        L_0x0012:
            r1 = r4.c;
            if (r1 < 0) goto L_0x004e;
        L_0x0016:
            r1 = r4.b;
            if (r1 != 0) goto L_0x001e;
        L_0x001a:
            r1 = r4.c;
            if (r1 >= r2) goto L_0x004e;
        L_0x001e:
            r1 = r4.b;
            if (r1 != 0) goto L_0x002d;
        L_0x0022:
            r1 = r4.c;
            r3 = r1 + 1;
            r4.c = r3;
            r1 = r0[r1];
            r4.b = r1;
            goto L_0x0016;
        L_0x002d:
            r0 = r4.b;
            r0 = (java.util.Map.Entry) r0;
            r1 = r4.b;
            r1 = java8.util.HMSpliterators.HashMapSpliterator.m59068c(r1);
            r4.b = r1;
            r5.accept(r0);
            r5 = r4.f;
            r0 = r4.a;
            r0 = java8.util.HMSpliterators.HashMapSpliterator.m59063a(r0);
            if (r5 == r0) goto L_0x004c;
        L_0x0046:
            r5 = new java.util.ConcurrentModificationException;
            r5.<init>();
            throw r5;
        L_0x004c:
            r5 = 1;
            return r5;
        L_0x004e:
            r5 = 0;
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: java8.util.HMSpliterators.EntrySpliterator.tryAdvance(java8.util.function.Consumer):boolean");
        }

        public int characteristics() {
            int i;
            if (this.d >= 0) {
                if (this.e != this.a.size()) {
                    i = 0;
                    return i | 1;
                }
            }
            i = 64;
            return i | 1;
        }

        public Comparator<? super Entry<K, V>> getComparator() {
            return Spliterators.m59174b((Spliterator) this);
        }
    }

    private static final class KeySpliterator<K, V> extends HashMapSpliterator<K, V> implements Spliterator<K> {
        public /* synthetic */ Spliterator trySplit() {
            return m63823a();
        }

        KeySpliterator(HashMap<K, V> hashMap, int i, int i2, int i3, int i4) {
            super(hashMap, i, i2, i3, i4);
        }

        /* renamed from: a */
        public KeySpliterator<K, V> m63823a() {
            int b = m59069b();
            int i = this.c;
            int i2 = (b + i) >>> 1;
            if (i < i2) {
                if (this.b == null) {
                    HashMap hashMap = this.a;
                    this.c = i2;
                    int i3 = this.e >>> 1;
                    this.e = i3;
                    return new KeySpliterator(hashMap, i, i2, i3, this.f);
                }
            }
            return null;
        }

        public void forEachRemaining(Consumer<? super K> consumer) {
            int i;
            Objects.m59115b(consumer);
            HashMap hashMap = this.a;
            Object[] b = HashMapSpliterator.m59066b(hashMap);
            int i2 = this.d;
            if (i2 < 0) {
                i2 = HashMapSpliterator.m59063a(hashMap);
                this.f = i2;
                if (b == null) {
                    i = 0;
                } else {
                    i = b.length;
                }
                this.d = i;
                int i3 = i;
                i = i2;
                i2 = i3;
            } else {
                i = this.f;
            }
            if (b != null && b.length >= i2) {
                int i4 = this.c;
                if (i4 >= 0) {
                    this.c = i2;
                    if (i4 < i2 || this.b != null) {
                        Object obj = this.b;
                        this.b = null;
                        while (true) {
                            if (obj == null) {
                                i3 = i4 + 1;
                                obj = b[i4];
                                i4 = i3;
                            } else {
                                consumer.accept(HashMapSpliterator.m59064a(obj));
                                obj = HashMapSpliterator.m59068c(obj);
                            }
                            if (obj == null && r4 >= i2) {
                                break;
                            }
                        }
                        if (i != HashMapSpliterator.m59063a(hashMap)) {
                            throw new ConcurrentModificationException();
                        }
                    }
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean tryAdvance(java8.util.function.Consumer<? super K> r5) {
            /*
            r4 = this;
            java8.util.Objects.m59115b(r5);
            r0 = r4.a;
            r0 = java8.util.HMSpliterators.HashMapSpliterator.m59066b(r0);
            if (r0 == 0) goto L_0x0050;
        L_0x000b:
            r1 = r0.length;
            r2 = r4.m59069b();
            if (r1 < r2) goto L_0x0050;
        L_0x0012:
            r1 = r4.c;
            if (r1 < 0) goto L_0x0050;
        L_0x0016:
            r1 = r4.b;
            if (r1 != 0) goto L_0x001e;
        L_0x001a:
            r1 = r4.c;
            if (r1 >= r2) goto L_0x0050;
        L_0x001e:
            r1 = r4.b;
            if (r1 != 0) goto L_0x002d;
        L_0x0022:
            r1 = r4.c;
            r3 = r1 + 1;
            r4.c = r3;
            r1 = r0[r1];
            r4.b = r1;
            goto L_0x0016;
        L_0x002d:
            r0 = r4.b;
            r0 = java8.util.HMSpliterators.HashMapSpliterator.m59064a(r0);
            r1 = r4.b;
            r1 = java8.util.HMSpliterators.HashMapSpliterator.m59068c(r1);
            r4.b = r1;
            r5.accept(r0);
            r5 = r4.f;
            r0 = r4.a;
            r0 = java8.util.HMSpliterators.HashMapSpliterator.m59063a(r0);
            if (r5 == r0) goto L_0x004e;
        L_0x0048:
            r5 = new java.util.ConcurrentModificationException;
            r5.<init>();
            throw r5;
        L_0x004e:
            r5 = 1;
            return r5;
        L_0x0050:
            r5 = 0;
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: java8.util.HMSpliterators.KeySpliterator.tryAdvance(java8.util.function.Consumer):boolean");
        }

        public int characteristics() {
            int i;
            if (this.d >= 0) {
                if (this.e != this.a.size()) {
                    i = 0;
                    return i | 1;
                }
            }
            i = 64;
            return i | 1;
        }

        public Comparator<? super K> getComparator() {
            return Spliterators.m59174b((Spliterator) this);
        }
    }

    private static final class ValueSpliterator<K, V> extends HashMapSpliterator<K, V> implements Spliterator<V> {
        public /* synthetic */ Spliterator trySplit() {
            return m63824a();
        }

        ValueSpliterator(HashMap<K, V> hashMap, int i, int i2, int i3, int i4) {
            super(hashMap, i, i2, i3, i4);
        }

        /* renamed from: a */
        public ValueSpliterator<K, V> m63824a() {
            int b = m59069b();
            int i = this.c;
            int i2 = (b + i) >>> 1;
            if (i < i2) {
                if (this.b == null) {
                    HashMap hashMap = this.a;
                    this.c = i2;
                    int i3 = this.e >>> 1;
                    this.e = i3;
                    return new ValueSpliterator(hashMap, i, i2, i3, this.f);
                }
            }
            return null;
        }

        public void forEachRemaining(Consumer<? super V> consumer) {
            int i;
            Objects.m59115b(consumer);
            HashMap hashMap = this.a;
            Object[] b = HashMapSpliterator.m59066b(hashMap);
            int i2 = this.d;
            if (i2 < 0) {
                i2 = HashMapSpliterator.m59063a(hashMap);
                this.f = i2;
                if (b == null) {
                    i = 0;
                } else {
                    i = b.length;
                }
                this.d = i;
                int i3 = i;
                i = i2;
                i2 = i3;
            } else {
                i = this.f;
            }
            if (b != null && b.length >= i2) {
                int i4 = this.c;
                if (i4 >= 0) {
                    this.c = i2;
                    if (i4 < i2 || this.b != null) {
                        Object obj = this.b;
                        this.b = null;
                        while (true) {
                            if (obj == null) {
                                i3 = i4 + 1;
                                obj = b[i4];
                                i4 = i3;
                            } else {
                                consumer.accept(HashMapSpliterator.m59065b(obj));
                                obj = HashMapSpliterator.m59068c(obj);
                            }
                            if (obj == null && r4 >= i2) {
                                break;
                            }
                        }
                        if (i != HashMapSpliterator.m59063a(hashMap)) {
                            throw new ConcurrentModificationException();
                        }
                    }
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean tryAdvance(java8.util.function.Consumer<? super V> r5) {
            /*
            r4 = this;
            java8.util.Objects.m59115b(r5);
            r0 = r4.a;
            r0 = java8.util.HMSpliterators.HashMapSpliterator.m59066b(r0);
            if (r0 == 0) goto L_0x0050;
        L_0x000b:
            r1 = r0.length;
            r2 = r4.m59069b();
            if (r1 < r2) goto L_0x0050;
        L_0x0012:
            r1 = r4.c;
            if (r1 < 0) goto L_0x0050;
        L_0x0016:
            r1 = r4.b;
            if (r1 != 0) goto L_0x001e;
        L_0x001a:
            r1 = r4.c;
            if (r1 >= r2) goto L_0x0050;
        L_0x001e:
            r1 = r4.b;
            if (r1 != 0) goto L_0x002d;
        L_0x0022:
            r1 = r4.c;
            r3 = r1 + 1;
            r4.c = r3;
            r1 = r0[r1];
            r4.b = r1;
            goto L_0x0016;
        L_0x002d:
            r0 = r4.b;
            r0 = java8.util.HMSpliterators.HashMapSpliterator.m59065b(r0);
            r1 = r4.b;
            r1 = java8.util.HMSpliterators.HashMapSpliterator.m59068c(r1);
            r4.b = r1;
            r5.accept(r0);
            r5 = r4.f;
            r0 = r4.a;
            r0 = java8.util.HMSpliterators.HashMapSpliterator.m59063a(r0);
            if (r5 == r0) goto L_0x004e;
        L_0x0048:
            r5 = new java.util.ConcurrentModificationException;
            r5.<init>();
            throw r5;
        L_0x004e:
            r5 = 1;
            return r5;
        L_0x0050:
            r5 = 0;
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: java8.util.HMSpliterators.ValueSpliterator.tryAdvance(java8.util.function.Consumer):boolean");
        }

        public int characteristics() {
            if (this.d >= 0) {
                if (this.e != this.a.size()) {
                    return 0;
                }
            }
            return 64;
        }

        public Comparator<? super V> getComparator() {
            return Spliterators.m59174b((Spliterator) this);
        }
    }

    private HMSpliterators() {
    }

    /* renamed from: a */
    static <K> Spliterator<K> m59072a(Set<K> set) {
        return new KeySpliterator(m59076c(set), 0, -1, 0, 0);
    }

    /* renamed from: b */
    static <K, V> Spliterator<Entry<K, V>> m59075b(Set<Entry<K, V>> set) {
        return new EntrySpliterator(m59077d(set), 0, -1, 0, 0);
    }

    /* renamed from: a */
    static <V> Spliterator<V> m59070a(Collection<V> collection) {
        return new ValueSpliterator(m59073b((Collection) collection), 0, -1, 0, 0);
    }

    /* renamed from: a */
    static <E> Spliterator<E> m59071a(HashSet<E> hashSet) {
        return new KeySpliterator(m59074b((HashSet) hashSet), 0, -1, 0, 0);
    }

    /* renamed from: c */
    private static <K, V> HashMap<K, V> m59076c(Set<K> set) {
        return (HashMap) f48731a.getObject(set, f48733c);
    }

    /* renamed from: d */
    private static <K, V> HashMap<K, V> m59077d(Set<Entry<K, V>> set) {
        return (HashMap) f48731a.getObject(set, f48734d);
    }

    /* renamed from: b */
    private static <K, V> HashMap<K, V> m59073b(Collection<V> collection) {
        return (HashMap) f48731a.getObject(collection, f48732b);
    }

    /* renamed from: b */
    private static <K, V> HashMap<K, V> m59074b(HashSet<K> hashSet) {
        return (HashMap) f48731a.getObject(hashSet, f48735e);
    }

    static {
        try {
            Class cls = Class.forName("java.util.HashMap$Values");
            Class cls2 = Class.forName("java.util.HashMap$KeySet");
            Class cls3 = Class.forName("java.util.HashMap$EntrySet");
            f48732b = f48731a.objectFieldOffset(cls.getDeclaredField("this$0"));
            f48733c = f48731a.objectFieldOffset(cls2.getDeclaredField("this$0"));
            f48734d = f48731a.objectFieldOffset(cls3.getDeclaredField("this$0"));
            f48735e = f48731a.objectFieldOffset(HashSet.class.getDeclaredField("map"));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
}
