package com.tinder.data.recs;

import com.tinder.api.model.common.ApiMatch;
import com.tinder.api.model.common.ApiMessage;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.match.model.Match;
import com.tinder.domain.match.repository.MatchRepository;
import com.tinder.domain.message.DeliveryStatus;
import com.tinder.domain.message.MessageRepository;
import com.tinder.domain.message.TextMessage;
import com.tinder.domain.recs.model.UserRec;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.Single;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/tinder/data/recs/InsertBrandedMatch;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/data/recs/InsertBrandedMatch$Request;", "matchRepository", "Lcom/tinder/domain/match/repository/MatchRepository;", "messageRepository", "Lcom/tinder/domain/message/MessageRepository;", "(Lcom/tinder/domain/match/repository/MatchRepository;Lcom/tinder/domain/message/MessageRepository;)V", "createMessage", "Lcom/tinder/domain/message/TextMessage;", "apiMessage", "Lcom/tinder/api/model/common/ApiMessage;", "match", "Lcom/tinder/domain/match/model/Match;", "execute", "", "request", "Request", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.recs.e */
public final class C10990e implements VoidUseCase<C8774a> {
    /* renamed from: a */
    private final MatchRepository f35716a;
    /* renamed from: b */
    private final MessageRepository f35717b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/tinder/data/recs/InsertBrandedMatch$Request;", "", "rec", "Lcom/tinder/domain/recs/model/UserRec;", "apiMatch", "Lcom/tinder/api/model/common/ApiMatch;", "match", "Lcom/tinder/domain/match/model/Match;", "(Lcom/tinder/domain/recs/model/UserRec;Lcom/tinder/api/model/common/ApiMatch;Lcom/tinder/domain/match/model/Match;)V", "getApiMatch", "()Lcom/tinder/api/model/common/ApiMatch;", "getMatch", "()Lcom/tinder/domain/match/model/Match;", "getRec", "()Lcom/tinder/domain/recs/model/UserRec;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.recs.e$a */
    public static final class C8774a {
        @NotNull
        /* renamed from: a */
        private final UserRec f30825a;
        @NotNull
        /* renamed from: b */
        private final ApiMatch f30826b;
        @NotNull
        /* renamed from: c */
        private final Match f30827c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8774a) {
                    C8774a c8774a = (C8774a) obj;
                    if (C2668g.a(this.f30825a, c8774a.f30825a) && C2668g.a(this.f30826b, c8774a.f30826b) && C2668g.a(this.f30827c, c8774a.f30827c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            UserRec userRec = this.f30825a;
            int i = 0;
            int hashCode = (userRec != null ? userRec.hashCode() : 0) * 31;
            ApiMatch apiMatch = this.f30826b;
            hashCode = (hashCode + (apiMatch != null ? apiMatch.hashCode() : 0)) * 31;
            Match match = this.f30827c;
            if (match != null) {
                i = match.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(rec=");
            stringBuilder.append(this.f30825a);
            stringBuilder.append(", apiMatch=");
            stringBuilder.append(this.f30826b);
            stringBuilder.append(", match=");
            stringBuilder.append(this.f30827c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8774a(@NotNull UserRec userRec, @NotNull ApiMatch apiMatch, @NotNull Match match) {
            C2668g.b(userRec, "rec");
            C2668g.b(apiMatch, "apiMatch");
            C2668g.b(match, "match");
            this.f30825a = userRec;
            this.f30826b = apiMatch;
            this.f30827c = match;
        }

        @NotNull
        /* renamed from: a */
        public final UserRec m37376a() {
            return this.f30825a;
        }

        @NotNull
        /* renamed from: b */
        public final ApiMatch m37377b() {
            return this.f30826b;
        }

        @NotNull
        /* renamed from: c */
        public final Match m37378c() {
            return this.f30827c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/message/TextMessage;", "it", "Lcom/tinder/api/model/common/ApiMessage;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.recs.e$b */
    static final class C13098b<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C10990e f41717a;
        /* renamed from: b */
        final /* synthetic */ C8774a f41718b;

        C13098b(C10990e c10990e, C8774a c8774a) {
            this.f41717a = c10990e;
            this.f41718b = c8774a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50953a((ApiMessage) obj);
        }

        @NotNull
        /* renamed from: a */
        public final TextMessage m50953a(ApiMessage apiMessage) {
            C10990e c10990e = this.f41717a;
            C2668g.a(apiMessage, "it");
            return c10990e.m43601a(apiMessage, this.f41718b.m37378c());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "message", "Lcom/tinder/domain/message/TextMessage;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.recs.e$c */
    static final class C13099c<T, R> implements Func1<TextMessage, Completable> {
        /* renamed from: a */
        final /* synthetic */ C10990e f41719a;
        /* renamed from: b */
        final /* synthetic */ C8774a f41720b;

        C13099c(C10990e c10990e, C8774a c8774a) {
            this.f41719a = c10990e;
            this.f41720b = c8774a;
        }

        public /* synthetic */ Object call(Object obj) {
            return m50954a((TextMessage) obj);
        }

        /* renamed from: a */
        public final Completable m50954a(TextMessage textMessage) {
            return Completable.b(new Completable[]{this.f41719a.f35716a.insertMatches(C19301m.a(this.f41720b.m37378c())), this.f41719a.f35717b.addMessages(C19301m.a(textMessage))});
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.recs.e$d */
    static final class C13875d implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C8774a f43993a;

        C13875d(C8774a c8774a) {
            this.f43993a = c8774a;
        }

        public final void call() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Created match from branded rec ");
            stringBuilder.append(this.f43993a.m37376a());
            C0001a.b(stringBuilder.toString(), new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.recs.e$e */
    static final class C13876e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C13876e f43994a = new C13876e();

        C13876e() {
        }

        public /* synthetic */ void call(Object obj) {
            m53433a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53433a(Throwable th) {
            C0001a.c(th, "Error creating match from branded rec", new Object[0]);
        }
    }

    @Inject
    public C10990e(@NotNull MatchRepository matchRepository, @NotNull MessageRepository messageRepository) {
        C2668g.b(matchRepository, "matchRepository");
        C2668g.b(messageRepository, "messageRepository");
        this.f35716a = matchRepository;
        this.f35717b = messageRepository;
    }

    public /* synthetic */ void execute(Object obj) {
        m43604a((C8774a) obj);
    }

    /* renamed from: a */
    public void m43604a(@NotNull C8774a c8774a) {
        C2668g.b(c8774a, "request");
        List messages = c8774a.m37377b().messages();
        Object obj = messages != null ? (ApiMessage) C19301m.g(messages) : null;
        if (c8774a.m37376a().isBranded()) {
            if (obj != null) {
                Single.a(obj).d(new C13098b(this, c8774a)).c(new C13099c(this, c8774a)).b(Schedulers.io()).a(new C13875d(c8774a), (Action1) C13876e.f43994a);
                return;
            }
        }
        C0001a.d("Tried to insert Branded Match, but no message available", new Object[0]);
    }

    /* renamed from: a */
    private final TextMessage m43601a(ApiMessage apiMessage, Match match) {
        String id = apiMessage.getId();
        if (id == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String id2 = match.getId();
        if (id2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String to = apiMessage.getTo();
        if (to == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String from = apiMessage.getFrom();
        if (from == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        String message = apiMessage.getMessage();
        if (message == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        DateTime creationDate = match.getCreationDate();
        if (creationDate != null) {
            return new TextMessage(null, id, id2, to, from, message, creationDate, false, false, DeliveryStatus.SUCCESS, 1, null);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
