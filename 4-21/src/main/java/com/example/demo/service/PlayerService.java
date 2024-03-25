package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.PlayerEntity;
import com.example.demo.form.PlayerForm;
import com.example.demo.repository.PlayerRepository;

/**
 * 選手情報 Service
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PlayerService {
	/**
	 * 選手情報 Repository
	 */
	@Autowired
	private PlayerRepository playerRepository;

	/**
	 * 選手情報 全検索
	 * @return  検索結果
	 */
	public List<PlayerEntity> searchAll() {
		return playerRepository.findAll();
	}
	
	/**
	 * 選手情報 新規登録
	 * @param  subject 科目情報
	 */
	public void create(PlayerForm playerRequest) {
		PlayerEntity player = new PlayerEntity();
		player.setName(playerRequest.getName());
		player.setSchool(playerRequest.getSchool());
		player.setClub(playerRequest.getClub());
		player.setSports_event(playerRequest.getSports_event());
		playerRepository.save(player);
	}
	
	/**
	 * 選手情報 主キー検索
	 * @return  検索結果
	 */
	public PlayerEntity findById(Integer id) {
		return playerRepository.getOne(id);
	}
	
	/**
	 * 選手情報 更新
	 * @param  subject 選手情報
	 */
	public void update(PlayerForm playerUpdateRequest) {
		PlayerEntity player = findById(playerUpdateRequest.getId());
		player.setName(playerUpdateRequest.getName());
		player.setSchool(playerUpdateRequest.getSchool());
		player.setClub(playerUpdateRequest.getClub());
		player.setSports_event(playerUpdateRequest.getSports_event());
		playerRepository.save(player);
	}
	
	/**
	 * 選手情報 物理削除
	 * @param  id ID
	 */
	public void delete(Integer id) {
		PlayerEntity player = findById(id);
		playerRepository.delete(player);
	}

	
	
	
	
	
	
	
}
