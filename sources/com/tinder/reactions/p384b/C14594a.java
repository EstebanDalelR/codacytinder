package com.tinder.reactions.p384b;

import com.tinder.chat.analytics.ad;
import com.tinder.chat.analytics.ad.C8417a;
import com.tinder.chat.target.GrandGestureTarget;
import com.tinder.chat.view.model.MessageViewModel;
import com.tinder.chat.view.model.ag;
import com.tinder.chat.view.provider.ChatNewMessagesProvider;
import com.tinder.chat.view.provider.ReactionChatItemClickedProvider;
import com.tinder.chat.view.provider.ReactionChatItemClickedProvider.C8505a;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.message.usecase.SendReactionMessage;
import com.tinder.domain.message.usecase.SendReactionMessage.Request;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.reactions.analytics.C16276g;
import com.tinder.reactions.analytics.C16276g.C14582a;
import com.tinder.reactions.analytics.C16277h;
import com.tinder.reactions.analytics.C16277h.C14583a;
import com.tinder.reactions.analytics.C16278j;
import com.tinder.reactions.analytics.C16278j.C14584a;
import com.tinder.reactions.analytics.C16279k;
import com.tinder.reactions.analytics.C16279k.C14585a;
import com.tinder.reactions.analytics.GestureShowPreviewFrom;
import com.tinder.reactions.analytics.ShowAnimationFor;
import com.tinder.reactions.analytics.ShowAnimationFrom;
import com.tinder.reactions.analytics.model.GestureDrawerInteractMethod;
import com.tinder.reactions.audio.C14589a.C14588a;
import com.tinder.reactions.common.C14608a;
import com.tinder.reactions.drawer.provider.DrawerEventProvider;
import com.tinder.reactions.drawer.provider.DrawerEventProvider.C14636a;
import com.tinder.reactions.drawer.provider.DrawerEventProvider.EventType;
import com.tinder.reactions.gestures.common.ReactionEvent;
import com.tinder.reactions.gestures.common.ReactionEvent.State;
import com.tinder.reactions.gestures.p393a.C14641a;
import com.tinder.reactions.gestures.p395c.C16347e;
import com.tinder.reactions.gestures.viewmodel.C14674d;
import com.tinder.reactions.gestures.viewmodel.C14676f;
import com.tinder.reactions.gestures.viewmodel.C14679j;
import com.tinder.reactions.navigation.viewmodel.GrandGestureNavigationItem;
import com.tinder.utils.RxUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Single;
import rx.Subscription;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.functions.Func2;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0001\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0002\u0010 J \u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0002J\u000e\u00104\u001a\u00020,2\u0006\u00101\u001a\u000202J\u0010\u00105\u001a\u00020,2\u0006\u00106\u001a\u000207H\u0002J\u000e\u00108\u001a\u00020,2\u0006\u00101\u001a\u000202J\u0010\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020;H\u0002J\r\u0010<\u001a\u00020,H\u0001¢\u0006\u0002\b=J\b\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020?H\u0002J\b\u0010A\u001a\u00020,H\u0002J\b\u0010B\u001a\u00020,H\u0002J\r\u0010C\u001a\u00020,H\u0001¢\u0006\u0002\bDJ\u0006\u0010E\u001a\u00020,J\u0018\u0010F\u001a\u00020,2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020?H\u0002J\u0010\u0010J\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0002J\u0010\u0010K\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0002J\u0010\u0010L\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0002J\u0010\u0010M\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0002J\u0010\u0010N\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0002J\u0010\u0010O\u001a\u00020,2\u0006\u0010P\u001a\u000202H\u0002J\u0010\u0010\u0004\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0002J\b\u0010Q\u001a\u00020,H\u0002R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010%\u001a\u00020&8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006R"}, d2 = {"Lcom/tinder/reactions/presenter/GrandGesturePresenter;", "", "matchId", "", "sendReactionMessage", "Lcom/tinder/domain/message/usecase/SendReactionMessage;", "grandGestureFactory", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureFactory;", "gesturePositionProvider", "Lcom/tinder/reactions/gestures/provider/GesturePositionProvider;", "grandGestureShowPreviewEventDispatcher", "Lcom/tinder/reactions/analytics/GrandGestureShowPreviewEventDispatcher;", "grandGestureOpenEventDispatcher", "Lcom/tinder/reactions/analytics/GrandGestureOpenEventDispatcher;", "grandGestureCloseEventDispatcher", "Lcom/tinder/reactions/analytics/GrandGestureCloseEventDispatcher;", "grandGestureShowAnimationEventDispatcher", "Lcom/tinder/reactions/analytics/GrandGestureShowAnimationEventDispatcher;", "reactionViewModelFactory", "Lcom/tinder/reactions/gestures/viewmodel/ReactionViewModelFactory;", "drawerEventProvider", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider;", "reactionChatItemClickedProvider", "Lcom/tinder/chat/view/provider/ReactionChatItemClickedProvider;", "reactionCache", "Lcom/tinder/reactions/common/ReactionCompositionCache;", "animationMediator", "Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;", "chatSendMessageEventDispatcher", "Lcom/tinder/chat/analytics/ChatSendMessageEventDispatcher;", "chatNewMessagesProvider", "Lcom/tinder/chat/view/provider/ChatNewMessagesProvider;", "(Ljava/lang/String;Lcom/tinder/domain/message/usecase/SendReactionMessage;Lcom/tinder/reactions/gestures/viewmodel/GrandGestureFactory;Lcom/tinder/reactions/gestures/provider/GesturePositionProvider;Lcom/tinder/reactions/analytics/GrandGestureShowPreviewEventDispatcher;Lcom/tinder/reactions/analytics/GrandGestureOpenEventDispatcher;Lcom/tinder/reactions/analytics/GrandGestureCloseEventDispatcher;Lcom/tinder/reactions/analytics/GrandGestureShowAnimationEventDispatcher;Lcom/tinder/reactions/gestures/viewmodel/ReactionViewModelFactory;Lcom/tinder/reactions/drawer/provider/DrawerEventProvider;Lcom/tinder/chat/view/provider/ReactionChatItemClickedProvider;Lcom/tinder/reactions/common/ReactionCompositionCache;Lcom/tinder/reactions/gestures/mediator/GestureAnimationMediator;Lcom/tinder/chat/analytics/ChatSendMessageEventDispatcher;Lcom/tinder/chat/view/provider/ChatNewMessagesProvider;)V", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "queuedReceivedReactionAutoplaySubscription", "Lrx/Subscription;", "target", "Lcom/tinder/chat/target/GrandGestureTarget;", "getTarget$Tinder_release", "()Lcom/tinder/chat/target/GrandGestureTarget;", "setTarget$Tinder_release", "(Lcom/tinder/chat/target/GrandGestureTarget;)V", "addShowAnimationEvent", "", "showAnimationFrom", "Lcom/tinder/reactions/analytics/ShowAnimationFrom;", "showAnimationFor", "Lcom/tinder/reactions/analytics/ShowAnimationFor;", "grandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "autoPlayReceivedReaction", "autoPlayReceivedReactionOrQueueIfDrawerClosed", "handleDrawerEvent", "event", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$Event;", "handleGestureActivated", "handleNewIncomingReactionMessage", "reactionMessageViewModel", "Lcom/tinder/chat/view/model/ReactionMessageViewModel;", "init", "init$Tinder_release", "isDrawerClosed", "", "isDrawerOpen", "loadNavigationItems", "observeNewMessages", "onDrop", "onDrop$Tinder_release", "onTargetVisible", "playReaction", "viewModel", "Lcom/tinder/reactions/gestures/viewmodel/GrandGestureReactionViewModel;", "ignoreSoundToggle", "playReceivedReaction", "playReceivedReactionFromTap", "playSentReaction", "playSentReactionFromTap", "queueAutoPlayForLatestReceivedReaction", "sendMessageAfterReactionCompletesAndDrawerCloses", "type", "startReactionCompositionCaching", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.b.a */
public final class C14594a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public GrandGestureTarget f46052a;
    /* renamed from: b */
    private C19573b f46053b = new C19573b();
    /* renamed from: c */
    private Subscription f46054c;
    /* renamed from: d */
    private final String f46055d;
    /* renamed from: e */
    private final SendReactionMessage f46056e;
    /* renamed from: f */
    private final C14674d f46057f;
    /* renamed from: g */
    private final C16347e f46058g;
    /* renamed from: h */
    private final C16279k f46059h;
    /* renamed from: i */
    private final C16277h f46060i;
    /* renamed from: j */
    private final C16276g f46061j;
    /* renamed from: k */
    private final C16278j f46062k;
    /* renamed from: l */
    private final C14679j f46063l;
    /* renamed from: m */
    private DrawerEventProvider f46064m;
    /* renamed from: n */
    private ReactionChatItemClickedProvider f46065n;
    /* renamed from: o */
    private final C14608a f46066o;
    /* renamed from: p */
    private final C14641a f46067p;
    /* renamed from: q */
    private final ad f46068q;
    /* renamed from: r */
    private final ChatNewMessagesProvider f46069r;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\"\u0010\u0003\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/tinder/chat/view/model/MessageViewModel;", "newMessages", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$g */
    static final class C17928g<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17928g f55836a = new C17928g();

        C17928g() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65235a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<MessageViewModel<?>> m65235a(List<? extends MessageViewModel<?>> list) {
            C2668g.a(list, "newMessages");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((MessageViewModel) next) instanceof ag) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004 \u0005*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/tinder/chat/view/model/MessageViewModel;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$h */
    static final class C17929h<T, R> implements Func1<List<? extends MessageViewModel<?>>, Boolean> {
        /* renamed from: a */
        public static final C17929h f55837a = new C17929h();

        C17929h() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65236a((List) obj));
        }

        /* renamed from: a */
        public final boolean m65236a(List<? extends MessageViewModel<?>> list) {
            C2668g.a(list, "it");
            return list.isEmpty() ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u00012\"\u0010\u0002\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001 \u0004*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/chat/view/model/MessageViewModel;", "newMessages", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$i */
    static final class C17930i<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17930i f55838a = new C17930i();

        C17930i() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65237a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final MessageViewModel<?> m65237a(List<? extends MessageViewModel<?>> list) {
            C2668g.a(list, "newMessages");
            return (MessageViewModel) C19299w.m68829f((List) list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$Event;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$l */
    static final class C17931l<T, R> implements Func1<C14636a, Boolean> {
        /* renamed from: a */
        public static final C17931l f55839a = new C17931l();

        C17931l() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65238a((C14636a) obj));
        }

        /* renamed from: a */
        public final boolean m65238a(C14636a c14636a) {
            return c14636a.m55822c() == EventType.CLOSED ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$Event;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Lcom/tinder/reactions/gestures/common/ReactionEvent;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$o */
    static final class C17932o<T1, T2, R> implements Func2<T1, T2, R> {
        /* renamed from: a */
        public static final C17932o f55840a = new C17932o();

        C17932o() {
        }

        /* renamed from: a */
        public final void m65239a(C14636a c14636a, ReactionEvent reactionEvent) {
        }

        public /* synthetic */ Object call(Object obj, Object obj2) {
            m65239a((C14636a) obj, (ReactionEvent) obj2);
            return C15813i.f49016a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$Event;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$s */
    static final class C17933s<T, R> implements Func1<C14636a, Boolean> {
        /* renamed from: a */
        public static final C17933s f55841a = new C17933s();

        C17933s() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65240a((C14636a) obj));
        }

        /* renamed from: a */
        public final boolean m65240a(C14636a c14636a) {
            return c14636a.m55822c() == EventType.CLOSED ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lcom/tinder/reactions/gestures/common/ReactionEvent;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$t */
    static final class C17934t<T, R> implements Func1<ReactionEvent, Boolean> {
        /* renamed from: a */
        public static final C17934t f55842a = new C17934t();

        C17934t() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65241a((ReactionEvent) obj));
        }

        /* renamed from: a */
        public final boolean m65241a(ReactionEvent reactionEvent) {
            return reactionEvent.m55892a() == State.REACTION_COMPLETED ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "event", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$Event;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$a */
    static final class C18667a<T> implements Action1<C14636a> {
        /* renamed from: a */
        final /* synthetic */ C14594a f58141a;

        C18667a(C14594a c14594a) {
            this.f58141a = c14594a;
        }

        public /* synthetic */ void call(Object obj) {
            m67100a((C14636a) obj);
        }

        /* renamed from: a */
        public final void m67100a(C14636a c14636a) {
            C14594a c14594a = this.f58141a;
            C2668g.a(c14636a, "event");
            c14594a.m55662a(c14636a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$b */
    static final class C18668b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18668b f58142a = new C18668b();

        C18668b() {
        }

        public /* synthetic */ void call(Object obj) {
            m67101a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67101a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lcom/tinder/chat/view/provider/ReactionChatItemClickedProvider$ReactionChatItem;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$c */
    static final class C18669c<T> implements Action1<C8505a> {
        /* renamed from: a */
        final /* synthetic */ C14594a f58143a;

        C18669c(C14594a c14594a) {
            this.f58143a = c14594a;
        }

        public /* synthetic */ void call(Object obj) {
            m67102a((C8505a) obj);
        }

        /* renamed from: a */
        public final void m67102a(C8505a c8505a) {
            String a = c8505a.a();
            switch (C14595b.f46070a[c8505a.b().ordinal()]) {
                case 1:
                    this.f58143a.m55672e(GrandGestureType.Companion.fromValue(a));
                    return;
                case 2:
                    this.f58143a.m55674f(GrandGestureType.Companion.fromValue(a));
                    return;
                default:
                    return;
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$d */
    static final class C18670d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18670d f58144a = new C18670d();

        C18670d() {
        }

        public /* synthetic */ void call(Object obj) {
            m67103a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67103a(Throwable th) {
            C0001a.c(th, "Couldn't play reaction after chat item click", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "grandGestureNavigationItems", "", "Lcom/tinder/reactions/navigation/viewmodel/GrandGestureNavigationItem;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$e */
    static final class C18671e<T> implements Action1<Set<? extends GrandGestureNavigationItem>> {
        /* renamed from: a */
        final /* synthetic */ C14594a f58145a;

        C18671e(C14594a c14594a) {
            this.f58145a = c14594a;
        }

        public /* synthetic */ void call(Object obj) {
            m67104a((Set) obj);
        }

        /* renamed from: a */
        public final void m67104a(Set<GrandGestureNavigationItem> set) {
            this.f58145a.f46058g.m61661a(set.size());
            GrandGestureTarget a = this.f58145a.m55682a();
            C2668g.a(set, "grandGestureNavigationItems");
            a.setGrandGestures(set);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$f */
    static final class C18672f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18672f f58146a = new C18672f();

        C18672f() {
        }

        public /* synthetic */ void call(Object obj) {
            m67105a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67105a(Throwable th) {
            C0001a.c(th, "Error creating GrandGestureItems", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "message", "Lcom/tinder/chat/view/model/ReactionMessageViewModel;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$j */
    static final class C18673j<T> implements Action1<ag> {
        /* renamed from: a */
        final /* synthetic */ C14594a f58147a;

        C18673j(C14594a c14594a) {
            this.f58147a = c14594a;
        }

        public /* synthetic */ void call(Object obj) {
            m67106a((ag) obj);
        }

        /* renamed from: a */
        public final void m67106a(ag agVar) {
            C14594a c14594a = this.f58147a;
            C2668g.a(agVar, "message");
            c14594a.m55657a(agVar);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$k */
    static final class C18674k<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18674k f58148a = new C18674k();

        C18674k() {
        }

        public /* synthetic */ void call(Object obj) {
            m67107a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67107a(Throwable th) {
            C0001a.c(th, "Unable to observe new inbound messages", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/reactions/drawer/provider/DrawerEventProvider$Event;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$m */
    static final class C18675m<T> implements Action1<C14636a> {
        /* renamed from: a */
        final /* synthetic */ C14594a f58149a;
        /* renamed from: b */
        final /* synthetic */ GrandGestureType f58150b;

        C18675m(C14594a c14594a, GrandGestureType grandGestureType) {
            this.f58149a = c14594a;
            this.f58150b = grandGestureType;
        }

        public /* synthetic */ void call(Object obj) {
            m67108a((C14636a) obj);
        }

        /* renamed from: a */
        public final void m67108a(C14636a c14636a) {
            this.f58149a.m55669d(this.f58150b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$n */
    static final class C18676n<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ GrandGestureType f58151a;

        C18676n(GrandGestureType grandGestureType) {
            this.f58151a = grandGestureType;
        }

        public /* synthetic */ void call(Object obj) {
            m67109a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67109a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Couldn't play queued up received ");
            stringBuilder.append(this.f58151a);
            stringBuilder.append(" reaction.");
            C0001a.c(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$p */
    static final class C18677p implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C14594a f58152a;
        /* renamed from: b */
        final /* synthetic */ GrandGestureType f58153b;

        C18677p(C14594a c14594a, GrandGestureType grandGestureType) {
            this.f58152a = c14594a;
            this.f58153b = grandGestureType;
        }

        public final void call() {
            this.f58152a.m55679i(this.f58153b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "call", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$q */
    static final class C18678q<T> implements Action1<C15813i> {
        /* renamed from: a */
        public static final C18678q f58154a = new C18678q();

        C18678q() {
        }

        /* renamed from: a */
        public final void m67110a(C15813i c15813i) {
        }

        public /* synthetic */ void call(Object obj) {
            m67110a((C15813i) obj);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$r */
    static final class C18679r<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18679r f58155a = new C18679r();

        C18679r() {
        }

        public /* synthetic */ void call(Object obj) {
            m67111a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67111a(Throwable th) {
            C0001a.c(th, "Couldn't send reaction message.", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$u */
    static final class C18680u implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C14594a f58156a;
        /* renamed from: b */
        final /* synthetic */ GrandGestureType f58157b;

        C18680u(C14594a c14594a, GrandGestureType grandGestureType) {
            this.f58156a = c14594a;
            this.f58157b = grandGestureType;
        }

        public final void call() {
            this.f58156a.f46068q.a(new C8417a(this.f58156a.f46055d, this.f58157b.getMessageText(), 2, this.f58157b.getGestureId(), "gesture", false, false, null, null, 480, null));
            C0001a.b("Gesture sent: ", new Object[]{this.f58157b});
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.b.a$v */
    static final class C18681v<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18681v f58158a = new C18681v();

        C18681v() {
        }

        public /* synthetic */ void call(Object obj) {
            m67112a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67112a(Throwable th) {
            C0001a.c(th, "Error sending reaction message", new Object[0]);
        }
    }

    @Inject
    public C14594a(@NotNull String str, @NotNull SendReactionMessage sendReactionMessage, @NotNull C14674d c14674d, @NotNull C16347e c16347e, @NotNull C16279k c16279k, @NotNull C16277h c16277h, @NotNull C16276g c16276g, @NotNull C16278j c16278j, @NotNull C14679j c14679j, @NotNull DrawerEventProvider drawerEventProvider, @NotNull ReactionChatItemClickedProvider reactionChatItemClickedProvider, @NotNull C14608a c14608a, @NotNull C14641a c14641a, @NotNull ad adVar, @NotNull ChatNewMessagesProvider chatNewMessagesProvider) {
        C14594a c14594a = this;
        String str2 = str;
        SendReactionMessage sendReactionMessage2 = sendReactionMessage;
        C14674d c14674d2 = c14674d;
        C16347e c16347e2 = c16347e;
        C16279k c16279k2 = c16279k;
        C16277h c16277h2 = c16277h;
        C16276g c16276g2 = c16276g;
        C16278j c16278j2 = c16278j;
        C14679j c14679j2 = c14679j;
        DrawerEventProvider drawerEventProvider2 = drawerEventProvider;
        ReactionChatItemClickedProvider reactionChatItemClickedProvider2 = reactionChatItemClickedProvider;
        C14608a c14608a2 = c14608a;
        C14641a c14641a2 = c14641a;
        ad adVar2 = adVar;
        ChatNewMessagesProvider chatNewMessagesProvider2 = chatNewMessagesProvider;
        C2668g.b(str2, "matchId");
        C2668g.b(sendReactionMessage2, "sendReactionMessage");
        C2668g.b(c14674d2, "grandGestureFactory");
        C2668g.b(c16347e2, "gesturePositionProvider");
        C2668g.b(c16279k2, "grandGestureShowPreviewEventDispatcher");
        C2668g.b(c16277h2, "grandGestureOpenEventDispatcher");
        C2668g.b(c16276g2, "grandGestureCloseEventDispatcher");
        C2668g.b(c16278j2, "grandGestureShowAnimationEventDispatcher");
        C2668g.b(c14679j2, "reactionViewModelFactory");
        C2668g.b(drawerEventProvider2, "drawerEventProvider");
        C2668g.b(reactionChatItemClickedProvider2, "reactionChatItemClickedProvider");
        C2668g.b(c14608a2, "reactionCache");
        C2668g.b(c14641a2, "animationMediator");
        C2668g.b(adVar2, "chatSendMessageEventDispatcher");
        C2668g.b(chatNewMessagesProvider2, "chatNewMessagesProvider");
        this.f46055d = str2;
        this.f46056e = sendReactionMessage2;
        this.f46057f = c14674d2;
        this.f46058g = c16347e2;
        this.f46059h = c16279k2;
        this.f46060i = c16277h2;
        this.f46061j = c16276g2;
        this.f46062k = c16278j2;
        this.f46063l = c14679j2;
        this.f46064m = drawerEventProvider2;
        this.f46065n = reactionChatItemClickedProvider2;
        this.f46066o = c14608a2;
        this.f46067p = c14641a2;
        this.f46068q = adVar2;
        this.f46069r = chatNewMessagesProvider2;
    }

    @NotNull
    /* renamed from: a */
    public final GrandGestureTarget m55682a() {
        GrandGestureTarget grandGestureTarget = this.f46052a;
        if (grandGestureTarget == null) {
            C2668g.b("target");
        }
        return grandGestureTarget;
    }

    @Take
    /* renamed from: b */
    public final void m55684b() {
        this.f46053b.a(this.f46064m.observe().a(C19397a.a()).a(new C18667a(this), C18668b.f58142a));
        this.f46053b.a(this.f46065n.a().a(C19397a.a()).a(new C18669c(this), C18670d.f58144a));
        m55671e();
        m55673f();
        m55677h();
    }

    @Drop
    /* renamed from: c */
    public final void m55686c() {
        this.f46066o.m55754b();
        this.f46053b.a();
        RxUtils.b(this.f46054c);
    }

    /* renamed from: a */
    public final void m55683a(@NotNull GrandGestureType grandGestureType) {
        C2668g.b(grandGestureType, "grandGestureType");
        if (!m55676g()) {
            RxUtils.b(this.f46054c);
            m55667c(grandGestureType);
            GrandGestureTarget grandGestureTarget = this.f46052a;
            if (grandGestureTarget == null) {
                C2668g.b("target");
            }
            grandGestureTarget.collapseDrawer();
            m55678h(grandGestureType);
            m55658a(ShowAnimationFrom.AUTOPLAY, ShowAnimationFor.SENDER, grandGestureType);
        }
    }

    /* renamed from: c */
    private final void m55667c(GrandGestureType grandGestureType) {
        this.f46053b.a(Single.a(this.f46064m.observe().a(C19397a.a()).f(C17933s.f55841a).h().a(), this.f46067p.m55832b().a(C19397a.a()).f(C17934t.f55842a).h().a(), C17932o.f55840a).a(C19397a.a()).b(new C18677p(this, grandGestureType)).a(C18678q.f58154a, C18679r.f58155a));
    }

    /* renamed from: d */
    public final void m55687d() {
        if (m55680i()) {
            this.f46059h.m61467a(new C14585a(this.f46055d, GestureShowPreviewFrom.OTHER, true));
        }
    }

    /* renamed from: b */
    public final void m55685b(@NotNull GrandGestureType grandGestureType) {
        C2668g.b(grandGestureType, "grandGestureType");
        if (m55676g()) {
            m55669d(grandGestureType);
        } else {
            m55681j(grandGestureType);
        }
    }

    /* renamed from: d */
    private final void m55669d(GrandGestureType grandGestureType) {
        m55675g(grandGestureType);
        m55658a(ShowAnimationFrom.AUTOPLAY, ShowAnimationFor.RECEIVER, grandGestureType);
    }

    /* renamed from: e */
    private final void m55672e(GrandGestureType grandGestureType) {
        m55675g(grandGestureType);
        m55658a(ShowAnimationFrom.TAP, ShowAnimationFor.RECEIVER, grandGestureType);
    }

    /* renamed from: f */
    private final void m55674f(GrandGestureType grandGestureType) {
        m55663a(this.f46063l.m55932a(grandGestureType), false);
        m55658a(ShowAnimationFrom.TAP, ShowAnimationFor.SENDER, grandGestureType);
    }

    /* renamed from: g */
    private final void m55675g(GrandGestureType grandGestureType) {
        m55663a(this.f46063l.m55934b(grandGestureType), true);
    }

    /* renamed from: h */
    private final void m55678h(GrandGestureType grandGestureType) {
        m55663a(this.f46063l.m55932a(grandGestureType), false);
    }

    /* renamed from: a */
    private final void m55663a(C14676f c14676f, boolean z) {
        GrandGestureTarget grandGestureTarget = this.f46052a;
        if (grandGestureTarget == null) {
            C2668g.b("target");
        }
        grandGestureTarget.playReaction(c14676f);
        C14588a c14588a = new C14588a(c14676f.m55925a(), z);
        c14676f = this.f46052a;
        if (c14676f == null) {
            C2668g.b("target");
        }
        c14676f.playAudio(c14588a);
    }

    /* renamed from: e */
    private final void m55671e() {
        this.f46053b.a(this.f46057f.m55924a().b(Schedulers.io()).a(C19397a.a()).a(new C18671e(this), C18672f.f58146a));
    }

    /* renamed from: f */
    private final void m55673f() {
        this.f46053b.a(this.f46069r.observeNewInboundMessages().k(C17928g.f55836a).f(C17929h.f55837a).k(C17930i.f55838a).a(ag.class).a(C19397a.a()).a(new C18673j(this), C18674k.f58148a));
    }

    /* renamed from: a */
    private final void m55657a(ag agVar) {
        m55685b(GrandGestureType.Companion.fromValue(agVar.a().getId()));
    }

    /* renamed from: a */
    private final void m55658a(ShowAnimationFrom showAnimationFrom, ShowAnimationFor showAnimationFor, GrandGestureType grandGestureType) {
        this.f46062k.m61465a(new C14584a(this.f46055d, showAnimationFrom, showAnimationFor, grandGestureType));
    }

    /* renamed from: a */
    private final void m55662a(C14636a c14636a) {
        switch (c14636a.m55820a()) {
            case OPENING_STARTED:
                c14636a = this.f46052a;
                if (c14636a == null) {
                    C2668g.b("target");
                }
                c14636a.scrollToLatestMessage();
                return;
            case CLOSING_STARTED:
                return;
            case OPENED:
                if (c14636a.m55821b() != null) {
                    this.f46060i.m61461a(new C14583a(this.f46055d, GestureDrawerInteractMethod.SWIPE));
                }
                this.f46059h.m61467a(new C14585a(this.f46055d, GestureShowPreviewFrom.OPEN_DRAWER, true));
                return;
            case CLOSED:
                if (c14636a.m55821b() != null) {
                    this.f46061j.m61459a(new C14582a(this.f46055d, GestureDrawerInteractMethod.SWIPE));
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    private final boolean m55676g() {
        return this.f46064m.m61606a().m55820a() == EventType.CLOSED;
    }

    /* renamed from: i */
    private final void m55679i(GrandGestureType grandGestureType) {
        this.f46056e.execute(new Request(this.f46055d, grandGestureType.getMessageText(), grandGestureType.toReaction())).b(Schedulers.io()).a(new C18680u(this, grandGestureType), (Action1) C18681v.f58158a);
    }

    /* renamed from: h */
    private final void m55677h() {
        this.f46066o.m55752a();
    }

    /* renamed from: i */
    private final boolean m55680i() {
        return this.f46064m.m61606a().m55820a() == EventType.OPENED;
    }

    /* renamed from: j */
    private final void m55681j(GrandGestureType grandGestureType) {
        RxUtils.b(this.f46054c);
        this.f46054c = this.f46064m.observe().f(C17931l.f55839a).h().a().a(C19397a.a()).a(new C18675m(this, grandGestureType), new C18676n(grandGestureType));
    }
}
