package com.tinder.reactions.common.p388b;

import android.support.v4.view.ViewCompat;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.jakewharton.rxbinding.view.C5707b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Action0;
import rx.subjects.C19785a;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\tJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0018"}, d2 = {"Lcom/tinder/reactions/common/rx/RxViewObservers;", "", "()V", "backKey", "Lrx/Observable;", "Landroid/view/View;", "view", "backKeyUntilDetached", "childWidth", "", "viewGroup", "Landroid/view/ViewGroup;", "index", "clicks", "Ljava/lang/Void;", "clicksUntilDetached", "detached", "dismiss", "Landroid/app/Dialog;", "dialog", "globalLayouts", "globalLayoutsOnceUntilDetached", "globalLayoutsUntilDetached", "laidOutOnceUntilDetached", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.common.b.a */
public final class C14612a {
    /* renamed from: a */
    public static final C14612a f46118a = new C14612a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onKey"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.common.b.a$a */
    static final class C14609a implements OnKeyListener {
        /* renamed from: a */
        final /* synthetic */ PublishSubject f46113a;
        /* renamed from: b */
        final /* synthetic */ View f46114b;

        C14609a(PublishSubject publishSubject, View view) {
            this.f46113a = publishSubject;
            this.f46114b = view;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            C2668g.a(keyEvent, "event");
            if (keyEvent.getAction() != 1 || i != 4) {
                return null;
            }
            this.f46113a.onNext(this.f46114b);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/reactions/common/rx/RxViewObservers$detached$listener$1", "Landroid/view/View$OnAttachStateChangeListener;", "(Lrx/subjects/PublishSubject;)V", "onViewAttachedToWindow", "", "v", "Landroid/view/View;", "onViewDetachedFromWindow", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.common.b.a$c */
    public static final class C14610c implements OnAttachStateChangeListener {
        /* renamed from: a */
        final /* synthetic */ PublishSubject f46115a;

        public void onViewAttachedToWindow(@NotNull View view) {
            C2668g.b(view, "v");
        }

        C14610c(PublishSubject publishSubject) {
            this.f46115a = publishSubject;
        }

        public void onViewDetachedFromWindow(@NotNull View view) {
            C2668g.b(view, "v");
            this.f46115a.onNext(view);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onGlobalLayout"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.common.b.a$e */
    static final class C14611e implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ C19785a f46116a;
        /* renamed from: b */
        final /* synthetic */ View f46117b;

        C14611e(C19785a c19785a, View view) {
            this.f46116a = c19785a;
            this.f46117b = view;
        }

        public final void onGlobalLayout() {
            this.f46116a.onNext(this.f46117b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.common.b.a$b */
    static final class C18692b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ View f58171a;
        /* renamed from: b */
        final /* synthetic */ C14610c f58172b;

        C18692b(View view, C14610c c14610c) {
            this.f58171a = view;
            this.f58172b = c14610c;
        }

        public final void call() {
            this.f58171a.removeOnAttachStateChangeListener(this.f58172b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.common.b.a$d */
    static final class C18693d implements Action0 {
        /* renamed from: a */
        final /* synthetic */ View f58173a;
        /* renamed from: b */
        final /* synthetic */ OnGlobalLayoutListener f58174b;

        C18693d(View view, OnGlobalLayoutListener onGlobalLayoutListener) {
            this.f58173a = view;
            this.f58174b = onGlobalLayoutListener;
        }

        public final void call() {
            this.f58173a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f58174b);
        }
    }

    private C14612a() {
    }

    @NotNull
    /* renamed from: a */
    public final Observable<View> m55756a(@NotNull View view) {
        C2668g.b(view, "view");
        PublishSubject w = PublishSubject.w();
        C14610c c14610c = new C14610c(w);
        view.addOnAttachStateChangeListener(c14610c);
        view = w.e().d(new C18692b(view, c14610c));
        C2668g.a(view, "detachedSubject\n        …stener)\n                }");
        return view;
    }

    @NotNull
    /* renamed from: b */
    public final Observable<View> m55757b(@NotNull View view) {
        C2668g.b(view, "view");
        PublishSubject w = PublishSubject.w();
        view.setOnKeyListener(new C14609a(w, view));
        view = w.e();
        C2668g.a(view, "backKeySubject.asObservable()");
        return view;
    }

    @NotNull
    /* renamed from: c */
    public final Observable<View> m55758c(@NotNull View view) {
        C2668g.b(view, "view");
        C19785a w = C19785a.w();
        OnGlobalLayoutListener c14611e = new C14611e(w, view);
        view.getViewTreeObserver().addOnGlobalLayoutListener(c14611e);
        view = w.e().d(new C18693d(view, c14611e));
        C2668g.a(view, "layoutSubject\n          …stener)\n                }");
        return view;
    }

    @NotNull
    /* renamed from: d */
    public final Observable<View> m55759d(@NotNull View view) {
        C2668g.b(view, "view");
        view = m55758c(view).j(m55756a(view));
        C2668g.a(view, "globalLayouts(view)\n    …takeUntil(detached(view))");
        return view;
    }

    @NotNull
    /* renamed from: e */
    public final Observable<View> m55760e(@NotNull View view) {
        C2668g.b(view, "view");
        view = m55759d(view).c(1);
        C2668g.a(view, "globalLayoutsUntilDetach…\n                .take(1)");
        return view;
    }

    @NotNull
    /* renamed from: f */
    public final Observable<View> m55761f(@NotNull View view) {
        C2668g.b(view, "view");
        if (!ViewCompat.z(view)) {
            return m55760e(view);
        }
        view = Observable.a(view);
        C2668g.a(view, "Observable.just(view)");
        return view;
    }

    @NotNull
    /* renamed from: g */
    public final Observable<Void> m55762g(@NotNull View view) {
        C2668g.b(view, "view");
        view = C5707b.b(view);
        C2668g.a(view, "RxView.clicks(view)");
        return view;
    }

    @NotNull
    /* renamed from: h */
    public final Observable<View> m55763h(@NotNull View view) {
        C2668g.b(view, "view");
        view = m55757b(view).j(m55756a(view));
        C2668g.a(view, "backKey(view)\n          …takeUntil(detached(view))");
        return view;
    }
}
