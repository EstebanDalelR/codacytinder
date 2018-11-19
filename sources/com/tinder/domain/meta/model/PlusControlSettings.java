package com.tinder.domain.meta.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.ManagerWebServices;
import com.tinder.common.utils.C8578a;

public abstract class PlusControlSettings {

    public enum Blend {
        OPTIMAL("optimal"),
        POPULARITY(ManagerWebServices.PARAM_SPOTIFY_POPULARITY),
        DISTANCE("distance"),
        RECENT_ACTIVITY("recency");
        
        private final String blendString;

        private Blend(String str) {
            this.blendString = str;
        }

        @NonNull
        public String toString() {
            return this.blendString;
        }

        @NonNull
        public static Blend from(@Nullable String str) throws IllegalArgumentException {
            if (C8578a.m36596a(str)) {
                return OPTIMAL;
            }
            for (Blend blend : values()) {
                if (blend.toString().equalsIgnoreCase(str)) {
                    return blend;
                }
            }
            return OPTIMAL;
        }
    }

    public static abstract class Builder {
        public abstract Builder blend(Blend blend);

        public abstract PlusControlSettings build();

        public abstract Builder discoverableParty(DiscoverableParty discoverableParty);

        @Deprecated
        public abstract Builder isHideAds(boolean z);

        public abstract Builder isHideAge(boolean z);

        public abstract Builder isHideDistance(boolean z);
    }

    public enum DiscoverableParty {
        EVERYONE("everyone"),
        LIKED("liked"),
        OUTSIDE_FB("outside_fb");
        
        private final String discoverableParty;

        private DiscoverableParty(String str) {
            this.discoverableParty = str;
        }

        @NonNull
        public String toString() {
            return this.discoverableParty;
        }

        @NonNull
        public static DiscoverableParty from(@Nullable String str) throws IllegalArgumentException {
            if (str == null) {
                return EVERYONE;
            }
            for (DiscoverableParty discoverableParty : values()) {
                if (discoverableParty.toString().equalsIgnoreCase(str)) {
                    return discoverableParty;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot convert ");
            stringBuilder.append(str);
            stringBuilder.append(" into DiscoverableParty");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    @NonNull
    public abstract Blend blend();

    @NonNull
    public abstract DiscoverableParty discoverableParty();

    @Deprecated
    public abstract boolean isHideAds();

    public abstract boolean isHideAge();

    public abstract boolean isHideDistance();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder().isHideAds(false).isHideAge(false).isHideDistance(false).discoverableParty(DiscoverableParty.EVERYONE).blend(Blend.OPTIMAL);
    }
}
