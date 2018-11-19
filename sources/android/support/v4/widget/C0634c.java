package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.c */
public final class C0634c {
    /* renamed from: a */
    private static final C0633c f1974a;

    /* renamed from: android.support.v4.widget.c$c */
    static class C0633c {
        /* renamed from: a */
        private static Field f1972a;
        /* renamed from: b */
        private static boolean f1973b;

        C0633c() {
        }

        /* renamed from: a */
        public void mo622a(CompoundButton compoundButton, ColorStateList colorStateList) {
            if (compoundButton instanceof TintableCompoundButton) {
                ((TintableCompoundButton) compoundButton).setSupportButtonTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo623a(CompoundButton compoundButton, Mode mode) {
            if (compoundButton instanceof TintableCompoundButton) {
                ((TintableCompoundButton) compoundButton).setSupportButtonTintMode(mode);
            }
        }

        /* renamed from: a */
        public Drawable mo3079a(CompoundButton compoundButton) {
            if (!f1973b) {
                try {
                    f1972a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    f1972a.setAccessible(true);
                } catch (Throwable e) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
                }
                f1973b = true;
            }
            if (f1972a != null) {
                try {
                    return (Drawable) f1972a.get(compoundButton);
                } catch (CompoundButton compoundButton2) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", compoundButton2);
                    f1972a = null;
                }
            }
            return null;
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.widget.c$a */
    static class C2905a extends C0633c {
        C2905a() {
        }

        /* renamed from: a */
        public void mo622a(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: a */
        public void mo623a(CompoundButton compoundButton, Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    @RequiresApi(23)
    /* renamed from: android.support.v4.widget.c$b */
    static class C4036b extends C2905a {
        C4036b() {
        }

        /* renamed from: a */
        public Drawable mo3079a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    static {
        if (VERSION.SDK_INT >= 23) {
            f1974a = new C4036b();
        } else if (VERSION.SDK_INT >= 21) {
            f1974a = new C2905a();
        } else {
            f1974a = new C0633c();
        }
    }

    /* renamed from: a */
    public static void m2562a(@NonNull CompoundButton compoundButton, @Nullable ColorStateList colorStateList) {
        f1974a.mo622a(compoundButton, colorStateList);
    }

    /* renamed from: a */
    public static void m2563a(@NonNull CompoundButton compoundButton, @Nullable Mode mode) {
        f1974a.mo623a(compoundButton, mode);
    }

    @Nullable
    /* renamed from: a */
    public static Drawable m2561a(@NonNull CompoundButton compoundButton) {
        return f1974a.mo3079a(compoundButton);
    }
}
