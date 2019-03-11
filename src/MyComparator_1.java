import java.util.Comparator;

public class MyComparator_1 implements Comparator<Cars> {
    @Override
    public int compare(Cars o1, Cars o2) {
        int differentMark = o1.getMark().compareTo(o2.getMark());

        if (differentMark > 0) {
            return -1;
        } else {
            if (differentMark < 0) {
                return 1;
            } else {

                int differentModel = o1.getModel().compareTo(o2.getModel());
                if (differentModel > 0) {
                    return 1;
                } else {
                    if (differentModel < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }

            }
        }
    }
}