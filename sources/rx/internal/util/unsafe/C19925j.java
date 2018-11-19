package rx.internal.util.unsafe;

import rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: rx.internal.util.unsafe.j */
public final class C19925j<E> extends C19923n<E> {
    public C19925j(int i) {
        super(i);
    }

    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        Object[] objArr = this.c;
        long j = this.b;
        long b = m71646b();
        long a = m71058a(b);
        if (m71063b(objArr, a) != null) {
            if (b - m71732a() > j) {
                return null;
            }
            while (m71063b(objArr, a) != null) {
            }
        }
        m71061a(objArr, a, e);
        m71647c(b + 1);
        return true;
    }

    public E poll() {
        long a;
        long c = m71734c();
        do {
            a = m71732a();
            if (a >= c) {
                long b = m71646b();
                if (a >= b) {
                    return null;
                }
                m71735d(b);
            }
        } while (!m71733b(a, a + 1));
        c = m71058a(a);
        Object[] objArr = this.c;
        E a2 = m71060a(objArr, c);
        m71064b(objArr, c, null);
        return a2;
    }

    public E peek() {
        E b;
        long c = m71734c();
        do {
            long a = m71732a();
            if (a >= c) {
                long b2 = m71646b();
                if (a >= b2) {
                    return null;
                }
                m71735d(b2);
            }
            b = m71062b(m71058a(a));
        } while (b == null);
        return b;
    }

    public int size() {
        long a = m71732a();
        while (true) {
            long b = m71646b();
            long a2 = m71732a();
            if (a == a2) {
                return (int) (b - a2);
            }
            a = a2;
        }
    }

    public boolean isEmpty() {
        return m71732a() == m71646b();
    }
}
