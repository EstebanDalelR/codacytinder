package com.tinder.domain.places.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001 B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/tinder/domain/places/model/PlacesOnboardingConfig;", "", "place", "Lcom/tinder/domain/places/model/Place;", "conversation", "", "", "titles", "pins", "rec", "Lcom/tinder/domain/places/model/PlacesOnboardingConfig$OnboardingRec;", "(Lcom/tinder/domain/places/model/Place;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/tinder/domain/places/model/PlacesOnboardingConfig$OnboardingRec;)V", "getConversation", "()Ljava/util/List;", "getPins", "getPlace", "()Lcom/tinder/domain/places/model/Place;", "getRec", "()Lcom/tinder/domain/places/model/PlacesOnboardingConfig$OnboardingRec;", "getTitles", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "OnboardingRec", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesOnboardingConfig {
    @NotNull
    private final List<String> conversation;
    @NotNull
    private final List<Place> pins;
    @NotNull
    private final Place place;
    @NotNull
    private final OnboardingRec rec;
    @NotNull
    private final List<String> titles;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/places/model/PlacesOnboardingConfig$OnboardingRec;", "", "name", "", "imageUrl", "school", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getName", "getSchool", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class OnboardingRec {
        @NotNull
        private final String imageUrl;
        @NotNull
        private final String name;
        @Nullable
        private final String school;

        public OnboardingRec(@NotNull String str, @NotNull String str2, @Nullable String str3) {
            C2668g.b(str, "name");
            C2668g.b(str2, "imageUrl");
            this.name = str;
            this.imageUrl = str2;
            this.school = str3;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public /* synthetic */ OnboardingRec(String str, String str2, String str3, int i, C15823e c15823e) {
            if ((i & 4) != 0) {
                str3 = null;
            }
            this(str, str2, str3);
        }

        @Nullable
        public final String getSchool() {
            return this.school;
        }
    }

    @NotNull
    public static /* synthetic */ PlacesOnboardingConfig copy$default(PlacesOnboardingConfig placesOnboardingConfig, Place place, List list, List list2, List list3, OnboardingRec onboardingRec, int i, Object obj) {
        if ((i & 1) != 0) {
            place = placesOnboardingConfig.place;
        }
        if ((i & 2) != 0) {
            list = placesOnboardingConfig.conversation;
        }
        List list4 = list;
        if ((i & 4) != 0) {
            list2 = placesOnboardingConfig.titles;
        }
        List list5 = list2;
        if ((i & 8) != 0) {
            list3 = placesOnboardingConfig.pins;
        }
        List list6 = list3;
        if ((i & 16) != 0) {
            onboardingRec = placesOnboardingConfig.rec;
        }
        return placesOnboardingConfig.copy(place, list4, list5, list6, onboardingRec);
    }

    @NotNull
    public final Place component1() {
        return this.place;
    }

    @NotNull
    public final List<String> component2() {
        return this.conversation;
    }

    @NotNull
    public final List<String> component3() {
        return this.titles;
    }

    @NotNull
    public final List<Place> component4() {
        return this.pins;
    }

    @NotNull
    public final OnboardingRec component5() {
        return this.rec;
    }

    @NotNull
    public final PlacesOnboardingConfig copy(@NotNull Place place, @NotNull List<String> list, @NotNull List<String> list2, @NotNull List<Place> list3, @NotNull OnboardingRec onboardingRec) {
        C2668g.b(place, "place");
        C2668g.b(list, "conversation");
        C2668g.b(list2, "titles");
        C2668g.b(list3, "pins");
        C2668g.b(onboardingRec, "rec");
        return new PlacesOnboardingConfig(place, list, list2, list3, onboardingRec);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlacesOnboardingConfig) {
                PlacesOnboardingConfig placesOnboardingConfig = (PlacesOnboardingConfig) obj;
                if (C2668g.a(this.place, placesOnboardingConfig.place) && C2668g.a(this.conversation, placesOnboardingConfig.conversation) && C2668g.a(this.titles, placesOnboardingConfig.titles) && C2668g.a(this.pins, placesOnboardingConfig.pins) && C2668g.a(this.rec, placesOnboardingConfig.rec)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Place place = this.place;
        int i = 0;
        int hashCode = (place != null ? place.hashCode() : 0) * 31;
        List list = this.conversation;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.titles;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.pins;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        OnboardingRec onboardingRec = this.rec;
        if (onboardingRec != null) {
            i = onboardingRec.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlacesOnboardingConfig(place=");
        stringBuilder.append(this.place);
        stringBuilder.append(", conversation=");
        stringBuilder.append(this.conversation);
        stringBuilder.append(", titles=");
        stringBuilder.append(this.titles);
        stringBuilder.append(", pins=");
        stringBuilder.append(this.pins);
        stringBuilder.append(", rec=");
        stringBuilder.append(this.rec);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public PlacesOnboardingConfig(@NotNull Place place, @NotNull List<String> list, @NotNull List<String> list2, @NotNull List<Place> list3, @NotNull OnboardingRec onboardingRec) {
        C2668g.b(place, "place");
        C2668g.b(list, "conversation");
        C2668g.b(list2, "titles");
        C2668g.b(list3, "pins");
        C2668g.b(onboardingRec, "rec");
        this.place = place;
        this.conversation = list;
        this.titles = list2;
        this.pins = list3;
        this.rec = onboardingRec;
    }

    @NotNull
    public final Place getPlace() {
        return this.place;
    }

    @NotNull
    public final List<String> getConversation() {
        return this.conversation;
    }

    @NotNull
    public final List<String> getTitles() {
        return this.titles;
    }

    @NotNull
    public final List<Place> getPins() {
        return this.pins;
    }

    @NotNull
    public final OnboardingRec getRec() {
        return this.rec;
    }
}
