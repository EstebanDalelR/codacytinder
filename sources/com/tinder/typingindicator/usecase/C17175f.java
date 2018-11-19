package com.tinder.typingindicator.usecase;

import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.typingindicator.model.TypingIndicatorExperimentUtility;
import com.tinder.typingindicator.repository.TypingIndicatorRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/typingindicator/usecase/InterruptTypingIndicator;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/typingindicator/usecase/InterruptTypingIndicator$Request;", "typingIndicatorRepository", "Lcom/tinder/typingindicator/repository/TypingIndicatorRepository;", "typingIndicatorExperimentUtility", "Lcom/tinder/typingindicator/model/TypingIndicatorExperimentUtility;", "(Lcom/tinder/typingindicator/repository/TypingIndicatorRepository;Lcom/tinder/typingindicator/model/TypingIndicatorExperimentUtility;)V", "isTypingIndicatorEnabled", "", "execute", "", "request", "Request", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.typingindicator.usecase.f */
public final class C17175f implements VoidUseCase<C15329a> {
    /* renamed from: a */
    private final boolean f52716a;
    /* renamed from: b */
    private final TypingIndicatorRepository f52717b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/tinder/typingindicator/usecase/InterruptTypingIndicator$Request;", "", "matchId", "", "(Ljava/lang/String;)V", "getMatchId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.typingindicator.usecase.f$a */
    public static final class C15329a {
        @NotNull
        /* renamed from: a */
        private final String f47552a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C15329a) {
                    if (C2668g.a(this.f47552a, ((C15329a) obj).f47552a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f47552a;
            return str != null ? str.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(matchId=");
            stringBuilder.append(this.f47552a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C15329a(@NotNull String str) {
            C2668g.b(str, "matchId");
            this.f47552a = str;
        }

        @NotNull
        /* renamed from: a */
        public final String m57519a() {
            return this.f47552a;
        }
    }

    @Inject
    public C17175f(@NotNull TypingIndicatorRepository typingIndicatorRepository, @NotNull TypingIndicatorExperimentUtility typingIndicatorExperimentUtility) {
        C2668g.b(typingIndicatorRepository, "typingIndicatorRepository");
        C2668g.b(typingIndicatorExperimentUtility, "typingIndicatorExperimentUtility");
        this.f52717b = typingIndicatorRepository;
        this.f52716a = typingIndicatorExperimentUtility.isTypingIndicatorEnabled();
    }

    public /* synthetic */ void execute(Object obj) {
        m63048a((C15329a) obj);
    }

    /* renamed from: a */
    public void m63048a(@NotNull C15329a c15329a) {
        C2668g.b(c15329a, "request");
        if (this.f52716a) {
            this.f52717b.interruptTypingIndicatorForMatchId(c15329a.m57519a());
        }
    }
}
