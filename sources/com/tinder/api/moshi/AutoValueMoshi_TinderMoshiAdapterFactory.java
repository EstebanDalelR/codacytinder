package com.tinder.api.moshi;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.giphy.GiphyApiResponse;
import com.tinder.api.giphy.GiphyApiResponse.Giphy;
import com.tinder.api.giphy.GiphyApiResponse.Image;
import com.tinder.api.giphy.GiphyApiResponse.Images;
import com.tinder.api.model.auth.AccountKitValidateRequest;
import com.tinder.api.model.auth.AuthRequest;
import com.tinder.api.model.common.ApiMatch;
import com.tinder.api.model.common.ApiMatch.Person;
import com.tinder.api.model.common.ApiMatch.Place;
import com.tinder.api.model.common.Badge;
import com.tinder.api.model.common.CommonConnection;
import com.tinder.api.model.common.CommonConnection.Photo;
import com.tinder.api.model.common.Instagram;
import com.tinder.api.model.common.Interest;
import com.tinder.api.model.common.Job;
import com.tinder.api.model.common.Job.Company;
import com.tinder.api.model.common.Job.Title;
import com.tinder.api.model.common.ProcessedFile;
import com.tinder.api.model.common.ProcessedVideo;
import com.tinder.api.model.common.School;
import com.tinder.api.model.common.SpotifyArtist;
import com.tinder.api.model.common.SpotifyThemeTrack;
import com.tinder.api.model.common.SpotifyThemeTrack.Album;
import com.tinder.api.model.common.SpotifyThemeTrack.Artist;
import com.tinder.api.model.common.Teaser;
import com.tinder.api.model.common.TinderSelect;
import com.tinder.api.model.common.TinderSelect.Select;
import com.tinder.api.model.common.User;
import com.tinder.api.model.common.User.Location;
import com.tinder.api.model.location.LocationDetails;
import com.tinder.api.model.meta.Meta;
import com.tinder.api.model.meta.Meta.AccountConfig;
import com.tinder.api.model.meta.Meta.ClientResources;
import com.tinder.api.model.meta.Meta.ClientResources.RateCard;
import com.tinder.api.model.meta.Meta.ClientResources.RateCard.Carousel;
import com.tinder.api.model.meta.Meta.Globals;
import com.tinder.api.model.meta.Meta.PlacesConfig;
import com.tinder.api.model.meta.Meta.ProfileEditingConfig;
import com.tinder.api.model.meta.Meta.TypingIndicatorConfig;
import com.tinder.api.model.meta.Meta.Versions;
import com.tinder.api.model.meta.SuperLikes;
import com.tinder.api.model.profile.Facebook;
import com.tinder.api.model.profile.Notification;
import com.tinder.api.model.profile.Products;
import com.tinder.api.model.profile.Products.Product;
import com.tinder.api.model.profile.Products.Sku;
import com.tinder.api.model.profile.Products.Variant;
import com.tinder.api.model.profile.ProfileBoost;
import com.tinder.api.model.profile.ProfilePhotosResponse;
import com.tinder.api.model.profile.Purchase;
import com.tinder.api.model.profile.Rating;
import com.tinder.api.model.profile.Share;
import com.tinder.api.model.profile.Spotify;
import com.tinder.api.model.profile.Travel;
import com.tinder.api.model.profile.Travel.TravelLocationInfo;
import com.tinder.api.model.profile.Travel.TravelPosition;
import com.tinder.api.model.profile.spotify.Track;
import com.tinder.api.model.purchase.BillingReceipt;
import com.tinder.api.model.purchase.PurchaseLogRequest;
import com.tinder.api.model.purchase.PurchaseLogResponse;
import com.tinder.api.model.purchase.PurchaseValidation;
import com.tinder.api.model.purchase.PurchaseValidation.Receipt;
import com.tinder.api.model.rating.LikeRatingResponse;
import com.tinder.api.model.rating.PassRatingResponse;
import com.tinder.api.model.rating.SuperLikeRatingResponse;
import com.tinder.api.model.recs.Rec;
import com.tinder.api.model.updates.Updates;
import com.tinder.api.model.updates.Updates.Boost;
import com.tinder.api.model.updates.Updates.LikedMessage;
import com.tinder.api.model.updates.Updates.Places;
import com.tinder.api.model.updates.Updates.PollInterval;
import com.tinder.api.request.DiscoverabilitySettingsRequest;
import com.tinder.api.request.GenderSettingsRequest;
import com.tinder.api.request.HideProfileItemsRequestBody;
import com.tinder.api.request.LikeRatingRequest;
import com.tinder.api.request.PhotoOptimizerEnableRequest;
import com.tinder.api.request.ReportUserRequest;
import com.tinder.api.request.SchoolRequestBody;
import com.tinder.api.request.SchoolRequestBody.SchoolId;
import com.tinder.api.request.UpdateProfileRequest;
import com.tinder.api.response.EmptyResponse;
import com.tinder.api.response.FastMatchCountResponse;
import com.tinder.api.response.FastMatchCountResponse.Data;
import com.tinder.api.response.LocationResponse;
import com.tinder.api.response.ProfileResponse;
import com.tinder.api.response.ProfileResponse.ResponseData;
import com.tinder.api.response.SuperlikeStatusInfoResponse;
import com.tinder.api.response.TinderSelectResponse;
import com.tinder.api.response.UserResponse;
import com.tinder.api.response.v2.DataResponse;
import com.tinder.api.response.v2.FastMatchRecsResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;

