package com.tinder.tinderplus.p429b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Pair;
import android.view.View;
import com.tinder.R;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.meta.model.PlusControlSettings;
import com.tinder.domain.meta.model.PlusControlSettings.Blend;
import com.tinder.domain.meta.model.PlusControlSettings.Builder;
import com.tinder.domain.meta.model.PlusControlSettings.DiscoverableParty;
import com.tinder.domain.profile.model.ProfileOption.PlusControl;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.SavePlusControlSettings;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.etl.event.pc;
import com.tinder.managers.bk;
import com.tinder.passport.model.PassportLocation;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.paywallflow.C10076o;
import com.tinder.presenters.PresenterBase;
import com.tinder.tinderplus.analytics.AddUserInteractionPlusControlSettingsEvent;
import com.tinder.tinderplus.analytics.AddUserInteractionPlusControlSettingsEvent.Subcategory;
import com.tinder.tinderplus.model.C15219p;
import com.tinder.tinderplus.model.C15219p.C15218b;
import com.tinder.tinderplus.model.TinderPlusIncentive;
import com.tinder.tinderplus.p428a.C15188a;
import com.tinder.tinderplus.p428a.C15190c;
import com.tinder.tinderplus.p428a.C15191d;
import com.tinder.tinderplus.p428a.C15191d.C16926a;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.tinderplus.target.TinderPlusControlTarget;
import com.tinder.utils.RxUtils;
import com.tinder.utils.ad;
import com.tinder.utils.ag;
import com.tinder.views.FeatureRow;
import com.tinder.views.FeatureRow.FeatureInteractionListener;
import com.tinder.views.FeatureToggleView;
import hu.akarnokd.rxjava.interop.C15551e;
import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.C15756a;
import java.util.Collections;
import java.util.List;
import java8.util.stream.Collectors;
import java8.util.stream.StreamSupport;
import javax.inject.Inject;
import p000a.p001a.C0001a;
import rx.Observable;

/* renamed from: com.tinder.tinderplus.b.a */
public class C18211a extends PresenterBase<TinderPlusControlTarget> {
    /* renamed from: a */
    Builder f56453a;
    @NonNull
    /* renamed from: b */
    private final C15190c f56454b;
    @NonNull
    /* renamed from: c */
    private final C15191d f56455c;
    @NonNull
    /* renamed from: d */
    private final C15193i f56456d;
    @NonNull
    /* renamed from: e */
    private final C15188a f56457e;
    @NonNull
    /* renamed from: f */
    private final C15219p f56458f;
    @NonNull
    /* renamed from: g */
    private final C2630h f56459g;
    @NonNull
    /* renamed from: h */
    private final FastMatchConfigProvider f56460h;
    @NonNull
    /* renamed from: i */
    private final SubscriptionProvider f56461i;
    /* renamed from: j */
    private final AbTestUtility f56462j;
    /* renamed from: k */
    private final AddUserInteractionPlusControlSettingsEvent f56463k;
    /* renamed from: l */
    private final SavePlusControlSettings f56464l;
    /* renamed from: m */
    private final LoadProfileOptionData f56465m;
    /* renamed from: n */
    private final bk f56466n;

    @Inject
    public C18211a(@NonNull C15190c c15190c, @NonNull C15191d c15191d, @NonNull C15193i c15193i, @NonNull C15188a c15188a, @NonNull C15219p c15219p, @NonNull C2630h c2630h, @NonNull FastMatchConfigProvider fastMatchConfigProvider, @NonNull SubscriptionProvider subscriptionProvider, @NonNull AbTestUtility abTestUtility, AddUserInteractionPlusControlSettingsEvent addUserInteractionPlusControlSettingsEvent, SavePlusControlSettings savePlusControlSettings, LoadProfileOptionData loadProfileOptionData, bk bkVar) {
        this.f56454b = c15190c;
        this.f56455c = c15191d;
        this.f56456d = c15193i;
        this.f56458f = c15219p;
        this.f56459g = c2630h;
        this.f56457e = c15188a;
        this.f56460h = fastMatchConfigProvider;
        this.f56461i = subscriptionProvider;
        this.f56462j = abTestUtility;
        this.f56463k = addUserInteractionPlusControlSettingsEvent;
        this.f56464l = savePlusControlSettings;
        this.f56465m = loadProfileOptionData;
        this.f56466n = bkVar;
    }

