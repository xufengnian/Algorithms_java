//如何导入书上的Std库，首先下载algs4.jar，然后在C:/user/username下新建文件夹algs4，然后放入algs4.jar
//然后在环境变量classpath中添加C:/user/username/algs4.jar
//最后在Eclipse中选中源文件，右键build path，添加额外的jar包就是C:/user/username/algs4.jar
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
