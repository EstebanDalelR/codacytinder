package com.tinder.chat.analytics;

import com.tinder.chat.view.model.ChatScreenState;
import com.tinder.chat.view.provider.C10650w;
import com.tinder.common.logger.Logger;
import com.tinder.domain.injection.qualifiers.CurrentDateTimeMillis;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.typingindicator.model.TypingType;
import com.tinder.typingindicator.model.TypingType.C17163c;
import com.tinder.typingindicator.model.TypingType.Hide;
import com.tinder.typingindicator.model.TypingType.Hide.Reason;
import com.tinder.typingindicator.provider.C15327a;
import com.tinder.typingindicator.usecase.C17172a;
import com.tinder.typingindicator.usecase.C17172a.C15328a;
import com.tinder.typingindicator.view.model.TypingIndicatorViewModel.TypingIndicator;
import com.tinder.typingindicator.view.model.TypingIndicatorViewModel.TypingIndicator.State;
import com.tinder.typingindicator.worker.TypingIndicatorVisibilityAnalyticsWorker;
import io.reactivex.C3957b;
import io.reactivex.C3958c;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.rxkotlin.C15747d;
import javax.inject.Inject;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Publisher;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .2\u00020\u0001:\u0002./BA\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u0006\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0011H\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002J \u0010#\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010'H\u0002J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190'H\u0002J\b\u0010)\u001a\u00020\u0014H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R2\u0010\u0012\u001a&\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u0014 \u0015*\u0012\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u0014\u0018\u00010\u00130\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/tinder/chat/analytics/ChatTypingIndicatorVisibilityAnalyticsWorker;", "Lcom/tinder/typingindicator/worker/TypingIndicatorVisibilityAnalyticsWorker;", "matchId", "", "typingIndicatorViewModelProvider", "Lcom/tinder/typingindicator/provider/TypingIndicatorViewModelProvider;", "addChatTypingEvent", "Lcom/tinder/typingindicator/usecase/AddChatTypingEvent;", "currentDateTimeMillis", "Lkotlin/Function0;", "", "chatScreenStateProvider", "Lcom/tinder/chat/view/provider/ChatScreenStateProvider;", "logger", "Lcom/tinder/common/logger/Logger;", "(Ljava/lang/String;Lcom/tinder/typingindicator/provider/TypingIndicatorViewModelProvider;Lcom/tinder/typingindicator/usecase/AddChatTypingEvent;Lkotlin/jvm/functions/Function0;Lcom/tinder/chat/view/provider/ChatScreenStateProvider;Lcom/tinder/common/logger/Logger;)V", "lastIndicatorUpdate", "Lcom/tinder/chat/analytics/ChatTypingIndicatorVisibilityAnalyticsWorker$TypingIndicatorUpdate;", "leftChatSignal", "Lio/reactivex/processors/PublishProcessor;", "", "kotlin.jvm.PlatformType", "accumulateResult", "previousIndicatorUpdate", "currentIndicator", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator;", "typingIndicatorUpdate", "addChatTypingLeftChatEvent", "addChatTypingLeftChatIfIndicatorIsActive", "addChatTypingShowOrHide", "currentIndicatorUpdate", "indicatorAndTypeAreEqual", "", "indicatorUpdate1", "indicatorUpdate2", "indicatorUpdateWithHideType", "reason", "Lcom/tinder/typingindicator/model/TypingType$Hide$Reason;", "observeTypingIndicatorUpdates", "Lio/reactivex/Flowable;", "observeTypingIndicatorViewModels", "start", "stop", "watchForNonEmptyChatScreenState", "Lio/reactivex/Maybe;", "Lcom/tinder/chat/view/model/ChatScreenState;", "Companion", "TypingIndicatorUpdate", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class am implements TypingIndicatorVisibilityAnalyticsWorker {
    @Deprecated
    /* renamed from: a */
    public static final C8421a f34231a = new C8421a();
    /* renamed from: j */
    private static final TypingIndicator f34232j = new TypingIndicator("", "", State.EXPIRED);
    /* renamed from: k */
    private static final Hide f34233k = new Hide(Reason.LEFT_CHAT, 0);
    /* renamed from: l */
    private static final C8422b f34234l = new C8422b(f34232j, f34233k, 0);
    /* renamed from: b */
    private C8422b f34235b;
    /* renamed from: c */
    private final PublishProcessor<C15813i> f34236c = PublishProcessor.q();
    /* renamed from: d */
    private final String f34237d;
    /* renamed from: e */
    private final C15327a f34238e;
    /* renamed from: f */
    private final C17172a f34239f;
    /* renamed from: g */
    private final Function0<Long> f34240g;
    /* renamed from: h */
    private final C10650w f34241h;
    /* renamed from: i */
    private final Logger f34242i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/chat/analytics/ChatTypingIndicatorVisibilityAnalyticsWorker$Companion;", "", "()V", "INITIAL_TYPE", "Lcom/tinder/typingindicator/model/TypingType$Hide;", "INITIAL_TYPING_INDICATOR", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator;", "INITIAL_TYPING_INDICATOR_UPDATE", "Lcom/tinder/chat/analytics/ChatTypingIndicatorVisibilityAnalyticsWorker$TypingIndicatorUpdate;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.am$a */
    private static final class C8421a {
        private C8421a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0016\u001a\u00020\u0014J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/tinder/chat/analytics/ChatTypingIndicatorVisibilityAnalyticsWorker$TypingIndicatorUpdate;", "", "typingIndicator", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator;", "typingType", "Lcom/tinder/typingindicator/model/TypingType;", "timestamp", "", "(Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator;Lcom/tinder/typingindicator/model/TypingType;J)V", "getTimestamp", "()J", "getTypingIndicator", "()Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator;", "getTypingType", "()Lcom/tinder/typingindicator/model/TypingType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hasActiveIndicator", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.am$b */
    private static final class C8422b {
        @NotNull
        /* renamed from: a */
        private final TypingIndicator f29897a;
        @NotNull
        /* renamed from: b */
        private final TypingType f29898b;
        /* renamed from: c */
        private final long f29899c;

        @NotNull
        /* renamed from: a */
        public static /* synthetic */ C8422b m35924a(C8422b c8422b, TypingIndicator typingIndicator, TypingType typingType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                typingIndicator = c8422b.f29897a;
            }
            if ((i & 2) != 0) {
                typingType = c8422b.f29898b;
            }
            if ((i & 4) != 0) {
                j = c8422b.f29899c;
            }
            return c8422b.m35925a(typingIndicator, typingType, j);
        }

        @NotNull
        /* renamed from: a */
        public final C8422b m35925a(@NotNull TypingIndicator typingIndicator, @NotNull TypingType typingType, long j) {
            C2668g.b(typingIndicator, "typingIndicator");
            C2668g.b(typingType, "typingType");
            return new C8422b(typingIndicator, typingType, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8422b) {
                C8422b c8422b = (C8422b) obj;
                if (C2668g.a(this.f29897a, c8422b.f29897a) && C2668g.a(this.f29898b, c8422b.f29898b)) {
                    if ((this.f29899c == c8422b.f29899c ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            TypingIndicator typingIndicator = this.f29897a;
            int i = 0;
            int hashCode = (typingIndicator != null ? typingIndicator.hashCode() : 0) * 31;
            TypingType typingType = this.f29898b;
            if (typingType != null) {
                i = typingType.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            long j = this.f29899c;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TypingIndicatorUpdate(typingIndicator=");
            stringBuilder.append(this.f29897a);
            stringBuilder.append(", typingType=");
            stringBuilder.append(this.f29898b);
            stringBuilder.append(", timestamp=");
            stringBuilder.append(this.f29899c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8422b(@NotNull TypingIndicator typingIndicator, @NotNull TypingType typingType, long j) {
            C2668g.b(typingIndicator, "typingIndicator");
            C2668g.b(typingType, "typingType");
            this.f29897a = typingIndicator;
            this.f29898b = typingType;
            this.f29899c = j;
        }

        @NotNull
        /* renamed from: b */
        public final TypingIndicator m35927b() {
            return this.f29897a;
        }

        @NotNull
        /* renamed from: c */
        public final TypingType m35928c() {
            return this.f29898b;
        }

        /* renamed from: d */
        public final long m35929d() {
            return this.f29899c;
        }

        /* renamed from: a */
        public final boolean m35926a() {
            return ao.m35932c(this.f29897a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/typingindicator/view/model/TypingIndicatorViewModel$TypingIndicator;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.am$c */
    static final class C10523c<T> implements Predicate<TypingIndicator> {
        /* renamed from: a */
        public static final C10523c f34228a = new C10523c();

        C10523c() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m42576a((TypingIndicator) obj);
        }

        /* renamed from: a */
        public final boolean m42576a(@NotNull TypingIndicator typingIndicator) {
            C2668g.b(typingIndicator, "it");
            return ao.m35933d(typingIndicator);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/tinder/chat/analytics/ChatTypingIndicatorVisibilityAnalyticsWorker$TypingIndicatorUpdate;", "it", "Lcom/tinder/chat/view/model/ChatScreenState;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.am$d */
    static final class C10524d<T, R> implements Function<T, Publisher<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ am f34229a;

        C10524d(am amVar) {
            this.f34229a = amVar;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m42577a((ChatScreenState) obj);
        }

        @Nullable
        /* renamed from: a */
        public final C3957b<C8422b> m42577a(@NotNull ChatScreenState chatScreenState) {
            C2668g.b(chatScreenState, "it");
            return this.f34229a.m42582a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/chat/view/model/ChatScreenState;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.analytics.am$e */
    static final class C10525e<T> implements Predicate<ChatScreenState> {
        /* renamed from: a */
        public static final C10525e f34230a = new C10525e();

        C10525e() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m42578a((ChatScreenState) obj);
        }

        /* renamed from: a */
        public final boolean m42578a(@NotNull ChatScreenState chatScreenState) {
            C2668g.b(chatScreenState, "it");
            return chatScreenState == ChatScreenState.SHOW_CONVERSATION ? true : null;
        }
    }

    @Inject
    public am(@NotNull String str, @NotNull C15327a c15327a, @NotNull C17172a c17172a, @NotNull @CurrentDateTimeMillis Function0<Long> function0, @NotNull C10650w c10650w, @NotNull Logger logger) {
        C2668g.b(str, "matchId");
        C2668g.b(c15327a, "typingIndicatorViewModelProvider");
        C2668g.b(c17172a, "addChatTypingEvent");
        C2668g.b(function0, "currentDateTimeMillis");
        C2668g.b(c10650w, "chatScreenStateProvider");
        C2668g.b(logger, "logger");
        this.f34237d = str;
        this.f34238e = c15327a;
        this.f34239f = c17172a;
        this.f34240g = function0;
        this.f34241h = c10650w;
        this.f34242i = logger;
    }

    public void start() {
        C3957b c = m42589b().c(new C10524d(this)).c(this.f34236c);
        C2668g.a(c, "watchForNonEmptyChatScre…takeUntil(leftChatSignal)");
        Function0 chatTypingIndicatorVisibilityAnalyticsWorker$start$3 = new ChatTypingIndicatorVisibilityAnalyticsWorker$start$3(this);
        C15747d.a(c, new ChatTypingIndicatorVisibilityAnalyticsWorker$start$4(this), chatTypingIndicatorVisibilityAnalyticsWorker$start$3, new ChatTypingIndicatorVisibilityAnalyticsWorker$start$2(this));
    }

    public void stop() {
        this.f34236c.onNext(C15813i.f49016a);
    }

    /* renamed from: a */
    private final C3957b<C8422b> m42582a() {
        am amVar = this;
        return m42593c().b(C10523c.f34228a).a(f34234l, new ap(new C14235xdc57894a(amVar))).a(new aq(new C14236xdc57894b(amVar))).d(1);
    }

    /* renamed from: a */
    private final boolean m42586a(C8422b c8422b, C8422b c8422b2) {
        return (!C2668g.a(c8422b.m35927b(), c8422b2.m35927b()) || C2668g.a(c8422b.m35928c(), c8422b2.m35928c()) == null) ? null : true;
    }

    /* renamed from: a */
    private final void m42584a(C8422b c8422b) {
        if (c8422b.m35926a()) {
            m42596d(c8422b);
        }
    }

    /* renamed from: b */
    private final void m42590b(C8422b c8422b) {
        if (c8422b.m35928c() instanceof Hide) {
            C8422b c8422b2 = this.f34235b;
            if (c8422b2 != null && c8422b2.m35926a()) {
                m42594c(c8422b);
                return;
            }
            return;
        }
        m42594c(c8422b);
    }

    /* renamed from: a */
    private final C8422b m42579a(C8422b c8422b, TypingIndicator typingIndicator) {
        switch (an.f29900a[typingIndicator.b().ordinal()]) {
            case 1:
                return new C8422b(typingIndicator, C17163c.f52694a, ((Number) this.f34240g.invoke()).longValue());
            case 2:
                return m42580a(c8422b, typingIndicator, Reason.MESSAGE);
            case 3:
                return m42580a(c8422b, typingIndicator, Reason.EXPIRED);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    private final C8422b m42580a(C8422b c8422b, TypingIndicator typingIndicator, Reason reason) {
        long d = c8422b.m35929d();
        long longValue = ((Number) this.f34240g.invoke()).longValue();
        return new C8422b(typingIndicator, (TypingType) new Hide(reason, longValue - d), longValue);
    }

    /* renamed from: c */
    private final void m42594c(C8422b c8422b) {
        this.f34239f.a(new C15328a(c8422b.m35927b().a(), c8422b.m35928c()));
    }

    /* renamed from: d */
    private final void m42596d(C8422b c8422b) {
        C8422b c8422b2 = c8422b;
        m42594c(C8422b.m35924a(c8422b2, null, new Hide(Reason.LEFT_CHAT, ((Number) this.f34240g.invoke()).longValue() - c8422b.m35929d()), 0, 5, null));
    }

    /* renamed from: b */
    private final C3958c<ChatScreenState> m42589b() {
        C3958c<ChatScreenState> firstElement = RxJavaInteropExtKt.toV2Observable(this.f34241h.m42962a()).filter(C10525e.f34230a).firstElement();
        C2668g.a(firstElement, "chatScreenStateProvider.…          .firstElement()");
        return firstElement;
    }

    /* renamed from: c */
    private final C3957b<TypingIndicator> m42593c() {
        C3957b<TypingIndicator> b = this.f34238e.a(this.f34237d).b(TypingIndicator.class);
        C2668g.a(b, "typingIndicatorViewModel…ingIndicator::class.java)");
        return b;
    }
}
