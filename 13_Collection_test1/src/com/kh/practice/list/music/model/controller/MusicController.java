package com.kh.practice.list.music.model.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	int i = 0;
	ArrayList<Music> list = new ArrayList<>();
	
	public int addList(Music music) {
		list.add(music);
		return 0;
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);
		return 0;
	}
	
	public List<Music> printAll() {
		
		return list;
	}
	
	public Music searchMusic(String title) {
		
		return null;
	}
	
	public Music removeMusic(String title) {
		
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		
		return music;
		
	}
	
	public int ascTitle() {
		
		return 0;
	}
	
	public int descSinger() {
		
		return 0;
	}

}
