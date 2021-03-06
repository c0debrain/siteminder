/*
 * This file is generated by jOOQ.
*/
package com.mjiang.email.jooq.domain.tables;


import com.mjiang.email.jooq.domain.Indexes;
import com.mjiang.email.jooq.domain.Keys;
import com.mjiang.email.jooq.domain.Tushare;
import com.mjiang.email.jooq.domain.tables.records.DragonTigerStockRecord;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

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
public class DragonTigerStock extends TableImpl<DragonTigerStockRecord> {

    private static final long serialVersionUID = 186828017;

    /**
     * The reference instance of <code>tushare.dragon_tiger_stock</code>
     */
    public static final DragonTigerStock DRAGON_TIGER_STOCK = new DragonTigerStock();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DragonTigerStockRecord> getRecordType() {
        return DragonTigerStockRecord.class;
    }

    /**
     * The column <code>tushare.dragon_tiger_stock.id</code>.
     */
    public final TableField<DragonTigerStockRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.code</code>.
     */
    public final TableField<DragonTigerStockRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.name</code>.
     */
    public final TableField<DragonTigerStockRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.pchange</code>.
     */
    public final TableField<DragonTigerStockRecord, BigDecimal> PCHANGE = createField("pchange", org.jooq.impl.SQLDataType.DECIMAL(30, 4), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.amount</code>.
     */
    public final TableField<DragonTigerStockRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL(30, 2), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.buy</code>.
     */
    public final TableField<DragonTigerStockRecord, BigDecimal> BUY = createField("buy", org.jooq.impl.SQLDataType.DECIMAL(30, 2), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.sell</code>.
     */
    public final TableField<DragonTigerStockRecord, BigDecimal> SELL = createField("sell", org.jooq.impl.SQLDataType.DECIMAL(30, 2), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.reason</code>.
     */
    public final TableField<DragonTigerStockRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.bratio</code>.
     */
    public final TableField<DragonTigerStockRecord, BigDecimal> BRATIO = createField("bratio", org.jooq.impl.SQLDataType.DECIMAL(15, 2), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.sratio</code>.
     */
    public final TableField<DragonTigerStockRecord, BigDecimal> SRATIO = createField("sratio", org.jooq.impl.SQLDataType.DECIMAL(15, 2), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.ts_date</code>.
     */
    public final TableField<DragonTigerStockRecord, Date> TS_DATE = createField("ts_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.broker</code>.
     */
    public final TableField<DragonTigerStockRecord, String> BROKER = createField("broker", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.count</code>.
     */
    public final TableField<DragonTigerStockRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.probability</code>.
     */
    public final TableField<DragonTigerStockRecord, BigDecimal> PROBABILITY = createField("probability", org.jooq.impl.SQLDataType.DECIMAL(15, 2), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.broker_buy</code>.
     */
    public final TableField<DragonTigerStockRecord, BigDecimal> BROKER_BUY = createField("broker_buy", org.jooq.impl.SQLDataType.DECIMAL(30, 2), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.broker_buy_prop</code>.
     */
    public final TableField<DragonTigerStockRecord, BigDecimal> BROKER_BUY_PROP = createField("broker_buy_prop", org.jooq.impl.SQLDataType.DECIMAL(15, 2), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.broker_sell</code>.
     */
    public final TableField<DragonTigerStockRecord, BigDecimal> BROKER_SELL = createField("broker_sell", org.jooq.impl.SQLDataType.DECIMAL(30, 2), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.broker_sell_prop</code>.
     */
    public final TableField<DragonTigerStockRecord, BigDecimal> BROKER_SELL_PROP = createField("broker_sell_prop", org.jooq.impl.SQLDataType.DECIMAL(15, 2), this, "");

    /**
     * The column <code>tushare.dragon_tiger_stock.net</code>.
     */
    public final TableField<DragonTigerStockRecord, BigDecimal> NET = createField("net", org.jooq.impl.SQLDataType.DECIMAL(30, 2), this, "");

    /**
     * Create a <code>tushare.dragon_tiger_stock</code> table reference
     */
    public DragonTigerStock() {
        this(DSL.name("dragon_tiger_stock"), null);
    }

    /**
     * Create an aliased <code>tushare.dragon_tiger_stock</code> table reference
     */
    public DragonTigerStock(String alias) {
        this(DSL.name(alias), DRAGON_TIGER_STOCK);
    }

    /**
     * Create an aliased <code>tushare.dragon_tiger_stock</code> table reference
     */
    public DragonTigerStock(Name alias) {
        this(alias, DRAGON_TIGER_STOCK);
    }

    private DragonTigerStock(Name alias, Table<DragonTigerStockRecord> aliased) {
        this(alias, aliased, null);
    }

    private DragonTigerStock(Name alias, Table<DragonTigerStockRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.DRAGON_TIGER_STOCK_PRIMARY, Indexes.DRAGON_TIGER_STOCK_UNIQUE_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DragonTigerStockRecord, Long> getIdentity() {
        return Keys.IDENTITY_DRAGON_TIGER_STOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DragonTigerStockRecord> getPrimaryKey() {
        return Keys.KEY_DRAGON_TIGER_STOCK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DragonTigerStockRecord>> getKeys() {
        return Arrays.<UniqueKey<DragonTigerStockRecord>>asList(Keys.KEY_DRAGON_TIGER_STOCK_PRIMARY, Keys.KEY_DRAGON_TIGER_STOCK_UNIQUE_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DragonTigerStock as(String alias) {
        return new DragonTigerStock(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DragonTigerStock as(Name alias) {
        return new DragonTigerStock(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DragonTigerStock rename(String name) {
        return new DragonTigerStock(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DragonTigerStock rename(Name name) {
        return new DragonTigerStock(name, null);
    }
}
