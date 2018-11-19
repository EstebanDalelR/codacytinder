package com.tinder.chat.view.provider;

import com.tinder.chat.view.model.C12750s;
import com.tinder.chat.view.model.ChatContext;
import com.tinder.domain.match.model.Match;
import java8.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/chat/view/model/ChatContext;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class ChatContextProvider$sharedObservable$2 extends Lambda implements Function0<Observable<ChatContext>> {
    /* renamed from: a */
    final /* synthetic */ C8506a f43729a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "matchOptional", "Ljava8/util/Optional;", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.provider.ChatContextProvider$sharedObservable$2$1 */
    static final class C127541<T, R> implements Func1<Optional<Match>, Boolean> {
        /* renamed from: a */
        public static final C127541 f41130a = new C127541();

        C127541() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m50188a((Optional) obj));
        }

        /* renamed from: a */
        public final boolean m50188a(Optional<Match> optional) {
            C2668g.a(optional, "matchOptional");
            return optional.c();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/domain/match/model/Match;", "kotlin.jvm.PlatformType", "matchOptional", "Ljava8/util/Optional;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.chat.view.provider.ChatContextProvider$sharedObservable$2$2 */
    static final class C127552<T, R> implements Func1<T, R> {
        /* renamed from: a */
        public static final C127552 f41131a = new C127552();

        C127552() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m50189a((Optional) obj);
        }

        /* renamed from: a */
        public final Match m50189a(Optional<Match> optional) {
            return (Match) optional.b();
        }
    }

    ChatContextProvider$sharedObservable$2(C8506a c8506a) {
        this.f43729a = c8506a;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53334a();
    }

    /* renamed from: a */
    public final Observable<ChatContext> m53334a() {
        return this.f43729a.f30238d.execute(this.f43729a.f30237c).f(C127541.f41130a).k(C127552.f41131a).k(new C12756b(new Function1<Match, ChatContext>(this.f43729a.f30239e) {
            public final String getName() {
                return "invoke";
            }

            public final KDeclarationContainer getOwner() {
                return C15825i.a(C12750s.class);
            }

            public final String getSignature() {
                return "invoke(Lcom/tinder/domain/match/model/Match;)Lcom/tinder/chat/view/model/ChatContext;";
            }

            public /* synthetic */ Object invoke(Object obj) {
                return m54053a((Match) obj);
            }

            @NotNull
            /* renamed from: a */
            public final ChatContext m54053a(@NotNull Match match) {
                C2668g.b(match, "p1");
                return ((C12750s) this.receiver).m50181a(match);
            }
        })).g().a(1).w();
    }
}
