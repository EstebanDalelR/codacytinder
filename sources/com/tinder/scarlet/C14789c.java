package com.tinder.scarlet;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/scarlet/Message;", "", "()V", "Bytes", "Text", "Lcom/tinder/scarlet/Message$Text;", "Lcom/tinder/scarlet/Message$Bytes;", "scarlet-core"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.c */
public abstract class C14789c {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/tinder/scarlet/Message$Bytes;", "Lcom/tinder/scarlet/Message;", "value", "", "([B)V", "getValue", "()[B", "component1", "scarlet-core"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.c$a */
    public static final class C16513a extends C14789c {
        @NotNull
        /* renamed from: a */
        private final byte[] f51180a;

        public C16513a(@NotNull byte[] bArr) {
            C2668g.b(bArr, "value");
            super();
            this.f51180a = bArr;
        }

        @NotNull
        /* renamed from: a */
        public final byte[] m61932a() {
            return this.f51180a;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/scarlet/Message$Text;", "Lcom/tinder/scarlet/Message;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "scarlet-core"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.c$b */
    public static final class C16514b extends C14789c {
        @NotNull
        /* renamed from: a */
        private final String f51181a;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C16514b) {
                    if (C2668g.a(this.f51181a, ((C16514b) obj).f51181a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f51181a;
            return str != null ? str.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Text(value=");
            stringBuilder.append(this.f51181a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C16514b(@NotNull String str) {
            C2668g.b(str, "value");
            super();
            this.f51181a = str;
        }

        @NotNull
        /* renamed from: a */
        public final String m61933a() {
            return this.f51181a;
        }
    }

    private C14789c() {
    }
}
