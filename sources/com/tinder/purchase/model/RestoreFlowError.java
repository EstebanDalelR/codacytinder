package com.tinder.purchase.model;

import com.tinder.purchase.domain.exception.PurchaseClientException.ClientErrorType;
import com.tinder.purchase.domain.exception.PurchaseLoggableException;
import com.tinder.purchase.domain.exception.PurchaseValidationException.ValidationErrorType;
import com.tinder.purchase.domain.model.TransactionFlowError;
import com.tinder.purchase.domain.model.TransactionFlowError.Adapter;
import com.tinder.purchase.domain.model.TransactionFlowError.C14500a;
import com.tinder.purchase.domain.model.TransactionFlowError.ReportType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0014B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/tinder/purchase/model/RestoreFlowError;", "", "Lcom/tinder/purchase/domain/model/TransactionFlowError;", "userFacingMessageResId", "", "reportType", "Lcom/tinder/purchase/domain/model/TransactionFlowError$ReportType;", "(Ljava/lang/String;IILcom/tinder/purchase/domain/model/TransactionFlowError$ReportType;)V", "getReportType", "()Lcom/tinder/purchase/domain/model/TransactionFlowError$ReportType;", "getUserFacingMessageResId", "()I", "MAX_RESTORE_ATTEMPTS", "PURCHASE_EXPIRED", "PURCHASE_IN_USE", "INELIGIBLE_PURCHASE", "PURCHASE_DUPLICATE", "PLATFORM_MISMATCH", "NOTHING_TO_RESTORE", "GENERIC", "Adapter", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public enum RestoreFlowError implements TransactionFlowError {
    ;
    
    @NotNull
    private final ReportType reportType;
    private final int userFacingMessageResId;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/purchase/model/RestoreFlowError$Adapter;", "Lcom/tinder/purchase/domain/model/TransactionFlowError$Adapter;", "()V", "create", "Lcom/tinder/purchase/domain/model/TransactionFlowError;", "exception", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.model.RestoreFlowError$a */
    public static final class C16234a implements Adapter {
        @NotNull
        public TransactionFlowError create(@NotNull Throwable th) {
            C2668g.b(th, "exception");
            if (!(th instanceof PurchaseLoggableException)) {
                th = null;
            }
            PurchaseLoggableException purchaseLoggableException = (PurchaseLoggableException) th;
            if (purchaseLoggableException == null) {
                return (TransactionFlowError) RestoreFlowError.GENERIC;
            }
            th = purchaseLoggableException.mo11824e();
            if (th == ValidationErrorType.MAX_RESTORE_ATTEMPTS) {
                th = (TransactionFlowError) RestoreFlowError.MAX_RESTORE_ATTEMPTS;
            } else if (th == ValidationErrorType.PURCHASE_EXPIRED) {
                th = (TransactionFlowError) RestoreFlowError.PURCHASE_EXPIRED;
            } else if (th == ValidationErrorType.PURCHASE_IN_USE) {
                th = (TransactionFlowError) RestoreFlowError.PURCHASE_IN_USE;
            } else if (th == ValidationErrorType.INELIGIBLE_PURCHASE) {
                th = (TransactionFlowError) RestoreFlowError.INELIGIBLE_PURCHASE;
            } else if (th == ValidationErrorType.PURCHASE_DUPLICATE) {
                th = (TransactionFlowError) RestoreFlowError.PURCHASE_DUPLICATE;
            } else if (th == ValidationErrorType.PLATFORM_MISMATCH) {
                th = (TransactionFlowError) RestoreFlowError.PLATFORM_MISMATCH;
            } else if (th == ClientErrorType.EMPTY_PURCHASES) {
                th = (TransactionFlowError) RestoreFlowError.NOTHING_TO_RESTORE;
            } else {
                th = (TransactionFlowError) RestoreFlowError.GENERIC;
            }
            return th;
        }
    }

    protected RestoreFlowError(int i, ReportType reportType) {
        C2668g.b(reportType, "reportType");
        this.userFacingMessageResId = i;
        this.reportType = reportType;
    }

    public boolean shouldNotifyUser() {
        return C14500a.m55370b(this);
    }

    public boolean shouldNotifyUserFromPaywall() {
        return C14500a.m55369a(this);
    }

    public int getUserFacingMessageResId() {
        return this.userFacingMessageResId;
    }

    @NotNull
    public ReportType getReportType() {
        return this.reportType;
    }
}
