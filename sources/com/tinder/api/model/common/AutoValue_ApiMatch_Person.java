package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.ApiMatch.Person;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_ApiMatch_Person extends C$AutoValue_ApiMatch_Person {

    public static final class MoshiJsonAdapter extends JsonAdapter<Person> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_ID_UNDERSCORE, ManagerWebServices.PARAM_BIO, ManagerWebServices.PARAM_BIRTH_DATE, "gender", "name", ManagerWebServices.PARAM_PING_TIME, "photos", ManagerWebServices.PARAM_BADGES};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<List<Badge>> badgesAdapter;
        private final JsonAdapter<String> bioAdapter;
        private final JsonAdapter<String> birthDateAdapter;
        private final JsonAdapter<Integer> genderAdapter;
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<String> nameAdapter;
        private final JsonAdapter<List<Photo>> photosAdapter;
        private final JsonAdapter<String> pingTimeAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.idAdapter = c5987p.a(String.class);
            this.bioAdapter = c5987p.a(String.class);
            this.birthDateAdapter = c5987p.a(String.class);
            this.genderAdapter = c5987p.a(Integer.class);
            this.nameAdapter = c5987p.a(String.class);
            this.pingTimeAdapter = c5987p.a(String.class);
            this.photosAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Photo.class}));
            this.badgesAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Badge.class}));
        }

        public Person fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = str;
            String str3 = str2;
            Integer num = str3;
            String str4 = num;
            String str5 = str4;
            List list = str5;
            List list2 = list;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.idAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.bioAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        str3 = (String) this.birthDateAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        num = (Integer) this.genderAdapter.fromJson(jsonReader);
                        break;
                    case 4:
                        str4 = (String) this.nameAdapter.fromJson(jsonReader);
                        break;
                    case 5:
                        str5 = (String) this.pingTimeAdapter.fromJson(jsonReader);
                        break;
                    case 6:
                        list = (List) this.photosAdapter.fromJson(jsonReader);
                        break;
                    case 7:
                        list2 = (List) this.badgesAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_ApiMatch_Person(str, str2, str3, num, str4, str5, list, list2);
        }

        public void toJson(C5983k c5983k, Person person) throws IOException {
            c5983k.c();
            String id = person.id();
            if (id != null) {
                c5983k.b(ManagerWebServices.PARAM_ID_UNDERSCORE);
                this.idAdapter.toJson(c5983k, id);
            }
            id = person.bio();
            if (id != null) {
                c5983k.b(ManagerWebServices.PARAM_BIO);
                this.bioAdapter.toJson(c5983k, id);
            }
            id = person.birthDate();
            if (id != null) {
                c5983k.b(ManagerWebServices.PARAM_BIRTH_DATE);
                this.birthDateAdapter.toJson(c5983k, id);
            }
            Integer gender = person.gender();
            if (gender != null) {
                c5983k.b("gender");
                this.genderAdapter.toJson(c5983k, gender);
            }
            id = person.name();
            if (id != null) {
                c5983k.b("name");
                this.nameAdapter.toJson(c5983k, id);
            }
            id = person.pingTime();
            if (id != null) {
                c5983k.b(ManagerWebServices.PARAM_PING_TIME);
                this.pingTimeAdapter.toJson(c5983k, id);
            }
            List photos = person.photos();
            if (photos != null) {
                c5983k.b("photos");
                this.photosAdapter.toJson(c5983k, photos);
            }
            person = person.badges();
            if (person != null) {
                c5983k.b(ManagerWebServices.PARAM_BADGES);
                this.badgesAdapter.toJson(c5983k, person);
            }
            c5983k.d();
        }
    }

    AutoValue_ApiMatch_Person(String str, String str2, String str3, Integer num, String str4, String str5, List<Photo> list, List<Badge> list2) {
        super(str, str2, str3, num, str4, str5, list, list2);
    }
}
