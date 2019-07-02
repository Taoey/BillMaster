package com.tao.data.generator.pojo;

public class BillDetailAli {
    private Long id;

    private Long gmtCreate;

    private Long gmtModified;

    private Short status;

    private Long payCreatTime;

    private Long payTime;

    private Long payModifiedTime;

    private String billPlace;

    private Short billType;

    private String trader;

    private String goods;

    private Long payNum;

    private Short incomeType;

    private Short payStatus;

    private Long payService;

    private Long payReturn;

    private String remark;

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

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Long getPayCreatTime() {
        return payCreatTime;
    }

    public void setPayCreatTime(Long payCreatTime) {
        this.payCreatTime = payCreatTime;
    }

    public Long getPayTime() {
        return payTime;
    }

    public void setPayTime(Long payTime) {
        this.payTime = payTime;
    }

    public Long getPayModifiedTime() {
        return payModifiedTime;
    }

    public void setPayModifiedTime(Long payModifiedTime) {
        this.payModifiedTime = payModifiedTime;
    }

    public String getBillPlace() {
        return billPlace;
    }

    public void setBillPlace(String billPlace) {
        this.billPlace = billPlace == null ? null : billPlace.trim();
    }

    public Short getBillType() {
        return billType;
    }

    public void setBillType(Short billType) {
        this.billType = billType;
    }

    public String getTrader() {
        return trader;
    }

    public void setTrader(String trader) {
        this.trader = trader == null ? null : trader.trim();
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods == null ? null : goods.trim();
    }

    public Long getPayNum() {
        return payNum;
    }

    public void setPayNum(Long payNum) {
        this.payNum = payNum;
    }

    public Short getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(Short incomeType) {
        this.incomeType = incomeType;
    }

    public Short getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Short payStatus) {
        this.payStatus = payStatus;
    }

    public Long getPayService() {
        return payService;
    }

    public void setPayService(Long payService) {
        this.payService = payService;
    }

    public Long getPayReturn() {
        return payReturn;
    }

    public void setPayReturn(Long payReturn) {
        this.payReturn = payReturn;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getTradeNum() {
        return tradeNum;
    }

    public void setTradeNum(String tradeNum) {
        this.tradeNum = tradeNum == null ? null : tradeNum.trim();
    }
}