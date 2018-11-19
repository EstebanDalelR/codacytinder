package com.tinder.typingindicator.usecase;

import com.tinder.domain.common.reactivex.usecase.FlowableUseCase;
import com.tinder.typingindicator.model.TypingIndicator;
import com.tinder.typingindicator.model.TypingIndicatorExperimentUtility;
import com.tinder.typingindicator.repository.TypingIndicatorRepository;
import io.reactivex.C3957b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/typingindicator/usecase/ObserveTypingIndicator;", "Lcom/tinder/domain/common/reactivex/usecase/FlowableUseCase;", "Lcom/tinder/typingindicator/usecase/ObserveTypingIndicator$Request;", "Lcom/tinder/typingindicator/model/TypingIndicator;", "typingIndicatorRepository", "Lcom/tinder/typingindicator/repository/TypingIndicatorRepository;", "typingIndicatorExperimentUtility", "Lcom/tinder/typingindicator/model/TypingIndicatorExperimentUtility;", "(Lcom/tinder/typingindicator/repository/TypingIndicatorRepository;Lcom/tinder/typingindicator/model/TypingIndicatorExperimentUtility;)V", "isTypingIndicatorEnabled", "", "execute", "Lio/reactivex/Flowable;", "request", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.usecase.m */
public final class C17183m implements FlowableUseCase<C15330a, TypingIndicator> {
    /* renamed from: a */
    private final boolean f52726a;
    /* renamed from: b */
    private final TypingIndicatorRepository f52727b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/typingindicator/usecase/ObserveTypingIndicator$Request;", "", "matchId", "", "(Ljava/lang/String;)V", "getMatchId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.usecase.m$a */
    public static final class C15330a {
        @NotNull
        /* renamed from: a */
        private final String f47553a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C15330a) {
                    if (C2668g.a(this.f47553a, ((C15330a) obj).f47553a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f47553a;
            return str != null ? str.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f47553a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15330a(@NotNull String str) {
            C2668g.b(str, "matchId");
            this.f47553a = str;
        }

        @NotNull
        /* renamed from: a */
        public final String m57520a() {
            return this.f47553a;
        }
    }

    @Inject
    public C17183m(@NotNull TypingIndicatorRepository typingIndicatorRepository, @NotNull TypingIndicatorExperimentUtility typingIndicatorExperimentUtility) {
        C2668g.b(typingIndicatorRepository, "typingIndicatorRepository");
        C2668g.b(typingIndicatorExperimentUtility, "typingIndicatorExperimentUtility");
        this.f52727b = typingIndicatorRepository;
        this.f52726a = typingIndicatorExperimentUtility.isTypingIndicatorEnabled();
    }

    public /* synthetic */ C3957b execute(Object obj) {
        return m63053a((C15330a) obj);
    }

    @NotNull
    /* renamed from: a */
    public C3957b<TypingIndicator> m63053a(@NotNull C15330a c15330a) {
        C2668g.b(c15330a, "request");
        if (this.f52726a) {
            return this.f52727b.observeTypingIndicatorForMatchId(c15330a.m57520a());
        }
        c15330a = C3957b.b();
        C2668g.a(c15330a, "Flowable.empty()");
        return c15330a;
    }
}
