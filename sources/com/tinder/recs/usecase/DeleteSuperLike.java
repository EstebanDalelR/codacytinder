package com.tinder.recs.usecase;

import com.tinder.api.TinderApi;
import com.tinder.api.model.common.DeleteSuperLikeResponse;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.Rec$Type;
import com.tinder.domain.recs.model.RecType;
import com.tinder.superlike.p421e.C15082f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/recs/usecase/DeleteSuperLike;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/domain/recs/model/Rec;", "tinderApi", "Lcom/tinder/api/TinderApi;", "superlikeStatusProvider", "Lcom/tinder/superlike/provider/SuperlikeStatusProvider;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/superlike/provider/SuperlikeStatusProvider;)V", "deleteSuperLike", "", "rec", "execute", "handleSuperlikeResponse", "response", "Lcom/tinder/api/model/common/DeleteSuperLikeResponse;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class DeleteSuperLike implements VoidUseCase<Rec> {
    private final C15082f superlikeStatusProvider;
    private final TinderApi tinderApi;

    @Inject
    public DeleteSuperLike(@NotNull TinderApi tinderApi, @NotNull C15082f c15082f) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(c15082f, "superlikeStatusProvider");
        this.tinderApi = tinderApi;
        this.superlikeStatusProvider = c15082f;
    }

    public void execute(@NotNull Rec rec) {
        C2668g.b(rec, "rec");
        Rec$Type type = rec.getType();
        if (type != RecType.USER) {
            if (type != RecType.BRAND) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Trying to delete superlike for ");
                stringBuilder.append(rec.getType());
                stringBuilder.append(" rec, which is unexpected.");
                C0001a.d(stringBuilder.toString(), new Object[0]);
                return;
            }
        }
        deleteSuperLike(rec);
    }

    private final void deleteSuperLike(Rec rec) {
        this.tinderApi.deleteSuperLike(rec.getId()).b(Schedulers.io()).a(new DeleteSuperLike$sam$rx_functions_Action1$0(new DeleteSuperLike$deleteSuperLike$1(this)), DeleteSuperLike$deleteSuperLike$2.INSTANCE);
    }

    private final void handleSuperlikeResponse(DeleteSuperLikeResponse deleteSuperLikeResponse) {
        this.superlikeStatusProvider.m56832a(deleteSuperLikeResponse.getSuperLikes().getRemaining());
    }
}
