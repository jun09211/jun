package org.benq.day13.collection.music.model;

import java.util.ArrayList;
import java.util.List;



public class ManageMusic {
	private List<Music> mList;
	public ManageMusic() {
		mList=new ArrayList<Music>();
	}

	public void registerMusic(Music music) {
		// TODO Auto-generated method stub
		mList.add(music);
	}

	public void registerMusicAtFirst(Music music) {
		// TODO Auto-generated method stub
		mList.add(0,music);
	}

	public List<Music> getAllMusics() {
		// TODO Auto-generated method stub
		
		return mList;
	}

	public Music searchMusic(String title2) {
		// TODO Auto-generated method stub
		if(title2 !=null) {
			for(Music music:mList) {
				if(music.getTitle().equals(title2)) {
					return music;
				}
			}
		}
		return null;
	}

	public void deleteMusic(int index) {
		mList.remove(index);
	}

	public int searchIndexByName(String title2) {
		// TODO Auto-generated method stub
		if(title2!=""&& title2 !=null) {
			int index=0;
			for(Music music : mList) {
				if(title2.equals(music.getTitle())) {
					return index;
				}
				index++;
			}
		}
		return 0;
	}

	public void modifyMusic(int index, Music music) {
		mList.set(index, music);
	}

	public void sortByTitleASC() {
		// collection -list,set,map 크기 -size()
		
		for(int i=0;i<mList.size();i++) {
			for(int j=0;j<(mList.size()-1)-i;j++){
				//버블 정렬 특징
				Music mOne= mList.get(j);
				Music mTwo=mList.get(j+1);
				//문제점 : 객체비교를 부등호로는 무리
				//비교해야 하는 것은 곡명
				//title을 서로 비교하여 ㄱ보다 늦은 순서인 경우 교체
				if(mOne.getTitle().compareTo(mTwo.getTitle())>0) {
					Music temp=mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}

	}

	public void sortByTitleDESC() {
		// TODO Auto-generated method stub
		for(int i=0;i<mList.size();i++) {
			for(int j=0;j<(mList.size()-1)-i;j++){
				Music mOne= mList.get(j);
				Music mTwo=mList.get(j+1);
				//문제점 : 객체비교를 부등호로는 무리
				//비교해야 하는 것은 곡명
				//title을 서로 비교하여 ㄱ보다 늦은 순서인 경우 교체
				if(mOne.getTitle().compareTo(mTwo.getTitle())<0) {
					Music temp=mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
			
	}

	public void sortBySingerASC() {
		// TODO Auto-generated method stub
		for(int i=0;i<mList.size();i++) {
			for(int j=0;j<(mList.size()-1)-i;j++){
				Music mOne= mList.get(j);
				Music mTwo=mList.get(j+1);
				//문제점 : 객체비교를 부등호로는 무리
				//비교해야 하는 것은 곡명
				//title을 서로 비교하여 ㄱ보다 늦은 순서인 경우 교체
				if(mOne.getSinger().compareTo(mTwo.getSinger())>0) {
					Music temp=mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}

	public void sortBySingerDESC() {
		// TODO Auto-generated method stub
		for(int i=0;i<mList.size();i++) {
			for(int j=0;j<(mList.size()-1)-i;j++){
				Music mOne= mList.get(j);
				Music mTwo=mList.get(j+1);
				//문제점 : 객체비교를 부등호로는 무리
				//비교해야 하는 것은 곡명
				//title을 서로 비교하여 ㄱ보다 늦은 순서인 경우 교체
				if(mOne.getSinger().compareTo(mTwo.getSinger())<0) {
					Music temp=mOne;
					mList.set(j, mTwo);
					mList.set(j+1, temp);
				}
			}
		}
	}



}
