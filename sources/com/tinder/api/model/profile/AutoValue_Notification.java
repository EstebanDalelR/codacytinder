package com.tinder.api.model.profile;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Notification extends C$AutoValue_Notification {

    public static final class MoshiJsonAdapter extends JsonAdapter<Notification> {
        private static final String[] NAMES = new String[]{"type", ManagerWebServices.PARAM_NOTIFICATION_TIER, ManagerWebServices.PARAM_NOTIFICATION_REASONS};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<List<Integer>> reasonsAdapter;
        private final JsonAdapter<Integer> tierAdapter;
        private final JsonAdapter<String> typeAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.typeAdapter = c5987p.a(String.class);
            this.tierAdapter = c5987p.a(Integer.TYPE);
            this.reasonsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Integer.class}));
        }

        public Notification fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            int i = 0;
            List list = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.typeAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        i = ((Integer) this.tierAdapter.fromJson(jsonReader)).intValue();
                        break;
                    case 2:
                        list = (List) this.reasonsAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Notification(str, i, list);
        }

        public void toJson(C5983k c5983k, Notification notification) throws IOException {
            c5983k.c();
            c5983k.b("type");
            this.typeAdapter.toJson(c5983k, notification.type());
            c5983k.b(ManagerWebServices.PARAM_NOTIFICATION_TIER);
            this.tierAdapter.toJson(c5983k, Integer.valueOf(notification.tier()));
            notification = notification.reasons();
            if (notification != null) {
                c5983k.b(ManagerWebServices.PARAM_NOTIFICATION_REASONS);
                this.reasonsAdapter.toJson(c5983k, notification);
            }
            c5983k.d();
        }
    }

    AutoValue_Notification(String str, int i, List<Integer> list) {
        super(str, i, list);
    }
}
