package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vax {
    private String Name;
    private List<LocalDate> DoesDate = new ArrayList<>();

    public Vax(String csv){
        String[] item = csv.split(",");
        this.Name = item[0];
        for (int i = 1;i < item.length;i++){
            DoesDate.add(LocalDate.parse(item[i]));
        }

    }

    @Override
    public String toString() {
        return "Vax{" + Name +
                "DoesDate=" + DoesDate +
                '}';
    }
}
