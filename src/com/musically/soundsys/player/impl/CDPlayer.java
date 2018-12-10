package com.musically.soundsys.player.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.musically.soundsys.CompactDisc;
import com.musically.soundsys.player.MediaPlayer;

@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;
	
	@Autowired(required=false)
	public CDPlayer(CompactDisc cd) {
		super();
		this.cd = cd;
	}
	
	@Autowired
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}

	@Override
	public void play() {
		this.cd.play();
	}

}
