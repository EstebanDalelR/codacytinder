package com.tinder.purchase.domain.model;

import com.tinder.purchase.domain.model.Transaction.Status;
import com.tinder.purchase.domain.model.Transaction.SuccessMessageType;
import com.tinder.purchase.domain.model.Transaction.Type;
import com.tinder.purchase.domain.repository.OfferRepository;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/purchase/domain/model/TransactionFactory;", "", "offerRepository", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "transactionSuccessMessageTypeFactory", "Lcom/tinder/purchase/domain/model/TransactionSuccessMessageTypeFactory;", "(Lcom/tinder/purchase/domain/repository/OfferRepository;Lcom/tinder/purchase/domain/model/TransactionSuccessMessageTypeFactory;)V", "createFailingPurchaseTransaction", "Lcom/tinder/purchase/domain/model/Transaction;", "productId", "", "error", "Lcom/tinder/purchase/domain/model/TransactionFlowError;", "createFailingRestoreTransaction", "createSuccessfulPurchaseTransaction", "createSuccessfulRestoreTransaction", "getOffer", "Lcom/tinder/purchase/domain/model/Offer;", "getSuccessMessageType", "Lcom/tinder/purchase/domain/model/Transaction$SuccessMessageType;", "domain_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.domain.model.l */
public final class C14517l {
    /* renamed from: a */
    private final OfferRepository f45898a;
    /* renamed from: b */
    private final TransactionSuccessMessageTypeFactory f45899b;

    @Inject
    public C14517l(@NotNull OfferRepository offerRepository, @NotNull TransactionSuccessMessageTypeFactory transactionSuccessMessageTypeFactory) {
        C2668g.b(offerRepository, "offerRepository");
        C2668g.b(transactionSuccessMessageTypeFactory, "transactionSuccessMessageTypeFactory");
        this.f45898a = offerRepository;
        this.f45899b = transactionSuccessMessageTypeFactory;
    }

    @NotNull
    /* renamed from: a */
    public final Transaction m55441a(@NotNull String str) {
        C2668g.b(str, "productId");
        str = Transaction.m55362g().mo11873a(Type.PURCHASE).mo11871a(Status.SUCCESS).mo11876a(str).mo11875a(m55439c(str)).mo11872a(m55440d(str)).mo11877a();
        C2668g.a(str, "Transaction.builder()\n  …Id))\n            .build()");
        return str;
    }

    @NotNull
    /* renamed from: a */
    public final Transaction m55442a(@NotNull String str, @NotNull TransactionFlowError transactionFlowError) {
        C2668g.b(str, "productId");
        C2668g.b(transactionFlowError, "error");
        str = Transaction.m55362g().mo11873a(Type.PURCHASE).mo11871a(Status.FAILURE).mo11876a(str).mo11874a(transactionFlowError).mo11875a(m55439c(str)).mo11877a();
        C2668g.a(str, "Transaction.builder()\n  …Id))\n            .build()");
        return str;
    }

    @NotNull
    /* renamed from: b */
    public final Transaction m55443b(@NotNull String str) {
        C2668g.b(str, "productId");
        str = Transaction.m55362g().mo11873a(Type.RESTORE).mo11871a(Status.SUCCESS).mo11876a(str).mo11875a(m55439c(str)).mo11872a(m55440d(str)).mo11877a();
        C2668g.a(str, "Transaction.builder()\n  …Id))\n            .build()");
        return str;
    }

    @NotNull
    /* renamed from: b */
    public final Transaction m55444b(@Nullable String str, @NotNull TransactionFlowError transactionFlowError) {
        C2668g.b(transactionFlowError, "error");
        transactionFlowError = Transaction.m55362g().mo11873a(Type.RESTORE).mo11871a(Status.FAILURE).mo11874a(transactionFlowError);
        if (str != null) {
            transactionFlowError.mo11875a(this.f45898a.getOffer(str)).mo11876a(str);
        }
        str = transactionFlowError.mo11877a();
        C2668g.a(str, "builder.build()");
        return str;
    }

    /* renamed from: c */
    private final C14510e m55439c(String str) {
        return this.f45898a.getOffer(str);
    }

    /* renamed from: d */
    private final SuccessMessageType m55440d(String str) {
        return this.f45899b.createSuccessMessageType(str, m55439c(str));
    }
}
