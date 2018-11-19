package com.tinder.purchase.domain.model;

import com.tinder.purchase.domain.model.Transaction.SuccessMessageType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/purchase/domain/model/TransactionSuccessMessageTypeFactory;", "", "createSuccessMessageType", "Lcom/tinder/purchase/domain/model/Transaction$SuccessMessageType;", "productId", "", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface TransactionSuccessMessageTypeFactory {
    @NotNull
    SuccessMessageType createSuccessMessageType(@NotNull String str, @Nullable C14510e c14510e);
}
