package com.tinder.utils;

import android.app.Activity;
import android.support.annotation.StringRes;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tinder/utils/TinderSnackbar;", "", "()V", "Companion", "base_release"}, k = 1, mv = {1, 1, 10})
public final class at {
    /* renamed from: a */
    public static final C15355a f47621a = new C15355a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J,\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u001a\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0007J \u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\nH\u0007J\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0007J \u0010\u0012\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\nH\u0007¨\u0006\u0014"}, d2 = {"Lcom/tinder/utils/TinderSnackbar$Companion;", "", "()V", "getRootViewFromActivity", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "show", "", "stringResource", "", "action", "listener", "Landroid/view/View$OnClickListener;", "content", "", "view", "showShort", "showWithCustomTextColor", "color", "base_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.utils.at$a */
    public static final class C15355a {
        private C15355a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final void m57628a(@NotNull Activity activity, @StringRes int i, @StringRes int i2, @NotNull OnClickListener onClickListener) {
            C2668g.b(activity, "activity");
            C2668g.b(onClickListener, "listener");
            Snackbar.a(m57626a(activity), i, 0).a(i2, onClickListener).b();
        }

        @JvmStatic
        /* renamed from: a */
        public final void m57630a(@NotNull View view, @StringRes int i) {
            C2668g.b(view, "view");
            Snackbar.a(view, i, 0).b();
        }

        @JvmStatic
        /* renamed from: a */
        public final void m57632a(@NotNull View view, @NotNull String str) {
            C2668g.b(view, "view");
            C2668g.b(str, "content");
            Snackbar.a(view, str, 0).b();
        }

        @JvmStatic
        /* renamed from: a */
        public final void m57627a(@NotNull Activity activity, @StringRes int i) {
            C2668g.b(activity, "activity");
            C15355a c15355a = this;
            m57630a(m57626a(activity), i);
        }

        @JvmStatic
        /* renamed from: a */
        public final void m57629a(@NotNull Activity activity, @NotNull String str) {
            C2668g.b(activity, "activity");
            C2668g.b(str, "content");
            C15355a c15355a = this;
            m57632a(m57626a(activity), str);
        }

        @JvmStatic
        /* renamed from: b */
        public final void m57636b(@NotNull View view, @StringRes int i) {
            C2668g.b(view, "view");
            Snackbar.a(view, i, -1).b();
        }

        @JvmStatic
        /* renamed from: b */
        public final void m57637b(@NotNull View view, @NotNull String str) {
            C2668g.b(view, "view");
            C2668g.b(str, "content");
            Snackbar.a(view, str, -1).b();
        }

        @JvmStatic
        /* renamed from: b */
        public final void m57634b(@NotNull Activity activity, @StringRes int i) {
            C2668g.b(activity, "activity");
            C15355a c15355a = this;
            m57636b(m57626a(activity), i);
        }

        @JvmStatic
        /* renamed from: b */
        public final void m57635b(@NotNull Activity activity, @NotNull String str) {
            C2668g.b(activity, "activity");
            C2668g.b(str, "content");
            C15355a c15355a = this;
            m57637b(m57626a(activity), str);
        }

        @JvmStatic
        /* renamed from: a */
        public final void m57633a(@NotNull View view, @NotNull String str, int i) {
            C2668g.b(view, "view");
            C2668g.b(str, "content");
            Snackbar.a(view, str, 0).e(i).b();
        }

        @JvmStatic
        /* renamed from: a */
        public final void m57631a(@NotNull View view, @StringRes int i, int i2) {
            C2668g.b(view, "view");
            C15355a c15355a = this;
            String string = view.getResources().getString(i);
            C2668g.a(string, "view.resources.getString(stringResource)");
            m57633a(view, string, i2);
        }

        /* renamed from: a */
        private final View m57626a(Activity activity) {
            activity = activity.findViewById(16908290);
            if (activity == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            activity = ((ViewGroup) activity).getChildAt(0);
            C2668g.a(activity, "(activity.findViewById<V… ViewGroup).getChildAt(0)");
            return activity;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m57638a(@NotNull Activity activity, @StringRes int i) {
        f47621a.m57627a(activity, i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m57639a(@NotNull Activity activity, @StringRes int i, @StringRes int i2, @NotNull OnClickListener onClickListener) {
        f47621a.m57628a(activity, i, i2, onClickListener);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m57640a(@NotNull Activity activity, @NotNull String str) {
        f47621a.m57629a(activity, str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m57641a(@NotNull View view, @StringRes int i) {
        f47621a.m57630a(view, i);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m57642a(@NotNull View view, @StringRes int i, int i2) {
        f47621a.m57631a(view, i, i2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m57643a(@NotNull View view, @NotNull String str) {
        f47621a.m57632a(view, str);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m57644b(@NotNull Activity activity, @StringRes int i) {
        f47621a.m57634b(activity, i);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m57645b(@NotNull Activity activity, @NotNull String str) {
        f47621a.m57635b(activity, str);
    }
}
