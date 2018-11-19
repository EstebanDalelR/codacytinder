package com.tinder.reactions.p385c;

import com.tinder.domain.common.usecase.SingleUseCase;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.domain.reactions.model.GrandGestureType.Companion;
import com.tinder.domain.reactions.provider.StrikeReactionTypesProvider;
import com.tinder.domain.reactions.repository.StrikeReactionRepository;
import java8.util.Optional;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Single;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/reactions/usecase/GetNextStrikeId;", "Lcom/tinder/domain/common/usecase/SingleUseCase;", "", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "strikeReactionRepository", "Lcom/tinder/domain/reactions/repository/StrikeReactionRepository;", "strikeReactionTypesProvider", "Lcom/tinder/domain/reactions/provider/StrikeReactionTypesProvider;", "(Lcom/tinder/domain/reactions/repository/StrikeReactionRepository;Lcom/tinder/domain/reactions/provider/StrikeReactionTypesProvider;)V", "execute", "Lrx/Single;", "matchId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.c.h */
public final class C16288h implements SingleUseCase<String, GrandGestureType> {
    /* renamed from: a */
    private final StrikeReactionRepository f50710a;
    /* renamed from: b */
    private final StrikeReactionTypesProvider f50711b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "strikeId", "Ljava8/util/Optional;", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.c.h$a */
    static final class C17938a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16288h f55847a;

        C17938a(C16288h c16288h) {
            this.f55847a = c16288h;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65251a((Optional) obj);
        }

        @NotNull
        /* renamed from: a */
        public final GrandGestureType m65251a(Optional<String> optional) {
            Companion companion = GrandGestureType.Companion;
            StrikeReactionTypesProvider a = this.f55847a.f50711b;
            C2668g.a(optional, "strikeId");
            return companion.fromValue(a.nextStrikeId(optional));
        }
    }

    @Inject
    public C16288h(@NotNull StrikeReactionRepository strikeReactionRepository, @NotNull StrikeReactionTypesProvider strikeReactionTypesProvider) {
        C2668g.b(strikeReactionRepository, "strikeReactionRepository");
        C2668g.b(strikeReactionTypesProvider, "strikeReactionTypesProvider");
        this.f50710a = strikeReactionRepository;
        this.f50711b = strikeReactionTypesProvider;
    }

    public /* synthetic */ Single execute(Object obj) {
        return m61478a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public Single<GrandGestureType> m61478a(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = this.f50710a.getStrikeId(str).d(new C17938a(this));
        C2668g.a(str, "strikeReactionRepository…(strikeId))\n            }");
        return str;
    }
}
