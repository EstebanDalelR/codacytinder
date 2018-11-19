package com.tinder.superlikeable.analytics;

import com.tinder.domain.common.usecase.VoidUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent;", "T", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "()V", "Method", "SuperLikeablePosition", "Type", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
public abstract class AddSuperLikeableInteractEvent<T> implements VoidUseCase<T> {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$Method;", "", "analyticsValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "SWIPE", "BUTTON", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    public enum Method {
        ;
        
        @NotNull
        private final String analyticsValue;

        protected Method(String str) {
            C2668g.b(str, "analyticsValue");
            this.analyticsValue = str;
        }

        @NotNull
        public final String getAnalyticsValue() {
            return this.analyticsValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$SuperLikeablePosition;", "", "analyticsValue", "", "(Ljava/lang/String;II)V", "getAnalyticsValue", "()I", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "Companion", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    public enum SuperLikeablePosition {
        ;
        
        public static final C15089a Companion = null;
        private final int analyticsValue;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$SuperLikeablePosition$Companion;", "", "()V", "fromIndex", "Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$SuperLikeablePosition;", "recIndex", "", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.superlikeable.analytics.AddSuperLikeableInteractEvent$SuperLikeablePosition$a */
        public static final class C15089a {
            private C15089a() {
            }

            @NotNull
            /* renamed from: a */
            public final SuperLikeablePosition m56839a(int i) {
                switch (i) {
                    case 0:
                        return SuperLikeablePosition.TOP_LEFT;
                    case 1:
                        return SuperLikeablePosition.TOP_RIGHT;
                    case 2:
                        return SuperLikeablePosition.BOTTOM_LEFT;
                    case 3:
                        return SuperLikeablePosition.BOTTOM_RIGHT;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown position for index ");
                        stringBuilder.append(i);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }

        protected SuperLikeablePosition(int i) {
            this.analyticsValue = i;
        }

        public final int getAnalyticsValue() {
            return this.analyticsValue;
        }

        static {
            Companion = new C15089a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/superlikeable/analytics/AddSuperLikeableInteractEvent$Type;", "", "analyticsValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "PROFILE", "SUPERLIKE", "superlikeable_release"}, k = 1, mv = {1, 1, 10})
    public enum Type {
        ;
        
        @NotNull
        private final String analyticsValue;

        protected Type(String str) {
            C2668g.b(str, "analyticsValue");
            this.analyticsValue = str;
        }

        @NotNull
        public final String getAnalyticsValue() {
            return this.analyticsValue;
        }
    }
}
