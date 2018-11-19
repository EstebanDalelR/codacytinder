package com.tinder.scarlet;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/scarlet/Deserialization;", "T", "", "()V", "Error", "Success", "Lcom/tinder/scarlet/Deserialization$Success;", "Lcom/tinder/scarlet/Deserialization$Error;", "scarlet-core"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.a */
public abstract class C14787a<T> {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/scarlet/Deserialization$Error;", "T", "Lcom/tinder/scarlet/Deserialization;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "scarlet-core"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.a$a */
    public static final class C16497a<T> extends C14787a<T> {
        @NotNull
        /* renamed from: a */
        private final Throwable f51173a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C16497a) {
                    if (C2668g.a(this.f51173a, ((C16497a) obj).f51173a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Throwable th = this.f51173a;
            return th != null ? th.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error(throwable=");
            stringBuilder.append(this.f51173a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C16497a(@NotNull Throwable th) {
            C2668g.b(th, "throwable");
            super();
            this.f51173a = th;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/tinder/scarlet/Deserialization$Success;", "T", "Lcom/tinder/scarlet/Deserialization;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/tinder/scarlet/Deserialization$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "scarlet-core"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.a$b */
    public static final class C16498b<T> extends C14787a<T> {
        /* renamed from: a */
        private final T f51174a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C16498b) {
                    if (C2668g.a(this.f51174a, ((C16498b) obj).f51174a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Object obj = this.f51174a;
            return obj != null ? obj.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Success(value=");
            stringBuilder.append(this.f51174a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C16498b(T t) {
            super();
            this.f51174a = t;
        }

        /* renamed from: a */
        public final T m61921a() {
            return this.f51174a;
        }
    }

    private C14787a() {
    }
}
