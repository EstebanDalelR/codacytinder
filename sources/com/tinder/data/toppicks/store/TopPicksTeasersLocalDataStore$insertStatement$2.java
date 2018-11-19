package com.tinder.data.toppicks.store;

import com.tinder.data.model.TopPickTeaserModel.C13020c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/tinder/data/model/TopPickTeaserModel$Insert_top_pick_teaser;", "invoke"}, k = 3, mv = {1, 1, 10})
final class TopPicksTeasersLocalDataStore$insertStatement$2 extends Lambda implements Function0<C13020c> {
    /* renamed from: a */
    final /* synthetic */ C8799c f44022a;

    TopPicksTeasersLocalDataStore$insertStatement$2(C8799c c8799c) {
        this.f44022a = c8799c;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53440a();
    }

    @NotNull
    /* renamed from: a */
    public final C13020c m53440a() {
        return new C13020c(this.f44022a.f30880f.b(), this.f44022a.f30876b);
    }
}
