package hihotest;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



 public class HihoProgram {
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			/*	Scanner in=new Scanner(System.in);
				String data=in.nextLine();
				String[] arr=data.split(";");
				int m=arr.length;
				String arr1[]=arr[0].split(" ");
				int n=arr1.length;
				int[][] juzhen=new int[m][n];
				for(int i=0;i<m;i++){
					for(int j=0;j<n;j++){
						juzhen[i][j]=Integer.parseInt(arr[i].split(" ")[j]);
					}
				}
				int sum=0;
				for(int i=0;i<m-1;i++){
					for(int j=0;j<n-1;j++){
						int s=juzhen[i][j]+juzhen[i][j+1]+juzhen[i+1][j]+juzhen[i+1][j+1];
						if(sum<s){
							sum=s;
						}
					}
				}*/
		         double theta=360/Math.PI*Math.asin(6/2.0/5);
		         double a=Math.asin(6/2.0/5);
				System.out.print(theta/2+" "+a);
				
	     


	}
	
	
	public static void strover(){
		Scanner in=new Scanner(System.in);
		String s=in.next();
		for(int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
	}
	
 	public static void ballFall(){
		Scanner in=new Scanner(System.in);
		int hight=in.nextInt();
		if(hight>0){
		double total=hight;
		for(int i=1;i<5;i++){
			total=total+2*hight/Math.pow(2, i);
		}
		double fiveth=hight/Math.pow(2, 5);
		String totalstr=String.valueOf(total);
		String fivethstr=String.valueOf(fiveth);
		System.out.print(totalstr.substring(0,zero(totalstr)+1)+" "+fivethstr.substring(0,zero(fivethstr)+1));
		}
		else System.out.print(0+" "+0);
	}
	public static int zero(String s){
		int a=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!='0'){
				a=i;
			}
		}
		if(s.charAt(a)=='.'){
			return a-1;
		}
		return a;
	}
	
	
	public static void list(){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		LinkedList<Integer> s=new LinkedList<Integer>();
		 for(int i=0;i<8;i++){
			 s.addLast(in.nextInt());
		 }
		 int k=in.nextInt();
		 System.out.print(s.get(k-1));
		
	}
	
	public static void mima(){
		Scanner in=new Scanner(System.in);
		String str=in.next();
		for(int i=0;i<str.length();i++){
			char strout;
			if(str.charAt(i)>='A'&&str.charAt(i)<'Z'){
				strout=(char) (str.charAt(i)+33);
			}
			else if(str.charAt(i)=='Z'){
				strout=(char) (str.charAt(i)+7);
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='c'){
				strout='2';
			}
			else if(str.charAt(i)>='d'&&str.charAt(i)<='f'){
				strout='3';
			}
			else if(str.charAt(i)>='g'&&str.charAt(i)<='i'){
				strout='4';
			}
			else if(str.charAt(i)>='j'&&str.charAt(i)<='l'){
				strout='5';
			}
			else if(str.charAt(i)>='m'&&str.charAt(i)<='o'){
				strout='6';
			}
			else if(str.charAt(i)>='p'&&str.charAt(i)<='s'){
				strout='7';
			}
			else if(str.charAt(i)>='t'&&str.charAt(i)<='v'){
				strout='8';
			}
			else if(str.charAt(i)>='w'&&str.charAt(i)<='z'){
				strout='9';
			}
			else strout=str.charAt(i);
			System.out.print(strout);
		}
	}
	
	public static void checknetSegment(){
		Scanner in=new Scanner(System.in);
		String tempstr=in.next();
		String[] mask=tempstr.split("\\.");
		tempstr=in.next();
		String[] str1=tempstr.split("\\.");
		tempstr=in.next();
		String[] str2=tempstr.split("\\.");
		if(isIP(mask)&&isIP(str1)&&isIP(str2)){
		int[] maskout=new int[4];
		int[] str1out=new int[4];
		int[] str2out=new int[4];
		boolean is=true;
		for(int i=0;i<4;i++){
			maskout[i]=Integer.valueOf(mask[i]).intValue();
			str1out[i]=Integer.valueOf(str1[i]).intValue();
			str2out[i]=Integer.valueOf(str2[i]).intValue();
			if((str1out[i]&maskout[i])!=(str2out[i]&maskout[i])){
				is=false;
				break;
			}
		}
		if(is){
			System.out.print(0);
		}
		else System.out.print(2);
		}
		else System.out.print(1);
		
		
	}
	
	public static boolean isIP(String[] s){
		if(s.length==4){
		for(int i=0;i<4;i++){
			if(!s[i].matches("^\\d|[1-9]\\d|1\\d\\d|2[0-5][0-5]$")){
				return false;
			}
		}
			return true;
		}
		else return false;
		
	}
	
	public static void pad(){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		n++;m++;
		int[][] total=new int[n][m];
		total[0][0]=0;
		for(int k=1;k<n;k++){
			total[k][0]=1;
		}
		for(int k=1;k<m;k++){
			total[0][k]=1;
		}
		for(int i=1;i<n;i++){
			for(int j=1;j<m;j++){
				total[i][j]=total[i-1][j]+total[i][j-1];
			}
		}
		System.out.print(total[n-1][m-1]);
	}
	
	public static String stationName(int id){
		String[] name={"石桥铺","歇台子","石油路","大坪","鹅岭","两路口","七星岗","较场口","小什字",
				"谢家湾","袁家岗","佛图关","李子坝","牛角沱","曾家岩","大溪沟","黄花园","临江门",
				"四公里","南坪","工贸","铜元局","华新街","观音桥","红旗河沟","嘉州路","郑家院子",
				"唐家院子","狮子坪","冉家坝","大龙山","花卉园","黄泥磅","红土地","五里店","江北城",
				"大剧院","上新街","刘家坪"};
		return name[id-1];
	}
	public static int stationName(String station){
		String[] name={"石桥铺","歇台子","石油路","大坪","鹅岭","两路口","七星岗","较场口","小什字",
				"谢家湾","袁家岗","佛图关","李子坝","牛角沱","曾家岩","大溪沟","黄花园","临江门",
				"四公里","南坪","工贸","铜元局","华新街","观音桥","红旗河沟","嘉州路","郑家院子",
				"唐家院子","狮子坪","冉家坝","大龙山","花卉园","黄泥磅","红土地","五里店","江北城",
				"大剧院","上新街","刘家坪"};
		for(int id=0;id<name.length;id++){
			if(name[id].equals(station)){
				return id+1;
			}
		}
		return -1;
	}
	
	public static int[][] cqMap(int station){
		int[] data={1 ,2 ,2, 3, 3 ,4 ,4 ,5 ,5 ,6, 6, 7, 7, 8, 8 ,9,
				 10, 11, 11 ,4 ,4 ,12, 12, 13 ,13, 14 ,14 ,15 ,15 ,
				 16, 16, 17, 17, 18, 18, 8,19, 20, 20, 21 ,21 ,22 ,
				 22, 6, 6 ,14 ,14 ,23 ,23 ,24, 25 ,26, 27 ,28 ,24, 
				 25 ,30, 31, 31 ,32, 26 ,27, 28 ,29,32, 25, 25 ,33 ,
				 33 ,34 ,34 ,35 ,35, 36, 36 ,37 ,37, 9, 9, 38, 38, 39};
		int[][] map=new int[station+1][station+1];
		for(int i=0;i<data.length/2-1;i++){
			map[data[2*i]][data[2*i+1]]=1;
			map[data[2*i+1]][data[2*i]]=1;
		}
		return map;
	}
	/*重庆地铁表：
	 39 11 26
	 1 2 2 3 3 4 4 5 5 6 6 7 7 8 8 9
	 10 11 11 4 4 12 12 13 13 14 14 15 15 16 16 17 17 18 18 8
	 19 20 20 21 21 22 22 6 6 14 14 23 23 24 25 26 27 28 24 25 30 31 31 32 26 27 28 29
	 32 25 25 33 33 34 34 35 35 36 36 37 37 9 9 38 38 39 -1
	*/
	public static void BFS(){
	    Scanner in=new Scanner(System.in);
	    int n=39;//in.nextInt();
	    int src=stationName(in.next());
	    int des=stationName(in.next());
	    if(src==-1||des==-1)
	    	System.out.print("错误的站名或此站未开通！");
	    else{
	    int[][] map=new int[n+1][n+1];
	    /*int v;
	    while((v=in.nextInt())!=-1){
	    	int b=in.nextInt();
	    	map[v][b]=1;map[b][v]=1;
	    }*/
	    map=cqMap(n);
	    int[] d=new int[n+1];
	    int[] pi=new int[n+1];
	    char[] color=new char[n+1];
	    for(int i=1;i<=n;i++){
	    	d[i]=999999;
	    	color[i]='W';
	    	pi[i]=-1;
	    }
	    d[src]=0;color[src]='G';pi[src]=-1;
	    Queue<Integer> queue=new LinkedList<Integer>();
	    queue.offer(src);
	    while(!queue.isEmpty()){
	    	int u=queue.poll();
	    	for(int j=1;j<=n;j++){
	    		if(map[u][j]!=0){
	    			if(color[j]=='W'){
	    				color[j]='G';
	    				d[j]=d[u]+1;
	    				pi[j]=u;
	    				queue.offer(j);
	    			}
	    		}
	    	}
	    	color[u]='B';
	    }
	    System.out.print(d[des]+"个站"+"\n");
	    print(pi,des);
	    }
	   /* int q=d[des];
	    for(int i=0;i<=q;i++){
	    	System.out.print(stationName(des)+" ");
	    	des=pi[des];
	    }*/
	}
	
	public static void print(int[] pi,int id){
		if(pi[id]!=-1){
			print(pi,pi[id]);
		}
		 System.out.print(stationName(id)+"→");
	}
	
	
	public static void scoreMax(){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		int[] score=new int[N+1];
		for(int i=1;i<=N;i++){
			score[i]=in.nextInt();
		}
		String[] C=new String[M+1];
		int[] start=new int[M+1];
		int[] end=new int[M+1];
		for(int j=1;j<=M;j++){
			C[j]=in.next();
			start[j]=in.nextInt();
			end[j]=in.nextInt();
			if(C[j].equals("Q")){
				System.out.print(ask(score,start[j],end[j])+"\n");
			}
			 if(C[j].equals("U")){
					change(score,start[j],end[j]);
				}
		}

	}
	
	public static int ask(int[] score,int id_s,int id_e){
		int maxScore=score[id_s];
		if(id_s<=id_e){
		for(int i=id_s;i<=id_e;i++){
			maxScore=maxScore<score[i]?score[i]:maxScore;
		}
		}else{
			for(int i=id_s;i<=score.length-1;i++){
				maxScore=maxScore<score[i]?score[i]:maxScore;
			}
			for(int i=1;i<=id_e;i++){
				maxScore=maxScore<score[i]?score[i]:maxScore;
			}
		}
		return maxScore;
	}
	
	public static void change(int[] score,int id,int B){
		score[id]=B;
	}
	
	public static void busLine(){
		Scanner in=new Scanner(System.in);
		int src=in.nextInt();
		int des=in.nextInt();
		int n=in.nextInt();
		int[] pi=new int[n];
		int[] d=new int[n];
		char[] color=new char[n];
		int[][] Adj=new int[n][n];
		
		for(int i=0;i<n;i++){
			d[i]=999999;
			color[i]='W';
		}
		d[src]=0;color[src]='G';
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.offer(0);
        
		
	

	}


	
	public static void ipAddress(){
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		boolean s=str.matches("^([1-9]|[1-9]\\d|1[0-2][0-6])"
				+ "(\\.(\\d|\\d{2}|[1-2][0-5][0-5])){3}$");
		System.out.print(s);
	}
	
	public static void buyList(){
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int n=in.nextInt();
		int[] v=new int[n+1];
		int[] p=new int[n+1];
		int[] q=new int[n+1];
		for(int i=1;i<=n;i++){
			v[i]=in.nextInt();
			p[i]=in.nextInt();
			q[i]=in.nextInt();
		}
		int max;ArrayList<Integer> path=new ArrayList<Integer>();
		max=bag01(n,1,N,v,p,q,path);
		System.out.print(max);

		
	}
	public static int bag01(int n,int i,int j,int[] v,int[] p,int[] q,ArrayList<Integer> path){
		int max=0;
		if(i<=n){
			if(j>=v[i]){
				int r1=0,r2=0;
				if(q[i]==0||hasMain(q[i],path)){
					path.add(i);
				 r1=bag01(n,i+1,j-v[i],v,p,q,path)+v[i]*p[i];
				
				}
				delet(i,path);
				 r2=bag01(n,i+1,j,v,p,q,path);				
				 max=r1<r2?r2:r1;
			}
		}
		return max;
	}	
	public static boolean hasMain(int p,ArrayList<Integer> path){
		for(int i=0;i<path.size();i++){
			if(p==path.get(i)){
				return true;
			}
		}
		return false;
	}
	public static void delet(int p,ArrayList<Integer> path){
		for(int i=0;i<path.size();i++){
			if(p==path.get(i)){
				path.remove(i);
			}
		}
	}
	
	public static void moveXy(){
		int x=0,y=0;
		Scanner in=new Scanner(System.in);
		String[] str=in.nextLine().split(";");
		for(int i=0;i<str.length;i++){
			int len=str[i].length();
			if(len<=3&&len>1){
				if(str[i].substring(1).matches("[0-9]+")){
					int temp=Integer.valueOf(str[i].substring(1)).intValue();
					if(temp>=0&&temp<=99){
					switch(str[i].charAt(0)){
					  case 'A':x=x-temp;break;
					  case 'D':x=x+temp;break;
					  case 'W':y=y+temp;break;
					  case 'S':y=y-temp;
					}
				}
					
				}
			}
		}
		System.out.print(x+","+y);
	}
	
	public static void singerQueue(){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int[][] a=new int[n][2];
		for(int i=1;i<=n-1;i++){
			if(arr[i]<arr[i-1]){
				a[i][0]++;
			}
			else if(arr[i]>arr[i-1]){
				a[i-1][1]++;
			}
			else{
				a[i][0]++;
				a[i-1][1]++;
			}
		}
		int min=n;
		for(int j=0;j<=n-1;j++){
			int num=0;
			for(int p=0;p<=j;p++){
				num=num+a[p][0];
			}
			for(int q=j;q<=n-1;q++){
				num=num+a[q][1];
			}
			if(num<min){
				min=num;
			}
		}
		System.out.print(min);
     }
	
	
}
