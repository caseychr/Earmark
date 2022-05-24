package com.casey.earmark.persistence;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.casey.earmark.model.SavingsItem;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SavingsDao_Impl implements SavingsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SavingsItem> __insertionAdapterOfSavingsItem;

  public SavingsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSavingsItem = new EntityInsertionAdapter<SavingsItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `savings` (`id`,`savingsTitle`,`currentBalance`,`monthlyPayment`,`goal`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SavingsItem value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getSavingsTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSavingsTitle());
        }
        stmt.bindDouble(3, value.getCurrentBalance());
        stmt.bindDouble(4, value.getMonthlyPayment());
        stmt.bindDouble(5, value.getGoal());
      }
    };
  }

  @Override
  public void insertSavings(final SavingsItem savingsItem) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSavingsItem.insert(savingsItem);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object fetchAllSavings(final Continuation<? super List<SavingsItem>> continuation) {
    final String _sql = "SELECT * FROM savings";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<SavingsItem>>() {
      @Override
      public List<SavingsItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSavingsTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "savingsTitle");
          final int _cursorIndexOfCurrentBalance = CursorUtil.getColumnIndexOrThrow(_cursor, "currentBalance");
          final int _cursorIndexOfMonthlyPayment = CursorUtil.getColumnIndexOrThrow(_cursor, "monthlyPayment");
          final int _cursorIndexOfGoal = CursorUtil.getColumnIndexOrThrow(_cursor, "goal");
          final List<SavingsItem> _result = new ArrayList<SavingsItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SavingsItem _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpSavingsTitle;
            if (_cursor.isNull(_cursorIndexOfSavingsTitle)) {
              _tmpSavingsTitle = null;
            } else {
              _tmpSavingsTitle = _cursor.getString(_cursorIndexOfSavingsTitle);
            }
            final double _tmpCurrentBalance;
            _tmpCurrentBalance = _cursor.getDouble(_cursorIndexOfCurrentBalance);
            final double _tmpMonthlyPayment;
            _tmpMonthlyPayment = _cursor.getDouble(_cursorIndexOfMonthlyPayment);
            final double _tmpGoal;
            _tmpGoal = _cursor.getDouble(_cursorIndexOfGoal);
            _item = new SavingsItem(_tmpId,_tmpSavingsTitle,_tmpCurrentBalance,_tmpMonthlyPayment,_tmpGoal);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
