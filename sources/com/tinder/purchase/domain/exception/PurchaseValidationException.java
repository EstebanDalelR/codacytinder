package com.tinder.purchase.domain.exception;

import com.tinder.api.model.purchase.PurchaseLog.Domain;
import com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18464j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00112\u00020\u0001:\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB%\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u0001\b\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseValidationException;", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException;", "productId", "", "receipt", "responseBody", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "errorDomain", "Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "getErrorDomain", "()Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "errorNamespace", "getErrorNamespace", "()Ljava/lang/String;", "getProductId", "getReceipt", "getResponseBody", "Companion", "EmptyBackendReceiptResponse", "GenericValidationException", "IneligiblePurchaseException", "MaxRestoreAttemptsException", "PlatformMismatchException", "PurchaseDuplicateException", "PurchaseExpiredException", "PurchaseInUseException", "ValidationErrorType", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$MaxRestoreAttemptsException;", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$PurchaseExpiredException;", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$PurchaseInUseException;", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$IneligiblePurchaseException;", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$PurchaseDuplicateException;", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$PlatformMismatchException;", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$GenericValidationException;", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$EmptyBackendReceiptResponse;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class PurchaseValidationException extends PurchaseLoggableException {
    /* renamed from: a */
    public static final C14496a f50491a = new C14496a();
    @NotNull
    /* renamed from: b */
    private final Domain f50492b;
    @NotNull
    /* renamed from: c */
    private final String f50493c;
    @Nullable
    /* renamed from: d */
    private final String f50494d;
    @Nullable
    /* renamed from: e */
    private final String f50495e;
    @Nullable
    /* renamed from: f */
    private final String f50496f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\f"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseValidationException$Companion;", "", "()V", "getExceptionFromCode", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException;", "code", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "productId", "", "receipt", "responseBody", "errorSku", "domain_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.domain.exception.PurchaseValidationException$a */
    public static final class C14496a {
        private C14496a() {
        }

        @JvmStatic
        @NotNull
        @JvmOverloads
        /* renamed from: a */
        public static /* synthetic */ PurchaseValidationException m55353a(C14496a c14496a, ValidationErrorType validationErrorType, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 2) != null) {
                str = null;
            }
            String str5 = str;
            if ((i & 4) != null) {
                str2 = null;
            }
            String str6 = str2;
            if ((i & 8) != null) {
                str3 = null;
            }
            return c14496a.m55354a(validationErrorType, str5, str6, str3, (i & 16) != null ? str5 : str4);
        }

        @JvmStatic
        @NotNull
        @JvmOverloads
        /* renamed from: a */
        public final PurchaseValidationException m55354a(@NotNull ValidationErrorType validationErrorType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            C2668g.b(validationErrorType, "code");
            switch (C14498b.f45884a[validationErrorType.ordinal()]) {
                case 1:
                    return (PurchaseValidationException) new MaxRestoreAttemptsException(str, str3, str2, str4);
                case 2:
                    return (PurchaseValidationException) new PurchaseExpiredException(str, str2, str3, str4);
                case 3:
                    return (PurchaseValidationException) new PurchaseInUseException(str, str2, str3, str4);
                case 4:
                    return (PurchaseValidationException) new IneligiblePurchaseException(str, str2, str3, str4);
                case 5:
                    return (PurchaseValidationException) new PurchaseDuplicateException(str, str2, str3, str4);
                case 6:
                    return (PurchaseValidationException) new PlatformMismatchException(str, str2, str3);
                case 7:
                    return (PurchaseValidationException) new EmptyBackendReceiptResponse(str, str2);
                case 8:
                    return (PurchaseValidationException) new GenericValidationException(str, str2, str3, str4);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0012B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException$ErrorType;", "typeName", "", "code", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getTypeName", "MAX_RESTORE_ATTEMPTS", "PURCHASE_EXPIRED", "PURCHASE_IN_USE", "INELIGIBLE_PURCHASE", "PURCHASE_DUPLICATE", "PLATFORM_MISMATCH", "EMPTY_RECEIPT", "GENERIC", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum ValidationErrorType implements ErrorType {
        ;
        
        public static final C14495a Companion = null;
        private static final Map<String, ValidationErrorType> exceptionTypeMap = null;
        private static final Map<String, ValidationErrorType> map = null;
        @NotNull
        private final String code;
        @NotNull
        private final String typeName;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType$Companion;", "", "()V", "exceptionTypeMap", "", "", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "map", "getTypeFromErrorCode", "stringCode", "getTypeFromErrorName", "name", "domain_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.purchase.domain.exception.PurchaseValidationException$ValidationErrorType$a */
        public static final class C14495a {
            private C14495a() {
            }

            @JvmStatic
            @NotNull
            /* renamed from: a */
            public final ValidationErrorType m55351a(@NotNull String str) {
                C2668g.b(str, "stringCode");
                ValidationErrorType validationErrorType = (ValidationErrorType) ValidationErrorType.map.get(str);
                return validationErrorType != null ? validationErrorType : ValidationErrorType.GENERIC;
            }

            @JvmStatic
            @NotNull
            /* renamed from: b */
            public final ValidationErrorType m55352b(@NotNull String str) {
                C2668g.b(str, "name");
                ValidationErrorType validationErrorType = (ValidationErrorType) ValidationErrorType.exceptionTypeMap.get(str);
                return validationErrorType != null ? validationErrorType : ValidationErrorType.GENERIC;
            }
        }

        @JvmStatic
        @NotNull
        public static final ValidationErrorType getTypeFromErrorCode(@NotNull String str) {
            return Companion.m55351a(str);
        }

        @JvmStatic
        @NotNull
        public static final ValidationErrorType getTypeFromErrorName(@NotNull String str) {
            return Companion.m55352b(str);
        }

        protected ValidationErrorType(String str, String str2) {
            C2668g.b(str, "typeName");
            C2668g.b(str2, "code");
            this.typeName = str;
            this.code = str2;
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }

        @NotNull
        public String getTypeName() {
            return this.typeName;
        }

        static {
            Companion = new C14495a();
            ValidationErrorType[] values = values();
            Map linkedHashMap = new LinkedHashMap(C18464j.m66926c(ah.m66883a(values.length), 16));
            for (ValidationErrorType validationErrorType : values) {
                linkedHashMap.put(validationErrorType.code, validationErrorType);
            }
            map = linkedHashMap;
            values = values();
            Map linkedHashMap2 = new LinkedHashMap(C18464j.m66926c(ah.m66883a(values.length), 16));
            int length = values.length;
            int i;
            while (i < length) {
                ValidationErrorType validationErrorType2 = values[i];
                linkedHashMap2.put(validationErrorType2.getTypeName(), validationErrorType2);
                i++;
            }
            exceptionTypeMap = linkedHashMap2;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseValidationException$EmptyBackendReceiptResponse;", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException;", "productId", "", "receipt", "(Ljava/lang/String;Ljava/lang/String;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "message", "getMessage", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class EmptyBackendReceiptResponse extends PurchaseValidationException {
        @NotNull
        /* renamed from: b */
        private final ValidationErrorType f55594b = ValidationErrorType.EMPTY_RECEIPT;
        @NotNull
        /* renamed from: c */
        private final String f55595c;

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65073h();
        }

        public EmptyBackendReceiptResponse(@Nullable String str, @Nullable String str2) {
            super(str, str2, null);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Purchase with productId: ");
            stringBuilder.append(str);
            stringBuilder.append(" was validated but Receipt: ");
            stringBuilder.append(str2);
            stringBuilder.append(" is empty");
            this.f55595c = stringBuilder.toString();
        }

        @NotNull
        /* renamed from: h */
        public ValidationErrorType m65073h() {
            return this.f55594b;
        }

        @NotNull
        public String getMessage() {
            return this.f55595c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseValidationException$GenericValidationException;", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException;", "productId", "", "receipt", "responseBody", "errorSku", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorSku", "()Ljava/lang/String;", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "message", "getMessage", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class GenericValidationException extends PurchaseValidationException {
        @NotNull
        /* renamed from: b */
        private final ValidationErrorType f55596b = ValidationErrorType.GENERIC;
        @NotNull
        /* renamed from: c */
        private final String f55597c;
        @Nullable
        /* renamed from: d */
        private final String f55598d;

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65075h();
        }

        @Nullable
        /* renamed from: j */
        public String mo13496j() {
            return this.f55598d;
        }

        public GenericValidationException(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            super(str, str2, str3);
            this.f55598d = str4;
            str2 = new StringBuilder();
            str2.append("An error occurred while validating purchase for ");
            str2.append(str);
            this.f55597c = str2.toString();
        }

        @NotNull
        /* renamed from: h */
        public ValidationErrorType m65075h() {
            return this.f55596b;
        }

        @NotNull
        public String getMessage() {
            return this.f55597c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseValidationException$IneligiblePurchaseException;", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException;", "productId", "", "receipt", "responseBody", "errorSku", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorSku", "()Ljava/lang/String;", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "message", "getMessage", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class IneligiblePurchaseException extends PurchaseValidationException {
        @NotNull
        /* renamed from: b */
        private final ValidationErrorType f55599b = ValidationErrorType.INELIGIBLE_PURCHASE;
        @NotNull
        /* renamed from: c */
        private final String f55600c;
        @Nullable
        /* renamed from: d */
        private final String f55601d;

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65078h();
        }

        @Nullable
        /* renamed from: j */
        public String mo13496j() {
            return this.f55601d;
        }

        public IneligiblePurchaseException(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            super(str, str2, str3);
            this.f55601d = str4;
            str2 = new StringBuilder();
            str2.append("User is not allowed to purchase ");
            str2.append(str);
            this.f55600c = str2.toString();
        }

        @NotNull
        /* renamed from: h */
        public ValidationErrorType m65078h() {
            return this.f55599b;
        }

        @NotNull
        public String getMessage() {
            return this.f55600c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseValidationException$MaxRestoreAttemptsException;", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException;", "productId", "", "receiptId", "responseBody", "errorSku", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorSku", "()Ljava/lang/String;", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "message", "getMessage", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class MaxRestoreAttemptsException extends PurchaseValidationException {
        @NotNull
        /* renamed from: b */
        private final ValidationErrorType f55602b = ValidationErrorType.MAX_RESTORE_ATTEMPTS;
        @NotNull
        /* renamed from: c */
        private final String f55603c = "User has exceeded maximum number of restores possible";
        @Nullable
        /* renamed from: d */
        private final String f55604d;

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65081h();
        }

        @Nullable
        /* renamed from: j */
        public String mo13496j() {
            return this.f55604d;
        }

        public MaxRestoreAttemptsException(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            super(str, str2, str3);
            this.f55604d = str4;
        }

        @NotNull
        /* renamed from: h */
        public ValidationErrorType m65081h() {
            return this.f55602b;
        }

        @NotNull
        public String getMessage() {
            return this.f55603c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseValidationException$PlatformMismatchException;", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException;", "productId", "", "receiptId", "responseBody", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "message", "getMessage", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class PlatformMismatchException extends PurchaseValidationException {
        @NotNull
        /* renamed from: b */
        private final ValidationErrorType f55605b = ValidationErrorType.PLATFORM_MISMATCH;
        @NotNull
        /* renamed from: c */
        private final String f55606c = "Cannot use subscription purchased from another platform";

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65084h();
        }

        public PlatformMismatchException(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            super(str, str2, str3);
        }

        @NotNull
        /* renamed from: h */
        public ValidationErrorType m65084h() {
            return this.f55605b;
        }

        @NotNull
        public String getMessage() {
            return this.f55606c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseValidationException$PurchaseDuplicateException;", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException;", "productId", "", "receipt", "responseBody", "errorSku", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorSku", "()Ljava/lang/String;", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "message", "getMessage", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class PurchaseDuplicateException extends PurchaseValidationException {
        @NotNull
        /* renamed from: b */
        private final ValidationErrorType f55607b = ValidationErrorType.PURCHASE_DUPLICATE;
        @NotNull
        /* renamed from: c */
        private final String f55608c;
        @Nullable
        /* renamed from: d */
        private final String f55609d;

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65086h();
        }

        @Nullable
        /* renamed from: j */
        public String mo13496j() {
            return this.f55609d;
        }

        public PurchaseDuplicateException(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            super(str, str2, str3);
            this.f55609d = str4;
            str2 = new StringBuilder();
            str2.append("Attempting to purchase ");
            str2.append(str);
            str2.append(", but it is already owned");
            this.f55608c = str2.toString();
        }

        @NotNull
        /* renamed from: h */
        public ValidationErrorType m65086h() {
            return this.f55607b;
        }

        @NotNull
        public String getMessage() {
            return this.f55608c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseValidationException$PurchaseExpiredException;", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException;", "productId", "", "receipt", "responseBody", "errorSku", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorSku", "()Ljava/lang/String;", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "message", "getMessage", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class PurchaseExpiredException extends PurchaseValidationException {
        @NotNull
        /* renamed from: b */
        private final ValidationErrorType f55610b = ValidationErrorType.PURCHASE_EXPIRED;
        @NotNull
        /* renamed from: c */
        private final String f55611c;
        @Nullable
        /* renamed from: d */
        private final String f55612d;

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65089h();
        }

        @Nullable
        /* renamed from: j */
        public String mo13496j() {
            return this.f55612d;
        }

        public PurchaseExpiredException(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            super(str, str2, str3);
            this.f55612d = str4;
            str2 = new StringBuilder();
            str2.append("The purchase of ");
            str2.append(str);
            str2.append(" has already expired");
            this.f55611c = str2.toString();
        }

        @NotNull
        /* renamed from: h */
        public ValidationErrorType m65089h() {
            return this.f55610b;
        }

        @NotNull
        public String getMessage() {
            return this.f55611c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseValidationException$PurchaseInUseException;", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException;", "productId", "", "receipt", "responseBody", "errorSku", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrorSku", "()Ljava/lang/String;", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseValidationException$ValidationErrorType;", "message", "getMessage", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class PurchaseInUseException extends PurchaseValidationException {
        @NotNull
        /* renamed from: b */
        private final ValidationErrorType f55613b = ValidationErrorType.PURCHASE_IN_USE;
        @NotNull
        /* renamed from: c */
        private final String f55614c;
        @Nullable
        /* renamed from: d */
        private final String f55615d;

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65092h();
        }

        @Nullable
        /* renamed from: j */
        public String mo13496j() {
            return this.f55615d;
        }

        public PurchaseInUseException(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            super(str, str2, str3);
            this.f55615d = str4;
            str2 = new StringBuilder();
            str2.append("User's purchase of ");
            str2.append(str);
            str2.append(" is already in use by another account");
            this.f55614c = str2.toString();
        }

        @NotNull
        /* renamed from: h */
        public ValidationErrorType m65092h() {
            return this.f55613b;
        }

        @NotNull
        public String getMessage() {
            return this.f55614c;
        }
    }

    @JvmStatic
    @NotNull
    @JvmOverloads
    /* renamed from: a */
    public static final PurchaseValidationException m61200a(@NotNull ValidationErrorType validationErrorType, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        return C14496a.m55353a(f50491a, validationErrorType, str, str2, str3, null, 16, null);
    }

    @JvmStatic
    @NotNull
    @JvmOverloads
    /* renamed from: a */
    public static final PurchaseValidationException m61201a(@NotNull ValidationErrorType validationErrorType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return f50491a.m55354a(validationErrorType, str, str2, str3, str4);
    }

    @Nullable
    /* renamed from: f */
    public String mo11825f() {
        return this.f50494d;
    }

    @Nullable
    public String w_() {
        return this.f50495e;
    }

    @Nullable
    /* renamed from: i */
    public String mo11826i() {
        return this.f50496f;
    }

    private PurchaseValidationException(String str, String str2, String str3) {
        this.f50494d = str;
        this.f50495e = str2;
        this.f50496f = str3;
        this.f50492b = Domain.BACKEND;
        this.f50493c = "ValidationError";
    }

    @NotNull
    /* renamed from: a */
    public Domain mo11820a() {
        return this.f50492b;
    }

    @NotNull
    /* renamed from: b */
    public String mo11821b() {
        return this.f50493c;
    }
}
