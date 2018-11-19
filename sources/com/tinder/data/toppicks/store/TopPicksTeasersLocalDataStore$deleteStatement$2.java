package com.tinder.data.toppicks.store;

import com.tinder.data.model.TopPickTeaserModel.C13019a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/data/model/TopPickTeaserModel$Delete_expired_top_pick_teasers;", "invoke"}, k = 3, mv = {1, 1, 10})
final class TopPicksTeasersLocalDataStore$deleteStatement$2 extends Lambda implements Function0<C13019a> {
    /* renamed from: a */
    final /* synthetic */ C8799c f44021a;

    TopPicksTeasersLocalDataStore$deleteStatement$2(C8799c c8799c) {
        this.f44021a = c8799c;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53439a();
    }

    @NotNull
    /* renamed from: a */
    public final C13019a m53439a() {
        return new C13019a(this.f44021a.f30880f.b(), this.f44021a.f30876b);
    }
}
