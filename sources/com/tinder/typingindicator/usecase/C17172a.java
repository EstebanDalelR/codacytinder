package com.tinder.typingindicator.usecase;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.logger.Logger;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.injection.qualifiers.IoScheduler;
import com.tinder.etl.event.dt;
import com.tinder.typingindicator.model.TypingType;
import io.reactivex.C15679f;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/typingindicator/usecase/AddChatTypingEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/typingindicator/usecase/AddChatTypingEvent$Request;", "typingIndicatorEventFactory", "Lcom/tinder/typingindicator/usecase/TypingIndicatorEventFactory;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "addEventScheduler", "Lio/reactivex/Scheduler;", "logger", "Lcom/tinder/common/logger/Logger;", "(Lcom/tinder/typingindicator/usecase/TypingIndicatorEventFactory;Lcom/tinder/analytics/fireworks/Fireworks;Lio/reactivex/Scheduler;Lcom/tinder/common/logger/Logger;)V", "addEvent", "Lio/reactivex/Completable;", "chatTypingEvent", "Lcom/tinder/etl/event/ChatTypingEvent;", "execute", "", "request", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.usecase.a */
public final class C17172a implements VoidUseCase<C15328a> {
    /* renamed from: a */
    private final TypingIndicatorEventFactory f52710a;
    /* renamed from: b */
    private final C2630h f52711b;
    /* renamed from: c */
    private final C15679f f52712c;
    /* renamed from: d */
    private final Logger f52713d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/typingindicator/usecase/AddChatTypingEvent$Request;", "", "matchId", "", "type", "Lcom/tinder/typingindicator/model/TypingType;", "(Ljava/lang/String;Lcom/tinder/typingindicator/model/TypingType;)V", "getMatchId", "()Ljava/lang/String;", "getType", "()Lcom/tinder/typingindicator/model/TypingType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.usecase.a$a */
    public static final class C15328a {
        @NotNull
        /* renamed from: a */
        private final String f47550a;
        @NotNull
        /* renamed from: b */
        private final TypingType f47551b;

        @NotNull
        /* renamed from: a */
        public final String m57517a() {
            return this.f47550a;
        }

        @NotNull
        /* renamed from: b */
        public final TypingType m57518b() {
            return this.f47551b;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C15328a) {
                    C15328a c15328a = (C15328a) obj;
                    if (C2668g.a(this.f47550a, c15328a.f47550a) && C2668g.a(this.f47551b, c15328a.f47551b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f47550a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            TypingType typingType = this.f47551b;
            if (typingType != null) {
                i = typingType.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f47550a);
            stringBuilder.append(", type=");
            stringBuilder.append(this.f47551b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15328a(@NotNull String str, @NotNull TypingType typingType) {
            C2668g.b(str, "matchId");
            C2668g.b(typingType, "type");
            this.f47550a = str;
            this.f47551b = typingType;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.usecase.a$b */
    static final class C17169b implements Action {
        /* renamed from: a */
        final /* synthetic */ C17172a f52704a;
        /* renamed from: b */
        final /* synthetic */ dt f52705b;

        C17169b(C17172a c17172a, dt dtVar) {
            this.f52704a = c17172a;
            this.f52705b = dtVar;
        }

        public final void run() {
            this.f52704a.f52711b.a(this.f52705b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.usecase.a$c */
    static final class C17170c implements Action {
        /* renamed from: a */
        final /* synthetic */ C17172a f52706a;
        /* renamed from: b */
        final /* synthetic */ TypingType f52707b;

        C17170c(C17172a c17172a, TypingType typingType) {
            this.f52706a = c17172a;
            this.f52707b = typingType;
        }

        public final void run() {
            Logger a = this.f52706a.f52713d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Successfully added Chat.Typing event with type=");
            stringBuilder.append(this.f52707b.m57507a());
            a.debug(stringBuilder.toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.usecase.a$d */
    static final class C17171d<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C17172a f52708a;
        /* renamed from: b */
        final /* synthetic */ TypingType f52709b;

        C17171d(C17172a c17172a, TypingType typingType) {
            this.f52708a = c17172a;
            this.f52709b = typingType;
        }

        public /* synthetic */ void accept(Object obj) {
            m63042a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m63042a(Throwable th) {
            Logger a = this.f52708a.f52713d;
            C2668g.a(th, "it");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error adding Chat.Typing event with type=");
            stringBuilder.append(this.f52709b.m57507a());
            a.error(th, stringBuilder.toString());
        }
    }

    @Inject
    public C17172a(@NotNull TypingIndicatorEventFactory typingIndicatorEventFactory, @NotNull C2630h c2630h, @NotNull @IoScheduler C15679f c15679f, @NotNull Logger logger) {
        C2668g.b(typingIndicatorEventFactory, "typingIndicatorEventFactory");
        C2668g.b(c2630h, "fireworks");
        C2668g.b(c15679f, "addEventScheduler");
        C2668g.b(logger, "logger");
        this.f52710a = typingIndicatorEventFactory;
        this.f52711b = c2630h;
        this.f52712c = c15679f;
        this.f52713d = logger;
    }

    public /* synthetic */ void execute(Object obj) {
        m63047a((C15328a) obj);
    }

    /* renamed from: a */
    public void m63047a(@NotNull C15328a c15328a) {
        C2668g.b(c15328a, "request");
        String a = c15328a.m57517a();
        c15328a = c15328a.m57518b();
        this.f52710a.createChatTypingEvent(a, c15328a).e(new C17173b(new AddChatTypingEvent$execute$1(this))).b(this.f52712c).a(new C17170c(this, c15328a), new C17171d(this, c15328a));
    }

    /* renamed from: a */
    private final C3956a m63044a(dt dtVar) {
        dtVar = C3956a.a(new C17169b(this, dtVar));
        C2668g.a(dtVar, "Completable.fromAction {…dEvent(chatTypingEvent) }");
        return dtVar;
    }
}
