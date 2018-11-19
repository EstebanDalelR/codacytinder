package com.tinder.data.match;

import com.tinder.data.model.MatchGroupMemberModel;
import com.tinder.data.model.MatchGroupModel;
import com.tinder.data.model.MatchGroupModel.Group_viewCreator;
import com.tinder.data.model.MatchGroupModel.Group_viewModel;
import com.tinder.data.model.MatchPersonModel;

final /* synthetic */ class ag implements Group_viewCreator {
    /* renamed from: a */
    static final Group_viewCreator f35236a = new ag();

    private ag() {
    }

    public Group_viewModel create(String str, MatchGroupModel matchGroupModel, MatchGroupMemberModel matchGroupMemberModel, MatchPersonModel matchPersonModel) {
        return new C12912b(str, matchGroupModel, matchGroupMemberModel, matchPersonModel);
    }
}
