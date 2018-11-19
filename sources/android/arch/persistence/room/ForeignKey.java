package android.arch.persistence.room;

public @interface ForeignKey {

    public @interface Action {
    }

    String[] childColumns();

    boolean deferred() default false;

    Class entity();

    @Action
    int onDelete() default 1;

    @Action
    int onUpdate() default 1;

    String[] parentColumns();
}
