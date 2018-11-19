package dagger.android;

import android.app.Service;
import dagger.MapKey;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MapKey
@Target({ElementType.METHOD})
public @interface ServiceKey {
    Class<? extends Service> value();
}
