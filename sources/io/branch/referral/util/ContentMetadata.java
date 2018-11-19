package io.branch.referral.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.j$a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ContentMetadata implements Parcelable {
    public static final Creator CREATOR = new C155971();
    public String addressCity;
    public String addressCountry;
    public String addressPostalCode;
    public String addressRegion;
    public String addressStreet;
    public CONDITION condition;
    BranchContentSchema contentSchema;
    public CurrencyType currencyType;
    private final HashMap<String, String> customMetadata;
    private final ArrayList<String> imageCaptions;
    public Double latitude;
    public Double longitude;
    public Double price;
    public String productBrand;
    public ProductCategory productCategory;
    public String productName;
    public String productVariant;
    public Double quantity;
    public Double rating;
    public Double ratingAverage;
    public Integer ratingCount;
    public Double ratingMax;
    public String sku;

    /* renamed from: io.branch.referral.util.ContentMetadata$1 */
    static class C155971 implements Creator {
        C155971() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m58497a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m58498a(i);
        }

        /* renamed from: a */
        public ContentMetadata m58497a(Parcel parcel) {
            return new ContentMetadata(parcel);
        }

        /* renamed from: a */
        public ContentMetadata[] m58498a(int i) {
            return new ContentMetadata[i];
        }
    }

    public enum CONDITION {
        OTHER,
        NEW,
        GOOD,
        FAIR,
        POOR,
        USED,
        REFURBISHED,
        EXCELLENT;

        public static CONDITION getValue(String str) {
            if (!TextUtils.isEmpty(str)) {
                for (CONDITION condition : values()) {
                    if (condition.name().equalsIgnoreCase(str)) {
                        return condition;
                    }
                }
            }
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public ContentMetadata() {
        this.imageCaptions = new ArrayList();
        this.customMetadata = new HashMap();
    }

    public ContentMetadata addImageCaptions(String... strArr) {
        Collections.addAll(this.imageCaptions, strArr);
        return this;
    }

    public ContentMetadata addCustomMetadata(String str, String str2) {
        this.customMetadata.put(str, str2);
        return this;
    }

    public ContentMetadata setContentSchema(BranchContentSchema branchContentSchema) {
        this.contentSchema = branchContentSchema;
        return this;
    }

    public ContentMetadata setQuantity(Double d) {
        this.quantity = d;
        return this;
    }

    public ContentMetadata setAddress(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.addressStreet = str;
        this.addressCity = str2;
        this.addressRegion = str3;
        this.addressCountry = str4;
        this.addressPostalCode = str5;
        return this;
    }

    public ContentMetadata setLocation(@Nullable Double d, @Nullable Double d2) {
        this.latitude = d;
        this.longitude = d2;
        return this;
    }

    public ContentMetadata setRating(@Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Integer num) {
        this.rating = d;
        this.ratingAverage = d2;
        this.ratingMax = d3;
        this.ratingCount = num;
        return this;
    }

    public ContentMetadata setRating(@Nullable Double d, @Nullable Double d2, @Nullable Integer num) {
        this.ratingAverage = d;
        this.ratingMax = d2;
        this.ratingCount = num;
        return this;
    }

    public ContentMetadata setPrice(Double d, @Nullable CurrencyType currencyType) {
        this.price = d;
        this.currencyType = currencyType;
        return this;
    }

    public ContentMetadata setProductBrand(String str) {
        this.productBrand = str;
        return this;
    }

    public ContentMetadata setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
        return this;
    }

    public ContentMetadata setProductCondition(CONDITION condition) {
        this.condition = condition;
        return this;
    }

    public ContentMetadata setProductName(String str) {
        this.productName = str;
        return this;
    }

    public ContentMetadata setProductVariant(String str) {
        this.productVariant = str;
        return this;
    }

    public ContentMetadata setSku(String str) {
        this.sku = str;
        return this;
    }

    public ArrayList<String> getImageCaptions() {
        return this.imageCaptions;
    }

    public HashMap<String, String> getCustomMetadata() {
        return this.customMetadata;
    }

    public JSONObject convertToJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.contentSchema != null) {
                jSONObject.put(Jsonkey.ContentSchema.getKey(), this.contentSchema.name());
            }
            if (this.quantity != null) {
                jSONObject.put(Jsonkey.Quantity.getKey(), this.quantity);
            }
            if (this.price != null) {
                jSONObject.put(Jsonkey.Price.getKey(), this.price);
            }
            if (this.currencyType != null) {
                jSONObject.put(Jsonkey.PriceCurrency.getKey(), this.currencyType.toString());
            }
            if (!TextUtils.isEmpty(this.sku)) {
                jSONObject.put(Jsonkey.SKU.getKey(), this.sku);
            }
            if (!TextUtils.isEmpty(this.productName)) {
                jSONObject.put(Jsonkey.ProductName.getKey(), this.productName);
            }
            if (!TextUtils.isEmpty(this.productBrand)) {
                jSONObject.put(Jsonkey.ProductBrand.getKey(), this.productBrand);
            }
            if (this.productCategory != null) {
                jSONObject.put(Jsonkey.ProductCategory.getKey(), this.productCategory.getName());
            }
            if (this.condition != null) {
                jSONObject.put(Jsonkey.Condition.getKey(), this.condition.name());
            }
            if (!TextUtils.isEmpty(this.productVariant)) {
                jSONObject.put(Jsonkey.ProductVariant.getKey(), this.productVariant);
            }
            if (this.rating != null) {
                jSONObject.put(Jsonkey.Rating.getKey(), this.rating);
            }
            if (this.ratingAverage != null) {
                jSONObject.put(Jsonkey.RatingAverage.getKey(), this.ratingAverage);
            }
            if (this.ratingCount != null) {
                jSONObject.put(Jsonkey.RatingCount.getKey(), this.ratingCount);
            }
            if (this.ratingMax != null) {
                jSONObject.put(Jsonkey.RatingMax.getKey(), this.ratingMax);
            }
            if (!TextUtils.isEmpty(this.addressStreet)) {
                jSONObject.put(Jsonkey.AddressStreet.getKey(), this.addressStreet);
            }
            if (!TextUtils.isEmpty(this.addressCity)) {
                jSONObject.put(Jsonkey.AddressCity.getKey(), this.addressCity);
            }
            if (!TextUtils.isEmpty(this.addressRegion)) {
                jSONObject.put(Jsonkey.AddressRegion.getKey(), this.addressRegion);
            }
            if (!TextUtils.isEmpty(this.addressCountry)) {
                jSONObject.put(Jsonkey.AddressCountry.getKey(), this.addressCountry);
            }
            if (!TextUtils.isEmpty(this.addressPostalCode)) {
                jSONObject.put(Jsonkey.AddressPostalCode.getKey(), this.addressPostalCode);
            }
            if (this.latitude != null) {
                jSONObject.put(Jsonkey.Latitude.getKey(), this.latitude);
            }
            if (this.longitude != null) {
                jSONObject.put(Jsonkey.Longitude.getKey(), this.longitude);
            }
            if (this.imageCaptions.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put(Jsonkey.ImageCaptions.getKey(), jSONArray);
                Iterator it = this.imageCaptions.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
            }
            if (this.customMetadata.size() > 0) {
                for (String str : this.customMetadata.keySet()) {
                    jSONObject.put(str, this.customMetadata.get(str));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static ContentMetadata createFromJson(j$a j_a) {
        ContentMetadata contentMetadata = new ContentMetadata();
        contentMetadata.contentSchema = BranchContentSchema.getValue(j_a.m58366a(Jsonkey.ContentSchema.getKey()));
        contentMetadata.quantity = j_a.m58364a(Jsonkey.Quantity.getKey(), null);
        contentMetadata.price = j_a.m58364a(Jsonkey.Price.getKey(), null);
        contentMetadata.currencyType = CurrencyType.getValue(j_a.m58366a(Jsonkey.PriceCurrency.getKey()));
        contentMetadata.sku = j_a.m58366a(Jsonkey.SKU.getKey());
        contentMetadata.productName = j_a.m58366a(Jsonkey.ProductName.getKey());
        contentMetadata.productBrand = j_a.m58366a(Jsonkey.ProductBrand.getKey());
        contentMetadata.productCategory = ProductCategory.getValue(j_a.m58366a(Jsonkey.ProductCategory.getKey()));
        contentMetadata.condition = CONDITION.getValue(j_a.m58366a(Jsonkey.Condition.getKey()));
        contentMetadata.productVariant = j_a.m58366a(Jsonkey.ProductVariant.getKey());
        contentMetadata.rating = j_a.m58364a(Jsonkey.Rating.getKey(), null);
        contentMetadata.ratingAverage = j_a.m58364a(Jsonkey.RatingAverage.getKey(), null);
        contentMetadata.ratingCount = j_a.m58365a(Jsonkey.RatingCount.getKey(), null);
        contentMetadata.ratingMax = j_a.m58364a(Jsonkey.RatingMax.getKey(), null);
        contentMetadata.addressStreet = j_a.m58366a(Jsonkey.AddressStreet.getKey());
        contentMetadata.addressCity = j_a.m58366a(Jsonkey.AddressCity.getKey());
        contentMetadata.addressRegion = j_a.m58366a(Jsonkey.AddressRegion.getKey());
        contentMetadata.addressCountry = j_a.m58366a(Jsonkey.AddressCountry.getKey());
        contentMetadata.addressPostalCode = j_a.m58366a(Jsonkey.AddressPostalCode.getKey());
        contentMetadata.latitude = j_a.m58364a(Jsonkey.Latitude.getKey(), null);
        contentMetadata.longitude = j_a.m58364a(Jsonkey.Longitude.getKey(), null);
        JSONArray d = j_a.m58370d(Jsonkey.ImageCaptions.getKey());
        if (d != null) {
            for (int i = 0; i < d.length(); i++) {
                contentMetadata.imageCaptions.add(d.optString(i));
            }
        }
        try {
            j_a = j_a.m58367a();
            Iterator keys = j_a.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                contentMetadata.customMetadata.put(str, j_a.optString(str));
            }
        } catch (j$a j_a2) {
            j_a2.printStackTrace();
        }
        return contentMetadata;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.contentSchema != 0 ? this.contentSchema.name() : "");
        parcel.writeSerializable(this.quantity);
        parcel.writeSerializable(this.price);
        parcel.writeString(this.currencyType != 0 ? this.currencyType.name() : "");
        parcel.writeString(this.sku);
        parcel.writeString(this.productName);
        parcel.writeString(this.productBrand);
        parcel.writeString(this.productCategory != 0 ? this.productCategory.getName() : "");
        parcel.writeString(this.condition != 0 ? this.condition.name() : "");
        parcel.writeString(this.productVariant);
        parcel.writeSerializable(this.rating);
        parcel.writeSerializable(this.ratingAverage);
        parcel.writeSerializable(this.ratingCount);
        parcel.writeSerializable(this.ratingMax);
        parcel.writeString(this.addressStreet);
        parcel.writeString(this.addressCity);
        parcel.writeString(this.addressRegion);
        parcel.writeString(this.addressCountry);
        parcel.writeString(this.addressPostalCode);
        parcel.writeSerializable(this.latitude);
        parcel.writeSerializable(this.longitude);
        parcel.writeSerializable(this.imageCaptions);
        parcel.writeSerializable(this.customMetadata);
    }

    private ContentMetadata(Parcel parcel) {
        this();
        this.contentSchema = BranchContentSchema.getValue(parcel.readString());
        this.quantity = (Double) parcel.readSerializable();
        this.price = (Double) parcel.readSerializable();
        this.currencyType = CurrencyType.getValue(parcel.readString());
        this.sku = parcel.readString();
        this.productName = parcel.readString();
        this.productBrand = parcel.readString();
        this.productCategory = ProductCategory.getValue(parcel.readString());
        this.condition = CONDITION.getValue(parcel.readString());
        this.productVariant = parcel.readString();
        this.rating = (Double) parcel.readSerializable();
        this.ratingAverage = (Double) parcel.readSerializable();
        this.ratingCount = (Integer) parcel.readSerializable();
        this.ratingMax = (Double) parcel.readSerializable();
        this.addressStreet = parcel.readString();
        this.addressCity = parcel.readString();
        this.addressRegion = parcel.readString();
        this.addressCountry = parcel.readString();
        this.addressPostalCode = parcel.readString();
        this.latitude = (Double) parcel.readSerializable();
        this.longitude = (Double) parcel.readSerializable();
        this.imageCaptions.addAll((ArrayList) parcel.readSerializable());
        this.customMetadata.putAll((HashMap) parcel.readSerializable());
    }
}
