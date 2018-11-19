package com.tinder.data.message;

import com.tinder.data.model.MessageModel;
import com.tinder.data.model.MessageModel.Creator;
import com.tinder.domain.message.DeliveryStatus;
import org.joda.time.DateTime;

final /* synthetic */ class ar implements Creator {
    /* renamed from: a */
    static final Creator f35430a = new ar();

    private ar() {
    }

    public MessageModel create(long j, String str, String str2, String str3, String str4, String str5, DateTime dateTime, boolean z, MessageType messageType, DeliveryStatus deliveryStatus, boolean z2) {
        return new C12953d(j, str, str2, str3, str4, str5, dateTime, z, messageType, deliveryStatus, z2);
    }
}
