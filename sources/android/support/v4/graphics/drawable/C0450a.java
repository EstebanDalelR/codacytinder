package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.graphics.drawable.a */
public final class C0450a {
    /* renamed from: a */
    private static Method f1492a;
    /* renamed from: b */
    private static boolean f1493b;
    /* renamed from: c */
    private static Method f1494c;
    /* renamed from: d */
    private static boolean f1495d;

    @Deprecated
    /* renamed from: a */
    public static void m1715a(@NonNull Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: a */
    public static void m1723a(@NonNull Drawable drawable, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: b */
    public static boolean m1724b(@NonNull Drawable drawable) {
        return VERSION.SDK_INT >= 19 ? drawable.isAutoMirrored() : null;
    }

    /* renamed from: a */
    public static void m1716a(@NonNull Drawable drawable, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m1718a(@NonNull Drawable drawable, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m1717a(@NonNull Drawable drawable, @ColorInt int i) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof TintAwareDrawable) {
            ((TintAwareDrawable) drawable).setTint(i);
        }
    }

    /* renamed from: a */
    public static void m1719a(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof TintAwareDrawable) {
            ((TintAwareDrawable) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m1722a(@NonNull Drawable drawable, @NonNull Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof TintAwareDrawable) {
            ((TintAwareDrawable) drawable).setTintMode(mode);
        }
    }

    /* renamed from: c */
    public static int m1726c(@NonNull Drawable drawable) {
        return VERSION.SDK_INT >= 19 ? drawable.getAlpha() : null;
    }

    /* renamed from: a */
    public static void m1720a(@NonNull Drawable drawable, @NonNull Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: d */
    public static boolean m1727d(@NonNull Drawable drawable) {
        return VERSION.SDK_INT >= 21 ? drawable.canApplyTheme() : null;
    }

    /* renamed from: e */
    public static ColorFilter m1728e(@NonNull Drawable drawable) {
        return VERSION.SDK_INT >= 21 ? drawable.getColorFilter() : null;
    }

    /* renamed from: f */
    public static void m1729f(@NonNull Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
        } else if (VERSION.SDK_INT >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                C0450a.m1729f(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof WrappedDrawable) {
                C0450a.m1729f(((WrappedDrawable) drawable).getWrappedDrawable());
            } else if (drawable instanceof DrawableContainer) {
                DrawableContainerState drawableContainerState = (DrawableContainerState) ((DrawableContainer) drawable).getConstantState();
                if (drawableContainerState != null) {
                    int childCount = drawableContainerState.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        Drawable child = drawableContainerState.getChild(i);
                        if (child != null) {
                            C0450a.m1729f(child);
                        }
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    /* renamed from: a */
    public static void m1721a(@NonNull Drawable drawable, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Theme theme) throws XmlPullParserException, IOException {
        if (VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: g */
    public static Drawable m1730g(@NonNull Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            return drawable;
        }
        return VERSION.SDK_INT >= 21 ? !(drawable instanceof TintAwareDrawable) ? new C4312g(drawable) : drawable : VERSION.SDK_INT >= 19 ? !(drawable instanceof TintAwareDrawable) ? new C4018f(drawable) : drawable : !(drawable instanceof TintAwareDrawable) ? new C2845e(drawable) : drawable;
    }

    /* renamed from: h */
    public static <T extends Drawable> T m1731h(@NonNull Drawable drawable) {
        return drawable instanceof WrappedDrawable ? ((WrappedDrawable) drawable).getWrappedDrawable() : drawable;
    }

    /* renamed from: b */
    public static boolean m1725b(@NonNull Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (!f1493b) {
            try {
                f1492a = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f1492a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f1493b = true;
        }
        if (f1492a != null) {
            try {
                f1492a.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Drawable drawable2) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", drawable2);
                f1492a = null;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static int m1732i(@NonNull Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (VERSION.SDK_INT < 17) {
            return 0;
        }
        if (!f1495d) {
            try {
                f1494c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f1494c.setAccessible(true);
            } catch (Throwable e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            f1495d = true;
        }
        if (f1494c != null) {
            try {
                return ((Integer) f1494c.invoke(drawable, new Object[0])).intValue();
            } catch (Drawable drawable2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", drawable2);
                f1494c = null;
            }
        }
        return 0;
    }
}
