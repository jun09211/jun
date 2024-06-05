package org.benq.day13.collection.music.controller;

import java.util.List;

import org.benq.day13.collection.music.model.ManageMusic;
import org.benq.day13.collection.music.model.Music;
import org.benq.day13.collection.music.view.ViewMusic;

public class MusicApp {
	public static void main(String[] args) {
		ViewMusic view= new ViewMusic();
		ManageMusic mng=new ManageMusic();
		exit:
		while(true) {
			int choice=view.printMenu();
			Music music=null;
			List<Music> mList=null;
			int index=0;
			String title2="";
			switch(choice) {
				case 1:
					music=view.inputMusic();
					mng.registerMusic(music);
					break;
				case 2:
					music =view.inputMusic();
					mng.registerMusicAtFirst(music);
					break;
				case 3:
					mList=mng.getAllMusics();
					if(mList.size()>0) {
						view.printMusicInfo(mList);
					}else {
						view.displayMsg("정보가 존재하지 않습니다.");
					}
						
					break;
				case 4:
					//곡을 입력받음
					//mList에서 찾아서
					//view를 이용하여 출력
					title2=view.searchMusic();
					music = mng.searchMusic(title2);
					if(music!=null) {
						view.printMusicInfo(music);
					}else {
						view.displayMsg("검색 결과가 업습니다.");
					}
					break;
				case 5:
					title2=view.searchMusic();
					index=mng.searchIndexByName(title2);
					mng.deleteMusic(index);
					break;
				case 6:
					title2=view.searchMusic();
					//수정할위치
					index=mng.searchIndexByName(title2);
					//수정할 정보
					music = mng.searchMusic(title2);
					music = view.modifyMusic(music);
					
					mng.modifyMusic(index,music);
					break;
				case 7:
					mng.sortByTitleASC();
					break;
				case 8:
					mng.sortByTitleDESC();
					break;
				case 9:
					mng.sortBySingerASC();
					break;
				case 10:
					mng.sortBySingerDESC();
					break;
				case 0:
					view.displayMsg("프로그램을 종료 합니다.");
					break exit;
				default :
					view.displayMsg("매뉴를 잘못 선택 하셨습니다.");
					
					break;
				
			}
		}
	}
}
