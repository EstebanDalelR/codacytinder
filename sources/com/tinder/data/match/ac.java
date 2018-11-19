package com.tinder.data.match;

import com.tinder.data.model.MatchModel;
import com.tinder.data.model.MatchModel.Match_viewCreator;
import com.tinder.data.model.MatchModel.Match_viewModel;
import com.tinder.data.model.MatchPersonModel;
import com.tinder.data.model.SponsoredMatchCreativeValuesModel;

final /* synthetic */ class ac implements Match_viewCreator {
    /* renamed from: a */
    static final Match_viewCreator f35232a = new ac();

    private ac() {
    }

    public Match_viewModel create(String str, MatchModel matchModel, MatchPersonModel matchPersonModel, SponsoredMatchCreativeValuesModel sponsoredMatchCreativeValuesModel) {
        return new C12918h(str, matchModel, matchPersonModel, sponsoredMatchCreativeValuesModel);
    }
}
