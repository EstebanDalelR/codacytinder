package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import okhttp3.C15968t;
import retrofit2.Converter;

final class GsonResponseBodyConverter<T> implements Converter<C15968t, T> {
    private final TypeAdapter<T> adapter;
    private final Gson gson;

    GsonResponseBodyConverter(Gson gson, TypeAdapter<T> typeAdapter) {
        this.gson = gson;
        this.adapter = typeAdapter;
    }

    public T convert(C15968t c15968t) throws IOException {
        try {
            T read = this.adapter.read(this.gson.newJsonReader(c15968t.charStream()));
            return read;
        } finally {
            c15968t.close();
        }
    }
}
