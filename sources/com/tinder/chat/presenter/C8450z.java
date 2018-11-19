package com.tinder.chat.presenter;

import com.tinder.chat.target.ChatInputEditTextTarget;
import com.tinder.chat.view.model.ChatContext;
import com.tinder.chat.view.provider.C8506a;
import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.typingindicator.usecase.C17185o;
import com.tinder.typingindicator.usecase.C17185o.C15331a;
import com.tinder.typingindicator.usecase.C17186p;
import io.reactivex.C15679f;
import io.reactivex.C3958c;
import io.reactivex.C3959e;
import io.reactivex.MaybeSource;
import io.reactivex.MaybeTransformer;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.C19040a;
import io.reactivex.subjects.PublishSubject;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\r\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\"H\u0000¢\u0006\u0002\b(J\u0015\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u0003H\u0000¢\u0006\u0002\b+J\b\u0010,\u001a\u00020$H\u0002J\b\u0010-\u001a\u00020$H\u0002J\r\u0010.\u001a\u00020$H\u0001¢\u0006\u0002\b/J\u001e\u00100\u001a\b\u0012\u0004\u0012\u0002H10\u0016\"\u0004\b\u0000\u00101*\b\u0012\u0004\u0012\u0002H10\u0016H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00188\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR2\u0010\u001d\u001a&\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00030\u0003 \u001f*\u0012\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u001e0\u001eX\u0004¢\u0006\u0002\n\u0000R2\u0010 \u001a&\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\"0\" \u001f*\u0012\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\"0\"\u0018\u00010!0!X\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/tinder/chat/presenter/ChatInputEditTextPresenter;", "", "matchId", "", "chatContextProvider", "Lcom/tinder/chat/view/provider/ChatContextProvider;", "sendTextInputChange", "Lcom/tinder/typingindicator/usecase/SendTextInputChange;", "sendHeartbeatsUponTypingEmissions", "Lcom/tinder/typingindicator/usecase/SendHeartbeatsUponTypingEmissions;", "heartbeatScheduler", "Lio/reactivex/Scheduler;", "(Ljava/lang/String;Lcom/tinder/chat/view/provider/ChatContextProvider;Lcom/tinder/typingindicator/usecase/SendTextInputChange;Lcom/tinder/typingindicator/usecase/SendHeartbeatsUponTypingEmissions;Lio/reactivex/Scheduler;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "createSendHeartbeatsRequestIfNonEmptyUserId", "Lio/reactivex/MaybeTransformer;", "Lcom/tinder/chat/view/model/ChatContext;", "Lcom/tinder/typingindicator/usecase/SendHeartbeatsUponTypingEmissions$Request;", "getCreateSendHeartbeatsRequestIfNonEmptyUserId", "()Lio/reactivex/MaybeTransformer;", "observeChatContext", "Lio/reactivex/Observable;", "target", "Lcom/tinder/chat/target/ChatInputEditTextTarget;", "getTarget$Tinder_release", "()Lcom/tinder/chat/target/ChatInputEditTextTarget;", "setTarget$Tinder_release", "(Lcom/tinder/chat/target/ChatInputEditTextTarget;)V", "textInputChangedSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "typingIndicatorEnabledSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "drop", "", "drop$Tinder_release", "enableTypingHeartbeats", "enabled", "enableTypingHeartbeats$Tinder_release", "onTextChanged", "textInput", "onTextChanged$Tinder_release", "startDispatchingTypingHeartbeats", "startRegisteringTextInputChangesForTypingHeartbeats", "take", "take$Tinder_release", "observeWhileTypingIndicatorEnabled", "T", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.chat.presenter.z */
public final class C8450z {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public ChatInputEditTextTarget f30081a;
    /* renamed from: b */
    private final C19040a<Boolean> f30082b = C19040a.a();
    /* renamed from: c */
    private final PublishSubject<String> f30083c = PublishSubject.a();
    /* renamed from: d */
    private final C17356a f30084d = new C17356a();
    /* renamed from: e */
    private final C3959e<ChatContext> f30085e;
    /* renamed from: f */
    private final String f30086f;
    /* renamed from: g */
    private final C17186p f30087g;
    /* renamed from: h */
    private final C17185o f30088h;
    /* renamed from: i */
    private final C15679f f30089i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00050\u00050\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Maybe;", "Lcom/tinder/typingindicator/usecase/SendHeartbeatsUponTypingEmissions$Request;", "kotlin.jvm.PlatformType", "chatContextMaybe", "Lcom/tinder/chat/view/model/ChatContext;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.z$a */
    static final class C10567a<Upstream, Downstream> implements MaybeTransformer<ChatContext, C15331a> {
        /* renamed from: a */
        final /* synthetic */ C8450z f34320a;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/chat/view/model/ChatContext;", "test"}, k = 3, mv = {1, 1, 10})
        /* renamed from: com.tinder.chat.presenter.z$a$1 */
        static final class C105651<T> implements Predicate<ChatContext> {
            /* renamed from: a */
            public static final C105651 f34318a = new C105651();

