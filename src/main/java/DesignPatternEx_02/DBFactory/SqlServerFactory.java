package DesignPatternEx_02.DBFactory;

import DesignPatternEx_02.DBFactory.Database.Database;
import DesignPatternEx_02.DBFactory.Database.SqlServer;

public class SqlServerFactory extends DBFactory {
    @Override
    public Database createDatabase() {
        return new SqlServer();
    }
}
