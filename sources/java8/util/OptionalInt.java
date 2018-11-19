package java8.util;

import com.tinder.domain.config.model.ProfileEditingConfig;

public final class OptionalInt {
    /* renamed from: a */
    private static final OptionalInt f48748a = new OptionalInt();
    /* renamed from: b */
    private final boolean f48749b;
    /* renamed from: c */
    private final int f48750c;

    private static final class OICache {
        /* renamed from: a */
        static final OptionalInt[] f48747a = new OptionalInt[256];

        private OICache() {
        }

        static {
            for (int i = 0; i < f48747a.length; i++) {
                f48747a[i] = new OptionalInt(i - 128);
            }
        }
    }

    private OptionalInt() {
        this.f48749b = false;
        this.f48750c = 0;
    }

    /* renamed from: a */
    public static OptionalInt m59136a() {
        return f48748a;
    }

    OptionalInt(int i) {
        this.f48749b = true;
        this.f48750c = i;
    }

    /* renamed from: a */
    public static OptionalInt m59137a(int i) {
        if (i < -128 || i > 127) {
            return new OptionalInt(i);
        }
        return OICache.f48747a[i + ProfileEditingConfig.DEFAULT_MAX_LENGTH];
    }

    /* renamed from: b */
    public boolean m59138b() {
        return this.f48749b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalInt)) {
            return false;
        }
        OptionalInt optionalInt = (OptionalInt) obj;
        if (this.f48749b && optionalInt.f48749b) {
            if (this.f48750c == optionalInt.f48750c) {
                return z;
            }
        } else if (this.f48749b == optionalInt.f48749b) {
            return z;
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return this.f48749b ? this.f48750c : 0;
    }

    public String toString() {
        if (!this.f48749b) {
            return "OptionalInt.empty";
        }
        return String.format("OptionalInt[%s]", new Object[]{Integer.valueOf(this.f48750c)});
    }
}
