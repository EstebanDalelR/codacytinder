package com.tinder.purchase.domain.exception;

import com.tinder.api.model.purchase.PurchaseLog.Domain;
import com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0001\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseClientException;", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException;", "()V", "errorDomain", "Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "getErrorDomain", "()Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "errorNamespace", "", "getErrorNamespace", "()Ljava/lang/String;", "ActivityNotExtendingSignedInBase", "ClientErrorType", "EmptyBillingReceiptException", "EmptyOfferException", "EmptyPurchasesException", "PurchaseTimeoutException", "SubscriptionIsActiveException", "TooRecentPurchaseException", "Lcom/tinder/purchase/domain/exception/PurchaseClientException$TooRecentPurchaseException;", "Lcom/tinder/purchase/domain/exception/PurchaseClientException$SubscriptionIsActiveException;", "Lcom/tinder/purchase/domain/exception/PurchaseClientException$EmptyOfferException;", "Lcom/tinder/purchase/domain/exception/PurchaseClientException$EmptyBillingReceiptException;", "Lcom/tinder/purchase/domain/exception/PurchaseClientException$EmptyPurchasesException;", "Lcom/tinder/purchase/domain/exception/PurchaseClientException$PurchaseTimeoutException;", "Lcom/tinder/purchase/domain/exception/PurchaseClientException$ActivityNotExtendingSignedInBase;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class PurchaseClientException extends PurchaseLoggableException {
    @NotNull
    /* renamed from: a */
    private final Domain f50472a;
    @NotNull
    /* renamed from: b */
    private final String f50473b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseClientException$ClientErrorType;", "", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException$ErrorType;", "typeName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeName", "()Ljava/lang/String;", "TOO_RECENT_PURCHASE", "SUB_IS_ACTIVE", "EMPTY_OFFER_EXCEPTION", "EMPTY_BILLING_RECEIPT", "EMPTY_PURCHASES", "PURCHASE_TIMEOUT", "NOT_SIGNED_IN_BASE", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum ClientErrorType implements ErrorType {
        ;
        
        @NotNull
        private final String typeName;

        protected ClientErrorType(String str) {
            C2668g.b(str, "typeName");
            this.typeName = str;
        }

        @NotNull
        public String getTypeName() {
            return this.typeName;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseClientException$ActivityNotExtendingSignedInBase;", "Lcom/tinder/purchase/domain/exception/PurchaseClientException;", "activityName", "", "(Ljava/lang/String;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException$ErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseLoggableException$ErrorType;", "message", "getMessage", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class ActivityNotExtendingSignedInBase extends PurchaseClientException {
        @NotNull
        /* renamed from: a */
        private final ErrorType f55574a = ClientErrorType.NOT_SIGNED_IN_BASE;
        @NotNull
        /* renamed from: b */
        private final String f55575b;

        public ActivityNotExtendingSignedInBase(@NotNull String str) {
            C2668g.b(str, "activityName");
            super();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Activity where purchase was attempted is not extending ");
            stringBuilder.append("ActivitySignedInBase. Instead, it was extending ");
            stringBuilder.append(str);
            this.f55575b = stringBuilder.toString();
        }

        @NotNull
        /* renamed from: e */
        public ErrorType mo11824e() {
            return this.f55574a;
        }

        @NotNull
        public String getMessage() {
            return this.f55575b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseClientException$EmptyBillingReceiptException;", "Lcom/tinder/purchase/domain/exception/PurchaseClientException;", "productId", "", "(Ljava/lang/String;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseClientException$ClientErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseClientException$ClientErrorType;", "message", "getMessage", "()Ljava/lang/String;", "getProductId", "setProductId", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class EmptyBillingReceiptException extends PurchaseClientException {
        @NotNull
        /* renamed from: a */
        private final String f55576a;
        @NotNull
        /* renamed from: b */
        private final ClientErrorType f55577b = ClientErrorType.EMPTY_BILLING_RECEIPT;
        @Nullable
        /* renamed from: c */
        private String f55578c;

        public EmptyBillingReceiptException(@Nullable String str) {
            super();
            this.f55578c = str;
            str = new StringBuilder();
            str.append("Billing receipt for ");
            str.append(mo11825f());
            str.append(" was null");
            this.f55576a = str.toString();
        }

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65056h();
        }

        @Nullable
        /* renamed from: f */
        public String mo11825f() {
            return this.f55578c;
        }

        @NotNull
        public String getMessage() {
            return this.f55576a;
        }

        @NotNull
        /* renamed from: h */
        public ClientErrorType m65056h() {
            return this.f55577b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseClientException$EmptyOfferException;", "Lcom/tinder/purchase/domain/exception/PurchaseClientException;", "productId", "", "(Ljava/lang/String;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseClientException$ClientErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseClientException$ClientErrorType;", "message", "getMessage", "()Ljava/lang/String;", "getProductId", "setProductId", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class EmptyOfferException extends PurchaseClientException {
        @NotNull
        /* renamed from: a */
        private final String f55579a;
        @NotNull
        /* renamed from: b */
        private final ClientErrorType f55580b = ClientErrorType.EMPTY_OFFER_EXCEPTION;
        @Nullable
        /* renamed from: c */
        private String f55581c;

        public EmptyOfferException(@Nullable String str) {
            super();
            this.f55581c = str;
            str = new StringBuilder();
            str.append("Offer for ");
            str.append(mo11825f());
            str.append(" is null");
            this.f55579a = str.toString();
        }

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65059h();
        }

        @Nullable
        /* renamed from: f */
        public String mo11825f() {
            return this.f55581c;
        }

        @NotNull
        public String getMessage() {
            return this.f55579a;
        }

        @NotNull
        /* renamed from: h */
        public ClientErrorType m65059h() {
            return this.f55580b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseClientException$EmptyPurchasesException;", "Lcom/tinder/purchase/domain/exception/PurchaseClientException;", "()V", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseClientException$ClientErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseClientException$ClientErrorType;", "message", "", "getMessage", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class EmptyPurchasesException extends PurchaseClientException {
        @NotNull
        /* renamed from: a */
        private final String f55582a = "There are no purchases to restore";
        @NotNull
        /* renamed from: b */
        private final ClientErrorType f55583b = ClientErrorType.EMPTY_PURCHASES;

        public EmptyPurchasesException() {
            super();
        }

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65061h();
        }

        @NotNull
        public String getMessage() {
            return this.f55582a;
        }

        @NotNull
        /* renamed from: h */
        public ClientErrorType m65061h() {
            return this.f55583b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseClientException$PurchaseTimeoutException;", "Lcom/tinder/purchase/domain/exception/PurchaseClientException;", "responseBody", "", "source", "(Ljava/lang/String;Ljava/lang/String;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseClientException$ClientErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseClientException$ClientErrorType;", "message", "getMessage", "()Ljava/lang/String;", "getResponseBody", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class PurchaseTimeoutException extends PurchaseClientException {
        @NotNull
        /* renamed from: a */
        private final String f55584a;
        @NotNull
        /* renamed from: b */
        private final ClientErrorType f55585b = ClientErrorType.PURCHASE_TIMEOUT;
        @Nullable
        /* renamed from: c */
        private final String f55586c;

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65063h();
        }

        @Nullable
        /* renamed from: i */
        public String mo11826i() {
            return this.f55586c;
        }

        public PurchaseTimeoutException(@Nullable String str, @Nullable String str2) {
            super();
            this.f55586c = str;
            str = new StringBuilder();
            str.append("Timed out while waiting for receipt from Google Play ");
            str.append("during ");
            str.append(str2);
            this.f55584a = str.toString();
        }

        @NotNull
        public String getMessage() {
            return this.f55584a;
        }

        @NotNull
        /* renamed from: h */
        public ClientErrorType m65063h() {
            return this.f55585b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseClientException$SubscriptionIsActiveException;", "Lcom/tinder/purchase/domain/exception/PurchaseClientException;", "productId", "", "(Ljava/lang/String;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseClientException$ClientErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseClientException$ClientErrorType;", "message", "getMessage", "()Ljava/lang/String;", "getProductId", "setProductId", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class SubscriptionIsActiveException extends PurchaseClientException {
        @NotNull
        /* renamed from: a */
        private final String f55587a;
        @NotNull
        /* renamed from: b */
        private final ClientErrorType f55588b = ClientErrorType.SUB_IS_ACTIVE;
        @Nullable
        /* renamed from: c */
        private String f55589c;

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65067h();
        }

        @Nullable
        /* renamed from: f */
        public String mo11825f() {
            return this.f55589c;
        }

        public SubscriptionIsActiveException(@Nullable String str) {
            super();
            this.f55589c = str;
            str = new StringBuilder();
            str.append("Try to ");
            str.append(mo11825f());
            str.append(" when a subscription is already active");
            this.f55587a = str.toString();
        }

        @NotNull
        public String getMessage() {
            return this.f55587a;
        }

        @NotNull
        /* renamed from: h */
        public ClientErrorType m65067h() {
            return this.f55588b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseClientException$TooRecentPurchaseException;", "Lcom/tinder/purchase/domain/exception/PurchaseClientException;", "productId", "", "errorSku", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorSku", "()Ljava/lang/String;", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseClientException$ClientErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseClientException$ClientErrorType;", "message", "getMessage", "getProductId", "setProductId", "(Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class TooRecentPurchaseException extends PurchaseClientException {
        @NotNull
        /* renamed from: a */
        private final String f55590a;
        @NotNull
        /* renamed from: b */
        private final ClientErrorType f55591b = ClientErrorType.TOO_RECENT_PURCHASE;
        @Nullable
        /* renamed from: c */
        private String f55592c;
        @Nullable
        /* renamed from: d */
        private final String f55593d;

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65070h();
        }

        @Nullable
        /* renamed from: f */
        public String mo11825f() {
            return this.f55592c;
        }

        @Nullable
        /* renamed from: j */
        public String mo13496j() {
            return this.f55593d;
        }

        public TooRecentPurchaseException(@Nullable String str, @Nullable String str2) {
            super();
            this.f55592c = str;
            this.f55593d = str2;
            str = new StringBuilder();
            str.append("Cannot purchase the same subscription within 24 hours for a single account. ");
            str.append("old sub = ");
            str.append(mo13496j());
            str.append("; new sub = ");
            str.append(mo11825f());
            this.f55590a = str.toString();
        }

        @NotNull
        public String getMessage() {
            return this.f55590a;
        }

        @NotNull
        /* renamed from: h */
        public ClientErrorType m65070h() {
            return this.f55591b;
        }
    }

    private PurchaseClientException() {
        this.f50472a = Domain.CLIENT;
        this.f50473b = "ClientError";
    }

    @NotNull
    /* renamed from: a */
    public Domain mo11820a() {
        return this.f50472a;
    }

    @NotNull
    /* renamed from: b */
    public String mo11821b() {
        return this.f50473b;
    }
}
