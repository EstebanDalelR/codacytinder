package com.tinder.data.message;

import com.tinder.data.message.aq.C10833b;
import com.tinder.data.model.GifModel;
import com.tinder.data.model.MessageModel;
import com.tinder.data.model.MessageModel.Message_viewCreator;
import com.tinder.data.model.MessageModel.Message_viewModel;
import com.tinder.data.model.ReactionModel;

final /* synthetic */ class at implements Message_viewCreator {
    /* renamed from: a */
    static final Message_viewCreator f35432a = new at();

    private at() {
    }

    public Message_viewModel create(MessageModel messageModel, GifModel gifModel, ReactionModel reactionModel) {
        return new C12954e((C10833b) messageModel, (C10835f) gifModel, (az) reactionModel);
    }
}
