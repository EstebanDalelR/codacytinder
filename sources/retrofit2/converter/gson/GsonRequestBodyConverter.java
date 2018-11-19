package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.C15958m;
import okhttp3.C15964r;
import okio.C18549c;
import retrofit2.Converter;

final class GsonRequestBodyConverter<T> implements Converter<T, C15964r> {
    private static final C15958m MEDIA_TYPE = C15958m.a("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final TypeAdapter<T> adapter;
    private final Gson gson;

    GsonRequestBodyConverter(Gson gson, TypeAdapter<T> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    public C15964r convert(T t) throws IOException {
        C18549c c18549c = new C18549c();
        JsonWriter newJsonWriter = this.gson.newJsonWriter(new OutputStreamWriter(c18549c.outputStream(), UTF_8));
        this.adapter.write(newJsonWriter, t);
        newJsonWriter.close();
        return C15964r.create(MEDIA_TYPE, c18549c.readByteString());
    }
}
