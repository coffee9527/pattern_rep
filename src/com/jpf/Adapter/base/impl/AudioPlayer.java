package com.jpf.Adapter.base.impl;

import com.jpf.Adapter.base.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter; 

	@Override
	public void play(String audioType, String fileName) {
		//播放mp3文件的内置支持
		if("mp3".equalsIgnoreCase(audioType)){
	         System.out.println("Playing mp3 file. Name: "+ fileName);			
	      } 
	      //mediaAdapter 提供了播放其他文件格式的支持
	      else if("vlc".equalsIgnoreCase(audioType) 
	         || "mp4".equalsIgnoreCase(audioType)){
	         mediaAdapter = new MediaAdapter(audioType);
	         mediaAdapter.play(audioType, fileName);
	      }
	      else{
	         System.out.println("Invalid media. "+
	            audioType + " format not supported");
	      }
	}

}
