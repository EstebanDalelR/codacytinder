package com.tinder.paywall.paywallflow;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.widget.Toast;
import com.tinder.R;
import com.tinder.base.ActivitySignedInBase;
import com.tinder.boost.p178a.C10400d;
import com.tinder.boost.p178a.C8337b;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.fastmatch.view.FastMatchRecsActivity;
import com.tinder.managers.bk;
import com.tinder.paywall.legacy.PaywallFlowFailureListener;
import com.tinder.paywall.legacy.PaywallFlowSuccessListener;
import com.tinder.paywall.legacy.PaywallTypeSource;
import com.tinder.paywall.legacy.PlusPaywallSource;
import com.tinder.paywall.legacy.SuperlikePaywallSource;
import com.tinder.paywall.legacy.TopPicksPaywallSource;
import com.tinder.paywall.paywallflow.C10076o.C10074a;
import com.tinder.purchase.domain.exception.PurchaseClientException.ActivityNotExtendingSignedInBase;
import com.tinder.purchase.domain.exception.StartPaywallFlowException.AlreadyOwnedException;
import com.tinder.purchase.domain.exception.StartPaywallFlowException.FeatureNotAvailableException;
import com.tinder.purchase.domain.model.Transaction;
import com.tinder.purchase.domain.model.Transaction.Status;
import com.tinder.purchase.domain.model.TransactionFlowError;
import com.tinder.purchase.domain.model.TransactionFlowError.ReportType;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.exceptions.PurchaseFlowErrorThrowable;
import com.tinder.purchase.logging.C14522a;
import com.tinder.purchase.model.TransactionSuccessMessageType;
import com.tinder.purchase.register.Register.RestoreType;
import com.tinder.purchase.usecase.C14539e;
import com.tinder.purchase.usecase.C14541j;
import com.tinder.superlike.p419b.C15070b;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.tindergold.p426a.C16918g;
import com.tinder.tindergold.p426a.C16918g.C15179a;
import com.tinder.tindergold.p426a.C16919h;
import com.tinder.tindergold.p426a.C16919h.C15180a;
import com.tinder.tinderplus.analytics.C16935a;
import com.tinder.tinderplus.analytics.C16936b;
import com.tinder.tinderplus.analytics.C16936b.C15200a;
import com.tinder.tinderplus.analytics.C16937c;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.toppicks.p430a.C16975a;
import com.tinder.toppicks.p430a.C16975a.C15222a;
import com.tinder.utils.RxUtils;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import p000a.p001a.C0001a;
import rx.schedulers.Schedulers;

/* renamed from: com.tinder.paywall.paywallflow.r */
public class C10079r {
    @NonNull
    /* renamed from: a */
    private final C10072h f32964a;
    @NonNull
    /* renamed from: b */
    private final C15193i f32965b;
    @NonNull
    /* renamed from: c */
    private final C10400d f32966c;
    @NonNull
    /* renamed from: d */
    private final C15071e f32967d;
    @NonNull
    /* renamed from: e */
    private final bk f32968e;
    @NonNull
    /* renamed from: f */
    private final C14522a f32969f;
    @NonNull
    /* renamed from: g */
    private final C14539e f32970g;
    @NonNull
    /* renamed from: h */
    private final OfferRepository f32971h;
    @NonNull
    /* renamed from: i */
    private final FastMatchConfigProvider f32972i;
    @NonNull
    /* renamed from: j */
    private final SubscriptionProvider f32973j;
    @NonNull
    /* renamed from: k */
    private final C14541j f32974k;
    @NonNull
    /* renamed from: l */
    private final C16936b f32975l;
    @NonNull
    /* renamed from: m */
    private final C16937c f32976m;
    @NonNull
    /* renamed from: n */
    private final C16935a f32977n;
    @NonNull
    /* renamed from: o */
    private final C16918g f32978o;
    @NonNull
    /* renamed from: p */
    private final C16919h f32979p;
    @NonNull
    /* renamed from: q */
    private final C15070b f32980q;
    @NonNull
    /* renamed from: r */
    private final C8337b f32981r;
    @NonNull
    /* renamed from: s */
    private final C16975a f32982s;
    @NonNull
    /* renamed from: t */
    private final C10067d f32983t;

    /* renamed from: a */
    static final /* synthetic */ void m41179a() {
    }

