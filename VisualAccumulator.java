//��ε������ϵ�Std�⣬��������algs4.jar��Ȼ����C:/user/username���½��ļ���algs4��Ȼ�����algs4.jar
//Ȼ���ڻ�������classpath�����C:/user/username/algs4.jar
//�����Eclipse��ѡ��Դ�ļ����Ҽ�build path����Ӷ����jar������C:/user/username/algs4.jar
import edu.princeton.cs.algs4.*;
public class VisualAccumulator {
	private double total;
	private int N;
	
	public VisualAccumulator (int trials,double max){
		StdDraw.setXscale(0,trials);
		StdDraw.setYscale(0,max);
		StdDraw.setPenRadius(.005);		
	}
	public void addDataValue(double val){
		N++;
		total += val;
		StdDraw.setPenColor(StdDraw.DARK_GRAY);
		StdDraw.point(N, val);
		StdDraw.point(N, total/N);
	}
	public double mean(){
		return total/N;
	}
	public String toString(){
		return "Mean (" +N+" values): "+String.format("%7.5f", mean());
	}
	
	public static void main(String[] args){
		int T = Integer.parseInt(args[0]);
		VisualAccumulator a = new VisualAccumulator(T,1.0);
		for(int t=0;t<T;t++){
			a.addDataValue(StdRandom.random());			
		}
		StdOut.println(a);
	}

}