            C105651() {
            }

            public /* synthetic */ boolean test(Object obj) {
                return m42648a((ChatContext) obj);
            }

            /* renamed from: a */
            public final boolean m42648a(@NotNull ChatContext chatContext) {
                C2668g.b(chatContext, "it");
                return C19303i.a(chatContext.getUserId()) ^ 1;
            }
        }

        C10567a(C8450z c8450z) {
            this.f34320a = c8450z;
        }

        public /* synthetic */ MaybeSource apply(C3958c c3958c) {
            return m42650a(c3958c);
        }

        /* renamed from: a */
        public final C3958c<C15331a> m42650a(@NotNull C3958c<ChatContext> c3958c) {
            C2668g.b(c3958c, "chatContextMaybe");
            return c3958c.a(C105651.f34318a).f(new Function<T, R>() {
                public /* synthetic */ Object apply(Object obj) {
                    return m42649a((ChatContext) obj);
                }

                @NotNull
                /* renamed from: a */
                public final C15331a m42649a(@NotNull ChatContext chatContext) {
                    C2668g.b(chatContext, "it");
                    return new C15331a(this.f34320a.f30086f, chatContext.getUserId());
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "T", "typingIndicatorEnabled", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/Observable;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.z$b */
    static final class C10568b<T, R> implements Function<T, ObservableSource<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C3959e f34321a;

        C10568b(C3959e c3959e) {
            this.f34321a = c3959e;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m42651a((Boolean) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3959e<T> m42651a(@NotNull Boolean bool) {
            C2668g.b(bool, "typingIndicatorEnabled");
            if (bool.booleanValue() != null) {
                return this.f34321a;
            }
            bool = C3959e.empty();
            C2668g.a(bool, "Observable.empty()");
            return bool;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.z$c */
    static final class C10569c implements Action {
        /* renamed from: a */
        final /* synthetic */ C8450z f34322a;

        C10569c(C8450z c8450z) {
            this.f34322a = c8450z;
        }

        public final void run() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Done dispatching typing heartbeats for match ");
            stringBuilder.append(this.f34322a.f30086f);
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.z$d */
    static final class C10570d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C10570d f34323a = new C10570d();

        C10570d() {
        }

        public /* synthetic */ void accept(Object obj) {
            m42652a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m42652a(Throwable th) {
            C0001a.c(th, "Error while dispatching typing heartbeats", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.presenter.z$e */
    static final class C10571e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C10571e f34324a = new C10571e();

        C10571e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m42653a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m42653a(Throwable th) {
            C0001a.c(th, "Error updating text input changes", new Object[0]);
        }
    }

    @Inject
    public C8450z(@NotNull String str, @NotNull C8506a c8506a, @NotNull C17186p c17186p, @NotNull C17185o c17185o, @NotNull @IoScheduler C15679f c15679f) {
        C2668g.b(str, "matchId");
        C2668g.b(c8506a, "chatContextProvider");
        C2668g.b(c17186p, "sendTextInputChange");
        C2668g.b(c17185o, "sendHeartbeatsUponTypingEmissions");
        C2668g.b(c15679f, "heartbeatScheduler");
        this.f30086f = str;
        this.f30087g = c17186p;
        this.f30088h = c17185o;
        this.f30089i = c15679f;
        this.f30085e = RxJavaInteropExtKt.toV2Observable(c8506a.m36445a());
    }

    @Take
    /* renamed from: a */
    public final void m36169a() {
        m36166c();
        m36167d();
    }

    @Drop
    /* renamed from: b */
    public final void m36172b() {
        this.f30084d.a();
    }

    /* renamed from: a */
    public final void m36171a(boolean z) {
        this.f30082b.onNext(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void m36170a(@NotNull String str) {
        C2668g.b(str, "textInput");
        this.f30083c.onNext(str);
    }

    /* renamed from: c */
    private final void m36166c() {
        PublishSubject publishSubject = this.f30083c;
        C2668g.a(publishSubject, "textInputChangedSubject");
        this.f30084d.add(m36164a((C3959e) publishSubject).subscribe(new aa(new C14237xd4713f3c(this.f30087g)), C10571e.f34324a));
    }

    /* renamed from: d */
    private final void m36167d() {
        this.f30084d.add(m36164a(this.f30085e).firstElement().a(m36168e()).e(new ab(new ChatInputEditTextPresenter$startDispatchingTypingHeartbeats$1(this.f30088h))).b(this.f30089i).a(new C10569c(this), C10570d.f34323a));
    }

    /* renamed from: e */
    private final MaybeTransformer<ChatContext, C15331a> m36168e() {
        return new C10567a(this);
    }

    /* renamed from: a */
    private final <T> C3959e<T> m36164a(@NotNull C3959e<T> c3959e) {
        c3959e = this.f30082b.distinctUntilChanged().switchMap(new C10568b(c3959e));
        C2668g.a(c3959e, "typingIndicatorEnabledSu…ble.empty()\n            }");
        return c3959e;
    }
}
