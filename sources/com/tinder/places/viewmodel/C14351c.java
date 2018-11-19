package com.tinder.places.viewmodel;

import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.places.model.Place;
import com.tinder.places.C6257b.C6253b;
import java.util.HashMap;
import kotlin.C15811g;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/tinder/places/viewmodel/PlacePinViewModel;", "", "placeId", "", "pinResource", "", "radarColor", "iconResource", "location", "Lcom/mapbox/mapboxsdk/geometry/LatLng;", "(Ljava/lang/String;IIILcom/mapbox/mapboxsdk/geometry/LatLng;)V", "getIconResource", "()I", "getLocation", "()Lcom/mapbox/mapboxsdk/geometry/LatLng;", "getPinResource", "getPlaceId", "()Ljava/lang/String;", "getRadarColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Factory", "places_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.places.viewmodel.c */
public final class C14351c {
    /* renamed from: a */
    public static final C14350a f45525a = new C14350a();
    /* renamed from: g */
    private static final HashMap<String, Integer> f45526g = ah.m66896c(C15811g.m59834a("alien", Integer.valueOf(C6253b.places_category_alien)), C15811g.m59834a("animals", Integer.valueOf(C6253b.places_category_animals)), C15811g.m59834a("aquarium", Integer.valueOf(C6253b.places_category_aquarium)), C15811g.m59834a("arcade", Integer.valueOf(C6253b.places_category_arcade)), C15811g.m59834a("art", Integer.valueOf(C6253b.places_category_art)), C15811g.m59834a("asian-restaurant", Integer.valueOf(C6253b.places_category_asianrestaurant)), C15811g.m59834a("bakery", Integer.valueOf(C6253b.places_category_bakery)), C15811g.m59834a("bar", Integer.valueOf(C6253b.places_category_bar)), C15811g.m59834a("baseball", Integer.valueOf(C6253b.places_category_baseball)), C15811g.m59834a("basketball", Integer.valueOf(C6253b.places_category_basketball)), C15811g.m59834a("beach", Integer.valueOf(C6253b.places_category_beach)), C15811g.m59834a("beer", Integer.valueOf(C6253b.places_category_beer)), C15811g.m59834a("bike-trail", Integer.valueOf(C6253b.places_category_biketrail)), C15811g.m59834a("boat", Integer.valueOf(C6253b.places_category_boat)), C15811g.m59834a("books", Integer.valueOf(C6253b.places_category_books)), C15811g.m59834a("botanical-gardens", Integer.valueOf(C6253b.places_category_botanicalgardens)), C15811g.m59834a("bowling", Integer.valueOf(C6253b.places_category_bowling)), C15811g.m59834a("breakfast", Integer.valueOf(C6253b.places_category_breakfast)), C15811g.m59834a("bubble-tea", Integer.valueOf(C6253b.places_category_bubbletea)), C15811g.m59834a("building", Integer.valueOf(C6253b.places_category_building)), C15811g.m59834a("burgers", Integer.valueOf(C6253b.places_category_burgers)), C15811g.m59834a("cannabis", Integer.valueOf(C6253b.places_category_cannabis)), C15811g.m59834a("cars", Integer.valueOf(C6253b.places_category_cars)), C15811g.m59834a("casino", Integer.valueOf(C6253b.places_category_casino)), C15811g.m59834a("circus", Integer.valueOf(C6253b.places_category_circus)), C15811g.m59834a("club", Integer.valueOf(C6253b.places_category_club)), C15811g.m59834a("cocktail-bar", Integer.valueOf(C6253b.places_category_cocktailbar)), C15811g.m59834a("coffee", Integer.valueOf(C6253b.places_category_coffee)), C15811g.m59834a("college", Integer.valueOf(C6253b.places_category_college)), C15811g.m59834a("comedy-club", Integer.valueOf(C6253b.places_category_comedyclub)), C15811g.m59834a("conference", Integer.valueOf(C6253b.places_category_conference)), C15811g.m59834a("convention", Integer.valueOf(C6253b.places_category_convention)), C15811g.m59834a("cricket-ground", Integer.valueOf(C6253b.places_category_cricketground)), C15811g.m59834a("cycling-studio", Integer.valueOf(C6253b.places_category_cyclingstudio)), C15811g.m59834a("dancing", Integer.valueOf(C6253b.places_category_dancing)), C15811g.m59834a("deli", Integer.valueOf(C6253b.places_category_deli)), C15811g.m59834a("dessert", Integer.valueOf(C6253b.places_category_dessert)), C15811g.m59834a("disc-golf", Integer.valueOf(C6253b.places_category_discgolf)), C15811g.m59834a("entertainment", Integer.valueOf(C6253b.places_category_entertainment)), C15811g.m59834a("events", Integer.valueOf(C6253b.places_category_events)), C15811g.m59834a("farm", Integer.valueOf(C6253b.places_category_farm)), C15811g.m59834a("fast-food", Integer.valueOf(C6253b.places_category_fastfood)), C15811g.m59834a("fishing", Integer.valueOf(C6253b.places_category_fishing)), C15811g.m59834a("fitness", Integer.valueOf(C6253b.places_category_fitness)), C15811g.m59834a("food-truck", Integer.valueOf(C6253b.places_category_foodtruck)), C15811g.m59834a("football", Integer.valueOf(C6253b.places_category_football)), C15811g.m59834a("forest", Integer.valueOf(C6253b.places_category_forest)), C15811g.m59834a("fountain", Integer.valueOf(C6253b.places_category_fountain)), C15811g.m59834a("games", Integer.valueOf(C6253b.places_category_games)), C15811g.m59834a("golf", Integer.valueOf(C6253b.places_category_golf)), C15811g.m59834a("greek-life", Integer.valueOf(C6253b.places_category_greeklife)), C15811g.m59834a("grocery", Integer.valueOf(C6253b.places_category_grocery)), C15811g.m59834a("gun-range", Integer.valueOf(C6253b.places_category_gunrange)), C15811g.m59834a("gyms", Integer.valueOf(C6253b.places_category_gyms)), C15811g.m59834a("historic-site", Integer.valueOf(C6253b.places_category_historicsite)), C15811g.m59834a("hockey", Integer.valueOf(C6253b.places_category_hockey)), C15811g.m59834a("hookah", Integer.valueOf(C6253b.places_category_hookah)), C15811g.m59834a("ice-cream", Integer.valueOf(C6253b.places_category_ice_cream)), C15811g.m59834a("italian", Integer.valueOf(C6253b.places_category_italian)), C15811g.m59834a("japanese-restaurant", Integer.valueOf(C6253b.places_category_japaneserestaurant)), C15811g.m59834a("juice", Integer.valueOf(C6253b.places_category_juice)), C15811g.m59834a("laser-tag", Integer.valueOf(C6253b.places_category_lasertag)), C15811g.m59834a("laundry", Integer.valueOf(C6253b.places_category_laundry)), C15811g.m59834a("mexican", Integer.valueOf(C6253b.places_category_mexican)), C15811g.m59834a("mountain", Integer.valueOf(C6253b.places_category_mountain)), C15811g.m59834a("movies", Integer.valueOf(C6253b.places_category_movies)), C15811g.m59834a("museum", Integer.valueOf(C6253b.places_category_museum)), C15811g.m59834a("music", Integer.valueOf(C6253b.places_category_music)), C15811g.m59834a("music-store", Integer.valueOf(C6253b.places_category_music_store)), C15811g.m59834a("outdoor", Integer.valueOf(C6253b.places_category_outdoor)), C15811g.m59834a("park", Integer.valueOf(C6253b.places_category_park)), C15811g.m59834a("parks", Integer.valueOf(C6253b.places_category_parks)), C15811g.m59834a("pets", Integer.valueOf(C6253b.places_category_pets)), C15811g.m59834a("photography", Integer.valueOf(C6253b.places_category_photography)), C15811g.m59834a("pizza", Integer.valueOf(C6253b.places_category_pizza)), C15811g.m59834a("pool-hall", Integer.valueOf(C6253b.places_category_poolhall)), C15811g.m59834a("ramen", Integer.valueOf(C6253b.places_category_ramen)), C15811g.m59834a("religion", Integer.valueOf(C6253b.places_category_religion)), C15811g.m59834a("restaurant", Integer.valueOf(C6253b.places_category_restaurant)), C15811g.m59834a("roller-rink", Integer.valueOf(C6253b.places_category_rollerrink)), C15811g.m59834a("rugby-pitch", Integer.valueOf(C6253b.places_category_rugbypitch)), C15811g.m59834a("salad", Integer.valueOf(C6253b.places_category_salad)), C15811g.m59834a("seafood", Integer.valueOf(C6253b.places_category_seafood)), C15811g.m59834a("shopping", Integer.valueOf(C6253b.places_category_shopping)), C15811g.m59834a("shops", Integer.valueOf(C6253b.places_category_shops)), C15811g.m59834a("skiing", Integer.valueOf(C6253b.places_category_skiing)), C15811g.m59834a("soccer", Integer.valueOf(C6253b.places_category_soccer)), C15811g.m59834a("spiritual", Integer.valueOf(C6253b.places_category_spiritual)), C15811g.m59834a("sports", Integer.valueOf(C6253b.places_category_sports)), C15811g.m59834a("steakhouse", Integer.valueOf(C6253b.places_category_steakhouse)), C15811g.m59834a("surf-spot", Integer.valueOf(C6253b.places_category_surfspot)), C15811g.m59834a("tattoo", Integer.valueOf(C6253b.places_category_tattoo)), C15811g.m59834a("taxi", Integer.valueOf(C6253b.places_category_taxi)), C15811g.m59834a("tennis", Integer.valueOf(C6253b.places_category_tennis)), C15811g.m59834a("theater", Integer.valueOf(C6253b.places_category_theatre)), C15811g.m59834a("train", Integer.valueOf(C6253b.places_category_train)), C15811g.m59834a(ManagerWebServices.PARAM_TRAVEL, Integer.valueOf(C6253b.places_category_travel)), C15811g.m59834a("venues", Integer.valueOf(C6253b.places_category_venues)), C15811g.m59834a("video-games", Integer.valueOf(C6253b.places_category_videogames)), C15811g.m59834a("volleyball", Integer.valueOf(C6253b.places_category_volleyball)), C15811g.m59834a("water", Integer.valueOf(C6253b.places_category_water)), C15811g.m59834a("whiskey", Integer.valueOf(C6253b.places_category_whiskey)), C15811g.m59834a("winebar", Integer.valueOf(C6253b.places_category_winebar)), C15811g.m59834a("yoga", Integer.valueOf(C6253b.places_category_yoga)));
    @NotNull
    /* renamed from: b */
    private final String f45527b;
    /* renamed from: c */
    private final int f45528c;
    /* renamed from: d */
    private final int f45529d;
    /* renamed from: e */
    private final int f45530e;
    @NotNull
    /* renamed from: f */
    private final LatLng f45531f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/places/viewmodel/PlacePinViewModel$Factory;", "", "()V", "iconResourceMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "fromPlace", "Lcom/tinder/places/viewmodel/PlacePinViewModel;", "place", "Lcom/tinder/domain/places/model/Place;", "places_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.viewmodel.c$a */
    public static final class C14350a {
        private C14350a() {
        }

