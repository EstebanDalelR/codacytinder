package com.tinder.tinderplus.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.zw;
import com.tinder.utils.RxUtils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/tinderplus/analytics/AddUserInteractionPlusControlSettingsEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/tinderplus/analytics/AddUserInteractionPlusControlSettingsEvent$Subcategory;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "subcategory", "Subcategory", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddUserInteractionPlusControlSettingsEvent implements VoidUseCase<Subcategory> {
    /* renamed from: a */
    private final C2630h f52202a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/tinder/tinderplus/analytics/AddUserInteractionPlusControlSettingsEvent$Subcategory;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "WHO_SEES_YOU_STANDARD", "WHO_SEES_YOU_LIKED", "WHO_SEES_YOU_OUTSIDE_FB", "WHO_YOU_SEE_OPTIMAL", "WHO_YOU_SEE_RECENT_ACTIVITY", "HIDE_AGE", "UNHIDE_AGE", "HIDE_DISTANCE", "UNHIDE_DISTANCE", "HIDE_ADS", "UNHIDE_ADS", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum Subcategory {
        ;
        
        private final int value;

        protected Subcategory(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.tinderplus.analytics.AddUserInteractionPlusControlSettingsEvent$a */
    static final class C18966a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ AddUserInteractionPlusControlSettingsEvent f58653a;
        /* renamed from: b */
        final /* synthetic */ Subcategory f58654b;

        C18966a(AddUserInteractionPlusControlSettingsEvent addUserInteractionPlusControlSettingsEvent, Subcategory subcategory) {
            this.f58653a = addUserInteractionPlusControlSettingsEvent;
            this.f58654b = subcategory;
        }

        public final void call() {
            this.f58653a.f52202a.a(zw.a().b(Integer.valueOf(7)).f(Integer.valueOf(this.f58654b.getValue())).a());
        }
    }

    @Inject
    public AddUserInteractionPlusControlSettingsEvent(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f52202a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m62612a((Subcategory) obj);
    }

    /* renamed from: a */
    public void m62612a(@NotNull Subcategory subcategory) {
        C2668g.b(subcategory, "subcategory");
        Completable.a(new C18966a(this, subcategory)).b(Schedulers.io()).b(RxUtils.b());
    }
}
