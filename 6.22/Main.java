import java.util.Arrays;
import java.util.Scanner;

class Sort{
    private int[] arr;

    //构造方法
    public Sort(int[] arr){
        this.arr=arr;
    }

    public void bubbleSort(){
    for  (int i=0;i<arr.length-1;i++){
        boolean flag=false;
        for (int j=0;j<arr.length-1-i;j++){
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                flag = true;
            }
        }if(!flag)break;
    }
    }

    public int[] getArr(){
        return Arrays.copyOf(arr,arr.length);
    }
}

public class Main {
    public void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("数组长度为：");
        int len =sc.nextInt();
        int[] myList=new int[len];

        for(int i=0;i<len;i++){
            System.out.println("输入第"+(i+1)+"个数");
            myList[i]=sc.nextInt();
        }
        sc.close();

        Sort test = new Sort(myList);
        test.bubbleSort();
        System.out.println(Arrays.toString(test.getArr()));
    }
}