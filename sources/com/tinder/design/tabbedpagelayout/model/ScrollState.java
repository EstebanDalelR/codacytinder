package com.tinder.design.tabbedpagelayout.model;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ae;
import kotlin.ranges.C19068g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/tinder/design/tabbedpagelayout/model/ScrollState;", "", "state", "", "(Ljava/lang/String;II)V", "getState", "()I", "SCROLL_STATE_IDLE", "SCROLL_STATE_DRAGGING", "SCROLL_STATE_SETTLING", "Companion", "tabbedpagelayout_release"}, k = 1, mv = {1, 1, 10})
public enum ScrollState {
    ;
    
    public static final C8825a Companion = null;
    private static final Map<Integer, ScrollState> map = null;
    private final int state;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/design/tabbedpagelayout/model/ScrollState$Companion;", "", "()V", "map", "", "", "Lcom/tinder/design/tabbedpagelayout/model/ScrollState;", "from", "value", "tabbedpagelayout_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.design.tabbedpagelayout.model.ScrollState$a */
    public static final class C8825a {
        private C8825a() {
        }

        @NotNull
        /* renamed from: a */
        public final ScrollState m37547a(int i) {
            Object obj = ScrollState.map.get(Integer.valueOf(i));
            if (obj != null) {
                return (ScrollState) obj;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown view pager scroll state ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
    }

    protected ScrollState(int i) {
        this.state = i;
    }

    public final int getState() {
        return this.state;
    }

    static {
        Companion = new C8825a();
        ScrollState[] values = values();
        Map linkedHashMap = new LinkedHashMap(C19068g.c(ae.a(values.length), 16));
        int length = values.length;
        int i;
        while (i < length) {
            ScrollState scrollState = values[i];
            linkedHashMap.put(Integer.valueOf(scrollState.state), scrollState);
            i++;
        }
        map = linkedHashMap;
    }
}
