package com.foursquare.api.types;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GeocoderLocation implements Parcelable, FoursquareType {
    public static final Creator<GeocoderLocation> CREATOR = new C18951();
    private Feature feature;
    private Group<Feature> parents;
    private String where;

    /* renamed from: com.foursquare.api.types.GeocoderLocation$1 */
    class C18951 implements Creator<GeocoderLocation> {
        C18951() {
        }

        public GeocoderLocation createFromParcel(Parcel parcel) {
            return new GeocoderLocation(parcel);
        }

        public GeocoderLocation[] newArray(int i) {
            return new GeocoderLocation[i];
        }
    }

    public static class Bounds implements Parcelable, FoursquareType {
        public static final Creator<Bounds> CREATOR = new C18961();
        private LatLng ne;
        private LatLng sw;

        /* renamed from: com.foursquare.api.types.GeocoderLocation$Bounds$1 */
        class C18961 implements Creator<Bounds> {
            C18961() {
            }

            public Bounds createFromParcel(Parcel parcel) {
                return new Bounds(parcel);
            }

            public Bounds[] newArray(int i) {
                return new Bounds[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        private Bounds(Parcel parcel) {
            this.ne = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
            this.sw = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        }

        public LatLng getNE() {
            return this.ne;
        }

        public LatLng getSW() {
            return this.sw;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.ne, i);
            parcel.writeParcelable(this.sw, i);
        }
    }

    public static class Feature implements Parcelable, FoursquareType {
        public static final Creator<Feature> CREATOR = new C18971();
        private boolean allowExplore;
        private String cc;
        private String displayName;
        private Geometry geometry;
        private boolean hasCityPage;
        private String highlightedName;
        private String id;
        private String longId;
        private String matchedName;
        private String name;
        private String slug;
        private int woeType;

        /* renamed from: com.foursquare.api.types.GeocoderLocation$Feature$1 */
        class C18971 implements Creator<Feature> {
            C18971() {
            }

            public Feature createFromParcel(Parcel parcel) {
                return new Feature(parcel);
            }

            public Feature[] newArray(int i) {
                return new Feature[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        private Feature(Parcel parcel) {
            this.cc = parcel.readString();
            this.name = parcel.readString();
            this.displayName = parcel.readString();
            this.matchedName = parcel.readString();
            this.highlightedName = parcel.readString();
            this.woeType = parcel.readInt();
            this.slug = parcel.readString();
            this.id = parcel.readString();
            this.longId = parcel.readString();
            this.geometry = (Geometry) parcel.readParcelable(Geometry.class.getClassLoader());
            boolean z = false;
            this.hasCityPage = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.allowExplore = z;
        }

        public String getCountryCode() {
            return this.cc;
        }

        public String getName() {
            return this.name;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public String getMatchedName() {
            return this.matchedName;
        }

        public String getId() {
            return this.id;
        }

        public String getLongId() {
            return this.longId;
        }

        public Geometry getGeometry() {
            return this.geometry;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.cc);
            parcel.writeString(this.name);
            parcel.writeString(this.displayName);
            parcel.writeString(this.matchedName);
            parcel.writeString(this.highlightedName);
            parcel.writeInt(this.woeType);
            parcel.writeString(this.slug);
            parcel.writeString(this.id);
            parcel.writeString(this.longId);
            parcel.writeParcelable(this.geometry, i);
            parcel.writeInt(this.hasCityPage);
            parcel.writeInt(this.allowExplore);
        }
    }

    public static class Geometry implements Parcelable, FoursquareType {
        public static final Creator<Geometry> CREATOR = new C18981();
        private Bounds bounds;
        private LatLng center;

        /* renamed from: com.foursquare.api.types.GeocoderLocation$Geometry$1 */
        class C18981 implements Creator<Geometry> {
            C18981() {
            }

            public Geometry createFromParcel(Parcel parcel) {
                return new Geometry(parcel);
            }

            public Geometry[] newArray(int i) {
                return new Geometry[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        private Geometry(Parcel parcel) {
            this.center = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
            this.bounds = (Bounds) parcel.readParcelable(Bounds.class.getClassLoader());
        }

        public LatLng getCenter() {
            return this.center;
        }

        public Bounds getBounds() {
            return this.bounds;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.center, i);
            parcel.writeParcelable(this.bounds, i);
        }
    }

    public int describeContents() {
        return 0;
    }

    private GeocoderLocation(Parcel parcel) {
        this.where = parcel.readString();
        this.feature = (Feature) parcel.readParcelable(Feature.class.getClassLoader());
        this.parents = (Group) parcel.readParcelable(Group.class.getClassLoader());
    }

    public String getQuery() {
        return this.where;
    }

    public Feature getFeature() {
        return this.feature;
    }

    public Group<Feature> getParents() {
        return this.parents;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.where);
        parcel.writeParcelable(this.feature, i);
        parcel.writeParcelable(this.parents, i);
    }
}
