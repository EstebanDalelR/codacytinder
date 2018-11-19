package com.tinder.data.places;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19303i;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a\"\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\u0007"}, d2 = {"method", "", "T", "Lretrofit2/Response;", "replace", "Lkotlin/Pair;", "urlPath", "data_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.data.places.a */
public final class C8740a {
    @NotNull
    /* renamed from: a */
    public static final <T> String m37246a(@NotNull Response<T> response) {
        C2668g.b(response, "$receiver");
        response = response.raw();
        if (response != null) {
            response = response.a();
            if (response != null) {
                response = response.b();
                if (response != null) {
                    return response;
                }
            }
        }
        return "";
    }

    @NotNull
    /* renamed from: b */
    public static final <T> String m37248b(@NotNull Response<T> response) {
        C2668g.b(response, "$receiver");
        response = response.raw();
        if (response != null) {
            response = response.a();
            if (response != null) {
                response = response.a();
                if (response != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(response.g());
                    stringBuilder.append(response.i());
                    response = stringBuilder.toString();
                    if (response != null) {
                        return response;
                    }
                }
            }
        }
        return "";
    }

    /* renamed from: b */
    private static final String m37247b(@NotNull String str, Pair<String, String> pair) {
        if (pair == null) {
            return str;
        }
        String str2 = (String) pair.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        stringBuilder.append((String) pair.b());
        stringBuilder.append('}');
        pair = C19303i.a(str, str2, stringBuilder.toString(), false, 4, null);
        return pair != null ? pair : str;
    }
}
