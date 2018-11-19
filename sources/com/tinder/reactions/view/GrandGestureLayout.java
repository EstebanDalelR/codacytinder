package com.tinder.reactions.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.chat.target.GrandGestureTarget;
import com.tinder.chat.view.ChatInputBoxContainer;
import com.tinder.chat.view.ChatToolbar;
import com.tinder.chat.view.ChatViewContainer;
import com.tinder.chat.view.provider.ChatInputTextStateUpdatesProvider;
import com.tinder.common.view.ActivityLifeCycleAwareView;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.audio.C14589a;
import com.tinder.reactions.audio.C14589a.C14588a;
import com.tinder.reactions.common.mediator.GrandGestureInterface;
import com.tinder.reactions.common.p388b.C14612a;
import com.tinder.reactions.common.view.DynamicSlidingViewInterface;
import com.tinder.reactions.common.view.SlidingViewInterface;
import com.tinder.reactions.drawer.mediator.AnimatorControllerInterface;
import com.tinder.reactions.drawer.mediator.C14633g;
import com.tinder.reactions.drawer.mediator.C16318a;
import com.tinder.reactions.drawer.mediator.C16320d;
import com.tinder.reactions.drawer.mediator.C16324e;
import com.tinder.reactions.drawer.mediator.C16326k;
import com.tinder.reactions.drawer.mediator.DrawerLayoutController;
import com.tinder.reactions.drawer.model.SlideType;
import com.tinder.reactions.drawer.p464a.C16317a;
import com.tinder.reactions.drawer.view.AnimatorTouchInterface;
import com.tinder.reactions.gestures.animators.C14650f;
import com.tinder.reactions.gestures.common.GestureEvent;
import com.tinder.reactions.gestures.common.GestureEvent.State;
import com.tinder.reactions.gestures.common.ReactionEvent;
import com.tinder.reactions.gestures.p393a.C14641a;
import com.tinder.reactions.gestures.view.GrandGestureReactionView;
import com.tinder.reactions.gestures.viewmodel.C14676f;
import com.tinder.reactions.navigation.mediator.C16374a;
import com.tinder.reactions.navigation.view.GrandGestureNavigationView;
import com.tinder.reactions.navigation.viewmodel.GrandGestureNavigationItem;
import com.tinder.reactions.p384b.C14594a;
import java.util.HashMap;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010U\u001a\u00020VH\u0016J\b\u0010W\u001a\u00020VH\u0016J\u000e\u0010X\u001a\b\u0012\u0004\u0012\u00020Z0YH\u0016J\u000e\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0YH\u0016J\u0010\u0010]\u001a\u00020V2\u0006\u0010^\u001a\u00020_H\u0002J\u0010\u0010`\u001a\u00020V2\u0006\u0010^\u001a\u00020_H\u0002J\b\u0010a\u001a\u00020VH\u0014J\b\u0010b\u001a\u00020VH\u0014J\b\u0010c\u001a\u00020VH\u0015J\b\u0010d\u001a\u00020VH\u0016J\b\u0010e\u001a\u00020VH\u0016J\u001a\u0010f\u001a\u00020V2\b\u0010g\u001a\u0004\u0018\u00010&2\u0006\u0010h\u001a\u00020iH\u0014J\u0010\u0010j\u001a\u00020V2\u0006\u0010k\u001a\u00020lH\u0016J\u0010\u0010m\u001a\u00020V2\u0006\u0010n\u001a\u00020oH\u0016J\b\u0010p\u001a\u00020VH\u0016J\u0016\u0010q\u001a\u00020V2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020t0sH\u0016J\b\u0010u\u001a\u00020VH\u0002J\u0010\u0010v\u001a\u00020V2\u0006\u0010w\u001a\u00020xH\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u00020\u00198\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b \u0010!R\u000e\u0010#\u001a\u00020$X.¢\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b)\u0010\u0017\u001a\u0004\b'\u0010(R\u001b\u0010*\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b.\u0010\u0017\u001a\u0004\b,\u0010-R\u000e\u0010/\u001a\u000200X.¢\u0006\u0002\n\u0000R\u001e\u00101\u001a\u0002028\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u000e\u00107\u001a\u000208X.¢\u0006\u0002\n\u0000R\u001e\u00109\u001a\u00020:8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020@8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010E\u001a\u00020F8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001b\u0010K\u001a\u00020L8BX\u0002¢\u0006\f\n\u0004\bO\u0010\u0017\u001a\u0004\bM\u0010NR\u000e\u0010P\u001a\u00020QX.¢\u0006\u0002\n\u0000R\u001b\u0010R\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\bT\u0010\u0017\u001a\u0004\bS\u0010(¨\u0006y"}, d2 = {"Lcom/tinder/reactions/view/GrandGestureLayout;", "Landroid/widget/FrameLayout;", "Lcom/tinder/reactions/common/mediator/GrandGestureInterface;", "Lcom/tinder/chat/target/GrandGestureTarget;", "Lcom/tinder/common/view/ActivityLifeCycleAwareView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "audioHelper", "Lcom/tinder/reactions/audio/GrandGestureAudioHelper;", "getAudioHelper$Tinder_release", "()Lcom/tinder/reactions/audio/GrandGestureAudioHelper;", "setAudioHelper$Tinder_release", "(Lcom/tinder/reactions/audio/GrandGestureAudioHelper;)V", "bottomBarMediator", "Lcom/tinder/reactions/drawer/mediator/BottomBarMediator;", "bottomBarView", "Lcom/tinder/chat/view/ChatInputBoxContainer;", "getBottomBarView", "()Lcom/tinder/chat/view/ChatInputBoxContainer;", "bottomBarView$delegate", "Lkotlin/Lazy;", "chatInputStateUpdatesProvider", "Lcom/tinder/chat/view/provider/ChatInputTextStateUpdatesProvider;", "getChatInputStateUpdatesProvider$Tinder_release", "()Lcom/tinder/chat/view/provider/ChatInputTextStateUpdatesProvider;", "setChatInputStateUpdatesProvider$Tinder_release", "(Lcom/tinder/chat/view/provider/ChatInputTextStateUpdatesProvider;)V", "chatViewContainer", "Lcom/tinder/chat/view/ChatViewContainer;", "getChatViewContainer", "()Lcom/tinder/chat/view/ChatViewContainer;", "chatViewContainer$delegate", "dragHandleMediator", "Lcom/tinder/reactions/drawer/mediator/DragHandleMediator;", "dragHandleView", "Landroid/view/View;", "getDragHandleView", "()Landroid/view/View;", "dragHandleView$delegate", "drawerContainerView", "Landroid/support/v7/widget/CardView;", "getDrawerContainerView", "()Landroid/support/v7/widget/CardView;", "drawerContainerView$delegate", "drawerMediator", "Lcom/tinder/reactions/drawer/mediator/DrawerMediator;", "gestureAnimationMediator", "Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;", "getGestureAnimationMediator$Tinder_release", "()Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;", "setGestureAnimationMediator$Tinder_release", "(Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;)V", "gestureNavigationMediator", "Lcom/tinder/reactions/navigation/mediator/GestureNavigationMediator;", "presenter", "Lcom/tinder/reactions/presenter/GrandGesturePresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/reactions/presenter/GrandGesturePresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/reactions/presenter/GrandGesturePresenter;)V", "reactionsInputStateController", "Lcom/tinder/reactions/drawer/controller/ReactionsInputStateController;", "getReactionsInputStateController$Tinder_release", "()Lcom/tinder/reactions/drawer/controller/ReactionsInputStateController;", "setReactionsInputStateController$Tinder_release", "(Lcom/tinder/reactions/drawer/controller/ReactionsInputStateController;)V", "slideMediator", "Lcom/tinder/reactions/drawer/mediator/SlideMediator;", "getSlideMediator$Tinder_release", "()Lcom/tinder/reactions/drawer/mediator/SlideMediator;", "setSlideMediator$Tinder_release", "(Lcom/tinder/reactions/drawer/mediator/SlideMediator;)V", "toolbar", "Lcom/tinder/chat/view/ChatToolbar;", "getToolbar", "()Lcom/tinder/chat/view/ChatToolbar;", "toolbar$delegate", "topBarMediator", "Lcom/tinder/reactions/drawer/mediator/SlidingBarMediator;", "topBarView", "getTopBarView", "topBarView$delegate", "collapseDrawer", "", "expandDrawer", "getGestureEventObservable", "Lrx/Observable;", "Lcom/tinder/reactions/gestures/common/GestureEvent;", "getReactionEventObservable", "Lcom/tinder/reactions/gestures/common/ReactionEvent;", "handleReactionCompleted", "grandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "handleReactionStarted", "onAttachedToWindow", "onDetachedFromWindow", "onFinishInflate", "onPause", "onResume", "onVisibilityChanged", "changedView", "visibility", "", "playAudio", "audioConfig", "Lcom/tinder/reactions/audio/GrandGestureAudioHelper$AudioConfig;", "playReaction", "gestureReactionViewModel", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureReactionViewModel;", "scrollToLatestMessage", "setGrandGestures", "grandGestureItems", "", "Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem;", "setupGrandGestureSubscriptions", "setupReactionContainerTouchInterceptor", "toolbarHeight", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public class GrandGestureLayout extends FrameLayout implements GrandGestureTarget, ActivityLifeCycleAwareView, GrandGestureInterface {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f50957a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(GrandGestureLayout.class), "topBarView", "getTopBarView()Landroid/view/View;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(GrandGestureLayout.class), "bottomBarView", "getBottomBarView()Lcom/tinder/chat/view/ChatInputBoxContainer;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(GrandGestureLayout.class), "chatViewContainer", "getChatViewContainer()Lcom/tinder/chat/view/ChatViewContainer;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(GrandGestureLayout.class), "dragHandleView", "getDragHandleView()Landroid/view/View;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(GrandGestureLayout.class), "drawerContainerView", "getDrawerContainerView()Landroid/support/v7/widget/CardView;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(GrandGestureLayout.class), "toolbar", "getToolbar()Lcom/tinder/chat/view/ChatToolbar;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public ChatInputTextStateUpdatesProvider f50958b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C14633g f50959c;
    @Inject
    @NotNull
    /* renamed from: d */
    public C14641a f50960d;
    @Inject
    @NotNull
    /* renamed from: e */
    public C16317a f50961e;
    @Inject
    @NotNull
    /* renamed from: f */
    public C14594a f50962f;
    @Inject
    @NotNull
    /* renamed from: g */
    public C14589a f50963g;
    /* renamed from: h */
    private final Lazy f50964h = C15810e.m59832a(LazyThreadSafetyMode.NONE, (Function0) new GrandGestureLayout$$special$$inlined$bindView$1(this, R.id.chat_toolbar));
    /* renamed from: i */
    private final Lazy f50965i = C15810e.m59832a(LazyThreadSafetyMode.NONE, (Function0) new GrandGestureLayout$$special$$inlined$bindView$2(this, R.id.inputBoxContainer));
    /* renamed from: j */
    private final Lazy f50966j = C15810e.m59832a(LazyThreadSafetyMode.NONE, (Function0) new GrandGestureLayout$$special$$inlined$bindView$3(this, R.id.chatViewContainer));
    /* renamed from: k */
    private final Lazy f50967k = C15810e.m59832a(LazyThreadSafetyMode.NONE, (Function0) new GrandGestureLayout$$special$$inlined$bindView$4(this, R.id.dragHandleContainer));
    /* renamed from: l */
    private final Lazy f50968l = C15810e.m59832a(LazyThreadSafetyMode.NONE, (Function0) new GrandGestureLayout$$special$$inlined$bindView$5(this, R.id.drawerContainer));
    /* renamed from: m */
    private final Lazy f50969m = C15810e.m59832a(LazyThreadSafetyMode.NONE, (Function0) new GrandGestureLayout$$special$$inlined$bindView$6(this, R.id.chat_toolbar));
    /* renamed from: n */
    private C16374a f50970n;
    /* renamed from: o */
    private C16324e f50971o;
    /* renamed from: p */
    private C16318a f50972p;
    /* renamed from: q */
    private C16320d f50973q;
    /* renamed from: r */
    private C16326k f50974r;
    /* renamed from: s */
    private HashMap f50975s;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.view.GrandGestureLayout$g */
    static final class C14692g implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ float f46295a;

        C14692g(float f) {
            this.f46295a = f;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C2668g.a(motionEvent, "event");
            return motionEvent.getRawY() <= this.f46295a ? null : true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lcom/tinder/reactions/gestures/common/GestureEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.view.GrandGestureLayout$b */
    static final class C18000b<T, R> implements Func1<GestureEvent, Boolean> {
        /* renamed from: a */
        public static final C18000b f55937a = new C18000b();

        C18000b() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65371a((GestureEvent) obj));
        }

        /* renamed from: a */
        public final boolean m65371a(GestureEvent gestureEvent) {
            return gestureEvent.m55890a() == State.GESTURE_ACTIVATED ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.view.GrandGestureLayout$a */
    static final class C18759a<T> implements Action1<View> {
        /* renamed from: a */
        final /* synthetic */ GrandGestureLayout f58273a;

        C18759a(GrandGestureLayout grandGestureLayout) {
            this.f58273a = grandGestureLayout;
        }

        public /* synthetic */ void call(Object obj) {
            m67206a((View) obj);
        }

        /* renamed from: a */
        public final void m67206a(View view) {
            GrandGestureLayout grandGestureLayout = this.f58273a;
            C2668g.a(view, "it");
            grandGestureLayout.setupReactionContainerTouchInterceptor((float) view.getHeight());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lcom/tinder/reactions/gestures/common/GestureEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.view.GrandGestureLayout$c */
    static final class C18760c<T> implements Action1<GestureEvent> {
        /* renamed from: a */
        final /* synthetic */ GrandGestureLayout f58274a;

        C18760c(GrandGestureLayout grandGestureLayout) {
            this.f58274a = grandGestureLayout;
        }

        public /* synthetic */ void call(Object obj) {
            m67207a((GestureEvent) obj);
        }

        /* renamed from: a */
        public final void m67207a(GestureEvent gestureEvent) {
            this.f58274a.getPresenter$Tinder_release().m55683a(gestureEvent.m55891b());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.view.GrandGestureLayout$d */
    static final class C18761d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18761d f58275a = new C18761d();

        C18761d() {
        }

        public /* synthetic */ void call(Object obj) {
            m67208a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67208a(Throwable th) {
            C0001a.c(th, "Error listening to gesture events", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lcom/tinder/reactions/gestures/common/ReactionEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.view.GrandGestureLayout$e */
    static final class C18762e<T> implements Action1<ReactionEvent> {
        /* renamed from: a */
        final /* synthetic */ GrandGestureLayout f58276a;

        C18762e(GrandGestureLayout grandGestureLayout) {
            this.f58276a = grandGestureLayout;
        }

        public /* synthetic */ void call(Object obj) {
            m67209a((ReactionEvent) obj);
        }

        /* renamed from: a */
        public final void m67209a(ReactionEvent reactionEvent) {
            ReactionEvent.State a = reactionEvent.m55892a();
            GrandGestureType b = reactionEvent.m55893b();
            switch (C14693a.f46296a[a.ordinal()]) {
                case 1:
                    this.f58276a.m61796a(b);
                    return;
                case 2:
                    this.f58276a.m61799b(b);
                    return;
                default:
                    return;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.view.GrandGestureLayout$f */
    static final class C18763f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18763f f58277a = new C18763f();

        C18763f() {
        }

        public /* synthetic */ void call(Object obj) {
            m67210a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67210a(Throwable th) {
            C0001a.c(th, "Error listening to gesture reaction events", new Object[0]);
        }
    }

    private final ChatInputBoxContainer getBottomBarView() {
        Lazy lazy = this.f50965i;
        KProperty kProperty = f50957a[1];
        return (ChatInputBoxContainer) lazy.getValue();
    }

    private final ChatViewContainer getChatViewContainer() {
        Lazy lazy = this.f50966j;
        KProperty kProperty = f50957a[2];
        return (ChatViewContainer) lazy.getValue();
    }

    private final View getDragHandleView() {
        Lazy lazy = this.f50967k;
        KProperty kProperty = f50957a[3];
        return (View) lazy.getValue();
    }

    private final CardView getDrawerContainerView() {
        Lazy lazy = this.f50968l;
        KProperty kProperty = f50957a[4];
        return (CardView) lazy.getValue();
    }

    private final ChatToolbar getToolbar() {
        Lazy lazy = this.f50969m;
        KProperty kProperty = f50957a[5];
        return (ChatToolbar) lazy.getValue();
    }

    private final View getTopBarView() {
        Lazy lazy = this.f50964h;
        KProperty kProperty = f50957a[0];
        return (View) lazy.getValue();
    }

    /* renamed from: a */
    public View m61801a(int i) {
        if (this.f50975s == null) {
            this.f50975s = new HashMap();
        }
        View view = (View) this.f50975s.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f50975s.put(Integer.valueOf(i), view);
        return view;
    }

    public GrandGestureLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
    }

    @NotNull
    public final ChatInputTextStateUpdatesProvider getChatInputStateUpdatesProvider$Tinder_release() {
        ChatInputTextStateUpdatesProvider chatInputTextStateUpdatesProvider = this.f50958b;
        if (chatInputTextStateUpdatesProvider == null) {
            C2668g.b("chatInputStateUpdatesProvider");
        }
        return chatInputTextStateUpdatesProvider;
    }

    public final void setChatInputStateUpdatesProvider$Tinder_release(@NotNull ChatInputTextStateUpdatesProvider chatInputTextStateUpdatesProvider) {
        C2668g.b(chatInputTextStateUpdatesProvider, "<set-?>");
        this.f50958b = chatInputTextStateUpdatesProvider;
    }

    @NotNull
    public final C14633g getSlideMediator$Tinder_release() {
        C14633g c14633g = this.f50959c;
        if (c14633g == null) {
            C2668g.b("slideMediator");
        }
        return c14633g;
    }

    public final void setSlideMediator$Tinder_release(@NotNull C14633g c14633g) {
        C2668g.b(c14633g, "<set-?>");
        this.f50959c = c14633g;
    }

    @NotNull
    public final C14641a getGestureAnimationMediator$Tinder_release() {
        C14641a c14641a = this.f50960d;
        if (c14641a == null) {
            C2668g.b("gestureAnimationMediator");
        }
        return c14641a;
    }

    public final void setGestureAnimationMediator$Tinder_release(@NotNull C14641a c14641a) {
        C2668g.b(c14641a, "<set-?>");
        this.f50960d = c14641a;
    }

    @NotNull
    public final C16317a getReactionsInputStateController$Tinder_release() {
        C16317a c16317a = this.f50961e;
        if (c16317a == null) {
            C2668g.b("reactionsInputStateController");
        }
        return c16317a;
    }

    public final void setReactionsInputStateController$Tinder_release(@NotNull C16317a c16317a) {
        C2668g.b(c16317a, "<set-?>");
        this.f50961e = c16317a;
    }

    @NotNull
    public final C14594a getPresenter$Tinder_release() {
        C14594a c14594a = this.f50962f;
        if (c14594a == null) {
            C2668g.b("presenter");
        }
        return c14594a;
    }

    public final void setPresenter$Tinder_release(@NotNull C14594a c14594a) {
        C2668g.b(c14594a, "<set-?>");
        this.f50962f = c14594a;
    }

    @NotNull
    public final C14589a getAudioHelper$Tinder_release() {
        C14589a c14589a = this.f50963g;
        if (c14589a == null) {
            C2668g.b("audioHelper");
        }
        return c14589a;
    }

    public final void setAudioHelper$Tinder_release(@NotNull C14589a c14589a) {
        C2668g.b(c14589a, "<set-?>");
        this.f50963g = c14589a;
    }

    @SuppressLint({"InflateParams"})
    protected void onFinishInflate() {
        super.onFinishInflate();
        Context a = C14398a.m54830a(getContext());
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) a).provideChatActivityComponent().inject(this);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.gesture_animation_navigation_view, null);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.reactions.navigation.view.GrandGestureNavigationView");
        }
        GrandGestureNavigationView grandGestureNavigationView = (GrandGestureNavigationView) inflate;
        addView(grandGestureNavigationView, 0);
        this.f50974r = new C16326k(getTopBarView(), SlideType.UP);
        this.f50972p = new C16318a(getBottomBarView());
        View dragHandleView = getDragHandleView();
        RecyclerView chatRecyclerView = getChatViewContainer().getChatRecyclerView();
        C2668g.a(chatRecyclerView, "chatViewContainer.chatRecyclerView");
        ChatInputTextStateUpdatesProvider chatInputTextStateUpdatesProvider = this.f50958b;
        if (chatInputTextStateUpdatesProvider == null) {
            C2668g.b("chatInputStateUpdatesProvider");
        }
        ChatInputBoxContainer bottomBarView = getBottomBarView();
        if (bottomBarView == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.reactions.drawer.mediator.AnimatorControllerInterface");
        }
        this.f50973q = new C16320d(dragHandleView, chatRecyclerView, chatInputTextStateUpdatesProvider, bottomBarView);
        CardView drawerContainerView = getDrawerContainerView();
        CardView drawerContainerView2 = getDrawerContainerView();
        if (drawerContainerView2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.reactions.drawer.view.AnimatorTouchInterface");
        }
        AnimatorTouchInterface animatorTouchInterface = (AnimatorTouchInterface) drawerContainerView2;
        ChatInputBoxContainer bottomBarView2 = getBottomBarView();
        if (bottomBarView2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.reactions.drawer.view.AnimatorTouchInterface");
        }
        C16324e c16324e = new C16324e(drawerContainerView, animatorTouchInterface, bottomBarView2);
        dragHandleView = getDragHandleView();
        if (dragHandleView == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.reactions.drawer.mediator.AnimatorControllerInterface");
        }
        DrawerLayoutController addAnimatorController = c16324e.addAnimatorController((AnimatorControllerInterface) dragHandleView);
        ChatViewContainer chatViewContainer = getChatViewContainer();
        if (chatViewContainer == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.reactions.drawer.mediator.AnimatorControllerInterface");
        }
        addAnimatorController = addAnimatorController.addAnimatorController(chatViewContainer);
        ChatInputBoxContainer bottomBarView3 = getBottomBarView();
        if (bottomBarView3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.reactions.drawer.mediator.AnimatorControllerInterface");
        }
        addAnimatorController = addAnimatorController.addAnimatorController(bottomBarView3);
        C16317a c16317a = this.f50961e;
        if (c16317a == null) {
            C2668g.b("reactionsInputStateController");
        }
        addAnimatorController = addAnimatorController.addAnimatorController(c16317a);
        C16318a c16318a = this.f50972p;
        if (c16318a == null) {
            C2668g.b("bottomBarMediator");
        }
        addAnimatorController = addAnimatorController.setLayoutChangedController(c16318a);
        if (addAnimatorController == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.reactions.drawer.mediator.DrawerMediator");
        }
        this.f50971o = (C16324e) addAnimatorController;
        C16324e c16324e2 = this.f50971o;
        if (c16324e2 == null) {
            C2668g.b("drawerMediator");
        }
        this.f50970n = new C16374a(grandGestureNavigationView, c16324e2);
        C14633g c14633g = this.f50959c;
        if (c14633g == null) {
            C2668g.b("slideMediator");
        }
        C16326k c16326k = this.f50974r;
        if (c16326k == null) {
            C2668g.b("topBarMediator");
        }
        c14633g = c14633g.m55813a((SlidingViewInterface) c16326k);
        C16320d c16320d = this.f50973q;
        if (c16320d == null) {
            C2668g.b("dragHandleMediator");
        }
        c14633g = c14633g.m55813a((SlidingViewInterface) c16320d);
        C16374a c16374a = this.f50970n;
        if (c16374a == null) {
            C2668g.b("gestureNavigationMediator");
        }
        c14633g = c14633g.m55813a((SlidingViewInterface) c16374a);
        C16318a c16318a2 = this.f50972p;
        if (c16318a2 == null) {
            C2668g.b("bottomBarMediator");
        }
        c14633g.m55812a((DynamicSlidingViewInterface) c16318a2);
    }

    protected void onVisibilityChanged(@Nullable View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            view = this.f50962f;
            if (view == null) {
                C2668g.b("presenter");
            }
            view.m55687d();
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14594a c14594a = this.f50962f;
        if (c14594a == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c14594a);
        C16317a c16317a = this.f50961e;
        if (c16317a == null) {
            C2668g.b("reactionsInputStateController");
        }
        c16317a.m61524a();
        m61795a();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C16317a c16317a = this.f50961e;
        if (c16317a == null) {
            C2668g.b("reactionsInputStateController");
        }
        c16317a.m61525b();
        C16374a c16374a = this.f50970n;
        if (c16374a == null) {
            C2668g.b("gestureNavigationMediator");
        }
        c16374a.m61753c();
        C16324e c16324e = this.f50971o;
        if (c16324e == null) {
            C2668g.b("drawerMediator");
        }
        c16324e.m61588b();
        C14633g c14633g = this.f50959c;
        if (c14633g == null) {
            C2668g.b("slideMediator");
        }
        c14633g.m55814a();
        Deadshot.drop(this);
    }

    public void onResume() {
        C14589a c14589a = this.f50963g;
        if (c14589a == null) {
            C2668g.b("audioHelper");
        }
        c14589a.m55648b();
    }

    public void onPause() {
        C14589a c14589a = this.f50963g;
        if (c14589a == null) {
            C2668g.b("audioHelper");
        }
        c14589a.m55646a();
    }

    public void expandDrawer() {
        C16324e c16324e = this.f50971o;
        if (c16324e == null) {
            C2668g.b("drawerMediator");
        }
        c16324e.expandDrawer();
    }

    public void collapseDrawer() {
        C16324e c16324e = this.f50971o;
        if (c16324e == null) {
            C2668g.b("drawerMediator");
        }
        c16324e.collapseDrawer();
    }

    @NotNull
    public Observable<GestureEvent> getGestureEventObservable() {
        C14641a c14641a = this.f50960d;
        if (c14641a == null) {
            C2668g.b("gestureAnimationMediator");
        }
        return c14641a.m55830a();
    }

    @NotNull
    public Observable<ReactionEvent> getReactionEventObservable() {
        C14641a c14641a = this.f50960d;
        if (c14641a == null) {
            C2668g.b("gestureAnimationMediator");
        }
        return c14641a.m55832b();
    }

    public void setGrandGestures(@NotNull Set<GrandGestureNavigationItem> set) {
        C2668g.b(set, "grandGestureItems");
        C16374a c16374a = this.f50970n;
        if (c16374a == null) {
            C2668g.b("gestureNavigationMediator");
        }
        C14641a c14641a = this.f50960d;
        if (c14641a == null) {
            C2668g.b("gestureAnimationMediator");
        }
        c16374a.m61751a((Set) set, c14641a);
    }

    public void playReaction(@NotNull C14676f c14676f) {
        C2668g.b(c14676f, "gestureReactionViewModel");
        GrandGestureReactionView grandGestureReactionView = (GrandGestureReactionView) m61801a(C6248a.reactionAnimationView);
        C2668g.a(grandGestureReactionView, "reactionAnimationView");
        C14641a c14641a = this.f50960d;
        if (c14641a == null) {
            C2668g.b("gestureAnimationMediator");
        }
        new C14650f(grandGestureReactionView, c14641a, c14676f).m55853a();
    }

    public void playAudio(@NotNull C14588a c14588a) {
        C2668g.b(c14588a, "audioConfig");
        C14589a c14589a = this.f50963g;
        if (c14589a == null) {
            C2668g.b("audioHelper");
        }
        Context context = getContext();
        C2668g.a(context, "context");
        c14589a.m55647a(context, c14588a);
    }

    public void scrollToLatestMessage() {
        getChatViewContainer().scrollToLatestMessage();
    }

    /* renamed from: a */
    private final void m61795a() {
        C14612a.f46118a.m55761f(getToolbar()).a(C19397a.a()).d(new C18759a(this));
        View view = this;
        getGestureEventObservable().j(C14612a.f46118a.m55756a(view)).a(C19397a.a()).f(C18000b.f55937a).a(new C18760c(this), C18761d.f58275a);
        getReactionEventObservable().j(C14612a.f46118a.m55756a(view)).a(C19397a.a()).a(new C18762e(this), C18763f.f58277a);
    }

    /* renamed from: a */
    private final void m61796a(GrandGestureType grandGestureType) {
        FrameLayout frameLayout = (FrameLayout) m61801a(C6248a.reactionTouchInterceptor);
        C2668g.a(frameLayout, "reactionTouchInterceptor");
        frameLayout.setVisibility(0);
    }

    /* renamed from: b */
    private final void m61799b(GrandGestureType grandGestureType) {
        FrameLayout frameLayout = (FrameLayout) m61801a(C6248a.reactionTouchInterceptor);
        C2668g.a(frameLayout, "reactionTouchInterceptor");
        frameLayout.setVisibility(8);
    }

    private final void setupReactionContainerTouchInterceptor(float f) {
        ((FrameLayout) m61801a(C6248a.reactionTouchInterceptor)).setOnTouchListener(new C14692g(f));
    }
}
