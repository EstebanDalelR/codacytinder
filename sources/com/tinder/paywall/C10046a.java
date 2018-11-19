package com.tinder.paywall;

import android.app.Application;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.DrawableRes;
import android.support.v4.content.C0432b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/paywall/DrawableFactory;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "createGradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "res", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.paywall.a */
public final class C10046a {
    /* renamed from: a */
    private final Application f32940a;

    @Inject
    public C10046a(@NotNull Application application) {
        C2668g.b(application, "application");
        this.f32940a = application;
    }

    @Nullable
    /* renamed from: a */
    public final GradientDrawable m41098a(@DrawableRes int i) {
        return (GradientDrawable) C0432b.a(this.f32940a, i);
    }
}
