package com.tinder.purchase.domain.exception;

import com.tinder.api.model.purchase.PurchaseLog.Domain;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18464j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00102\u00020\u0001:\f\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fXD¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0001\n\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, d2 = {"Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException;", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException;", "errorCode", "", "(I)V", "getErrorCode", "()Ljava/lang/Integer;", "errorDomain", "Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "getErrorDomain", "()Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "errorNamespace", "", "getErrorNamespace", "()Ljava/lang/String;", "BillingUnavailableException", "Companion", "DeveloperBillingException", "ErrorType", "FeatureNotSupportedException", "ItemAlreadyOwnedException", "ItemNotOwnedException", "ItemUnavailableException", "ProcessorNotInitializedException", "ServiceUnavailableException", "UnknownBillingException", "UserCancelledPurchaseException", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$UserCancelledPurchaseException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ServiceUnavailableException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$BillingUnavailableException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ItemUnavailableException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$DeveloperBillingException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ItemAlreadyOwnedException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ItemNotOwnedException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ProcessorNotInitializedException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$FeatureNotSupportedException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$UnknownBillingException;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class GooglePurchaseBillingException extends PurchaseLoggableException {
    /* renamed from: a */
    public static final C14492a f50461a = new C14492a();
    @NotNull
    /* renamed from: b */
    private final Domain f50462b;
    @NotNull
    /* renamed from: c */
    private final String f50463c;
    /* renamed from: d */
    private final int f50464d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\n"}, d2 = {"Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$Companion;", "", "()V", "fromErrorCode", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException;", "errorCode", "", "skuType", "", "productId", "domain_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.domain.exception.GooglePurchaseBillingException$a */
    public static final class C14492a {
        private C14492a() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public static /* synthetic */ GooglePurchaseBillingException m55340a(C14492a c14492a, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 2) != null) {
                str = null;
            }
            if ((i2 & 4) != 0) {
                str2 = null;
            }
            return c14492a.m55341a(i, str, str2);
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final GooglePurchaseBillingException m55341a(int i, @Nullable String str, @Nullable String str2) {
            switch (ErrorType.Companion.m55339a(i)) {
                case USER_CANCELLED:
                    return (GooglePurchaseBillingException) new UserCancelledPurchaseException(str2, str);
                case SERVICE_UNAVAILABLE:
                    return (GooglePurchaseBillingException) new ServiceUnavailableException();
                case BILLING_UNAVAILABLE:
                    return (GooglePurchaseBillingException) new BillingUnavailableException();
                case ITEM_UNAVAILABLE:
                    return (GooglePurchaseBillingException) new ItemUnavailableException(str2, str);
                case DEVELOPER_ERROR:
                    return (GooglePurchaseBillingException) new DeveloperBillingException(str2, str);
                case ITEM_ALREADY_OWNED:
                    return (GooglePurchaseBillingException) new ItemAlreadyOwnedException(str2, str);
                case ITEM_NOT_OWNED:
                    return (GooglePurchaseBillingException) new ItemNotOwnedException(str2, str);
                case PROCESSOR_NOT_INIT:
                    return (GooglePurchaseBillingException) new ProcessorNotInitializedException();
                case FEATURE_NOT_SUPPORTED:
                    return (GooglePurchaseBillingException) new FeatureNotSupportedException(str);
                case UNKNOWN:
                    return new UnknownBillingException(str2, str, i);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0016B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException$ErrorType;", "typeName", "", "errorCode", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getErrorCode", "()I", "getTypeName", "()Ljava/lang/String;", "USER_CANCELLED", "SERVICE_UNAVAILABLE", "BILLING_UNAVAILABLE", "ITEM_UNAVAILABLE", "DEVELOPER_ERROR", "ITEM_ALREADY_OWNED", "ITEM_NOT_OWNED", "PROCESSOR_NOT_INIT", "FEATURE_NOT_SUPPORTED", "UNKNOWN", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum ErrorType implements com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType {
        ;
        
        public static final C14491a Companion = null;
        private static final Map<Integer, ErrorType> map = null;
        private final int errorCode;
        @NotNull
        private final String typeName;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType$Companion;", "", "()V", "map", "", "", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "fromErrorCode", "errorCode", "domain_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.purchase.domain.exception.GooglePurchaseBillingException$ErrorType$a */
        public static final class C14491a {
            private C14491a() {
            }

            @JvmStatic
            @NotNull
            /* renamed from: a */
            public final ErrorType m55339a(int i) {
                ErrorType errorType = (ErrorType) ErrorType.map.get(Integer.valueOf(i));
                return errorType != null ? errorType : ErrorType.UNKNOWN;
            }
        }

        @JvmStatic
        @NotNull
        public static final ErrorType fromErrorCode(int i) {
            return Companion.m55339a(i);
        }

        protected ErrorType(String str, int i) {
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
            Companion = new C14491a();
            ErrorType[] values = values();
            Map linkedHashMap = new LinkedHashMap(C18464j.m66926c(ah.m66883a(values.length), 16));
            int length = values.length;
            int i;
            while (i < length) {
                ErrorType errorType = values[i];
                linkedHashMap.put(Integer.valueOf(errorType.errorCode), errorType);
                i++;
            }
            map = linkedHashMap;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$BillingUnavailableException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException;", "()V", "exceptionType", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "message", "", "getMessage", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class BillingUnavailableException extends GooglePurchaseBillingException {
        @NotNull
        /* renamed from: b */
        private final String f55545b = "Billing API version is not supported for the type requested";
        @NotNull
        /* renamed from: c */
        private final ErrorType f55546c = ErrorType.BILLING_UNAVAILABLE;

        public BillingUnavailableException() {
            super(3);
        }

        /* renamed from: e */
        public /* synthetic */ com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType mo11824e() {
            return m65025d();
        }

        @NotNull
        public String getMessage() {
            return this.f55545b;
        }

        @NotNull
        /* renamed from: d */
        public ErrorType m65025d() {
            return this.f55546c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$DeveloperBillingException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException;", "productId", "", "skuType", "(Ljava/lang/String;Ljava/lang/String;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "message", "getMessage", "()Ljava/lang/String;", "getProductId", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class DeveloperBillingException extends GooglePurchaseBillingException {
        @NotNull
        /* renamed from: b */
        private final String f55547b;
        @NotNull
        /* renamed from: c */
        private final ErrorType f55548c = ErrorType.DEVELOPER_ERROR;
        @Nullable
        /* renamed from: d */
        private final String f55549d;

        /* renamed from: e */
        public /* synthetic */ com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType mo11824e() {
            return m65027d();
        }

        @Nullable
        /* renamed from: f */
        public String mo11825f() {
            return this.f55549d;
        }

        public DeveloperBillingException(@Nullable String str, @Nullable String str2) {
            super(5);
            this.f55549d = str;
            str = new StringBuilder();
            str.append("Invalid argument for productId: ");
            str.append(mo11825f());
            str.append(' ');
            str.append("with skuType: ");
            str.append(str2);
            str.append(", provided to the Google Billing API.");
            this.f55547b = str.toString();
        }

        @NotNull
        public String getMessage() {
            return this.f55547b;
        }

        @NotNull
        /* renamed from: d */
        public ErrorType m65027d() {
            return this.f55548c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$FeatureNotSupportedException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException;", "skuType", "", "(Ljava/lang/String;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "message", "getMessage", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class FeatureNotSupportedException extends GooglePurchaseBillingException {
        @NotNull
        /* renamed from: b */
        private final String f55550b;
        @NotNull
        /* renamed from: c */
        private final ErrorType f55551c = ErrorType.PROCESSOR_NOT_INIT;

        /* renamed from: e */
        public /* synthetic */ com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType mo11824e() {
            return m65030d();
        }

        public FeatureNotSupportedException(@Nullable String str) {
            super(-2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Feature not supported for skuType: ");
            stringBuilder.append(str);
            this.f55550b = stringBuilder.toString();
        }

        @NotNull
        public String getMessage() {
            return this.f55550b;
        }

        @NotNull
        /* renamed from: d */
        public ErrorType m65030d() {
            return this.f55551c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ItemAlreadyOwnedException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException;", "productId", "", "skuType", "(Ljava/lang/String;Ljava/lang/String;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "message", "getMessage", "()Ljava/lang/String;", "getProductId", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class ItemAlreadyOwnedException extends GooglePurchaseBillingException {
        @NotNull
        /* renamed from: b */
        private final String f55552b;
        @NotNull
        /* renamed from: c */
        private final ErrorType f55553c = ErrorType.ITEM_ALREADY_OWNED;
        @Nullable
        /* renamed from: d */
        private final String f55554d;

        /* renamed from: e */
        public /* synthetic */ com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType mo11824e() {
            return m65032d();
        }

        @Nullable
        /* renamed from: f */
        public String mo11825f() {
            return this.f55554d;
        }

        public ItemAlreadyOwnedException(@Nullable String str, @Nullable String str2) {
            super(7);
            this.f55554d = str;
            str = new StringBuilder();
            str.append("Failed to purchase since ");
            str.append(mo11825f());
            str.append(" with skuType: ");
            str.append(str2);
            str.append(" is already owned");
            this.f55552b = str.toString();
        }

        @NotNull
        public String getMessage() {
            return this.f55552b;
        }

        @NotNull
        /* renamed from: d */
        public ErrorType m65032d() {
            return this.f55553c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ItemNotOwnedException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException;", "productId", "", "skuType", "(Ljava/lang/String;Ljava/lang/String;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "message", "getMessage", "()Ljava/lang/String;", "getProductId", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class ItemNotOwnedException extends GooglePurchaseBillingException {
        @NotNull
        /* renamed from: b */
        private final String f55555b;
        @NotNull
        /* renamed from: c */
        private final ErrorType f55556c = ErrorType.ITEM_NOT_OWNED;
        @Nullable
        /* renamed from: d */
        private final String f55557d;

        /* renamed from: e */
        public /* synthetic */ com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType mo11824e() {
            return m65035d();
        }

        @Nullable
        /* renamed from: f */
        public String mo11825f() {
            return this.f55557d;
        }

        public ItemNotOwnedException(@Nullable String str, @Nullable String str2) {
            super(8);
            this.f55557d = str;
            str = new StringBuilder();
            str.append("Failed to consume since ");
            str.append(mo11825f());
            str.append(" with skuType: ");
            str.append(str2);
            str.append(" is not owned");
            this.f55555b = str.toString();
        }

        @NotNull
        public String getMessage() {
            return this.f55555b;
        }

        @NotNull
        /* renamed from: d */
        public ErrorType m65035d() {
            return this.f55556c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ItemUnavailableException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException;", "productId", "", "skuType", "(Ljava/lang/String;Ljava/lang/String;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "message", "getMessage", "()Ljava/lang/String;", "getProductId", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class ItemUnavailableException extends GooglePurchaseBillingException {
        @NotNull
        /* renamed from: b */
        private final String f55558b;
        @NotNull
        /* renamed from: c */
        private final ErrorType f55559c = ErrorType.ITEM_UNAVAILABLE;
        @Nullable
        /* renamed from: d */
        private final String f55560d;

        /* renamed from: e */
        public /* synthetic */ com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType mo11824e() {
            return m65038d();
        }

        @Nullable
        /* renamed from: f */
        public String mo11825f() {
            return this.f55560d;
        }

        public ItemUnavailableException(@Nullable String str, @Nullable String str2) {
            super(4);
            this.f55560d = str;
            str = new StringBuilder();
            str.append("");
            str.append(mo11825f());
            str.append(" for skuType: ");
            str.append(str2);
            str.append(", not available for purchase");
            this.f55558b = str.toString();
        }

        @NotNull
        public String getMessage() {
            return this.f55558b;
        }

        @NotNull
        /* renamed from: d */
        public ErrorType m65038d() {
            return this.f55559c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ProcessorNotInitializedException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException;", "()V", "exceptionType", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "message", "", "getMessage", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class ProcessorNotInitializedException extends GooglePurchaseBillingException {
        @NotNull
        /* renamed from: b */
        private final String f55561b = "Billing Processor is not initialized";
        @NotNull
        /* renamed from: c */
        private final ErrorType f55562c = ErrorType.PROCESSOR_NOT_INIT;

        public ProcessorNotInitializedException() {
            super(-1);
        }

        /* renamed from: e */
        public /* synthetic */ com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType mo11824e() {
            return m65041d();
        }

        @NotNull
        public String getMessage() {
            return this.f55561b;
        }

        @NotNull
        /* renamed from: d */
        public ErrorType m65041d() {
            return this.f55562c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ServiceUnavailableException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException;", "()V", "exceptionType", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "message", "", "getMessage", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class ServiceUnavailableException extends GooglePurchaseBillingException {
        @NotNull
        /* renamed from: b */
        private final String f55563b = "Google billing service is not available";
        @NotNull
        /* renamed from: c */
        private final ErrorType f55564c = ErrorType.SERVICE_UNAVAILABLE;

        public ServiceUnavailableException() {
            super(2);
        }

        /* renamed from: e */
        public /* synthetic */ com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType mo11824e() {
            return m65043d();
        }

        @NotNull
        public String getMessage() {
            return this.f55563b;
        }

        @NotNull
        /* renamed from: d */
        public ErrorType m65043d() {
            return this.f55564c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$UnknownBillingException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException;", "productId", "", "skuType", "errorCode", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "message", "getMessage", "()Ljava/lang/String;", "getProductId", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class UnknownBillingException extends GooglePurchaseBillingException {
        @NotNull
        /* renamed from: b */
        private final String f55565b;
        @NotNull
        /* renamed from: c */
        private final ErrorType f55566c = ErrorType.UNKNOWN;
        @Nullable
        /* renamed from: d */
        private final String f55567d;

        /* renamed from: e */
        public /* synthetic */ com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType mo11824e() {
            return m65045d();
        }

        @Nullable
        /* renamed from: f */
        public String mo11825f() {
            return this.f55567d;
        }

        public UnknownBillingException(@Nullable String str, @Nullable String str2, int i) {
            super(6);
            this.f55567d = str;
            str = new StringBuilder();
            str.append("Unknown error with Google Billing Processor when ");
            str.append("requesting ");
            str.append(mo11825f());
            str.append(" for skuType: ");
            str.append(str2);
            str.append(". Error code: ");
            str.append(i);
            this.f55565b = str.toString();
        }

        @NotNull
        public String getMessage() {
            return this.f55565b;
        }

        @NotNull
        /* renamed from: d */
        public ErrorType m65045d() {
            return this.f55566c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000fXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$UserCancelledPurchaseException;", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException;", "productId", "", "skuType", "(Ljava/lang/String;Ljava/lang/String;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/GooglePurchaseBillingException$ErrorType;", "message", "getMessage", "()Ljava/lang/String;", "getProductId", "shouldLog", "", "getShouldLog", "()Z", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class UserCancelledPurchaseException extends GooglePurchaseBillingException {
        /* renamed from: b */
        private final boolean f55568b;
        @NotNull
        /* renamed from: c */
        private final String f55569c;
        @NotNull
        /* renamed from: d */
        private final ErrorType f55570d = ErrorType.USER_CANCELLED;
        @Nullable
        /* renamed from: e */
        private final String f55571e;

        /* renamed from: e */
        public /* synthetic */ com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType mo11824e() {
            return m65050g();
        }

        @Nullable
        /* renamed from: f */
        public String mo11825f() {
            return this.f55571e;
        }

        public UserCancelledPurchaseException(@Nullable String str, @Nullable String str2) {
            super(1);
            this.f55571e = str;
            str = new StringBuilder();
            str.append("User canceled the payment dialog while attempting to ");
            str.append("purchase ");
            str.append(mo11825f());
            str.append(" for skuType: ");
            str.append(str2);
            this.f55569c = str.toString();
        }

        public boolean v_() {
            return this.f55568b;
        }

        @NotNull
        public String getMessage() {
            return this.f55569c;
        }

        @NotNull
        /* renamed from: g */
        public ErrorType m65050g() {
            return this.f55570d;
        }
    }

    private GooglePurchaseBillingException(int i) {
        this.f50464d = i;
        this.f50462b = Domain.STORE;
        this.f50463c = "BillingError";
    }

    @NotNull
    /* renamed from: c */
    public Integer mo11822c() {
        return Integer.valueOf(this.f50464d);
    }

    @NotNull
    /* renamed from: a */
    public Domain mo11820a() {
        return this.f50462b;
    }

    @NotNull
    /* renamed from: b */
    public String mo11821b() {
        return this.f50463c;
    }
}
