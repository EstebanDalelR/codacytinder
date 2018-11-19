package com.tinder.api.model.meta;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
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
import java.util.List;

/* renamed from: com.tinder.api.model.meta.$AutoValue_Meta */
abstract class C$AutoValue_Meta extends Meta {
    private final AccountConfig accountConfig;
    private final boolean canCreateSquad;
    private final ClientResources clientResources;
    private final Globals globals;
    private final List<Notification> notifications;
    private final PlacesConfig places;
    private final Products products;
    private final List<Purchase> purchases;
    private final Rating rating;
    private final Integer status;
    private final Travel travel;
    private final List<String> tutorials;
    private final User user;
    private final Versions versions;

    C$AutoValue_Meta(@Nullable Integer num, @Nullable ClientResources clientResources, @Nullable List<Notification> list, @Nullable PlacesConfig placesConfig, @Nullable Rating rating, @Nullable Travel travel, @Nullable List<Purchase> list2, @Nullable Versions versions, @Nullable Globals globals, @Nullable List<String> list3, @Nullable Products products, boolean z, User user, @Nullable AccountConfig accountConfig) {
        this.status = num;
        this.clientResources = clientResources;
        this.notifications = list;
        this.places = placesConfig;
        this.rating = rating;
        this.travel = travel;
        this.purchases = list2;
        this.versions = versions;
        this.globals = globals;
        this.tutorials = list3;
        this.products = products;
        this.canCreateSquad = z;
        if (user == null) {
            throw new NullPointerException("Null user");
        }
        this.user = user;
        this.accountConfig = accountConfig;
    }

    @Nullable
    public Integer status() {
        return this.status;
    }

    @Nullable
    @Json(name = "client_resources")
    public ClientResources clientResources() {
        return this.clientResources;
    }

    @Nullable
    public List<Notification> notifications() {
        return this.notifications;
    }

    @Nullable
    public PlacesConfig places() {
        return this.places;
    }

    @Nullable
    public Rating rating() {
        return this.rating;
    }

    @Nullable
    public Travel travel() {
        return this.travel;
    }

    @Nullable
    public List<Purchase> purchases() {
        return this.purchases;
    }

    @Nullable
    public Versions versions() {
        return this.versions;
    }

    @Nullable
    public Globals globals() {
        return this.globals;
    }

    @Nullable
    public List<String> tutorials() {
        return this.tutorials;
    }

    @Nullable
    public Products products() {
        return this.products;
    }

    @Json(name = "can_create_squad")
    public boolean canCreateSquad() {
        return this.canCreateSquad;
    }

    public User user() {
        return this.user;
    }

