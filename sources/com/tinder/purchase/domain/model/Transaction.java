package com.tinder.purchase.domain.model;

import com.tinder.purchase.domain.model.C16228d.C16227a;
import io.reactivex.annotations.NonNull;
import org.jetbrains.annotations.Nullable;

public abstract class Transaction {

    public enum Status {
        SUCCESS,
        FAILURE
    }

    public interface SuccessMessageType {
        int getSuccessMessageRes();
    }

    public enum Type {
        PURCHASE,
        RESTORE
    }

    /* renamed from: com.tinder.purchase.domain.model.Transaction$a */
    public static abstract class C14499a {
        /* renamed from: a */
        public abstract C14499a mo11871a(Status status);

        /* renamed from: a */
        public abstract C14499a mo11872a(SuccessMessageType successMessageType);

        /* renamed from: a */
        public abstract C14499a mo11873a(Type type);

        /* renamed from: a */
        public abstract C14499a mo11874a(TransactionFlowError transactionFlowError);

        /* renamed from: a */
        public abstract C14499a mo11875a(C14510e c14510e);

        /* renamed from: a */
        public abstract C14499a mo11876a(String str);

        /* renamed from: a */
        public abstract Transaction mo11877a();
    }

    @NonNull
    /* renamed from: a */
    public abstract Status mo11878a();

    @NonNull
    /* renamed from: b */
    public abstract Type mo11879b();

    @Nullable
    /* renamed from: c */
    public abstract TransactionFlowError mo11880c();

    @Nullable
    /* renamed from: d */
    public abstract String mo11881d();

    @Nullable
    /* renamed from: e */
    public abstract SuccessMessageType mo11882e();

    @Nullable
    /* renamed from: f */
    public abstract C14510e mo11883f();

    /* renamed from: g */
    public static C14499a m55362g() {
        return new C16227a();
    }
}
