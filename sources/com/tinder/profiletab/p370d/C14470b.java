package com.tinder.profiletab.p370d;

import android.content.res.Resources;
import com.tinder.R;
import com.tinder.common.utils.C8578a;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.Photo.Render;
import com.tinder.domain.common.model.ProfileUser;
import com.tinder.domain.common.model.School;
import com.tinder.domain.utils.AgeCalculator;
import com.tinder.passport.model.C10045c;
import com.tinder.passport.model.PassportLocation;
import com.tinder.profiletab.p370d.C16186a.C16185a;
import java.util.List;
import javax.annotation.Nullable;
import javax.inject.Inject;

/* renamed from: com.tinder.profiletab.d.b */
public abstract class C14470b {

    /* renamed from: com.tinder.profiletab.d.b$a */
    public static abstract class C14468a {
        /* renamed from: a */
        public abstract C14468a mo11793a(String str);

        /* renamed from: a */
        public abstract C14470b mo11794a();

        /* renamed from: b */
        public abstract C14468a mo11795b(String str);

        /* renamed from: c */
        public abstract C14468a mo11796c(String str);

        /* renamed from: d */
        public abstract C14468a mo11797d(String str);

        /* renamed from: e */
        public abstract C14468a mo11798e(String str);
    }

    /* renamed from: com.tinder.profiletab.d.b$b */
    public static class C14469b {
        /* renamed from: a */
        private final Resources f45813a;
        /* renamed from: b */
        private final AgeCalculator f45814b;

        @Inject
        public C14469b(Resources resources, AgeCalculator ageCalculator) {
            this.f45813a = resources;
            this.f45814b = ageCalculator;
        }

        /* renamed from: a */
        public C14470b m55227a(ProfileUser profileUser, PassportLocation passportLocation) {
            return new C16185a().m61134a(profileUser).mo11793a(m55225b(profileUser)).mo11795b(m55222a(profileUser)).mo11796c(m55226b(profileUser.schools())).mo11797d(m55224a(profileUser.jobs())).mo11798e(m55223a(passportLocation)).mo11794a();
        }

        @Nullable
        /* renamed from: a */
        private String m55224a(List<Job> list) {
            for (Job job : list) {
                if (!job.companyDisplayed()) {
                    if (job.titleDisplayed()) {
                        break;
                    }
                }
                break;
            }
            Job job2 = null;
            if (job2 == null) {
                return null;
            }
            list = job2.titleDisplayed();
            boolean companyDisplayed = job2.companyDisplayed();
            if (list != null && !companyDisplayed) {
                return job2.titleName();
            }
            if (list == null && companyDisplayed) {
                return job2.companyName();
            }
            if (list == null || !companyDisplayed) {
                return null;
            }
            return this.f45813a.getString(R.string.job_at, new Object[]{job2.titleName(), job2.companyName()});
        }

        @Nullable
        /* renamed from: b */
        private String m55226b(List<School> list) {
            for (School school : list) {
                if (school.displayed()) {
                    return school.name();
                }
            }
            return null;
        }

        @Nullable
        /* renamed from: a */
        private String m55222a(ProfileUser profileUser) {
            profileUser = profileUser.photos();
            if (profileUser.isEmpty()) {
                return null;
            }
            Photo photo = (Photo) profileUser.get(0);
            if (photo.renders().isEmpty()) {
                return photo.url();
            }
            return ((Render) photo.renders().get(0)).url();
        }

        /* renamed from: b */
        private String m55225b(ProfileUser profileUser) {
            if (profileUser.hideAge()) {
                return profileUser.name();
            }
            return String.format("%s, %s", new Object[]{profileUser.name(), this.f45814b.yearsSinceDate(profileUser.birthDate())});
        }

        @Nullable
        /* renamed from: a */
        private String m55223a(PassportLocation passportLocation) {
            if (passportLocation != null) {
                if (!passportLocation.equals(C10045c.a())) {
                    Object city = passportLocation.getCity();
                    Object stateProvinceShort = passportLocation.getStateProvinceShort();
                    passportLocation = passportLocation.getCountryShort();
                    boolean a = C8578a.a(city) ^ true;
                    boolean a2 = C8578a.a(stateProvinceShort) ^ true;
                    boolean a3 = C8578a.a(passportLocation) ^ true;
                    if (a3 && !a2 && !a) {
                        return passportLocation;
                    }
                    if (a3 && a2 && !a) {
                        return String.format("%s, %s", new Object[]{stateProvinceShort, passportLocation});
                    } else if (a3 && !a2 && a) {
                        return String.format("%s, %s", new Object[]{city, passportLocation});
                    } else if (!a3 && a2 && a) {
                        return String.format("%s, %s", new Object[]{city, stateProvinceShort});
                    } else if (!a3 && a2 && !a) {
                        return stateProvinceShort;
                    } else {
                        if (!a3 && !a2 && a) {
                            return city;
                        }
                        if (a3 && a2 && a) {
                            return String.format("%s, %s, %s", new Object[]{city, stateProvinceShort, passportLocation});
                        }
                        throw new IllegalStateException(String.format("Unknown state: hasCountry[%s] hasState[%s] hasCity[%s]", new Object[]{Boolean.valueOf(a3), Boolean.valueOf(a2), Boolean.valueOf(a)}));
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public abstract ProfileUser mo11799a();

    /* renamed from: b */
    public abstract String mo11800b();

    @Nullable
    /* renamed from: c */
    public abstract String mo11801c();

    @Nullable
    /* renamed from: d */
    public abstract String mo11802d();

    @Nullable
    /* renamed from: e */
    public abstract String mo11803e();

    @Nullable
    /* renamed from: f */
    public abstract String mo11804f();
}
