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
	 * 快速排序算法
	 * 吧整个序列看做一个数组，把第零个位置看做中轴，和最后一个相比，
	 * 如果比它小，就交换；比它大不做任何处理；交换之后再和小的那端
	 * 比，比它小不交换，比它大交换；如此循环，一趟比较之后，左边是
	 * 比中轴小的，右边是比中轴大的，然后再用分治法，分别对这两个独
	 * 立的数组进行排序。
	 * @param array2
	 * @param low
	 * @param high
	 * @return
	 */
	public static int getMiddle(int[] array2, int low, int high) {  
        int tmp = array2[low];    //数组的第一个作为中轴  
        while (low < high) {  
            while (low < high && array2[high] > tmp) {  
                high--;  
            }  
            array2[low] = array2[high];   //比中轴小的记录移到低端  
            while (low < high && array2[low] < tmp) {  
                low++;  
            }  
            array2[high] = array2[low];   //比中轴大的记录移到高端  
        }  
        array2[low] = tmp;              //中轴记录到尾  
        return low;                   //返回中轴的位置  
    }  
	
	
	public static void _quickSort(int[] array2, int low, int high) {  
        if (low < high) {  
            int middle = getMiddle(array2, low, high);  //将list数组进行一分为二  
            _quickSort(array2, low, middle - 1);        //对低字表进行递归排序  
            _quickSort(array2, middle + 1, high);       //对高字表进行递归排序  
        }  
    }  
	
	
	public static void quick(int[] array2) {  
        if (array2.length > 0) {    //查看数组是否为空  
            _quickSort(array2, 0, array2.length - 1);  
        }  
    }  

	/**
	 * 对数组进行直接选择排序算法
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
	 * 得到随机数的方法
	 * @param array
	 */
	private static void getRandomArrary(int[] array) {
		for(int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*50);
		}
	}
	
}
