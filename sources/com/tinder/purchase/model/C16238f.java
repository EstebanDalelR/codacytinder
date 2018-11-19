package com.tinder.purchase.model;

import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.Transaction.SuccessMessageType;
import com.tinder.purchase.domain.model.TransactionSuccessMessageTypeFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/purchase/model/TinderTransactionSuccessMessageTypeFactory;", "Lcom/tinder/purchase/domain/model/TransactionSuccessMessageTypeFactory;", "()V", "createSuccessMessageType", "Lcom/tinder/purchase/domain/model/Transaction$SuccessMessageType;", "productId", "", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.model.f */
public final class C16238f implements TransactionSuccessMessageTypeFactory {
    @NotNull
    public SuccessMessageType createSuccessMessageType(@NotNull String str, @Nullable C14510e c14510e) {
        C2668g.b(str, "productId");
        return TransactionSuccessMessageType.Companion.m55486a(str, c14510e);
    }
}
