package com.jk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RecordBean {

  private int  recordId;
  private  String recordCommodity;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
  private Date recordTime;
  private   Double recordAmount;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
  private  Date recordSettling;
  private  int recordStatus;


    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public void setRecordCommodity(String recordCommodity) {
        this.recordCommodity = recordCommodity;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public void setRecordAmount(Double recordAmount) {
        this.recordAmount = recordAmount;
    }

    public void setRecordSettling(Date recordSettling) {
        this.recordSettling = recordSettling;
    }

    public void setRecordStatus(int recordStatus) {
        this.recordStatus = recordStatus;
    }

    public int getRecordId() {
        return recordId;
    }

    public String getRecordCommodity() {
        return recordCommodity;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public Double getRecordAmount() {
        return recordAmount;
    }

    public Date getRecordSettling() {
        return recordSettling;
    }

    public int getRecordStatus() {
        return recordStatus;
    }
}
