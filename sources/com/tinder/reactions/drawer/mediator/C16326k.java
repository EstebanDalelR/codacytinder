package com.tinder.reactions.drawer.mediator;

import android.view.View;
import com.tinder.reactions.common.mediator.C14615a;
import com.tinder.reactions.common.p388b.C14612a;
import com.tinder.reactions.common.view.SlidingViewInterface;
import com.tinder.reactions.drawer.model.C14635a;
import com.tinder.reactions.drawer.model.SlideType;
import com.tinder.utils.RxUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.functions.Action1;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/reactions/drawer/mediator/SlidingBarMediator;", "Lcom/tinder/reactions/common/mediator/ViewMediator;", "Lcom/tinder/reactions/common/view/SlidingViewInterface;", "view", "Landroid/view/View;", "slideType", "Lcom/tinder/reactions/drawer/model/SlideType;", "(Landroid/view/View;Lcom/tinder/reactions/drawer/model/SlideType;)V", "slidingViewSubject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/reactions/drawer/model/SlidingView;", "getSlidingViewSingle", "Lrx/Single;", "getView", "onViewAttachedToWindow", "", "v", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.drawer.mediator.k */
public class C16326k extends C14615a implements SlidingViewInterface {
    /* renamed from: a */
    private final PublishSubject<C14635a> f50800a;
    /* renamed from: b */
    private final SlideType f50801b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.k$a */
    static final class C18721a<T> implements Action1<View> {
        /* renamed from: a */
        final /* synthetic */ C16326k f58204a;

        C18721a(C16326k c16326k) {
            this.f58204a = c16326k;
        }

        public /* synthetic */ void call(Object obj) {
            m67146a((View) obj);
        }

        /* renamed from: a */
        public final void m67146a(View view) {
            view = this.f58204a.m55767a().getY();
            if (this.f58204a.f50801b == SlideType.DOWN) {
                view += (float) this.f58204a.m55767a().getHeight();
            } else {
                view -= (float) this.f58204a.m55767a().getHeight();
            }
            this.f58204a.f50800a.onNext(new C14635a(this.f58204a.m55767a(), this.f58204a.f50801b, this.f58204a.m55767a().getY(), view));
            this.f58204a.f50800a.onCompleted();
        }
    }

    public C16326k(@NotNull View view, @NotNull SlideType slideType) {
        C2668g.b(view, "view");
        C2668g.b(slideType, "slideType");
        super(view);
        this.f50801b = slideType;
        view = PublishSubject.w();
        C2668g.a(view, "PublishSubject.create<SlidingView>()");
        this.f50800a = view;
    }

    public void onViewAttachedToWindow(@NotNull View view) {
        C2668g.b(view, "v");
        C14612a.f46118a.m55760e(m55767a()).a(RxUtils.a()).d(new C18721a(this));
    }

    @NotNull
    public Single<C14635a> getSlidingViewSingle() {
        Single<C14635a> a = this.f50800a.a();
        C2668g.a(a, "slidingViewSubject.toSingle()");
        return a;
    }

    @NotNull
    public View getView() {
        return m55767a();
    }
}
