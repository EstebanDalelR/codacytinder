package com.tinder.purchase.domain.exception;

import com.tinder.api.model.purchase.PurchaseLog.Domain;
import com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0000X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseGenericException;", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException;", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException$ErrorType;", "throwable", "", "productId", "", "receipt", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/String;)V", "errorDomain", "Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "getErrorDomain", "()Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "errorNamespace", "getErrorNamespace", "()Ljava/lang/String;", "exceptionType", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseGenericException;", "message", "getMessage", "getProductId", "getReceipt", "typeName", "getTypeName", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class PurchaseGenericException extends PurchaseLoggableException implements ErrorType {
    @NotNull
    /* renamed from: a */
    private final PurchaseGenericException f50474a = this;
    @NotNull
    /* renamed from: b */
    private final Domain f50475b = Domain.CLIENT;
    @NotNull
    /* renamed from: c */
    private final String f50476c;
    @NotNull
    /* renamed from: d */
    private final String f50477d;
    @NotNull
    /* renamed from: e */
    private final String f50478e;
    @Nullable
    /* renamed from: f */
    private final String f50479f;
    @Nullable
    /* renamed from: g */
    private final String f50480g;

    /* renamed from: e */
    public /* synthetic */ ErrorType mo11824e() {
        return m61192h();
    }

    @Nullable
    /* renamed from: f */
    public String mo11825f() {
        return this.f50479f;
    }

    @Nullable
    public String w_() {
        return this.f50480g;
    }

    public PurchaseGenericException(@NotNull Throwable th, @Nullable String str, @Nullable String str2) {
        C2668g.b(th, "throwable");
        super(th);
        this.f50479f = str;
        this.f50480g = str2;
        th = new StringBuilder();
        th.append("An error occurred while attempting to purchase ");
        th.append(mo11825f());
        this.f50476c = th.toString();
        this.f50477d = "UnknownError";
        this.f50478e = "PurchaseGenericException";
    }

    @NotNull
    /* renamed from: h */
    public PurchaseGenericException m61192h() {
        return this.f50474a;
    }

    @NotNull
    /* renamed from: a */
    public Domain mo11820a() {
        return this.f50475b;
    }

    @NotNull
    public String getMessage() {
        return this.f50476c;
    }

    @NotNull
    /* renamed from: b */
    public String mo11821b() {
        return this.f50477d;
    }

    @NotNull
    public String getTypeName() {
        return this.f50478e;
    }
}
