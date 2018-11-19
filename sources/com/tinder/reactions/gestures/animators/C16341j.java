package com.tinder.reactions.gestures.animators;

import com.tinder.reactions.gestures.common.GestureEvent.State;
import com.tinder.reactions.gestures.p393a.C14641a;
import com.tinder.reactions.gestures.view.C14673e;
import com.tinder.reactions.gestures.view.SelectableGrandGestureView;
import com.tinder.reactions.gestures.viewmodel.C16364m;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action1;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/tinder/reactions/gestures/animators/SelectableGrandGestureAnimator;", "Lcom/tinder/reactions/gestures/animators/GrandGestureAnimator;", "view", "Lcom/tinder/reactions/gestures/view/SelectableGrandGestureView;", "viewModel", "Lcom/tinder/reactions/gestures/viewmodel/SelectableGrandGestureViewModel;", "mediator", "Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;", "(Lcom/tinder/reactions/gestures/view/SelectableGrandGestureView;Lcom/tinder/reactions/gestures/viewmodel/SelectableGrandGestureViewModel;Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.animators.j */
public final class C16341j extends C14646c {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "state", "Lcom/tinder/reactions/gestures/common/GestureEvent$State;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.animators.j$1 */
    static final class C179761<T, R> implements Func1<State, Boolean> {
        /* renamed from: a */
        public static final C179761 f55907a = new C179761();

        C179761() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65323a((State) obj));
        }

        /* renamed from: a */
        public final boolean m65323a(State state) {
            return state == State.GESTURE_ACTIVATED ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.animators.j$3 */
    static final class C187323<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C187323 f58221a = new C187323();

        C187323() {
        }

        public /* synthetic */ void call(Object obj) {
            m67156a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67156a(Throwable th) {
            C0001a.c(th);
        }
    }

    public C16341j(@NotNull final SelectableGrandGestureView selectableGrandGestureView, @NotNull C16364m c16364m, @NotNull C14641a c14641a) {
        C2668g.b(selectableGrandGestureView, "view");
        C2668g.b(c16364m, "viewModel");
        C2668g.b(c14641a, "mediator");
        super(selectableGrandGestureView, c16364m, c14641a);
        C14673e.m55918a(selectableGrandGestureView, c16364m);
        selectableGrandGestureView.getGrandGestureStateObservable().f((Func1) C179761.f55907a).a((Action1) new Action1<State>() {
            public /* synthetic */ void call(Object obj) {
                m67155a((State) obj);
            }

            /* renamed from: a */
            public final void m67155a(State state) {
                this.m55839a(selectableGrandGestureView.getCurrentGrandGestureType());
            }
        }, (Action1) C187323.f58221a);
    }
}
