import java.util.ArrayList;
import java.util.List;

public class 杨辉三角_119 {
    int count = 0;
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList();
        if (rowIndex == 0) {
            return list;
        }
        list.add(1);
        for(int j = 0;j<rowIndex;j++){
            list = row(list);
        }
        return list;
    }
    public List<Integer> row(List<Integer> list){
        List<Integer> list1 = null;
        list1.add(1);
        for (int i = 0; i < list.size() - 1; i++) {
            count = list.get(i) + list.get(i + 1);
            list1.add(count);
        }
        list1.add(1);
        return list1;
    }
}
