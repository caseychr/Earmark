package com.casey.earmark.persistence;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class EarmarkDatabase_Impl extends EarmarkDatabase {
  private volatile DebtDao _debtDao;

  private volatile SavingsDao _savingsDao;

  private volatile BudgetDao _budgetDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `debts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `debtTitle` TEXT NOT NULL, `balance` REAL NOT NULL, `interestRate` REAL NOT NULL, `monthlyPayment` REAL NOT NULL, `type` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `savings` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `savingsTitle` TEXT NOT NULL, `currentBalance` REAL NOT NULL, `monthlyPayment` REAL NOT NULL, `goal` REAL NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5546557e10920f171e3c108bb128638c')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `debts`");
        _db.execSQL("DROP TABLE IF EXISTS `savings`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDebts = new HashMap<String, TableInfo.Column>(6);
        _columnsDebts.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDebts.put("debtTitle", new TableInfo.Column("debtTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDebts.put("balance", new TableInfo.Column("balance", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDebts.put("interestRate", new TableInfo.Column("interestRate", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDebts.put("monthlyPayment", new TableInfo.Column("monthlyPayment", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDebts.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDebts = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDebts = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDebts = new TableInfo("debts", _columnsDebts, _foreignKeysDebts, _indicesDebts);
        final TableInfo _existingDebts = TableInfo.read(_db, "debts");
        if (! _infoDebts.equals(_existingDebts)) {
          return new RoomOpenHelper.ValidationResult(false, "debts(com.casey.earmark.model.DebtItem).\n"
                  + " Expected:\n" + _infoDebts + "\n"
                  + " Found:\n" + _existingDebts);
        }
        final HashMap<String, TableInfo.Column> _columnsSavings = new HashMap<String, TableInfo.Column>(5);
        _columnsSavings.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSavings.put("savingsTitle", new TableInfo.Column("savingsTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSavings.put("currentBalance", new TableInfo.Column("currentBalance", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSavings.put("monthlyPayment", new TableInfo.Column("monthlyPayment", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSavings.put("goal", new TableInfo.Column("goal", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSavings = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSavings = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSavings = new TableInfo("savings", _columnsSavings, _foreignKeysSavings, _indicesSavings);
        final TableInfo _existingSavings = TableInfo.read(_db, "savings");
        if (! _infoSavings.equals(_existingSavings)) {
          return new RoomOpenHelper.ValidationResult(false, "savings(com.casey.earmark.model.SavingsItem).\n"
                  + " Expected:\n" + _infoSavings + "\n"
                  + " Found:\n" + _existingSavings);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "5546557e10920f171e3c108bb128638c", "8f70b3b945121bf2eea16971f5c3d17b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "debts","savings");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `debts`");
      _db.execSQL("DELETE FROM `savings`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(DebtDao.class, DebtDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(SavingsDao.class, SavingsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(BudgetDao.class, BudgetDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public DebtDao debtDao() {
    if (_debtDao != null) {
      return _debtDao;
    } else {
      synchronized(this) {
        if(_debtDao == null) {
          _debtDao = new DebtDao_Impl(this);
        }
        return _debtDao;
      }
    }
  }

  @Override
  public SavingsDao savingsDao() {
    if (_savingsDao != null) {
      return _savingsDao;
    } else {
      synchronized(this) {
        if(_savingsDao == null) {
          _savingsDao = new SavingsDao_Impl(this);
        }
        return _savingsDao;
      }
    }
  }

  @Override
  public BudgetDao budgetDao() {
    if (_budgetDao != null) {
      return _budgetDao;
    } else {
      synchronized(this) {
        if(_budgetDao == null) {
          _budgetDao = new BudgetDao_Impl(this);
        }
        return _budgetDao;
      }
    }
  }
}
