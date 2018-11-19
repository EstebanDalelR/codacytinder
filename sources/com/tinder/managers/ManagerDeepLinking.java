package com.tinder.managers;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.android.volley.VolleyError;
import com.tinder.api.ManagerWebServices;
import com.tinder.deeplink.DeepLinkedSharedRecInterceptor;
import com.tinder.domain.common.model.Subscription;
import com.tinder.model.DeepLinkParams;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import com.tinder.module.ForApplication;
import com.tinder.p257g.C9648e;
import com.tinder.recs.model.DeepLinkReferralInfo;
import com.tinder.recs.model.DeepLinkReferralInfo.Builder;
import com.tinder.utils.ad;
import com.tinder.webprofile.activity.WebProfileUsernameActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Singleton;
import org.json.JSONObject;
import p000a.p001a.C0001a;

@Singleton
public class ManagerDeepLinking {
    /* renamed from: g */
    private static boolean f32561g;
    /* renamed from: a */
    private Uri f32562a;
    /* renamed from: b */
    private User f32563b;
    /* renamed from: c */
    private String f32564c;
    /* renamed from: d */
    private String f32565d;
    /* renamed from: e */
    private String f32566e;
    /* renamed from: f */
    private String f32567f;
    /* renamed from: h */
    private SparksEvent f32568h;
    /* renamed from: i */
    private final ManagerProfile f32569i;
    /* renamed from: j */
    private final ManagerAnalytics f32570j;
    /* renamed from: k */
    private final Context f32571k;
    @NonNull
    /* renamed from: l */
    private List<DeepLinkedSharedRecInterceptor> f32572l = new ArrayList();

    public interface DeepLinkListener {
        void launchBoostPaywall();

        void launchTinderGoldPaywall();

        void launchTinderPlusPaywall();
    }

    public interface OnProfileLoadedListener {
        void onProfileLoadFailed();

        void onProfileLoaded(User user, @NonNull DeepLinkReferralInfo deepLinkReferralInfo);
    }

    public ManagerDeepLinking(ManagerProfile managerProfile, ManagerAnalytics managerAnalytics, @ForApplication Context context) {
        this.f32569i = managerProfile;
        this.f32570j = managerAnalytics;
        this.f32571k = context;
    }

    /* renamed from: a */
    public void m40485a(@NonNull DeepLinkedSharedRecInterceptor deepLinkedSharedRecInterceptor) {
        this.f32572l.add(deepLinkedSharedRecInterceptor);
    }

    /* renamed from: a */
    public List<DeepLinkedSharedRecInterceptor> m40483a() {
        return Collections.unmodifiableList(new ArrayList(this.f32572l));
    }

    /* renamed from: a */
    public void m40484a(Uri uri) {
        this.f32562a = uri;
    }

    /* renamed from: b */
    public Uri m40491b() {
        return this.f32562a;
    }

