package mainApp;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import model.*;

public class IcebergTracker {
    List<IcebergData> icebergsData = new ArrayList<>();
    public static void main(String[] args) {
        IcebergTracker icebergTracker = new IcebergTracker();
        icebergTracker.output();
    }

    public IcebergTracker() {
        Iceberg iceberg1 = new Iceberg(new Location(new int[] {36,42}, new String[] {"N", "E"}), LocalDate.of(1987, Month.JUNE, 27),1);
        icebergsData.add(new IcebergData(LocalDate.of(1988, Month.MARCH, 31), iceberg1, new Location(new int[] {38,41}, new String[] {"N", "E"}), 29.087));
    }
    
    private void output() {
        for (IcebergData i : icebergsData) {
            System.out.println(i.getIceberg().toString());
            System.out.println(i);
        }
    }
}
