package org.benq.day07.miniproject;

import java.time.LocalDate;

import java.util.Scanner;

public class Mini {
	public static void main(String[] args) {
		String id[]=new String[100];
		String pass[]=new String[100];
		String name[]=new String[100];
		int age[]=new int[100];
		String addr[]= new String[100];
		double weight[][]= new double[100][100];
		LocalDate date[][]=new LocalDate[100][100];
		String em[]=new String[100];
		
		
		
		
		while(true) {
		System.out.print("1.회원가입\n2.로그인\n3.회원정보수정\n4.회원정보삭제\n");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1) {
			for(int i=0;i<100;i++) {
				if(id[i]==null) {
					System.out.print("아이디 : ");
					id[i]=sc.next();
					System.out.print("비밀번호 : ");
					pass[i]=sc.next();
					System.out.print("이름 : ");
					name[i]=sc.next();
					System.out.print("나이 : ");
					age[i]=sc.nextInt();
					System.out.print("이메일 : ");
					em[i]=sc.next();
					System.out.print("주소 : ");
					addr[i]=sc.next();
					System.out.print("몸무게 : ");
					weight[i][0]=sc.nextDouble();					
					date[i][0] = LocalDate.now(); 
					break;
					
				}
			}
		}else if(num==2) {
			System.out.print("아이디 : ");
			String idd=sc.next();
			System.out.print("비밀번호 : ");
			String passs=sc.next();
			
			for (int i=0;i<100;i++) {
			
				if(idd.equals(id[i])) {
					if(passs.equals(pass[i])) {
						
						System.out.println("로그인 완료");
						
						System.out.println("1.몸무게 등록");
						System.out.println("2.등록된 기록 보기");
						System.out.println("3.등록된 기록 수정");
						num=sc.nextInt();
						if(num==1) {
							for(int j=0;j<100;j++) {
								if(weight[i][j]==0) {
									System.out.print("현재 몸무게를 입력하세요 : ");
									weight[i][j]=sc.nextDouble();
									date[i][j] = LocalDate.now();
									break;
								}
								}
						}else if(num==2) {
							for (int z=0;i<100;i++) {
								if(weight[i][z]>0) {
									System.out.println("날짜 : "+date[i][z]+"몸무게 : "+weight[i][z]);
									break;
								}else {
									continue;
								}
							}
						
						}
					}else {
						System.out.println("비밀번호가 틀립니다.");
						break;
					}
					
				}else {
					System.out.println("입력하신 아이디가 없습니다.");
					break;
				}
			}
		}
		
			for(int i=0; i<1;i++) {
				System.out.println(id[i]+"\n"+pass[i]+"\n"+name[i]+"\n"+age[i]+
						"\n"+em[i]+"\n"+addr[i]+"\n"+weight[i][0]+"\n"+date[i][0]);
			}
	}
	}
}

