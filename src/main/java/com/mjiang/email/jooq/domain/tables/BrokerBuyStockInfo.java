/*
 * This file is generated by jOOQ.
*/
package com.mjiang.email.jooq.domain.tables;


import com.mjiang.email.jooq.domain.Indexes;
import com.mjiang.email.jooq.domain.Keys;
import com.mjiang.email.jooq.domain.Tushare;
import com.mjiang.email.jooq.domain.tables.records.BrokerBuyStockInfoRecord;

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
public class BrokerBuyStockInfo extends TableImpl<BrokerBuyStockInfoRecord> {

    private static final long serialVersionUID = -1546471238;

    /**
     * The reference instance of <code>tushare.broker_buy_stock_info</code>
     */
    public static final BrokerBuyStockInfo BROKER_BUY_STOCK_INFO = new BrokerBuyStockInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BrokerBuyStockInfoRecord> getRecordType() {
        return BrokerBuyStockInfoRecord.class;
    }

    /**
     * The column <code>tushare.broker_buy_stock_info.id</code>.
     */
    public final TableField<BrokerBuyStockInfoRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>tushare.broker_buy_stock_info.broker_buy_summary_id</code>.
     */
    public final TableField<BrokerBuyStockInfoRecord, Long> BROKER_BUY_SUMMARY_ID = createField("broker_buy_summary_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>tushare.broker_buy_stock_info.stock_code</code>.
     */
    public final TableField<BrokerBuyStockInfoRecord, String> STOCK_CODE = createField("stock_code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>tushare.broker_buy_stock_info.stock_name</code>.
     */
    public final TableField<BrokerBuyStockInfoRecord, String> STOCK_NAME = createField("stock_name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * Create a <code>tushare.broker_buy_stock_info</code> table reference
     */
    public BrokerBuyStockInfo() {
        this(DSL.name("broker_buy_stock_info"), null);
    }

    /**
     * Create an aliased <code>tushare.broker_buy_stock_info</code> table reference
     */
    public BrokerBuyStockInfo(String alias) {
        this(DSL.name(alias), BROKER_BUY_STOCK_INFO);
    }

    /**
     * Create an aliased <code>tushare.broker_buy_stock_info</code> table reference
     */
    public BrokerBuyStockInfo(Name alias) {
        this(alias, BROKER_BUY_STOCK_INFO);
    }

    private BrokerBuyStockInfo(Name alias, Table<BrokerBuyStockInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private BrokerBuyStockInfo(Name alias, Table<BrokerBuyStockInfoRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.BROKER_BUY_STOCK_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BrokerBuyStockInfoRecord, Long> getIdentity() {
        return Keys.IDENTITY_BROKER_BUY_STOCK_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BrokerBuyStockInfoRecord> getPrimaryKey() {
        return Keys.KEY_BROKER_BUY_STOCK_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BrokerBuyStockInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<BrokerBuyStockInfoRecord>>asList(Keys.KEY_BROKER_BUY_STOCK_INFO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BrokerBuyStockInfo as(String alias) {
        return new BrokerBuyStockInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BrokerBuyStockInfo as(Name alias) {
        return new BrokerBuyStockInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BrokerBuyStockInfo rename(String name) {
        return new BrokerBuyStockInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BrokerBuyStockInfo rename(Name name) {
        return new BrokerBuyStockInfo(name, null);
    }
}
