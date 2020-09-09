/*
	冒泡排序算法：		
		int类型的数组：3 1 6 2 5		
*/
public class BubbleSort{	
	public static void main(String[] args){
		int[] a = {3,1,6,2,5};
		//开始排序
		for(int i=a.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					//交换位置
					int temp;
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		//遍历
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}

/*

3 1 6 2 5

第一次循环：
1 3 6 2 5
1 3 6 2 5
1 3 2 6 5
1 3 2 5 6


1 3 2 5
第二次循环：
1 3 2 5
1 2 3 5
1 2 3 5

1 2 3
第三次循环：
1 2 3
1 2 3

1 2
第四次循环：
1 2
*/