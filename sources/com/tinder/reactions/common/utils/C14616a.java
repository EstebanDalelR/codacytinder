package com.tinder.reactions.common.utils;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.jakewharton.rxbinding.view.C5707b;
import com.tinder.utils.av;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/reactions/common/utils/KeyboardUtils;", "", "()V", "hideKeyboard", "", "view", "Landroid/view/View;", "showKeyboard", "showKeyboardWithDelay", "delayMs", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.common.utils.a */
public final class C14616a {
    /* renamed from: a */
    public static final C14616a f46121a = new C14616a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.common.utils.a$a */
    static final class C18695a<T> implements Action1<Long> {
        /* renamed from: a */
        final /* synthetic */ View f58176a;

        C18695a(View view) {
            this.f58176a = view;
        }

        public /* synthetic */ void call(Object obj) {
            m67126a((Long) obj);
        }

        /* renamed from: a */
        public final void m67126a(Long l) {
            C14616a.f46121a.m55768a(this.f58176a);
        }
    }

    private C14616a() {
    }

    /* renamed from: a */
    public final void m55768a(@Nullable View view) {
        if (view != null) {
            av.a(view.getContext(), view);
        }
    }

    /* renamed from: a */
    public final void m55769a(@Nullable View view, long j) {
        if (view != null) {
            j = Observable.b(j, TimeUnit.MILLISECONDS).j(C5707b.a(view)).a(C19397a.a());
            Action1 c18695a = new C18695a(view);
            view = (Function1) KeyboardUtils$showKeyboardWithDelay$2.f59371a;
            if (view != null) {
                view = new C18696b(view);
            }
            j.a(c18695a, (Action1) view);
        }
    }

    /* renamed from: b */
    public final void m55770b(@Nullable View view) {
        if (view != null) {
            Object systemService = view.getContext().getSystemService("input_method");
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
