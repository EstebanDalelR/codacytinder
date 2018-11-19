package dagger.android;

import android.content.BroadcastReceiver;
import dagger.MapKey;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MapKey
@Target({ElementType.METHOD})
public @interface BroadcastReceiverKey {
    Class<? extends BroadcastReceiver> value();
}
