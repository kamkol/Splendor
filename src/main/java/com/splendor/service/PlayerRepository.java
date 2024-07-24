package com.splendor.service;

import java.util.List;
import com.splendor.entity.Player;

public interface PlayerRepository {

	List<Player> findAll();
	
}
