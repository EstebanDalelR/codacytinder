package com.tinder.api.response;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.common.TinderSelect;
import com.tinder.api.model.profile.ProfileBoost;
import com.tinder.api.model.profile.Spotify;
import com.tinder.api.response.ProfileResponse.ResponseData;
import java.io.IOException;

final class AutoValue_ProfileResponse_ResponseData extends C$AutoValue_ProfileResponse_ResponseData {

    public static final class MoshiJsonAdapter extends JsonAdapter<ResponseData> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_BOOST, ManagerWebServices.PARAM_SPOTIFY, "select"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<ProfileBoost> boostAdapter;
        private final JsonAdapter<Spotify> spotifyAdapter;
        private final JsonAdapter<TinderSelect> tinderSelectAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.boostAdapter = c5987p.a(ProfileBoost.class);
            this.spotifyAdapter = c5987p.a(Spotify.class);
            this.tinderSelectAdapter = c5987p.a(TinderSelect.class);
        }

        public ResponseData fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            ProfileBoost profileBoost = null;
            Spotify spotify = null;
            TinderSelect tinderSelect = spotify;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        profileBoost = (ProfileBoost) this.boostAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        spotify = (Spotify) this.spotifyAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        tinderSelect = (TinderSelect) this.tinderSelectAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_ProfileResponse_ResponseData(profileBoost, spotify, tinderSelect);
        }

        public void toJson(C5983k c5983k, ResponseData responseData) throws IOException {
            c5983k.c();
            ProfileBoost boost = responseData.boost();
            if (boost != null) {
                c5983k.b(ManagerWebServices.PARAM_BOOST);
                this.boostAdapter.toJson(c5983k, boost);
            }
            Spotify spotify = responseData.spotify();
            if (spotify != null) {
                c5983k.b(ManagerWebServices.PARAM_SPOTIFY);
                this.spotifyAdapter.toJson(c5983k, spotify);
            }
            responseData = responseData.tinderSelect();
            if (responseData != null) {
                c5983k.b("select");
                this.tinderSelectAdapter.toJson(c5983k, responseData);
            }
            c5983k.d();
        }
    }

    AutoValue_ProfileResponse_ResponseData(ProfileBoost profileBoost, Spotify spotify, TinderSelect tinderSelect) {
        super(profileBoost, spotify, tinderSelect);
    }
}
