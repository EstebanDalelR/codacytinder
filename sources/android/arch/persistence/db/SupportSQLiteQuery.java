package android.arch.persistence.db;

public interface SupportSQLiteQuery {
    void bindTo(SupportSQLiteProgram supportSQLiteProgram);

    String getSql();
}
