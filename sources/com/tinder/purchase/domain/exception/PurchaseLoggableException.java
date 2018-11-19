package com.tinder.purchase.domain.exception;

import android.util.Log;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.purchase.PurchaseLog.Domain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19296q;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001&B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110%R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0014\u0010 \u001a\u00020!XD¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseLoggableException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "cause", "", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "errorDomain", "Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "getErrorDomain", "()Lcom/tinder/api/model/purchase/PurchaseLog$Domain;", "errorNamespace", "", "getErrorNamespace", "()Ljava/lang/String;", "errorSku", "getErrorSku", "exceptionType", "Lcom/tinder/purchase/domain/exception/PurchaseLoggableException$ErrorType;", "getExceptionType", "()Lcom/tinder/purchase/domain/exception/PurchaseLoggableException$ErrorType;", "productId", "getProductId", "receipt", "getReceipt", "responseBody", "getResponseBody", "shouldLog", "", "getShouldLog", "()Z", "errorStackTrace", "", "ErrorType", "domain_release"}, k = 1, mv = {1, 1, 10})
public abstract class PurchaseLoggableException extends RuntimeException {
    @Nullable
    /* renamed from: a */
    private final String f45877a;
    @Nullable
    /* renamed from: b */
    private final String f45878b;
    @Nullable
    /* renamed from: c */
    private final String f45879c;
    @Nullable
    /* renamed from: d */
    private final Integer f45880d;
    /* renamed from: e */
    private final boolean f45881e = true;
    @Nullable
    /* renamed from: f */
    private final String f45882f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/purchase/domain/exception/PurchaseLoggableException$ErrorType;", "", "typeName", "", "getTypeName", "()Ljava/lang/String;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public interface ErrorType {
        @NotNull
        String getTypeName();
    }

    @NotNull
    /* renamed from: a */
    public abstract Domain mo11820a();

    @NotNull
    /* renamed from: b */
    public abstract String mo11821b();

    @NotNull
    /* renamed from: e */
    public abstract ErrorType mo11824e();

    @Nullable
    /* renamed from: i */
    public String mo11826i() {
        return this.f45877a;
    }

    @Nullable
    /* renamed from: f */
    public String mo11825f() {
        return this.f45878b;
    }

    @Nullable
    public String w_() {
        return this.f45879c;
    }

    @Nullable
    /* renamed from: c */
    public Integer mo11822c() {
        return this.f45880d;
    }

    public boolean v_() {
        return this.f45881e;
    }

    @Nullable
    /* renamed from: j */
    public String mo13496j() {
        return this.f45882f;
    }

    public PurchaseLoggableException(@NotNull Throwable th) {
        C2668g.b(th, ManagerWebServices.PARAM_CAUSE);
        super(th);
    }

    @NotNull
    /* renamed from: k */
    public final List<String> m55350k() {
        String stackTraceString = Log.getStackTraceString(this);
        C2668g.a(stackTraceString, "fullStackTrace");
        List b = new Regex("[\\r\\n]+").m59922b(stackTraceString, 0);
        if (!b.isEmpty()) {
            ListIterator listIterator = b.listIterator(b.size());
            while (listIterator.hasPrevious()) {
                Object obj;
                if (((String) listIterator.previous()).length() == 0) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj == null) {
                    b = C19299w.m68820d((Iterable) b, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        b = C17554o.m64195a();
        Collection collection = b;
        if (collection == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
        }
        Object[] toArray = collection.toArray(new String[0]);
        if (toArray == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) toArray;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (arrayList.size() == 0) {
                arrayList.add(str);
            } else if (C19296q.m68678b(str, "Caused by: ", false, 2, null)) {
                arrayList.add(str);
            } else if (C19296q.m68678b(str, "\tat com.tinder", false, 2, null)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
