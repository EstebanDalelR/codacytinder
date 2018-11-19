package com.tinder.chat.presenter;

import com.tinder.chat.target.ChatTarget;
import com.tinder.chat.view.model.C10640k;
import com.tinder.chat.view.model.ChatItem;
import com.tinder.chat.view.model.ChatScreenState;
import com.tinder.chat.view.model.MessageViewModel;
import com.tinder.chat.view.provider.C10650w;
import com.tinder.chat.view.provider.C8514q;
import com.tinder.chat.view.provider.C8514q.C8511a;
import com.tinder.chat.view.provider.ChatEmptyStateNotifier;
import com.tinder.chat.view.provider.ChatInputTextStateUpdatesProvider;
import com.tinder.chat.view.provider.ChatNewMessagesNotifier;
import com.tinder.chat.view.provider.ChatTextInputState;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.match.usecase.TouchMatch;
import com.tinder.domain.message.usecase.MarkAllMessageAsSeenForMatch;
import com.tinder.typingindicator.worker.TypingIndicatorVisibilityAnalyticsWorker;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import kotlin.sequences.C19285g;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;
import rx.p500e.C19573b;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001BQ\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\r\u0010\u001d\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\u001fJ\b\u0010 \u001a\u00020\u001eH\u0002J\r\u0010!\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\"J\r\u0010#\u001a\u00020\u001eH\u0000¢\u0006\u0002\b$J\r\u0010%\u001a\u00020\u001eH\u0000¢\u0006\u0002\b&J\u001c\u0010'\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010+\u001a\u00020,J\r\u0010-\u001a\u00020\u001eH\u0000¢\u0006\u0002\b.J\u0006\u0010/\u001a\u00020\u001eJ\u0006\u00100\u001a\u00020\u001eJ\r\u00101\u001a\u00020\u001eH\u0001¢\u0006\u0002\b2J\u0010\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u000205H\u0002J\u001e\u00106\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010+\u001a\u00020,H\u0002J\u0012\u00107\u001a\u000208*\b\u0012\u0004\u0012\u00020*0)H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/tinder/chat/presenter/ChatPresenter;", "", "matchId", "", "chatItemUpdatesProvider", "Lcom/tinder/chat/view/provider/ChatItemUpdatesProvider;", "chatScreenStateProvider", "Lcom/tinder/chat/view/provider/ChatScreenStateProvider;", "chatInputTextStateUpdatesProvider", "Lcom/tinder/chat/view/provider/ChatInputTextStateUpdatesProvider;", "chatNewMessagesNotifier", "Lcom/tinder/chat/view/provider/ChatNewMessagesNotifier;", "chatEmptyStateNotifier", "Lcom/tinder/chat/view/provider/ChatEmptyStateNotifier;", "markAllMessageAsSeenForMatch", "Lcom/tinder/domain/message/usecase/MarkAllMessageAsSeenForMatch;", "touchMatch", "Lcom/tinder/domain/match/usecase/TouchMatch;", "indicatorVisibilityAnalyticsWorker", "Lcom/tinder/typingindicator/worker/TypingIndicatorVisibilityAnalyticsWorker;", "(Ljava/lang/String;Lcom/tinder/chat/view/provider/ChatItemUpdatesProvider;Lcom/tinder/chat/view/provider/ChatScreenStateProvider;Lcom/tinder/chat/view/provider/ChatInputTextStateUpdatesProvider;Lcom/tinder/chat/view/provider/ChatNewMessagesNotifier;Lcom/tinder/chat/view/provider/ChatEmptyStateNotifier;Lcom/tinder/domain/message/usecase/MarkAllMessageAsSeenForMatch;Lcom/tinder/domain/match/usecase/TouchMatch;Lcom/tinder/typingindicator/worker/TypingIndicatorVisibilityAnalyticsWorker;)V", "compositeSubscription", "Lrx/subscriptions/CompositeSubscription;", "target", "Lcom/tinder/chat/target/ChatTarget;", "getTarget$Tinder_release", "()Lcom/tinder/chat/target/ChatTarget;", "setTarget$Tinder_release", "(Lcom/tinder/chat/target/ChatTarget;)V", "init", "", "init$Tinder_release", "markAllMessagesAsSeen", "observeChatInputStateUpdates", "observeChatInputStateUpdates$Tinder_release", "observeChatScreenStateUpdates", "observeChatScreenStateUpdates$Tinder_release", "observeChatUpdates", "observeChatUpdates$Tinder_release", "onChatItemsInsertedToUI", "insertedItems", "", "Lcom/tinder/chat/view/model/ChatItem;", "position", "", "setMatchTouched", "setMatchTouched$Tinder_release", "startTypingIndicatorVisibilityAnalyticsWorker", "stopTypingIndicatorVisibilityAnalyticsWorker", "unsubscribe", "unsubscribe$Tinder_release", "updateChatScreenState", "chatItemUpdate", "Lcom/tinder/chat/view/provider/ChatItemUpdatesProvider$ChatItemsUpdate;", "validateOnChatItemsInsertedToUIParams", "hasAtLeastOneMessage", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ad {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public ChatTarget f29994a;
    /* renamed from: b */
    private final C19573b f29995b = new C19573b();
    /* renamed from: c */
    private final String f29996c;
    /* renamed from: d */
    private final C8514q f29997d;
    /* renamed from: e */
    private final C10650w f29998e;
    /* renamed from: f */
    private final ChatInputTextStateUpdatesProvider f29999f;
    /* renamed from: g */
    private final ChatNewMessagesNotifier f30000g;
    /* renamed from: h */
    private final ChatEmptyStateNotifier f30001h;
    /* renamed from: i */
    private final MarkAllMessageAsSeenForMatch f30002i;
    /* renamed from: j */
    private final TouchMatch f30003j;
    /* renamed from: k */
    private final TypingIndicatorVisibilityAnalyticsWorker f30004k;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.ad$i */
    static final class C10543i implements Action {
        /* renamed from: a */
        final /* synthetic */ ad f34287a;

        C10543i(ad adVar) {
            this.f34287a = adVar;
        }

        public final void run() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Set match with id: ");
            stringBuilder.append(this.f34287a.f29996c);
            stringBuilder.append(" as touched succeeded");
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.ad$j */
    static final class C10544j<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C10544j f34288a = new C10544j();

        C10544j() {
        }

        public /* synthetic */ void accept(Object obj) {
            m42637a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m42637a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "state", "Lcom/tinder/chat/view/provider/ChatTextInputState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.ad$c */
    static final class C12732c<T, R> implements Func1<ChatTextInputState, Boolean> {
        /* renamed from: a */
        public static final C12732c f41050a = new C12732c();

        C12732c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m50105a((ChatTextInputState) obj));
        }

        /* renamed from: a */
        public final boolean m50105a(ChatTextInputState chatTextInputState) {
            return chatTextInputState == ChatTextInputState.ACTIVE ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.ad$a */
    static final class C13709a implements Action0 {
        /* renamed from: a */
        public static final C13709a f43572a = new C13709a();

        C13709a() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.ad$b */
    static final class C13710b<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ ad f43573a;

        C13710b(ad adVar) {
            this.f43573a = adVar;
        }

        public /* synthetic */ void call(Object obj) {
            m53249a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53249a(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to mark messages as seen for matchId ");
            stringBuilder.append(this.f43573a.f29996c);
            C0001a.b(th, stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/chat/view/provider/ChatTextInputState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.ad$d */
    static final class C13711d<T> implements Action1<ChatTextInputState> {
        /* renamed from: a */
        final /* synthetic */ ad f43574a;

        C13711d(ad adVar) {
            this.f43574a = adVar;
        }

        public /* synthetic */ void call(Object obj) {
            m53250a((ChatTextInputState) obj);
        }

        /* renamed from: a */
        public final void m53250a(ChatTextInputState chatTextInputState) {
            this.f43574a.m36075a().scrollToLatestMessage();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.ad$e */
    static final class C13712e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13712e f43575a = new C13712e();

        C13712e() {
        }

        public /* synthetic */ void call(Object obj) {
            m53251a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53251a(Throwable th) {
            C0001a.c(th, "Unable to observe chat input state. Stream was interrupted!", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "chatScreenState", "Lcom/tinder/chat/view/model/ChatScreenState;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.ad$f */
    static final class C13713f<T> implements Action1<ChatScreenState> {
        /* renamed from: a */
        final /* synthetic */ ad f43576a;

        C13713f(ad adVar) {
            this.f43576a = adVar;
        }

        public /* synthetic */ void call(Object obj) {
            m53252a((ChatScreenState) obj);
        }

        /* renamed from: a */
        public final void m53252a(ChatScreenState chatScreenState) {
            if (chatScreenState != null) {
                switch (ae.f30005a[chatScreenState.ordinal()]) {
                    case 1:
                        this.f43576a.m36075a().showLoading();
                        return;
                    case 2:
                        this.f43576a.m36075a().showConversation();
                        return;
                    case 3:
                        this.f43576a.m36075a().showEmptyScreen();
                        return;
                    case 4:
                        this.f43576a.m36075a().showErrorMessage();
                        return;
                    default:
                        break;
                }
            }
            this.f43576a.m36075a().showLoading();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/chat/view/provider/ChatItemUpdatesProvider$ChatItemsUpdate;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.ad$g */
    static final class C13714g<T> implements Action1<C8511a> {
        /* renamed from: a */
        final /* synthetic */ ad f43577a;

        C13714g(ad adVar) {
            this.f43577a = adVar;
        }

        public /* synthetic */ void call(Object obj) {
            m53253a((C8511a) obj);
        }

        /* renamed from: a */
        public final void m53253a(C8511a c8511a) {
            ad adVar = this.f43577a;
            C2668g.a(c8511a, "it");
            adVar.m36071a(c8511a);
            this.f43577a.m36075a().updateChat(c8511a.m36458a(), c8511a.m36459b());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.ad$h */
    static final class C13715h<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13715h f43578a = new C13715h();

        C13715h() {
        }

        public /* synthetic */ void call(Object obj) {
            m53254a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53254a(Throwable th) {
            C0001a.c(th, "Unable to observe chat item updates. Stream has been interrupted!", new Object[0]);
        }
    }

    @Inject
    public ad(@NotNull String str, @NotNull C8514q c8514q, @NotNull C10650w c10650w, @NotNull ChatInputTextStateUpdatesProvider chatInputTextStateUpdatesProvider, @NotNull ChatNewMessagesNotifier chatNewMessagesNotifier, @NotNull ChatEmptyStateNotifier chatEmptyStateNotifier, @NotNull MarkAllMessageAsSeenForMatch markAllMessageAsSeenForMatch, @NotNull TouchMatch touchMatch, @NotNull TypingIndicatorVisibilityAnalyticsWorker typingIndicatorVisibilityAnalyticsWorker) {
        C2668g.b(str, "matchId");
        C2668g.b(c8514q, "chatItemUpdatesProvider");
        C2668g.b(c10650w, "chatScreenStateProvider");
        C2668g.b(chatInputTextStateUpdatesProvider, "chatInputTextStateUpdatesProvider");
        C2668g.b(chatNewMessagesNotifier, "chatNewMessagesNotifier");
        C2668g.b(chatEmptyStateNotifier, "chatEmptyStateNotifier");
        C2668g.b(markAllMessageAsSeenForMatch, "markAllMessageAsSeenForMatch");
        C2668g.b(touchMatch, "touchMatch");
        C2668g.b(typingIndicatorVisibilityAnalyticsWorker, "indicatorVisibilityAnalyticsWorker");
        this.f29996c = str;
        this.f29997d = c8514q;
        this.f29998e = c10650w;
        this.f29999f = chatInputTextStateUpdatesProvider;
        this.f30000g = chatNewMessagesNotifier;
        this.f30001h = chatEmptyStateNotifier;
        this.f30002i = markAllMessageAsSeenForMatch;
        this.f30003j = touchMatch;
        this.f30004k = typingIndicatorVisibilityAnalyticsWorker;
    }

    @NotNull
    /* renamed from: a */
    public final ChatTarget m36075a() {
        ChatTarget chatTarget = this.f29994a;
        if (chatTarget == null) {
            C2668g.b("target");
        }
        return chatTarget;
    }

    /* renamed from: a */
    public final void m36076a(@NotNull List<? extends ChatItem> list, int i) {
        C2668g.b(list, "insertedItems");
        m36073b(list, i);
        Sequence a = C19285g.a(C19301m.r(list), C13708xc7b00ed9.f43570a);
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.sequences.Sequence<R>");
        }
        List f = C19285g.f(C19285g.a(a, ChatPresenter$onChatItemsInsertedToUI$newUnseenMessages$1.f43571a));
        int i2 = 1;
        if ((f.isEmpty() ^ 1) != 0) {
            m36074j();
            if (((i == 1 ? 1 : 0) | C2668g.a((ChatItem) C19301m.f(list), C10640k.f34909a)) != 0) {
                this.f30000g.notifyNewMessages(f);
            }
        }
        if (list.size() != 1) {
            i2 = 0;
        }
        if ((C2668g.a((ChatItem) C19301m.f(list), C10640k.f34909a) & i2) != null) {
            this.f30001h.notifyEmptyChat();
        }
    }

    /* renamed from: b */
    public final void m36077b() {
        this.f30004k.start();
    }

    /* renamed from: c */
    public final void m36078c() {
        this.f30004k.stop();
    }

    @Take
    /* renamed from: d */
    public final void m36079d() {
        m36081f();
        m36082g();
        m36083h();
        m36084i();
    }

    @Drop
    /* renamed from: e */
    public final void m36080e() {
        this.f29995b.a();
    }

    /* renamed from: f */
    public final void m36081f() {
        this.f29995b.a(this.f29997d.m36468a(this.f29996c).b(Schedulers.io()).a(C19397a.a()).a(new C13714g(this), C13715h.f43578a));
    }

    /* renamed from: g */
    public final void m36082g() {
        this.f29995b.a(this.f29998e.m42962a().a(C19397a.a()).d(new C13713f(this)));
    }

    /* renamed from: h */
    public final void m36083h() {
        this.f29995b.a(this.f29999f.observe().f(C12732c.f41050a).a(C19397a.a()).a(new C13711d(this), C13712e.f43575a));
    }

    /* renamed from: i */
    public final void m36084i() {
        this.f30003j.execute(this.f29996c).b(C15756a.b()).a(new C10543i(this), C10544j.f34288a);
    }

    /* renamed from: a */
    private final void m36071a(C8511a c8511a) {
        if (m36072a(c8511a.m36458a()) != null) {
            this.f29998e.m42963a(ChatScreenState.SHOW_CONVERSATION);
        } else {
            this.f29998e.m42963a(ChatScreenState.EMPTY_SCREEN);
        }
    }

    /* renamed from: b */
    private final void m36073b(List<? extends ChatItem> list, int i) {
        if ((list.isEmpty() ^ 1) == 0) {
            throw ((Throwable) new IllegalArgumentException("Inconsistent state: insertedMessages is empty.".toString()));
        }
        Object obj = null;
        if ((i >= 0 ? 1 : null) == null) {
            list = new StringBuilder();
            list.append("Inconsistent state: position is negative: ");
            list.append(i);
            throw ((Throwable) new IllegalArgumentException(list.toString().toString()));
        } else if (C2668g.a((ChatItem) C19301m.f(list), C10640k.f34909a) != null) {
            if (i == 0) {
                obj = 1;
            }
            if (obj == null) {
                throw ((Throwable) new IllegalArgumentException("Inconsistent state: position should be zero when insertedItems contains AnchorChatItem as the first item.".toString()));
            }
        } else {
            if (i > 0) {
                obj = 1;
            }
            if (obj == null) {
                throw ((Throwable) new IllegalArgumentException("Inconsistent state: position should not be zero when insertedItems does not contain AnchorChatItem as the first item.".toString()));
            }
        }
    }

    /* renamed from: j */
    private final void m36074j() {
        this.f30002i.execute(this.f29996c).b(Schedulers.io()).a(C13709a.f43572a, new C13710b(this));
    }

    /* renamed from: a */
    private final boolean m36072a(@NotNull List<? extends ChatItem> list) {
        Iterable<ChatItem> iterable = list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (ChatItem chatItem : iterable) {
            if (chatItem instanceof MessageViewModel) {
                return true;
            }
        }
        return false;
    }
}
