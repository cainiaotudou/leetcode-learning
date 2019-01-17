import java.util.ArrayList;
import java.util.List;

public class 杨辉三角_118 {
    List<List<Integer>> lists = new ArrayList<>();
    int count = 0;

    public List<List<Integer>> generate(int numRows) {
        List<Integer> list = new ArrayList();
        List<Integer> list1 = null;
        if (numRows == 0) {
            return lists;
        }
        list.add(1);
        lists.add(list);
        for (int j = 0; j < numRows; j++) {
            list = lists.get(j);
            list1 = new ArrayList<>();
            list1.add(1);
            for (int i = 0; i < list.size() - 1; i++) {
                count = list.get(i) + list.get(i + 1);
                list1.add(count);
            }
            list1.add(1);
            lists.add(list1);
        }
        return lists;
    }
}
