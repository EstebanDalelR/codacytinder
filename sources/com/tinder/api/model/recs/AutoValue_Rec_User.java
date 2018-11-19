package com.tinder.api.model.recs;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.Badge;
import com.tinder.api.model.common.Job;
import com.tinder.api.model.common.Photo;
import com.tinder.api.model.common.School;
import com.tinder.api.model.recs.Rec.User;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Rec_User extends C$AutoValue_Rec_User {

    public static final class MoshiJsonAdapter extends JsonAdapter<User> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_ID_UNDERSCORE, ManagerWebServices.PARAM_BIO, ManagerWebServices.PARAM_BIRTH_DATE, ManagerWebServices.PARAM_BADGES, "name", "photos", "gender", ManagerWebServices.PARAM_JOBS, ManagerWebServices.PARAM_SCHOOLS, ManagerWebServices.PARAM_IS_TRAVELING, ManagerWebServices.PARAM_SHOW_GENDER, ManagerWebServices.PARAM_HIDE_AGE, ManagerWebServices.PARAM_VERIFIED, ManagerWebServices.PARAM_IS_BRAND, ManagerWebServices.PARAM_HIDE_DISTANCE, ManagerWebServices.PARAM_SELECT_MEMBER, ManagerWebServices.PARAM_CUSTOM_GENDER};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<List<Badge>> badgesAdapter;
        private final JsonAdapter<String> bioAdapter;
        private final JsonAdapter<String> birthDateAdapter;
        private final JsonAdapter<String> customGenderAdapter;
        private final JsonAdapter<Integer> genderAdapter;
        private final JsonAdapter<Boolean> hideAgeAdapter;
        private final JsonAdapter<Boolean> hideDistanceAdapter;
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<Boolean> isBrandAdapter;
        private final JsonAdapter<Boolean> isTravelingAdapter;
        private final JsonAdapter<Boolean> isVerifiedAdapter;
        private final JsonAdapter<List<Job>> jobsAdapter;
        private final JsonAdapter<String> nameAdapter;
        private final JsonAdapter<List<Photo>> photosAdapter;
        private final JsonAdapter<List<School>> schoolsAdapter;
        private final JsonAdapter<Boolean> selectMemberAdapter;
        private final JsonAdapter<Boolean> showGenderOnProfileAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.idAdapter = c5987p.a(String.class);
            this.bioAdapter = c5987p.a(String.class);
            this.birthDateAdapter = c5987p.a(String.class);
            this.badgesAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Badge.class}));
            this.nameAdapter = c5987p.a(String.class);
            this.photosAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Photo.class}));
            this.genderAdapter = c5987p.a(Integer.class);
            this.jobsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Job.class}));
            this.schoolsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{School.class}));
            this.isTravelingAdapter = c5987p.a(Boolean.class);
            this.showGenderOnProfileAdapter = c5987p.a(Boolean.class);
            this.hideAgeAdapter = c5987p.a(Boolean.class);
            this.isVerifiedAdapter = c5987p.a(Boolean.class);
            this.isBrandAdapter = c5987p.a(Boolean.class);
            this.hideDistanceAdapter = c5987p.a(Boolean.class);
            this.selectMemberAdapter = c5987p.a(Boolean.class);
            this.customGenderAdapter = c5987p.a(String.class);
        }

        public User fromJson(JsonReader jsonReader) throws IOException {
            MoshiJsonAdapter moshiJsonAdapter = this;
            JsonReader jsonReader2 = jsonReader;
            jsonReader.e();
            String str = null;
            String str2 = str;
            String str3 = str2;
            List list = str3;
            String str4 = list;
            List list2 = str4;
            Integer num = list2;
            List list3 = num;
            List list4 = list3;
            Boolean bool = list4;
            Boolean bool2 = bool;
            Boolean bool3 = bool2;
            Boolean bool4 = bool3;
            Boolean bool5 = bool4;
            Boolean bool6 = bool5;
            Boolean bool7 = bool6;
            String str5 = bool7;
            while (jsonReader.g()) {
                switch (jsonReader2.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) moshiJsonAdapter.idAdapter.fromJson(jsonReader2);
                        break;
                    case 1:
                        str2 = (String) moshiJsonAdapter.bioAdapter.fromJson(jsonReader2);
                        break;
                    case 2:
                        str3 = (String) moshiJsonAdapter.birthDateAdapter.fromJson(jsonReader2);
                        break;
                    case 3:
                        list = (List) moshiJsonAdapter.badgesAdapter.fromJson(jsonReader2);
                        break;
                    case 4:
                        str4 = (String) moshiJsonAdapter.nameAdapter.fromJson(jsonReader2);
                        break;
                    case 5:
                        list2 = (List) moshiJsonAdapter.photosAdapter.fromJson(jsonReader2);
                        break;
                    case 6:
                        num = (Integer) moshiJsonAdapter.genderAdapter.fromJson(jsonReader2);
                        break;
                    case 7:
                        list3 = (List) moshiJsonAdapter.jobsAdapter.fromJson(jsonReader2);
                        break;
                    case 8:
                        list4 = (List) moshiJsonAdapter.schoolsAdapter.fromJson(jsonReader2);
                        break;
                    case 9:
                        bool = (Boolean) moshiJsonAdapter.isTravelingAdapter.fromJson(jsonReader2);
                        break;
                    case 10:
                        bool2 = (Boolean) moshiJsonAdapter.showGenderOnProfileAdapter.fromJson(jsonReader2);
                        break;
                    case 11:
                        bool3 = (Boolean) moshiJsonAdapter.hideAgeAdapter.fromJson(jsonReader2);
                        break;
                    case 12:
                        bool4 = (Boolean) moshiJsonAdapter.isVerifiedAdapter.fromJson(jsonReader2);
                        break;
                    case 13:
                        bool5 = (Boolean) moshiJsonAdapter.isBrandAdapter.fromJson(jsonReader2);
                        break;
                    case 14:
                        bool6 = (Boolean) moshiJsonAdapter.hideDistanceAdapter.fromJson(jsonReader2);
                        break;
                    case 15:
                        bool7 = (Boolean) moshiJsonAdapter.selectMemberAdapter.fromJson(jsonReader2);
                        break;
                    case 16:
                        str5 = (String) moshiJsonAdapter.customGenderAdapter.fromJson(jsonReader2);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Rec_User(str, str2, str3, list, str4, list2, num, list3, list4, bool, bool2, bool3, bool4, bool5, bool6, bool7, str5);
        }

        public void toJson(C5983k c5983k, User user) throws IOException {
            c5983k.c();
            String id = user.id();
            if (id != null) {
                c5983k.b(ManagerWebServices.PARAM_ID_UNDERSCORE);
                this.idAdapter.toJson(c5983k, id);
            }
            id = user.bio();
            if (id != null) {
                c5983k.b(ManagerWebServices.PARAM_BIO);
                this.bioAdapter.toJson(c5983k, id);
            }
            id = user.birthDate();
            if (id != null) {
                c5983k.b(ManagerWebServices.PARAM_BIRTH_DATE);
                this.birthDateAdapter.toJson(c5983k, id);
            }
            List badges = user.badges();
            if (badges != null) {
                c5983k.b(ManagerWebServices.PARAM_BADGES);
                this.badgesAdapter.toJson(c5983k, badges);
            }
            id = user.name();
            if (id != null) {
                c5983k.b("name");
                this.nameAdapter.toJson(c5983k, id);
            }
            badges = user.photos();
            if (badges != null) {
                c5983k.b("photos");
                this.photosAdapter.toJson(c5983k, badges);
            }
            Integer gender = user.gender();
            if (gender != null) {
                c5983k.b("gender");
                this.genderAdapter.toJson(c5983k, gender);
            }
            badges = user.jobs();
            if (badges != null) {
                c5983k.b(ManagerWebServices.PARAM_JOBS);
                this.jobsAdapter.toJson(c5983k, badges);
            }
            badges = user.schools();
            if (badges != null) {
                c5983k.b(ManagerWebServices.PARAM_SCHOOLS);
                this.schoolsAdapter.toJson(c5983k, badges);
            }
            Boolean isTraveling = user.isTraveling();
            if (isTraveling != null) {
                c5983k.b(ManagerWebServices.PARAM_IS_TRAVELING);
                this.isTravelingAdapter.toJson(c5983k, isTraveling);
            }
            isTraveling = user.showGenderOnProfile();
            if (isTraveling != null) {
                c5983k.b(ManagerWebServices.PARAM_SHOW_GENDER);
                this.showGenderOnProfileAdapter.toJson(c5983k, isTraveling);
            }
            isTraveling = user.hideAge();
            if (isTraveling != null) {
                c5983k.b(ManagerWebServices.PARAM_HIDE_AGE);
                this.hideAgeAdapter.toJson(c5983k, isTraveling);
            }
            isTraveling = user.isVerified();
            if (isTraveling != null) {
                c5983k.b(ManagerWebServices.PARAM_VERIFIED);
                this.isVerifiedAdapter.toJson(c5983k, isTraveling);
            }
            isTraveling = user.isBrand();
            if (isTraveling != null) {
                c5983k.b(ManagerWebServices.PARAM_IS_BRAND);
                this.isBrandAdapter.toJson(c5983k, isTraveling);
            }
            isTraveling = user.hideDistance();
            if (isTraveling != null) {
                c5983k.b(ManagerWebServices.PARAM_HIDE_DISTANCE);
                this.hideDistanceAdapter.toJson(c5983k, isTraveling);
            }
            isTraveling = user.selectMember();
            if (isTraveling != null) {
                c5983k.b(ManagerWebServices.PARAM_SELECT_MEMBER);
                this.selectMemberAdapter.toJson(c5983k, isTraveling);
            }
            user = user.customGender();
            if (user != null) {
                c5983k.b(ManagerWebServices.PARAM_CUSTOM_GENDER);
                this.customGenderAdapter.toJson(c5983k, user);
            }
            c5983k.d();
        }
    }

    AutoValue_Rec_User(String str, String str2, String str3, List<Badge> list, String str4, List<Photo> list2, Integer num, List<Job> list3, List<School> list4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, String str5) {
        super(str, str2, str3, list, str4, list2, num, list3, list4, bool, bool2, bool3, bool4, bool5, bool6, bool7, str5);
    }
}
