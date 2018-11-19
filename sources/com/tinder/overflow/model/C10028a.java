package com.tinder.overflow.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/tinder/overflow/model/FeedbackAction;", "", "reasonOption", "Lcom/tinder/overflow/model/ReasonOption;", "(Lcom/tinder/overflow/model/ReasonOption;)V", "getReasonOption", "()Lcom/tinder/overflow/model/ReasonOption;", "value", "", "getValue", "()Ljava/lang/String;", "Cancel", "Error", "Submit", "Lcom/tinder/overflow/model/FeedbackAction$Submit;", "Lcom/tinder/overflow/model/FeedbackAction$Error;", "Lcom/tinder/overflow/model/FeedbackAction$Cancel;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.model.a */
public abstract class C10028a {
    @Nullable
    /* renamed from: a */
    private final ReasonOption f32911a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/overflow/model/FeedbackAction$Error;", "Lcom/tinder/overflow/model/FeedbackAction;", "option", "Lcom/tinder/overflow/model/ReasonOption;", "(Lcom/tinder/overflow/model/ReasonOption;)V", "getOption", "()Lcom/tinder/overflow/model/ReasonOption;", "value", "", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.model.a$a */
    public static final class C12247a extends C10028a {
        @NotNull
        /* renamed from: a */
        private final ReasonOption f39633a;

        @NotNull
        /* renamed from: a */
        public String mo10700a() {
            return "error";
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C12247a) {
                    if (C2668g.a(this.f39633a, ((C12247a) obj).f39633a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            ReasonOption reasonOption = this.f39633a;
            return reasonOption != null ? reasonOption.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error(option=");
            stringBuilder.append(this.f39633a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C12247a(@NotNull ReasonOption reasonOption) {
            C2668g.b(reasonOption, "option");
            super(reasonOption);
            this.f39633a = reasonOption;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/overflow/model/FeedbackAction$Submit;", "Lcom/tinder/overflow/model/FeedbackAction;", "option", "Lcom/tinder/overflow/model/ReasonOption;", "(Lcom/tinder/overflow/model/ReasonOption;)V", "getOption", "()Lcom/tinder/overflow/model/ReasonOption;", "value", "", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.overflow.model.a$b */
    public static final class C12248b extends C10028a {
        @NotNull
        /* renamed from: a */
        private final ReasonOption f39634a;

        @NotNull
        /* renamed from: a */
        public String mo10700a() {
            return "submit";
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C12248b) {
                    if (C2668g.a(this.f39634a, ((C12248b) obj).f39634a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            ReasonOption reasonOption = this.f39634a;
            return reasonOption != null ? reasonOption.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Submit(option=");
            stringBuilder.append(this.f39634a);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C12248b(@NotNull ReasonOption reasonOption) {
            C2668g.b(reasonOption, "option");
            super(reasonOption);
            this.f39634a = reasonOption;
        }
    }

    @NotNull
    /* renamed from: a */
    public abstract String mo10700a();

    private C10028a(ReasonOption reasonOption) {
        this.f32911a = reasonOption;
    }

    @Nullable
    /* renamed from: b */
    public final ReasonOption m41080b() {
        return this.f32911a;
    }
}
