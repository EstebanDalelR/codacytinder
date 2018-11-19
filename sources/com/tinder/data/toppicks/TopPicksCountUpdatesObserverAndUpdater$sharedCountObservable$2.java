package com.tinder.data.toppicks;

import com.tinder.domain.toppicks.repo.TopPicksRepository;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C3957b;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.C15756a;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class TopPicksCountUpdatesObserverAndUpdater$sharedCountObservable$2 extends Lambda implements Function0<C3957b<Integer>> {
    /* renamed from: a */
    final /* synthetic */ C11018m f44018a;
    /* renamed from: b */
    final /* synthetic */ TopPicksRepository f44019b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "test", "(Ljava/lang/Integer;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.toppicks.TopPicksCountUpdatesObserverAndUpdater$sharedCountObservable$2$1 */
    static final class C110021<T> implements Predicate<Integer> {
        /* renamed from: a */
        public static final C110021 f35738a = new C110021();

        C110021() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m43650a((Integer) obj);
        }

        /* renamed from: a */
        public final boolean m43650a(@NotNull Integer num) {
            C2668g.b(num, "it");
            return C2668g.a(num.intValue(), 0) >= null;
        }
    }

    TopPicksCountUpdatesObserverAndUpdater$sharedCountObservable$2(C11018m c11018m, TopPicksRepository topPicksRepository) {
        this.f44018a = c11018m;
        this.f44019b = topPicksRepository;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53437a();
    }

    /* renamed from: a */
    public final C3957b<Integer> m53437a() {
        return C3957b.b(this.f44018a.m43682a(), this.f44018a.f35765b.toFlowable(BackpressureStrategy.DROP)).b(C15756a.b()).d().a(C110021.f35738a).a(new Consumer<Integer>() {
            public /* synthetic */ void accept(Object obj) {
                m43651a((Integer) obj);
            }

            /* renamed from: a */
            public final void m43651a(Integer num) {
                if ((C2668g.a((Integer) this.f44018a.f35765b.b(), num) ^ 1) != 0 || !this.f44018a.f35765b.c()) {
                    C11018m c11018m = this.f44018a;
                    C2668g.a(num, "it");
                    c11018m.set(num.intValue());
                }
            }
        }).a(new C11019n(new Function1<Integer, C15813i>(this.f44019b) {
            public final String getName() {
                return "cacheTopPicksCount";
            }

            public final KDeclarationContainer getOwner() {
                return C15825i.a(TopPicksRepository.class);
            }

            public final String getSignature() {
                return "cacheTopPicksCount(I)V";
            }

            public /* synthetic */ Object invoke(Object obj) {
                m54395a(((Number) obj).intValue());
                return C15813i.f49016a;
            }

            /* renamed from: a */
            public final void m54395a(int i) {
                ((TopPicksRepository) this.receiver).cacheTopPicksCount(i);
            }
        })).m();
    }
}
