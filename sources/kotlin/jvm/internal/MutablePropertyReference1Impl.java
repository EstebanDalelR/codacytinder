package kotlin.jvm.internal;

import kotlin.reflect.KDeclarationContainer;

public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    /* renamed from: a */
    private final KDeclarationContainer f59967a;
    /* renamed from: b */
    private final String f59968b;
    /* renamed from: c */
    private final String f59969c;

    public MutablePropertyReference1Impl(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        this.f59967a = kDeclarationContainer;
        this.f59968b = str;
        this.f59969c = str2;
    }

    public KDeclarationContainer getOwner() {
        return this.f59967a;
    }

    public String getName() {
        return this.f59968b;
    }

    public String getSignature() {
        return this.f59969c;
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }
}
