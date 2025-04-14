package Utils.CreateArrays;

/**
 * @Description: 创建数组的示例
 * @Author: wjh
 * @Date: 2025/4/14 上午8:51
 */
public class ArrayCreationExample {
    public static void main(String[] args) {

        // 方式 1: 声明数组变量并分配内存
        int[] numbers;
        numbers = new int[5];
        // 为数组元素赋值
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        // 输出数组元素
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // 方式 2: 声明并初始化数组
        String[] names = new String[]{"Alice", "Bob", "Charlie"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "] = " + names[i]);
        }

        // 方式 3: 简化的初始化语法
        double[] prices = {1.99, 2.99, 3.99, 4.99};
        for (int i = 0; i < prices.length; i++) {
            System.out.println("prices[" + i + "] = " + prices[i]);
        }
    }
}
