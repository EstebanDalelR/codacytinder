package com.tinder.purchase;

import com.tinder.data.purchase.provider.C3928a;
import com.tinder.domain.profile.model.ProfileV2Experiment;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.purchase.domain.model.C14517l;
import com.tinder.purchase.domain.model.TransactionSuccessMessageTypeFactory;
import com.tinder.purchase.logging.C14522a;
import com.tinder.purchase.logging.C16231c;
import com.tinder.purchase.model.C16238f;
import com.tinder.purchase.model.PurchaseFlowError.C16233a;
import com.tinder.purchase.model.RestoreFlowError.C16234a;
import com.tinder.purchase.p372b.C14482a;
import com.tinder.purchase.p372b.C14483c;
import com.tinder.purchase.register.Register;
import com.tinder.purchase.usecase.C14539e;
import com.tinder.purchase.usecase.C14541j;
import com.tinder.purchase.usecase.C16248i;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0007J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001a"}, d2 = {"Lcom/tinder/purchase/PurchaseModule;", "", "()V", "provideMakePurchase", "Lcom/tinder/purchase/usecase/MakePurchase;", "register", "Lcom/tinder/purchase/register/Register;", "transactionFactory", "Lcom/tinder/purchase/domain/model/TransactionFactory;", "purchaseMadeRelay", "Lcom/tinder/purchase/relay/PurchaseMadeRelay;", "providePurchaseMade", "Lcom/tinder/purchase/usecase/PurchaseMade;", "purchaseRestoreRelay", "Lcom/tinder/purchase/relay/PurchaseRestoreRelay;", "provideRestorePurchase", "Lcom/tinder/purchase/usecase/RestorePurchases;", "provideSubscriptionProvider", "Lcom/tinder/domain/purchase/SubscriptionProvider;", "profileV2Experiment", "Lcom/tinder/domain/profile/model/ProfileV2Experiment;", "loadProfileOptionData", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "provideTransactionSuccessMessageTypeFactory", "Lcom/tinder/purchase/domain/model/TransactionSuccessMessageTypeFactory;", "Declarations", "Tinder_release"}, k = 1, mv = {1, 1, 10})
@Module(includes = {Declarations.class})
public final class PurchaseModule {

    @Module
    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/tinder/purchase/PurchaseModule$Declarations;", "", "providePurchaseLogger", "Lcom/tinder/purchase/logging/PurchaseLogger;", "tinderPurchaseLogger", "Lcom/tinder/purchase/logging/TinderPurchaseLogger;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public interface Declarations {
        @Singleton
        @NotNull
        @Binds
        C14522a providePurchaseLogger(@NotNull C16231c c16231c);
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final SubscriptionProvider m55297a(@NotNull ProfileV2Experiment profileV2Experiment, @NotNull LoadProfileOptionData loadProfileOptionData) {
        C2668g.b(profileV2Experiment, "profileV2Experiment");
        C2668g.b(loadProfileOptionData, "loadProfileOptionData");
        return new C3928a(profileV2Experiment, loadProfileOptionData);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C16248i m55300a(@NotNull C14482a c14482a, @NotNull C14483c c14483c) {
        C2668g.b(c14482a, "purchaseMadeRelay");
        C2668g.b(c14483c, "purchaseRestoreRelay");
        return new C16248i(c14482a, c14483c);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final TransactionSuccessMessageTypeFactory m55298a() {
        return new C16238f();
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C14539e m55299a(@NotNull Register register, @NotNull C14517l c14517l, @NotNull C14482a c14482a) {
        C2668g.b(register, "register");
        C2668g.b(c14517l, "transactionFactory");
        C2668g.b(c14482a, "purchaseMadeRelay");
        return new C14539e(register, c14517l, new C16233a(), c14482a);
    }

    @NotNull
    @Provides
    /* renamed from: a */
    public final C14541j m55301a(@NotNull Register register, @NotNull C14517l c14517l, @NotNull C14483c c14483c) {
        C2668g.b(register, "register");
        C2668g.b(c14517l, "transactionFactory");
        C2668g.b(c14483c, "purchaseRestoreRelay");
        return new C14541j(register, c14517l, new C16234a(), c14483c);
    }
}
