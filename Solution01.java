/*
��һ����ά�����У�ÿ��һά����ĳ�����ͬ����
ÿһ�ж����մ����ҵ�����˳������
ÿһ�ж����մ��ϵ��µ�����˳������
�����һ������������������һ����ά�����һ��������
�ж��������Ƿ��и�������


˼·��array[row][col]�Ƕ�ά���������½ǵ�Ԫ�أ�
	target�ȸ�ֵ��target�ڸ�ֵ�ұߣ���ֵ++��
	target�ȸ�ֵС��target�ڸ�ֵ���棬��ֵ--��
*/

public class Solution01{
	public boolean find(int target,int[][] array){
		int col=0;
		int row=array.length-1;
		while (col<array[0].lenth-1 & row>0){
			if (target>array[row][col]){
				col++;
			}else if (target<array[row][col]){
				row--;
			}else{
				return true
			}
		}
		return false;
	}
}
	