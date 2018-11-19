package com.tinder.purchase.p373c;

import android.support.annotation.NonNull;
import com.tinder.api.TinderApi;
import com.tinder.api.model.purchase.BillingReceipt;
import com.tinder.api.model.purchase.PurchaseValidation;
import com.tinder.api.model.purchase.PurchaseValidation.Receipt;
import com.tinder.api.model.purchase.PurchaseValidationWrapper;
import com.tinder.common.utils.C8578a;
import com.tinder.purchase.domain.exception.PurchaseValidationException;
import com.tinder.purchase.domain.exception.PurchaseValidationException.ValidationErrorType;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import rx.Observable;
import rx.Single;

@Singleton
/* renamed from: com.tinder.purchase.c.a */
public class C14488a {
    /* renamed from: a */
    private final TinderApi f45875a;

    @Inject
    public C14488a(TinderApi tinderApi) {
        this.f45875a = tinderApi;
    }

    /* renamed from: a */
    public Single<List<Receipt>> m55335a(@NonNull String str, @NonNull BillingReceipt billingReceipt) {
        return this.f45875a.validatePurchase(BillingReceipt.toApiRequest(billingReceipt)).h(new C17810b(str, billingReceipt)).a();
    }

    /* renamed from: a */
    static final /* synthetic */ Observable m55334a(@NonNull String str, @NonNull BillingReceipt billingReceipt, PurchaseValidationWrapper purchaseValidationWrapper) {
        PurchaseValidation purchaseValidation = purchaseValidationWrapper.purchaseValidation();
        purchaseValidationWrapper = purchaseValidationWrapper.responseBody();
        List<Receipt> receipts = purchaseValidation.receipts();
        if (receipts != null) {
            for (Receipt receipt : receipts) {
                Object obj;
                CharSequence errorMessage = receipt.errorMessage();
                Object errorCode = receipt.errorCode();
                if (C8578a.a(errorMessage)) {
                    if (C8578a.a(errorCode)) {
                        obj = null;
                        continue;
                        if (obj != null) {
                            return Observable.a(PurchaseValidationException.m61201a(ValidationErrorType.getTypeFromErrorCode(errorCode), str, billingReceipt.receipt(), purchaseValidationWrapper, receipt.productId()));
                        }
                    }
                }
                obj = 1;
                continue;
                if (obj != null) {
                    return Observable.a(PurchaseValidationException.m61201a(ValidationErrorType.getTypeFromErrorCode(errorCode), str, billingReceipt.receipt(), purchaseValidationWrapper, receipt.productId()));
                }
            }
            if (!receipts.isEmpty()) {
                return Observable.a(receipts);
            }
        }
        return Observable.a(PurchaseValidationException.m61200a(ValidationErrorType.EMPTY_RECEIPT, str, billingReceipt.receipt(), purchaseValidationWrapper));
    }
}
