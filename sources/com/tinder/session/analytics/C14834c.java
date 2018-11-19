package com.tinder.session.analytics;

import com.tinder.api.model.settings.PushSettingsKt;
import com.tinder.data.user.CurrentUserProvider;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.common.model.School;
import com.tinder.domain.common.model.User;
import com.tinder.domain.profile.model.AccountInformation;
import com.tinder.domain.profile.model.ProductType;
import com.tinder.domain.profile.model.ProfileOption.AccountInfo;
import com.tinder.domain.profile.model.ProfileOption.EmailSettings;
import com.tinder.domain.profile.model.ProfileOption.Instagram;
import com.tinder.domain.profile.model.ProfileOption.Places;
import com.tinder.domain.profile.model.settings.PlacesSettings;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.etl.event.zu;
import com.tinder.etl.event.zu.C9358a;
import com.tinder.managers.bj;
import com.tinder.managers.bk;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.session.analytics.p402a.C18051a;
import io.reactivex.C3960g;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J>\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170%J\u0014\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020,H\u0002J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00120%H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/tinder/session/analytics/UserEventFactory;", "", "managerSharedPreferences", "Lcom/tinder/managers/ManagerSharedPreferences;", "managerSettings", "Lcom/tinder/managers/ManagerSettings;", "offerRepository", "Lcom/tinder/purchase/domain/repository/OfferRepository;", "currentUserProvider", "Lcom/tinder/data/user/CurrentUserProvider;", "loadProfileOption", "Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;", "createEmailSettingsAnalyticsPayload", "Lcom/tinder/session/analytics/settingsemail/CreateEmailSettingsAnalyticsPayload;", "(Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/managers/ManagerSettings;Lcom/tinder/purchase/domain/repository/OfferRepository;Lcom/tinder/data/user/CurrentUserProvider;Lcom/tinder/domain/profile/usecase/LoadProfileOptionData;Lcom/tinder/session/analytics/settingsemail/CreateEmailSettingsAnalyticsPayload;)V", "appendJobAnalyticsFields", "", "jobs", "", "Lcom/tinder/domain/common/model/Job;", "userEvent", "Lcom/tinder/etl/event/UserEvent$Builder;", "combine", "Lcom/tinder/etl/event/UserEvent;", "me", "Lcom/tinder/domain/common/model/ProfileUser;", "plusOffers", "Lcom/tinder/purchase/domain/model/Offer;", "accountInfo", "Lcom/tinder/domain/profile/model/AccountInformation;", "emailSettings", "Lcom/tinder/domain/settings/email/model/EmailSettings;", "placeSettings", "Lcom/tinder/domain/profile/model/settings/PlacesSettings;", "instagram", "Lcom/tinder/domain/common/model/Instagram;", "createEvent", "Lio/reactivex/Single;", "createPushNotificationPayload", "", "", "", "displayedSchoolName", "user", "Lcom/tinder/domain/common/model/User;", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.session.analytics.c */
public final class C14834c {
    @Deprecated
    /* renamed from: a */
    public static final C14833a f46441a = new C14833a();
    /* renamed from: b */
    private final bk f46442b;
    /* renamed from: c */
    private final bj f46443c;
    /* renamed from: d */
    private final OfferRepository f46444d;
    /* renamed from: e */
    private final CurrentUserProvider f46445e;
    /* renamed from: f */
    private final LoadProfileOptionData f46446f;
    /* renamed from: g */
    private final C18051a f46447g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/tinder/session/analytics/UserEventFactory$Companion;", "", "()V", "FIELD_MESSAGE_LIKE_PUSH_ON", "", "FIELD_NEW_MATCH_PUSH_ON", "FIELD_NEW_MESSAGE_PUSH_ON", "FIELD_SUPER_LIKE_PUSH_ON", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.session.analytics.c$a */
    private static final class C14833a {
        private C14833a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012(\u0010\u0004\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/tinder/purchase/domain/model/Offer;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.session.analytics.c$b */
    static final class C16580b<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16580b f51282a = new C16580b();

        C16580b() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m62013a((List) obj);
        }

