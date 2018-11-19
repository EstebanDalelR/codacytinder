package com.tinder.intropricing.di;

import android.content.res.Resources;
import com.tinder.intropricing.paywall.view.IntroPricingPaywallView;
import com.tinder.paywall.domain.PaywallRepository;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/tinder/intropricing/di/IntroPricingApplicationComponent;", "", "inject", "", "introPricingPaywallView", "Lcom/tinder/intropricing/paywall/view/IntroPricingPaywallView;", "Builder", "IntroPricingApplicationComponentProvider", "Parent", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
@Component(dependencies = {Parent.class})
public interface IntroPricingApplicationComponent {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/tinder/intropricing/di/IntroPricingApplicationComponent$Builder;", "", "build", "Lcom/tinder/intropricing/di/IntroPricingApplicationComponent;", "parent", "Lcom/tinder/intropricing/di/IntroPricingApplicationComponent$Parent;", "resources", "Landroid/content/res/Resources;", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
    @dagger.Component.Builder
    public interface Builder {
        @NotNull
        IntroPricingApplicationComponent build();

        @NotNull
        Builder parent(@NotNull Parent parent);

        @NotNull
        @BindsInstance
        Builder resources(@NotNull Resources resources);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/intropricing/di/IntroPricingApplicationComponent$IntroPricingApplicationComponentProvider;", "", "provideIntroPricingApplicationComponent", "Lcom/tinder/intropricing/di/IntroPricingApplicationComponent;", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
    public interface IntroPricingApplicationComponentProvider {
        @NotNull
        IntroPricingApplicationComponent provideIntroPricingApplicationComponent();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/intropricing/di/IntroPricingApplicationComponent$Parent;", "", "paywallRepository", "Lcom/tinder/paywall/domain/PaywallRepository;", "intro-pricing_release"}, k = 1, mv = {1, 1, 10})
    public interface Parent {
        @NotNull
        PaywallRepository paywallRepository();
    }

    void inject(@NotNull IntroPricingPaywallView introPricingPaywallView);
}
