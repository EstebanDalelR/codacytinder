package com.tinder.purchase.register;

import android.app.Activity;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Single;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H&J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00062\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u0010"}, d2 = {"Lcom/tinder/purchase/register/Register;", "", "destroy", "", "initialize", "purchase", "Lrx/Single;", "", "activity", "Landroid/app/Activity;", "productId", "restorePurchase", "", "restoreType", "Lcom/tinder/purchase/register/Register$RestoreType;", "RestoreType", "purchase_release"}, k = 1, mv = {1, 1, 10})
public interface Register {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/purchase/register/Register$RestoreType;", "", "(Ljava/lang/String;I)V", "FROM_NETWORK", "FROM_CACHE", "purchase_release"}, k = 1, mv = {1, 1, 10})
    public enum RestoreType {
    }

    void destroy();

    void initialize();

    @NotNull
    Single<String> purchase(@NotNull Activity activity, @NotNull String str);

    @NotNull
    Single<List<String>> restorePurchase(@NotNull RestoreType restoreType);
}
