package com.foursquare.api.types;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public class Venue implements Parcelable, FoursquareType, LocationProducer {
    public static final Creator<Venue> CREATOR = new C19081();
    private ArrayList<Category> categories;
    private ArrayList<VenueParent> hierarchy;
    private String id;
    private Location location;
    private String name;
    private Venue parent;
    private String partnerVenueId;
    private double probability;
    private String storeId;
    private ArrayList<VenueChain> venueChains;

    /* renamed from: com.foursquare.api.types.Venue$1 */
    class C19081 implements Creator<Venue> {
        C19081() {
        }

        public Venue createFromParcel(Parcel parcel) {
            return new Venue(parcel);
        }

        public Venue[] newArray(int i) {
            return new Venue[i];
        }
    }

    public static class Location implements Parcelable, FoursquareType {
        public static final Creator<Location> CREATOR = new C19091();
        private String address;
        private String cc;
        private String city;
        private String contextLine;
        private String country;
        private String crossStreet;
        private int distance;
        private List<String> formattedAddress;
        private boolean isFuzzed;
        private float lat;
        private float lng;
        private String mCounty;
        private String neighborhood;
        private String postalCode;
        private String state;

        /* renamed from: com.foursquare.api.types.Venue$Location$1 */
        class C19091 implements Creator<Location> {
            C19091() {
            }

            public Location createFromParcel(Parcel parcel) {
                return new Location(parcel);
            }

            public Location[] newArray(int i) {
                return new Location[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public Location() {
            this.lat = 0.0f;
            this.lng = 0.0f;
        }

        public Location(float f, float f2) {
            this.lat = f;
            this.lng = f2;
        }

        public Location(double d, double d2) {
            this.lat = (float) d;
            this.lng = (float) d2;
        }

        private Location(Parcel parcel) {
            this.address = parcel.readString();
            this.city = parcel.readString();
            this.crossStreet = parcel.readString();
            this.distance = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.isFuzzed = z;
            this.lat = parcel.readFloat();
            this.lng = parcel.readFloat();
            this.postalCode = parcel.readString();
            this.contextLine = parcel.readString();
            this.neighborhood = parcel.readString();
            this.state = parcel.readString();
            this.mCounty = parcel.readString();
            this.country = parcel.readString();
            this.cc = parcel.readString();
            this.formattedAddress = parcel.createStringArrayList();
        }

        public String getAddress() {
            return this.address;
        }

        public void setAddress(String str) {
            this.address = str;
        }

        public String getCity() {
            return this.city;
        }

        public void setCity(String str) {
            this.city = str;
        }

        public String getCrossStreet() {
            return this.crossStreet;
        }

        public void setCrossStreet(String str) {
            this.crossStreet = str;
        }

        public int getDistance() {
            return this.distance;
        }

        public boolean getIsFuzzed() {
            return this.isFuzzed;
        }

        public float getLat() {
            return this.lat;
        }

        public void setLat(float f) {
            this.lat = f;
        }

        public float getLng() {
            return this.lng;
        }

        public void setLng(float f) {
            this.lng = f;
        }

        public String getPostalCode() {
            return this.postalCode;
        }

        public void setPostalCode(String str) {
            this.postalCode = str;
        }

        public void setContextLine(String str) {
            this.contextLine = str;
        }

        public String getContextLine() {
            return this.contextLine;
        }

        public String getNeighborhood() {
            return this.neighborhood;
        }

        public void setNeighborhood(String str) {
            this.neighborhood = str;
        }

        public String getState() {
            return this.state;
        }

        public void setState(String str) {
            this.state = str;
        }

        public String getCounty() {
            return this.mCounty;
        }

        public String getCountry() {
            return this.country;
        }

        public void setCountry(String str) {
            this.country = str;
        }

        public String getCc() {
            return this.cc;
        }

        public List<String> getFormattedAddress() {
            return this.formattedAddress;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.address);
            parcel.writeString(this.city);
            parcel.writeString(this.crossStreet);
            parcel.writeInt(this.distance);
            parcel.writeInt(this.isFuzzed);
            parcel.writeFloat(this.lat);
            parcel.writeFloat(this.lng);
            parcel.writeString(this.postalCode);
            parcel.writeString(this.contextLine);
            parcel.writeString(this.neighborhood);
            parcel.writeString(this.state);
            parcel.writeString(this.mCounty);
            parcel.writeString(this.country);
            parcel.writeString(this.cc);
            parcel.writeStringList(this.formattedAddress);
        }

        public boolean isValid() {
            return (getLat() == 0.0f || getLng() == 0.0f || getIsFuzzed()) ? false : true;
        }
    }

    public static class VenueChain implements Parcelable, FoursquareType {
        public static final Creator<VenueChain> CREATOR = new C19101();
        private String id;
        private String name;

        /* renamed from: com.foursquare.api.types.Venue$VenueChain$1 */
        class C19101 implements Creator<VenueChain> {
            C19101() {
            }

            public VenueChain createFromParcel(Parcel parcel) {
                return new VenueChain(parcel);
            }

            public VenueChain[] newArray(int i) {
                return new VenueChain[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public VenueChain(String str, String str2) {
            this.id = str;
            this.name = str2;
        }

        protected VenueChain(Parcel parcel) {
            this.id = parcel.readString();
            this.name = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.id);
            parcel.writeString(this.name);
        }

        public String getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class VenueParent implements Parcelable, FoursquareType {
        public static final Creator<VenueParent> CREATOR = new C19111();
        private String canonicalUrl;
        private ArrayList<Category> categories;
        private String id;
        private String lang;
        private String name;

        /* renamed from: com.foursquare.api.types.Venue$VenueParent$1 */
        class C19111 implements Creator<VenueParent> {
            C19111() {
            }

            public VenueParent createFromParcel(Parcel parcel) {
                return new VenueParent(parcel);
            }

            public VenueParent[] newArray(int i) {
                return new VenueParent[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected VenueParent(Parcel parcel) {
            this.id = parcel.readString();
            this.lang = parcel.readString();
            this.name = parcel.readString();
            this.canonicalUrl = parcel.readString();
            this.categories = parcel.createTypedArrayList(Category.CREATOR);
        }

        public String getId() {
            return this.id;
        }

        public void setId(String str) {
            this.id = str;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }

        public List<Category> getCategories() {
            return this.categories;
        }

        public void setCategories(ArrayList<Category> arrayList) {
            this.categories = arrayList;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.id);
            parcel.writeString(this.lang);
            parcel.writeString(this.name);
            parcel.writeString(this.canonicalUrl);
            parcel.writeTypedList(this.categories);
        }
    }

    public int describeContents() {
        return 0;
    }

    public Venue() {
        this.location = new Location();
        this.categories = new ArrayList();
    }

    private Venue(Parcel parcel) {
        this.id = parcel.readString();
        this.categories = parcel.createTypedArrayList(Category.CREATOR);
        this.location = (Location) parcel.readParcelable(Location.class.getClassLoader());
        this.name = parcel.readString();
        this.parent = (Venue) parcel.readParcelable(getClass().getClassLoader());
        this.storeId = parcel.readString();
        this.venueChains = parcel.createTypedArrayList(VenueChain.CREATOR);
        this.hierarchy = parcel.createTypedArrayList(VenueParent.CREATOR);
        this.partnerVenueId = parcel.readString();
        this.probability = parcel.readDouble();
    }

    public void setId(String str) {
        this.id = str;
    }

    @NonNull
    public String getId() {
        return this.id;
    }

    public String getPartnerVenueId() {
        return this.partnerVenueId;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append("[id=");
        stringBuilder.append(getId());
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        return stringBuilder.toString();
    }

    @NonNull
    public ArrayList<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(ArrayList<Category> arrayList) {
        this.categories = arrayList;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public Venue getParent() {
        return this.parent;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public double getProbability() {
        return this.probability;
    }

    public ArrayList<VenueChain> getVenueChains() {
        return this.venueChains;
    }

    public void setVenueChains(ArrayList<VenueChain> arrayList) {
        this.venueChains = arrayList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeTypedList(this.categories);
        parcel.writeParcelable(this.location, i);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.parent, i);
        parcel.writeString(this.storeId);
        parcel.writeTypedList(this.venueChains);
        parcel.writeTypedList(this.hierarchy);
        parcel.writeString(this.partnerVenueId);
        parcel.writeDouble(this.probability);
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Venue) {
                return getId().equals(((Venue) obj).getId());
            }
        }
        return null;
    }

    public Category getPrimaryCategory() {
        if (getCategories() == null || getCategories().size() <= 0) {
            return null;
        }
        for (int i = 0; i < getCategories().size(); i++) {
            Category category = (Category) getCategories().get(i);
            if (category.isPrimary()) {
                return category;
            }
        }
        return (Category) getCategories().get(0);
    }

    public ArrayList<VenueParent> getHierarchy() {
        return this.hierarchy;
    }

    public void setHierarchy(ArrayList<VenueParent> arrayList) {
        this.hierarchy = arrayList;
    }
}
