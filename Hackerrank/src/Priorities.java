import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {
	public List<Student> getStudents(List<String> events){
        int n = events.size();
        PriorityQueue<Student> pq = new PriorityQueue<>();
        for(String i: events){
            String s[] = new String[4];
            s = i.split("//s");
            if(s.length>1)
            {
                pq.add(new Student(s[1],Double.valueOf(s[2]),Integer.valueOf(s[3])));
            }
            else
            {
                pq.poll();
            }
        }
        while(pq.size()>1)
        {
            System.out.println(pq.poll().name);
        }
        List<Student> students = new ArrayList<Student>();
        while (!pq.isEmpty()) {
    students.add(pq.poll());
}
        return students;
        }
    }

