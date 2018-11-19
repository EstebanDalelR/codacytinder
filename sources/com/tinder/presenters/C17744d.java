package com.tinder.presenters;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import com.tinder.analytics.C2634g;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.auth.interactor.C8279j;
import com.tinder.auth.model.AuthType;
import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.navigation.Screen.C10685d;
import com.tinder.common.utils.C8578a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.common.model.Gender.Value;
import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.model.School;
import com.tinder.domain.common.model.Subscription;
import com.tinder.domain.common.model.User;
import com.tinder.domain.config.model.JobEditingConfig;
import com.tinder.domain.config.model.SchoolEditingConfig;
import com.tinder.domain.meta.model.PlusControlSettings;
import com.tinder.domain.meta.model.PlusControlSettings.Builder;
import com.tinder.domain.profile.experiment.NewPhotoGridExperiment;
import com.tinder.domain.profile.model.EditProfileUpdateStatus;
import com.tinder.domain.profile.model.ProfileOption;
import com.tinder.domain.profile.model.ProfileOption.PlusControl;
import com.tinder.domain.profile.model.ProfileOption.Purchase;
import com.tinder.domain.profile.model.ProfileUserUpdateRequest;
import com.tinder.domain.profile.repository.JobRepository;
import com.tinder.domain.profile.repository.SchoolRepository;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.SMSUpdateJob;
import com.tinder.domain.profile.usecase.SMSUpdateJob.Request;
import com.tinder.domain.profile.usecase.SMSUpdateSchool;
import com.tinder.domain.profile.usecase.SavePlusControlSettings;
import com.tinder.domain.profile.usecase.UpdateProfile;
import com.tinder.etl.event.ro;
import com.tinder.etl.event.rp;
import com.tinder.etl.event.rq;
import com.tinder.managers.ManagerProfile;
import com.tinder.managers.UserMetaManager;
import com.tinder.managers.bk;
import com.tinder.model.GlobalConfig;
import com.tinder.model.UserMeta;
import com.tinder.spotify.p415a.C15035a;
import com.tinder.targets.FragmentViewProfileTarget;
import com.tinder.tinderplus.analytics.AddUserInteractionPlusControlSettingsEvent;
import com.tinder.tinderplus.analytics.AddUserInteractionPlusControlSettingsEvent.Subcategory;
import com.tinder.tinderplus.p428a.C15191d.C16926a;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.utils.RxUtils;
import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.disposables.C17356a;
import io.reactivex.disposables.Disposable;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import java8.util.Optional;
import javax.inject.Inject;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Func1;
import rx.p500e.C19573b;

/* renamed from: com.tinder.presenters.d */
public class C17744d extends PresenterBase<FragmentViewProfileTarget> {
    /* renamed from: a */
    private final C15035a f55229a;
    /* renamed from: b */
    private final AbTestUtility f55230b;
    /* renamed from: c */
    private final UserMetaManager f55231c;
    /* renamed from: d */
    private final C2630h f55232d;
    /* renamed from: e */
    private final ManagerProfile f55233e;
    /* renamed from: f */
    private final C8279j f55234f;
    /* renamed from: g */
    private final C2634g f55235g;
    /* renamed from: h */
    private final SMSUpdateJob f55236h;
    /* renamed from: i */
    private final UpdateProfile f55237i;
    /* renamed from: j */
    private final SMSUpdateSchool f55238j;
    /* renamed from: k */
    private final SavePlusControlSettings f55239k;
    /* renamed from: l */
    private final LoadProfileOptionData f55240l;
    /* renamed from: m */
    private final C15193i f55241m;
    /* renamed from: n */
    private final bk f55242n;
    /* renamed from: o */
    private final JobRepository f55243o;
    /* renamed from: p */
    private final AddUserInteractionPlusControlSettingsEvent f55244p;
    /* renamed from: q */
    private Builder f55245q;
    /* renamed from: r */
    private final SchoolRepository f55246r;
    /* renamed from: s */
    private final NewPhotoGridExperiment f55247s;
    /* renamed from: t */
    private final CurrentScreenNotifier f55248t;
    /* renamed from: u */
    private final C19573b f55249u = new C19573b();
    /* renamed from: v */
    private final C17356a f55250v = new C17356a();

