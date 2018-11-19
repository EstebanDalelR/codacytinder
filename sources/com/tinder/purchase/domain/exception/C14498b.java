package com.tinder.purchase.domain.exception;

import com.tinder.purchase.domain.exception.PurchaseValidationException.ValidationErrorType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.domain.exception.b */
public final /* synthetic */ class C14498b {
    /* renamed from: a */
    public static final /* synthetic */ int[] f45884a = new int[ValidationErrorType.values().length];

    static {
        f45884a[ValidationErrorType.MAX_RESTORE_ATTEMPTS.ordinal()] = 1;
        f45884a[ValidationErrorType.PURCHASE_EXPIRED.ordinal()] = 2;
        f45884a[ValidationErrorType.PURCHASE_IN_USE.ordinal()] = 3;
        f45884a[ValidationErrorType.INELIGIBLE_PURCHASE.ordinal()] = 4;
        f45884a[ValidationErrorType.PURCHASE_DUPLICATE.ordinal()] = 5;
        f45884a[ValidationErrorType.PLATFORM_MISMATCH.ordinal()] = 6;
        f45884a[ValidationErrorType.EMPTY_RECEIPT.ordinal()] = 7;
        f45884a[ValidationErrorType.GENERIC.ordinal()] = 8;
    }
}
