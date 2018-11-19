package com.tinder.reactions.drawer.mediator;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.view.View;
import com.tinder.chat.view.provider.ChatInputTextStateUpdatesProvider;
import com.tinder.chat.view.provider.ChatTextInputState;
import com.tinder.reactions.common.mediator.C14615a;
import com.tinder.reactions.common.p388b.C14612a;
import com.tinder.reactions.common.view.SlidingViewInterface;
import com.tinder.reactions.drawer.model.C14635a;
import com.tinder.reactions.drawer.model.SlideType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Single;
import rx.Subscription;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/tinder/reactions/drawer/mediator/DragHandleMediator;", "Lcom/tinder/reactions/common/mediator/ViewMediator;", "Lcom/tinder/reactions/common/view/SlidingViewInterface;", "view", "Landroid/view/View;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "chatInputStateUpdatesProvider", "Lcom/tinder/chat/view/provider/ChatInputTextStateUpdatesProvider;", "animatorControllerInterface", "Lcom/tinder/reactions/drawer/mediator/AnimatorControllerInterface;", "(Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Lcom/tinder/chat/view/provider/ChatInputTextStateUpdatesProvider;Lcom/tinder/reactions/drawer/mediator/AnimatorControllerInterface;)V", "chatInputState", "Lcom/tinder/chat/view/provider/ChatTextInputState;", "layoutSubscription", "Lrx/Subscription;", "slidingViewSubject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/reactions/drawer/model/SlidingView;", "getSlidingViewSingle", "Lrx/Single;", "getView", "onViewAttachedToWindow", "", "v", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.drawer.mediator.d */
public final class C16320d extends C14615a implements SlidingViewInterface {
    /* renamed from: a */
    private final PublishSubject<C14635a> f50764a;
    /* renamed from: b */
    private Subscription f50765b;
    /* renamed from: c */
    private ChatTextInputState f50766c = ChatTextInputState.INACTIVE;
    /* renamed from: d */
    private final RecyclerView f50767d;
    /* renamed from: e */
    private final ChatInputTextStateUpdatesProvider f50768e;
    /* renamed from: f */
    private final AnimatorControllerInterface f50769f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"com/tinder/reactions/drawer/mediator/DragHandleMediator$onViewAttachedToWindow$4", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "(Lcom/tinder/reactions/drawer/mediator/DragHandleMediator;)V", "onScrolled", "", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "dx", "", "dy", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.d$d */
    public static final class C16319d extends OnScrollListener {
        /* renamed from: a */
        final /* synthetic */ C16320d f50763a;

        C16319d(C16320d c16320d) {
            this.f50763a = c16320d;
        }

        public void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            C2668g.b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (recyclerView.canScrollVertically(1) != null && this.f50763a.f50769f.allowDrag() != null) {
                this.f50763a.m55767a().setVisibility(8);
            } else if (this.f50763a.f50766c == ChatTextInputState.INACTIVE) {
                this.f50763a.m55767a().setVisibility(0);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.d$a */
    static final class C18711a<T> implements Action1<View> {
        /* renamed from: a */
        final /* synthetic */ C16320d f58192a;

        C18711a(C16320d c16320d) {
            this.f58192a = c16320d;
        }

        public /* synthetic */ void call(Object obj) {
            m67137a((View) obj);
        }

        /* renamed from: a */
        public final void m67137a(View view) {
            view = this.f58192a.f50765b;
            if (view != null) {
                view.unsubscribe();
            }
            this.f58192a.f50764a.onNext(new C14635a(this.f58192a.m55767a(), SlideType.HANDLE, 0.0f, 0.0f, 12, null));
            this.f58192a.f50764a.onCompleted();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "chatInputState", "Lcom/tinder/chat/view/provider/ChatTextInputState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.d$b */
    static final class C18712b<T> implements Action1<ChatTextInputState> {
        /* renamed from: a */
        final /* synthetic */ C16320d f58193a;

        C18712b(C16320d c16320d) {
            this.f58193a = c16320d;
        }

        public /* synthetic */ void call(Object obj) {
            m67138a((ChatTextInputState) obj);
        }

        /* renamed from: a */
        public final void m67138a(ChatTextInputState chatTextInputState) {
            C16320d c16320d = this.f58193a;
            C2668g.a(chatTextInputState, "chatInputState");
            c16320d.f50766c = chatTextInputState;
            if (chatTextInputState == ChatTextInputState.ACTIVE) {
                this.f58193a.m55767a().setVisibility(8);
            } else if (this.f58193a.f50769f.allowDrag() != null) {
                this.f58193a.m55767a().setVisibility(0);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.mediator.d$c */
    static final class C18713c<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18713c f58194a = new C18713c();

        C18713c() {
        }

        public /* synthetic */ void call(Object obj) {
            m67139a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67139a(Throwable th) {
            C0001a.c(th, "Error handling chat input update", new Object[0]);
        }
    }

    public C16320d(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull ChatInputTextStateUpdatesProvider chatInputTextStateUpdatesProvider, @NotNull AnimatorControllerInterface animatorControllerInterface) {
        C2668g.b(view, "view");
        C2668g.b(recyclerView, "recyclerView");
        C2668g.b(chatInputTextStateUpdatesProvider, "chatInputStateUpdatesProvider");
        C2668g.b(animatorControllerInterface, "animatorControllerInterface");
        super(view);
        this.f50767d = recyclerView;
        this.f50768e = chatInputTextStateUpdatesProvider;
        this.f50769f = animatorControllerInterface;
        view = PublishSubject.w();
        C2668g.a(view, "PublishSubject.create<SlidingView>()");
        this.f50764a = view;
    }

    public void onViewAttachedToWindow(@NotNull View view) {
        C2668g.b(view, "v");
        super.onViewAttachedToWindow(view);
        C14612a.f46118a.m55760e(m55767a()).a(C19397a.a()).d(new C18711a(this));
        this.f50768e.observe().j(C14612a.f46118a.m55756a(m55767a())).a(C19397a.a()).a(new C18712b(this), C18713c.f58194a);
        this.f50767d.addOnScrollListener(new C16319d(this));
    }

    @NotNull
    public Single<C14635a> getSlidingViewSingle() {
        Single<C14635a> a = this.f50764a.a();
        C2668g.a(a, "slidingViewSubject.toSingle()");
        return a;
    }

    @NotNull
    public View getView() {
        return m55767a();
    }
}