    /* renamed from: com.tinder.presenters.d$a */
    static class C14356a {
        /* renamed from: a */
        private final User f45550a;
        /* renamed from: b */
        private final Instagram f45551b;

        C14356a(User user, Instagram instagram) {
            this.f45550a = user;
            this.f45551b = instagram;
        }
    }

    /* renamed from: s */
    static final /* synthetic */ void m64712s() throws Exception {
    }

    @Inject
    public C17744d(C15035a c15035a, AbTestUtility abTestUtility, ManagerProfile managerProfile, UserMetaManager userMetaManager, C2630h c2630h, C8279j c8279j, C2634g c2634g, SMSUpdateJob sMSUpdateJob, UpdateProfile updateProfile, SMSUpdateSchool sMSUpdateSchool, SavePlusControlSettings savePlusControlSettings, LoadProfileOptionData loadProfileOptionData, C15193i c15193i, bk bkVar, SchoolRepository schoolRepository, JobRepository jobRepository, AddUserInteractionPlusControlSettingsEvent addUserInteractionPlusControlSettingsEvent, NewPhotoGridExperiment newPhotoGridExperiment, CurrentScreenNotifier currentScreenNotifier) {
        this.f55229a = c15035a;
        this.f55230b = abTestUtility;
        this.f55233e = managerProfile;
        this.f55231c = userMetaManager;
        this.f55232d = c2630h;
        this.f55234f = c8279j;
        this.f55235g = c2634g;
        this.f55236h = sMSUpdateJob;
        this.f55238j = sMSUpdateSchool;
        this.f55237i = updateProfile;
        this.f55239k = savePlusControlSettings;
        this.f55240l = loadProfileOptionData;
        this.f55241m = c15193i;
        this.f55242n = bkVar;
        this.f55246r = schoolRepository;
        this.f55243o = jobRepository;
        this.f55244p = addUserInteractionPlusControlSettingsEvent;
        this.f55247s = newPhotoGridExperiment;
        this.f55248t = currentScreenNotifier;
    }

    /* renamed from: b */
    public void m64731b() {
        FragmentViewProfileTarget fragmentViewProfileTarget = (FragmentViewProfileTarget) H();
        if (fragmentViewProfileTarget != null) {
            if (this.f55247s.getEnabled()) {
                fragmentViewProfileTarget.showNewPhotoGrid();
            }
            UserMeta metaUser = this.f55231c.getMetaUser();
            if (metaUser != null) {
                if (metaUser.getGlobalConfig() != null) {
                    GlobalConfig globalConfig = metaUser.getGlobalConfig();
                    JobEditingConfig jobEditingConfig = globalConfig.jobEditingConfig();
                    if (jobEditingConfig.getEditable()) {
                        fragmentViewProfileTarget.enableJobEditing();
                        fragmentViewProfileTarget.setJobEditingMaxLength(jobEditingConfig.getTitleMaxLength(), jobEditingConfig.getCompanyMaxLength());
                    } else {
                        fragmentViewProfileTarget.disableJobEditing();
                    }
                    SchoolEditingConfig schoolEditingConfig = globalConfig.schoolEditingConfig();
                    if (schoolEditingConfig.getEditable()) {
                        fragmentViewProfileTarget.enableSchoolEditing();
                        fragmentViewProfileTarget.setSchoolEditingMaxLength(schoolEditingConfig.getMaxLength());
                    } else {
                        fragmentViewProfileTarget.disableSchoolsEditing();
                    }
                    m64715w();
                    return;
                }
            }
            fragmentViewProfileTarget.disableJobEditing();
            fragmentViewProfileTarget.disableSchoolsEditing();
        }
    }

