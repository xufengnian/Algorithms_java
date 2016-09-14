//�򵥵�Сjava������˵��ʵ��������ÿ��������һ���ģ�����̬��������ÿ����ֻ��һ���������������˶��ٶ���
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
		
		System.out.println(heads +" "+tails);//��� 2 heads 1 tails����Ϊcount��ÿ����������ֻ��һ����
		System.out.println(heads.tally()+tails.tally());//���3
		/*
		 ����������и�Ϊprivate static int count;
		 �����3 heads 3 tails����Ϊcount��ʱ����˾�̬����������������Ǿ����ĳ������ֻ��һ��������κ�һ��������������޸Ķ��Შ����������
		 ���ҳ�����6����Ϊ3+3
		 */
	}

}
