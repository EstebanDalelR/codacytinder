package com.tinder.purchase.domain.model;

import com.tinder.purchase.domain.model.Transaction.C14499a;
import com.tinder.purchase.domain.model.Transaction.Status;
import com.tinder.purchase.domain.model.Transaction.SuccessMessageType;
import com.tinder.purchase.domain.model.Transaction.Type;
import io.reactivex.annotations.NonNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.tinder.purchase.domain.model.d */
final class C16228d extends Transaction {
    /* renamed from: a */
    private final Status f50553a;
    /* renamed from: b */
    private final Type f50554b;
    /* renamed from: c */
    private final TransactionFlowError f50555c;
    /* renamed from: d */
    private final String f50556d;
    /* renamed from: e */
    private final SuccessMessageType f50557e;
    /* renamed from: f */
    private final C14510e f50558f;

    /* renamed from: com.tinder.purchase.domain.model.d$a */
    static final class C16227a extends C14499a {
        /* renamed from: a */
        private Status f50547a;
        /* renamed from: b */
        private Type f50548b;
        /* renamed from: c */
        private TransactionFlowError f50549c;
        /* renamed from: d */
        private String f50550d;
        /* renamed from: e */
        private SuccessMessageType f50551e;
        /* renamed from: f */
        private C14510e f50552f;

        C16227a() {
        }

        /* renamed from: a */
        public C14499a mo11871a(Status status) {
            this.f50547a = status;
            return this;
        }

        /* renamed from: a */
        public C14499a mo11873a(Type type) {
            this.f50548b = type;
            return this;
        }

        /* renamed from: a */
        public C14499a mo11874a(@Nullable TransactionFlowError transactionFlowError) {
            this.f50549c = transactionFlowError;
            return this;
        }

        /* renamed from: a */
        public C14499a mo11876a(@Nullable String str) {
            this.f50550d = str;
            return this;
        }

        /* renamed from: a */
        public C14499a mo11872a(@Nullable SuccessMessageType successMessageType) {
            this.f50551e = successMessageType;
            return this;
        }

        /* renamed from: a */
        public C14499a mo11875a(@Nullable C14510e c14510e) {
            this.f50552f = c14510e;
            return this;
        }

        /* renamed from: a */
        public Transaction mo11877a() {
            String str = "";
            if (this.f50547a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" status");
                str = stringBuilder.toString();
            }
            if (this.f50548b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" type");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16228d(this.f50547a, this.f50548b, this.f50549c, this.f50550d, this.f50551e, this.f50552f);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16228d(Status status, Type type, @Nullable TransactionFlowError transactionFlowError, @Nullable String str, @Nullable SuccessMessageType successMessageType, @Nullable C14510e c14510e) {
        this.f50553a = status;
        this.f50554b = type;
        this.f50555c = transactionFlowError;
        this.f50556d = str;
        this.f50557e = successMessageType;
        this.f50558f = c14510e;
    }

    @NonNull
    /* renamed from: a */
    public Status mo11878a() {
        return this.f50553a;
    }

    @NonNull
    /* renamed from: b */
    public Type mo11879b() {
        return this.f50554b;
    }

    @Nullable
    /* renamed from: c */
    public TransactionFlowError mo11880c() {
        return this.f50555c;
    }

    @Nullable
    /* renamed from: d */
    public String mo11881d() {
        return this.f50556d;
    }

    @Nullable
    /* renamed from: e */
    public SuccessMessageType mo11882e() {
        return this.f50557e;
    }

    @Nullable
    /* renamed from: f */
    public C14510e mo11883f() {
        return this.f50558f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Transaction{status=");
        stringBuilder.append(this.f50553a);
        stringBuilder.append(", type=");
        stringBuilder.append(this.f50554b);
        stringBuilder.append(", purchaseFlowError=");
        stringBuilder.append(this.f50555c);
        stringBuilder.append(", productId=");
        stringBuilder.append(this.f50556d);
        stringBuilder.append(", successMessageType=");
        stringBuilder.append(this.f50557e);
        stringBuilder.append(", offer=");
        stringBuilder.append(this.f50558f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.purchase.domain.model.Transaction;
        r2 = 0;
        if (r1 == 0) goto L_0x0082;
    L_0x0009:
        r5 = (com.tinder.purchase.domain.model.Transaction) r5;
        r1 = r4.f50553a;
        r3 = r5.mo11878a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0080;
    L_0x0017:
        r1 = r4.f50554b;
        r3 = r5.mo11879b();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0080;
    L_0x0023:
        r1 = r4.f50555c;
        if (r1 != 0) goto L_0x002e;
    L_0x0027:
        r1 = r5.mo11880c();
        if (r1 != 0) goto L_0x0080;
    L_0x002d:
        goto L_0x003a;
    L_0x002e:
        r1 = r4.f50555c;
        r3 = r5.mo11880c();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0080;
    L_0x003a:
        r1 = r4.f50556d;
        if (r1 != 0) goto L_0x0045;
    L_0x003e:
        r1 = r5.mo11881d();
        if (r1 != 0) goto L_0x0080;
    L_0x0044:
        goto L_0x0051;
    L_0x0045:
        r1 = r4.f50556d;
        r3 = r5.mo11881d();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0080;
    L_0x0051:
        r1 = r4.f50557e;
        if (r1 != 0) goto L_0x005c;
    L_0x0055:
        r1 = r5.mo11882e();
        if (r1 != 0) goto L_0x0080;
    L_0x005b:
        goto L_0x0068;
    L_0x005c:
        r1 = r4.f50557e;
        r3 = r5.mo11882e();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0080;
    L_0x0068:
        r1 = r4.f50558f;
        if (r1 != 0) goto L_0x0073;
    L_0x006c:
        r5 = r5.mo11883f();
        if (r5 != 0) goto L_0x0080;
    L_0x0072:
        goto L_0x0081;
    L_0x0073:
        r1 = r4.f50558f;
        r5 = r5.mo11883f();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0080;
    L_0x007f:
        goto L_0x0081;
    L_0x0080:
        r0 = 0;
    L_0x0081:
        return r0;
    L_0x0082:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.purchase.domain.model.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((this.f50553a.hashCode() ^ 1000003) * 1000003) ^ this.f50554b.hashCode()) * 1000003) ^ (this.f50555c == null ? 0 : this.f50555c.hashCode())) * 1000003) ^ (this.f50556d == null ? 0 : this.f50556d.hashCode())) * 1000003) ^ (this.f50557e == null ? 0 : this.f50557e.hashCode())) * 1000003;
        if (this.f50558f != null) {
            i = this.f50558f.hashCode();
        }
        return hashCode ^ i;
    }
}
