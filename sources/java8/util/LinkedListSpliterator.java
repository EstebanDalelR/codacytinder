package java8.util;

import com.tinder.api.ManagerWebServices;
import java.util.AbstractList;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java8.util.function.Consumer;
import sun.misc.Unsafe;

final class LinkedListSpliterator<T> implements Spliterator<T> {
    /* renamed from: g */
    private static final boolean f54262g = Spliterators.f48760d;
    /* renamed from: h */
    private static final boolean f54263h = Spliterators.f48761e;
    /* renamed from: i */
    private static final Unsafe f54264i = UnsafeAccess.f48790a;
    /* renamed from: j */
    private static final long f54265j;
    /* renamed from: k */
    private static final long f54266k;
    /* renamed from: l */
    private static final long f54267l;
    /* renamed from: m */
    private static final long f54268m;
    /* renamed from: n */
    private static final long f54269n;
    /* renamed from: a */
    private final LinkedList<T> f54270a;
    /* renamed from: b */
    private final Object f54271b;
    /* renamed from: c */
    private Object f54272c;
    /* renamed from: d */
    private int f54273d;
    /* renamed from: e */
    private int f54274e;
    /* renamed from: f */
    private int f54275f;

    public int characteristics() {
        return 16464;
    }

    private LinkedListSpliterator(LinkedList<T> linkedList, int i, int i2) {
        this.f54270a = linkedList;
        this.f54273d = i;
        this.f54274e = i2;
        if (f54263h == 0) {
            if (f54262g == 0) {
                linkedList = null;
                this.f54271b = linkedList;
            }
        }
        linkedList = m63852b((LinkedList) linkedList);
        this.f54271b = linkedList;
    }

    /* renamed from: a */
    static <E> Spliterator<E> m63850a(LinkedList<E> linkedList) {
        return new LinkedListSpliterator(linkedList, -1, 0);
    }

    /* renamed from: a */
    private int m63848a() {
        int i = this.f54273d;
        if (i >= 0) {
            return i;
        }
        LinkedList linkedList = this.f54270a;
        if (linkedList == null) {
            this.f54273d = 0;
            return 0;
        }
        this.f54274e = m63855e(linkedList);
        this.f54272c = m63853c(linkedList);
        i = m63854d(linkedList);
        this.f54273d = i;
        return i;
    }

    public long estimateSize() {
        return (long) m63848a();
    }

    public void forEachRemaining(Consumer<? super T> consumer) {
        Objects.m59115b(consumer);
        Object obj = this.f54271b;
        int a = m63848a();
        if (a > 0) {
            Object obj2 = this.f54272c;
            if (obj2 != obj) {
                this.f54272c = obj;
                this.f54273d = 0;
                do {
                    Object b = m63851b(obj2);
                    obj2 = m63849a(obj2);
                    consumer.accept(b);
                    if (obj2 == obj) {
                        break;
                    }
                    a--;
                } while (a > 0);
            }
        }
        if (this.f54274e != m63855e(this.f54270a)) {
            throw new ConcurrentModificationException();
        }
    }

    public Comparator<? super T> getComparator() {
        return Spliterators.m59174b((Spliterator) this);
    }

    public long getExactSizeIfKnown() {
        return Spliterators.m59152a((Spliterator) this);
    }

    public boolean hasCharacteristics(int i) {
        return Spliterators.m59173a((Spliterator) this, i);
    }

    public boolean tryAdvance(Consumer<? super T> consumer) {
        Objects.m59115b(consumer);
        Object obj = this.f54271b;
        if (m63848a() > 0) {
            Object obj2 = this.f54272c;
            if (obj2 != obj) {
                this.f54273d--;
                obj = m63851b(obj2);
                this.f54272c = m63849a(obj2);
                consumer.accept(obj);
                if (this.f54274e == m63855e(this.f54270a)) {
                    return true;
                }
                throw new ConcurrentModificationException();
            }
        }
        return null;
    }

    public Spliterator<T> trySplit() {
        Object obj = this.f54271b;
        int a = m63848a();
        if (a > 1) {
            Object obj2 = this.f54272c;
            if (obj2 != obj) {
                int i;
                int i2 = this.f54275f + 1024;
                if (i2 > a) {
                    i2 = a;
                }
                if (i2 > 33554432) {
                    i2 = 33554432;
                }
                Object[] objArr = new Object[i2];
                Object obj3 = obj2;
                int i3 = 0;
                while (true) {
                    i = i3 + 1;
                    objArr[i3] = m63851b(obj3);
                    obj3 = m63849a(obj3);
                    if (obj3 == obj) {
                        break;
                    } else if (i >= i2) {
                        break;
                    } else {
                        i3 = i;
                    }
                }
                this.f54272c = obj3;
                this.f54275f = i;
                this.f54273d = a - i;
                return Spliterators.m59167a(objArr, 0, i, 16);
            }
        }
        return null;
    }

    /* renamed from: b */
    private static Object m63852b(LinkedList<?> linkedList) {
        return linkedList == null ? null : f54264i.getObject(linkedList, f54267l);
    }

    /* renamed from: c */
    private Object m63853c(LinkedList<?> linkedList) {
        if (!f54263h) {
            if (!f54262g) {
                return f54264i.getObject(linkedList, f54267l);
            }
        }
        return m63849a(this.f54271b);
    }

    /* renamed from: a */
    private static Object m63849a(Object obj) {
        if (obj != null) {
            return f54264i.getObject(obj, f54269n);
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: b */
    private static <E> E m63851b(Object obj) {
        if (obj != null) {
            return f54264i.getObject(obj, f54268m);
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: d */
    private static int m63854d(LinkedList<?> linkedList) {
        return f54264i.getInt(linkedList, f54265j);
    }

    /* renamed from: e */
    private static int m63855e(LinkedList<?> linkedList) {
        return f54264i.getInt(linkedList, f54266k);
    }

    static {
        try {
            f54266k = f54264i.objectFieldOffset(AbstractList.class.getDeclaredField("modCount"));
            String str = f54262g ? "voidLink" : f54263h ? "header" : "first";
            String str2 = f54262g ? "java.util.LinkedList$Link" : f54263h ? "java.util.LinkedList$Entry" : "java.util.LinkedList$Node";
            String str3 = f54262g ? ManagerWebServices.FB_DATA : f54263h ? "element" : "item";
            Class cls = Class.forName(str2);
            f54265j = f54264i.objectFieldOffset(LinkedList.class.getDeclaredField(ManagerWebServices.PARAM_SIZE));
            f54267l = f54264i.objectFieldOffset(LinkedList.class.getDeclaredField(str));
            f54268m = f54264i.objectFieldOffset(cls.getDeclaredField(str3));
            f54269n = f54264i.objectFieldOffset(cls.getDeclaredField(ManagerWebServices.FB_PARAM_NEXT));
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
}
