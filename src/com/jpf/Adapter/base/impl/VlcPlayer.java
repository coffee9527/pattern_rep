package com.jpf.Adapter.base.impl;

import com.jpf.Adapter.base.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName);		
	}
	@Override
	public void playMp4(String fileName) {}
}
