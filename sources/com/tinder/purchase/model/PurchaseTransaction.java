package com.tinder.purchase.model;

import com.tinder.api.model.purchase.BillingReceipt;
import java.util.Date;

public class PurchaseTransaction {
    /* renamed from: a */
    private String f45923a;
    /* renamed from: b */
    private Date f45924b;
    /* renamed from: c */
    private State f45925c = State.CANCELED;
    /* renamed from: d */
    private String f45926d;
    /* renamed from: e */
    private BillingReceipt f45927e;

    public enum State {
        PURCHASED_SUCCESSFULLY(0),
        CANCELED(1),
        REFUNDED(2),
        SUBSCRIPTION_EXPIRED(3);
        
        int purchaseState;

        private State(int i) {
            this.purchaseState = i;
        }

        public static State fromPurchaseState(int i) {
            for (State state : values()) {
                if (state.purchaseState == i) {
                    return state;
                }
            }
            return CANCELED;
        }
    }

    PurchaseTransaction(String str, Date date, State state, String str2, BillingReceipt billingReceipt) {
        this.f45923a = str;
        this.f45924b = date;
        this.f45925c = state;
        this.f45926d = str2;
        this.f45927e = billingReceipt;
    }

    /* renamed from: a */
    public String m55481a() {
        return this.f45923a;
    }

    /* renamed from: b */
    public Date m55482b() {
        return this.f45924b;
    }

    /* renamed from: c */
    public State m55483c() {
        return this.f45925c;
    }

    /* renamed from: d */
    public String m55484d() {
        return this.f45926d;
    }

    /* renamed from: e */
    public BillingReceipt m55485e() {
        return this.f45927e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Purchase Transaction { productId: ");
        stringBuilder.append(this.f45923a);
        stringBuilder.append(" purchaseDate: ");
        stringBuilder.append(this.f45924b);
        stringBuilder.append(" purchaseState: ");
        stringBuilder.append(this.f45925c);
        return stringBuilder.toString();
    }
}
