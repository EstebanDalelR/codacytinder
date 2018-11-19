package okhttp3.internal.http2;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.Arrays;

/* renamed from: okhttp3.internal.http2.j */
public final class C15943j {
    /* renamed from: a */
    private int f49455a;
    /* renamed from: b */
    private final int[] f49456b = new int[10];

    /* renamed from: a */
    void m60416a() {
        this.f49455a = 0;
        Arrays.fill(this.f49456b, 0);
    }

    /* renamed from: a */
    C15943j m60415a(int i, int i2) {
        if (i >= 0) {
            if (i < this.f49456b.length) {
                this.f49455a = (1 << i) | this.f49455a;
                this.f49456b[i] = i2;
                return this;
            }
        }
        return this;
    }

    /* renamed from: a */
    boolean m60418a(int i) {
        return ((1 << i) & this.f49455a) != 0;
    }

    /* renamed from: b */
    int m60420b(int i) {
        return this.f49456b[i];
    }

    /* renamed from: b */
    int m60419b() {
        return Integer.bitCount(this.f49455a);
    }

    /* renamed from: c */
    int m60421c() {
        return (this.f49455a & 2) != 0 ? this.f49456b[1] : -1;
    }

    /* renamed from: c */
    int m60422c(int i) {
        return (this.f49455a & 16) != 0 ? this.f49456b[4] : i;
    }

    /* renamed from: d */
    int m60424d(int i) {
        return (this.f49455a & 32) != 0 ? this.f49456b[5] : i;
    }

    /* renamed from: d */
    int m60423d() {
        return (this.f49455a & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? this.f49456b[7] : 65535;
    }

    /* renamed from: a */
    void m60417a(C15943j c15943j) {
        for (int i = 0; i < 10; i++) {
            if (c15943j.m60418a(i)) {
                m60415a(i, c15943j.m60420b(i));
            }
        }
    }
}
