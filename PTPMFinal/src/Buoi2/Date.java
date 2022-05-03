package Buoi2;

import java.util.Scanner;

public class Date {
	private int d,m,y;
	public Date() {
		d=1;
		m=1;
		y=1;
	}
	public Date(int a, int b, int c) {
		d=a;
		m=b;
		y=c;
	}
	public Date(Date a){
		d=a.d;
		m=a.m;
		y=a.y;
	}
	public void printDate() {
		System.out.println(d+"/"+m+"/"+y);
	}
	public boolean hopLe() {
		int max[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(y%400 == 0 || (y%4==0 && y%100!=0)) max[2]=29;
		boolean b =false;
		if (y>0 && m>0 && m<13 && d>0 && d<=max[m]) b= true;
		return b;
	}
	public void readDate() {
		Scanner sc= new Scanner(System.in);
		do {
			d= sc.nextInt();
			m= sc.nextInt();
			y= sc.nextInt();
		}while(!hopLe());
	}
	public Date ngayHomSau() {
		Date a= new Date(d,m,y);
		a.d++;
		a.y=y;
		if(!a.hopLe()) {
			a.d=1;
			a.m++;
		}
		if(!a.hopLe()) {
			a.m=1;
			a.y+=1;
		}
		return a;
	}
	public void makeCoppy(Date a){
		this.d=a.d;
		this.m=a.m;
		this.y=a.y;
	}
	public Date congNgay(int x) {
		Date a= new Date(d,m,y);
		for (int i=0;i<x;i++) {
			a=a.ngayHomSau();
		}
		return a;
		
	}
	public String toString(){
		return d+"/"+m+"/"+y;
	}
	
}
