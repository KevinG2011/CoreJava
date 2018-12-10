package com.musically.soundsys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.musically.soundsys.CompactDisc;
import com.musically.soundsys.impl.HardDaysNight;
import com.musically.soundsys.impl.Revolver;
import com.musically.soundsys.impl.SgtPeppers;
import com.musically.soundsys.impl.WhiteAlbum;
import com.musically.soundsys.player.impl.CDPlayer;

@Configuration
public class CDPlayerConfig {
	@Bean
	public CompactDisc randomBeatlesCD() {
		int choice = (int) Math.floor(Math.random() * 4);
		if (choice == 0) {
			return new SgtPeppers();
		} else if (choice == 1) {
			return new WhiteAlbum();
		} else if (choice == 2) {
			return new HardDaysNight();
		} else {
			return new Revolver();
		}
	}
	
	@Bean 
	public CDPlayer cdPlayer() {
		return new CDPlayer(this.randomBeatlesCD());
	}
}
