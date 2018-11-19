package com.leanplum.p069a;

/* renamed from: com.leanplum.a.ai */
final class ai implements ay {
    /* renamed from: a */
    private /* synthetic */ ag$7$1 f25517a;

    ai(ag$7$1 ag_7_1) {
        this.f25517a = ag_7_1;
    }

    /* renamed from: a */
    public final void m30539a(Exception exception) {
        this.f25517a.f21139a.f12102c.a(false);
        Object[] objArr = new Object[1];
        StringBuilder stringBuilder = new StringBuilder("setUserAttributes failed when specifying location with error: ");
        stringBuilder.append(exception.getMessage());
        objArr[0] = stringBuilder.toString();
        ao.a(objArr);
    }
}
