package com.bjsxt.doitmyself.test;

public class FastSortAndSelectSort {
	public static void main(String[] args){
		int[] array=new int[10];
		getRandomArrary(array);
		slectSort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}
		System.out.println("*****************");
		int[] array2=new int[10];
		getRandomArrary(array2);
		quick(array2);
		for(int i=0;i<array2.length;i++){
			System.out.print(array2[i]+"\t");
		}
	}

	
	/**
	 * ���������㷨
	 * ���������п���һ�����飬�ѵ����λ�ÿ������ᣬ�����һ����ȣ�
	 * �������С���ͽ��������������κδ�������֮���ٺ�С���Ƕ�
	 * �ȣ�����С�������������󽻻������ѭ����һ�˱Ƚ�֮�������
	 * ������С�ģ��ұ��Ǳ������ģ�Ȼ�����÷��η����ֱ����������
	 * ���������������
	 * @param array2
	 * @param low
	 * @param high
	 * @return
	 */
	public static int getMiddle(int[] array2, int low, int high) {  
        int tmp = array2[low];    //����ĵ�һ����Ϊ����  
        while (low < high) {  
            while (low < high && array2[high] > tmp) {  
                high--;  
            }  
            array2[low] = array2[high];   //������С�ļ�¼�Ƶ��Ͷ�  
            while (low < high && array2[low] < tmp) {  
                low++;  
            }  
            array2[high] = array2[low];   //�������ļ�¼�Ƶ��߶�  
        }  
        array2[low] = tmp;              //�����¼��β  
        return low;                   //���������λ��  
    }  
	
	
	public static void _quickSort(int[] array2, int low, int high) {  
        if (low < high) {  
            int middle = getMiddle(array2, low, high);  //��list�������һ��Ϊ��  
            _quickSort(array2, low, middle - 1);        //�Ե��ֱ���еݹ�����  
            _quickSort(array2, middle + 1, high);       //�Ը��ֱ���еݹ�����  
        }  
    }  
	
	
	public static void quick(int[] array2) {  
        if (array2.length > 0) {    //�鿴�����Ƿ�Ϊ��  
            _quickSort(array2, 0, array2.length - 1);  
        }  
    }  

	/**
	 * ���������ֱ��ѡ�������㷨
	 * @param array
	 */
	private static void slectSort(int[] array) {
		for(int i=1;i<array.length;i++){
			int index=0;
			for(int j=1;j<=array.length-i;j++){
				if(array[j]>array[index]){
					index=j;
				}
			}
			int temp=array[array.length-i];
			array[array.length-i]=array[index];
			array[index]=temp;
		}
	}
	/**
	 * �õ�������ķ���
	 * @param array
	 */
	private static void getRandomArrary(int[] array) {
		for(int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*50);
		}
	}
	
}
