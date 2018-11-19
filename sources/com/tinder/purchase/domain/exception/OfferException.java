package com.tinder.purchase.domain.exception;

import com.tinder.api.model.purchase.PurchaseLog.Domain;
import com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0001\u0001\r¨\u0006\u000e"}, d2 = {"Lcom/tinder/purchase/domain/exception/OfferException;", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException;", "()V", "errorDomain", "Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "getErrorDomain", "()Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "errorNamespace", "", "getErrorNamespace", "()Ljava/lang/String;", "CannotGetPriceFromSkuException", "OfferErrorType", "Lcom/tinder/purchase/domain/exception/OfferException$CannotGetPriceFromSkuException;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class OfferException extends PurchaseLoggableException {
    @NotNull
    /* renamed from: a */
    private final Domain f50465a;
    @NotNull
    /* renamed from: b */
    private final String f50466b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/purchase/domain/exception/OfferException$OfferErrorType;", "", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException$ErrorType;", "typeName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeName", "()Ljava/lang/String;", "SKU_PRICES", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum OfferErrorType implements ErrorType {
        ;
        
        @NotNull
        private final String typeName;

        protected OfferErrorType(String str) {
            C2668g.b(str, "typeName");
            this.typeName = str;
        }

        @NotNull
        public String getTypeName() {
            return this.typeName;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tinder/purchase/domain/exception/OfferException$CannotGetPriceFromSkuException;", "Lcom/tinder/purchase/domain/exception/OfferException;", "sku", "", "", "(Ljava/util/List;)V", "exceptionType", "Lcom/tinder/purchase/domain/exception/OfferException$OfferErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/OfferException$OfferErrorType;", "message", "getMessage", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class CannotGetPriceFromSkuException extends OfferException {
        @NotNull
        /* renamed from: a */
        private final OfferErrorType f55572a = OfferErrorType.SKU_PRICES;
        @NotNull
        /* renamed from: b */
        private final String f55573b;

        public CannotGetPriceFromSkuException(@NotNull List<String> list) {
            C2668g.b(list, "sku");
            super();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot get price from Google Play with SKUs: ");
            stringBuilder.append(list);
            this.f55573b = stringBuilder.toString();
        }

        /* renamed from: e */
        public /* synthetic */ ErrorType mo11824e() {
            return m65052g();
        }

        @NotNull
        /* renamed from: g */
        public OfferErrorType m65052g() {
            return this.f55572a;
        }

        @NotNull
        public String getMessage() {
            return this.f55573b;
        }
    }

    private OfferException() {
        this.f50465a = Domain.STORE;
        this.f50466b = "OfferError";
    }

    @NotNull
    /* renamed from: a */
    public Domain mo11820a() {
        return this.f50465a;
    }

    @NotNull
    /* renamed from: b */
    public String mo11821b() {
        return this.f50466b;
    }
}
