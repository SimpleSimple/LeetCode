package DesignPatternEx_02.DBFactory;

import DesignPatternEx_02.DBFactory.Database.Database;

public abstract class DBFactory {
    public abstract Database createDatabase();
}
