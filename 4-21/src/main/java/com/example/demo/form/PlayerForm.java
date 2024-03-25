package com.example.demo.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PlayerForm {
	/**
	   * ID
	   */
	  private Integer id;
	  
	  /**
	   * 名前
	   */
	  @NotEmpty(message = "※名前を入力してください")
	  @Size(max = 50, message = "・名前は50文字以内で入力してください")
	  private String name;
	  
	  /**
	   * 学校名
	   */
	  @NotEmpty(message = "※学校名を入力してください")
	  @Size(max = 50, message = "・学校名は50文字以内で入力してください")
	  private String school;
	  
	  /**
	   * 部活
	   */
	  @NotEmpty(message = "※部活を入力してください")
	  @Size(max = 50, message = "・部活は50文字以内で入力してください")
	  private String club;
	  
	  /**
	   * 種目
	   */
	  @NotEmpty(message = "※種目（ポジション）を入力してください（例：陸上部→ハードル,野球→ピッチャー）")
	  @Size(max = 50, message = "・種目（ポジション）は50文字以内で入力してください")
	  private String sports_event;

}