    /* renamed from: a */
    public void m66023a(PassportLocation passportLocation, ag<Integer> agVar) {
        m66019c(passportLocation, agVar);
    }

    /* renamed from: b */
    public void m66030b() {
        m66019c(null, null);
    }

    /* renamed from: c */
    private void m66019c(@Nullable PassportLocation passportLocation, @Nullable ag<Integer> agVar) {
        TinderPlusControlTarget tinderPlusControlTarget = (TinderPlusControlTarget) H();
        if (tinderPlusControlTarget != null) {
            Observable.a(this.f56461i.observe(), C15551e.m58077a(this.f56465m.execute(PlusControl.INSTANCE), BackpressureStrategy.LATEST), C18212b.f56467a).a(bindToLifecycle()).a(RxUtils.a()).a(new C18972c(this, tinderPlusControlTarget, passportLocation, agVar), new C18973d(this, tinderPlusControlTarget, passportLocation, agVar));
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m66024a(TinderPlusControlTarget tinderPlusControlTarget, @Nullable PassportLocation passportLocation, @Nullable ag agVar, Pair pair) {
        Subscription subscription = (Subscription) pair.first;
        if (this.f56462j.profileV2EnabledForRevenue()) {
            PlusControlSettings plusControlSettings = (PlusControlSettings) pair.second;
            this.f56453a = plusControlSettings.toBuilder();
            this.f56453a.isHideAds(subscription.isActiveSubscription());
            m66012a(plusControlSettings);
        }
        tinderPlusControlTarget.showTinderPlusControl(m66010a(subscription.isActiveSubscription()), subscription.isActiveSubscription());
        if (!(passportLocation == null || agVar == null)) {
            m66031b(passportLocation, agVar);
        }
        if (this.f56460h.get().isEnabled() == null || subscription.isGold() == null) {
            tinderPlusControlTarget.setPlusToolbarTitle();
        } else {
            tinderPlusControlTarget.setGoldToolbarTitle();
        }
        m66021e();
    }

    /* renamed from: a */
    final /* synthetic */ void m66025a(TinderPlusControlTarget tinderPlusControlTarget, @Nullable PassportLocation passportLocation, @Nullable ag agVar, Throwable th) {
        C0001a.c(th);
        tinderPlusControlTarget.showTinderPlusControl(m66010a(false), false);
        tinderPlusControlTarget.setPlusToolbarTitle();
        if (passportLocation != null && agVar != null) {
            m66031b(passportLocation, agVar);
        }
    }

    /* renamed from: a */
    public void m66026a(@NonNull ag<Integer> agVar) {
        TinderPlusControlTarget tinderPlusControlTarget = (TinderPlusControlTarget) H();
        if (tinderPlusControlTarget != null) {
            if (this.f56456d.m57121a()) {
                m66011a(2);
                tinderPlusControlTarget.navigateToActivityPassport();
                return;
            }
            tinderPlusControlTarget.launchPaywallFlow(C10076o.a(PlusPaywallSource.PASSPORT_RECENT_LOCATION).a(m66018c(agVar)));
        }
    }

    /* renamed from: b */
    public void m66031b(@NonNull PassportLocation passportLocation, @NonNull ag<Integer> agVar) {
        if (!this.f56456d.m57121a()) {
            a(new C18974e(C10076o.a(PlusPaywallSource.PASSPORT_RECENT_LOCATION).a(m66018c(agVar))));
        } else if (this.f56454b.m57106a(passportLocation) != null) {
            TinderPlusControlTarget tinderPlusControlTarget = (TinderPlusControlTarget) H();
            if (tinderPlusControlTarget != null) {
                tinderPlusControlTarget.selectPassportLocation(passportLocation, this.f56454b.m57105a());
            }
        }
    }

    /* renamed from: a */
    public void m66022a(@NonNull View view, @NonNull ag<Integer> agVar) {
        TinderPlusControlTarget tinderPlusControlTarget = (TinderPlusControlTarget) H();
        if (tinderPlusControlTarget != null) {
            if (view instanceof FeatureRow) {
                List singletonList;
                FeatureRow featureRow = (FeatureRow) view;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("User clicked on the row: ");
                stringBuilder.append(featureRow.getTitle());
                ad.a(stringBuilder.toString());
                String incentiveName = featureRow.getIncentiveName();
                TinderPlusIncentive from = TinderPlusIncentive.from(incentiveName);
                if (from != null) {
                    singletonList = Collections.singletonList(Integer.valueOf(from.getAnalyticsValue()));
                } else {
                    singletonList = Collections.emptyList();
                }
                tinderPlusControlTarget.launchPaywallFlow(C10076o.a(m66008a(incentiveName)).a(singletonList).a(new C16940f(this, incentiveName, featureRow)));
            } else if (view.getId() == R.id.current_location_container) {
                tinderPlusControlTarget.launchPaywallFlow(C10076o.a(PlusPaywallSource.CONTROL_OTHER_FEATURE).a(Collections.singletonList(Integer.valueOf(TinderPlusIncentive.PASSPORT.getAnalyticsValue()))));
            }
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m66029a(String str, FeatureRow featureRow) {
        if (!str.equals("who_you_see")) {
            if (!str.equals("who_sees_you")) {
                if (str.equals("your_profile") || str.equals(ManagerWebServices.PARAM_HIDE_ADS) != null) {
                    m66028a(featureRow, true);
                    return;
                }
                return;
            }
        }
        m66027a(featureRow, featureRow);
    }

    /* renamed from: a */
    public void m66027a(@NonNull FeatureRow featureRow, @NonNull FeatureRow featureRow2) {
        if (this.f56460h.get().isEnabled() && this.f56461i.get().isGold() && featureRow.getFeatureName().equals("liked")) {
            if (H() != null) {
                ((TinderPlusControlTarget) H()).showDisableFastMatchAlertDialog(featureRow, featureRow2);
            }
            return;
        }
        m66033b(featureRow, featureRow2);
    }

    /* renamed from: b */
    public void m66033b(@NonNull final FeatureRow featureRow, @NonNull final FeatureRow featureRow2) {
        if (this.f56462j.profileV2EnabledForRevenue()) {
            if (featureRow.getIncentiveName().equals("who_sees_you")) {
                m66017b(featureRow);
            } else if (featureRow.getIncentiveName().equals("who_you_see")) {
                m66014a(featureRow);
            }
            ((TinderPlusControlTarget) H()).setCheckedFeature(featureRow, featureRow2);
            return;
        }
        this.f56455c.m57108a(featureRow.getFeatureName(), new C16926a(this, featureRow.getTitle()) {
            /* renamed from: d */
            final /* synthetic */ C18211a f56450d;

            public void onProfileUpdateFailed() {
                super.onProfileUpdateFailed();
                if (this.f56450d.H() != null) {
                    ((TinderPlusControlTarget) this.f56450d.H()).setCheckedFeature(featureRow2, featureRow);
                }
            }

            public void onProfileUpdateSuccess() {
                super.onProfileUpdateSuccess();
                if (featureRow.getIncentiveName().equals("who_you_see")) {
                    this.f56450d.f56455c.m57109a(true);
                }
                if (this.f56450d.H() != null) {
                    ((TinderPlusControlTarget) this.f56450d.H()).setCheckedFeature(featureRow, featureRow2);
                }
            }
        });
    }

    /* renamed from: a */
    public void m66028a(@NonNull final FeatureRow featureRow, boolean z) {
        if (this.f56462j.profileV2EnabledForRevenue()) {
            m66015a(featureRow.getFeatureName(), z);
        } else {
            this.f56455c.m57110a(z, featureRow.getFeatureName(), new C16926a(this, featureRow.getFeatureName()) {
                /* renamed from: c */
                final /* synthetic */ C18211a f56452c;

                public void onProfileUpdateFailed() {
                    super.onProfileUpdateFailed();
                    FeatureInteractionListener interactionListener = ((FeatureToggleView) featureRow.getParent()).getInteractionListener();
                    featureRow.getFeatureSwitch().setOnCheckedChangeListener(null);
                    featureRow.getFeatureSwitch().toggle();
                    featureRow.setOnCheckChangeListener(interactionListener);
                }
            });
        }
    }

    /* renamed from: b */
    public void m66032b(@NonNull ag<Integer> agVar) {
        a(new C18975g(C10076o.a(PlusPaywallSource.CONTROL_PLUS_BUTTON).a(m66018c(agVar))));
    }

    /* renamed from: c */
    public void m66034c() {
        if (this.f56462j.profileV2EnabledForRevenue()) {
            this.f56464l.execute(this.f56453a.build()).b(C15756a.m59010b()).a(Functions.f48541c, C16941h.f52221a);
        }
    }

    @NonNull
    /* renamed from: c */
    private List<Integer> m66018c(@NonNull ag<Integer> agVar) {
        Integer num = (Integer) agVar.m57620a();
        Integer num2 = (Integer) agVar.m57622b();
        Integer valueOf = Integer.valueOf(num2.intValue() - num.intValue());
        Iterable d = m66020d();
        if (valueOf.intValue() > 0) {
            if (d.size() > num2.intValue()) {
                return (List) Observable.a(d).b(num.intValue()).c(valueOf.intValue()).v().u().b();
            }
        }
        return Collections.emptyList();
    }

    @NonNull
    /* renamed from: d */
    private List<Integer> m66020d() {
        return (List) StreamSupport.m59708a(this.f56457e.m57104a()).map(C16942i.f52222a).collect(Collectors.m59434a());
    }

    @NonNull
    /* renamed from: a */
    private List<String> m66010a(boolean z) {
        List<String> list = (List) StreamSupport.m59708a(this.f56457e.m57104a()).map(C16943j.f52223a).collect(Collectors.m59434a());
        if (z && !list.contains("consumable_upsell")) {
            list.add(false, "consumable_upsell");
        }
        return list;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.NonNull
    /* renamed from: a */
    private com.tinder.paywall.legacy.PaywallTypeSource m66008a(java.lang.String r2) {
        /*
        r1 = this;
        r0 = r2.hashCode();
        switch(r0) {
            case -1773595597: goto L_0x0044;
            case -1718391333: goto L_0x003a;
            case 3594468: goto L_0x0030;
            case 93922211: goto L_0x0026;
            case 1032932673: goto L_0x001c;
            case 1481178525: goto L_0x0012;
            case 1515830679: goto L_0x0008;
            default: goto L_0x0007;
        };
    L_0x0007:
        goto L_0x004e;
    L_0x0008:
        r0 = "unlimited_swipes";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x004e;
    L_0x0010:
        r2 = 1;
        goto L_0x004f;
    L_0x0012:
        r0 = "your_profile";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x004e;
    L_0x001a:
        r2 = 6;
        goto L_0x004f;
    L_0x001c:
        r0 = "who_sees_you";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x004e;
    L_0x0024:
        r2 = 5;
        goto L_0x004f;
    L_0x0026:
        r0 = "boost";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x004e;
    L_0x002e:
        r2 = 4;
        goto L_0x004f;
    L_0x0030:
        r0 = "undo";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x004e;
    L_0x0038:
        r2 = 0;
        goto L_0x004f;
    L_0x003a:
        r0 = "super_like";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x004e;
    L_0x0042:
        r2 = 3;
        goto L_0x004f;
    L_0x0044:
        r0 = "hide_ads";
        r2 = r2.equals(r0);
        if (r2 == 0) goto L_0x004e;
    L_0x004c:
        r2 = 2;
        goto L_0x004f;
    L_0x004e:
        r2 = -1;
    L_0x004f:
        switch(r2) {
            case 0: goto L_0x0067;
            case 1: goto L_0x0064;
            case 2: goto L_0x0061;
            case 3: goto L_0x005e;
            case 4: goto L_0x005b;
            case 5: goto L_0x0058;
            case 6: goto L_0x0055;
            default: goto L_0x0052;
        };
    L_0x0052:
        r2 = com.tinder.paywall.legacy.PlusPaywallSource.CONTROL_OTHER_FEATURE;
        return r2;
    L_0x0055:
        r2 = com.tinder.paywall.legacy.PlusPaywallSource.CONTROL_YOUR_PROFILE;
        return r2;
    L_0x0058:
        r2 = com.tinder.paywall.legacy.PlusPaywallSource.CONTROL_WHO_SEES_YOU;
        return r2;
    L_0x005b:
        r2 = com.tinder.paywall.legacy.PlusPaywallSource.CONTROL_BOOST_FEATURE;
        return r2;
    L_0x005e:
        r2 = com.tinder.paywall.legacy.PlusPaywallSource.CONTROL_SUPERLIKE_FEATURE;
        return r2;
    L_0x0061:
        r2 = com.tinder.paywall.legacy.PlusPaywallSource.CONTROL_HIDE_ADS;
        return r2;
    L_0x0064:
        r2 = com.tinder.paywall.legacy.PlusPaywallSource.CONTROL_UNLIMITED_SWIPES;
        return r2;
    L_0x0067:
        r2 = com.tinder.paywall.legacy.PlusPaywallSource.CONTROL_UNDO;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.tinderplus.b.a.a(java.lang.String):com.tinder.paywall.legacy.PaywallTypeSource");
    }

    /* renamed from: a */
    private void m66011a(int i) {
        this.f56459g.a(pc.a().a(Integer.valueOf(i)).a());
    }

    /* renamed from: e */
    private void m66021e() {
        this.f56459g.a(this.f56458f.m57277h(C15218b.m57256h().mo12632a()));
    }

    /* renamed from: a */
    private void m66014a(FeatureRow featureRow) {
        featureRow = featureRow.getFeatureName();
        int hashCode = featureRow.hashCode();
        if (hashCode != -1249477246) {
            if (hashCode != 288459765) {
                if (hashCode == 1082295151) {
                    if (featureRow.equals("recency") != null) {
                        featureRow = 2;
                        switch (featureRow) {
                            case null:
                                this.f56453a.blend(Blend.OPTIMAL);
                                this.f56466n.e(Blend.OPTIMAL.toString());
                                this.f56463k.m62612a(Subcategory.WHO_YOU_SEE_OPTIMAL);
                                return;
                            case 1:
                                this.f56453a.blend(Blend.DISTANCE);
                                this.f56466n.e(Blend.DISTANCE.toString());
                                return;
                            case 2:
                                this.f56453a.blend(Blend.RECENT_ACTIVITY);
                                this.f56466n.e(Blend.RECENT_ACTIVITY.toString());
                                this.f56463k.m62612a(Subcategory.WHO_YOU_SEE_RECENT_ACTIVITY);
                                return;
                            default:
                                throw new IllegalArgumentException("Unsupported feature name");
                        }
                    }
                }
            } else if (featureRow.equals("distance") != null) {
                featureRow = true;
                switch (featureRow) {
                    case null:
                        this.f56453a.blend(Blend.OPTIMAL);
                        this.f56466n.e(Blend.OPTIMAL.toString());
                        this.f56463k.m62612a(Subcategory.WHO_YOU_SEE_OPTIMAL);
                        return;
                    case 1:
                        this.f56453a.blend(Blend.DISTANCE);
                        this.f56466n.e(Blend.DISTANCE.toString());
                        return;
                    case 2:
                        this.f56453a.blend(Blend.RECENT_ACTIVITY);
                        this.f56466n.e(Blend.RECENT_ACTIVITY.toString());
                        this.f56463k.m62612a(Subcategory.WHO_YOU_SEE_RECENT_ACTIVITY);
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported feature name");
                }
            }
        } else if (featureRow.equals("optimal") != null) {
            featureRow = null;
            switch (featureRow) {
                case null:
                    this.f56453a.blend(Blend.OPTIMAL);
                    this.f56466n.e(Blend.OPTIMAL.toString());
                    this.f56463k.m62612a(Subcategory.WHO_YOU_SEE_OPTIMAL);
                    return;
                case 1:
                    this.f56453a.blend(Blend.DISTANCE);
                    this.f56466n.e(Blend.DISTANCE.toString());
                    return;
                case 2:
                    this.f56453a.blend(Blend.RECENT_ACTIVITY);
                    this.f56466n.e(Blend.RECENT_ACTIVITY.toString());
                    this.f56463k.m62612a(Subcategory.WHO_YOU_SEE_RECENT_ACTIVITY);
                    return;
                default:
                    throw new IllegalArgumentException("Unsupported feature name");
            }
        }
        featureRow = -1;
        switch (featureRow) {
            case null:
                this.f56453a.blend(Blend.OPTIMAL);
                this.f56466n.e(Blend.OPTIMAL.toString());
                this.f56463k.m62612a(Subcategory.WHO_YOU_SEE_OPTIMAL);
                return;
            case 1:
                this.f56453a.blend(Blend.DISTANCE);
                this.f56466n.e(Blend.DISTANCE.toString());
                return;
            case 2:
                this.f56453a.blend(Blend.RECENT_ACTIVITY);
                this.f56466n.e(Blend.RECENT_ACTIVITY.toString());
                this.f56463k.m62612a(Subcategory.WHO_YOU_SEE_RECENT_ACTIVITY);
                return;
            default:
                throw new IllegalArgumentException("Unsupported feature name");
        }
    }

    /* renamed from: b */
    private void m66017b(FeatureRow featureRow) {
        featureRow = featureRow.getFeatureName();
        int hashCode = featureRow.hashCode();
        if (hashCode != 102974381) {
            if (hashCode == 281977195) {
                if (featureRow.equals("everyone") != null) {
                    featureRow = null;
                    switch (featureRow) {
                        case null:
                            this.f56453a.discoverableParty(DiscoverableParty.EVERYONE);
                            this.f56466n.f(DiscoverableParty.EVERYONE.toString());
                            this.f56463k.m62612a(Subcategory.WHO_SEES_YOU_STANDARD);
                            return;
                        case 1:
                            this.f56453a.discoverableParty(DiscoverableParty.LIKED);
                            this.f56466n.f(DiscoverableParty.LIKED.toString());
                            this.f56463k.m62612a(Subcategory.WHO_SEES_YOU_LIKED);
                            return;
                        default:
                            throw new IllegalArgumentException("Unsupported feature name");
                    }
                }
            }
        } else if (featureRow.equals("liked") != null) {
            featureRow = true;
            switch (featureRow) {
                case null:
                    this.f56453a.discoverableParty(DiscoverableParty.EVERYONE);
                    this.f56466n.f(DiscoverableParty.EVERYONE.toString());
                    this.f56463k.m62612a(Subcategory.WHO_SEES_YOU_STANDARD);
                    return;
                case 1:
                    this.f56453a.discoverableParty(DiscoverableParty.LIKED);
                    this.f56466n.f(DiscoverableParty.LIKED.toString());
                    this.f56463k.m62612a(Subcategory.WHO_SEES_YOU_LIKED);
                    return;
                default:
                    throw new IllegalArgumentException("Unsupported feature name");
            }
        }
        featureRow = -1;
        switch (featureRow) {
            case null:
                this.f56453a.discoverableParty(DiscoverableParty.EVERYONE);
                this.f56466n.f(DiscoverableParty.EVERYONE.toString());
                this.f56463k.m62612a(Subcategory.WHO_SEES_YOU_STANDARD);
                return;
            case 1:
                this.f56453a.discoverableParty(DiscoverableParty.LIKED);
                this.f56466n.f(DiscoverableParty.LIKED.toString());
                this.f56463k.m62612a(Subcategory.WHO_SEES_YOU_LIKED);
                return;
            default:
                throw new IllegalArgumentException("Unsupported feature name");
        }
    }

    /* renamed from: a */
    private void m66015a(String str, boolean z) {
        int hashCode = str.hashCode();
        if (hashCode != -1773595597) {
            if (hashCode != -1773595518) {
                if (hashCode == -1375884718) {
                    if (str.equals(ManagerWebServices.PARAM_HIDE_DISTANCE) != null) {
                        str = true;
                        switch (str) {
                            case null:
                                this.f56453a.isHideAge(z);
                                this.f56466n.u(z);
                                this.f56463k.m62612a(z ? Subcategory.HIDE_AGE : Subcategory.UNHIDE_AGE);
                                return;
                            case 1:
                                this.f56453a.isHideDistance(z);
                                this.f56466n.v(z);
                                this.f56463k.m62612a(z ? Subcategory.HIDE_DISTANCE : Subcategory.UNHIDE_DISTANCE);
                                return;
                            case 2:
                                this.f56453a.isHideAds(z);
                                this.f56466n.t(z);
                                this.f56463k.m62612a(z ? Subcategory.HIDE_ADS : Subcategory.UNHIDE_ADS);
                                return;
                            default:
                                throw new IllegalArgumentException("Unsupported feature name");
                        }
                    }
                }
            } else if (str.equals(ManagerWebServices.PARAM_HIDE_AGE) != null) {
                str = null;
                switch (str) {
                    case null:
                        this.f56453a.isHideAge(z);
                        this.f56466n.u(z);
                        if (z) {
                        }
                        this.f56463k.m62612a(z ? Subcategory.HIDE_AGE : Subcategory.UNHIDE_AGE);
                        return;
                    case 1:
                        this.f56453a.isHideDistance(z);
                        this.f56466n.v(z);
                        if (z) {
                        }
                        this.f56463k.m62612a(z ? Subcategory.HIDE_DISTANCE : Subcategory.UNHIDE_DISTANCE);
                        return;
                    case 2:
                        this.f56453a.isHideAds(z);
                        this.f56466n.t(z);
                        if (z) {
                        }
                        this.f56463k.m62612a(z ? Subcategory.HIDE_ADS : Subcategory.UNHIDE_ADS);
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported feature name");
                }
            }
        } else if (str.equals(ManagerWebServices.PARAM_HIDE_ADS) != null) {
            str = 2;
            switch (str) {
                case null:
                    this.f56453a.isHideAge(z);
                    this.f56466n.u(z);
                    if (z) {
                    }
                    this.f56463k.m62612a(z ? Subcategory.HIDE_AGE : Subcategory.UNHIDE_AGE);
                    return;
                case 1:
                    this.f56453a.isHideDistance(z);
                    this.f56466n.v(z);
                    if (z) {
                    }
                    this.f56463k.m62612a(z ? Subcategory.HIDE_DISTANCE : Subcategory.UNHIDE_DISTANCE);
                    return;
                case 2:
                    this.f56453a.isHideAds(z);
                    this.f56466n.t(z);
                    if (z) {
                    }
                    this.f56463k.m62612a(z ? Subcategory.HIDE_ADS : Subcategory.UNHIDE_ADS);
                    return;
                default:
                    throw new IllegalArgumentException("Unsupported feature name");
            }
        }
        str = -1;
        switch (str) {
            case null:
                this.f56453a.isHideAge(z);
                this.f56466n.u(z);
                if (z) {
                }
                this.f56463k.m62612a(z ? Subcategory.HIDE_AGE : Subcategory.UNHIDE_AGE);
                return;
            case 1:
                this.f56453a.isHideDistance(z);
                this.f56466n.v(z);
                if (z) {
                }
                this.f56463k.m62612a(z ? Subcategory.HIDE_DISTANCE : Subcategory.UNHIDE_DISTANCE);
                return;
            case 2:
                this.f56453a.isHideAds(z);
                this.f56466n.t(z);
                if (z) {
                }
                this.f56463k.m62612a(z ? Subcategory.HIDE_ADS : Subcategory.UNHIDE_ADS);
                return;
            default:
                throw new IllegalArgumentException("Unsupported feature name");
        }
    }

    /* renamed from: a */
    private void m66012a(PlusControlSettings plusControlSettings) {
        this.f56466n.t(plusControlSettings.isHideAds());
        this.f56466n.u(plusControlSettings.isHideAge());
        this.f56466n.v(plusControlSettings.isHideDistance());
        this.f56466n.e(plusControlSettings.blend().toString());
        this.f56466n.f(plusControlSettings.discoverableParty().toString());
    }
}
