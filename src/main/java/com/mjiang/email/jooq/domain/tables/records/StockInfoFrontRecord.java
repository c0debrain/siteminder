/*
 * This file is generated by jOOQ.
*/
package com.mjiang.email.jooq.domain.tables.records;


import javax.annotation.Generated;
import java.math.BigDecimal;
import java.sql.Date;

import com.mjiang.email.jooq.domain.tables.StockInfoFront;
import org.jooq.Record1;
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
public class StockInfoFrontRecord extends UpdatableRecordImpl<StockInfoFrontRecord> {

    private static final long serialVersionUID = -587915176;

    /**
     * Setter for <code>tushare.stock_info_front.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>tushare.stock_info_front.stock_code</code>.
     */
    public void setStockCode(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.stock_code</code>.
     */
    public String getStockCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>tushare.stock_info_front.ts_date</code>.
     */
    public void setTsDate(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.ts_date</code>.
     */
    public Date getTsDate() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>tushare.stock_info_front.open</code>.
     */
    public void setOpen(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.open</code>.
     */
    public BigDecimal getOpen() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>tushare.stock_info_front.high</code>.
     */
    public void setHigh(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.high</code>.
     */
    public BigDecimal getHigh() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>tushare.stock_info_front.low</code>.
     */
    public void setLow(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.low</code>.
     */
    public BigDecimal getLow() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>tushare.stock_info_front.close</code>.
     */
    public void setClose(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.close</code>.
     */
    public BigDecimal getClose() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>tushare.stock_info_front.volume</code>.
     */
    public void setVolume(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.volume</code>.
     */
    public BigDecimal getVolume() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>tushare.stock_info_front.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>tushare.stock_info_front.ccl</code>.
     */
    public void setCcl(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.ccl</code>.
     */
    public String getCcl() {
        return (String) get(9);
    }

    /**
     * Setter for <code>tushare.stock_info_front.preClose</code>.
     */
    public void setPreclose(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.preClose</code>.
     */
    public BigDecimal getPreclose() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>tushare.stock_info_front.netChangeRatio</code>.
     */
    public void setNetchangeratio(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.netChangeRatio</code>.
     */
    public BigDecimal getNetchangeratio() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>tushare.stock_info_front.ma5_volume</code>.
     */
    public void setMa5Volume(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.ma5_volume</code>.
     */
    public BigDecimal getMa5Volume() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>tushare.stock_info_front.ma5_avgPrice</code>.
     */
    public void setMa5Avgprice(BigDecimal value) {
        set(13, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.ma5_avgPrice</code>.
     */
    public BigDecimal getMa5Avgprice() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>tushare.stock_info_front.ma5_ccl</code>.
     */
    public void setMa5Ccl(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.ma5_ccl</code>.
     */
    public String getMa5Ccl() {
        return (String) get(14);
    }

    /**
     * Setter for <code>tushare.stock_info_front.ma10_volume</code>.
     */
    public void setMa10Volume(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.ma10_volume</code>.
     */
    public BigDecimal getMa10Volume() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>tushare.stock_info_front.ma10_avgPrice</code>.
     */
    public void setMa10Avgprice(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.ma10_avgPrice</code>.
     */
    public BigDecimal getMa10Avgprice() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>tushare.stock_info_front.ma10_ccl</code>.
     */
    public void setMa10Ccl(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.ma10_ccl</code>.
     */
    public String getMa10Ccl() {
        return (String) get(17);
    }

    /**
     * Setter for <code>tushare.stock_info_front.ma20_volume</code>.
     */
    public void setMa20Volume(BigDecimal value) {
        set(18, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.ma20_volume</code>.
     */
    public BigDecimal getMa20Volume() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>tushare.stock_info_front.ma20_avgPrice</code>.
     */
    public void setMa20Avgprice(BigDecimal value) {
        set(19, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.ma20_avgPrice</code>.
     */
    public BigDecimal getMa20Avgprice() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>tushare.stock_info_front.ma20_ccl</code>.
     */
    public void setMa20Ccl(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.ma20_ccl</code>.
     */
    public String getMa20Ccl() {
        return (String) get(20);
    }

    /**
     * Setter for <code>tushare.stock_info_front.macd_diff</code>.
     */
    public void setMacdDiff(BigDecimal value) {
        set(21, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.macd_diff</code>.
     */
    public BigDecimal getMacdDiff() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>tushare.stock_info_front.macd_dea</code>.
     */
    public void setMacdDea(BigDecimal value) {
        set(22, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.macd_dea</code>.
     */
    public BigDecimal getMacdDea() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>tushare.stock_info_front.macd</code>.
     */
    public void setMacd(BigDecimal value) {
        set(23, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.macd</code>.
     */
    public BigDecimal getMacd() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>tushare.stock_info_front.kdj_k</code>.
     */
    public void setKdjK(BigDecimal value) {
        set(24, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.kdj_k</code>.
     */
    public BigDecimal getKdjK() {
        return (BigDecimal) get(24);
    }

    /**
     * Setter for <code>tushare.stock_info_front.kdj_d</code>.
     */
    public void setKdjD(BigDecimal value) {
        set(25, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.kdj_d</code>.
     */
    public BigDecimal getKdjD() {
        return (BigDecimal) get(25);
    }

    /**
     * Setter for <code>tushare.stock_info_front.kdj_j</code>.
     */
    public void setKdjJ(BigDecimal value) {
        set(26, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.kdj_j</code>.
     */
    public BigDecimal getKdjJ() {
        return (BigDecimal) get(26);
    }

    /**
     * Setter for <code>tushare.stock_info_front.rsi1</code>.
     */
    public void setRsi1(BigDecimal value) {
        set(27, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.rsi1</code>.
     */
    public BigDecimal getRsi1() {
        return (BigDecimal) get(27);
    }

    /**
     * Setter for <code>tushare.stock_info_front.rsi2</code>.
     */
    public void setRsi2(BigDecimal value) {
        set(28, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.rsi2</code>.
     */
    public BigDecimal getRsi2() {
        return (BigDecimal) get(28);
    }

    /**
     * Setter for <code>tushare.stock_info_front.rsi3</code>.
     */
    public void setRsi3(BigDecimal value) {
        set(29, value);
    }

    /**
     * Getter for <code>tushare.stock_info_front.rsi3</code>.
     */
    public BigDecimal getRsi3() {
        return (BigDecimal) get(29);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StockInfoFrontRecord
     */
    public StockInfoFrontRecord() {
        super(StockInfoFront.STOCK_INFO_FRONT);
    }

    /**
     * Create a detached, initialised StockInfoFrontRecord
     */
    public StockInfoFrontRecord(Integer id, String stockCode, Date tsDate, BigDecimal open, BigDecimal high, BigDecimal low, BigDecimal close, BigDecimal volume, BigDecimal amount, String ccl, BigDecimal preclose, BigDecimal netchangeratio, BigDecimal ma5Volume, BigDecimal ma5Avgprice, String ma5Ccl, BigDecimal ma10Volume, BigDecimal ma10Avgprice, String ma10Ccl, BigDecimal ma20Volume, BigDecimal ma20Avgprice, String ma20Ccl, BigDecimal macdDiff, BigDecimal macdDea, BigDecimal macd, BigDecimal kdjK, BigDecimal kdjD, BigDecimal kdjJ, BigDecimal rsi1, BigDecimal rsi2, BigDecimal rsi3) {
        super(StockInfoFront.STOCK_INFO_FRONT);

        set(0, id);
        set(1, stockCode);
        set(2, tsDate);
        set(3, open);
        set(4, high);
        set(5, low);
        set(6, close);
        set(7, volume);
        set(8, amount);
        set(9, ccl);
        set(10, preclose);
        set(11, netchangeratio);
        set(12, ma5Volume);
        set(13, ma5Avgprice);
        set(14, ma5Ccl);
        set(15, ma10Volume);
        set(16, ma10Avgprice);
        set(17, ma10Ccl);
        set(18, ma20Volume);
        set(19, ma20Avgprice);
        set(20, ma20Ccl);
        set(21, macdDiff);
        set(22, macdDea);
        set(23, macd);
        set(24, kdjK);
        set(25, kdjD);
        set(26, kdjJ);
        set(27, rsi1);
        set(28, rsi2);
        set(29, rsi3);
    }
}