    @Nullable
    @Json(name = "account")
    public AccountConfig accountConfig() {
        return this.accountConfig;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Meta{status=");
        stringBuilder.append(this.status);
        stringBuilder.append(", clientResources=");
        stringBuilder.append(this.clientResources);
        stringBuilder.append(", notifications=");
        stringBuilder.append(this.notifications);
        stringBuilder.append(", places=");
        stringBuilder.append(this.places);
        stringBuilder.append(", rating=");
        stringBuilder.append(this.rating);
        stringBuilder.append(", travel=");
        stringBuilder.append(this.travel);
        stringBuilder.append(", purchases=");
        stringBuilder.append(this.purchases);
        stringBuilder.append(", versions=");
        stringBuilder.append(this.versions);
        stringBuilder.append(", globals=");
        stringBuilder.append(this.globals);
        stringBuilder.append(", tutorials=");
        stringBuilder.append(this.tutorials);
        stringBuilder.append(", products=");
        stringBuilder.append(this.products);
        stringBuilder.append(", canCreateSquad=");
        stringBuilder.append(this.canCreateSquad);
        stringBuilder.append(", user=");
        stringBuilder.append(this.user);
        stringBuilder.append(", accountConfig=");
        stringBuilder.append(this.accountConfig);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.api.model.meta.Meta;
        r2 = 0;
        if (r1 == 0) goto L_0x0136;
    L_0x0009:
        r5 = (com.tinder.api.model.meta.Meta) r5;
        r1 = r4.status;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.status();
        if (r1 != 0) goto L_0x0134;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.status;
        r3 = r5.status();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0134;
    L_0x0022:
        r1 = r4.clientResources;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.clientResources();
        if (r1 != 0) goto L_0x0134;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.clientResources;
        r3 = r5.clientResources();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0134;
    L_0x0039:
        r1 = r4.notifications;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.notifications();
        if (r1 != 0) goto L_0x0134;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.notifications;
        r3 = r5.notifications();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0134;
    L_0x0050:
        r1 = r4.places;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.places();
        if (r1 != 0) goto L_0x0134;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.places;
        r3 = r5.places();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0134;
    L_0x0067:
        r1 = r4.rating;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.rating();
        if (r1 != 0) goto L_0x0134;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.rating;
        r3 = r5.rating();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0134;
    L_0x007e:
        r1 = r4.travel;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r1 = r5.travel();
        if (r1 != 0) goto L_0x0134;
    L_0x0088:
        goto L_0x0095;
    L_0x0089:
        r1 = r4.travel;
        r3 = r5.travel();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0134;
    L_0x0095:
        r1 = r4.purchases;
        if (r1 != 0) goto L_0x00a0;
    L_0x0099:
        r1 = r5.purchases();
        if (r1 != 0) goto L_0x0134;
    L_0x009f:
        goto L_0x00ac;
    L_0x00a0:
        r1 = r4.purchases;
        r3 = r5.purchases();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0134;
    L_0x00ac:
        r1 = r4.versions;
        if (r1 != 0) goto L_0x00b7;
    L_0x00b0:
        r1 = r5.versions();
        if (r1 != 0) goto L_0x0134;
    L_0x00b6:
        goto L_0x00c3;
    L_0x00b7:
        r1 = r4.versions;
        r3 = r5.versions();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0134;
    L_0x00c3:
        r1 = r4.globals;
        if (r1 != 0) goto L_0x00ce;
    L_0x00c7:
        r1 = r5.globals();
        if (r1 != 0) goto L_0x0134;
    L_0x00cd:
        goto L_0x00da;
    L_0x00ce:
        r1 = r4.globals;
        r3 = r5.globals();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0134;
    L_0x00da:
        r1 = r4.tutorials;
        if (r1 != 0) goto L_0x00e5;
    L_0x00de:
        r1 = r5.tutorials();
        if (r1 != 0) goto L_0x0134;
    L_0x00e4:
        goto L_0x00f1;
    L_0x00e5:
        r1 = r4.tutorials;
        r3 = r5.tutorials();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0134;
    L_0x00f1:
        r1 = r4.products;
        if (r1 != 0) goto L_0x00fc;
    L_0x00f5:
        r1 = r5.products();
        if (r1 != 0) goto L_0x0134;
    L_0x00fb:
        goto L_0x0108;
    L_0x00fc:
        r1 = r4.products;
        r3 = r5.products();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0134;
    L_0x0108:
        r1 = r4.canCreateSquad;
        r3 = r5.canCreateSquad();
        if (r1 != r3) goto L_0x0134;
    L_0x0110:
        r1 = r4.user;
        r3 = r5.user();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0134;
    L_0x011c:
        r1 = r4.accountConfig;
        if (r1 != 0) goto L_0x0127;
    L_0x0120:
        r5 = r5.accountConfig();
        if (r5 != 0) goto L_0x0134;
    L_0x0126:
        goto L_0x0135;
    L_0x0127:
        r1 = r4.accountConfig;
        r5 = r5.accountConfig();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0134;
    L_0x0133:
        goto L_0x0135;
    L_0x0134:
        r0 = 0;
    L_0x0135:
        return r0;
    L_0x0136:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.meta.$AutoValue_Meta.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((((((((((this.status == null ? 0 : this.status.hashCode()) ^ 1000003) * 1000003) ^ (this.clientResources == null ? 0 : this.clientResources.hashCode())) * 1000003) ^ (this.notifications == null ? 0 : this.notifications.hashCode())) * 1000003) ^ (this.places == null ? 0 : this.places.hashCode())) * 1000003) ^ (this.rating == null ? 0 : this.rating.hashCode())) * 1000003) ^ (this.travel == null ? 0 : this.travel.hashCode())) * 1000003) ^ (this.purchases == null ? 0 : this.purchases.hashCode())) * 1000003) ^ (this.versions == null ? 0 : this.versions.hashCode())) * 1000003) ^ (this.globals == null ? 0 : this.globals.hashCode())) * 1000003) ^ (this.tutorials == null ? 0 : this.tutorials.hashCode())) * 1000003) ^ (this.products == null ? 0 : this.products.hashCode())) * 1000003) ^ (this.canCreateSquad ? 1231 : 1237)) * 1000003) ^ this.user.hashCode()) * 1000003;
        if (this.accountConfig != null) {
            i = this.accountConfig.hashCode();
        }
        return hashCode ^ i;
    }
}
