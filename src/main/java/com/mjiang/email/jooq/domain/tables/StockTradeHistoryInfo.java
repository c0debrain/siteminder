/*
 * This file is generated by jOOQ.
*/
package com.mjiang.email.jooq.domain.tables;


import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import com.mjiang.email.jooq.domain.Indexes;
import com.mjiang.email.jooq.domain.Keys;
import com.mjiang.email.jooq.domain.Tushare;
import com.mjiang.email.jooq.domain.tables.records.StockTradeHistoryInfoRecord;
import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StockTradeHistoryInfo extends TableImpl<StockTradeHistoryInfoRecord> {

    private static final long serialVersionUID = -2117622171;

    /**
     * The reference instance of <code>tushare.stock_trade_history_info</code>
     */
    public static final StockTradeHistoryInfo STOCK_TRADE_HISTORY_INFO = new StockTradeHistoryInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StockTradeHistoryInfoRecord> getRecordType() {
        return StockTradeHistoryInfoRecord.class;
    }

    /**
     * The column <code>tushare.stock_trade_history_info.id</code>.
     */
    public final TableField<StockTradeHistoryInfoRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>tushare.stock_trade_history_info.stock_code</code>.
     */
    public final TableField<StockTradeHistoryInfoRecord, String> STOCK_CODE = createField("stock_code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>tushare.stock_trade_history_info.ts_date</code>.
     */
    public final TableField<StockTradeHistoryInfoRecord, Date> TS_DATE = createField("ts_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>tushare.stock_trade_history_info.open_price</code>.
     */
    public final TableField<StockTradeHistoryInfoRecord, BigDecimal> OPEN_PRICE = createField("open_price", org.jooq.impl.SQLDataType.DECIMAL(15, 2), this, "");

    /**
     * The column <code>tushare.stock_trade_history_info.close_price</code>.
     */
    public final TableField<StockTradeHistoryInfoRecord, BigDecimal> CLOSE_PRICE = createField("close_price", org.jooq.impl.SQLDataType.DECIMAL(15, 2), this, "");

    /**
     * The column <code>tushare.stock_trade_history_info.high_price</code>.
     */
    public final TableField<StockTradeHistoryInfoRecord, BigDecimal> HIGH_PRICE = createField("high_price", org.jooq.impl.SQLDataType.DECIMAL(15, 2), this, "");

    /**
     * The column <code>tushare.stock_trade_history_info.low_price</code>.
     */
    public final TableField<StockTradeHistoryInfoRecord, BigDecimal> LOW_PRICE = createField("low_price", org.jooq.impl.SQLDataType.DECIMAL(15, 2), this, "");

    /**
     * The column <code>tushare.stock_trade_history_info.volume</code>.
     */
    public final TableField<StockTradeHistoryInfoRecord, BigDecimal> VOLUME = createField("volume", org.jooq.impl.SQLDataType.DECIMAL(30, 2), this, "");

    /**
     * Create a <code>tushare.stock_trade_history_info</code> table reference
     */
    public StockTradeHistoryInfo() {
        this(DSL.name("stock_trade_history_info"), null);
    }

    /**
     * Create an aliased <code>tushare.stock_trade_history_info</code> table reference
     */
    public StockTradeHistoryInfo(String alias) {
        this(DSL.name(alias), STOCK_TRADE_HISTORY_INFO);
    }

    /**
     * Create an aliased <code>tushare.stock_trade_history_info</code> table reference
     */
    public StockTradeHistoryInfo(Name alias) {
        this(alias, STOCK_TRADE_HISTORY_INFO);
    }

    private StockTradeHistoryInfo(Name alias, Table<StockTradeHistoryInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private StockTradeHistoryInfo(Name alias, Table<StockTradeHistoryInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Tushare.TUSHARE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.STOCK_TRADE_HISTORY_INFO_PRIMARY, Indexes.STOCK_TRADE_HISTORY_INFO_STOCK_TRADE_HISTORY_UNI_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<StockTradeHistoryInfoRecord, Long> getIdentity() {
        return Keys.IDENTITY_STOCK_TRADE_HISTORY_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StockTradeHistoryInfoRecord> getPrimaryKey() {
        return Keys.KEY_STOCK_TRADE_HISTORY_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StockTradeHistoryInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<StockTradeHistoryInfoRecord>>asList(Keys.KEY_STOCK_TRADE_HISTORY_INFO_PRIMARY, Keys.KEY_STOCK_TRADE_HISTORY_INFO_STOCK_TRADE_HISTORY_UNI_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StockTradeHistoryInfo as(String alias) {
        return new StockTradeHistoryInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StockTradeHistoryInfo as(Name alias) {
        return new StockTradeHistoryInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StockTradeHistoryInfo rename(String name) {
        return new StockTradeHistoryInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StockTradeHistoryInfo rename(Name name) {
        return new StockTradeHistoryInfo(name, null);
    }
}
