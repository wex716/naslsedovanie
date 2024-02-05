
import java.util.ArrayList;
public class WorkersManger {
    private ArrayList<Worker> workers = new ArrayList<>();

    public void p1() {
        for (int i = 0; i < workers.size(); i++) {
            workers.get(i).p1();
        }
    }
}