        @NotNull
        /* renamed from: a */
        public final C14351c m54664a(@NotNull Place place) {
            C2668g.b(place, "place");
            LatLng latLng = new LatLng(place.getLocation().lat(), place.getLocation().lon());
            PlaceColor a = PlaceColor.Companion.m54648a(place.getId());
            int pin = a.getPin();
            int primary = a.getPrimary();
            Integer num = (Integer) C14351c.f45526g.get(place.getIcon());
            if (num == null) {
                num = Integer.valueOf(C6253b.places_category_unknown);
            }
            String valueOf = String.valueOf(place.getId());
            C2668g.a(num, "iconResource");
            return new C14351c(valueOf, pin, primary, num.intValue(), latLng);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14351c) {
            C14351c c14351c = (C14351c) obj;
            if (C2668g.a(this.f45527b, c14351c.f45527b)) {
                if ((this.f45528c == c14351c.f45528c ? 1 : null) != null) {
                    if ((this.f45529d == c14351c.f45529d ? 1 : null) != null) {
                        return (this.f45530e == c14351c.f45530e ? 1 : null) != null && C2668g.a(this.f45531f, c14351c.f45531f);
                    }
                }
            }
        }
    }

    public int hashCode() {
        String str = this.f45527b;
        int i = 0;
        int hashCode = (((((((str != null ? str.hashCode() : 0) * 31) + this.f45528c) * 31) + this.f45529d) * 31) + this.f45530e) * 31;
        LatLng latLng = this.f45531f;
        if (latLng != null) {
            i = latLng.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlacePinViewModel(placeId=");
        stringBuilder.append(this.f45527b);
        stringBuilder.append(", pinResource=");
        stringBuilder.append(this.f45528c);
        stringBuilder.append(", radarColor=");
        stringBuilder.append(this.f45529d);
        stringBuilder.append(", iconResource=");
        stringBuilder.append(this.f45530e);
        stringBuilder.append(", location=");
        stringBuilder.append(this.f45531f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14351c(@NotNull String str, @DrawableRes int i, @ColorRes int i2, @DrawableRes int i3, @NotNull LatLng latLng) {
        C2668g.b(str, "placeId");
        C2668g.b(latLng, "location");
        this.f45527b = str;
        this.f45528c = i;
        this.f45529d = i2;
        this.f45530e = i3;
        this.f45531f = latLng;
    }

    @NotNull
    /* renamed from: a */
    public final String m54666a() {
        return this.f45527b;
    }

    /* renamed from: b */
    public final int m54667b() {
        return this.f45528c;
    }

    /* renamed from: c */
    public final int m54668c() {
        return this.f45529d;
    }

    /* renamed from: d */
    public final int m54669d() {
        return this.f45530e;
    }

    @NotNull
    /* renamed from: e */
    public final LatLng m54670e() {
        return this.f45531f;
    }
}
