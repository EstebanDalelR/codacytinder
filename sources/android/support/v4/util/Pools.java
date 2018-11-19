package android.support.v4.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public final class Pools {

    public interface Pool<T> {
        @Nullable
        T acquire();

        boolean release(@NonNull T t);
    }

    /* renamed from: android.support.v4.util.Pools$a */
    public static class C2878a<T> implements Pool<T> {
        /* renamed from: a */
        private final Object[] f9100a;
        /* renamed from: b */
        private int f9101b;

        public C2878a(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f9100a = new Object[i];
        }

        public T acquire() {
            if (this.f9101b <= 0) {
                return null;
            }
            int i = this.f9101b - 1;
            T t = this.f9100a[i];
            this.f9100a[i] = null;
            this.f9101b--;
            return t;
        }

        public boolean release(@NonNull T t) {
            if (m11332a(t)) {
                throw new IllegalStateException("Already in the pool!");
            } else if (this.f9101b >= this.f9100a.length) {
                return null;
            } else {
                this.f9100a[this.f9101b] = t;
                this.f9101b += 1;
                return true;
            }
        }

        /* renamed from: a */
        private boolean m11332a(@NonNull T t) {
            for (int i = 0; i < this.f9101b; i++) {
                if (this.f9100a[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: android.support.v4.util.Pools$b */
    public static class C4028b<T> extends C2878a<T> {
        /* renamed from: a */
        private final Object f12781a = new Object();

        public C4028b(int i) {
            super(i);
        }

        public T acquire() {
            T acquire;
            synchronized (this.f12781a) {
                acquire = super.acquire();
            }
            return acquire;
        }

        public boolean release(@NonNull T t) {
            synchronized (this.f12781a) {
                t = super.release(t);
            }
            return t;
        }
    }
}
