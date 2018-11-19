package android.support.text.emoji;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.AnyThread;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import androidx.text.emoji.flatbuffer.C2960a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@AnyThread
@RequiresApi(19)
@RestrictTo({Scope.LIBRARY_GROUP})
public class EmojiMetadata {
    /* renamed from: a */
    private static final ThreadLocal<C2960a> f1019a = new ThreadLocal();
    /* renamed from: b */
    private final int f1020b;
    /* renamed from: c */
    private final C0299d f1021c;
    /* renamed from: d */
    private volatile int f1022d = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HasGlyph {
    }

    EmojiMetadata(@NonNull C0299d c0299d, @IntRange(from = 0) int i) {
        this.f1021c = c0299d;
        this.f1020b = i;
    }

    /* renamed from: a */
    public void m1079a(@NonNull Canvas canvas, float f, float f2, @NonNull Paint paint) {
        Typeface a = this.f1021c.m1131a();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(a);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f1021c.m1135d(), this.f1020b * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: h */
    private C2960a m1076h() {
        C2960a c2960a = (C2960a) f1019a.get();
        if (c2960a == null) {
            c2960a = new C2960a();
            f1019a.set(c2960a);
        }
        this.f1021c.m1136e().m11469a(c2960a, this.f1020b);
        return c2960a;
    }

    /* renamed from: a */
    public int m1077a() {
        return m1076h().m11457a();
    }

    /* renamed from: b */
    public short m1081b() {
        return m1076h().m11463d();
    }

    /* renamed from: c */
    public short m1082c() {
        return m1076h().m11464e();
    }

    /* renamed from: d */
    public short m1083d() {
        return m1076h().m11462c();
    }

    /* renamed from: e */
    public int m1084e() {
        return this.f1022d;
    }

    /* renamed from: a */
    public void m1080a(boolean z) {
        this.f1022d = z ? true : true;
    }

    /* renamed from: f */
    public boolean m1085f() {
        return m1076h().m11461b();
    }

    /* renamed from: a */
    public int m1078a(int i) {
        return m1076h().m11458a(i);
    }

    /* renamed from: g */
    public int m1086g() {
        return m1076h().m11465f();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(", id:");
        stringBuilder.append(Integer.toHexString(m1077a()));
        stringBuilder.append(", codepoints:");
        int g = m1086g();
        for (int i = 0; i < g; i++) {
            stringBuilder.append(Integer.toHexString(m1078a(i)));
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
