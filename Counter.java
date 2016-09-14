//简单的小java程序，想说明实例变量是每个对象都有一个的，而静态变量则是每个类只有一个，无论它生成了多少对象
public class Counter {
	private final String name;
	private int count;
	
	public Counter(String id){
		name = id;
	}
	public void increment(){
		count++;		
	}
	public int tally(){
		return count;
	}
	public String toString(){
		return count +" " +name;				
	}
	public static void main(String[] args){
		Counter heads = new Counter("heads");
		Counter tails = new Counter("tails");
		
		heads.increment();
		heads.increment();
		tails.increment();
		
		System.out.println(heads +" "+tails);//输出 2 heads 1 tails，因为count是每个对象有且只有一个的
		System.out.println(heads.tally()+tails.tally());//输出3
		/*
		 若程序第四行改为private static int count;
		 则输出3 heads 3 tails，因为count此时变成了静态变量，归属于类而非具体的某个对象，只有一个，因此任何一个对象对它进行修改都会波及其他对象
		 最后页会输出6，因为3+3
		 */
	}

}
