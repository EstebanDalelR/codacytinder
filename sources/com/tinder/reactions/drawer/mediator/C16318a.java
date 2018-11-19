package com.tinder.reactions.drawer.mediator;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.tinder.grandgesturessdk.common.interfaces.LayoutChangedInterface;
import com.tinder.reactions.common.mediator.C14615a;
import com.tinder.reactions.common.view.DynamicSlidingViewInterface;
import com.tinder.reactions.drawer.model.C14635a;
import com.tinder.reactions.drawer.model.SlideType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0002J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/tinder/reactions/drawer/mediator/BottomBarMediator;", "Lcom/tinder/reactions/common/mediator/ViewMediator;", "Lcom/tinder/reactions/common/view/DynamicSlidingViewInterface;", "Lcom/tinder/grandgesturessdk/common/interfaces/LayoutChangedInterface;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "layoutSubject", "Lrx/subjects/PublishSubject;", "oldHeight", "", "value", "originalHeight", "setOriginalHeight", "(I)V", "", "originalStartY", "setOriginalStartY", "(F)V", "slidingViewSubject", "Lcom/tinder/reactions/drawer/model/SlidingView;", "startY", "getLayoutChangedObservable", "Lrx/Observable;", "getSlidingViewObservable", "getView", "handleHeightChanged", "", "newHeight", "onViewAttachedToWindow", "v", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.drawer.mediator.a */
public final class C16318a extends C14615a implements LayoutChangedInterface, DynamicSlidingViewInterface {
    /* renamed from: a */
    private final PublishSubject<C14635a> f50757a;
    /* renamed from: b */
    private final PublishSubject<View> f50758b;
    /* renamed from: c */
    private int f50759c;
    /* renamed from: d */
    private float f50760d;
    /* renamed from: e */
    private float f50761e;
    /* renamed from: f */
    private int f50762f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\n¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous parameter 4>", "<anonymous parameter 5>", "<anonymous parameter 6>", "<anonymous parameter 7>", "<anonymous parameter 8>", "onLayoutChange"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.a$a */
    static final class C14627a implements OnLayoutChangeListener {
        /* renamed from: a */
        final /* synthetic */ C16318a f46138a;

        C14627a(C16318a c16318a) {
            this.f46138a = c16318a;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f46138a.m61529b(this.f46138a.m55767a().getHeight());
        }
    }

    public C16318a(@NotNull View view) {
        C2668g.b(view, "view");
        super(view);
        view = PublishSubject.w();
        C2668g.a(view, "PublishSubject.create<SlidingView>()");
        this.f50757a = view;
        view = PublishSubject.w();
        C2668g.a(view, "PublishSubject.create<View>()");
        this.f50758b = view;
    }

    /* renamed from: a */
    private final void m61526a(float f) {
        if (this.f50761e == 0.0f) {
            this.f50761e = f;
        }
    }

    /* renamed from: a */
    private final void m61527a(int i) {
        if (this.f50762f == 0) {
            this.f50762f = i;
        }
    }

    public void onViewAttachedToWindow(@NotNull View view) {
        C2668g.b(view, "v");
        super.onViewAttachedToWindow(view);
        m55767a().addOnLayoutChangeListener(new C14627a(this));
    }

    @NotNull
    public Observable<C14635a> getSlidingViewObservable() {
        Observable<C14635a> e = this.f50757a.e();
        C2668g.a(e, "slidingViewSubject.asObservable()");
        return e;
    }

    @NotNull
    public Observable<View> getLayoutChangedObservable() {
        Observable<View> e = this.f50758b.e();
        C2668g.a(e, "layoutSubject.asObservable()");
        return e;
    }

    @NotNull
    public View getView() {
        return m55767a();
    }

    /* renamed from: b */
    private final void m61529b(int i) {
        if (i != this.f50759c) {
            m61526a(m55767a().getY());
            m61527a(i);
            this.f50760d = this.f50760d != 0.0f ? (this.f50761e - ((float) i)) + ((float) this.f50762f) : this.f50761e;
            this.f50757a.onNext(new C14635a(m55767a(), SlideType.DOWN, this.f50760d, this.f50760d + ((float) m55767a().getHeight())));
            this.f50758b.onNext(m55767a());
            this.f50759c = i;
        }
    }
}
