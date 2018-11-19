package com.tinder.purchase.domain.exception;

import com.tinder.api.model.purchase.PurchaseLog.Domain;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/tinder/purchase/domain/exception/StartPaywallFlowException;", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException;", "()V", "errorDomain", "Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "getErrorDomain", "()Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "errorNamespace", "", "getErrorNamespace", "()Ljava/lang/String;", "AlreadyOwnedException", "FeatureNotAvailableException", "PaywallFlowError", "Lcom/tinder/purchase/domain/exception/StartPaywallFlowException$FeatureNotAvailableException;", "Lcom/tinder/purchase/domain/exception/StartPaywallFlowException$AlreadyOwnedException;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class StartPaywallFlowException extends PurchaseLoggableException {
    @NotNull
    /* renamed from: a */
    private final Domain f50497a;
    @NotNull
    /* renamed from: b */
    private final String f50498b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tinder/purchase/domain/exception/StartPaywallFlowException$PaywallFlowError;", "", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException$ErrorType;", "typeName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeName", "()Ljava/lang/String;", "FEATURE_NOT_AVAIL", "ALREADY_OWNED", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum PaywallFlowError implements ErrorType {
        ;
        
        @NotNull
        private final String typeName;

        protected PaywallFlowError(String str) {
            C2668g.b(str, "typeName");
            this.typeName = str;
        }

        @NotNull
        public String getTypeName() {
            return this.typeName;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tinder/purchase/domain/exception/StartPaywallFlowException$AlreadyOwnedException;", "Lcom/tinder/purchase/domain/exception/StartPaywallFlowException;", "productType", "Lcom/tinder/domain/profile/model/ProductType;", "(Lcom/tinder/domain/profile/model/ProductType;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/StartPaywallFlowException$PaywallFlowError;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/StartPaywallFlowException$PaywallFlowError;", "message", "", "getMessage", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class AlreadyOwnedException extends StartPaywallFlowException {
        @NotNull
        /* renamed from: a */
        private final PaywallFlowError f55616a = PaywallFlowError.ALREADY_OWNED;
        @NotNull
        /* renamed from: b */
        private final String f55617b;

        public AlreadyOwnedException(@NotNull ProductType productType) {
            C2668g.b(productType, "productType");
            super();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trying to start ");
            stringBuilder.append(productType);
            stringBuilder.append(" paywall flow when the user already has ");
            stringBuilder.append(productType);
            this.f55617b = stringBuilder.toString();
        }

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65095h();
        }

        @NotNull
        /* renamed from: h */
        public PaywallFlowError m65095h() {
            return this.f55616a;
        }

        @NotNull
        public String getMessage() {
            return this.f55617b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tinder/purchase/domain/exception/StartPaywallFlowException$FeatureNotAvailableException;", "Lcom/tinder/purchase/domain/exception/StartPaywallFlowException;", "productType", "Lcom/tinder/domain/profile/model/ProductType;", "(Lcom/tinder/domain/profile/model/ProductType;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/StartPaywallFlowException$PaywallFlowError;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/StartPaywallFlowException$PaywallFlowError;", "message", "", "getMessage", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class FeatureNotAvailableException extends StartPaywallFlowException {
        @NotNull
        /* renamed from: a */
        private final PaywallFlowError f55618a = PaywallFlowError.FEATURE_NOT_AVAIL;
        @NotNull
        /* renamed from: b */
        private final String f55619b;

        public FeatureNotAvailableException(@NotNull ProductType productType) {
            C2668g.b(productType, "productType");
            super();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trying to start ");
            stringBuilder.append(productType);
            stringBuilder.append(" paywall flow but ");
            stringBuilder.append(productType);
            stringBuilder.append(" is not available.");
            this.f55619b = stringBuilder.toString();
        }

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65097h();
        }

        @NotNull
        /* renamed from: h */
        public PaywallFlowError m65097h() {
            return this.f55618a;
        }

        @NotNull
        public String getMessage() {
            return this.f55619b;
        }
    }

    private StartPaywallFlowException() {
        this.f50497a = Domain.CLIENT;
        this.f50498b = "ClientError";
    }

    @NotNull
    /* renamed from: a */
    public Domain mo11820a() {
        return this.f50497a;
    }

    @NotNull
    /* renamed from: b */
    public String mo11821b() {
        return this.f50498b;
    }
}
