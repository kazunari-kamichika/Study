package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.PlayerEntity;
import com.example.demo.form.PlayerForm;
import com.example.demo.service.PlayerService;

/**
 * 選手情報 Controller
 */
@Controller
public class PlayerController {
	
	/**
	 * 選手情報 Service
	 */
	@Autowired
	PlayerService playerService;
	
	/**
	 * 選手情報一覧画面を表示
	 * @param  model Model
	 * @return  選手情報一覧画面のHTML
	 */
	@GetMapping("/player/list")
	public String playerList(Model model) {
		List<PlayerEntity> playerlist = playerService.searchAll();
		model.addAttribute("playerlist", playerlist);
		return "player/list";
	}
	
	/**
	 * 選手新規登録画面を表示
	 * @param  model Model
	 * @return  選手情報一覧画面
	 */
	@GetMapping("/player/add")
	public String playerRegister(Model model) {
		model.addAttribute("playerRequest", new PlayerForm());
		return "player/add";
	}
	
	/**
	 * 選手新規登録
	 * @param  userRequest リクエストデータ
	 * @param  model Model
	 * @return  選手情報一覧画面
	 */
	
	@PostMapping("/player/create")
	public String playerCreate(@Validated  @ModelAttribute  PlayerForm playerRequest, BindingResult result, Model model) {
		if (result.hasErrors()) {
			// 入力チェックエラーの場合
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : result.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("playerRequest", new PlayerForm());
			model.addAttribute("validationError", errorList);
			return "player/add";
		}
		
		// 科目情報の登録
				playerService.create(playerRequest);
				return "redirect:/player/list";
			}
	
	/**
	 * 選手情報詳細画面を表示
	 * @param  id 表示する選手ID
	 * @param  model Model
	 * @return  選手情報詳細画面
	 */
	@GetMapping("/player/{id}")
	public String userDetail(@PathVariable  Integer id, Model model) {
		PlayerEntity player = playerService.findById(id);
		model.addAttribute("player", player);
		return "player/detail";
	}
	
	/**
	 * 選手編集画面を表示
	 * @param  id 表示する科目ID
	 * @param  model Model
	 * @return  選手編集画面
	 */
	@GetMapping("/player/{id}/edit")
	public String userEdit(@PathVariable  Integer id, Model model) {
		PlayerEntity player = playerService.findById(id);
		PlayerForm playerUpdateRequest = new PlayerForm();
		playerUpdateRequest.setId(player.getId());
		playerUpdateRequest.setName(player.getName());
		playerUpdateRequest.setSchool(player.getSchool());
		playerUpdateRequest.setClub(player.getClub());
		playerUpdateRequest.setSports_event(player.getSports_event());
		model.addAttribute("playerUpdateRequest", playerUpdateRequest);
		return "player/edit";
	}
	
	/**
	 * 選手更新
	 * @param  playerRequest リクエストデータ
	 * @param  model Model
	 * @return  選手情報詳細画面
	 */
	@PostMapping("/player/update")
	public String playerUpdate(@Validated  @ModelAttribute  PlayerForm playerUpdateRequest, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<String> errorList = new ArrayList<String>();
			for (ObjectError error : result.getAllErrors()) {
				errorList.add(error.getDefaultMessage());
			}
			model.addAttribute("playerRequest", new PlayerForm());
			model.addAttribute("validationError", errorList);
			return "player/edit";
		}
		
		// 科目情報の更新
				playerService.update(playerUpdateRequest);
				return String.format("redirect:/player/%d", playerUpdateRequest.getId());
			}
	
	 /**
		 * 選手情報削除
		 * @param  id 表示するID
		 * @param  model Model
		 * @return  選手情報詳細画面
		 */
		@GetMapping("/player/{id}/delete")
		public String playerDelete(@PathVariable Integer id, Model model) {
			// 選手情報の削除
			playerService.delete(id);
			return "redirect:/player/list";
		}
	
	
	
	
	
	

}
