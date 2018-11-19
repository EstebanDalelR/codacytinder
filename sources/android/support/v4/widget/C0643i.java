package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.i */
public class C0643i {
    /* renamed from: a */
    static final C0642b f1983a;

    /* renamed from: android.support.v4.widget.i$b */
    interface C0642b {
        /* renamed from: a */
        ColorStateList mo636a(ImageView imageView);

        /* renamed from: a */
        void mo637a(ImageView imageView, ColorStateList colorStateList);

        /* renamed from: a */
        void mo638a(ImageView imageView, Mode mode);

        /* renamed from: b */
        Mode mo639b(ImageView imageView);
    }

    /* renamed from: android.support.v4.widget.i$a */
    static class C2912a implements C0642b {
        C2912a() {
        }

        /* renamed from: a */
        public ColorStateList mo636a(ImageView imageView) {
            return imageView instanceof TintableImageSourceView ? ((TintableImageSourceView) imageView).getSupportImageTintList() : null;
        }

        /* renamed from: a */
        public void mo637a(ImageView imageView, ColorStateList colorStateList) {
            if (imageView instanceof TintableImageSourceView) {
                ((TintableImageSourceView) imageView).setSupportImageTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo638a(ImageView imageView, Mode mode) {
            if (imageView instanceof TintableImageSourceView) {
                ((TintableImageSourceView) imageView).setSupportImageTintMode(mode);
            }
        }

        /* renamed from: b */
        public Mode mo639b(ImageView imageView) {
            return imageView instanceof TintableImageSourceView ? ((TintableImageSourceView) imageView).getSupportImageTintMode() : null;
        }
    }

    @RequiresApi(21)
    /* renamed from: android.support.v4.widget.i$c */
    static class C4037c extends C2912a {
        C4037c() {
        }

        /* renamed from: a */
        public ColorStateList mo636a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: a */
        public void mo637a(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                colorStateList = imageView.getDrawable();
                Object obj = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? null : 1;
                if (colorStateList != null && obj != null) {
                    if (colorStateList.isStateful()) {
                        colorStateList.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(colorStateList);
                }
            }
        }

        /* renamed from: a */
        public void mo638a(ImageView imageView, Mode mode) {
            imageView.setImageTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                mode = imageView.getDrawable();
                Object obj = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? null : 1;
                if (mode != null && obj != null) {
                    if (mode.isStateful()) {
                        mode.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(mode);
                }
            }
        }

        /* renamed from: b */
        public Mode mo639b(ImageView imageView) {
            return imageView.getImageTintMode();
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1983a = new C4037c();
        } else {
            f1983a = new C2912a();
        }
    }

    @Nullable
    /* renamed from: a */
    public static ColorStateList m2581a(@NonNull ImageView imageView) {
        return f1983a.mo636a(imageView);
    }

    /* renamed from: a */
    public static void m2582a(@NonNull ImageView imageView, @Nullable ColorStateList colorStateList) {
        f1983a.mo637a(imageView, colorStateList);
    }

    @Nullable
    /* renamed from: b */
    public static Mode m2584b(@NonNull ImageView imageView) {
        return f1983a.mo639b(imageView);
    }

    /* renamed from: a */
    public static void m2583a(@NonNull ImageView imageView, @Nullable Mode mode) {
        f1983a.mo638a(imageView, mode);
    }
}
