package android.support.v4.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.v4.util.C0559j;
import com.foursquare.internal.util.C1948m;

/* renamed from: android.support.v4.graphics.b */
public final class C0444b {
    /* renamed from: a */
    private static final ThreadLocal<C0559j<Rect, Rect>> f1485a = new ThreadLocal();

    /* renamed from: a */
    public static boolean m1691a(@NonNull Paint paint, @NonNull String str) {
        if (VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("󟿽");
        float measureText2 = paint.measureText(C1948m.f5228a);
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        C0559j a = C0444b.m1690a();
        paint.getTextBounds("󟿽", 0, "󟿽".length(), (Rect) a.f1724a);
        paint.getTextBounds(str, 0, length, (Rect) a.f1725b);
        return ((Rect) a.f1724a).equals(a.f1725b) ^ 1;
    }

    /* renamed from: a */
    private static C0559j<Rect, Rect> m1690a() {
        C0559j<Rect, Rect> c0559j = (C0559j) f1485a.get();
        if (c0559j == null) {
            c0559j = new C0559j(new Rect(), new Rect());
            f1485a.set(c0559j);
            return c0559j;
        }
        ((Rect) c0559j.f1724a).setEmpty();
        ((Rect) c0559j.f1725b).setEmpty();
        return c0559j;
    }
}
