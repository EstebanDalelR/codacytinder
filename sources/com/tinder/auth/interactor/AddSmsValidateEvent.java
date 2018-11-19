package com.tinder.auth.interactor;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.vf;
import com.tinder.etl.event.vf.C9302a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\t\n\u000b\fB\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tinder/auth/interactor/AddSmsValidateEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/auth/interactor/AddSmsValidateEvent$EventBody;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "body", "EventBody", "EventCode", "FlagReason", "VerifyMethod", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class AddSmsValidateEvent implements VoidUseCase<C8275a> {
    /* renamed from: a */
    private final C2630h f33743a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/tinder/auth/interactor/AddSmsValidateEvent$EventCode;", "", "code", "", "codeName", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getCodeName", "()Ljava/lang/String;", "CANCEL", "REQUEST_PHONE", "SUBMIT_PHONE", "ERROR_RETRIEVING_CODE", "REQUEST_VERIFY_CODE", "SUBMIT_VERIFY_CODE", "SUBMIT_VERIFY_TOKEN", "SERVER_VERIFY_ERROR", "SERVER_VERIFY_COMPLETE", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum EventCode {
        ;
        
        private final int code;
        @NotNull
        private final String codeName;

        protected EventCode(int i, String str) {
            C2668g.b(str, "codeName");
            this.code = i;
            this.codeName = str;
        }

        public final int getCode() {
            return this.code;
        }

        @NotNull
        public final String getCodeName() {
            return this.codeName;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/tinder/auth/interactor/AddSmsValidateEvent$FlagReason;", "", "analyticsValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "ACCOUNT_LINKING", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum FlagReason {
        ;
        
        @NotNull
        private final String analyticsValue;

        protected FlagReason(String str) {
            C2668g.b(str, "analyticsValue");
            this.analyticsValue = str;
        }

        @NotNull
        public final String getAnalyticsValue() {
            return this.analyticsValue;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/tinder/auth/interactor/AddSmsValidateEvent$VerifyMethod;", "", "methodName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMethodName", "()Ljava/lang/String;", "ACCOUNT_KIT", "TELESIGN", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum VerifyMethod {
        ;
        
        @NotNull
        private final String methodName;

        protected VerifyMethod(String str) {
            C2668g.b(str, "methodName");
            this.methodName = str;
        }

        @NotNull
        public final String getMethodName() {
            return this.methodName;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/tinder/auth/interactor/AddSmsValidateEvent$EventBody;", "", "code", "Lcom/tinder/auth/interactor/AddSmsValidateEvent$EventCode;", "method", "Lcom/tinder/auth/interactor/AddSmsValidateEvent$VerifyMethod;", "flagReason", "Lcom/tinder/auth/interactor/AddSmsValidateEvent$FlagReason;", "(Lcom/tinder/auth/interactor/AddSmsValidateEvent$EventCode;Lcom/tinder/auth/interactor/AddSmsValidateEvent$VerifyMethod;Lcom/tinder/auth/interactor/AddSmsValidateEvent$FlagReason;)V", "getCode", "()Lcom/tinder/auth/interactor/AddSmsValidateEvent$EventCode;", "getFlagReason", "()Lcom/tinder/auth/interactor/AddSmsValidateEvent$FlagReason;", "getMethod", "()Lcom/tinder/auth/interactor/AddSmsValidateEvent$VerifyMethod;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.auth.interactor.AddSmsValidateEvent$a */
    public static final class C8275a {
        @NotNull
        /* renamed from: a */
        private final EventCode f29519a;
        @NotNull
        /* renamed from: b */
        private final VerifyMethod f29520b;
        @Nullable
        /* renamed from: c */
        private final FlagReason f29521c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8275a) {
                    C8275a c8275a = (C8275a) obj;
                    if (C2668g.a(this.f29519a, c8275a.f29519a) && C2668g.a(this.f29520b, c8275a.f29520b) && C2668g.a(this.f29521c, c8275a.f29521c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            EventCode eventCode = this.f29519a;
            int i = 0;
            int hashCode = (eventCode != null ? eventCode.hashCode() : 0) * 31;
            VerifyMethod verifyMethod = this.f29520b;
            hashCode = (hashCode + (verifyMethod != null ? verifyMethod.hashCode() : 0)) * 31;
            FlagReason flagReason = this.f29521c;
            if (flagReason != null) {
                i = flagReason.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("EventBody(code=");
            stringBuilder.append(this.f29519a);
            stringBuilder.append(", method=");
            stringBuilder.append(this.f29520b);
            stringBuilder.append(", flagReason=");
            stringBuilder.append(this.f29521c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8275a(@NotNull EventCode eventCode, @NotNull VerifyMethod verifyMethod, @Nullable FlagReason flagReason) {
            C2668g.b(eventCode, "code");
            C2668g.b(verifyMethod, "method");
            this.f29519a = eventCode;
            this.f29520b = verifyMethod;
            this.f29521c = flagReason;
        }

        @NotNull
        /* renamed from: a */
        public final EventCode m35326a() {
            return this.f29519a;
        }

        @NotNull
        /* renamed from: b */
        public final VerifyMethod m35327b() {
            return this.f29520b;
        }

        @Nullable
        /* renamed from: c */
        public final FlagReason m35328c() {
            return this.f29521c;
        }
    }

    public /* synthetic */ void execute(Object obj) {
        m42113a((C8275a) obj);
    }

    @Inject
    public AddSmsValidateEvent(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f33743a = c2630h;
    }

    /* renamed from: a */
    public void m42113a(@NotNull C8275a c8275a) {
        C2668g.b(c8275a, "body");
        C9302a a = vf.m46624a();
        a.m38895a((Number) Integer.valueOf(c8275a.m35326a().getCode()));
        a.m38896a(c8275a.m35326a().getCodeName());
        a.m38899c(c8275a.m35327b().getMethodName());
        c8275a = c8275a.m35328c();
        if (c8275a != null) {
            a.m38898b(c8275a.getAnalyticsValue());
        }
        this.f33743a.a(a.m38897a());
    }
}
