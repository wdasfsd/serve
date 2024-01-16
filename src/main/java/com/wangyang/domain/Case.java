package com.wangyang.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;@Data
@TableName("dms_case_history")
   public class Case {
   private Integer id;
   private String chief_complaint;
   private String history_of_present_illness;
   private String history_of_treatment;
   private String past_history;
   private String allergies;
   private String health_checkup;
   private String priliminary_dise_str_list;
   private String idCardNumber;
}
