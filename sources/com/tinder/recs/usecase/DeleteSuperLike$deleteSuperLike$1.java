package com.tinder.recs.usecase;

import com.tinder.api.model.common.DeleteSuperLikeResponse;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/tinder/api/model/common/DeleteSuperLikeResponse;", "Lkotlin/ParameterName;", "name", "response", "invoke"}, k = 3, mv = {1, 1, 10})
final class DeleteSuperLike$deleteSuperLike$1 extends FunctionReference implements Function1<DeleteSuperLikeResponse, C15813i> {
    DeleteSuperLike$deleteSuperLike$1(DeleteSuperLike deleteSuperLike) {
        super(1, deleteSuperLike);
    }

    public final String getName() {
        return "handleSuperlikeResponse";
    }

    public final KDeclarationContainer getOwner() {
        return C15825i.m59860a(DeleteSuperLike.class);
    }

    public final String getSignature() {
        return "handleSuperlikeResponse(Lcom/tinder/api/model/common/DeleteSuperLikeResponse;)V";
    }

    public final void invoke(@NotNull DeleteSuperLikeResponse deleteSuperLikeResponse) {
        C2668g.b(deleteSuperLikeResponse, "p1");
        ((DeleteSuperLike) this.receiver).handleSuperlikeResponse(deleteSuperLikeResponse);
    }
}
