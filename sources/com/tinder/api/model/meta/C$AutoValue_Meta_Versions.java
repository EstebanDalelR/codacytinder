package com.tinder.api.model.meta;

import com.squareup.moshi.Json;
import com.tinder.api.model.meta.Meta.Versions;

/* renamed from: com.tinder.api.model.meta.$AutoValue_Meta_Versions */
abstract class C$AutoValue_Meta_Versions extends Versions {
    private final String activeText;
    private final String ageFilter;
    private final String matchmaker;
    private final String trending;
    private final String trendingActiveText;

    C$AutoValue_Meta_Versions(String str, String str2, String str3, String str4, String str5) {
        if (str == null) {
            throw new NullPointerException("Null activeText");
        }
        this.activeText = str;
        if (str2 == null) {
            throw new NullPointerException("Null ageFilter");
        }
        this.ageFilter = str2;
        if (str3 == null) {
            throw new NullPointerException("Null matchmaker");
        }
        this.matchmaker = str3;
        if (str4 == null) {
            throw new NullPointerException("Null trending");
        }
        this.trending = str4;
        if (str5 == null) {
            throw new NullPointerException("Null trendingActiveText");
        }
        this.trendingActiveText = str5;
    }

    @Json(name = "active_text")
    public String activeText() {
        return this.activeText;
    }

    @Json(name = "age_filter")
    public String ageFilter() {
        return this.ageFilter;
    }

    public String matchmaker() {
        return this.matchmaker;
    }

    public String trending() {
        return this.trending;
    }

    @Json(name = "trending_active_text")
    public String trendingActiveText() {
        return this.trendingActiveText;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Versions{activeText=");
        stringBuilder.append(this.activeText);
        stringBuilder.append(", ageFilter=");
        stringBuilder.append(this.ageFilter);
        stringBuilder.append(", matchmaker=");
        stringBuilder.append(this.matchmaker);
        stringBuilder.append(", trending=");
        stringBuilder.append(this.trending);
        stringBuilder.append(", trendingActiveText=");
        stringBuilder.append(this.trendingActiveText);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Versions)) {
            return false;
        }
        Versions versions = (Versions) obj;
        if (!this.activeText.equals(versions.activeText()) || !this.ageFilter.equals(versions.ageFilter()) || !this.matchmaker.equals(versions.matchmaker()) || !this.trending.equals(versions.trending()) || this.trendingActiveText.equals(versions.trendingActiveText()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((this.activeText.hashCode() ^ 1000003) * 1000003) ^ this.ageFilter.hashCode()) * 1000003) ^ this.matchmaker.hashCode()) * 1000003) ^ this.trending.hashCode()) * 1000003) ^ this.trendingActiveText.hashCode();
    }
}