    /* renamed from: a */
    public void m40490a(@Nullable String str, OnProfileLoadedListener onProfileLoadedListener) {
        if (!(str == null || str.isEmpty())) {
            this.f32567f = str;
        }
        this.f32564c = this.f32562a.toString();
        str = this.f32564c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f32562a.getScheme());
        stringBuilder.append("://");
        str = str.replace(stringBuilder.toString(), "").split("/");
        this.f32566e = this.f32562a.getQueryParameter("source");
        if (this.f32566e == null) {
            this.f32566e = "";
        }
        if (str.length > 0) {
            String str2 = str[0];
            Object obj = -1;
            int hashCode = str2.hashCode();
            if (hashCode != 117) {
                if (hashCode == 1812186700) {
                    if (str2.equals("getUsername")) {
                        obj = 1;
                    }
                }
            } else if (str2.equals("u")) {
                obj = null;
            }
            switch (obj) {
                case null:
                    this.f32565d = str[1];
                    if (!(this.f32565d.isEmpty() || f32561g)) {
                        f32561g = true;
                        this.f32569i.a(this.f32565d, new C12030z(this, m40480f(), onProfileLoadedListener), new aa(this, onProfileLoadedListener));
                        break;
                    }
                case 1:
                    if (!m40481g()) {
                        onProfileLoadedListener.onProfileLoadFailed();
                    }
                    onProfileLoadedListener = new Intent(this.f32571k, WebProfileUsernameActivity.class);
                    onProfileLoadedListener.addFlags(268435456);
                    this.f32571k.startActivity(onProfileLoadedListener);
                    break;
                default:
                    break;
            }
            onProfileLoadedListener = new StringBuilder();
            onProfileLoadedListener.append("Processed deep link: ");
            onProfileLoadedListener.append(this.f32564c);
            onProfileLoadedListener.append(", ");
            onProfileLoadedListener.append(str[0]);
            onProfileLoadedListener.append(", ");
            onProfileLoadedListener.append(this.f32565d);
            onProfileLoadedListener.append(", ");
            onProfileLoadedListener.append(this.f32566e);
            C0001a.b(onProfileLoadedListener.toString(), new Object[0]);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m40489a(Builder builder, OnProfileLoadedListener onProfileLoadedListener, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            str = C9648e.m40043a(jSONObject.getJSONObject(ManagerWebServices.PARAM_USER), false);
            User a = (!jSONObject.has("referrer") || jSONObject.isNull("referrer")) ? null : C9648e.m40043a(jSONObject.getJSONObject("referrer"), false);
            this.f32563b = str;
            f32561g = false;
            m40479e();
            builder.referrer(a);
            onProfileLoadedListener.onProfileLoaded(str, builder.build());
            this.f32562a = null;
        } catch (Builder builder2) {
            ad.a("Failed to get deep linked user", builder2);
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m40486a(OnProfileLoadedListener onProfileLoadedListener, VolleyError volleyError) {
        f32561g = null;
        m40479e();
        onProfileLoadedListener.onProfileLoadFailed();
    }

    /* renamed from: c */
    public static boolean m40478c() {
        return f32561g;
    }

    /* renamed from: e */
    private void m40479e() {
        if (this.f32568h != null) {
            m40492b(this.f32568h);
            this.f32570j.m40477a(this.f32568h);
        }
    }

    /* renamed from: a */
    public void m40488a(SparksEvent sparksEvent) {
        this.f32568h = sparksEvent;
    }

    /* renamed from: b */
    public void m40492b(SparksEvent sparksEvent) {
        if (sparksEvent != null) {
            m40482h();
            if (this.f32562a == null || this.f32564c == null || this.f32565d == null) {
                sparksEvent.put(ManagerWebServices.PARAM_FROM, "recommended");
            } else {
                int i = 0;
                if (this.f32565d.charAt(0) == '~') {
                    i = 1;
                }
                sparksEvent.put(ManagerWebServices.PARAM_FROM, i != 0 ? "SMS" : "deepLink");
                if (this.f32563b != null && this.f32563b.hasBadge()) {
                    sparksEvent.put("badgeType", this.f32563b.getFirstBadge().type);
                }
                sparksEvent.put("referralURL", this.f32564c);
                sparksEvent.put("referralString", this.f32566e);
            }
            sparksEvent.put("deepLinkFrom", this.f32567f);
        }
    }

    /* renamed from: f */
    private Builder m40480f() {
        Builder builder = DeepLinkReferralInfo.builder();
        if (this.f32562a == null || this.f32564c == null || this.f32565d == null) {
            builder.from("recommended");
        } else {
            String str = this.f32565d.charAt(0) == '~' ? "SMS" : "deepLink";
            builder.from(str).referralUrl(this.f32564c).referralString(this.f32566e);
        }
        return builder;
    }

    /* renamed from: d */
    public void m40493d() {
        this.f32562a = null;
        this.f32563b = null;
        this.f32565d = null;
        this.f32564c = null;
        this.f32566e = null;
    }

    /* renamed from: a */
    public void m40487a(DeepLinkParams deepLinkParams, DeepLinkListener deepLinkListener) {
        if (deepLinkParams != null) {
            deepLinkParams = deepLinkParams.getDeeplinkPath();
            if (deepLinkParams != null) {
                if (!deepLinkParams.isEmpty()) {
                    deepLinkParams = deepLinkParams.split("/");
                    if (deepLinkParams.length > 1) {
                        int i = 0;
                        String str = deepLinkParams[0];
                        int hashCode = str.hashCode();
                        if (hashCode == -786387342) {
                            if (str.equals("paywall")) {
                                i = 1;
                                switch (i) {
                                    case 0:
                                        deepLinkParams = deepLinkParams[1];
                                        if (deepLinkParams.equals("boost-paywall")) {
                                            if (deepLinkParams.equals("tplus-paywall") != null) {
                                                deepLinkListener.launchTinderPlusPaywall();
                                                break;
                                            }
                                        }
                                        deepLinkListener.launchBoostPaywall();
                                        break;
                                        break;
                                    case 1:
                                        deepLinkParams = deepLinkParams[1];
                                        deepLinkListener.launchTinderGoldPaywall();
                                        break;
                                    default:
                                        break;
                                }
                            }
                        } else if (hashCode == 93922211) {
                            if (str.equals(ManagerWebServices.PARAM_BOOST)) {
                                switch (i) {
                                    case 0:
                                        deepLinkParams = deepLinkParams[1];
                                        if (!(deepLinkParams == null || deepLinkParams.isEmpty())) {
                                            if (deepLinkParams.equals("boost-paywall")) {
                                                if (deepLinkParams.equals("tplus-paywall") != null) {
                                                    deepLinkListener.launchTinderPlusPaywall();
                                                    break;
                                                }
                                            }
                                            deepLinkListener.launchBoostPaywall();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        deepLinkParams = deepLinkParams[1];
                                        if (!(deepLinkParams == null || deepLinkParams.isEmpty() || deepLinkParams.equals(Subscription.GOLD) == null)) {
                                            deepLinkListener.launchTinderGoldPaywall();
                                            break;
                                        }
                                    default:
                                        break;
                                }
                            }
                        }
                        i = -1;
                        switch (i) {
                            case 0:
                                deepLinkParams = deepLinkParams[1];
                                if (deepLinkParams.equals("boost-paywall")) {
                                    if (deepLinkParams.equals("tplus-paywall") != null) {
                                        deepLinkListener.launchTinderPlusPaywall();
                                        break;
                                    }
                                }
                                deepLinkListener.launchBoostPaywall();
                                break;
                                break;
                            case 1:
                                deepLinkParams = deepLinkParams[1];
                                deepLinkListener.launchTinderGoldPaywall();
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private boolean m40481g() {
        for (DeepLinkedSharedRecInterceptor interceptOnProfileLoadFailed : this.f32572l) {
            if (interceptOnProfileLoadFailed.interceptOnProfileLoadFailed()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m40482h() {
        if (this.f32562a != null) {
            this.f32564c = this.f32562a.toString();
            String uri = this.f32562a.toString();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f32562a.getScheme());
            stringBuilder.append("://");
            String[] split = uri.replace(stringBuilder.toString(), "").split("/");
            if (split.length > 0 && split[0].equals("u")) {
                this.f32565d = split[1];
            }
        }
    }
}
