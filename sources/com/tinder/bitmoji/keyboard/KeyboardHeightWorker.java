package com.tinder.bitmoji.keyboard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.jakewharton.rxbinding2.p140b.C5716a;
import com.tinder.base.C8314i.C8312b;
import com.tinder.domain.common.reactivex.RxUtils;
import io.reactivex.C3959e;
import io.reactivex.disposables.Disposable;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\u001a\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u000e2\b\b\u0001\u0010\u001c\u001a\u00020\u000eH\u0002J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001eJ\b\u0010\u001f\u001a\u00020\u0013H\u0002J\b\u0010 \u001a\u00020\u0013H\u0007J\b\u0010!\u001a\u00020\u0013H\u0007J\b\u0010\"\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/tinder/bitmoji/keyboard/KeyboardHeightWorker;", "Landroid/widget/PopupWindow;", "Landroid/arch/lifecycle/LifecycleObserver;", "activity", "Landroid/app/Activity;", "lifecycle", "Landroid/arch/lifecycle/Lifecycle;", "layoutInflater", "Landroid/view/LayoutInflater;", "(Landroid/app/Activity;Landroid/arch/lifecycle/Lifecycle;Landroid/view/LayoutInflater;)V", "globalLayoutsDisposable", "Lio/reactivex/disposables/Disposable;", "keyboardHeightSubject", "Lio/reactivex/subjects/PublishSubject;", "", "parentView", "Landroid/view/View;", "popupView", "destroy", "", "getScreenOrientation", "getScreenSize", "Landroid/graphics/Point;", "getVisibleRect", "Landroid/graphics/Rect;", "handleOnGlobalLayout", "notifyKeyboardHeightChanged", "height", "orientation", "observe", "Lio/reactivex/Observable;", "observeViewTreeObserver", "onDestroy", "onPause", "onResume", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
@SuppressLint({"InflateParams"})
public final class KeyboardHeightWorker extends PopupWindow implements LifecycleObserver {
    /* renamed from: a */
    private final PublishSubject<Integer> f12224a;
    /* renamed from: b */
    private final View f12225b;
    /* renamed from: c */
    private final View f12226c;
    /* renamed from: d */
    private Disposable f12227d;
    /* renamed from: e */
    private final Activity f12228e;

    public /* synthetic */ KeyboardHeightWorker(Activity activity, Lifecycle lifecycle, LayoutInflater layoutInflater, int i, C15823e c15823e) {
        if ((i & 4) != 0) {
            layoutInflater = activity.getLayoutInflater();
            C2668g.m10305a((Object) layoutInflater, "activity.layoutInflater");
        }
        this(activity, lifecycle, layoutInflater);
    }

    public KeyboardHeightWorker(@NotNull Activity activity, @NotNull Lifecycle lifecycle, @NotNull LayoutInflater layoutInflater) {
        C2668g.m10309b(activity, "activity");
        C2668g.m10309b(lifecycle, "lifecycle");
        C2668g.m10309b(layoutInflater, "layoutInflater");
        super(activity);
        this.f12228e = activity;
        Object a = PublishSubject.a();
        C2668g.m10305a(a, "PublishSubject.create()");
        this.f12224a = a;
        a = layoutInflater.inflate(C8312b.popup_window, null, false);
        C2668g.m10305a(a, "layoutInflater.inflate(R…opup_window, null, false)");
        this.f12225b = a;
        a = this.f12228e.findViewById(16908290);
        C2668g.m10305a(a, "activity.findViewById(android.R.id.content)");
        this.f12226c = a;
        setContentView(this.f12225b);
        setSoftInputMode(21);
        setInputMethodMode(1);
        setWidth(0);
        setHeight(-1);
        lifecycle.mo36a(this);
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<Integer> m14732a() {
        Object distinctUntilChanged = this.f12224a.hide().distinctUntilChanged();
        C2668g.m10305a(distinctUntilChanged, "keyboardHeightSubject.hi…().distinctUntilChanged()");
        return distinctUntilChanged;
    }

    @OnLifecycleEvent(Event.ON_RESUME)
    public final void onResume() {
        m14727c();
        this.f12226c.post(new KeyboardHeightWorker$c(this));
    }

    @OnLifecycleEvent(Event.ON_PAUSE)
    public final void onPause() {
        m14725b();
    }

    @OnLifecycleEvent(Event.ON_DESTROY)
    public final void onDestroy() {
        m14725b();
    }

    /* renamed from: b */
    private final void m14725b() {
        Disposable disposable = this.f12227d;
        if (disposable != null) {
            disposable.dispose();
        }
        dismiss();
    }

    /* renamed from: c */
    private final void m14727c() {
        if (!RxUtils.INSTANCE.isSubscribed(this.f12227d)) {
            this.f12227d = C5716a.c(this.f12225b).observeOn(C15674a.a()).subscribe(new KeyboardHeightWorker$a(this), KeyboardHeightWorker$b.f33864a);
        }
    }

    /* renamed from: d */
    private final void m14728d() {
        Point f = m14730f();
        Rect g = m14731g();
        int e = m14729e();
        int max = Math.max(0, f.y - g.bottom);
        switch (e) {
            case 1:
                m14724a(max, 1);
                return;
            case 2:
                m14724a(max, 2);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m14724a(int i, int i2) {
        this.f12224a.onNext(Integer.valueOf(i));
    }

    /* renamed from: e */
    private final int m14729e() {
        Object resources = this.f12228e.getResources();
        C2668g.m10305a(resources, "activity.resources");
        return resources.getConfiguration().orientation;
    }

    /* renamed from: f */
    private final Point m14730f() {
        Point point = new Point();
        Object windowManager = this.f12228e.getWindowManager();
        C2668g.m10305a(windowManager, "activity.windowManager");
        windowManager.getDefaultDisplay().getSize(point);
        return point;
    }

    /* renamed from: g */
    private final Rect m14731g() {
        Rect rect = new Rect();
        this.f12225b.getWindowVisibleDisplayFrame(rect);
        return rect;
    }
}
