package com.tinder.purchase.billing;

import android.app.Activity;
import com.tinder.api.model.purchase.BillingReceipt;
import com.tinder.domain.profile.model.PurchaseType;
import com.tinder.purchase.domain.model.C14516k;
import com.tinder.purchase.model.C14534d;
import com.tinder.purchase.model.PurchaseTransaction;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u0003H&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0005H&J\b\u0010\u000e\u001a\u00020\u0006H&J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\fH&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH&J&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u001e"}, d2 = {"Lcom/tinder/purchase/billing/Biller;", "", "connect", "", "consumePurchase", "Lrx/Single;", "", "productId", "", "purchaseToken", "disconnect", "getPastTransactions", "", "Lcom/tinder/purchase/model/PurchaseTransaction;", "isConnected", "loadPriceListing", "Lcom/tinder/purchase/domain/model/PriceListing;", "productIds", "observeNetworkPurchaseHistory", "Lrx/Observable;", "Lcom/tinder/purchase/model/PurchaseHistory;", "observePurchaseHistory", "purchase", "Lcom/tinder/api/model/purchase/BillingReceipt;", "activity", "Landroid/app/Activity;", "purchaseType", "Lcom/tinder/domain/profile/model/PurchaseType;", "upgrade", "ownedProductId", "purchase_release"}, k = 1, mv = {1, 1, 10})
public interface Biller {
    void connect();

    @NotNull
    Single<Boolean> consumePurchase(@NotNull String str, @NotNull String str2);

    void disconnect();

    @NotNull
    Single<List<PurchaseTransaction>> getPastTransactions();

    boolean isConnected();

    @NotNull
    Single<C14516k> loadPriceListing(@NotNull List<String> list);

    @NotNull
    Observable<C14534d> observeNetworkPurchaseHistory();

    @NotNull
    Observable<C14534d> observePurchaseHistory();

    @NotNull
    Single<BillingReceipt> purchase(@NotNull Activity activity, @NotNull String str, @NotNull PurchaseType purchaseType);

    @NotNull
    Single<BillingReceipt> upgrade(@NotNull Activity activity, @NotNull String str, @NotNull String str2);
}
