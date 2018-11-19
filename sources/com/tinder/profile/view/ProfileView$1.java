package com.tinder.profile.view;

import com.tinder.R;
import com.tinder.profile.model.ProfileFeature;
import java.util.HashMap;

class ProfileView$1 extends HashMap<ProfileFeature, Integer> {
    /* renamed from: a */
    final /* synthetic */ ProfileView f45790a;

    ProfileView$1(ProfileView profileView) {
        this.f45790a = profileView;
        put(ProfileFeature.BASIC_INFO_TAPPY, Integer.valueOf(R.layout.row_view_profile_info_tappy));
        put(ProfileFeature.BIO, Integer.valueOf(R.layout.row_view_profile_bio));
        put(ProfileFeature.ANTHEM, Integer.valueOf(R.layout.row_view_profile_anthem));
        put(ProfileFeature.TOP_ARTISTS, Integer.valueOf(R.layout.row_view_profile_top_artist));
        put(ProfileFeature.COMMON_CONNECTIONS, Integer.valueOf(R.layout.row_view_profile_common_connections));
        put(ProfileFeature.POTENTIAL_COMMON_CONNECTIONS, Integer.valueOf(R.layout.row_view_profile_potential_common_connections));
        put(ProfileFeature.INSTAGRAM, Integer.valueOf(R.layout.row_view_profile_instagram));
        put(ProfileFeature.CONNECT_INSTAGRAM, Integer.valueOf(R.layout.row_view_profile_instagram_connect));
        put(ProfileFeature.INTERESTS, Integer.valueOf(R.layout.row_view_profile_interests));
        put(ProfileFeature.RECOMMEND, Integer.valueOf(R.layout.row_view_profile_recommend));
        put(ProfileFeature.DIVIDER, Integer.valueOf(R.layout.row_view_profile_divider));
        put(ProfileFeature.CONNECT_SPOTIFY, Integer.valueOf(R.layout.row_view_profile_connect_spotify));
        put(ProfileFeature.MARGIN_BOTTOM, Integer.valueOf(R.layout.row_view_profile_margin_bottom));
        put(ProfileFeature.REPORT_USER, Integer.valueOf(R.layout.row_view_report_user));
    }
}
