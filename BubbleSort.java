/*
	ð�������㷨��		
		int���͵����飺3 1 6 2 5		
*/
public class BubbleSort{	
	public static void main(String[] args){
		int[] a = {3,1,6,2,5};
		//��ʼ����
		for(int i=a.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					//����λ��
					int temp;
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		//����
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}

/*

3 1 6 2 5

��һ��ѭ����
1 3 6 2 5
1 3 6 2 5
1 3 2 6 5
1 3 2 5 6


1 3 2 5
�ڶ���ѭ����
1 3 2 5
1 2 3 5
1 2 3 5

1 2 3
������ѭ����
1 2 3
1 2 3

1 2
���Ĵ�ѭ����
1 2
*/