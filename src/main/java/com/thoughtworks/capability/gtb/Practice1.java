package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int nowYear = date.getYear();
    LocalDate thisYear51 = LocalDate.of(nowYear, 5, 1);
    if(thisYear51.isAfter(date)){
      return thisYear51.getDayOfYear() - date.getDayOfYear();
    }else{
      int thisYearNeedToWaitDays = LocalDate.of(nowYear, 12, 31).getDayOfYear()
              - date.getDayOfYear();
      return thisYearNeedToWaitDays + LocalDate.of(nowYear + 1, 5, 1).getDayOfYear();
    }
  }
}
