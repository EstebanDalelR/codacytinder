package com.tinder.purchase.domain.exception;

import com.tinder.api.model.purchase.PurchaseLog.Domain;
import com.tinder.purchase.domain.exception.PurchaseLoggableException.ErrorType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0000X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u0006!"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseHttpException;", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException;", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException$ErrorType;", "exception", "Lretrofit2/HttpException;", "productId", "", "receipt", "(Lretrofit2/HttpException;Ljava/lang/String;Ljava/lang/String;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/Integer;", "errorDomain", "Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "getErrorDomain", "()Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "errorNamespace", "getErrorNamespace", "()Ljava/lang/String;", "getException", "()Lretrofit2/HttpException;", "exceptionType", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseHttpException;", "message", "getMessage", "getProductId", "getReceipt", "responseBody", "getResponseBody", "typeName", "getTypeName", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class PurchaseHttpException extends PurchaseLoggableException implements ErrorType {
    @NotNull
    /* renamed from: a */
    private final PurchaseHttpException f50481a = ((PurchaseHttpException) this);
    @NotNull
    /* renamed from: b */
    private final Domain f50482b = Domain.HTTP;
    @NotNull
    /* renamed from: c */
    private final String f50483c = "HttpError";
    /* renamed from: d */
    private final int f50484d = this.f50488h.code();
    @Nullable
    /* renamed from: e */
    private final String f50485e = this.f50488h.message();
    @Nullable
    /* renamed from: f */
    private final String f50486f;
    @NotNull
    /* renamed from: g */
    private final String f50487g;
    @NotNull
    /* renamed from: h */
    private final HttpException f50488h;
    @Nullable
    /* renamed from: i */
    private final String f50489i;
    @Nullable
    /* renamed from: j */
    private final String f50490j;

    /* renamed from: e */
    public /* synthetic */ ErrorType mo11824e() {
        return m61198h();
    }

    @Nullable
    /* renamed from: f */
    public String mo11825f() {
        return this.f50489i;
    }

    @Nullable
    public String w_() {
        return this.f50490j;
    }

    public PurchaseHttpException(@org.jetbrains.annotations.NotNull retrofit2.HttpException r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = "exception";
        kotlin.jvm.internal.C2668g.b(r2, r0);
        r0 = r2;
        r0 = (java.lang.Throwable) r0;
        r1.<init>(r0);
        r1.f50488h = r2;
        r1.f50489i = r3;
        r1.f50490j = r4;
        r2 = r1;
        r2 = (com.tinder.purchase.domain.exception.PurchaseHttpException) r2;
        r1.f50481a = r2;
        r2 = com.tinder.api.model.purchase.PurchaseLog.Domain.HTTP;
        r1.f50482b = r2;
        r2 = "HttpError";
        r1.f50483c = r2;
        r2 = r1.f50488h;
        r2 = r2.code();
        r1.f50484d = r2;
        r2 = r1.f50488h;
        r2 = r2.message();
        r1.f50485e = r2;
        r2 = r1.f50488h;	 Catch:{ Throwable -> 0x0048 }
        r2 = r2.response();	 Catch:{ Throwable -> 0x0048 }
        r2 = r2.errorBody();	 Catch:{ Throwable -> 0x0048 }
        if (r2 == 0) goto L_0x0041;	 Catch:{ Throwable -> 0x0048 }
    L_0x003a:
        r2 = r2.string();	 Catch:{ Throwable -> 0x0048 }
        if (r2 == 0) goto L_0x0041;	 Catch:{ Throwable -> 0x0048 }
    L_0x0040:
        goto L_0x004e;	 Catch:{ Throwable -> 0x0048 }
    L_0x0041:
        r2 = r1.f50488h;	 Catch:{ Throwable -> 0x0048 }
        r2 = r2.message();	 Catch:{ Throwable -> 0x0048 }
        goto L_0x004e;
    L_0x0048:
        r2 = r1.f50488h;
        r2 = r2.message();
    L_0x004e:
        r1.f50486f = r2;
        r2 = "PurchaseHttpException";
        r1.f50487g = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.purchase.domain.exception.PurchaseHttpException.<init>(retrofit2.HttpException, java.lang.String, java.lang.String):void");
    }

    @NotNull
    /* renamed from: h */
    public PurchaseHttpException m61198h() {
        return this.f50481a;
    }

    @NotNull
    /* renamed from: a */
    public Domain mo11820a() {
        return this.f50482b;
    }

    @NotNull
    /* renamed from: b */
    public String mo11821b() {
        return this.f50483c;
    }

    @NotNull
    /* renamed from: c */
    public Integer mo11822c() {
        return Integer.valueOf(this.f50484d);
    }

    @Nullable
    public String getMessage() {
        return this.f50485e;
    }

    @Nullable
    /* renamed from: i */
    public String mo11826i() {
        return this.f50486f;
    }

    @NotNull
    public String getTypeName() {
        return this.f50487g;
    }
}
