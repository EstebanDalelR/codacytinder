package com.tinder.domain.reactions.model;

import com.tinder.domain.message.Reaction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, d2 = {"Lcom/tinder/domain/reactions/model/GrandGestureType;", "", "gestureId", "", "messageText", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getGestureId", "()Ljava/lang/String;", "getMessageText", "toReaction", "Lcom/tinder/domain/message/Reaction;", "HEART", "LAUGH", "CLAP", "REALLY", "UGH", "NOPE", "EYEROLL", "STRIKE_1", "STRIKE_2", "STRIKE_3", "MARTINI", "BALL_IN_COURT", "UNSUPPORTED", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public enum GrandGestureType {
    ;
    
    public static final Companion Companion = null;
    @NotNull
    private final String gestureId;
    @NotNull
    private final String messageText;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/reactions/model/GrandGestureType$Companion;", "", "()V", "fromValue", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "value", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final GrandGestureType fromValue(@NotNull String str) {
            C2668g.b(str, "value");
            GrandGestureType[] values = GrandGestureType.values();
            Collection arrayList = new ArrayList();
            for (GrandGestureType grandGestureType : values) {
                if (C2668g.a(grandGestureType.getGestureId(), str)) {
                    arrayList.add(grandGestureType);
                }
            }
            str = ((List) arrayList).iterator();
            return str.hasNext() ? (GrandGestureType) str.next() : GrandGestureType.UNSUPPORTED;
        }
    }

    protected GrandGestureType(String str, String str2) {
        C2668g.b(str, "gestureId");
        C2668g.b(str2, "messageText");
        this.gestureId = str;
        this.messageText = str2;
    }

    @NotNull
    public final String getGestureId() {
        return this.gestureId;
    }

    @NotNull
    public final String getMessageText() {
        return this.messageText;
    }

    static {
        Companion = new Companion();
    }

    @NotNull
    public final Reaction toReaction() {
        return new Reaction(this.gestureId);
    }
}
