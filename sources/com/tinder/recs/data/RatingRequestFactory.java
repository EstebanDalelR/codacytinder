package com.tinder.recs.data;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.api.request.LikeRatingRequest;
import com.tinder.api.request.PassRatingRequest;
import com.tinder.api.request.SuperLikeRatingRequest;
import com.tinder.boost.p178a.C10400d;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.config.TopPicksConfig;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.domain.recs.RecsEngine;
import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.recs.model.PlacesUserRec;
import com.tinder.domain.recs.model.Rec;
import com.tinder.domain.recs.model.RecSource.Core;
import com.tinder.domain.recs.model.Swipe;
import com.tinder.domain.recs.model.Swipe.Type;
import com.tinder.domain.recs.model.TopPickUserRec;
import com.tinder.domain.recs.model.UserRec;
import com.tinder.passport.p093d.C3945a;
import java8.util.Optional;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class RatingRequestFactory {
    private final Factory ratingRequestCommonFieldsFactory;

    static abstract class RatingRequestCommonFields {

        public static abstract class Builder {
            public abstract RatingRequestCommonFields build();

            public abstract Builder contentHash(String str);

            public abstract Builder didRecUserSuperlike(Boolean bool);

            public abstract Builder isCurrentUserBoosting(Boolean bool);

            public abstract Builder isCurrentUserPassporting(Boolean bool);

            public abstract Builder isFastMatch(Boolean bool);

            public abstract Builder isTopPicks(Boolean bool);

            public abstract Builder isUndo(Boolean bool);

            public abstract Builder photoId(String str);

            public abstract Builder placeId(String str);

            public abstract Builder recId(String str);

            public abstract Builder sNumber(Long l);

            public abstract Builder wasRecUserPassporting(Boolean bool);
        }

        @Singleton
        static class Factory {
            private final C10400d boostInteractor;
            private final FastMatchConfigProvider fastMatchConfigProvider;
            private final C3945a managerPassport;
            private final RecsEngineRegistry recsEngineRegistry;
            private final SubscriptionProvider subscriptionProvider;
            private final TopPicksConfig topPicksConfig;

            @Inject
            Factory(C3945a c3945a, C10400d c10400d, FastMatchConfigProvider fastMatchConfigProvider, TopPicksConfig topPicksConfig, SubscriptionProvider subscriptionProvider, RecsEngineRegistry recsEngineRegistry) {
                this.managerPassport = c3945a;
                this.boostInteractor = c10400d;
                this.fastMatchConfigProvider = fastMatchConfigProvider;
                this.topPicksConfig = topPicksConfig;
                this.subscriptionProvider = subscriptionProvider;
                this.recsEngineRegistry = recsEngineRegistry;
            }

            @NonNull
            private RatingRequestCommonFields create(@NonNull Rec rec) {
                if (!(rec instanceof UserRec)) {
                    return RatingRequestCommonFields.builder().recId(rec.getId()).build();
                }
                UserRec userRec = (UserRec) rec;
                return RatingRequestCommonFields.builder().recId(userRec.getId()).photoId(parseMainPhotoId(userRec)).contentHash(parseContentHash(userRec)).didRecUserSuperlike(parseDidRecUserSuperlike(userRec)).isCurrentUserPassporting(parseIsCurrentUserPassporting()).isCurrentUserBoosting(parseIsCurrentUserBoosting()).isFastMatch(parseIsFastMatch(userRec)).isTopPicks(parseIsTopPicks(userRec)).isUndo(parseIsUndo(userRec)).placeId(parsePlaceId(userRec)).sNumber(parseSNumber(userRec)).build();
            }

            @Nullable
            private String parseMainPhotoId(@NonNull UserRec userRec) {
                userRec = userRec.getUser().photos();
                if (userRec.isEmpty()) {
                    return null;
                }
                userRec = ((Photo) userRec.get(0)).id();
                if (userRec.isEmpty()) {
                    return null;
                }
                return userRec;
            }

            @Nullable
            private String parseContentHash(@NonNull UserRec userRec) {
                if (parseMainPhotoId(userRec) == null) {
                    return null;
                }
                return userRec.getContentHash();
            }

            @Nullable
            private Boolean parseDidRecUserSuperlike(@NonNull UserRec userRec) {
                if (userRec.isSuperLike() == null) {
                    return null;
                }
                return Boolean.valueOf(true);
            }

            @Nullable
            private Boolean parseIsCurrentUserPassporting() {
                if (this.managerPassport.d()) {
                    return Boolean.valueOf(true);
                }
                return null;
            }

            @Nullable
            private Boolean parseIsCurrentUserBoosting() {
                return this.boostInteractor.isUserBoosting() ? Boolean.valueOf(true) : null;
            }

            @Nullable
            private Boolean parseIsFastMatch(@NonNull UserRec userRec) {
                return (this.fastMatchConfigProvider.get().isEnabled() && this.subscriptionProvider.get().isGold() && userRec.isFastMatch() != null) ? Boolean.valueOf(true) : null;
            }

            @Nullable
            private Boolean parseIsTopPicks(@NonNull UserRec userRec) {
                return (this.topPicksConfig.isEnabled() && this.subscriptionProvider.get().isGold() && (userRec instanceof TopPickUserRec) != null) ? Boolean.valueOf(true) : null;
            }

            @Nullable
            private Boolean parseIsUndo(@NonNull UserRec userRec) {
                RecsEngine engine = this.recsEngineRegistry.getEngine(Core.INSTANCE);
                userRec = (engine == null || engine.isRewound(userRec.getId()) == null) ? null : true;
                return (this.fastMatchConfigProvider.get().isEnabled() && this.subscriptionProvider.get().isGold() && userRec != null) ? Boolean.valueOf(true) : null;
            }

            @Nullable
            private Long parseSNumber(@NonNull UserRec userRec) {
                long sNumber = userRec.getSNumber();
                if (sNumber <= 0) {
                    return null;
                }
                return Long.valueOf(sNumber);
            }

            @Nullable
            private String parsePlaceId(@NonNull UserRec userRec) {
                return userRec instanceof PlacesUserRec ? ((PlacesUserRec) userRec).getPlaceId() : null;
            }
        }

        @Nullable
        public abstract String contentHash();

        @Nullable
        public abstract Boolean didRecUserSuperlike();

        @Nullable
        public abstract Boolean isCurrentUserBoosting();

        @Nullable
        public abstract Boolean isCurrentUserPassporting();

        @Nullable
        public abstract Boolean isFastMatch();

        @Nullable
        public abstract Boolean isTopPicks();

        @Nullable
        public abstract Boolean isUndo();

        @Nullable
        public abstract String photoId();

        @Nullable
        public abstract String placeId();

        @NonNull
        public abstract String recId();

        @Nullable
        public abstract Long sNumber();

        @Nullable
        public abstract Boolean wasRecUserPassporting();

        RatingRequestCommonFields() {
        }

        public static Builder builder() {
            return new Builder();
        }
    }

    @Inject
    public RatingRequestFactory(Factory factory) {
        this.ratingRequestCommonFieldsFactory = factory;
    }

    @NonNull
    public LikeRatingRequest createLikeRatingRequest(@NonNull Swipe swipe) {
        if (swipe.getType() != Type.LIKE) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Swipe does not have type ");
            stringBuilder.append(Type.LIKE);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        swipe = this.ratingRequestCommonFieldsFactory.create(swipe.getRec());
        Integer parseBooleanIntoInteger = parseBooleanIntoInteger(swipe.didRecUserSuperlike());
        Integer parseBooleanIntoInteger2 = parseBooleanIntoInteger(swipe.isUndo());
        Integer parseBooleanIntoInteger3 = parseBooleanIntoInteger(swipe.isFastMatch());
        return LikeRatingRequest.builder().photoId(swipe.photoId()).contentHash(swipe.contentHash()).didRecUserSuperlike(parseBooleanIntoInteger).wasRecUserPassporting(swipe.wasRecUserPassporting()).isCurrentUserPassporting(swipe.isCurrentUserPassporting()).isCurrentUserBoosting(swipe.isCurrentUserBoosting()).isFastMatch(parseBooleanIntoInteger3).isTopPicks(parseBooleanIntoInteger(swipe.isTopPicks())).isUndo(parseBooleanIntoInteger2).placeId(swipe.placeId()).sNumber(swipe.sNumber()).build();
    }

    @NonNull
    public SuperLikeRatingRequest createSuperLikeRatingRequest(@NonNull Swipe swipe) {
        if (swipe.getType() != Type.SUPERLIKE) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Swipe does not have type ");
            stringBuilder.append(Type.SUPERLIKE);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        swipe = this.ratingRequestCommonFieldsFactory.create(swipe.getRec());
        return SuperLikeRatingRequest.builder().recId(swipe.recId()).photoId(swipe.photoId()).wasRecUserPassporting(swipe.wasRecUserPassporting()).isCurrentUserPassporting(swipe.isCurrentUserPassporting()).isCurrentUserBoosting(swipe.isCurrentUserBoosting()).isFastMatch(swipe.isFastMatch()).isTopPicks(swipe.isTopPicks()).sNumber(swipe.sNumber()).build();
    }

    @NonNull
    public PassRatingRequest createPassRatingRequest(@NonNull Swipe swipe) {
        if (swipe.getType() != Type.PASS) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Swipe does not have type ");
            stringBuilder.append(Type.PASS);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        swipe = this.ratingRequestCommonFieldsFactory.create(swipe.getRec());
        return PassRatingRequest.builder().recId(swipe.recId()).photoId(swipe.photoId()).contentHash(swipe.contentHash()).didRecUserSuperlike(swipe.didRecUserSuperlike()).isCurrentUserBoosting(swipe.isCurrentUserBoosting()).isFastMatch(swipe.isFastMatch()).isTopPicks(swipe.isTopPicks()).isUndo(swipe.isUndo()).sNumber(swipe.sNumber()).build();
    }

    @Nullable
    private Integer parseBooleanIntoInteger(Boolean bool) {
        return (Integer) Optional.m59121b((Object) bool).m59122a(RatingRequestFactory$$Lambda$0.$instance).m59130c(null);
    }
}
