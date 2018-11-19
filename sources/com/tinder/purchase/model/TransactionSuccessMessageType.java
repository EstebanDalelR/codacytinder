package com.tinder.purchase.model;

import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.model.Transaction.SuccessMessageType;
import com.tinder.purchase.register.p378a.p379a.C14537a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/tinder/purchase/model/TransactionSuccessMessageType;", "", "Lcom/tinder/purchase/domain/model/Transaction$SuccessMessageType;", "messageRes", "", "(Ljava/lang/String;II)V", "getMessageRes", "()I", "getSuccessMessageRes", "GOLD_RESTORE_SUCCESS", "PLUS_RESTORE_SUCCESS", "GENERIC_RESTORE_SUCCESS", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public enum TransactionSuccessMessageType implements SuccessMessageType {
    ;
    
    public static final C14524a Companion = null;
    private final int messageRes;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/tinder/purchase/model/TransactionSuccessMessageType$Companion;", "", "()V", "fromOffer", "Lcom/tinder/purchase/domain/model/Transaction$SuccessMessageType;", "productId", "", "offer", "Lcom/tinder/purchase/domain/model/Offer;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.model.TransactionSuccessMessageType$a */
    public static final class C14524a {
        private C14524a() {
        }

        @NotNull
        /* renamed from: a */
        public final SuccessMessageType m55486a(@NotNull String str, @Nullable C14510e c14510e) {
            C2668g.b(str, "productId");
            if (c14510e != null) {
                switch (C14535g.f45938a[c14510e.mo11840b().ordinal()]) {
                    case 1:
                        str = (SuccessMessageType) TransactionSuccessMessageType.GOLD_RESTORE_SUCCESS;
                        break;
                    case 2:
                        str = (SuccessMessageType) TransactionSuccessMessageType.PLUS_RESTORE_SUCCESS;
                        break;
                    default:
                        str = (SuccessMessageType) TransactionSuccessMessageType.GENERIC_RESTORE_SUCCESS;
                        break;
                }
                return str;
            } else if (C14537a.m55534a(str) != null) {
                return (SuccessMessageType) TransactionSuccessMessageType.PLUS_RESTORE_SUCCESS;
            } else {
                if (C14537a.m55535b(str) != null) {
                    return (SuccessMessageType) TransactionSuccessMessageType.GOLD_RESTORE_SUCCESS;
                }
                return (SuccessMessageType) TransactionSuccessMessageType.GENERIC_RESTORE_SUCCESS;
            }
        }
    }

    protected TransactionSuccessMessageType(int i) {
        this.messageRes = i;
    }

    public final int getMessageRes() {
        return this.messageRes;
    }

    static {
        Companion = new C14524a();
    }

    public int getSuccessMessageRes() {
        return this.messageRes;
    }
}