    @Inject
    public C10079r(@NonNull C10072h c10072h, @NonNull C15193i c15193i, @NonNull C10400d c10400d, @NonNull C15071e c15071e, @NonNull bk bkVar, @NonNull C14522a c14522a, @NonNull C14539e c14539e, @NonNull OfferRepository offerRepository, @NonNull FastMatchConfigProvider fastMatchConfigProvider, @NonNull SubscriptionProvider subscriptionProvider, @NonNull C14541j c14541j, @NonNull C16936b c16936b, @NonNull C16937c c16937c, @NonNull C16935a c16935a, @NonNull C16918g c16918g, @NonNull C16919h c16919h, @NonNull C15070b c15070b, @NonNull C8337b c8337b, @NonNull C16975a c16975a, @NonNull C10067d c10067d) {
        this.f32964a = c10072h;
        this.f32965b = c15193i;
        this.f32966c = c10400d;
        this.f32967d = c15071e;
        this.f32968e = bkVar;
        this.f32969f = c14522a;
        this.f32970g = c14539e;
        this.f32971h = offerRepository;
        this.f32972i = fastMatchConfigProvider;
        this.f32973j = subscriptionProvider;
        this.f32974k = c14541j;
        this.f32975l = c16936b;
        this.f32976m = c16937c;
        this.f32977n = c16935a;
        this.f32978o = c16918g;
        this.f32979p = c16919h;
        this.f32980q = c15070b;
        this.f32981r = c8337b;
        this.f32982s = c16975a;
        this.f32983t = c10067d;
    }

