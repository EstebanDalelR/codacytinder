package com.tinder.purchase.domain.exception;

import com.tinder.api.model.purchase.PurchaseLog.Domain;
import com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18464j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00162\u00020\u0001:\u0015\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0007XD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011\u0001\u0013()*+,-./0123456789:¨\u0006;"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseBillingException;", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException;", "errorCode", "", "throwable", "", "receipt", "", "(ILjava/lang/Throwable;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/Integer;", "errorDomain", "Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "getErrorDomain", "()Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "errorNamespace", "getErrorNamespace", "()Ljava/lang/String;", "getReceipt", "BillingErrorType", "BillingResponseException", "BillingUnavailableException", "Companion", "ConsumeFailedException", "DeveloperBillingException", "EmptyBillingReceiptException", "FailedToInitPurchaseException", "FailedToLoadPurchasesException", "InvalidDeveloperPayloadException", "InvalidMerchantIdException", "InvalidSignatureException", "ItemAlreadyOwnedException", "ItemNotOwnedException", "ItemUnavailableException", "LostContextException", "ProcessorNotInitializedException", "ServiceUnavailableException", "SkuDetailsFailedException", "UnknownBillingException", "UserCancelledPurchaseException", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$ProcessorNotInitializedException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$UserCancelledPurchaseException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$ServiceUnavailableException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$BillingUnavailableException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$ItemUnavailableException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$DeveloperBillingException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$BillingResponseException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$ItemAlreadyOwnedException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$ItemNotOwnedException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$FailedToLoadPurchasesException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$FailedToInitPurchaseException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$InvalidSignatureException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$LostContextException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$InvalidMerchantIdException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$ConsumeFailedException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$SkuDetailsFailedException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$EmptyBillingReceiptException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$InvalidDeveloperPayloadException;", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$UnknownBillingException;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class PurchaseBillingException extends PurchaseLoggableException {
    /* renamed from: a */
    public static final C14494a f50467a = new C14494a();
    @NotNull
    /* renamed from: b */
    private final Domain f50468b;
    @NotNull
    /* renamed from: c */
    private final String f50469c;
    /* renamed from: d */
    private final int f50470d;
    @Nullable
    /* renamed from: e */
    private final String f50471e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\f"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseBillingException$Companion;", "", "()V", "fromErrorCode", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException;", "errorCode", "", "cause", "", "productId", "", "receiptId", "domain_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.domain.exception.PurchaseBillingException$a */
    public static final class C14494a {
        private C14494a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0001\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u001fB\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006 "}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseBillingException$BillingErrorType;", "", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException$ErrorType;", "typeName", "", "errorCode", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getErrorCode", "()I", "getTypeName", "()Ljava/lang/String;", "USER_CANCELLED", "SERVICE_UNAVAILABLE", "BILLING_UNAVAILABLE", "ITEM_UNAVAILABLE", "DEVELOPER_ERROR", "RESULT_ERROR", "ITEM_ALREADY_OWNED", "ITEM_NOT_OWNED", "PROCESSOR_NOT_INIT", "FAILED_TO_LOAD_PURCHASES", "FAILED_TO_INIT_PURCHASE", "INVALID_SIGNATURE", "LOST_CONTEXT", "INVALID_MERCHANT_ID", "CONSUME_FAILED", "SKU_DETAILS_FAILED", "BILLING_RECEIPT_EMPTY", "INVALID_DEVELOPER_PAYLOAD", "UNKNOWN", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum BillingErrorType implements ErrorType {
        ;
        
        public static final C14493a Companion = null;
        private static final Map<Integer, BillingErrorType> map = null;
        private final int errorCode;
        @NotNull
        private final String typeName;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseBillingException$BillingErrorType$Companion;", "", "()V", "map", "", "", "Lcom/tinder/purchase/domain/exception/PurchaseBillingException$BillingErrorType;", "getTypeFromErrorCode", "errorCode", "domain_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.purchase.domain.exception.PurchaseBillingException$BillingErrorType$a */
        public static final class C14493a {
            private C14493a() {
            }

            @JvmStatic
            @NotNull
            /* renamed from: a */
            public final BillingErrorType m55342a(int i) {
                BillingErrorType billingErrorType = (BillingErrorType) BillingErrorType.map.get(Integer.valueOf(i));
                return billingErrorType != null ? billingErrorType : BillingErrorType.UNKNOWN;
            }
        }

        @JvmStatic
        @NotNull
        public static final BillingErrorType getTypeFromErrorCode(int i) {
            return Companion.m55342a(i);
        }

        protected BillingErrorType(String str, int i) {
            C2668g.b(str, "typeName");
            this.typeName = str;
            this.errorCode = i;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public String getTypeName() {
            return this.typeName;
        }

        static {
            Companion = new C14493a();
            BillingErrorType[] values = values();
            Map linkedHashMap = new LinkedHashMap(C18464j.m66926c(ah.m66883a(values.length), 16));
            int length = values.length;
            int i;
            while (i < length) {
                BillingErrorType billingErrorType = values[i];
                linkedHashMap.put(Integer.valueOf(billingErrorType.errorCode), billingErrorType);
                i++;
            }
            map = linkedHashMap;
        }
    }

    @NotNull
    /* renamed from: c */
    public Integer mo11822c() {
        return Integer.valueOf(this.f50470d);
    }

    @Nullable
    public String w_() {
        return this.f50471e;
    }

    @NotNull
    /* renamed from: a */
    public Domain mo11820a() {
        return this.f50468b;
    }

    @NotNull
    /* renamed from: b */
    public String mo11821b() {
        return this.f50469c;
    }
}
