package com.foursquare.pilgrim.internal.testing;

import com.foursquare.api.types.Category;
import com.foursquare.api.types.Photo;
import com.foursquare.api.types.Venue;
import com.foursquare.api.types.Venue.Location;
import com.foursquare.api.types.Venue.VenueChain;
import com.foursquare.api.types.Venue.VenueParent;
import java.util.ArrayList;

public final class TestingUtils {

    /* renamed from: com.foursquare.pilgrim.internal.testing.TestingUtils$1 */
    class C19831 extends ArrayList {
        C19831() {
            add(TestingUtils.m7167b("4bf58dd8d48988d1c1941735", "Mexican Restaurant", "Mexican Restaurants", "Mexican", "https://ss3.4sqi.net/img/categories_v2/food/mexican_"));
            add(TestingUtils.m7167b("4bf58dd8d48988d153941735", "Burrito Place", "Burrito Places", "Burritos", "https://ss3.4sqi.net/img/categories_v2/food/burrito_"));
            add(TestingUtils.m7167b("4bf58dd8d48988d151941735", "Taco Place", "Taco Places", "Taco", "https://ss3.4sqi.net/img/categories_v2/food/taco_"));
        }
    }

    /* renamed from: com.foursquare.pilgrim.internal.testing.TestingUtils$2 */
    class C19842 extends ArrayList<Category> {
        C19842() {
            add(TestingUtils.m7167b("4bf58dd8d48988d130941735", "Building", "Buildings", "Building", "https://ss3.4sqi.net/img/categories_v2/building/default_"));
        }
    }

    /* renamed from: com.foursquare.pilgrim.internal.testing.TestingUtils$3 */
    class C19853 extends ArrayList {
        /* renamed from: a */
        final /* synthetic */ VenueParent f5389a;

        C19853(VenueParent venueParent) {
            this.f5389a = venueParent;
            add(this.f5389a);
        }
    }

    public static Venue getSampleVenue() {
        Venue venue = new Venue();
        venue.setId("4bd716bd6798ef3b382c668d");
        venue.setName("Chipotle Mexican Grill");
        Location location = new Location();
        location.setCrossStreet("at William St");
        location.setAddress("111 Fulton St");
        location.setCity("New York");
        location.setState("NY");
        location.setPostalCode("10038");
        location.setCountry("US");
        location.setLat(40.709625f);
        location.setLng(-74.00639f);
        venue.setLocation(location);
        venue.setCategories(new C19831());
        VenueParent venueParent = new VenueParent();
        venueParent.setId("4c26633ea852c9280c92e66c");
        venueParent.setName("111 Fulton St.");
        venueParent.setCategories(new C19842());
        venue.setHierarchy(new C19853(venueParent));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VenueChain("556e0f6fa7c82e6b724f8c82", "Chipotle Mexican Grill"));
        venue.setVenueChains(arrayList);
        return venue;
    }

    /* renamed from: b */
    private static Category m7167b(String str, String str2, String str3, String str4, String str5) {
        Photo photo = new Photo();
        photo.setPrefix(str5);
        photo.setSuffix(".png");
        return new Category(str, str2, str4, str3, photo);
    }
}
