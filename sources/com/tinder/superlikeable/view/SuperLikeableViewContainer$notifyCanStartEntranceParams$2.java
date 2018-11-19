package com.tinder.superlikeable.view;

import com.tinder.superlikeable.view.SuperLikeableViewContainer.C15161b;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
final class SuperLikeableViewContainer$notifyCanStartEntranceParams$2 extends Lambda implements Function0<C15813i> {
    /* renamed from: a */
    final /* synthetic */ SuperLikeableViewContainer f58622a;
    /* renamed from: b */
    final /* synthetic */ C15161b f58623b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.superlikeable.view.SuperLikeableViewContainer$notifyCanStartEntranceParams$2$1 */
    static final class C189501 extends Lambda implements Function0<C15813i> {
        /* renamed from: a */
        public static final C189501 f58621a = new C189501();

        C189501() {
            super(0);
        }

        /* renamed from: a */
        public final void m67455a() {
        }

        public /* synthetic */ Object invoke() {
            m67455a();
            return C15813i.f49016a;
        }
    }

    SuperLikeableViewContainer$notifyCanStartEntranceParams$2(SuperLikeableViewContainer superLikeableViewContainer, C15161b c15161b) {
        this.f58622a = superLikeableViewContainer;
        this.f58623b = c15161b;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        m67456a();
        return C15813i.f49016a;
    }

    /* renamed from: a */
    public final void m67456a() {
        this.f58622a.f52081h.setOnViewReadyListener(C189501.f58621a);
        if (this.f58622a.m62519a()) {
            this.f58622a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f58623b);
            this.f58622a.f52090q = true;
            this.f58622a.getPresenter().m56979d();
        }
    }
}
