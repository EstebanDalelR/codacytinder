package android.support.v4.content.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.FontRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.content.res.FontResourcesParserCompat.FamilyResourceEntry;
import android.support.v4.graphics.C0449d;
import android.util.Log;
import android.util.TypedValue;

/* renamed from: android.support.v4.content.res.a */
public final class C0441a {

    /* renamed from: android.support.v4.content.res.a$a */
    public static abstract class C0440a {
        public abstract void onFontRetrievalFailed(int i);

        public abstract void onFontRetrieved(@NonNull Typeface typeface);

        @RestrictTo({Scope.LIBRARY_GROUP})
        public final void callbackSuccessAsync(final Typeface typeface, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C0440a f1481b;

                public void run() {
                    this.f1481b.onFontRetrieved(typeface);
                }
            });
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        public final void callbackFailAsync(final int i, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C0440a f1483b;

                public void run() {
                    this.f1483b.onFontRetrievalFailed(i);
                }
            });
        }
    }

    @Nullable
    /* renamed from: a */
    public static Drawable m1669a(@NonNull Resources resources, @DrawableRes int i, @Nullable Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    @ColorInt
    /* renamed from: b */
    public static int m1670b(@NonNull Resources resources, @ColorRes int i, @Nullable Theme theme) throws NotFoundException {
        if (VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    @Nullable
    /* renamed from: a */
    public static Typeface m1665a(@NonNull Context context, @FontRes int i) throws NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return C0441a.m1667a(context, i, new TypedValue(), 0, null, null, false);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static Typeface m1666a(@NonNull Context context, @FontRes int i, TypedValue typedValue, int i2, @Nullable C0440a c0440a) throws NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return C0441a.m1667a(context, i, typedValue, i2, c0440a, null, true);
    }

    /* renamed from: a */
    private static Typeface m1667a(@NonNull Context context, int i, TypedValue typedValue, int i2, @Nullable C0440a c0440a, @Nullable Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        context = C0441a.m1668a(context, resources, typedValue, i, i2, c0440a, handler, z);
        if (context != null || c0440a != null) {
            return context;
        }
        typedValue = new StringBuilder();
        typedValue.append("Font resource ID #0x");
        typedValue.append(Integer.toHexString(i));
        typedValue.append(" could not be retrieved.");
        throw new NotFoundException(typedValue.toString());
    }

    /* renamed from: a */
    private static Typeface m1668a(@NonNull Context context, Resources resources, TypedValue typedValue, int i, int i2, @Nullable C0440a c0440a, @Nullable Handler handler, boolean z) {
        Throwable th;
        StringBuilder stringBuilder;
        Resources resources2 = resources;
        TypedValue typedValue2 = typedValue;
        int i3 = i;
        int i4 = i2;
        C0440a c0440a2 = c0440a;
        Handler handler2 = handler;
        if (typedValue2.string == null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Resource \"");
            stringBuilder2.append(resources2.getResourceName(i3));
            stringBuilder2.append("\" (");
            stringBuilder2.append(Integer.toHexString(i));
            stringBuilder2.append(") is not a Font: ");
            stringBuilder2.append(typedValue2);
            throw new NotFoundException(stringBuilder2.toString());
        }
        String charSequence = typedValue2.string.toString();
        if (charSequence.startsWith("res/")) {
            Typeface a = C0449d.m1713a(resources2, i3, i4);
            if (a != null) {
                if (c0440a2 != null) {
                    c0440a2.callbackSuccessAsync(a, handler2);
                }
                return a;
            }
            try {
                if (charSequence.toLowerCase().endsWith(".xml")) {
                    FamilyResourceEntry a2 = FontResourcesParserCompat.m1658a(resources2.getXml(i3), resources2);
                    if (a2 != null) {
                        return C0449d.m1712a(context, a2, resources2, i3, i4, c0440a2, handler2, z);
                    }
                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                    if (c0440a2 != null) {
                        c0440a2.callbackFailAsync(-3, handler2);
                    }
                    return null;
                }
                a = C0449d.m1710a(context, resources2, i3, charSequence, i4);
                if (c0440a2 != null) {
                    if (a != null) {
                        c0440a2.callbackSuccessAsync(a, handler2);
                    } else {
                        c0440a2.callbackFailAsync(-3, handler2);
                    }
                }
                return a;
            } catch (Throwable e) {
                th = e;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to parse xml resource ");
                stringBuilder.append(charSequence);
                Log.e("ResourcesCompat", stringBuilder.toString(), th);
                if (c0440a2 != null) {
                    c0440a2.callbackFailAsync(-3, handler2);
                }
                return null;
            } catch (Throwable e2) {
                th = e2;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to read xml resource ");
                stringBuilder.append(charSequence);
                Log.e("ResourcesCompat", stringBuilder.toString(), th);
                if (c0440a2 != null) {
                    c0440a2.callbackFailAsync(-3, handler2);
                }
                return null;
            }
        }
        if (c0440a2 != null) {
            c0440a2.callbackFailAsync(-3, handler2);
        }
        return null;
    }
}
