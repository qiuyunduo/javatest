package homework.workaboutmap;

import java.util.*;

/**
 * @Author: qiuyunduo
 * @Description: null
 * @Date: Created in 下午5:55 18-6-5
 * @Modified: null
 */
public class Exercise14 {
    public static void main(String[] args) {
        int num,count = 0;
        String[] strings = {"科特迪瓦", "阿根廷", "澳大利亚",
                "塞尔维亚", "荷兰", "尼日利", "日本", "美国",
                "中国", "新西兰", "巴西", "比利时", "韩国", "喀麦隆", "洪都拉斯", "意大利"};

        Map<Integer, String> map = new HashMap();
        while (map.size() < 16) {
            num = (int) (Math.random() * 16);
            if (!map.containsKey(num))
                map.put(num, strings[count++]);
        }

        for (int i = 0; i < 4; i++) {
            System.out.print("第" + (i+1) + "组: ");
            for (int j = i*4; j < i*4+4; j++)
                System.out.print(map.get(j) + "  ");
            System.out.println();
        }
    }


}
