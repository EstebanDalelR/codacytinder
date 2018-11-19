package com.tinder.domain.superlikeable.usecase;

import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.model.SuperLikeableGameTeaserRec;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "it", "Lcom/tinder/domain/recs/model/SuperLikeableGameTeaserRec;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class InjectSuperLikeableGameTeaserRec$execute$1<T, R> implements Func1<SuperLikeableGameTeaserRec, Completable> {
    final /* synthetic */ InjectSuperLikeableGameTeaserRec this$0;

    InjectSuperLikeableGameTeaserRec$execute$1(InjectSuperLikeableGameTeaserRec injectSuperLikeableGameTeaserRec) {
        this.this$0 = injectSuperLikeableGameTeaserRec;
    }

    @NotNull
    public final Completable call(SuperLikeableGameTeaserRec superLikeableGameTeaserRec) {
        RecsEngine access$getRecsEngine$p = this.this$0.recsEngine;
        C2668g.a(superLikeableGameTeaserRec, "it");
        return access$getRecsEngine$p.insertRec(superLikeableGameTeaserRec, 2);
    }
}
