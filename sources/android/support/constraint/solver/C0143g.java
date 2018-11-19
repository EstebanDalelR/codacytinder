package android.support.constraint.solver;

/* renamed from: android.support.constraint.solver.g */
final class C0143g {

    /* renamed from: android.support.constraint.solver.g$a */
    interface C0142a<T> {
        /* renamed from: a */
        T mo148a();

        /* renamed from: a */
        void mo149a(T[] tArr, int i);

        /* renamed from: a */
        boolean mo150a(T t);
    }

    /* renamed from: android.support.constraint.solver.g$b */
    static class C2734b<T> implements C0142a<T> {
        /* renamed from: a */
        private final Object[] f8597a;
        /* renamed from: b */
        private int f8598b;

        C2734b(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f8597a = new Object[i];
        }

        /* renamed from: a */
        public T mo148a() {
            if (this.f8598b <= 0) {
                return null;
            }
            int i = this.f8598b - 1;
            T t = this.f8597a[i];
            this.f8597a[i] = null;
            this.f8598b--;
            return t;
        }

        /* renamed from: a */
        public boolean mo150a(T t) {
            if (this.f8598b >= this.f8597a.length) {
                return null;
            }
            this.f8597a[this.f8598b] = t;
            this.f8598b += 1;
            return true;
        }

        /* renamed from: a */
        public void mo149a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                if (this.f8598b < this.f8597a.length) {
                    this.f8597a[this.f8598b] = t;
                    this.f8598b++;
                }
            }
        }
    }
}