    /* renamed from: c */
    public void m64735c() {
        FragmentViewProfileTarget fragmentViewProfileTarget = (FragmentViewProfileTarget) H();
        if (fragmentViewProfileTarget != null) {
            if (m64738d()) {
                fragmentViewProfileTarget.enableSpotifyViews();
            } else {
                fragmentViewProfileTarget.hideSpotifyViews();
            }
            if (this.f55230b.isMoreGenderEnabled()) {
                fragmentViewProfileTarget.enableMoreGenderView();
            } else {
                fragmentViewProfileTarget.hideMoreGenderView();
            }
            m64713u();
            m64691a(fragmentViewProfileTarget);
        }
    }

    /* renamed from: a */
    private void m64691a(FragmentViewProfileTarget fragmentViewProfileTarget) {
        if (this.f55230b.profileV2EnabledForRevenue()) {
            this.f55250v.add(C3959e.combineLatest(this.f55240l.execute(Purchase.INSTANCE), this.f55240l.execute(PlusControl.INSTANCE), new C16048e(this)).subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new C16049f(fragmentViewProfileTarget), C16062q.f49928a));
        } else {
            this.f55249u.a(this.f55241m.m57122b().a(RxUtils.a()).a(new ab(this, fragmentViewProfileTarget), am.f57862a));
        }
    }

    /* renamed from: a */
    final /* synthetic */ Pair m64716a(Subscription subscription, PlusControlSettings plusControlSettings) throws Exception {
        this.f55245q = plusControlSettings.toBuilder();
        return Pair.create(subscription, plusControlSettings);
    }

    /* renamed from: a */
    static final /* synthetic */ void m64692a(FragmentViewProfileTarget fragmentViewProfileTarget, Pair pair) throws Exception {
        Subscription subscription = (Subscription) pair.first;
        PlusControlSettings plusControlSettings = (PlusControlSettings) pair.second;
        fragmentViewProfileTarget.displayPlusControlSettings(subscription.isActiveSubscription(), plusControlSettings.isHideAge(), plusControlSettings.isHideDistance());
    }

    /* renamed from: a */
    final /* synthetic */ void m64719a(FragmentViewProfileTarget fragmentViewProfileTarget, Boolean bool) {
        fragmentViewProfileTarget.displayPlusControlSettings(bool.booleanValue(), this.f55242n.Q(), this.f55242n.R());
    }

    /* renamed from: u */
    private void m64713u() {
        this.f55250v.add(C3959e.combineLatest(this.f55240l.execute(ProfileOption.User.INSTANCE), this.f55240l.execute(ProfileOption.Instagram.INSTANCE), ax.f49841a).subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new bb(this), bc.f49843a));
    }

    /* renamed from: a */
    final /* synthetic */ void m64718a(C14356a c14356a) throws Exception {
        m64690a(c14356a.f45550a);
        m64688a(c14356a.f45551b);
    }

    /* renamed from: a */
    private void m64690a(User user) {
        a(new bd(this, user));
    }

    /* renamed from: a */
    final /* synthetic */ void m64717a(User user, FragmentViewProfileTarget fragmentViewProfileTarget) {
        fragmentViewProfileTarget.setName(user.name());
        fragmentViewProfileTarget.setBio(user.bio());
        user = user.gender();
        if (this.f55230b.isMoreGenderEnabled()) {
            fragmentViewProfileTarget.setUserGender(user.value(), user.customGender());
        } else {
            fragmentViewProfileTarget.setGender(user.value());
        }
    }

    /* renamed from: a */
    private void m64688a(Instagram instagram) {
        a(new be(instagram));
    }

    /* renamed from: a */
    static final /* synthetic */ void m64689a(Instagram instagram, FragmentViewProfileTarget fragmentViewProfileTarget) {
        instagram = instagram.username();
        if (C8578a.a(instagram)) {
            fragmentViewProfileTarget.showInstagramDisconnected();
        } else {
            fragmentViewProfileTarget.showInstagramConnected(instagram);
        }
    }

    /* renamed from: a */
    public void m64730a(boolean z, @NonNull String str, @Nullable Value value, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        C3960g.a(m64709d(str2, str3), m64705c(str4), m64686a(str, value)).o().e(C16050g.f49909a).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new C16053h(this)).a(new C16054i(this)).a(new C16055j(this, z), new C16056k(this));
        if (this.f55230b.profileV2EnabledForRevenue() && this.f55245q) {
            this.f55250v.add(this.f55239k.execute(this.f55245q.build()).b(C15756a.m59010b()).a(C16057l.f49922a, C16058m.f49923a));
        }
    }

    /* renamed from: c */
    static final /* synthetic */ EditProfileUpdateStatus m64704c(List list) throws Exception {
        return list.contains(EditProfileUpdateStatus.UPDATED) != null ? EditProfileUpdateStatus.UPDATED : EditProfileUpdateStatus.NO_CHANGE;
    }

    /* renamed from: a */
    final /* synthetic */ void m64720a(Disposable disposable) throws Exception {
        a(ba.f57873a);
    }

    /* renamed from: t */
    final /* synthetic */ void m64753t() throws Exception {
        a(az.f57872a);
    }

    /* renamed from: a */
    final /* synthetic */ void m64728a(boolean z, EditProfileUpdateStatus editProfileUpdateStatus) throws Exception {
        if (editProfileUpdateStatus == EditProfileUpdateStatus.NO_CHANGE && z) {
            a(aw.f57870a);
            return;
        }
        if (editProfileUpdateStatus == EditProfileUpdateStatus.UPDATED) {
            a(new ay(z));
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m64698a(boolean z, FragmentViewProfileTarget fragmentViewProfileTarget) {
        fragmentViewProfileTarget.showProfileUpdatedSnackbar();
        if (z) {
            fragmentViewProfileTarget.finishActivityWithSuccess();
        }
    }

    /* renamed from: d */
    final /* synthetic */ void m64737d(Throwable th) throws Exception {
        C0001a.c(th, "Error saving profile", new Object[0]);
        a(av.f57869a);
    }

    /* renamed from: a */
    private C3960g<EditProfileUpdateStatus> m64686a(@NonNull String str, @Nullable Value value) {
        if (this.f55230b.isMoreGenderEnabled()) {
            value = null;
        }
        return this.f55237i.execute(new ProfileUserUpdateRequest(str, value, null, null)).b(new C16059n(this, str));
    }

    /* renamed from: a */
    final /* synthetic */ void m64723a(@NonNull String str, EditProfileUpdateStatus editProfileUpdateStatus) throws Exception {
        if (editProfileUpdateStatus == EditProfileUpdateStatus.UPDATED) {
            m64700b(str);
        }
    }

    /* renamed from: d */
    public boolean m64738d() {
        return this.f55229a.m56667a();
    }

    /* renamed from: e */
    public void m64739e() {
        this.f55243o.load().map(C16060o.f49926a).subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new C16061p(this), C16063r.f49929a);
    }

    /* renamed from: b */
    static final /* synthetic */ Optional m64699b(List list) throws Exception {
        int size = list.size();
        int i = 0;
        while (i < size) {
            Object obj = (Job) list.get(i);
            Object obj2 = 1;
            Object obj3 = (TextUtils.isEmpty(obj.companyName()) || !obj.companyDisplayed()) ? null : 1;
            if (TextUtils.isEmpty(obj.titleName()) || !obj.titleDisplayed()) {
                obj2 = null;
            }
            if (obj3 == null) {
                if (obj2 == null) {
                    i++;
                }
            }
            return Optional.m59121b(obj);
        }
        return Optional.m59119a();
    }

    /* renamed from: b */
    final /* synthetic */ void m64733b(Optional optional) throws Exception {
        a(new au(optional));
    }

    /* renamed from: f */
    public void m64740f() {
        if (this.f55234f.a() == AuthType.FACEBOOK) {
            a(C18583s.f57950a);
        } else {
            a(C18584t.f57951a);
        }
    }

    /* renamed from: g */
    public void m64741g() {
        a(C18585u.f57952a);
    }

    /* renamed from: h */
    public void m64742h() {
        this.f55246r.load().map(C16064v.f49930a).subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new C16065w(this), C16066x.f49932a);
    }

    /* renamed from: a */
    static final /* synthetic */ Optional m64687a(List list) throws Exception {
        Object obj = null;
        for (School school : list) {
            if (school.displayed()) {
                Spanned fromHtml = Html.fromHtml(school.name());
                if (obj == null) {
                    obj = fromHtml;
                } else {
                    obj = TextUtils.concat(new CharSequence[]{obj, ", ", fromHtml});
                }
            }
        }
        return Optional.m59121b(obj);
    }

    /* renamed from: a */
    final /* synthetic */ void m64727a(Optional optional) throws Exception {
        if (G()) {
            optional.m59126a(new as(this), new at(this));
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m64721a(CharSequence charSequence) {
        ((FragmentViewProfileTarget) H()).showMySchool(charSequence);
    }

    /* renamed from: r */
    final /* synthetic */ void m64752r() {
        ((FragmentViewProfileTarget) H()).hideMySchool();
    }

    /* renamed from: a */
    public void m64729a(boolean z, String str) {
        if (this.f55230b.profileV2EnabledForRevenue()) {
            this.f55245q.isHideAge(z);
        } else {
            this.f55233e.c(z, new C16926a(str));
        }
        this.f55244p.m62612a(z ? Subcategory.HIDE_AGE : Subcategory.UNHIDE_AGE);
    }

    /* renamed from: b */
    public void m64734b(boolean z, String str) {
        if (this.f55230b.profileV2EnabledForRevenue()) {
            this.f55245q.isHideDistance(z);
        } else {
            this.f55233e.b(z, new C16926a(str));
        }
        this.f55244p.m62612a(z ? Subcategory.HIDE_DISTANCE : Subcategory.UNHIDE_DISTANCE);
    }

    /* renamed from: i */
    public void m64743i() {
        this.f55249u.a();
        this.f55250v.m63446a();
    }

    /* renamed from: j */
    public void m64744j() {
        if (this.f55247s.getEnabled()) {
            a(C18586y.f57953a);
        }
        a(C18587z.f57954a);
    }

    /* renamed from: k */
    public void m64745k() {
        if (this.f55247s.getEnabled()) {
            a(aa.f57853a);
        } else {
            a(ac.f57856a);
        }
    }

    /* renamed from: a */
    public void m64722a(String str) {
        if (this.f55247s.getEnabled()) {
            a(new ad(str));
        } else {
            a(new ae(str));
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    void m64724a(@Nullable String str, @Nullable String str2) {
        this.f55232d.a(rp.a().b(str).a(str2).a());
    }

    @VisibleForTesting
    /* renamed from: b */
    void m64732b(@Nullable String str, @Nullable String str2) {
        this.f55232d.a(ro.a().b(str).a(str2).a());
    }

    @VisibleForTesting
    /* renamed from: c */
    void m64736c(@Nullable String str, @Nullable String str2) {
        this.f55232d.a(rq.a().a(str).b(str2).a());
    }

    /* renamed from: b */
    private void m64700b(@NonNull String str) {
        this.f55235g.f(str.length() > null ? true : null);
    }

    /* renamed from: d */
    private C3960g<EditProfileUpdateStatus> m64709d(@NonNull String str, @NonNull String str2) {
        UserMeta metaUser = this.f55231c.getMetaUser();
        if (metaUser != null) {
            if (metaUser.getGlobalConfig().canEditJobs()) {
                return this.f55236h.execute(new Request(C17744d.m64710e(str, str2), new af(this, str, str2)));
            }
        }
        return C3960g.a(EditProfileUpdateStatus.NO_CHANGE);
    }

    /* renamed from: a */
    final /* synthetic */ void m64725a(@NonNull String str, @NonNull String str2, List list) {
        m64706c(str, list);
        m64702b(str2, list);
    }

    /* renamed from: c */
    private C3960g<EditProfileUpdateStatus> m64705c(@NonNull String str) {
        UserMeta metaUser = this.f55231c.getMetaUser();
        if (metaUser != null) {
            if (metaUser.getGlobalConfig().canEditSchools()) {
                return this.f55238j.execute(new SMSUpdateSchool.Request(C17744d.m64708d(str), new ag(this, str)));
            }
        }
        return C3960g.a(EditProfileUpdateStatus.NO_CHANGE);
    }

    /* renamed from: a */
    final /* synthetic */ void m64726a(@NonNull String str, List list) {
        m64695a(list, str);
    }

    /* renamed from: a */
    private void m64695a(@NonNull List<? extends School> list, @NonNull String str) {
        m64736c(!list.isEmpty() ? ((School) list.get(0)).name() : null, str);
    }

    /* renamed from: b */
    private void m64702b(@NonNull String str, List<? extends Job> list) {
        if (list.isEmpty()) {
            if (str.isEmpty() == null) {
                m64732b((String) null, str);
            }
            return;
        }
        String companyName = ((Job) list.get(0)).companyName();
        if (!str.equals(companyName)) {
            m64732b(companyName, str);
        }
    }

    /* renamed from: c */
    private void m64706c(@NonNull String str, List<? extends Job> list) {
        if (list.isEmpty()) {
            if (str.isEmpty() == null) {
                m64724a((String) null, str);
            }
            return;
        }
        String titleName = ((Job) list.get(0)).titleName();
        if (!str.equals(titleName)) {
            m64732b(titleName, str);
        }
    }

    /* renamed from: d */
    private static School m64708d(@NonNull String str) {
        return School.builder().name(str).displayed(TextUtils.isEmpty(str) ^ 1).build();
    }

    /* renamed from: e */
    private static Job m64710e(@NonNull String str, @NonNull String str2) {
        return Job.builder().titleName(str).titleDisplayed(TextUtils.isEmpty(str) ^ 1).companyName(str2).companyDisplayed(TextUtils.isEmpty(str2) ^ 1).build();
    }

    /* renamed from: l */
    public void m64746l() {
        m64697a(ah.f55206a, new ai(this), new aj(this));
    }

    /* renamed from: q */
    final /* synthetic */ void m64751q() {
        a(ar.f57867a);
    }

    /* renamed from: p */
    final /* synthetic */ void m64750p() {
        a(aq.f57866a);
    }

    /* renamed from: m */
    public void m64747m() {
        m64697a(ak.f55207a, new al(this), new an(this));
    }

    /* renamed from: o */
    final /* synthetic */ void m64749o() {
        a(ap.f57865a);
    }

    /* renamed from: n */
    final /* synthetic */ void m64748n() {
        a(ao.f57864a);
    }

    @Nullable
    /* renamed from: v */
    private GlobalConfig m64714v() {
        UserMeta metaUser = this.f55231c.getMetaUser();
        if (metaUser != null) {
            if (metaUser.getGlobalConfig() != null) {
                return metaUser.getGlobalConfig();
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m64697a(Func1<GlobalConfig, Boolean> func1, Action0 action0, Action0 action02) {
        if (m64714v() == null) {
            return;
        }
        if (((Boolean) func1.call(m64714v())).booleanValue() != null) {
            action0.call();
        } else {
            action02.call();
        }
    }

    /* renamed from: w */
    private void m64715w() {
        this.f55248t.notify(C10685d.f35026a);
    }
}
