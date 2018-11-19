package com.tinder.api.model.meta;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.User;
import com.tinder.api.model.meta.Meta.AccountConfig;
import com.tinder.api.model.meta.Meta.ClientResources;
import com.tinder.api.model.meta.Meta.Globals;
import com.tinder.api.model.meta.Meta.PlacesConfig;
import com.tinder.api.model.meta.Meta.Versions;
import com.tinder.api.model.profile.Notification;
import com.tinder.api.model.profile.Products;
import com.tinder.api.model.profile.Purchase;
import com.tinder.api.model.profile.Rating;
import com.tinder.api.model.profile.Travel;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Meta extends C$AutoValue_Meta {

    public static final class MoshiJsonAdapter extends JsonAdapter<Meta> {
        private static final String[] NAMES = new String[]{"status", ManagerWebServices.PARAM_CLIENT_CONFIG, ManagerWebServices.PARAM_NOTIFICATIONS, "places", ManagerWebServices.PARAM_RATING, ManagerWebServices.PARAM_TRAVEL, ManagerWebServices.PARAM_PURCHASES, "versions", ManagerWebServices.PARAM_GLOBALS, ManagerWebServices.PARAM_TUTORIALS, ManagerWebServices.PARAM_PRODUCTS, ManagerWebServices.PARAM_CAN_CREATE_SQUAD, ManagerWebServices.PARAM_USER, ManagerWebServices.PARAM_ACCOUNT};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<AccountConfig> accountConfigAdapter;
        private final JsonAdapter<Boolean> canCreateSquadAdapter;
        private final JsonAdapter<ClientResources> clientResourcesAdapter;
        private final JsonAdapter<Globals> globalsAdapter;
        private final JsonAdapter<List<Notification>> notificationsAdapter;
        private final JsonAdapter<PlacesConfig> placesAdapter;
        private final JsonAdapter<Products> productsAdapter;
        private final JsonAdapter<List<Purchase>> purchasesAdapter;
        private final JsonAdapter<Rating> ratingAdapter;
        private final JsonAdapter<Integer> statusAdapter;
        private final JsonAdapter<Travel> travelAdapter;
        private final JsonAdapter<List<String>> tutorialsAdapter;
        private final JsonAdapter<User> userAdapter;
        private final JsonAdapter<Versions> versionsAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.statusAdapter = c5987p.a(Integer.class);
            this.clientResourcesAdapter = c5987p.a(ClientResources.class);
            this.notificationsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Notification.class}));
            this.placesAdapter = c5987p.a(PlacesConfig.class);
            this.ratingAdapter = c5987p.a(Rating.class);
            this.travelAdapter = c5987p.a(Travel.class);
            this.purchasesAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Purchase.class}));
            this.versionsAdapter = c5987p.a(Versions.class);
            this.globalsAdapter = c5987p.a(Globals.class);
            this.tutorialsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{String.class}));
            this.productsAdapter = c5987p.a(Products.class);
            this.canCreateSquadAdapter = c5987p.a(Boolean.TYPE);
            this.userAdapter = c5987p.a(User.class);
            this.accountConfigAdapter = c5987p.a(AccountConfig.class);
        }

        public Meta fromJson(JsonReader jsonReader) throws IOException {
            MoshiJsonAdapter moshiJsonAdapter = this;
            JsonReader jsonReader2 = jsonReader;
            jsonReader.e();
            Integer num = null;
            ClientResources clientResources = num;
            List list = clientResources;
            PlacesConfig placesConfig = list;
            Rating rating = placesConfig;
            Travel travel = rating;
            List list2 = travel;
            Versions versions = list2;
            Globals globals = versions;
            List list3 = globals;
            Products products = list3;
            User user = products;
            AccountConfig accountConfig = user;
            boolean z = false;
            while (jsonReader.g()) {
                switch (jsonReader2.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        num = (Integer) moshiJsonAdapter.statusAdapter.fromJson(jsonReader2);
                        break;
                    case 1:
                        clientResources = (ClientResources) moshiJsonAdapter.clientResourcesAdapter.fromJson(jsonReader2);
                        break;
                    case 2:
                        list = (List) moshiJsonAdapter.notificationsAdapter.fromJson(jsonReader2);
                        break;
                    case 3:
                        placesConfig = (PlacesConfig) moshiJsonAdapter.placesAdapter.fromJson(jsonReader2);
                        break;
                    case 4:
                        rating = (Rating) moshiJsonAdapter.ratingAdapter.fromJson(jsonReader2);
                        break;
                    case 5:
                        travel = (Travel) moshiJsonAdapter.travelAdapter.fromJson(jsonReader2);
                        break;
                    case 6:
                        list2 = (List) moshiJsonAdapter.purchasesAdapter.fromJson(jsonReader2);
                        break;
                    case 7:
                        versions = (Versions) moshiJsonAdapter.versionsAdapter.fromJson(jsonReader2);
                        break;
                    case 8:
                        globals = (Globals) moshiJsonAdapter.globalsAdapter.fromJson(jsonReader2);
                        break;
                    case 9:
                        list3 = (List) moshiJsonAdapter.tutorialsAdapter.fromJson(jsonReader2);
                        break;
                    case 10:
                        products = (Products) moshiJsonAdapter.productsAdapter.fromJson(jsonReader2);
                        break;
                    case 11:
                        z = ((Boolean) moshiJsonAdapter.canCreateSquadAdapter.fromJson(jsonReader2)).booleanValue();
                        break;
                    case 12:
                        user = (User) moshiJsonAdapter.userAdapter.fromJson(jsonReader2);
                        break;
                    case 13:
                        accountConfig = (AccountConfig) moshiJsonAdapter.accountConfigAdapter.fromJson(jsonReader2);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Meta(num, clientResources, list, placesConfig, rating, travel, list2, versions, globals, list3, products, z, user, accountConfig);
        }

        public void toJson(C5983k c5983k, Meta meta) throws IOException {
            c5983k.c();
            Integer status = meta.status();
            if (status != null) {
                c5983k.b("status");
                this.statusAdapter.toJson(c5983k, status);
            }
            ClientResources clientResources = meta.clientResources();
            if (clientResources != null) {
                c5983k.b(ManagerWebServices.PARAM_CLIENT_CONFIG);
                this.clientResourcesAdapter.toJson(c5983k, clientResources);
            }
            List notifications = meta.notifications();
            if (notifications != null) {
                c5983k.b(ManagerWebServices.PARAM_NOTIFICATIONS);
                this.notificationsAdapter.toJson(c5983k, notifications);
            }
            PlacesConfig places = meta.places();
            if (places != null) {
                c5983k.b("places");
                this.placesAdapter.toJson(c5983k, places);
            }
            Rating rating = meta.rating();
            if (rating != null) {
                c5983k.b(ManagerWebServices.PARAM_RATING);
                this.ratingAdapter.toJson(c5983k, rating);
            }
            Travel travel = meta.travel();
            if (travel != null) {
                c5983k.b(ManagerWebServices.PARAM_TRAVEL);
                this.travelAdapter.toJson(c5983k, travel);
            }
            notifications = meta.purchases();
            if (notifications != null) {
                c5983k.b(ManagerWebServices.PARAM_PURCHASES);
                this.purchasesAdapter.toJson(c5983k, notifications);
            }
            Versions versions = meta.versions();
            if (versions != null) {
                c5983k.b("versions");
                this.versionsAdapter.toJson(c5983k, versions);
            }
            Globals globals = meta.globals();
            if (globals != null) {
                c5983k.b(ManagerWebServices.PARAM_GLOBALS);
                this.globalsAdapter.toJson(c5983k, globals);
            }
            notifications = meta.tutorials();
            if (notifications != null) {
                c5983k.b(ManagerWebServices.PARAM_TUTORIALS);
                this.tutorialsAdapter.toJson(c5983k, notifications);
            }
            Products products = meta.products();
            if (products != null) {
                c5983k.b(ManagerWebServices.PARAM_PRODUCTS);
                this.productsAdapter.toJson(c5983k, products);
            }
            c5983k.b(ManagerWebServices.PARAM_CAN_CREATE_SQUAD);
            this.canCreateSquadAdapter.toJson(c5983k, Boolean.valueOf(meta.canCreateSquad()));
            c5983k.b(ManagerWebServices.PARAM_USER);
            this.userAdapter.toJson(c5983k, meta.user());
            meta = meta.accountConfig();
            if (meta != null) {
                c5983k.b(ManagerWebServices.PARAM_ACCOUNT);
                this.accountConfigAdapter.toJson(c5983k, meta);
            }
            c5983k.d();
        }
    }

    AutoValue_Meta(Integer num, ClientResources clientResources, List<Notification> list, PlacesConfig placesConfig, Rating rating, Travel travel, List<Purchase> list2, Versions versions, Globals globals, List<String> list3, Products products, boolean z, User user, AccountConfig accountConfig) {
        super(num, clientResources, list, placesConfig, rating, travel, list2, versions, globals, list3, products, z, user, accountConfig);
    }
}
