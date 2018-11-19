package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.entity.SmsRepository;
import io.reactivex.C3959e;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0002J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/smsauth/domain/usecase/ReadOneTimePasswordFromSms;", "Lkotlin/Function0;", "Lio/reactivex/Observable;", "", "smsRepository", "Lcom/tinder/smsauth/entity/SmsRepository;", "(Lcom/tinder/smsauth/entity/SmsRepository;)V", "extractCodeFromSms", "sms", "invoke", "domain"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.domain.usecase.k */
public final class C18102k implements Function0<C3959e<String>> {
    /* renamed from: a */
    private final SmsRepository f56197a;

    @Inject
    public C18102k(@NotNull SmsRepository smsRepository) {
        C2668g.b(smsRepository, "smsRepository");
        this.f56197a = smsRepository;
    }

    public /* synthetic */ Object invoke() {
        return m65708a();
    }

    @NotNull
    /* renamed from: a */
    public C3959e<String> m65708a() {
        C3959e<String> map = this.f56197a.readSms().map(new C16724l(new ReadOneTimePasswordFromSms$invoke$1(this)));
        C2668g.a(map, "smsRepository.readSms()\n…this::extractCodeFromSms)");
        return map;
    }

    /* renamed from: a */
    private final String m65707a(String str) {
        String str2 = null;
        MatchResult a = Regex.m59918a(new Regex("(\\d+)"), str, 0, 2, null);
        if (a != null) {
            List groupValues = a.getGroupValues();
            if (groupValues != null) {
                str2 = (String) C19299w.m68831g(groupValues);
            }
        }
        if (str2 != null) {
            return str2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to extract code from sms: ");
        stringBuilder.append(str);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }
}
