package com.jk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class BadCount {
    Integer id;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date badTime;
    Integer badCount;
}
