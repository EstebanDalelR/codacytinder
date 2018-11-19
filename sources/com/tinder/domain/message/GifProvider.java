package com.tinder.domain.message;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/tinder/domain/message/GifProvider;", "", "value", "", "(Ljava/lang/String;II)V", "GIPHY", "TINDER", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
public enum GifProvider {
    ;
    
    public static final Companion Companion = null;
    private static final GifProvider[] VALUES = null;
    private final int value;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/tinder/domain/message/GifProvider$Companion;", "", "()V", "VALUES", "", "Lcom/tinder/domain/message/GifProvider;", "[Lcom/tinder/domain/message/GifProvider;", "from", "value", "", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final GifProvider from(int i) {
            for (GifProvider gifProvider : GifProvider.VALUES) {
                if ((gifProvider.value == i ? 1 : null) != null) {
                    break;
                }
            }
            GifProvider gifProvider2 = null;
            return gifProvider2 != null ? gifProvider2 : GifProvider.GIPHY;
        }
    }

    protected GifProvider(int i) {
        this.value = i;
    }

    static {
        Companion = new Companion();
        VALUES = values();
    }
}
