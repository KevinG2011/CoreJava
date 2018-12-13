package com.musically.soundsys.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.musically.soundsys.CompactDisc;
import com.musically.soundsys.config.CDPlayerConfig;
import com.musically.soundsys.player.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	@Rule
//	public final SystemOutRule log = new SystemOutRule();
	@Autowired
	private MediaPlayer player;
	@Autowired
	private CompactDisc cd;
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	public void play() {
		player.play();
	}
}
