package com.tinder.data.message;

import com.tinder.data.message.aq.C10834c;
import com.tinder.data.model.MessageModel.Message_viewModel;
import com.tinder.data.model.MessageModel.Select_latest_message_by_matchCreator;
import com.tinder.data.model.MessageModel.Select_latest_message_by_matchModel;

final /* synthetic */ class as implements Select_latest_message_by_matchCreator {
    /* renamed from: a */
    static final Select_latest_message_by_matchCreator f35431a = new as();

    private as() {
    }

    public Select_latest_message_by_matchModel create(Message_viewModel message_viewModel, long j) {
        return new C12952c((C10834c) message_viewModel, j);
    }
}
