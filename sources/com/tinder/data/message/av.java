package com.tinder.data.message;

import com.tinder.api.ManagerWebServices;
import com.tinder.data.adapter.C2646o;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/tinder/data/message/MessageTypeApiAdapter;", "Lcom/tinder/data/adapter/DomainApiAdapter;", "Lcom/tinder/data/message/MessageType;", "", "()V", "fromApi", "apiMessageType", "data_release"}, k = 1, mv = {1, 1, 10})
public final class av extends C2646o<MessageType, String> {
    @NotNull
    /* renamed from: a */
    public MessageType m43283a(@NotNull String str) {
        C2668g.b(str, "apiMessageType");
        switch (str.hashCode()) {
            case -1655966961:
                if (str.equals("activity")) {
                    return MessageType.ACTIVITY;
                }
                break;
            case -887328209:
                if (str.equals("system")) {
                    return MessageType.SYSTEM;
                }
                break;
            case -75080375:
                if (str.equals("gesture")) {
                    return MessageType.REACTION;
                }
                break;
            case 102340:
                if (str.equals("gif")) {
                    return MessageType.GIF;
                }
                break;
            case 3556653:
                if (str.equals(ManagerWebServices.PARAM_TEXT)) {
                    return MessageType.TEXT;
                }
                break;
            case 100313435:
                if (str.equals(ManagerWebServices.IG_PARAM_IMAGE)) {
                    return MessageType.IMAGE;
                }
                break;
            default:
                break;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown message type: ");
        stringBuilder.append(str);
        C0001a.c(new IllegalArgumentException(stringBuilder.toString()));
        return MessageType.UNKNOWN;
    }
}
