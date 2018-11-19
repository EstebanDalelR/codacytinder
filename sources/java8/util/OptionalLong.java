package java8.util;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java8.lang.Longs;

public final class OptionalLong {
    /* renamed from: a */
    private static final OptionalLong f48752a = new OptionalLong();
    /* renamed from: b */
    private final boolean f48753b;
    /* renamed from: c */
    private final long f48754c;

    private static final class OLCache {
        /* renamed from: a */
        static final OptionalLong[] f48751a = new OptionalLong[256];

        private OLCache() {
        }

        static {
            for (int i = 0; i < f48751a.length; i++) {
                f48751a[i] = new OptionalLong((long) (i - 128));
            }
        }
    }

    private OptionalLong() {
        this.f48753b = false;
        this.f48754c = 0;
    }

    /* renamed from: a */
    public static OptionalLong m59139a() {
        return f48752a;
    }

    OptionalLong(long j) {
        this.f48753b = true;
        this.f48754c = j;
    }

    /* renamed from: a */
    public static OptionalLong m59140a(long j) {
        if (j < -128 || j > 127) {
            return new OptionalLong(j);
        }
        return OLCache.f48751a[((int) j) + ProfileEditingConfig.DEFAULT_MAX_LENGTH];
    }

    /* renamed from: b */
    public boolean m59141b() {
        return this.f48753b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionalLong)) {
            return false;
        }
        OptionalLong optionalLong = (OptionalLong) obj;
        if (this.f48753b && optionalLong.f48753b) {
            if (this.f48754c == optionalLong.f48754c) {
                return z;
            }
        } else if (this.f48753b == optionalLong.f48753b) {
            return z;
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return this.f48753b ? Longs.m59020a(this.f48754c) : 0;
    }

    public String toString() {
        if (!this.f48753b) {
            return "OptionalLong.empty";
        }
        return String.format("OptionalLong[%s]", new Object[]{Long.valueOf(this.f48754c)});
    }
}
