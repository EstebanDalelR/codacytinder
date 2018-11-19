package com.tinder.domain.recs.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/recs/model/ContextualInfo;", "", "Default", "engine_release"}, k = 1, mv = {1, 1, 9})
public interface ContextualInfo {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/tinder/domain/recs/model/ContextualInfo$Default;", "", "()V", "Empty", "ExpectedError", "UnexpectedError", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static abstract class Default {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/domain/recs/model/ContextualInfo$Default$Empty;", "Lcom/tinder/domain/recs/model/ContextualInfo;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
        public static final class Empty implements ContextualInfo {
            public static final Empty INSTANCE = new Empty();

            private Empty() {
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/domain/recs/model/ContextualInfo$Default$ExpectedError;", "Lcom/tinder/domain/recs/model/ContextualInfo;", "code", "", "(I)V", "getCode", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
        public static final class ExpectedError implements ContextualInfo {
            private final int code;

            @NotNull
            public static /* synthetic */ ExpectedError copy$default(ExpectedError expectedError, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = expectedError.code;
                }
                return expectedError.copy(i);
            }

            public final int component1() {
                return this.code;
            }

            @NotNull
            public final ExpectedError copy(int i) {
                return new ExpectedError(i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ExpectedError) {
                    if ((this.code == ((ExpectedError) obj).code ? 1 : null) != null) {
                        return true;
                    }
                }
                return false;
            }

            public int hashCode() {
                return this.code;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ExpectedError(code=");
                stringBuilder.append(this.code);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public ExpectedError(int i) {
                this.code = i;
            }

            public final int getCode() {
                return this.code;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/domain/recs/model/ContextualInfo$Default$UnexpectedError;", "Lcom/tinder/domain/recs/model/ContextualInfo;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, k = 1, mv = {1, 1, 9})
        public static final class UnexpectedError implements ContextualInfo {
            @NotNull
            private final Throwable error;

            @NotNull
            public static /* synthetic */ UnexpectedError copy$default(UnexpectedError unexpectedError, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = unexpectedError.error;
                }
                return unexpectedError.copy(th);
            }

            @NotNull
            public final Throwable component1() {
                return this.error;
            }

            @NotNull
            public final UnexpectedError copy(@NotNull Throwable th) {
                C2668g.b(th, "error");
                return new UnexpectedError(th);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof UnexpectedError) {
                        if (C2668g.a(this.error, ((UnexpectedError) obj).error)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Throwable th = this.error;
                return th != null ? th.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("UnexpectedError(error=");
                stringBuilder.append(this.error);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public UnexpectedError(@NotNull Throwable th) {
                C2668g.b(th, "error");
                this.error = th;
            }

            @NotNull
            public final Throwable getError() {
                return this.error;
            }
        }

        private Default() {
        }
    }
}
