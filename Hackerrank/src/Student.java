
public class Student {
	String name;
    double CGPA;
    int id;
    
    public Student(String name, double CGPA, int id){
        this.name = name;
        this.CGPA =CGPA;
        this.id = id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int compareTo(Student s){
        if(CGPA == s.CGPA){
            if(name.compareTo(s.name) == 0){
                if(id == s.id)
                    return 0;
                  else if(id > s.id)
                    return 1;
                  else
                    return-1;
            }else 
              return name.compareTo(s.name);
        }
        else if(CGPA > s.CGPA)
              return 1;
          else
              return -1;
    }
}
