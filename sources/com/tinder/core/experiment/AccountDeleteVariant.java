package com.tinder.core.experiment;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/tinder/core/experiment/AccountDeleteVariant;", "", "(Ljava/lang/String;I)V", "CONTROL", "PAUSE_PLUS_DELETE", "PAUSE_ONLY", "DEACTIVATE_ONLY", "NO_PAUSE_OR_DELETE", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public enum AccountDeleteVariant {
    ;
    
    public static final C8590a Companion = null;
    @NotNull
    public static final String FEATURE_NAME = "Account Delete Experiment Variant";

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/core/experiment/AccountDeleteVariant$Companion;", "", "()V", "FEATURE_NAME", "", "fromInt", "Lcom/tinder/core/experiment/AccountDeleteVariant;", "intValue", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.core.experiment.AccountDeleteVariant$a */
    public static final class C8590a {
        private C8590a() {
        }

        @NotNull
        /* renamed from: a */
        public final AccountDeleteVariant m36622a(int i) {
            switch (i) {
                case 0:
                    return AccountDeleteVariant.CONTROL;
                case 1:
                    return AccountDeleteVariant.PAUSE_PLUS_DELETE;
                case 2:
                    return AccountDeleteVariant.PAUSE_ONLY;
                case 3:
                    return AccountDeleteVariant.DEACTIVATE_ONLY;
                case 4:
                    return AccountDeleteVariant.NO_PAUSE_OR_DELETE;
                default:
                    return AccountDeleteVariant.CONTROL;
            }
        }
    }

    static {
        Companion = new C8590a();
    }
}
