package com.tinder.domain.auth.usecase;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/domain/auth/usecase/MaskEmail;", "Lkotlin/Function1;", "", "regexEmailValidator", "Lcom/tinder/domain/auth/usecase/RegexEmailValidator;", "(Lcom/tinder/domain/auth/usecase/RegexEmailValidator;)V", "invoke", "email", "maskStringWithAsterisks", "string", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class MaskEmail implements Function1<String, String> {
    private final RegexEmailValidator regexEmailValidator;

    @Inject
    public MaskEmail(@NotNull RegexEmailValidator regexEmailValidator) {
        C2668g.b(regexEmailValidator, "regexEmailValidator");
        this.regexEmailValidator = regexEmailValidator;
    }

    @Nullable
    public String invoke(@Nullable String str) {
        Object obj;
        CharSequence charSequence = str;
        if (charSequence != null) {
            if (!C19303i.a(charSequence)) {
                obj = null;
                if (obj != null) {
                    return str;
                }
                if (!this.regexEmailValidator.isValid(str)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid email in use to record User event: ");
                    stringBuilder.append(str);
                    throw new IllegalStateException(stringBuilder.toString().toString());
                } else if (str != null) {
                    throw new IllegalStateException("Required value was null.".toString());
                } else {
                    str = C19303i.b(charSequence, new String[]{"@"}, false, 0, 6, null);
                    String a = C19303i.a((String) str.get(1), ".", null, 2, null);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(maskStringWithAsterisks((String) str.get(0)));
                    stringBuilder2.append("@");
                    stringBuilder2.append(maskStringWithAsterisks(a));
                    stringBuilder2.append(".");
                    stringBuilder2.append(C19303i.b((String) str.get(1), ".", null, 2, null));
                    return stringBuilder2.toString();
                }
            }
        }
        obj = 1;
        if (obj != null) {
            return str;
        }
        if (!this.regexEmailValidator.isValid(str)) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Invalid email in use to record User event: ");
            stringBuilder3.append(str);
            throw new IllegalStateException(stringBuilder3.toString().toString());
        } else if (str != null) {
            str = C19303i.b(charSequence, new String[]{"@"}, false, 0, 6, null);
            String a2 = C19303i.a((String) str.get(1), ".", null, 2, null);
            StringBuilder stringBuilder22 = new StringBuilder();
            stringBuilder22.append(maskStringWithAsterisks((String) str.get(0)));
            stringBuilder22.append("@");
            stringBuilder22.append(maskStringWithAsterisks(a2));
            stringBuilder22.append(".");
            stringBuilder22.append(C19303i.b((String) str.get(1), ".", null, 2, null));
            return stringBuilder22.toString();
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    private final String maskStringWithAsterisks(String str) {
        StringBuilder stringBuilder;
        switch (str.length()) {
            case 1:
                return "*";
            case 2:
                stringBuilder = new StringBuilder();
                stringBuilder.append("*");
                stringBuilder.append(str.charAt(1));
                return stringBuilder.toString();
            default:
                stringBuilder = new StringBuilder();
                char charAt = str.charAt(0);
                String a = C19303i.a("*", str.length() - 2);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(String.valueOf(charAt));
                stringBuilder2.append(a);
                stringBuilder.append(stringBuilder2.toString());
                stringBuilder.append(str.charAt(C19303i.d(str)));
                return stringBuilder.toString();
        }
    }
}
