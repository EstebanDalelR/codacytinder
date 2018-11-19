package com.tinder.purchase.logging.repository;

import android.support.annotation.NonNull;
import com.tinder.api.model.purchase.PurchaseLog;
import io.paperdb.Book;

/* renamed from: com.tinder.purchase.logging.repository.a */
public class C16232a implements PurchaseLogRepository {
    /* renamed from: a */
    private final Book f50569a;

    public C16232a(Book book) {
        this.f50569a = book;
    }

    @android.support.annotation.NonNull
    public synchronized java.util.List<java.lang.String> getAllPurchaseLogIds() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f50569a;	 Catch:{ Throwable -> 0x000b }
        r0 = r0.getAllKeys();	 Catch:{ Throwable -> 0x000b }
        monitor-exit(r2);
        return r0;
    L_0x0009:
        r0 = move-exception;
        goto L_0x0019;
    L_0x000b:
        r0 = "Cannot load all purchase log ids";	 Catch:{ all -> 0x0009 }
        r1 = 0;	 Catch:{ all -> 0x0009 }
        r1 = new java.lang.Object[r1];	 Catch:{ all -> 0x0009 }
        p000a.p001a.C0001a.e(r0, r1);	 Catch:{ all -> 0x0009 }
        r0 = java.util.Collections.emptyList();	 Catch:{ all -> 0x0009 }
        monitor-exit(r2);
        return r0;
    L_0x0019:
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.purchase.logging.repository.a.getAllPurchaseLogIds():java.util.List<java.lang.String>");
    }

    @android.support.annotation.Nullable
    public com.tinder.api.model.purchase.PurchaseLog getPurchaseLog(@android.support.annotation.NonNull java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f50569a;	 Catch:{ Throwable -> 0x0009 }
        r0 = r0.read(r3);	 Catch:{ Throwable -> 0x0009 }
        r0 = (com.tinder.api.model.purchase.PurchaseLog) r0;	 Catch:{ Throwable -> 0x0009 }
        return r0;
    L_0x0009:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Cannot read purchase log: ";
        r0.append(r1);
        r0.append(r3);
        r3 = r0.toString();
        r0 = 0;
        r0 = new java.lang.Object[r0];
        p000a.p001a.C0001a.e(r3, r0);
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.purchase.logging.repository.a.getPurchaseLog(java.lang.String):com.tinder.api.model.purchase.PurchaseLog");
    }

    public synchronized void savePurchaseLog(@android.support.annotation.NonNull com.tinder.api.model.purchase.PurchaseLog r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.m61291a(r3);	 Catch:{ all -> 0x002e }
        r1 = r2.f50569a;	 Catch:{ Throwable -> 0x0015 }
        r1 = r1.exist(r0);	 Catch:{ Throwable -> 0x0015 }
        if (r1 == 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r2);
        return;
    L_0x000f:
        r1 = r2.f50569a;	 Catch:{ Throwable -> 0x0015 }
        r1.write(r0, r3);	 Catch:{ Throwable -> 0x0015 }
        goto L_0x002c;
    L_0x0015:
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002e }
        r3.<init>();	 Catch:{ all -> 0x002e }
        r1 = "Cannot save purchase log: ";	 Catch:{ all -> 0x002e }
        r3.append(r1);	 Catch:{ all -> 0x002e }
        r3.append(r0);	 Catch:{ all -> 0x002e }
        r3 = r3.toString();	 Catch:{ all -> 0x002e }
        r0 = 0;	 Catch:{ all -> 0x002e }
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x002e }
        p000a.p001a.C0001a.e(r3, r0);	 Catch:{ all -> 0x002e }
    L_0x002c:
        monitor-exit(r2);
        return;
    L_0x002e:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.purchase.logging.repository.a.savePurchaseLog(com.tinder.api.model.purchase.PurchaseLog):void");
    }

    public synchronized void removePurchaseLog(@android.support.annotation.NonNull java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f50569a;	 Catch:{ Throwable -> 0x0009 }
        r0.delete(r3);	 Catch:{ Throwable -> 0x0009 }
        goto L_0x0020;
    L_0x0007:
        r3 = move-exception;
        goto L_0x0022;
    L_0x0009:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0007 }
        r0.<init>();	 Catch:{ all -> 0x0007 }
        r1 = "Cannot remove purchase log: ";	 Catch:{ all -> 0x0007 }
        r0.append(r1);	 Catch:{ all -> 0x0007 }
        r0.append(r3);	 Catch:{ all -> 0x0007 }
        r3 = r0.toString();	 Catch:{ all -> 0x0007 }
        r0 = 0;	 Catch:{ all -> 0x0007 }
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x0007 }
        p000a.p001a.C0001a.e(r3, r0);	 Catch:{ all -> 0x0007 }
    L_0x0020:
        monitor-exit(r2);
        return;
    L_0x0022:
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.purchase.logging.repository.a.removePurchaseLog(java.lang.String):void");
    }

    @NonNull
    /* renamed from: a */
    private String m61291a(@NonNull PurchaseLog purchaseLog) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("purchase-log-");
        stringBuilder.append(purchaseLog.getClassName());
        return stringBuilder.toString();
    }
}
