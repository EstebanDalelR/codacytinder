package com.tinder.purchase.logging.repository;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.model.purchase.PurchaseLog;
import java.util.List;

public interface PurchaseLogRepository {
    @NonNull
    List<String> getAllPurchaseLogIds();

    @Nullable
    PurchaseLog getPurchaseLog(@NonNull String str);

    void removePurchaseLog(@NonNull String str);

    void savePurchaseLog(@NonNull PurchaseLog purchaseLog);
}