        @NotNull
        /* renamed from: a */
        public final List<C14510e> m62013a(@NotNull List<C14510e> list) {
            C2668g.b(list, "it");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if ((((C14510e) next).mo11840b() == ProductType.PLUS ? 1 : null) != null) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    @Inject
    public C14834c(@NotNull bk bkVar, @NotNull bj bjVar, @NotNull OfferRepository offerRepository, @NotNull CurrentUserProvider currentUserProvider, @NotNull LoadProfileOptionData loadProfileOptionData, @NotNull C18051a c18051a) {
        C2668g.b(bkVar, "managerSharedPreferences");
        C2668g.b(bjVar, "managerSettings");
        C2668g.b(offerRepository, "offerRepository");
        C2668g.b(currentUserProvider, "currentUserProvider");
        C2668g.b(loadProfileOptionData, "loadProfileOption");
        C2668g.b(c18051a, "createEmailSettingsAnalyticsPayload");
        this.f46442b = bkVar;
        this.f46443c = bjVar;
        this.f46444d = offerRepository;
        this.f46445e = currentUserProvider;
        this.f46446f = loadProfileOptionData;
        this.f46447g = c18051a;
    }

    @NotNull
    /* renamed from: a */
    public final C3960g<zu> m56202a() {
        Observable observe = this.f46445e.observe();
        C2668g.a(observe, "currentUserProvider.observe()");
        C3960g<zu> a = C3960g.a(RxJavaInteropExtKt.toV2Observable(observe).firstOrError(), m56200b(), this.f46446f.execute(AccountInfo.INSTANCE).firstOrError(), this.f46446f.execute(EmailSettings.INSTANCE).firstOrError(), this.f46446f.execute(Places.INSTANCE).firstOrError(), this.f46446f.execute(Instagram.INSTANCE).first(com.tinder.domain.common.model.Instagram.DISCONNECTED), new C16581d(new UserEventFactory$createEvent$1(this)));
        C2668g.a(a, "Single.zip(\n            …(this::combine)\n        )");
        return a;
    }

    /* renamed from: b */
    private final C3960g<List<C14510e>> m56200b() {
        Observable observeAllOffers = this.f46444d.observeAllOffers();
        C2668g.a(observeAllOffers, "offerRepository.observeAllOffers()");
        C3960g<List<C14510e>> e = RxJavaInteropExtKt.toV2Observable(observeAllOffers).firstOrError().e(C16580b.f51282a);
        C2668g.a(e, "offerRepository.observeA…ductType.PLUS }\n        }");
        return e;
    }

    /* renamed from: a */
    private final zu m56196a(ProfileUser profileUser, List<? extends C14510e> list, AccountInformation accountInformation, com.tinder.domain.settings.email.model.EmailSettings emailSettings, PlacesSettings placesSettings, com.tinder.domain.common.model.Instagram instagram) {
        C14510e c14510e;
        CharSequence charSequence;
        Object obj;
        CharSequence username = instagram.username();
        int i = 0;
        if (username != null) {
            if (username.length() != null) {
                instagram = null;
                instagram ^= 1;
                c14510e = (C14510e) C19299w.m68831g((List) list);
                list = c14510e == null ? c14510e.mo11839a() : null;
                emailSettings = this.f46447g.m65529a(emailSettings);
                accountInformation = zu.a().a(Long.valueOf(accountInformation.getCreatedTime().getMillis())).f(profileUser.name()).a(profileUser.bio()).d(Integer.valueOf(this.f46443c.c())).c(Integer.valueOf(this.f46443c.d())).f(Float.valueOf(this.f46443c.b())).b(profileUser.gender().customGender()).b(m56201c()).a(Boolean.valueOf(this.f46443c.g()));
                charSequence = (CharSequence) list;
                if (charSequence != null) {
                    if (charSequence.length() == 0) {
                        obj = null;
                        if (obj != null) {
                            list = null;
                        }
                        list = accountInformation.h(list);
                        if (instagram != null) {
                            i = 1;
                        }
                        list = list.b(Integer.valueOf(i)).e(Integer.valueOf(profileUser.photos().size())).g(m56198a(profileUser)).d(emailSettings.m56194a()).a(emailSettings.m56195b()).b(Boolean.valueOf(placesSettings.getEnabled()));
                        profileUser = profileUser.jobs();
                        C2668g.a(profileUser, "me.jobs()");
                        C2668g.a(list, "builder");
                        m56199a(profileUser, list);
                        profileUser = list.a();
                        C2668g.a(profileUser, "builder.build()");
                        return profileUser;
                    }
                }
                obj = 1;
                if (obj != null) {
                    list = null;
                }
                list = accountInformation.h(list);
                if (instagram != null) {
                    i = 1;
                }
                list = list.b(Integer.valueOf(i)).e(Integer.valueOf(profileUser.photos().size())).g(m56198a(profileUser)).d(emailSettings.m56194a()).a(emailSettings.m56195b()).b(Boolean.valueOf(placesSettings.getEnabled()));
                profileUser = profileUser.jobs();
                C2668g.a(profileUser, "me.jobs()");
                C2668g.a(list, "builder");
                m56199a(profileUser, list);
                profileUser = list.a();
                C2668g.a(profileUser, "builder.build()");
                return profileUser;
            }
        }
        instagram = true;
        instagram ^= 1;
        c14510e = (C14510e) C19299w.m68831g((List) list);
        if (c14510e == null) {
        }
        emailSettings = this.f46447g.m65529a(emailSettings);
        accountInformation = zu.a().a(Long.valueOf(accountInformation.getCreatedTime().getMillis())).f(profileUser.name()).a(profileUser.bio()).d(Integer.valueOf(this.f46443c.c())).c(Integer.valueOf(this.f46443c.d())).f(Float.valueOf(this.f46443c.b())).b(profileUser.gender().customGender()).b(m56201c()).a(Boolean.valueOf(this.f46443c.g()));
        charSequence = (CharSequence) list;
        if (charSequence != null) {
            if (charSequence.length() == 0) {
                obj = null;
                if (obj != null) {
                    list = null;
                }
                list = accountInformation.h(list);
                if (instagram != null) {
                    i = 1;
                }
                list = list.b(Integer.valueOf(i)).e(Integer.valueOf(profileUser.photos().size())).g(m56198a(profileUser)).d(emailSettings.m56194a()).a(emailSettings.m56195b()).b(Boolean.valueOf(placesSettings.getEnabled()));
                profileUser = profileUser.jobs();
                C2668g.a(profileUser, "me.jobs()");
                C2668g.a(list, "builder");
                m56199a(profileUser, list);
                profileUser = list.a();
                C2668g.a(profileUser, "builder.build()");
                return profileUser;
            }
        }
        obj = 1;
        if (obj != null) {
            list = null;
        }
        list = accountInformation.h(list);
        if (instagram != null) {
            i = 1;
        }
        list = list.b(Integer.valueOf(i)).e(Integer.valueOf(profileUser.photos().size())).g(m56198a(profileUser)).d(emailSettings.m56194a()).a(emailSettings.m56195b()).b(Boolean.valueOf(placesSettings.getEnabled()));
        profileUser = profileUser.jobs();
        C2668g.a(profileUser, "me.jobs()");
        C2668g.a(list, "builder");
        m56199a(profileUser, list);
        profileUser = list.a();
        C2668g.a(profileUser, "builder.build()");
        return profileUser;
    }

    /* renamed from: a */
    private final String m56198a(User user) {
        user = user.schools();
        C2668g.a(user, "user.schools()");
        for (Object next : (Iterable) user) {
            if (((School) next).displayed()) {
                break;
            }
        }
        Object next2 = null;
        School school = (School) next2;
        return school != null ? school.name() : null;
    }

    /* renamed from: c */
    private final Map<String, Boolean> m56201c() {
        bk bkVar = this.f46442b;
        return ah.m66889a(C15811g.m59834a("new_match", Boolean.valueOf(bkVar.h())), C15811g.m59834a("new_message", Boolean.valueOf(bkVar.i())), C15811g.m59834a(PushSettingsKt.KEY_PUSH_MESSAGE_LIKE, Boolean.valueOf(bkVar.j())), C15811g.m59834a("super_like", Boolean.valueOf(bkVar.e())));
    }

    /* renamed from: a */
    private final void m56199a(List<? extends Job> list, C9358a c9358a) {
        Collection arrayList = new ArrayList();
        list = list.iterator();
        while (true) {
            int i = 1;
            if (!list.hasNext()) {
                break;
            }
            Object next = list.next();
            Job job = (Job) next;
            Object obj = (job.titleName() == null || !job.titleDisplayed()) ? null : 1;
            Object obj2 = (job.companyName() == null || !job.companyDisplayed()) ? null : 1;
            if (obj == null) {
                if (obj2 == null) {
                    i = 0;
                }
            }
            if (i != 0) {
                arrayList.add(next);
            }
        }
        for (Job job2 : C19299w.m68820d((Iterable) (List) arrayList, 1)) {
            if (job2.titleDisplayed()) {
                c9358a.e(job2.titleName());
            }
            if (job2.companyDisplayed()) {
                c9358a.c(job2.companyName());
            }
        }
    }
}
