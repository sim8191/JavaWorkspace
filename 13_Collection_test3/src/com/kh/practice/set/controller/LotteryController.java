package com.kh.practice.set.controller;

import java.util.HashSet;
import java.util.TreeSet;

import com.kh.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet<Lottery> lottery = new HashSet<>();
	private HashSet win = new HashSet<>(4);
	
	public boolean insertObject(Lottery l) {
		boolean lotBool = true;
//		for(Lottery le : lottery) {
//			if(le.equals(l)) {
//				lotBool = false;
//			}else {
//				lottery.add(l);
//			}
//		}
		lotBool = lottery.add(l);
		return lotBool;
	}
	
	public boolean deleteObject(Lottery l) {
		boolean lotBool = false;
		for(Lottery le : lottery) {
			if(le.equals(l)) {
				lotBool = true;
				lottery.remove(l);
			}
		}
		return lotBool;
	}
	
	public HashSet winObject() {
		for(int i=0;i<win.size();i++) {
			
		}
		return null;
	}
	
	public TreeSet sortedWinObject() {
		
		return null;
	}
	
	public boolean searchWinner(Lottery l) {
		
		return win.equals(l);
	}
}
