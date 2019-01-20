public class Sum {
    public static int sum(int[] arr){
        return sum(arr , 0);
    }

    //l表示 , 以这个下标为起点 , 求后面的和
    private static int sum(int[] arr , int l){
        //当l的值等于数组的最后一个元素时 , 就没有可以加的元素了
//        if(l == arr.length - 1)
//            return arr[l];


//        if(l == arr.length)
//            return 0;
//        else
//            return arr[l] + sum(arr , l+1);


        //逻辑更加清晰的写法
        if(l == arr.length)
            return 0;
        else{
            //更小的规模
            int temp = sum(arr , l + 1);
            //由这个更小的规模 , 计算当前的解
            int reuslt = arr[l] + temp;
            return reuslt;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8 , 9 , 10};
        System.out.println(sum(nums));
    }
}

