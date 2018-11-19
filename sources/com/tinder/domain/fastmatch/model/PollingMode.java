package com.tinder.domain.fastmatch.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/fastmatch/model/PollingMode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "NONE", "ADDITIVE", "ABSOLUTE", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public enum PollingMode {
    ;
    
    public static final Companion Companion = null;
    private final int value;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/fastmatch/model/PollingMode$Companion;", "", "()V", "fromInt", "Lcom/tinder/domain/fastmatch/model/PollingMode;", "value", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final PollingMode fromInt(int i) {
            for (PollingMode pollingMode : PollingMode.values()) {
                if (pollingMode.getValue() == i) {
                    return pollingMode;
                }
            }
            return PollingMode.NONE;
        }
    }

    protected PollingMode(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        Companion = new Companion();
    }
}
