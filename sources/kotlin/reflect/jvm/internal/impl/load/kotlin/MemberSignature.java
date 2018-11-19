package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.tinder.api.ManagerWebServices;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature;
import org.jetbrains.annotations.NotNull;

public final class MemberSignature {
    public static final Companion Companion = new Companion();
    @NotNull
    private final String signature;

    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethod(@NotNull NameResolver nameResolver, @NotNull JvmMethodSignature jvmMethodSignature) {
            C2668g.b(nameResolver, "nameResolver");
            C2668g.b(jvmMethodSignature, ManagerWebServices.PARAM_SIGNATURE);
            return fromMethodNameAndDesc(nameResolver.getString(jvmMethodSignature.getName()), nameResolver.getString(jvmMethodSignature.getDesc()));
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethodNameAndDesc(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "name");
            C2668g.b(str2, "desc");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str2);
            return new MemberSignature(stringBuilder.toString());
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethodNameAndDesc(@NotNull String str) {
            C2668g.b(str, "namePlusDesc");
            return new MemberSignature(str);
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromFieldNameAndDesc(@NotNull String str, @NotNull String str2) {
            C2668g.b(str, "name");
            C2668g.b(str2, "desc");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("#");
            stringBuilder.append(str2);
            return new MemberSignature(stringBuilder.toString());
        }

        @JvmStatic
        @NotNull
        public final MemberSignature fromMethodSignatureAndParameterIndex(@NotNull MemberSignature memberSignature, int i) {
            C2668g.b(memberSignature, ManagerWebServices.PARAM_SIGNATURE);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(memberSignature.getSignature$descriptors_jvm());
            stringBuilder.append("@");
            stringBuilder.append(i);
            return new MemberSignature(stringBuilder.toString());
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MemberSignature) {
                if (C2668g.a(this.signature, ((MemberSignature) obj).signature)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.signature;
        return str != null ? str.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MemberSignature(signature=");
        stringBuilder.append(this.signature);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private MemberSignature(String str) {
        this.signature = str;
    }

    @NotNull
    public final String getSignature$descriptors_jvm() {
        return this.signature;
    }
}
