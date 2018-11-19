package com.tinder.purchase.domain.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\r\u000eJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/tinder/purchase/domain/model/TransactionFlowError;", "", "reportType", "Lcom/tinder/purchase/domain/model/TransactionFlowError$ReportType;", "getReportType", "()Lcom/tinder/purchase/domain/model/TransactionFlowError$ReportType;", "userFacingMessageResId", "", "getUserFacingMessageResId", "()I", "shouldNotifyUser", "", "shouldNotifyUserFromPaywall", "Adapter", "ReportType", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface TransactionFlowError {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/purchase/domain/model/TransactionFlowError$Adapter;", "", "create", "Lcom/tinder/purchase/domain/model/TransactionFlowError;", "exception", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public interface Adapter {
        @NotNull
        TransactionFlowError create(@NotNull Throwable th);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/purchase/domain/model/TransactionFlowError$ReportType;", "", "(Ljava/lang/String;I)V", "SILENT", "NON_PAYWALL_ONLY", "NON_FATAL", "FATAL", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum ReportType {
    }

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.domain.model.TransactionFlowError$a */
    public static final class C14500a {
        /* renamed from: a */
        public static boolean m55369a(TransactionFlowError transactionFlowError) {
            if (transactionFlowError.getReportType() != ReportType.NON_FATAL) {
                if (transactionFlowError.getReportType() != ReportType.FATAL) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: b */
        public static boolean m55370b(TransactionFlowError transactionFlowError) {
            if (!transactionFlowError.shouldNotifyUserFromPaywall()) {
                if (transactionFlowError.getReportType() != ReportType.NON_PAYWALL_ONLY) {
                    return null;
                }
            }
            return true;
        }
    }

    @NotNull
    ReportType getReportType();

    int getUserFacingMessageResId();

    boolean shouldNotifyUser();

    boolean shouldNotifyUserFromPaywall();
}
