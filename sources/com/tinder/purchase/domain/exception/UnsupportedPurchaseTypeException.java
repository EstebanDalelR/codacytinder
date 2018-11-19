package com.tinder.purchase.domain.exception;

import com.tinder.api.model.purchase.PurchaseLog.Domain;
import com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0003XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u0004\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/tinder/purchase/domain/exception/UnsupportedPurchaseTypeException;", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException;", "productId", "", "(Ljava/lang/String;)V", "errorDomain", "Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "getErrorDomain", "()Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "errorNamespace", "getErrorNamespace", "()Ljava/lang/String;", "getProductId", "setProductId", "UnsupportedProductIdException", "UnsupportedPurchaseType", "UnsupportedUpgradeTypeException", "Lcom/tinder/purchase/domain/exception/UnsupportedPurchaseTypeException$UnsupportedUpgradeTypeException;", "Lcom/tinder/purchase/domain/exception/UnsupportedPurchaseTypeException$UnsupportedProductIdException;", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class UnsupportedPurchaseTypeException extends PurchaseLoggableException {
    @NotNull
    /* renamed from: a */
    private final Domain f50499a;
    @NotNull
    /* renamed from: b */
    private final String f50500b;
    @Nullable
    /* renamed from: c */
    private String f50501c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tinder/purchase/domain/exception/UnsupportedPurchaseTypeException$UnsupportedPurchaseType;", "", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException$ErrorType;", "typeName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeName", "()Ljava/lang/String;", "UPGRADE", "PRODUCT_ID", "domain_release"}, k = 1, mv = {1, 1, 10})
    public enum UnsupportedPurchaseType implements ErrorType {
        ;
        
        @NotNull
        private final String typeName;

        protected UnsupportedPurchaseType(String str) {
            C2668g.b(str, "typeName");
            this.typeName = str;
        }

        @NotNull
        public String getTypeName() {
            return this.typeName;
        }
    }

    @Nullable
    /* renamed from: f */
    public String mo11825f() {
        return this.f50501c;
    }

    @NotNull
    /* renamed from: a */
    public Domain mo11820a() {
        return this.f50499a;
    }

    @NotNull
    /* renamed from: b */
    public String mo11821b() {
        return this.f50500b;
    }
}
