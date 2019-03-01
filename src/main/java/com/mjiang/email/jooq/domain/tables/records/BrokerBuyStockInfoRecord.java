/*
 * This file is generated by jOOQ.
*/
package com.mjiang.email.jooq.domain.tables.records;


import javax.annotation.Generated;

import com.mjiang.email.jooq.domain.tables.BrokerBuyStockInfo;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BrokerBuyStockInfoRecord extends UpdatableRecordImpl<BrokerBuyStockInfoRecord> implements Record4<Long, Long, String, String> {

    private static final long serialVersionUID = 736777289;

    /**
     * Setter for <code>tushare.broker_buy_stock_info.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>tushare.broker_buy_stock_info.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>tushare.broker_buy_stock_info.broker_buy_summary_id</code>.
     */
    public void setBrokerBuySummaryId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>tushare.broker_buy_stock_info.broker_buy_summary_id</code>.
     */
    public Long getBrokerBuySummaryId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>tushare.broker_buy_stock_info.stock_code</code>.
     */
    public void setStockCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>tushare.broker_buy_stock_info.stock_code</code>.
     */
    public String getStockCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>tushare.broker_buy_stock_info.stock_name</code>.
     */
    public void setStockName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>tushare.broker_buy_stock_info.stock_name</code>.
     */
    public String getStockName() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return BrokerBuyStockInfo.BROKER_BUY_STOCK_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return BrokerBuyStockInfo.BROKER_BUY_STOCK_INFO.BROKER_BUY_SUMMARY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BrokerBuyStockInfo.BROKER_BUY_STOCK_INFO.STOCK_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BrokerBuyStockInfo.BROKER_BUY_STOCK_INFO.STOCK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getBrokerBuySummaryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getStockCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getStockName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getBrokerBuySummaryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getStockCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getStockName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BrokerBuyStockInfoRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BrokerBuyStockInfoRecord value2(Long value) {
        setBrokerBuySummaryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BrokerBuyStockInfoRecord value3(String value) {
        setStockCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BrokerBuyStockInfoRecord value4(String value) {
        setStockName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BrokerBuyStockInfoRecord values(Long value1, Long value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BrokerBuyStockInfoRecord
     */
    public BrokerBuyStockInfoRecord() {
        super(BrokerBuyStockInfo.BROKER_BUY_STOCK_INFO);
    }

    /**
     * Create a detached, initialised BrokerBuyStockInfoRecord
     */
    public BrokerBuyStockInfoRecord(Long id, Long brokerBuySummaryId, String stockCode, String stockName) {
        super(BrokerBuyStockInfo.BROKER_BUY_STOCK_INFO);

        set(0, id);
        set(1, brokerBuySummaryId);
        set(2, stockCode);
        set(3, stockName);
    }
}
