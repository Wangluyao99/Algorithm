/*��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
���磬���ַ���Ϊ��We Are Happy. 
�򾭹��滻֮����ַ���Ϊ: We%20Are%20Happy��

˼·��
��ǰ����¼�� ����Ŀ���Ӻ���ǰ�滻�� �����ص㣺�Ӻ���ǰ�滻��ʱ��ļ��� ���磺��we are lucky��
0 1 2 3 4 5 6 7 8 9 10 11
w e a r e l u c k y
���Ե�֪count=2;//�ո�ĸ����� �������滻��ʱ��7~11����ĸҪ����ƶ�count��2��λ�ã�3~5��ĸҪ����ƶ���count-1����2��λ�á����Եõ� ��
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
w e   a r e   l u c  k y
w e   a r a r e u c  k l u c k y
���滻��ʱ��ֱ���ڿո�д��%20��
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
w e   a r e   l u c  k y
w e % 2 0 a r e % 2  0 l u c k y
*/


class Solution {
public:
    void replaceSpace(char *str,int length) {
        int count=0;
        // ͳ�ƿո����
        for(int i=0;i<length;i++){
            if(str[i]==' ')
                count++;
        }
        // �滻
        for(int i=length-1;i>=0;i--){
            if(str[i]!=' '){
                str[i+2*count]=str[i];
            }
            else{
                count--;
                str[i+2*count]='%';
                str[i+2*count+1]='2';
                str[i+2*count+2]='0';
            }
        }
    }
}
