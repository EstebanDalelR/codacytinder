package com.foursquare.pilgrim;

import android.text.TextUtils;
import com.foursquare.api.types.Category;
import com.foursquare.api.types.Venue;
import com.foursquare.api.types.Venue.VenueChain;
import com.foursquare.api.types.Venue.VenueParent;
import java.util.Iterator;

class Trigger {
    /* renamed from: a */
    TriggerPlaceType f5266a;
    /* renamed from: b */
    String f5267b;
    /* renamed from: c */
    private Confidence f5268c;

    public static class Builder {
        /* renamed from: a */
        private TriggerPlaceType f5263a;
        /* renamed from: b */
        private String f5264b;
        /* renamed from: c */
        private Confidence f5265c;

        public Builder() {
            this.f5265c = Confidence.NONE;
        }

        public Builder(TriggerPlaceType triggerPlaceType) {
            this();
            this.f5263a = triggerPlaceType;
        }

        public Builder id(String str) {
            this.f5264b = str;
            return this;
        }

        public Builder minConfidence(Confidence confidence) {
            this.f5265c = confidence;
            return this;
        }

        public Builder type(TriggerPlaceType triggerPlaceType) {
            this.f5263a = triggerPlaceType;
            return this;
        }

        public Trigger build() {
            switch (this.f5263a) {
                case CATEGORY:
                case CHAIN:
                case PLACE:
                    if (TextUtils.isEmpty(this.f5264b)) {
                        throw new IllegalArgumentException("For category or place types, you need to pass an ID");
                    }
                    break;
                default:
                    break;
            }
            return new Trigger(this.f5263a, this.f5264b, this.f5265c);
        }
    }

    Trigger(TriggerPlaceType triggerPlaceType, String str) {
        this(triggerPlaceType, str, Confidence.NONE);
    }

    Trigger(TriggerPlaceType triggerPlaceType, String str, Confidence confidence) {
        this.f5266a = triggerPlaceType;
        this.f5267b = str;
        this.f5268c = confidence;
    }

    /* renamed from: a */
    boolean m6884a(Venue venue, Confidence confidence) {
        return (m6885a(confidence) == null || m6883a(venue) == null) ? null : true;
    }

    /* renamed from: a */
    boolean m6885a(Confidence confidence) {
        return confidence.ordinal() < this.f5268c.ordinal() ? null : true;
    }

    /* renamed from: a */
    boolean m6883a(Venue venue) {
        switch (this.f5266a) {
            case ALL:
                return true;
            case CATEGORY:
                if (venue == null) {
                    return false;
                }
                Iterator it = venue.getCategories().iterator();
                while (it.hasNext()) {
                    if (((Category) it.next()).getId().equalsIgnoreCase(this.f5267b)) {
                        return true;
                    }
                }
                if (venue.getHierarchy() != null) {
                    venue = venue.getHierarchy().iterator();
                    while (venue.hasNext()) {
                        VenueParent venueParent = (VenueParent) venue.next();
                        if (venueParent.getCategories() != null) {
                            for (Category id : venueParent.getCategories()) {
                                if (id.getId().equalsIgnoreCase(this.f5267b)) {
                                    return true;
                                }
                            }
                            continue;
                        }
                    }
                }
                return false;
            case CHAIN:
                if (!(venue == null || venue.getVenueChains() == null)) {
                    if (this.f5267b != null) {
                        venue = venue.getVenueChains().iterator();
                        while (venue.hasNext()) {
                            if (this.f5267b.equals(((VenueChain) venue.next()).getId())) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
                return false;
            case PLACE:
                if (venue == null) {
                    return false;
                }
                return venue.getId().equalsIgnoreCase(this.f5267b);
            default:
                return true;
        }
    }
}