public final class AutoValueMoshi_TinderMoshiAdapterFactory extends TinderMoshiAdapterFactory {
    public JsonAdapter<?> create(Type type, Set<? extends Annotation> set, C5987p c5987p) {
        if (set.isEmpty() == null) {
            return null;
        }
        if ((type instanceof ParameterizedType) != null) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getRawType().equals(DataResponse.class) != null) {
                return DataResponse.jsonAdapter(c5987p, parameterizedType.getActualTypeArguments());
            }
            return null;
        } else if (type.equals(GiphyApiResponse.class) != null) {
            return GiphyApiResponse.jsonAdapter(c5987p);
        } else {
            if (type.equals(Giphy.class) != null) {
                return Giphy.jsonAdapter(c5987p);
            }
            if (type.equals(Images.class) != null) {
                return Images.jsonAdapter(c5987p);
            }
            if (type.equals(Image.class) != null) {
                return Image.jsonAdapter(c5987p);
            }
            if (type.equals(AccountKitValidateRequest.class) != null) {
                return AccountKitValidateRequest.jsonAdapter(c5987p);
            }
            if (type.equals(AuthRequest.class) != null) {
                return AuthRequest.jsonAdapter(c5987p);
            }
            if (type.equals(ApiMatch.class) != null) {
                return ApiMatch.jsonAdapter(c5987p);
            }
            if (type.equals(Place.class) != null) {
                return Place.jsonAdapter(c5987p);
            }
            if (type.equals(Person.class) != null) {
                return Person.jsonAdapter(c5987p);
            }
            if (type.equals(Badge.class) != null) {
                return Badge.jsonAdapter(c5987p);
            }
            if (type.equals(CommonConnection.class) != null) {
                return CommonConnection.jsonAdapter(c5987p);
            }
            if (type.equals(Photo.class) != null) {
                return Photo.jsonAdapter(c5987p);
            }
            if (type.equals(Instagram.class) != null) {
                return Instagram.jsonAdapter(c5987p);
            }
            if (type.equals(Instagram.Photo.class) != null) {
                return Instagram.Photo.jsonAdapter(c5987p);
            }
            if (type.equals(Interest.class) != null) {
                return Interest.jsonAdapter(c5987p);
            }
            if (type.equals(Job.class) != null) {
                return Job.jsonAdapter(c5987p);
            }
            if (type.equals(Company.class) != null) {
                return Company.jsonAdapter(c5987p);
            }
            if (type.equals(Title.class) != null) {
                return Title.jsonAdapter(c5987p);
            }
            if (type.equals(com.tinder.api.model.common.Photo.class) != null) {
                return com.tinder.api.model.common.Photo.jsonAdapter(c5987p);
            }
            if (type.equals(ProcessedFile.class) != null) {
                return ProcessedFile.jsonAdapter(c5987p);
            }
            if (type.equals(ProcessedVideo.class) != null) {
                return ProcessedVideo.jsonAdapter(c5987p);
            }
            if (type.equals(School.class) != null) {
                return School.jsonAdapter(c5987p);
            }
            if (type.equals(SpotifyArtist.class) != null) {
                return SpotifyArtist.jsonAdapter(c5987p);
            }
            if (type.equals(SpotifyThemeTrack.class) != null) {
                return SpotifyThemeTrack.jsonAdapter(c5987p);
            }
            if (type.equals(Artist.class) != null) {
                return Artist.jsonAdapter(c5987p);
            }
            if (type.equals(Album.class) != null) {
                return Album.jsonAdapter(c5987p);
            }
            if (type.equals(SpotifyThemeTrack.Image.class) != null) {
                return SpotifyThemeTrack.Image.jsonAdapter(c5987p);
            }
            if (type.equals(Teaser.class) != null) {
                return Teaser.jsonAdapter(c5987p);
            }
            if (type.equals(TinderSelect.class) != null) {
                return TinderSelect.jsonAdapter(c5987p);
            }
            if (type.equals(Select.class) != null) {
                return Select.jsonAdapter(c5987p);
            }
            if (type.equals(User.class) != null) {
                return User.jsonAdapter(c5987p);
            }
            if (type.equals(Location.class) != null) {
                return Location.jsonAdapter(c5987p);
            }
            if (type.equals(com.tinder.api.model.location.Location.class) != null) {
                return com.tinder.api.model.location.Location.jsonAdapter(c5987p);
            }
            if (type.equals(LocationDetails.class) != null) {
                return LocationDetails.jsonAdapter(c5987p);
            }
            if (type.equals(Meta.class) != null) {
                return Meta.jsonAdapter(c5987p);
            }
            if (type.equals(ClientResources.class) != null) {
                return ClientResources.jsonAdapter(c5987p);
            }
            if (type.equals(RateCard.class) != null) {
                return RateCard.jsonAdapter(c5987p);
            }
            if (type.equals(Carousel.class) != null) {
                return Carousel.jsonAdapter(c5987p);
            }
            if (type.equals(Versions.class) != null) {
                return Versions.jsonAdapter(c5987p);
            }
            if (type.equals(Globals.class) != null) {
                return Globals.jsonAdapter(c5987p);
            }
            if (type.equals(AccountConfig.class) != null) {
                return AccountConfig.jsonAdapter(c5987p);
            }
            if (type.equals(TypingIndicatorConfig.class) != null) {
                return TypingIndicatorConfig.jsonAdapter(c5987p);
            }
            if (type.equals(ProfileEditingConfig.class) != null) {
                return ProfileEditingConfig.jsonAdapter(c5987p);
            }
            if (type.equals(PlacesConfig.class) != null) {
                return PlacesConfig.jsonAdapter(c5987p);
            }
            if (type.equals(SuperLikes.class) != null) {
                return SuperLikes.jsonAdapter(c5987p);
            }
            if (type.equals(Facebook.class) != null) {
                return Facebook.jsonAdapter(c5987p);
            }
            if (type.equals(Notification.class) != null) {
                return Notification.jsonAdapter(c5987p);
            }
            if (type.equals(Products.class) != null) {
                return Products.jsonAdapter(c5987p);
            }
            if (type.equals(Variant.class) != null) {
                return Variant.jsonAdapter(c5987p);
            }
            if (type.equals(Product.class) != null) {
                return Product.jsonAdapter(c5987p);
            }
            if (type.equals(Sku.class) != null) {
                return Sku.jsonAdapter(c5987p);
            }
            if (type.equals(ProfileBoost.class) != null) {
                return ProfileBoost.jsonAdapter(c5987p);
            }
            if (type.equals(ProfilePhotosResponse.class) != null) {
                return ProfilePhotosResponse.jsonAdapter(c5987p);
            }
            if (type.equals(Purchase.class) != null) {
                return Purchase.jsonAdapter(c5987p);
            }
            if (type.equals(Rating.class) != null) {
                return Rating.jsonAdapter(c5987p);
            }
            if (type.equals(Share.class) != null) {
                return Share.jsonAdapter(c5987p);
            }
            if (type.equals(com.tinder.api.model.profile.spotify.Album.class) != null) {
                return com.tinder.api.model.profile.spotify.Album.jsonAdapter(c5987p);
            }
            if (type.equals(com.tinder.api.model.profile.spotify.Artist.class) != null) {
                return com.tinder.api.model.profile.spotify.Artist.jsonAdapter(c5987p);
            }
            if (type.equals(Track.class) != null) {
                return Track.jsonAdapter(c5987p);
            }
            if (type.equals(Spotify.class) != null) {
                return Spotify.jsonAdapter(c5987p);
            }
            if (type.equals(Travel.class) != null) {
                return Travel.jsonAdapter(c5987p);
            }
            if (type.equals(TravelPosition.class) != null) {
                return TravelPosition.jsonAdapter(c5987p);
            }
            if (type.equals(TravelLocationInfo.class) != null) {
                return TravelLocationInfo.jsonAdapter(c5987p);
            }
            if (type.equals(BillingReceipt.class) != null) {
                return BillingReceipt.jsonAdapter(c5987p);
            }
            if (type.equals(PurchaseLogRequest.class) != null) {
                return PurchaseLogRequest.jsonAdapter(c5987p);
            }
            if (type.equals(PurchaseLogResponse.class) != null) {
                return PurchaseLogResponse.jsonAdapter(c5987p);
            }
            if (type.equals(PurchaseValidation.class) != null) {
                return PurchaseValidation.jsonAdapter(c5987p);
            }
            if (type.equals(Receipt.class) != null) {
                return Receipt.jsonAdapter(c5987p);
            }
            if (type.equals(LikeRatingResponse.class) != null) {
                return LikeRatingResponse.jsonAdapter(c5987p);
            }
            if (type.equals(PassRatingResponse.class) != null) {
                return PassRatingResponse.jsonAdapter(c5987p);
            }
            if (type.equals(SuperLikeRatingResponse.class) != null) {
                return SuperLikeRatingResponse.jsonAdapter(c5987p);
            }
            if (type.equals(Rec.class) != null) {
                return Rec.jsonAdapter(c5987p);
            }
            if (type.equals(Rec.Spotify.class) != null) {
                return Rec.Spotify.jsonAdapter(c5987p);
            }
            if (type.equals(Rec.User.class) != null) {
                return Rec.User.jsonAdapter(c5987p);
            }
            if (type.equals(Updates.class) != null) {
                return Updates.jsonAdapter(c5987p);
            }
            if (type.equals(Boost.class) != null) {
                return Boost.jsonAdapter(c5987p);
            }
            if (type.equals(LikedMessage.class) != null) {
                return LikedMessage.jsonAdapter(c5987p);
            }
            if (type.equals(PollInterval.class) != null) {
                return PollInterval.jsonAdapter(c5987p);
            }
            if (type.equals(Places.class) != null) {
                return Places.jsonAdapter(c5987p);
            }
            if (type.equals(DiscoverabilitySettingsRequest.class) != null) {
                return DiscoverabilitySettingsRequest.jsonAdapter(c5987p);
            }
            if (type.equals(GenderSettingsRequest.class) != null) {
                return GenderSettingsRequest.jsonAdapter(c5987p);
            }
            if (type.equals(HideProfileItemsRequestBody.class) != null) {
                return HideProfileItemsRequestBody.jsonAdapter(c5987p);
            }
            if (type.equals(LikeRatingRequest.class) != null) {
                return LikeRatingRequest.jsonAdapter(c5987p);
            }
            if (type.equals(PhotoOptimizerEnableRequest.class) != null) {
                return PhotoOptimizerEnableRequest.jsonAdapter(c5987p);
            }
            if (type.equals(ReportUserRequest.class) != null) {
                return ReportUserRequest.jsonAdapter(c5987p);
            }
            if (type.equals(SchoolRequestBody.class) != null) {
                return SchoolRequestBody.jsonAdapter(c5987p);
            }
            if (type.equals(SchoolId.class) != null) {
                return SchoolId.jsonAdapter(c5987p);
            }
            if (type.equals(UpdateProfileRequest.class) != null) {
                return UpdateProfileRequest.jsonAdapter(c5987p);
            }
            if (type.equals(EmptyResponse.class) != null) {
                return EmptyResponse.jsonAdapter(c5987p);
            }
            if (type.equals(FastMatchCountResponse.class) != null) {
                return FastMatchCountResponse.jsonAdapter(c5987p);
            }
            if (type.equals(Data.class) != null) {
                return Data.jsonAdapter(c5987p);
            }
            if (type.equals(FastMatchCountResponse.Meta.class) != null) {
                return FastMatchCountResponse.Meta.jsonAdapter(c5987p);
            }
            if (type.equals(LocationResponse.class) != null) {
                return LocationResponse.jsonAdapter(c5987p);
            }
            if (type.equals(ProfileResponse.class) != null) {
                return ProfileResponse.jsonAdapter(c5987p);
            }
            if (type.equals(ResponseData.class) != null) {
                return ResponseData.jsonAdapter(c5987p);
            }
            if (type.equals(SuperlikeStatusInfoResponse.class) != null) {
                return SuperlikeStatusInfoResponse.jsonAdapter(c5987p);
            }
            if (type.equals(TinderSelectResponse.class) != null) {
                return TinderSelectResponse.jsonAdapter(c5987p);
            }
            if (type.equals(UserResponse.class) != null) {
                return UserResponse.jsonAdapter(c5987p);
            }
            if (type.equals(FastMatchRecsResponse.class) != null) {
                return FastMatchRecsResponse.jsonAdapter(c5987p);
            }
            if (type.equals(FastMatchRecsResponse.Data.class) != null) {
                return FastMatchRecsResponse.Data.jsonAdapter(c5987p);
            }
            if (type.equals(FastMatchRecsResponse.Meta.class) != null) {
                return FastMatchRecsResponse.Meta.jsonAdapter(c5987p);
            }
            return null;
        }
    }
}
