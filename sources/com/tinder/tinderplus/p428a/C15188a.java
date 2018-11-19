package com.tinder.tinderplus.p428a;

import com.tinder.boost.p178a.C10400d;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.tinderplus.model.TinderPlusIncentive;
import com.tinder.tinderplus.provider.C15220b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/tinderplus/interactors/GetTinderPlusIncentives;", "", "tinderPlusConfigProvider", "Lcom/tinder/tinderplus/provider/TinderPlusConfigProvider;", "boostInteractor", "Lcom/tinder/boost/interactor/BoostInteractor;", "superlikeInteractor", "Lcom/tinder/superlike/interactors/SuperlikeInteractor;", "(Lcom/tinder/tinderplus/provider/TinderPlusConfigProvider;Lcom/tinder/boost/interactor/BoostInteractor;Lcom/tinder/superlike/interactors/SuperlikeInteractor;)V", "execute", "", "Lcom/tinder/tinderplus/model/TinderPlusIncentive;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.tinderplus.a.a */
public final class C15188a {
    /* renamed from: a */
    private final C15220b f47234a;
    /* renamed from: b */
    private final C10400d f47235b;
    /* renamed from: c */
    private final C15071e f47236c;

    @Inject
    public C15188a(@NotNull C15220b c15220b, @NotNull C10400d c10400d, @NotNull C15071e c15071e) {
        C2668g.b(c15220b, "tinderPlusConfigProvider");
        C2668g.b(c10400d, "boostInteractor");
        C2668g.b(c15071e, "superlikeInteractor");
        this.f47234a = c15220b;
        this.f47235b = c10400d;
        this.f47236c = c15071e;
    }

    @NotNull
    /* renamed from: a */
    public final List<TinderPlusIncentive> m57104a() {
        List<String> c = this.f47234a.m57278a().mo12563c();
        C2668g.a(c, "incentives");
        Collection arrayList = new ArrayList();
        for (String from : c) {
            TinderPlusIncentive from2 = TinderPlusIncentive.from(from);
            if (from2 != null) {
                arrayList.add(from2);
            }
        }
        Collection arrayList2 = new ArrayList();
        for (Object next : (List) arrayList) {
            boolean a;
            switch ((TinderPlusIncentive) next) {
                case BOOST:
                    a = this.f47235b.a();
                    break;
                case SUPERLIKE:
                    a = this.f47236c.m56817a();
                    break;
                default:
                    a = true;
                    break;
            }
            if (a) {
                arrayList2.add(next);
            }
        }
        return C19299w.m68840l((List) arrayList2);
    }
}
