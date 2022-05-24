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
import com.casey.earmark.model.DebtItem;
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
public final class DebtDao_Impl implements DebtDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DebtItem> __insertionAdapterOfDebtItem;

  public DebtDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDebtItem = new EntityInsertionAdapter<DebtItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `debts` (`id`,`debtTitle`,`balance`,`interestRate`,`monthlyPayment`,`type`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DebtItem value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getDebtTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDebtTitle());
        }
        stmt.bindDouble(3, value.getBalance());
        stmt.bindDouble(4, value.getInterestRate());
        stmt.bindDouble(5, value.getMonthlyPayment());
        if (value.getType() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getType());
        }
      }
    };
  }

  @Override
  public void insertDebts(final DebtItem debtItem) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDebtItem.insert(debtItem);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object fetchAllDebts(final Continuation<? super List<DebtItem>> continuation) {
    final String _sql = "SELECT * FROM debts";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<DebtItem>>() {
      @Override
      public List<DebtItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDebtTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "debtTitle");
          final int _cursorIndexOfBalance = CursorUtil.getColumnIndexOrThrow(_cursor, "balance");
          final int _cursorIndexOfInterestRate = CursorUtil.getColumnIndexOrThrow(_cursor, "interestRate");
          final int _cursorIndexOfMonthlyPayment = CursorUtil.getColumnIndexOrThrow(_cursor, "monthlyPayment");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final List<DebtItem> _result = new ArrayList<DebtItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DebtItem _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpDebtTitle;
            if (_cursor.isNull(_cursorIndexOfDebtTitle)) {
              _tmpDebtTitle = null;
            } else {
              _tmpDebtTitle = _cursor.getString(_cursorIndexOfDebtTitle);
            }
            final double _tmpBalance;
            _tmpBalance = _cursor.getDouble(_cursorIndexOfBalance);
            final double _tmpInterestRate;
            _tmpInterestRate = _cursor.getDouble(_cursorIndexOfInterestRate);
            final double _tmpMonthlyPayment;
            _tmpMonthlyPayment = _cursor.getDouble(_cursorIndexOfMonthlyPayment);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            _item = new DebtItem(_tmpId,_tmpDebtTitle,_tmpBalance,_tmpInterestRate,_tmpMonthlyPayment,_tmpType);
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