    /* renamed from: a */
    public void m41190a(@NonNull C10076o c10076o, Activity activity) {
        if (activity != null) {
            if (!m41184a(activity)) {
                this.f32969f.a(new ActivityNotExtendingSignedInBase(activity.getClass().getName()));
            }
            C10074a a = c10076o.m41168a();
            PaywallTypeSource a2 = a.mo10720a();
            PaywallFlowSuccessListener g = a.mo10726g();
            PaywallFlowFailureListener h = a.mo10727h();
            if (a2 == PlusPaywallSource.GAMEPAD_LIKE) {
                this.f32968e.r(true);
            }
            if (!this.f32971h.getOffers(a2.getProductType()).isEmpty() || (a2 instanceof TopPicksPaywallSource)) {
                switch (a2.getProductType()) {
                    case PLUS:
                        if (!this.f32965b.a()) {
                            if (!this.f32965b.c()) {
                                Toast.makeText(activity, R.string.this_feature_is_not_enabled, 0).show();
                                this.f32969f.a(new FeatureNotAvailableException(ProductType.PLUS));
                                break;
                            }
                        }
                        Toast.makeText(activity, R.string.you_already_own_this_product, 0).show();
                        this.f32969f.a(new AlreadyOwnedException(ProductType.PLUS));
                        return;
                        break;
                    case BOOST:
                        if (!this.f32966c.m42274a()) {
                            Toast.makeText(activity, R.string.this_feature_is_not_enabled, 0).show();
                            this.f32969f.a(new FeatureNotAvailableException(ProductType.BOOST));
                            return;
                        }
                        break;
                    case SUPERLIKE:
                        if (m41185a(a2)) {
                            Toast.makeText(activity, R.string.this_feature_is_not_enabled, 0).show();
                            this.f32969f.a(new FeatureNotAvailableException(ProductType.SUPERLIKE));
                            return;
                        }
                        break;
                    case GOLD:
                        if (!this.f32972i.get().isEnabled()) {
                            Toast.makeText(activity, R.string.this_feature_is_not_enabled, 0).show();
                            this.f32969f.a(new FeatureNotAvailableException(ProductType.GOLD));
                            return;
                        } else if (this.f32973j.get().isGold()) {
                            Toast.makeText(activity, R.string.you_already_own_this_product, 0).show();
                            this.f32969f.a(new AlreadyOwnedException(ProductType.GOLD));
                            return;
                        }
                        break;
                    default:
                        break;
                }
                LegacyPaywall a3 = this.f32983t.m41133a(this.f32964a.m41145a(activity, a));
                a3.show();
                if (m41186b(a2)) {
                    this.f32974k.a(RestoreType.FROM_CACHE).a(RxUtils.a().a()).a(new C14127s(this, new WeakReference(activity), a2, a, a3), C14128t.f44830a);
                }
                a3.setPurchaseListener(new C12281u(this, activity, a3, a, a2, g));
                a3.setDismissListener(new C12282v(h));
                return;
            }
            c10076o = R.string.purchase_failure_no_offers;
            if (a2.getProductType() == ProductType.GOLD && !this.f32973j.get().wasPurchasedOnAndroid()) {
                c10076o = R.string.purchase_failure_platform_mismatch;
            }
            Toast.makeText(activity, c10076o, 0).show();
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m41191a(WeakReference weakReference, PaywallTypeSource paywallTypeSource, C10074a c10074a, LegacyPaywall legacyPaywall, Transaction transaction) {
        Activity activity = (Activity) weakReference.get();
        if (!(activity == null || activity.isFinishing())) {
            if (transaction.a().equals(Status.FAILURE)) {
                paywallTypeSource = transaction.c();
                if (!(paywallTypeSource == null || paywallTypeSource.shouldNotifyUserFromPaywall() == null)) {
                    Toast.makeText(activity, paywallTypeSource.getUserFacingMessageResId(), 0).show();
                }
            } else if (m41186b(paywallTypeSource)) {
                int successMessageRes;
                if (transaction.e() != null) {
                    successMessageRes = transaction.e().getSuccessMessageRes();
                } else {
                    successMessageRes = TransactionSuccessMessageType.GENERIC_RESTORE_SUCCESS.getSuccessMessageRes();
                }
                Toast.makeText(activity, successMessageRes, 0).show();
                weakReference = transaction.f();
                if (weakReference != null) {
                    if (transaction.a() == Status.SUCCESS) {
                        if (weakReference.b() == ProductType.GOLD) {
                            this.f32979p.a(new C15180a(weakReference, c10074a)).b(Schedulers.io()).d();
                        } else if (weakReference.b() == ProductType.PLUS) {
                            this.f32975l.a(new C15200a(c10074a, this.f32965b.d())).b(Schedulers.io()).d();
                        }
                    } else if (weakReference.b() == ProductType.PLUS) {
                        this.f32976m.execute().b(Schedulers.io()).d();
                    }
                    if (weakReference.b() == paywallTypeSource.getProductType() || (weakReference.b() == ProductType.GOLD && paywallTypeSource.getProductType() == ProductType.PLUS)) {
                        legacyPaywall.dismiss();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m41188a(Activity activity, LegacyPaywall legacyPaywall, C10074a c10074a, PaywallTypeSource paywallTypeSource, PaywallFlowSuccessListener paywallFlowSuccessListener, String str) {
        this.f32970g.a(activity, str).a(new C14129w(this, activity, legacyPaywall, c10074a, paywallTypeSource, paywallFlowSuccessListener), new C14130x(this, activity));
    }

    /* renamed from: a */
    final /* synthetic */ void m41187a(Activity activity, LegacyPaywall legacyPaywall, C10074a c10074a, PaywallTypeSource paywallTypeSource, PaywallFlowSuccessListener paywallFlowSuccessListener, Transaction transaction) {
        TransactionFlowError c = transaction.c();
        if (transaction.a() != Status.FAILURE || c == null) {
            if (transaction.a() == Status.SUCCESS) {
                activity = transaction.f();
                if (activity != null) {
                    switch (activity.b()) {
                        case PLUS:
                            this.f32977n.a(c10074a).b(Schedulers.io()).d();
                            break;
                        case BOOST:
                            this.f32981r.m35506b(paywallTypeSource.getAnalyticsSource(), activity);
                            break;
                        case SUPERLIKE:
                            this.f32980q.b(activity);
                            break;
                        case GOLD:
                            this.f32978o.a(new C15179a(activity, c10074a)).b(Schedulers.io()).d();
                            break;
                        case TOP_PICKS:
                            this.f32982s.a(new C15222a(paywallTypeSource.getAnalyticsSource(), activity.a())).a(C14131y.f44839a, C14132z.f44840a);
                            break;
                        default:
                            break;
                    }
                }
                legacyPaywall.setDismissListener(new aa(paywallFlowSuccessListener));
                legacyPaywall.dismiss();
            }
            return;
        }
        if (c.shouldNotifyUserFromPaywall() != null) {
            Toast.makeText(activity, c.getUserFacingMessageResId(), 1).show();
        }
        if (c.getReportType() == ReportType.FATAL) {
            legacyPaywall.dismiss();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m41181a(PaywallFlowSuccessListener paywallFlowSuccessListener) {
        if (paywallFlowSuccessListener != null) {
            paywallFlowSuccessListener.handleSuccess();
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m41189a(Activity activity, Throwable th) {
        m41182a(th);
        m41183a(th, activity);
    }

    /* renamed from: a */
    static final /* synthetic */ void m41180a(PaywallFlowFailureListener paywallFlowFailureListener) {
        if (paywallFlowFailureListener != null) {
            paywallFlowFailureListener.handleFailure();
        }
    }

    /* renamed from: a */
    private void m41182a(@NonNull Throwable th) {
        if ((th instanceof PurchaseFlowErrorThrowable) && ((PurchaseFlowErrorThrowable) th).b()) {
            C0001a.c(th);
        }
    }

    /* renamed from: a */
    private boolean m41185a(PaywallTypeSource paywallTypeSource) {
        return (this.f32967d.a() || paywallTypeSource == SuperlikePaywallSource.DEEPLINK_SUPERLIKE) ? null : true;
    }

    /* renamed from: a */
    private void m41183a(@NonNull Throwable th, Activity activity) {
        if ((th instanceof PurchaseFlowErrorThrowable) && ((PurchaseFlowErrorThrowable) th).a() != null && activity != null) {
            Toast.makeText(activity, R.string.purchase_failure, 0).show();
        }
    }

    /* renamed from: b */
    private boolean m41186b(PaywallTypeSource paywallTypeSource) {
        if (paywallTypeSource.getProductType() != ProductType.PLUS) {
            if (paywallTypeSource.getProductType() != ProductType.GOLD) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m41184a(Activity activity) {
        if (!(activity instanceof ActivitySignedInBase)) {
            if ((activity instanceof FastMatchRecsActivity) == null) {
                return null;
            }
        }
        return true;
    }
}
