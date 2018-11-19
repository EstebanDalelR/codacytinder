package retrofit;

import java.io.IOException;
import java.lang.reflect.Type;
import retrofit.client.C19370e;
import retrofit.converter.ConversionException;
import retrofit.converter.Converter;

public class RetrofitError extends RuntimeException {
    /* renamed from: a */
    private final String f60472a;
    /* renamed from: b */
    private final C19370e f60473b;
    /* renamed from: c */
    private final Converter f60474c;
    /* renamed from: d */
    private final Type f60475d;
    /* renamed from: e */
    private final Kind f60476e;

    public enum Kind {
        NETWORK,
        CONVERSION,
        HTTP,
        UNEXPECTED
    }

    /* renamed from: a */
    public static RetrofitError m69533a(String str, IOException iOException) {
        return new RetrofitError(iOException.getMessage(), str, null, null, null, Kind.NETWORK, iOException);
    }

    /* renamed from: a */
    public static RetrofitError m69536a(String str, C19370e c19370e, Converter converter, Type type, ConversionException conversionException) {
        return new RetrofitError(conversionException.getMessage(), str, c19370e, converter, type, Kind.CONVERSION, conversionException);
    }

    /* renamed from: a */
    public static RetrofitError m69535a(String str, C19370e c19370e, Converter converter, Type type) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c19370e.m69551b());
        stringBuilder.append(" ");
        stringBuilder.append(c19370e.m69552c());
        return new RetrofitError(stringBuilder.toString(), str, c19370e, converter, type, Kind.HTTP, null);
    }

    /* renamed from: a */
    public static RetrofitError m69534a(String str, Throwable th) {
        return new RetrofitError(th.getMessage(), str, null, null, null, Kind.UNEXPECTED, th);
    }

    RetrofitError(String str, String str2, C19370e c19370e, Converter converter, Type type, Kind kind, Throwable th) {
        super(str, th);
        this.f60472a = str2;
        this.f60473b = c19370e;
        this.f60474c = converter;
        this.f60475d = type;
        this.f60476e = kind;
    }

    /* renamed from: a */
    public String m69537a() {
        return this.f60472a;
    }

    /* renamed from: b */
    public C19370e m69538b() {
        return this.f60473b;
    }

    /* renamed from: c */
    public Kind m69539c() {
        return this.f60476e;
    }
}
