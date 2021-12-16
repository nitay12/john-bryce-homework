package nitay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCase {
    public TestCase(String magazine, String note) {
        this.magazine  = new ArrayList<String>(Arrays.asList(magazine.split(" ")));
        this.note = new ArrayList<String>(Arrays.asList(note.split(" ")));;
    }
    public List<String> magazine;
    public List<String> note;
}
