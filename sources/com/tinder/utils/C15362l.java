package com.tinder.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.v4.content.C0432b;
import android.support.v4.graphics.drawable.C0450a;
import com.bumptech.glide.C0994i;
import com.bumptech.glide.C4080b;
import com.bumptech.glide.load.Transformation;
import com.tinder.R;
import com.tinder.module.ForApplication;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import jp.wasabeef.glide.transformations.C17541b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tJ(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/utils/BitmapFactory;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "fromResource", "Lrx/Single;", "Landroid/graphics/Bitmap;", "resId", "", "fromUrl", "url", "", "imgSize", "cropToCircle", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.utils.l */
public final class C15362l {
    /* renamed from: a */
    private final Context f47633a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.utils.l$a */
    static final class C15360a<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C15362l f47627a;
        /* renamed from: b */
        final /* synthetic */ int f47628b;

        C15360a(C15362l c15362l, int i) {
            this.f47627a = c15362l;
            this.f47628b = i;
        }

        public /* synthetic */ Object call() {
            return m57655a();
        }

        /* renamed from: a */
        public final Bitmap m57655a() {
            Drawable a = C0432b.a(this.f47627a.f47633a, this.f47628b);
            if (a == null) {
                C2668g.a();
            }
            if (VERSION.SDK_INT < 21) {
                a = C0450a.g(a).mutate();
            }
            C2668g.a(a, "drawable");
            Bitmap createBitmap = Bitmap.createBitmap(a.getIntrinsicWidth(), a.getIntrinsicHeight(), Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            a.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            a.draw(canvas);
            return createBitmap;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.utils.l$b */
    static final class C15361b<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C15362l f47629a;
        /* renamed from: b */
        final /* synthetic */ int f47630b;
        /* renamed from: c */
        final /* synthetic */ String f47631c;
        /* renamed from: d */
        final /* synthetic */ boolean f47632d;

        C15361b(C15362l c15362l, int i, String str, boolean z) {
            this.f47629a = c15362l;
            this.f47630b = i;
            this.f47631c = str;
            this.f47632d = z;
        }

        public /* synthetic */ Object call() {
            return m57656a();
        }

        /* renamed from: a */
        public final Bitmap m57656a() {
            int dimensionPixelSize = this.f47629a.f47633a.getResources().getDimensionPixelSize(this.f47630b);
            C4080b l = C0994i.b(this.f47629a.f47633a).a(this.f47631c).l();
            if (this.f47632d) {
                l.a(new Transformation[]{new C17541b(this.f47629a.f47633a)});
            }
            return (Bitmap) l.d(dimensionPixelSize, this.f47630b).get();
        }
    }

    @Inject
    public C15362l(@NotNull @ForApplication Context context) {
        C2668g.b(context, "context");
        this.f47633a = context;
    }

    @NotNull
    /* renamed from: a */
    public final Single<Bitmap> m57659a(@DrawableRes int i) {
        i = Single.a(new C15360a(this, i));
        C2668g.a(i, "Single.fromCallable {\n  …Callable bitmap\n        }");
        return i;
    }

    @NotNull
    /* renamed from: a */
    public static /* synthetic */ Single m57658a(C15362l c15362l, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != null) {
            i = R.dimen.notification_big_icon_length;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return c15362l.m57660a(str, i, z);
    }

    @NotNull
    /* renamed from: a */
    public final Single<Bitmap> m57660a(@NotNull String str, @DimenRes int i, boolean z) {
        C2668g.b(str, "url");
        str = Single.a(new C15361b(this, i, str, z));
        C2668g.a(str, "Single.fromCallable {\n  … imgSize).get()\n        }");
        return str;
    }
}
