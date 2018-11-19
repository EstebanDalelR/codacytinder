package com.tinder.spotify.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class SpotifyConnectResponse {
    @SerializedName("spotify_top_artists")
    /* renamed from: a */
    private List<Artist> f46858a;
    @SerializedName("spotify_theme_track")
    /* renamed from: b */
    private SearchTrack f46859b;
    @SerializedName("spotify_last_updated_at")
    /* renamed from: c */
    private String f46860c;
    @SerializedName("spotify_user_type")
    /* renamed from: d */
    private String f46861d;
    @SerializedName("spotify_username")
    /* renamed from: e */
    private String f46862e;
    @SerializedName("spotify_connected")
    /* renamed from: f */
    private boolean f46863f;

    private enum UserType {
        PREMIUM,
        OPEN
    }

    /* renamed from: a */
    public List<Artist> m56717a() {
        return this.f46858a;
    }

    /* renamed from: b */
    public SearchTrack m56718b() {
        return this.f46859b;
    }

    /* renamed from: c */
    public String m56719c() {
        return this.f46860c;
    }

    /* renamed from: d */
    public String m56720d() {
        return this.f46861d;
    }

    /* renamed from: e */
    public String m56721e() {
        return this.f46862e;
    }

    /* renamed from: f */
    public boolean m56722f() {
        return this.f46863f;
    }

    /* renamed from: g */
    public boolean m56723g() {
        return (m56720d() == null ? "" : m56720d()).toLowerCase().equals(UserType.PREMIUM.toString());
    }
}
