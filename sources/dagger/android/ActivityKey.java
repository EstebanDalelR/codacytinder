package dagger.android;

import android.app.Activity;
import dagger.MapKey;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MapKey
@Target({ElementType.METHOD})
public @interface ActivityKey {
    Class<? extends Activity> value();
}
