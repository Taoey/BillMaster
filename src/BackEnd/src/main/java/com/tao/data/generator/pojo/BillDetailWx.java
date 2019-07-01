package com.tao.data.generator.pojo;

public class BillDetailWx {
    private Long id;

    private Long gmtCreate;

    private Long gmtModified;

    private Short billType;

    private Short incomeType;

    private String payType;

    private String trader;

    private Long payTime;

    private Long payNum;

    private Long payReturn;

    private Long payNumReal;

    private String payStatus;

    private Short status;

    private String goods;

    private String tradeNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Short getBillType() {
        return billType;
    }

    public void setBillType(Short billType) {
        this.billType = billType;
    }

    public Short getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(Short incomeType) {
        this.incomeType = incomeType;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getTrader() {
        return trader;
    }

    public void setTrader(String trader) {
        this.trader = trader == null ? null : trader.trim();
    }

    public Long getPayTime() {
        return payTime;
    }

    public void setPayTime(Long payTime) {
        this.payTime = payTime;
    }

    public Long getPayNum() {
        return payNum;
    }

    public void setPayNum(Long payNum) {
        this.payNum = payNum;
    }

    public Long getPayReturn() {
        return payReturn;
    }

    public void setPayReturn(Long payReturn) {
        this.payReturn = payReturn;
    }

    public Long getPayNumReal() {
        return payNumReal;
    }

    public void setPayNumReal(Long payNumReal) {
        this.payNumReal = payNumReal;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods == null ? null : goods.trim();
    }

    public String getTradeNum() {
        return tradeNum;
    }

    public void setTradeNum(String tradeNum) {
        this.tradeNum = tradeNum == null ? null : tradeNum.trim();
    }
}