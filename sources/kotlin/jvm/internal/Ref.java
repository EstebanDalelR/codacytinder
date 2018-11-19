package kotlin.jvm.internal;

import java.io.Serializable;

public class Ref {

    public static final class IntRef implements Serializable {
        /* renamed from: a */
        public int f49021a;

        public String toString() {
            return String.valueOf(this.f49021a);
        }
    }

    public static final class ObjectRef<T> implements Serializable {
        /* renamed from: a */
        public T f49022a;

        public String toString() {
            return String.valueOf(this.f49022a);
        }
    }
}
