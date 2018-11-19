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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/reactions/usecase/UpdateNextStrikeId;", "Lcom/tinder/domain/common/usecase/SingleUseCase;", "", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "repository", "Lcom/tinder/domain/reactions/repository/StrikeReactionRepository;", "strikeReactionTypesProvider", "Lcom/tinder/domain/reactions/provider/StrikeReactionTypesProvider;", "(Lcom/tinder/domain/reactions/repository/StrikeReactionRepository;Lcom/tinder/domain/reactions/provider/StrikeReactionTypesProvider;)V", "execute", "Lrx/Single;", "matchId", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.c.l */
public final class C16290l implements SingleUseCase<String, GrandGestureType> {
    /* renamed from: a */
    private final StrikeReactionRepository f50713a;
    /* renamed from: b */
    private final StrikeReactionTypesProvider f50714b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "existingStrikeId", "Ljava8/util/Optional;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.c.l$a */
    static final class C17941a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ C16290l f55851a;

        C17941a(C16290l c16290l) {
            this.f55851a = c16290l;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65258a((Optional) obj);
        }

        @NotNull
        /* renamed from: a */
        public final String m65258a(Optional<String> optional) {
            StrikeReactionTypesProvider a = this.f55851a.f50714b;
            C2668g.a(optional, "existingStrikeId");
            return a.nextStrikeId(optional);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Single;", "", "kotlin.jvm.PlatformType", "strikeId", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.c.l$b */
    static final class C17942b<T, R> implements Func1<T, Single<? extends R>> {
        /* renamed from: a */
        final /* synthetic */ C16290l f55852a;
        /* renamed from: b */
        final /* synthetic */ String f55853b;

        C17942b(C16290l c16290l, String str) {
            this.f55852a = c16290l;
            this.f55853b = str;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65259a((String) obj);
        }

        /* renamed from: a */
        public final Single<String> m65259a(String str) {
            StrikeReactionRepository b = this.f55852a.f50713a;
            String str2 = this.f55853b;
            C2668g.a(str, "strikeId");
            return b.upsertStrikeId(str2, str).b(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "strikeId", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.c.l$c */
    static final class C17943c<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C17943c f55854a = new C17943c();

        C17943c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m65260a((String) obj);
        }

        @NotNull
        /* renamed from: a */
        public final GrandGestureType m65260a(String str) {
            Companion companion = GrandGestureType.Companion;
            C2668g.a(str, "strikeId");
            return companion.fromValue(str);
        }
    }

    @Inject
    public C16290l(@NotNull StrikeReactionRepository strikeReactionRepository, @NotNull StrikeReactionTypesProvider strikeReactionTypesProvider) {
        C2668g.b(strikeReactionRepository, "repository");
        C2668g.b(strikeReactionTypesProvider, "strikeReactionTypesProvider");
        this.f50713a = strikeReactionRepository;
        this.f50714b = strikeReactionTypesProvider;
    }

    public /* synthetic */ Single execute(Object obj) {
        return m61482a((String) obj);
    }

    @NotNull
    /* renamed from: a */
    public Single<GrandGestureType> m61482a(@NotNull String str) {
        C2668g.b(str, "matchId");
        str = this.f50713a.getStrikeId(str).d(new C17941a(this)).a(new C17942b(this, str)).d(C17943c.f55854a);
        C2668g.a(str, "repository.getStrikeId(m…ype.fromValue(strikeId) }");
        return str;
    }
}
