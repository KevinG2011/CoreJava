package com.musically.soundsys.impl;

import java.util.List;

import com.musically.soundsys.CompactDisc;

public class BlankDisc implements CompactDisc {
	private String title;
	private String artist;
	private List<String> tracks;
	
	public BlankDisc(String title, String artist, List<String> tracks) {
		super();
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		for (String track : tracks) {
			System.out.println("-Track: " + track);
		}
	}

}
